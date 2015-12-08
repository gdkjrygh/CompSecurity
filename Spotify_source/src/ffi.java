// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ffi
{

    public static int a(double d)
    {
        int i = (int)Math.round(d);
        int j = i / 5;
        if (i % 5 > 2)
        {
            i = 5;
        } else
        {
            i = 0;
        }
        return i + j * 5;
    }

    public static boolean b(double d)
    {
        return 140D <= d && d <= 190D;
    }
}
