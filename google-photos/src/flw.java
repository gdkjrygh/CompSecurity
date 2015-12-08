// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class flw
    implements mjz
{

    private final int a;
    private final int b;

    flw(flk flk1)
    {
        a = flk1.b();
        b = flk1.c();
    }

    public final int a(int i, int j)
    {
        if (i != 0x80000000 && j != 0x80000000)
        {
            if (i <= a && j <= a)
            {
                return a;
            }
            if (i <= b && j <= b)
            {
                return b;
            }
        }
        return 0;
    }
}
