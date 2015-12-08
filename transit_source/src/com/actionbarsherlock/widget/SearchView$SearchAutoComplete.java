// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView

public static class getThreshold extends AutoCompleteTextView
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
                android.view.rchAutoComplete rchautocomplete = getKeyDispatcherState();
                if (rchautocomplete != null)
                {
                    rchautocomplete.Tracking(keyevent, this);
                }
                return true;
            }
            if (keyevent.getAction() == 1)
            {
                android.view.rchAutoComplete rchautocomplete1 = getKeyDispatcherState();
                if (rchautocomplete1 != null)
                {
                    rchautocomplete1.eUpEvent(keyevent);
                }
                if (keyevent.isTracking() && !keyevent.isCanceled())
                {
                    mSearchView.clearFocus();
                    SearchView.access$20(mSearchView, false);
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
                SearchView.access$19(this, true);
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


    public (Context context)
    {
        super(context);
        mThreshold = getThreshold();
    }

    public getThreshold(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mThreshold = getThreshold();
    }

    public getThreshold(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mThreshold = getThreshold();
    }
}
