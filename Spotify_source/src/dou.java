// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;

public final class dou
{

    private static final doy b = dow.a();
    final int a;

    private dou(int i)
    {
        a = i;
    }

    public dou(Resources resources)
    {
        this(resources.getInteger(0x7f0e0001));
    }

    static int a(int i, dqz dqz1)
    {
        if (dqz1.getMaxRows() > 0)
        {
            i = dqz1.getMaxRows();
        }
        return i;
    }

    public static doy a()
    {
        return b;
    }

    public static doy a(int i)
    {
        return new dov(i);
    }

    static int b()
    {
        return 0x7fffffff;
    }

    static 
    {
        dox.a();
    }
}
