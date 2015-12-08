// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.util.a;

public class MDButton extends TextView
{

    private boolean a;
    private e b;
    private int c;
    private Drawable d;
    private Drawable e;

    public MDButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        a(context, attributeset, 0, 0);
    }

    public MDButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = false;
        a(context, attributeset, i, 0);
    }

    public MDButton(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        a = false;
        a(context, attributeset, i, j);
    }

    private void a(Context context, AttributeSet attributeset, int i, int j)
    {
        c = context.getResources().getDimensionPixelSize(com.afollestad.materialdialogs.R.dimen.md_dialog_frame_margin);
        b = e.c;
    }

    void a(boolean flag, boolean flag1)
    {
        if (a != flag || flag1)
        {
            Drawable drawable;
            int i;
            if (flag)
            {
                i = b.a() | 0x10;
            } else
            {
                i = 17;
            }
            setGravity(i);
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                if (flag)
                {
                    i = b.b();
                } else
                {
                    i = 4;
                }
                setTextAlignment(i);
            }
            if (flag)
            {
                drawable = d;
            } else
            {
                drawable = e;
            }
            com.afollestad.materialdialogs.util.a.a(this, drawable);
            if (flag)
            {
                setPadding(c, getPaddingTop(), c, getPaddingBottom());
            }
            a = flag;
        }
    }

    public void setAllCapsCompat(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setAllCaps(flag);
            return;
        }
        if (flag)
        {
            setTransformationMethod(new AllCapsTransformationMethod(getContext()));
            return;
        } else
        {
            setTransformationMethod(null);
            return;
        }
    }

    public void setDefaultSelector(Drawable drawable)
    {
        e = drawable;
        if (!a)
        {
            a(false, true);
        }
    }

    public void setStackedGravity(e e1)
    {
        b = e1;
    }

    public void setStackedSelector(Drawable drawable)
    {
        d = drawable;
        if (a)
        {
            a(true, true);
        }
    }
}
