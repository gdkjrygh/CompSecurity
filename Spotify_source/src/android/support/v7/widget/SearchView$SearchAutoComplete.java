// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import abr;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//            AppCompatAutoCompleteTextView, SearchView

public class getThreshold extends AppCompatAutoCompleteTextView
{

    SearchView a;
    private int b;

    public boolean enoughToFilter()
    {
        return b <= 0 || super.enoughToFilter();
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        a.c();
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
                    a.clearFocus();
                    SearchView.l(a);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyevent);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        abr abr1;
        super.onWindowFocusChanged(flag);
        if (!flag || !a.hasFocus() || getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        if (!SearchView.a(getContext()))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        abr1 = SearchView.a;
        if (abr1.c == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        abr1.c.invoke(this, new Object[] {
            Boolean.valueOf(true)
        });
        return;
        Exception exception;
        exception;
    }

    public void performCompletion()
    {
    }

    protected void replaceText(CharSequence charsequence)
    {
    }

    public void setThreshold(int i)
    {
        super.setThreshold(i);
        b = i;
    }

    public (Context context)
    {
        this(context, null);
    }

    public <init>(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010137);
    }

    public <init>(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = getThreshold();
    }
}
