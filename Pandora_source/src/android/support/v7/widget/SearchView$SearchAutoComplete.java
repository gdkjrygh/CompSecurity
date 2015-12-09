// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//            SearchView

public static class getThreshold extends AutoCompleteTextView
{

    private int a;
    private SearchView b;

    private boolean a()
    {
        return TextUtils.getTrimmedLength(getText()) == 0;
    }

    static boolean a(getText gettext)
    {
        return gettext.a();
    }

    public boolean enoughToFilter()
    {
        return a <= 0 || super.enoughToFilter();
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        b.d();
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                android.view.AutoComplete autocomplete = getKeyDispatcherState();
                if (autocomplete != null)
                {
                    autocomplete.Tracking(keyevent, this);
                }
                return true;
            }
            if (keyevent.getAction() == 1)
            {
                android.view.AutoComplete autocomplete1 = getKeyDispatcherState();
                if (autocomplete1 != null)
                {
                    autocomplete1.eUpEvent(keyevent);
                }
                if (keyevent.isTracking() && !keyevent.isCanceled())
                {
                    b.clearFocus();
                    SearchView.a(b, false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyevent);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && b.hasFocus() && getVisibility() == 0)
        {
            ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
            if (SearchView.a(getContext()))
            {
                SearchView.a.getContext(this, true);
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
        b = searchview;
    }

    public void setThreshold(int i)
    {
        super.setThreshold(i);
        a = i;
    }

    public (Context context)
    {
        super(context);
        a = getThreshold();
    }

    public getThreshold(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = getThreshold();
    }

    public getThreshold(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = getThreshold();
    }
}
