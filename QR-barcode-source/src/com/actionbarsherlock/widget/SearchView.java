// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.view.CollapsibleActionView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package com.actionbarsherlock.widget:
//            SuggestionsAdapter

public class SearchView extends LinearLayout
    implements CollapsibleActionView
{
    public static interface OnCloseListener
    {

        public abstract boolean onClose();
    }

    public static interface OnQueryTextListener
    {

        public abstract boolean onQueryTextChange(String s);

        public abstract boolean onQueryTextSubmit(String s);
    }

    public static interface OnSuggestionListener
    {

        public abstract boolean onSuggestionClick(int i);

        public abstract boolean onSuggestionSelect(int i);
    }

    public static class SearchAutoComplete extends AutoCompleteTextView
    {

        private SearchView mSearchView;
        private int mThreshold;

        private boolean isEmpty()
        {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public boolean enoughToFilter()
        {
            return mThreshold <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i, Rect rect)
        {
            super.onFocusChanged(flag, i, rect);
            mSearchView.onTextFocusChanged();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyevent)
        {
            if (i == 4)
            {
                if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
                    if (dispatcherstate != null)
                    {
                        dispatcherstate.startTracking(keyevent, this);
                    }
                    return true;
                }
                if (keyevent.getAction() == 1)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
                    if (dispatcherstate1 != null)
                    {
                        dispatcherstate1.handleUpEvent(keyevent);
                    }
                    if (keyevent.isTracking() && !keyevent.isCanceled())
                    {
                        mSearchView.clearFocus();
                        mSearchView.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            super.onWindowFocusChanged(flag);
            if (flag && mSearchView.hasFocus() && getVisibility() == 0)
            {
                ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.isLandscapeMode(getContext()))
                {
                    SearchView.ensureImeVisible(this, true);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        void setSearchView(SearchView searchview)
        {
            mSearchView = searchview;
        }

        public void setThreshold(int i)
        {
            super.setThreshold(i);
            mThreshold = i;
        }


        public SearchAutoComplete(Context context)
        {
            super(context);
            mThreshold = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mThreshold = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
        {
            super(context, attributeset, i);
            mThreshold = getThreshold();
        }
    }


    private static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    private static final String LOG_TAG = "SearchView";
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private ImageView mCloseButton;
    private int mCollapsedImeOptions;
    private View mDropDownAnchor;
    private boolean mExpandedInActionView;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private SearchAutoComplete mQueryTextView;
    private Runnable mReleaseCursorRunnable = new Runnable() {

        final SearchView this$0;

        public void run()
        {
            if (mSuggestionsAdapter != null && (mSuggestionsAdapter instanceof SuggestionsAdapter))
            {
                mSuggestionsAdapter.changeCursor(null);
            }
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private View mSearchButton;
    private View mSearchEditFrame;
    private ImageView mSearchHintIcon;
    private View mSearchPlate;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable = new Runnable() {

        final SearchView this$0;

        public void run()
        {
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                SearchView.showSoftInputUnchecked(SearchView.this, inputmethodmanager, 0);
            }
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private View mSubmitArea;
    private View mSubmitButton;
    private boolean mSubmitButtonEnabled;
    private CursorAdapter mSuggestionsAdapter;
    android.view.View.OnKeyListener mTextKeyListener = new android.view.View.OnKeyListener() {

        final SearchView this$0;

        public boolean onKey(View view, int j, KeyEvent keyevent)
        {
            if (mSearchable != null)
            {
                if (mQueryTextView.isPopupShowing() && mQueryTextView.getListSelection() != -1)
                {
                    return onSuggestionsKey(view, j, keyevent);
                }
                if (!mQueryTextView.isEmpty() && KeyEventCompat.hasNoModifiers(keyevent))
                {
                    if (keyevent.getAction() == 1 && j == 66)
                    {
                        view.cancelLongPress();
                        launchQuerySearch(0, null, mQueryTextView.getText().toString());
                        return true;
                    } else
                    {
                        keyevent.getAction();
                        return false;
                    }
                }
            }
            return false;
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private TextWatcher mTextWatcher = new TextWatcher() {

        final SearchView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence1, int j, int k, int l)
        {
        }

        public void onTextChanged(CharSequence charsequence1, int j, int k, int l)
        {
            SearchView.this.onTextChanged(charsequence1);
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private Runnable mUpdateDrawableStateRunnable = new Runnable() {

        final SearchView this$0;

        public void run()
        {
            updateFocusedState();
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private View mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public SearchView(Context context)
    {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mOutsideDrawablesCache = new WeakHashMap();
        mOnClickListener = new android.view.View.OnClickListener() {

            final SearchView this$0;

            public void onClick(View view)
            {
                if (view == mSearchButton)
                {
                    onSearchClicked();
                } else
                {
                    if (view == mCloseButton)
                    {
                        onCloseClicked();
                        return;
                    }
                    if (view == mSubmitButton)
                    {
                        onSubmitQuery();
                        return;
                    }
                    if (view == mVoiceButton)
                    {
                        onVoiceClicked();
                        return;
                    }
                    if (view == mQueryTextView)
                    {
                        forceSuggestionQuery();
                        return;
                    }
                }
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnEditorActionListener = new android.widget.TextView.OnEditorActionListener() {

            final SearchView this$0;

            public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                onSubmitQuery();
                return true;
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnItemClickListener = new android.widget.AdapterView.OnItemClickListener() {

            final SearchView this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                onItemClicked(j, 0, null);
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() {

            final SearchView this$0;

            public void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                SearchView.this.onItemSelected(j);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            throw new IllegalStateException("SearchView is API 8+ only.");
        }
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.actionbarsherlock.R.layout.abs__search_view, this, true);
        mSearchButton = findViewById(com.actionbarsherlock.R.id.abs__search_button);
        mQueryTextView = (SearchAutoComplete)findViewById(com.actionbarsherlock.R.id.abs__search_src_text);
        mQueryTextView.setSearchView(this);
        mSearchEditFrame = findViewById(com.actionbarsherlock.R.id.abs__search_edit_frame);
        mSearchPlate = findViewById(com.actionbarsherlock.R.id.abs__search_plate);
        mSubmitArea = findViewById(com.actionbarsherlock.R.id.abs__submit_area);
        mSubmitButton = findViewById(com.actionbarsherlock.R.id.abs__search_go_btn);
        mCloseButton = (ImageView)findViewById(com.actionbarsherlock.R.id.abs__search_close_btn);
        mVoiceButton = findViewById(com.actionbarsherlock.R.id.abs__search_voice_btn);
        mSearchHintIcon = (ImageView)findViewById(com.actionbarsherlock.R.id.abs__search_mag_icon);
        mSearchButton.setOnClickListener(mOnClickListener);
        mCloseButton.setOnClickListener(mOnClickListener);
        mSubmitButton.setOnClickListener(mOnClickListener);
        mVoiceButton.setOnClickListener(mOnClickListener);
        mQueryTextView.setOnClickListener(mOnClickListener);
        mQueryTextView.addTextChangedListener(mTextWatcher);
        mQueryTextView.setOnEditorActionListener(mOnEditorActionListener);
        mQueryTextView.setOnItemClickListener(mOnItemClickListener);
        mQueryTextView.setOnItemSelectedListener(mOnItemSelectedListener);
        mQueryTextView.setOnKeyListener(mTextKeyListener);
        mQueryTextView.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SearchView this$0;

            public void onFocusChange(View view, boolean flag1)
            {
                if (mOnQueryTextFocusChangeListener != null)
                {
                    mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, flag1);
                }
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        });
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockSearchView, 0, 0);
        setIconifiedByDefault(typedarray.getBoolean(com.actionbarsherlock.R.styleable.SherlockSearchView_iconifiedByDefault, true));
        int i = typedarray.getDimensionPixelSize(com.actionbarsherlock.R.styleable.SherlockSearchView_android_maxWidth, -1);
        if (i != -1)
        {
            setMaxWidth(i);
        }
        CharSequence charsequence = typedarray.getText(com.actionbarsherlock.R.styleable.SherlockSearchView_queryHint);
        if (!TextUtils.isEmpty(charsequence))
        {
            setQueryHint(charsequence);
        }
        i = typedarray.getInt(com.actionbarsherlock.R.styleable.SherlockSearchView_android_imeOptions, -1);
        if (i != -1)
        {
            setImeOptions(i);
        }
        i = typedarray.getInt(com.actionbarsherlock.R.styleable.SherlockSearchView_android_inputType, -1);
        if (i != -1)
        {
            setInputType(i);
        }
        typedarray.recycle();
        context = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockView, 0, 0);
        boolean flag = context.getBoolean(com.actionbarsherlock.R.styleable.SherlockView_android_focusable, true);
        context.recycle();
        setFocusable(flag);
        mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
        mVoiceWebSearchIntent.addFlags(0x10000000);
        mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        mVoiceAppSearchIntent.addFlags(0x10000000);
        mDropDownAnchor = findViewById(mQueryTextView.getDropDownAnchor());
        if (mDropDownAnchor != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                mDropDownAnchor.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

                    final SearchView this$0;

                    public void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
                            int l1, int i2)
                    {
                        adjustDropDownSizeAndPosition();
                    }

            
            {
                this$0 = SearchView.this;
                super();
            }
                });
            } else
            {
                mDropDownAnchor.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    final SearchView this$0;

                    public void onGlobalLayout()
                    {
                        adjustDropDownSizeAndPosition();
                    }

            
            {
                this$0 = SearchView.this;
                super();
            }
                });
            }
        }
        updateViewsVisibility(mIconifiedByDefault);
        updateQueryHint();
    }

    private void adjustDropDownSizeAndPosition()
    {
        if (mDropDownAnchor.getWidth() > 1)
        {
            Resources resources = getContext().getResources();
            int j = mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            int i;
            if (mIconifiedByDefault)
            {
                i = resources.getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__dropdownitem_icon_width) + resources.getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__dropdownitem_text_padding_left);
            } else
            {
                i = 0;
            }
            mQueryTextView.getDropDownBackground().getPadding(rect);
            mQueryTextView.setDropDownHorizontalOffset(-(rect.left + i) + j);
            mQueryTextView.setDropDownWidth((mDropDownAnchor.getWidth() + rect.left + rect.right + i) - j);
        }
    }

    private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
    {
        s = new Intent(s);
        s.addFlags(0x10000000);
        if (uri != null)
        {
            s.setData(uri);
        }
        s.putExtra("user_query", mUserQuery);
        if (s2 != null)
        {
            s.putExtra("query", s2);
        }
        if (s1 != null)
        {
            s.putExtra("intent_extra_data_key", s1);
        }
        if (mAppSearchData != null)
        {
            s.putExtra("app_data", mAppSearchData);
        }
        if (i != 0)
        {
            s.putExtra("action_key", i);
            s.putExtra("action_msg", s3);
        }
        s.setComponent(mSearchable.getSearchActivity());
        return s;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        try
        {
            obj1 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_action");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                i = cursor.getPosition();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                i = -1;
            }
            Log.w("SearchView", (new StringBuilder("Search suggestions cursor at row ")).append(i).append(" returned exception.").toString(), s);
            return null;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = mSearchable.getSuggestIntentAction();
          goto _L2
_L7:
        obj2 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data");
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = mSearchable.getSuggestIntentData();
        obj2 = obj;
        if (obj == null) goto _L4; else goto _L3
_L3:
        s1 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data_id");
        obj2 = obj;
        if (s1 == null) goto _L4; else goto _L5
_L5:
        obj2 = (new StringBuilder(String.valueOf(obj))).append("/").append(Uri.encode(s1)).toString();
          goto _L4
_L6:
        obj2 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_query");
        return createIntent(((String) (obj1)), ((Uri) (obj)), SuggestionsAdapter.getColumnString(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i, s);
_L9:
        obj = Uri.parse(((String) (obj2)));
          goto _L6
_L2:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "android.intent.action.SEARCH";
        }
          goto _L7
_L4:
        if (obj2 != null) goto _L9; else goto _L8
_L8:
        obj = null;
          goto _L6
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
        ComponentName componentname = searchableinfo.getSearchActivity();
        Object obj = new Intent("android.intent.action.SEARCH");
        ((Intent) (obj)).setComponent(componentname);
        PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
        Bundle bundle = new Bundle();
        Intent intent1 = new Intent(intent);
        intent = "free_form";
        obj = null;
        String s = null;
        int i = 1;
        Resources resources = getResources();
        if (searchableinfo.getVoiceLanguageModeId() != 0)
        {
            intent = resources.getString(searchableinfo.getVoiceLanguageModeId());
        }
        if (searchableinfo.getVoicePromptTextId() != 0)
        {
            obj = resources.getString(searchableinfo.getVoicePromptTextId());
        }
        if (searchableinfo.getVoiceLanguageId() != 0)
        {
            s = resources.getString(searchableinfo.getVoiceLanguageId());
        }
        if (searchableinfo.getVoiceMaxResults() != 0)
        {
            i = searchableinfo.getVoiceMaxResults();
        }
        intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", intent);
        intent1.putExtra("android.speech.extra.PROMPT", ((String) (obj)));
        intent1.putExtra("android.speech.extra.LANGUAGE", s);
        intent1.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (componentname == null)
        {
            intent = null;
        } else
        {
            intent = componentname.flattenToShortString();
        }
        intent1.putExtra("calling_package", intent);
        intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingintent);
        intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent1;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
        Intent intent1 = new Intent(intent);
        intent = searchableinfo.getSearchActivity();
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.flattenToShortString();
        }
        intent1.putExtra("calling_package", intent);
        return intent1;
    }

    private void dismissSuggestions()
    {
        mQueryTextView.dismissDropDown();
    }

    private static void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
    {
        try
        {
            Method method = android/widget/AutoCompleteTextView.getMethod("ensureImeVisible", new Class[] {
                Boolean.TYPE
            });
            method.setAccessible(true);
            method.invoke(autocompletetextview, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AutoCompleteTextView autocompletetextview)
        {
            return;
        }
    }

    private void forceSuggestionQuery()
    {
        try
        {
            Method method = android/widget/AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            Method method1 = android/widget/AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            method.setAccessible(true);
            method1.setAccessible(true);
            method.invoke(mQueryTextView, new Object[0]);
            method1.invoke(mQueryTextView, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private CharSequence getDecoratedHint(CharSequence charsequence)
    {
        if (!mIconifiedByDefault)
        {
            return charsequence;
        } else
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.append(charsequence);
            charsequence = getContext().getResources().getDrawable(getSearchIconId());
            int i = (int)((double)mQueryTextView.getTextSize() * 1.25D);
            charsequence.setBounds(0, 0, i, i);
            spannablestringbuilder.setSpan(new ImageSpan(charsequence), 1, 2, 33);
            return spannablestringbuilder;
        }
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__search_view_preferred_width);
    }

    private int getSearchIconId()
    {
        TypedValue typedvalue = new TypedValue();
        getContext().getTheme().resolveAttribute(com.actionbarsherlock.R.attr.searchViewSearchIcon, typedvalue, true);
        return typedvalue.resourceId;
    }

    private boolean hasVoiceSearch()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (mSearchable == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!mSearchable.getVoiceSearchEnabled()) goto _L2; else goto _L3
_L3:
        Intent intent = null;
        if (!mSearchable.getVoiceSearchLaunchWebSearch()) goto _L5; else goto _L4
_L4:
        intent = mVoiceWebSearchIntent;
_L7:
        flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
            {
                flag = true;
            }
        }
_L2:
        return flag;
_L5:
        if (mSearchable.getVoiceSearchLaunchRecognizer())
        {
            intent = mVoiceAppSearchIntent;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean isLandscapeMode(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean isSubmitAreaEnabled()
    {
        return (mSubmitButtonEnabled || mVoiceButtonEnabled) && !isIconified();
    }

    private void launchIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        try
        {
            getContext().startActivity(intent);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("SearchView", (new StringBuilder("Failed launch activity: ")).append(intent).toString(), runtimeexception);
        }
    }

    private void launchQuerySearch(int i, String s, String s1)
    {
        s = createIntent("android.intent.action.SEARCH", null, null, s1, i, s);
        getContext().startActivity(s);
    }

    private boolean launchSuggestion(int i, int j, String s)
    {
        Cursor cursor = mSuggestionsAdapter.getCursor();
        if (cursor != null && cursor.moveToPosition(i))
        {
            launchIntent(createIntentFromSuggestion(cursor, j, s));
            return true;
        } else
        {
            return false;
        }
    }

    private void onCloseClicked()
    {
        if (TextUtils.isEmpty(mQueryTextView.getText()))
        {
            if (mIconifiedByDefault && (mOnCloseListener == null || !mOnCloseListener.onClose()))
            {
                clearFocus();
                updateViewsVisibility(true);
            }
            return;
        } else
        {
            mQueryTextView.setText("");
            mQueryTextView.requestFocus();
            setImeVisibility(true);
            return;
        }
    }

    private boolean onItemClicked(int i, int j, String s)
    {
        boolean flag = false;
        if (mOnSuggestionListener == null || !mOnSuggestionListener.onSuggestionClick(i))
        {
            launchSuggestion(i, 0, null);
            setImeVisibility(false);
            dismissSuggestions();
            flag = true;
        }
        return flag;
    }

    private boolean onItemSelected(int i)
    {
        if (mOnSuggestionListener == null || !mOnSuggestionListener.onSuggestionSelect(i))
        {
            rewriteQueryFromSuggestion(i);
            return true;
        } else
        {
            return false;
        }
    }

    private void onSearchClicked()
    {
        updateViewsVisibility(false);
        mQueryTextView.requestFocus();
        setImeVisibility(true);
        if (mOnSearchClickListener != null)
        {
            mOnSearchClickListener.onClick(this);
        }
    }

    private void onSubmitQuery()
    {
        Editable editable = mQueryTextView.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (mOnQueryChangeListener == null || !mOnQueryChangeListener.onQueryTextSubmit(editable.toString())))
        {
            if (mSearchable != null)
            {
                launchQuerySearch(0, null, editable.toString());
                setImeVisibility(false);
            }
            dismissSuggestions();
        }
    }

    private boolean onSuggestionsKey(View view, int i, KeyEvent keyevent)
    {
        if (mSearchable != null && mSuggestionsAdapter != null && keyevent.getAction() == 0 && KeyEventCompat.hasNoModifiers(keyevent))
        {
            if (i == 66 || i == 84 || i == 61)
            {
                return onItemClicked(mQueryTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22)
            {
                if (i == 21)
                {
                    i = 0;
                } else
                {
                    i = mQueryTextView.length();
                }
                mQueryTextView.setSelection(i);
                mQueryTextView.setListSelection(0);
                mQueryTextView.clearListSelection();
                ensureImeVisible(mQueryTextView, true);
                return true;
            }
            if (i == 19 && mQueryTextView.getListSelection() == 0)
            {
                return false;
            }
        }
        return false;
    }

    private void onTextChanged(CharSequence charsequence)
    {
        boolean flag1 = false;
        Editable editable = mQueryTextView.getText();
        mUserQuery = editable;
        boolean flag;
        if (TextUtils.isEmpty(editable))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        updateSubmitButton(flag);
        if (flag)
        {
            flag = flag1;
        } else
        {
            flag = true;
        }
        updateVoiceButton(flag);
        updateCloseButton();
        updateSubmitArea();
        if (mOnQueryChangeListener != null && !TextUtils.equals(charsequence, mOldQueryText))
        {
            mOnQueryChangeListener.onQueryTextChange(charsequence.toString());
        }
        mOldQueryText = charsequence.toString();
    }

    private void onVoiceClicked()
    {
        if (mSearchable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = mSearchable;
        try
        {
            if (((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch())
            {
                obj = createVoiceWebSearchIntent(mVoiceWebSearchIntent, ((SearchableInfo) (obj)));
                getContext().startActivity(((Intent) (obj)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("SearchView", "Could not find voice search activity");
            return;
        }
        if (!((SearchableInfo) (obj)).getVoiceSearchLaunchRecognizer()) goto _L1; else goto _L3
_L3:
        obj = createVoiceAppSearchIntent(mVoiceAppSearchIntent, ((SearchableInfo) (obj)));
        getContext().startActivity(((Intent) (obj)));
        return;
    }

    private void postUpdateFocusedState()
    {
        post(mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i)
    {
        Editable editable = mQueryTextView.getText();
        Object obj = mSuggestionsAdapter.getCursor();
        if (obj == null)
        {
            return;
        }
        if (((Cursor) (obj)).moveToPosition(i))
        {
            obj = mSuggestionsAdapter.convertToString(((Cursor) (obj)));
            if (obj != null)
            {
                setQuery(((CharSequence) (obj)));
                return;
            } else
            {
                setQuery(editable);
                return;
            }
        } else
        {
            setQuery(editable);
            return;
        }
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            post(mShowImeRunnable);
        } else
        {
            removeCallbacks(mShowImeRunnable);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private void setQuery(CharSequence charsequence)
    {
        setText(mQueryTextView, charsequence, true);
        SearchAutoComplete searchautocomplete = mQueryTextView;
        int i;
        if (TextUtils.isEmpty(charsequence))
        {
            i = 0;
        } else
        {
            i = charsequence.length();
        }
        searchautocomplete.setSelection(i);
    }

    private static void setText(AutoCompleteTextView autocompletetextview, CharSequence charsequence, boolean flag)
    {
        try
        {
            Method method = android/widget/AutoCompleteTextView.getMethod("setText", new Class[] {
                java/lang/CharSequence, Boolean.TYPE
            });
            method.setAccessible(true);
            method.invoke(autocompletetextview, new Object[] {
                charsequence, Boolean.valueOf(flag)
            });
            return;
        }
        catch (Exception exception)
        {
            autocompletetextview.setText(charsequence);
        }
    }

    private static void showSoftInputUnchecked(View view, InputMethodManager inputmethodmanager, int i)
    {
        try
        {
            Method method = inputmethodmanager.getClass().getMethod("showSoftInputUnchecked", new Class[] {
                Integer.TYPE, android/os/ResultReceiver
            });
            method.setAccessible(true);
            method.invoke(inputmethodmanager, new Object[] {
                Integer.valueOf(i), null
            });
            return;
        }
        catch (Exception exception)
        {
            inputmethodmanager.showSoftInput(view, i);
        }
    }

    private void updateCloseButton()
    {
        int ai[];
        int i;
label0:
        {
            boolean flag3 = true;
            boolean flag2 = false;
            ImageView imageview;
            Drawable drawable;
            boolean flag;
            boolean flag1;
            if (TextUtils.isEmpty(mQueryTextView.getText()))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            flag1 = flag3;
            if (flag)
            {
                break label0;
            }
            if (mIconifiedByDefault)
            {
                flag1 = flag3;
                if (!mExpandedInActionView)
                {
                    break label0;
                }
            }
            flag1 = false;
        }
        imageview = mCloseButton;
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        drawable = mCloseButton.getDrawable();
        if (flag)
        {
            ai = ENABLED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
    }

    private void updateFocusedState()
    {
        boolean flag = mQueryTextView.hasFocus();
        Drawable drawable = mSearchPlate.getBackground();
        int ai[];
        if (flag)
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
        drawable = mSubmitArea.getBackground();
        if (flag)
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
        invalidate();
    }

    private void updateQueryHint()
    {
        if (mQueryHint != null)
        {
            mQueryTextView.setHint(getDecoratedHint(mQueryHint));
        } else
        if (mSearchable != null)
        {
            String s = null;
            int i = mSearchable.getHintId();
            if (i != 0)
            {
                s = getContext().getString(i);
            }
            if (s != null)
            {
                mQueryTextView.setHint(getDecoratedHint(s));
                return;
            }
        } else
        {
            mQueryTextView.setHint(getDecoratedHint(""));
            return;
        }
    }

    private void updateSearchAutoComplete()
    {
        boolean flag = true;
        mQueryTextView.setThreshold(mSearchable.getSuggestThreshold());
        mQueryTextView.setImeOptions(mSearchable.getImeOptions());
        int j = mSearchable.getInputType();
        int i = j;
        if ((j & 0xf) == 1)
        {
            j &= 0xfffeffff;
            i = j;
            if (mSearchable.getSuggestAuthority() != null)
            {
                i = j | 0x10000 | 0x80000;
            }
        }
        mQueryTextView.setInputType(i);
        if (mSuggestionsAdapter != null)
        {
            mSuggestionsAdapter.changeCursor(null);
        }
        if (mSearchable.getSuggestAuthority() != null)
        {
            mSuggestionsAdapter = new SuggestionsAdapter(getContext(), this, mSearchable, mOutsideDrawablesCache);
            mQueryTextView.setAdapter(mSuggestionsAdapter);
            SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
            byte byte0 = flag;
            if (mQueryRefinement)
            {
                byte0 = 2;
            }
            suggestionsadapter.setQueryRefinement(byte0);
        }
    }

    private void updateSubmitArea()
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!isSubmitAreaEnabled())
            {
                break label0;
            }
            if (mSubmitButton.getVisibility() != 0)
            {
                byte0 = byte1;
                if (mVoiceButton.getVisibility() != 0)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        mSubmitArea.setVisibility(byte0);
    }

    private void updateSubmitButton(boolean flag)
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!mSubmitButtonEnabled)
            {
                break label0;
            }
            byte0 = byte1;
            if (!isSubmitAreaEnabled())
            {
                break label0;
            }
            byte0 = byte1;
            if (!hasFocus())
            {
                break label0;
            }
            if (!flag)
            {
                byte0 = byte1;
                if (mVoiceButtonEnabled)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        mSubmitButton.setVisibility(byte0);
    }

    private void updateViewsVisibility(boolean flag)
    {
        byte byte0 = 8;
        boolean flag2 = false;
        mIconified = flag;
        Object obj;
        int i;
        boolean flag1;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        if (TextUtils.isEmpty(mQueryTextView.getText()))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        mSearchButton.setVisibility(i);
        updateSubmitButton(flag1);
        obj = mSearchEditFrame;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = mSearchHintIcon;
        if (mIconifiedByDefault)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((ImageView) (obj)).setVisibility(i);
        updateCloseButton();
        if (flag1)
        {
            flag = flag2;
        } else
        {
            flag = true;
        }
        updateVoiceButton(flag);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean flag)
    {
        byte byte1 = 8;
        byte byte0 = byte1;
        if (mVoiceButtonEnabled)
        {
            byte0 = byte1;
            if (!isIconified())
            {
                byte0 = byte1;
                if (flag)
                {
                    byte0 = 0;
                    mSubmitButton.setVisibility(8);
                }
            }
        }
        mVoiceButton.setVisibility(byte0);
    }

    public void clearFocus()
    {
        mClearingFocus = true;
        setImeVisibility(false);
        super.clearFocus();
        mQueryTextView.clearFocus();
        mClearingFocus = false;
    }

    public int getImeOptions()
    {
        return mQueryTextView.getImeOptions();
    }

    public int getInputType()
    {
        return mQueryTextView.getInputType();
    }

    public int getMaxWidth()
    {
        return mMaxWidth;
    }

    public CharSequence getQuery()
    {
        return mQueryTextView.getText();
    }

    public CharSequence getQueryHint()
    {
        CharSequence charsequence;
        if (mQueryHint != null)
        {
            charsequence = mQueryHint;
        } else
        if (mSearchable != null)
        {
            charsequence = null;
            int i = mSearchable.getHintId();
            if (i != 0)
            {
                return getContext().getString(i);
            }
        } else
        {
            return null;
        }
        return charsequence;
    }

    public CursorAdapter getSuggestionsAdapter()
    {
        return mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault()
    {
        return mIconifiedByDefault;
    }

    public boolean isIconified()
    {
        return mIconified;
    }

    public boolean isQueryRefinementEnabled()
    {
        return mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled()
    {
        return mSubmitButtonEnabled;
    }

    public void onActionViewCollapsed()
    {
        clearFocus();
        updateViewsVisibility(true);
        mQueryTextView.setImeOptions(mCollapsedImeOptions);
        mExpandedInActionView = false;
    }

    public void onActionViewExpanded()
    {
        if (mExpandedInActionView)
        {
            return;
        } else
        {
            mExpandedInActionView = true;
            mCollapsedImeOptions = mQueryTextView.getImeOptions();
            mQueryTextView.setImeOptions(mCollapsedImeOptions | 0x2000000);
            mQueryTextView.setText("");
            setIconified(false);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(mUpdateDrawableStateRunnable);
        post(mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/actionbarsherlock/widget/SearchView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/actionbarsherlock/widget/SearchView.getName());
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (mSearchable == null)
        {
            return false;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        if (isIconified())
        {
            super.onMeasure(i, j);
            return;
        }
        l = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        l;
        JVM INSTR lookupswitch 3: default 60
    //                   -2147483648: 75
    //                   0: 127
    //                   1073741824: 106;
           goto _L1 _L2 _L3 _L4
_L1:
        i = k;
_L6:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
        return;
_L2:
        if (mMaxWidth > 0)
        {
            i = Math.min(mMaxWidth, k);
        } else
        {
            i = Math.min(getPreferredWidth(), k);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = k;
        if (mMaxWidth > 0)
        {
            i = Math.min(mMaxWidth, k);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mMaxWidth > 0)
        {
            i = mMaxWidth;
        } else
        {
            i = getPreferredWidth();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    void onQueryRefine(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    void onTextFocusChanged()
    {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (mQueryTextView.hasFocus())
        {
            forceSuggestionQuery();
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        postUpdateFocusedState();
    }

    public boolean requestFocus(int i, Rect rect)
    {
        boolean flag;
        if (mClearingFocus)
        {
            flag = false;
        } else
        {
            if (!isFocusable())
            {
                return false;
            }
            if (!isIconified())
            {
                boolean flag1 = mQueryTextView.requestFocus(i, rect);
                flag = flag1;
                if (flag1)
                {
                    updateViewsVisibility(false);
                    return flag1;
                }
            } else
            {
                return super.requestFocus(i, rect);
            }
        }
        return flag;
    }

    public void setAppSearchData(Bundle bundle)
    {
        mAppSearchData = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            onCloseClicked();
            return;
        } else
        {
            onSearchClicked();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (mIconifiedByDefault == flag)
        {
            return;
        } else
        {
            mIconifiedByDefault = flag;
            updateViewsVisibility(flag);
            updateQueryHint();
            return;
        }
    }

    public void setImeOptions(int i)
    {
        mQueryTextView.setImeOptions(i);
    }

    public void setInputType(int i)
    {
        mQueryTextView.setInputType(i);
    }

    public void setMaxWidth(int i)
    {
        mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener oncloselistener)
    {
        mOnCloseListener = oncloselistener;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        mOnQueryTextFocusChangeListener = onfocuschangelistener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
    {
        mOnQueryChangeListener = onquerytextlistener;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mOnSearchClickListener = onclicklistener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onsuggestionlistener)
    {
        mOnSuggestionListener = onsuggestionlistener;
    }

    public void setQuery(CharSequence charsequence, boolean flag)
    {
        mQueryTextView.setText(charsequence);
        if (charsequence != null)
        {
            mQueryTextView.setSelection(mQueryTextView.length());
            mUserQuery = charsequence;
        }
        if (flag && !TextUtils.isEmpty(charsequence))
        {
            onSubmitQuery();
        }
    }

    public void setQueryHint(CharSequence charsequence)
    {
        mQueryHint = charsequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        mQueryRefinement = flag;
        if (mSuggestionsAdapter instanceof SuggestionsAdapter)
        {
            SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            suggestionsadapter.setQueryRefinement(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        mSearchable = searchableinfo;
        if (mSearchable != null)
        {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        mVoiceButtonEnabled = hasVoiceSearch();
        if (mVoiceButtonEnabled)
        {
            mQueryTextView.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        mSubmitButtonEnabled = flag;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(CursorAdapter cursoradapter)
    {
        mSuggestionsAdapter = cursoradapter;
        mQueryTextView.setAdapter(mSuggestionsAdapter);
    }























}
