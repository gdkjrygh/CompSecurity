// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.app.Activity;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.search.TabbedSearchFragment;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.discovery:
//            SuggestionsHelperFactory, SuggestionsHelper

class SearchPresenter extends DefaultActivityLightCycle
{
    private class SearchActionListener
        implements android.widget.TextView.OnEditorActionListener
    {

        final SearchPresenter this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 0 || i == 3)
            {
                performSearch();
                return true;
            } else
            {
                return false;
            }
        }

        private SearchActionListener()
        {
            this$0 = SearchPresenter.this;
            super();
        }

        SearchActionListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private class SearchCloseClickListener
        implements android.view.View.OnClickListener
    {

        final SearchPresenter this$0;

        public void onClick(View view)
        {
            searchTextView.setText("");
            clearSuggestions();
            hideCloseButton();
            activateSearchView();
            displaySearchView(0);
            trackScreenEvent();
        }

        private SearchCloseClickListener()
        {
            this$0 = SearchPresenter.this;
            super();
        }

        SearchCloseClickListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private class SearchResultClickListener
        implements android.widget.AdapterView.OnItemClickListener
    {

        final SearchPresenter this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (adapter.isSearchItem(i))
            {
                performSearch();
                return;
            } else
            {
                deactivateSearchView();
                suggestionsHelper.launchSuggestion(view.getContext(), i);
                return;
            }
        }

        private SearchResultClickListener()
        {
            this$0 = SearchPresenter.this;
            super();
        }

        SearchResultClickListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private class SearchViewClickListener
        implements android.view.View.OnClickListener
    {

        final SearchPresenter this$0;

        public void onClick(View view)
        {
            displaySearchView(0);
            activateSearchView();
        }

        private SearchViewClickListener()
        {
            this$0 = SearchPresenter.this;
            super();
        }

        SearchViewClickListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private class SearchWatcher
        implements TextWatcher
    {

        final SearchPresenter this$0;

        public void afterTextChanged(Editable editable)
        {
            if (Strings.isBlank(searchTextView.getText().toString().trim()))
            {
                clearSuggestions();
                hideCloseButton();
                hideSearchViewResults();
                return;
            } else
            {
                showCloseButton();
                showSearchViewResults();
                return;
            }
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            charsequence = charsequence.toString().trim();
            if (Strings.isNotBlank(charsequence))
            {
                showSuggestionsFor(charsequence);
            }
        }

        private SearchWatcher()
        {
            this$0 = SearchPresenter.this;
            super();
        }

        SearchWatcher(_cls1 _pcls1)
        {
            this();
        }
    }

    private class SuggestionsScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        final SearchPresenter this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 1)
            {
                hideKeyboard();
            }
        }

        private SuggestionsScrollListener()
        {
            this$0 = SearchPresenter.this;
            super();
        }

        SuggestionsScrollListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private class SuggestionsVisibilityController extends DataSetObserver
    {

        final SearchPresenter this$0;

        public void onChanged()
        {
            super.onChanged();
            if (!adapter.isEmpty())
            {
                showSearchListView();
                return;
            } else
            {
                hideSearchListView();
                return;
            }
        }

        private SuggestionsVisibilityController()
        {
            this$0 = SearchPresenter.this;
            super();
        }

        SuggestionsVisibilityController(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int RESULTS_VIEW_INDEX = 1;
    private static final int SUGGESTIONS_VIEW_INDEX = 0;
    private final SuggestionsAdapter adapter;
    private final EventBus eventBus;
    private FragmentManager fragmentManager;
    private InputMethodManager inputMethodManager;
    private final Resources resources;
    private ImageView searchCloseView;
    private ListView searchListView;
    private EditText searchTextView;
    private ViewFlipper searchViewFlipper;
    private final SuggestionsHelper suggestionsHelper;
    private View toolbarElevation;
    private Window window;

    SearchPresenter(EventBus eventbus, Resources resources1, SuggestionsAdapter suggestionsadapter, SuggestionsHelperFactory suggestionshelperfactory)
    {
        eventBus = eventbus;
        resources = resources1;
        adapter = suggestionsadapter;
        suggestionsHelper = suggestionshelperfactory.create(suggestionsadapter);
        adapter.registerDataSetObserver(new SuggestionsVisibilityController(null));
    }

    private void activateSearchView()
    {
        searchTextView.setFocusable(true);
        searchTextView.setFocusableInTouchMode(true);
        searchTextView.requestFocus();
        showKeyboard();
    }

    private void clearSuggestions()
    {
        adapter.clearSuggestions();
    }

    private void deactivateSearchView()
    {
        searchTextView.setFocusable(false);
        searchTextView.setFocusableInTouchMode(false);
        searchTextView.clearFocus();
        hideKeyboard();
    }

    private void displaySearchView(int i)
    {
        setElevation(i);
        if (searchViewFlipper.getDisplayedChild() != i)
        {
            searchViewFlipper.setDisplayedChild(i);
        }
    }

    private void hideCloseButton()
    {
        searchCloseView.setVisibility(4);
    }

    private void hideKeyboard()
    {
        window.setSoftInputMode(3);
        inputMethodManager.hideSoftInputFromWindow(searchTextView.getWindowToken(), 0);
    }

    private void hideSearchListView()
    {
        searchListView.animate().alpha(0.0F).start();
        searchListView.setVisibility(4);
    }

    private void hideSearchViewResults()
    {
        searchViewFlipper.animate().alpha(0.0F).start();
        searchViewFlipper.setVisibility(4);
    }

    private void performSearch()
    {
        deactivateSearchView();
        showResultsFor(searchTextView.getText().toString());
    }

    private void setElevation(int i)
    {
        if (i == 1)
        {
            ViewCompat.setElevation(searchViewFlipper, (int)resources.getDimension(0x7f0b0106));
            toolbarElevation.setVisibility(4);
            return;
        } else
        {
            ViewCompat.setElevation(searchViewFlipper, 0.0F);
            toolbarElevation.setVisibility(0);
            return;
        }
    }

    private void setSearchListeners()
    {
        searchTextView.addTextChangedListener(new SearchWatcher(null));
        searchTextView.setOnClickListener(new SearchViewClickListener(null));
        searchTextView.setOnEditorActionListener(new SearchActionListener(null));
        searchListView.setOnItemClickListener(new SearchResultClickListener(null));
        searchListView.setOnScrollListener(new SuggestionsScrollListener(null));
        searchCloseView.setOnClickListener(new SearchCloseClickListener(null));
    }

    private void setupListView(Activity activity)
    {
        searchListView = (ListView)activity.findViewById(0x102000a);
        searchListView.setAdapter(adapter);
    }

    private void setupToolbar(AppCompatActivity appcompatactivity)
    {
        Toolbar toolbar = (Toolbar)appcompatactivity.findViewById(0x7f0f0022);
        ViewGroup viewgroup = (ViewGroup)((LayoutInflater)appcompatactivity.getSystemService("layout_inflater")).inflate(0x7f0300ac, toolbar, false);
        ActionBar actionbar = appcompatactivity.getSupportActionBar();
        toolbarElevation = appcompatactivity.findViewById(0x7f0f0016);
        searchTextView = (EditText)viewgroup.findViewById(0x7f0f022c);
        searchCloseView = (ImageView)viewgroup.findViewById(0x7f0f022e);
        if (actionbar != null)
        {
            actionbar.setDisplayShowTitleEnabled(false);
        }
        toolbar.addView(viewgroup);
    }

    private void setupViewFlipper(Activity activity)
    {
        searchViewFlipper = (ViewFlipper)activity.findViewById(0x7f0f0227);
        searchViewFlipper.setInAnimation(AnimationUtils.loadAnimation(activity, 0x7f04000c));
        searchViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(activity, 0x7f04000d));
    }

    private void setupViews(AppCompatActivity appcompatactivity)
    {
        setupToolbar(appcompatactivity);
        setupListView(appcompatactivity);
        setupViewFlipper(appcompatactivity);
        setSearchListeners();
        activateSearchView();
    }

    private void showCloseButton()
    {
        searchCloseView.setVisibility(0);
    }

    private void showKeyboard()
    {
        window.setSoftInputMode(52);
        inputMethodManager.showSoftInput(searchTextView, 1);
    }

    private void showResultsFor(String s)
    {
        s = TabbedSearchFragment.newInstance(s);
        fragmentManager.beginTransaction().replace(0x7f0f0228, s).commit();
        displaySearchView(1);
    }

    private void showSearchListView()
    {
        searchListView.animate().alpha(1.0F).start();
        searchListView.setVisibility(0);
    }

    private void showSearchViewResults()
    {
        searchViewFlipper.animate().alpha(1.0F).start();
        searchViewFlipper.setVisibility(0);
    }

    private void showSuggestionsFor(String s)
    {
        adapter.showSuggestionsFor(s);
    }

    private void trackScreenEvent()
    {
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_MAIN));
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        window = appcompatactivity.getWindow();
        fragmentManager = appcompatactivity.getSupportFragmentManager();
        inputMethodManager = (InputMethodManager)appcompatactivity.getSystemService("input_method");
        setupViews(appcompatactivity);
        trackScreenEvent();
    }

    public volatile void onDestroy(Activity activity)
    {
        onDestroy((AppCompatActivity)activity);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
        inputMethodManager = null;
    }

















}
