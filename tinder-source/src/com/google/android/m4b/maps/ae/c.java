// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ae;


public final class c
{

    private static final byte a[] = {
        0, 4, 9, 13, 17, 22, 26, 30, 35, 39, 
        43, 48, 52, 56, 60, 65, 69, 73, 77, 81, 
        86, 90, 94, 98, 102, 106, 110, 113, 117, 121, 
        125, -127, -124, -120, -116, -113, -109, -106, -102, -99, 
        -95, -92, -89, -86, -82, -79, -76, -73, -70, -67, 
        -64, -62, -59, -56, -54, -51, -49, -46, -44, -42, 
        -39, -37, -35, -33, -31, -29, -28, -26, -24, -23, 
        -21, -20, -18, -17, -16, -15, -13, -12, -11, -11, 
        -10, -9, -8, -8, -7, -7, -7, -6, -6, -6, 
        -6
    };

    public static int a(double d)
    {
        if (d < 0.0D)
        {
            d -= 0.5D;
        } else
        {
            d += 0.5D;
        }
        return (int)d;
    }

    public static int a(int i)
    {
        return (0x80000 + i) / 0x100000;
    }

}
