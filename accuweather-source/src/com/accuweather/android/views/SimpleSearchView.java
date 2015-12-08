// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;

// Referenced classes of package com.accuweather.android.views:
//            SearchTextWatcher

public class SimpleSearchView extends LinearLayout
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{
    public static interface ISearchViewListener
        extends Parcelable
    {

        public abstract void onQueryChanged(String s);

        public abstract void onSearch(String s);

        public abstract void onSearchItemSelected(int i, Object obj);
    }


    private AutoCompleteTextView mAutoCompleteTextView;
    protected ISearchViewListener mListener;
    private SearchTextWatcher mSearchTextWatcher;
    private int mSearchViewHintText;
    private int mSearchViewHintTextColor;
    private int mSearchViewTextColor;

    public SimpleSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), this);
        initAttributes(context, attributeset);
        mAutoCompleteTextView = (AutoCompleteTextView)findViewById(com.accuweather.android.R.id.query);
        if ((getResources().getConfiguration().screenLayout & 0xf) != 1)
        {
            mAutoCompleteTextView.setImeOptions(0x10000003);
        } else
        {
            mAutoCompleteTextView.setImeOptions(3);
        }
        mAutoCompleteTextView.setOnItemClickListener(this);
        mAutoCompleteTextView.setDropDownBackgroundResource(com.accuweather.android.R.color.listview_gray);
        mAutoCompleteTextView.setOnEditorActionListener(buildOnEditorActionListener());
        mAutoCompleteTextView.setTextColor(mSearchViewTextColor);
        mAutoCompleteTextView.setHintTextColor(mSearchViewHintTextColor);
        mAutoCompleteTextView.setHint(mSearchViewHintText);
        setSearchTextWatcher(new SearchTextWatcher());
        initSearchButton();
        Utilities.setTypeFace(this, Data.getRobotoCondensed());
    }

    private android.widget.TextView.OnEditorActionListener buildOnEditorActionListener()
    {
        return new android.widget.TextView.OnEditorActionListener() {

            final SimpleSearchView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 3 || i == 2 || i == 5)
                {
                    textview = mAutoCompleteTextView.getText().toString();
                    if (!TextUtils.isEmpty(textview) && mListener != null)
                    {
                        mListener.onSearch(textview);
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = SimpleSearchView.this;
                super();
            }
        };
    }

    private void initAttributes(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.accuweather.android.R.styleable.SimpleSearchView, 0, 0);
        mSearchViewTextColor = context.getColor(0, getResources().getColor(com.accuweather.android.R.color.white));
        mSearchViewHintTextColor = context.getColor(1, getResources().getColor(com.accuweather.android.R.color.white_75_opacity));
        mSearchViewHintText = context.getResourceId(2, com.accuweather.android.R.string.ChooseALocation_Abbr40);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void showSoftKeyboard()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).toggleSoftInput(0, 0);
    }

    public void clearInput()
    {
        mAutoCompleteTextView.setText("");
    }

    public void dismissDropDown()
    {
        mAutoCompleteTextView.dismissDropDown();
    }

    public String getDisplayedSearchText()
    {
        return mAutoCompleteTextView.getText().toString();
    }

    protected int getLayoutResourceId()
    {
        return com.accuweather.android.R.layout.simple_search_view;
    }

    protected void initSearchButton()
    {
        ((ImageButton)findViewById(com.accuweather.android.R.id.search)).setOnClickListener(this);
    }

    public void onClick(View view)
    {
        view = mAutoCompleteTextView.getText().toString();
        if (!TextUtils.isEmpty(view) && mListener != null)
        {
            mListener.onSearch(view);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mListener != null)
        {
            mAutoCompleteTextView.clearFocus();
            mListener.onSearchItemSelected(i, adapterview.getItemAtPosition(i));
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (mSearchTextWatcher != null)
        {
            mAutoCompleteTextView.removeTextChangedListener(mSearchTextWatcher);
        }
        super.onRestoreInstanceState(parcelable);
        post(new Runnable() {

            final SimpleSearchView this$0;

            public void run()
            {
                if (mSearchTextWatcher != null)
                {
                    mAutoCompleteTextView.clearFocus();
                    mAutoCompleteTextView.addTextChangedListener(mSearchTextWatcher);
                }
            }

            
            {
                this$0 = SimpleSearchView.this;
                super();
            }
        });
    }

    public void requestQueryFocus(boolean flag)
    {
        mAutoCompleteTextView.requestFocus();
        if (flag)
        {
            showSoftKeyboard();
        }
    }

    public void setAdapter(ArrayAdapter arrayadapter)
    {
        mAutoCompleteTextView.setAdapter(arrayadapter);
    }

    public void setDisplayedSearchText(String s)
    {
        if (mSearchTextWatcher != null)
        {
            mAutoCompleteTextView.removeTextChangedListener(mSearchTextWatcher);
            mSearchTextWatcher.setAutoCompleteTextView(null);
        }
        mAutoCompleteTextView.setFocusable(false);
        mAutoCompleteTextView.setFocusableInTouchMode(false);
        mAutoCompleteTextView.setText(s);
        mAutoCompleteTextView.setFocusable(true);
        mAutoCompleteTextView.setFocusableInTouchMode(true);
        if (mSearchTextWatcher != null)
        {
            mAutoCompleteTextView.addTextChangedListener(mSearchTextWatcher);
            mSearchTextWatcher.setAutoCompleteTextView(mAutoCompleteTextView);
        }
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        mAutoCompleteTextView.setOnTouchListener(ontouchlistener);
    }

    public void setSearchTextWatcher(SearchTextWatcher searchtextwatcher)
    {
        mSearchTextWatcher = searchtextwatcher;
        mSearchTextWatcher.setAutoCompleteTextView(mAutoCompleteTextView);
        mAutoCompleteTextView.addTextChangedListener(mSearchTextWatcher);
        if (mListener != null)
        {
            mSearchTextWatcher.setSearchViewListener(mListener);
        }
    }

    public void setSearchViewListener(ISearchViewListener isearchviewlistener)
    {
        mListener = isearchviewlistener;
        if (mSearchTextWatcher != null)
        {
            mSearchTextWatcher.setSearchViewListener(isearchviewlistener);
        }
    }

    public void showDropDown()
    {
        try
        {
            mAutoCompleteTextView.showDropDown();
            return;
        }
        catch (android.view.WindowManager.BadTokenException badtokenexception)
        {
            return;
        }
    }


}
