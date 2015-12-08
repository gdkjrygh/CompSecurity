// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ce;
import android.support.v7.a.b;
import android.support.v7.a.c;
import android.support.v7.a.e;
import android.support.v7.a.h;
import android.support.v7.a.l;
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
        return a.getResources().getInteger(h.a);
    }

    public final boolean b()
    {
        while (android.os.Build.VERSION.SDK_INT >= 19 || !ce.a(ViewConfiguration.get(a))) 
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
            return a.getResources().getBoolean(c.a);
        } else
        {
            return a.getResources().getBoolean(c.b);
        }
    }

    public final int e()
    {
        TypedArray typedarray = a.obtainStyledAttributes(null, l.a, b.c, 0);
        int j = typedarray.getLayoutDimension(l.l, 0);
        Resources resources = a.getResources();
        int i = j;
        if (!d())
        {
            i = Math.min(j, resources.getDimensionPixelSize(e.a));
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
        return a.getResources().getDimensionPixelSize(e.b);
    }
}
