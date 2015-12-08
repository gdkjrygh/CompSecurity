// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ab;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public final class a
{

    private Context a;

    private a(Context context)
    {
        a = context;
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public final int a()
    {
        return a.getResources().getInteger(android.support.v7.appcompat.g.abc_max_action_buttons);
    }

    public final boolean b()
    {
        while (android.os.Build.VERSION.SDK_INT >= 19 || !ab.b(ViewConfiguration.get(a))) 
        {
            return true;
        }
        return false;
    }

    public final int c()
    {
        return a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public final boolean d()
    {
        if (a.getApplicationInfo().targetSdkVersion >= 16)
        {
            return a.getResources().getBoolean(android.support.v7.appcompat.b.abc_action_bar_embed_tabs);
        } else
        {
            return a.getResources().getBoolean(android.support.v7.appcompat.b.abc_action_bar_embed_tabs_pre_jb);
        }
    }

    public final int e()
    {
        TypedArray typedarray = a.obtainStyledAttributes(null, android.support.v7.appcompat.k.ActionBar, android.support.v7.appcompat.a.actionBarStyle, 0);
        int j = typedarray.getLayoutDimension(android.support.v7.appcompat.k.ActionBar_height, 0);
        Resources resources = a.getResources();
        int i = j;
        if (!d())
        {
            i = Math.min(j, resources.getDimensionPixelSize(android.support.v7.appcompat.d.abc_action_bar_stacked_max_height));
        }
        typedarray.recycle();
        return i;
    }

    public final boolean f()
    {
        return a.getApplicationInfo().targetSdkVersion < 14;
    }

    public final int g()
    {
        return a.getResources().getDimensionPixelSize(android.support.v7.appcompat.d.abc_action_bar_stacked_tab_max_width);
    }
}
