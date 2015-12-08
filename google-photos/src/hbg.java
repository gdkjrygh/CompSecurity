// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class hbg
{

    final hap a;
    public final int b;
    final boolean c;
    public final int d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    private final Context i;

    hbg(hbh hbh1)
    {
        i = hbh1.a;
        a = hbh1.b;
        b = hbh1.c;
        c = hbh1.d;
        int j;
        if (hbh1.e != -1)
        {
            j = hbh1.e;
        } else
        {
            j = (i.getResources().getDisplayMetrics().widthPixels - a() * (b - 1)) / b;
        }
        d = j;
        e = hbh1.f;
        f = hbh1.g;
        g = hbh1.h;
        h = hbh1.i;
    }

    public static int a(Context context)
    {
        return context.getResources().getInteger(b.ve);
    }

    public static int a(Context context, int j)
    {
        int k = context.getResources().getDisplayMetrics().widthPixels;
        int i1 = context.getResources().getDisplayMetrics().heightPixels;
        int l = Math.min(k, i1);
        i1 = Math.max(k, i1);
        float f1 = (float)l / (float)j;
        if (k == l)
        {
            return j;
        } else
        {
            return (int)((float)i1 / f1);
        }
    }

    public static int b(Context context)
    {
        return context.getResources().getInteger(b.vf);
    }

    public static hbh c(Context context)
    {
        return new hbh(context);
    }

    public final int a()
    {
        if (c)
        {
            return i.getResources().getDimensionPixelSize(b.vd);
        } else
        {
            return 0;
        }
    }
}
