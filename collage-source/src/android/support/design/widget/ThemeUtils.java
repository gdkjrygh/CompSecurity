// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;

class ThemeUtils
{

    private static final int APPCOMPAT_CHECK_ATTRS[];

    ThemeUtils()
    {
    }

    static void checkAppCompatTheme(Context context)
    {
        boolean flag = false;
        context = context.obtainStyledAttributes(APPCOMPAT_CHECK_ATTRS);
        if (!context.hasValue(0))
        {
            flag = true;
        }
        if (context != null)
        {
            context.recycle();
        }
        if (flag)
        {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        } else
        {
            return;
        }
    }

    static 
    {
        APPCOMPAT_CHECK_ATTRS = (new int[] {
            android.support.design.R.attr.colorPrimary
        });
    }
}
