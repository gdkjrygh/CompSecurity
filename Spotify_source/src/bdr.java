// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bdr
{

    private static final int a[] = {
        48000, 44100, 32000
    };
    private static final int b[] = {
        2, 1, 2, 3, 3, 4, 4, 5
    };

    public static int a(int i, int j)
    {
        return ((i << 3) * j + 0xbb800) / 0x177000;
    }

    public static azi a(bec bec1)
    {
        int i = bec1.c();
        int k = a[(i & 0xc0) >> 6];
        int l = bec1.c();
        int j = b[(l & 0x38) >> 3];
        i = j;
        if ((l & 4) != 0)
        {
            i = j + 1;
        }
        return azi.a("audio/ac3", i, k);
    }

    public static azi b(bec bec1)
    {
        bec1.b(2);
        int i = bec1.c();
        int k = a[(i & 0xc0) >> 6];
        int l = bec1.c();
        int j = b[(l & 0xe) >> 1];
        i = j;
        if ((l & 1) != 0)
        {
            i = j + 1;
        }
        return azi.a("audio/eac3", i, k);
    }

}
