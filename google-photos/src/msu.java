// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class msu
{

    public static phm a(Context context)
    {
        int i = 1;
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        int j = context.getResources().getConfiguration().orientation;
        float f;
        if (displaymetrics.density == 0.0F)
        {
            f = 1.0F;
        } else
        {
            f = displaymetrics.density;
        }
        context = new phm();
        context.c = Integer.valueOf(displaymetrics.densityDpi);
        if (j != 2)
        {
            if (j == 1)
            {
                i = 2;
            } else
            {
                i = 4;
            }
        }
        context.d = i;
        context.b = Integer.valueOf((int)((float)displaymetrics.heightPixels / f));
        context.a = Integer.valueOf((int)((float)displaymetrics.widthPixels / f));
        return context;
    }

    static 
    {
        Runtime.getRuntime();
    }
}
