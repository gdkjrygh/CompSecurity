// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.DisplayMetrics;

public final class flm
    implements flk
{

    final int a;
    private final int b;

    public flm(Context context)
    {
        context = b.x(context);
        int j = Math.max(((DisplayMetrics) (context)).heightPixels, ((DisplayMetrics) (context)).widthPixels);
        int i = j;
        if (j == 0)
        {
            i = 640;
        }
        b = (int)((float)i * 0.2F);
        a = (int)((float)i * 0.5F);
    }

    public final int a()
    {
        return 50;
    }

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return a;
    }

    public final String toString()
    {
        String s = String.valueOf("DefaultThumbSizeCalculator{miniThumbSize=");
        int i = b;
        int j = a;
        return (new StringBuilder(String.valueOf(s).length() + 63)).append(s).append(50).append(", thumbSize=").append(i).append(", screenNailSize=").append(j).append("}").toString();
    }
}
