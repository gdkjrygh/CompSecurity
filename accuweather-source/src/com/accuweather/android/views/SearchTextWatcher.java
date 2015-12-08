// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

public class SearchTextWatcher
    implements TextWatcher
{

    private String mLastTextValue;
    private SimpleSearchView.ISearchViewListener mListener;
    protected AutoCompleteTextView mSearchAutoCompleteTextView;

    public SearchTextWatcher()
    {
        mLastTextValue = null;
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        mLastTextValue = charsequence.toString();
    }

    public String getLastTextValue()
    {
        return mLastTextValue;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (mListener != null && mSearchAutoCompleteTextView != null)
        {
            charsequence = charsequence.toString();
            if (!mLastTextValue.equals(charsequence) && !mSearchAutoCompleteTextView.isPerformingCompletion())
            {
                mListener.onQueryChanged(charsequence);
            }
        }
    }

    public void setAutoCompleteTextView(AutoCompleteTextView autocompletetextview)
    {
        mSearchAutoCompleteTextView = autocompletetextview;
    }

    public void setSearchViewListener(SimpleSearchView.ISearchViewListener isearchviewlistener)
    {
        mListener = isearchviewlistener;
    }
}
