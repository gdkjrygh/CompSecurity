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
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.hp;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int Dg;
    private View Dh;
    private android.view.View.OnClickListener Di;
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
        Di = null;
        setStyle(0, 0);
    }

    private static Button a(Context context, int i, int j)
    {
        hp hp1 = new hp(context);
        hp1.a(context.getResources(), i, j);
        return hp1;
    }

    private void z(Context context)
    {
        if (Dh != null)
        {
            removeView(Dh);
        }
        try
        {
            Dh = ho.b(context, mSize, Dg);
        }
        catch (com.google.android.gms.dynamic.g.a a1)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            Dh = a(context, mSize, Dg);
        }
        addView(Dh);
        Dh.setEnabled(isEnabled());
        Dh.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if (Di != null && view == Dh)
        {
            Di.onClick(this);
        }
    }

    public void setColorScheme(int i)
    {
        setStyle(mSize, i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        Dh.setEnabled(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        Di = onclicklistener;
        if (Dh != null)
        {
            Dh.setOnClickListener(this);
        }
    }

    public void setSize(int i)
    {
        setStyle(i, Dg);
    }

    public void setStyle(int i, int j)
    {
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.a(flag, "Unknown button size %d", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.a(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        mSize = i;
        Dg = j;
        z(getContext());
    }
}
