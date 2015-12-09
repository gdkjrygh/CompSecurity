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
import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.kr;
import com.google.android.gms.internal.ks;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private View RY;
    private android.view.View.OnClickListener RZ;
    private int mColor;
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
        RZ = null;
        setStyle(0, 0);
    }

    private void H(Context context)
    {
        if (RY != null)
        {
            removeView(RY);
        }
        try
        {
            RY = kr.b(context, mSize, mColor);
        }
        catch (com.google.android.gms.dynamic.g.a a1)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            RY = a(context, mSize, mColor);
        }
        addView(RY);
        RY.setEnabled(isEnabled());
        RY.setOnClickListener(this);
    }

    private static Button a(Context context, int i, int j)
    {
        ks ks1 = new ks(context);
        ks1.a(context.getResources(), i, j);
        return ks1;
    }

    public final void onClick(View view)
    {
        if (RZ != null && view == RY)
        {
            RZ.onClick(this);
        }
    }

    public final void setColorScheme(int i)
    {
        setStyle(mSize, i);
    }

    public final void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        RY.setEnabled(flag);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        RZ = onclicklistener;
        if (RY != null)
        {
            RY.setOnClickListener(this);
        }
    }

    public final void setSize(int i)
    {
        setStyle(i, mColor);
    }

    public final void setStyle(int i, int j)
    {
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.a(flag, "Unknown button size %d", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.a(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        mSize = i;
        mColor = j;
        H(getContext());
    }
}
