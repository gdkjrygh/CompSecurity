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
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.ho;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int Dj;
    private View Dk;
    private android.view.View.OnClickListener Dl;
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
        Dl = null;
        setStyle(0, 0);
    }

    private void C(Context context)
    {
        if (Dk != null)
        {
            removeView(Dk);
        }
        try
        {
            Dk = hn.b(context, mSize, Dj);
        }
        catch (com.google.android.gms.dynamic.g.a a1)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            Dk = a(context, mSize, Dj);
        }
        addView(Dk);
        Dk.setEnabled(isEnabled());
        Dk.setOnClickListener(this);
    }

    private static Button a(Context context, int i, int j)
    {
        ho ho1 = new ho(context);
        ho1.a(context.getResources(), i, j);
        return ho1;
    }

    public void onClick(View view)
    {
        if (Dl != null && view == Dk)
        {
            Dl.onClick(this);
        }
    }

    public void setColorScheme(int i)
    {
        setStyle(mSize, i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        Dk.setEnabled(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        Dl = onclicklistener;
        if (Dk != null)
        {
            Dk.setOnClickListener(this);
        }
    }

    public void setSize(int i)
    {
        setStyle(i, Dj);
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
        hm.a(flag, "Unknown button size %d", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        mSize = i;
        Dj = j;
        C(getContext());
    }
}
