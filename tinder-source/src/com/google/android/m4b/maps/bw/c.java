// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.bo.g;

public final class c
{

    public static g a(a a1)
    {
        int k = a1.d(3);
        int i = a1.d(1);
        int j = a1.d(2);
        k = 1 << 30 - k - 7;
        return new g(i * k - 0x20000000, 0x20000000 - k * j);
    }

    public static g a(com.google.android.m4b.maps.ba.a a1)
    {
        return g.b(a1.a, a1.b);
    }
}
