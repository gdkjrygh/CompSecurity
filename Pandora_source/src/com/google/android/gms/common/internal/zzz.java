// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzv

public final class zzz extends Button
{

    public zzz(Context context)
    {
        this(context, null);
    }

    public zzz(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0x1010048);
    }

    private void zza(Resources resources)
    {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14F);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int)(f * 48F + 0.5F));
        setMinWidth((int)(f * 48F + 0.5F));
    }

    private int zzb(int i, int j, int k)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown color scheme: ").append(i).toString());

        case 1: // '\001'
            j = k;
            // fall through

        case 0: // '\0'
            return j;
        }
    }

    private void zzb(Resources resources, int i, int j)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown button size: ").append(i).toString());

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_82;

        case 0: // '\0'
        case 1: // '\001'
            i = zzb(j, com.google.android.gms.R.drawable.common_signin_btn_text_dark, com.google.android.gms.R.drawable.common_signin_btn_text_light);
            break;
        }
_L1:
        if (i == -1)
        {
            throw new IllegalStateException("Could not find background resource!");
        } else
        {
            setBackgroundDrawable(resources.getDrawable(i));
            return;
        }
        i = zzb(j, com.google.android.gms.R.drawable.common_signin_btn_icon_dark, com.google.android.gms.R.drawable.common_signin_btn_icon_light);
          goto _L1
    }

    private void zzc(Resources resources, int i, int j)
    {
        setTextColor(resources.getColorStateList(zzb(j, com.google.android.gms.R.color.common_signin_btn_text_dark, com.google.android.gms.R.color.common_signin_btn_text_light)));
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown button size: ").append(i).toString());

        case 0: // '\0'
            setText(resources.getString(com.google.android.gms.R.string.common_signin_button_text));
            return;

        case 1: // '\001'
            setText(resources.getString(com.google.android.gms.R.string.common_signin_button_text_long));
            return;

        case 2: // '\002'
            setText(null);
            break;
        }
    }

    public void zza(Resources resources, int i, int j)
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
        zza(resources);
        zzb(resources, i, j);
        zzc(resources, i, j);
    }
}
