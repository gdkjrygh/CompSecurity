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
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int mColor;
    private int mSize;
    private View zzPb;
    private android.view.View.OnClickListener zzPc;

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
        zzPc = null;
        setStyle(0, 0);
    }

    private void zzS(Context context)
    {
        if (zzPb != null)
        {
            removeView(zzPb);
        }
        try
        {
            zzPb = zzy.zzb(context, mSize, mColor);
        }
        catch (com.google.android.gms.dynamic.zzg.zza zza1)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            zzPb = zza(context, mSize, mColor);
        }
        addView(zzPb);
        zzPb.setEnabled(isEnabled());
        zzPb.setOnClickListener(this);
    }

    private static Button zza(Context context, int i, int j)
    {
        zzz zzz1 = new zzz(context);
        zzz1.zza(context.getResources(), i, j);
        return zzz1;
    }

    public void onClick(View view)
    {
        if (zzPc != null && view == zzPb)
        {
            zzPc.onClick(this);
        }
    }

    public void setColorScheme(int i)
    {
        setStyle(mSize, i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        zzPb.setEnabled(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        zzPc = onclicklistener;
        if (zzPb != null)
        {
            zzPb.setOnClickListener(this);
        }
    }

    public void setSize(int i)
    {
        setStyle(i, mColor);
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
        zzv.zza(flag, "Unknown button size %d", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        mSize = i;
        mColor = j;
        zzS(getContext());
    }
}
