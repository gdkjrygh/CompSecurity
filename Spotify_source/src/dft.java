// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class dft
{

    public static int a(float f, Resources resources)
    {
        return (int)(resources.getDisplayMetrics().density * f);
    }

    public static int a(Resources resources)
    {
        return (int)(12F * resources.getDisplayMetrics().scaledDensity);
    }

    public static int b(float f, Resources resources)
    {
        int i = Math.round(resources.getDisplayMetrics().density * f);
        if (i != 0)
        {
            return i;
        }
        if (f == 0.0F)
        {
            return 0;
        }
        return f <= 0.0F ? -1 : 1;
    }
}
