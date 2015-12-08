// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fll
    implements flk
{

    private final int a;
    private flm b;

    public fll(Context context, flm flm1)
    {
        b = flm1;
        a = hbg.c(context).a().d;
    }

    public final int a()
    {
        flm flm1 = b;
        return 50;
    }

    public final int b()
    {
        return a;
    }

    public final int c()
    {
        return b.a;
    }

    public final String toString()
    {
        String s = String.valueOf("ColumnThumbSizeCalculator{miniThumbSize=");
        flm flm1 = b;
        int i = a;
        int j = c();
        return (new StringBuilder(String.valueOf(s).length() + 63)).append(s).append(50).append(", thumbSize=").append(i).append(", screenNailSize=").append(j).append("}").toString();
    }
}
