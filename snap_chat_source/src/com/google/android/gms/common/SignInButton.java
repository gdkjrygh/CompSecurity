// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzx;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    private int mColor;
    private int mSize;
    private View zzLI;
    private android.view.View.OnClickListener zzLJ;

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
        zzLJ = null;
        setStyle(0, 0);
    }

    private void zzN(Context context)
    {
        if (zzLI != null)
        {
            removeView(zzLI);
        }
        try
        {
            zzLI = zzac.zzb(context, mSize, mColor);
        }
        catch (com.google.android.gms.dynamic.zzg.zza zza1)
        {
            zzLI = zza(context, mSize, mColor);
        }
        addView(zzLI);
        zzLI.setEnabled(isEnabled());
        zzLI.setOnClickListener(this);
    }

    private static Button zza(Context context, int i, int j)
    {
        zzad zzad1 = new zzad(context);
        zzad1.zza(context.getResources(), i, j);
        return zzad1;
    }

    public final void onClick(View view)
    {
        if (zzLJ != null && view == zzLI)
        {
            zzLJ.onClick(this);
        }
    }

    public final void setColorScheme(int i)
    {
        setStyle(mSize, i);
    }

    public final void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        zzLI.setEnabled(flag);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        zzLJ = onclicklistener;
        if (zzLI != null)
        {
            zzLI.setOnClickListener(this);
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
        zzx.zza(flag, "Unknown button size %d", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        mSize = i;
        mColor = j;
        zzN(getContext());
    }
}
