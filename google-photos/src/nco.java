// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

final class nco
{

    int a;

    nco()
    {
    }

    private static int b(Context context, int i, int j)
    {
        Resources resources = context.getApplicationContext().getResources();
        context = b.x(context);
        int k = ((DisplayMetrics) (context)).widthPixels;
        k = ((DisplayMetrics) (context)).heightPixels * k << 2;
        j = resources.getInteger(j);
        if (k == 0)
        {
            return j;
        } else
        {
            long l = resources.getInteger(i);
            return Math.min((int)(((long)k * l) / 100L), j);
        }
    }

    ncn a(Context context, int i, int j)
    {
        ncn ncn1 = new ncn();
        ncn1.a = b(context, b.Fj, i);
        ncn1.c = b(context, b.Fm, j);
        ncn1.b = b(context, b.Fi, j);
        i = context.getApplicationContext().getResources().getInteger(j);
        if (ncn1.c > i)
        {
            ncn1.b = Math.round(((float)i / (float)ncn1.c) * (float)ncn1.b);
        }
        context = context.getApplicationContext().getResources();
        ncn1.e = context.getInteger(b.Fl);
        ncn1.d = context.getInteger(b.Fk);
        return ncn1;
    }
}
