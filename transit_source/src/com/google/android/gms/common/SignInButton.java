// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int jc;
    private View jd;
    private android.view.View.OnClickListener je;
    private int mSize;

    public SignInButton(Context context)
    {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignInButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        je = null;
        setStyle(0, 0);
    }

    private static Button c(Context context, int i, int j)
    {
        do do1 = new do(context);
        do1.a(context.getResources(), i, j);
        return do1;
    }

    private void p(Context context)
    {
        if (jd != null)
        {
            removeView(jd);
        }
        try
        {
            jd = dn.d(context, mSize, jc);
        }
        catch (com.google.android.gms.dynamic.e.a a)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            jd = c(context, mSize, jc);
        }
        addView(jd);
        jd.setEnabled(isEnabled());
        jd.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if (je != null && view == jd)
        {
            je.onClick(this);
        }
    }

    public void setColorScheme(int i)
    {
        setStyle(mSize, i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        jd.setEnabled(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        je = onclicklistener;
        if (jd != null)
        {
            jd.setOnClickListener(this);
        }
    }

    public void setSize(int i)
    {
        setStyle(i, jc);
    }

    public void setStyle(int i, int j)
    {
        boolean flag1 = true;
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.a(flag, (new StringBuilder()).append("Unknown button size ").append(i).toString());
        if (j >= 0 && j < 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dm.a(flag, (new StringBuilder()).append("Unknown color scheme ").append(j).toString());
        mSize = i;
        jc = j;
        p(getContext());
    }
}
