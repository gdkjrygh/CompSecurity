// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class ResourcesCompat
{

    private ResourcesCompat()
    {
    }

    public static boolean getResources_getBoolean(Context context, int i)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 13) goto _L2; else goto _L1
_L1:
        flag = context.getResources().getBoolean(i);
_L4:
        return flag;
_L2:
        float f;
        float f1;
        context = context.getResources().getDisplayMetrics();
        f1 = (float)((DisplayMetrics) (context)).widthPixels / ((DisplayMetrics) (context)).density;
        f = (float)((DisplayMetrics) (context)).heightPixels / ((DisplayMetrics) (context)).density;
        if (f1 < f)
        {
            f = f1;
        }
        if (i != com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f1 < 480F)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i != com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f1 >= 480F)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i != com.actionbarsherlock.R.bool.abs__action_bar_expanded_action_views_exclusive)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f >= 600F)
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (i == com.actionbarsherlock.R.bool.abs__config_allowActionMenuItemTextWithIcon)
        {
            if (f1 < 480F)
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown boolean resource ID ").append(i).toString());
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public static int getResources_getInteger(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return context.getResources().getInteger(i);
        }
        context = context.getResources().getDisplayMetrics();
        float f = (float)((DisplayMetrics) (context)).widthPixels / ((DisplayMetrics) (context)).density;
        if (i == com.actionbarsherlock.R.integer.abs__max_action_buttons)
        {
            if (f >= 600F)
            {
                return 5;
            }
            if (f >= 500F)
            {
                return 4;
            }
            return f < 360F ? 2 : 3;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown integer resource ID ").append(i).toString());
        }
    }
}
