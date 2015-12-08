// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.at;


public final class b
{

    int a;
    int b;
    int c;
    int d;
    int e;
    private int f;

    public b(int i, int j, int k, int l, int i1)
    {
        if (i1 != 0 && i1 != 1)
        {
            throw new IllegalArgumentException((new StringBuilder(30)).append("qualityAlgorithm = ").append(i1).toString());
        } else
        {
            a = i;
            b = j;
            c = k;
            d = l;
            e = i1;
            f = 623;
            return;
        }
    }
}
