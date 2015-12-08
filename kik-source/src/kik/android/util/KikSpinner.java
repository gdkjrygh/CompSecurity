// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;
import kik.android.e.b;

public class KikSpinner extends Spinner
{

    private b a;
    private boolean b;

    public KikSpinner(Context context)
    {
        super(context);
        b = false;
    }

    public KikSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
    }

    public KikSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
    }

    public final void a(b b1)
    {
        a = b1;
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (b && flag)
        {
            b = false;
            if (a != null)
            {
                a.b();
            }
        }
    }

    public boolean performClick()
    {
        b = true;
        if (a != null)
        {
            a.a();
        }
        return super.performClick();
    }

    public void setSelection(int i)
    {
        boolean flag;
        if (i == getSelectedItemPosition())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super.setSelection(i);
        if (flag)
        {
            android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener = getOnItemSelectedListener();
            if (onitemselectedlistener != null)
            {
                onitemselectedlistener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
            }
        }
    }
}
