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
//            y

public final class zzab extends Button
{

    public zzab(Context context)
    {
        this(context, null);
    }

    public zzab(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0x1010048);
    }

    private static int a(int i, int j, int k)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown color scheme: ")).append(i).toString());

        case 1: // '\001'
            j = k;
            // fall through

        case 0: // '\0'
            return j;
        }
    }

    public final void a(Resources resources, int i, int j)
    {
        float f;
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "Unknown button size %d", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14F);
        f = resources.getDisplayMetrics().density;
        setMinHeight((int)(f * 48F + 0.5F));
        setMinWidth((int)(f * 48F + 0.5F));
        i;
        JVM INSTR tableswitch 0 2: default 136
    //                   0 172
    //                   1 172
    //                   2 200;
           goto _L1 _L2 _L2 _L3
_L1:
        throw new IllegalStateException((new StringBuilder("Unknown button size: ")).append(i).toString());
_L2:
        int k = a(j, com.google.android.gms.a.b.common_signin_btn_text_dark, com.google.android.gms.a.b.common_signin_btn_text_light);
_L5:
        if (k == -1)
        {
            throw new IllegalStateException("Could not find background resource!");
        }
        break; /* Loop/switch isn't completed */
_L3:
        k = a(j, com.google.android.gms.a.b.common_signin_btn_icon_dark, com.google.android.gms.a.b.common_signin_btn_icon_light);
        if (true) goto _L5; else goto _L4
_L4:
        setBackgroundDrawable(resources.getDrawable(k));
        setTextColor(resources.getColorStateList(a(j, com.google.android.gms.a.a.common_signin_btn_text_dark, com.google.android.gms.a.a.common_signin_btn_text_light)));
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown button size: ")).append(i).toString());

        case 0: // '\0'
            setText(resources.getString(com.google.android.gms.a.c.common_signin_button_text));
            return;

        case 1: // '\001'
            setText(resources.getString(com.google.android.gms.a.c.common_signin_button_text_long));
            return;

        case 2: // '\002'
            setText(null);
            break;
        }
        return;
    }
}
