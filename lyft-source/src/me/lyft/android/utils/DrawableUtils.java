// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

// Referenced classes of package me.lyft.android.utils:
//            VersionUtils

public class DrawableUtils
{

    public DrawableUtils()
    {
    }

    public static Drawable getButtonDrawableForHexColors(Context context, String s, String s1)
    {
        int i;
        int j;
        try
        {
            i = Color.parseColor(s);
            j = Color.parseColor(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return context.getResources().getDrawable(0x7f020050);
        }
        if (VersionUtils.hasLollipop())
        {
            return new RippleDrawable(getPressedColorSelector(j), new ColorDrawable(i), null);
        } else
        {
            context = new StateListDrawable();
            context.addState(StateSet.WILD_CARD, new ColorDrawable(i));
            s = new ColorDrawable(j);
            context.addState(new int[] {
                0x10100a7
            }, s);
            return context;
        }
    }

    private static ColorStateList getPressedColorSelector(int i)
    {
        return new ColorStateList(new int[][] {
            new int[0]
        }, new int[] {
            i
        });
    }
}
