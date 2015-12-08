// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, t

public final class l
    implements bb
{

    public final byte a[];
    public final int b[];
    private final int c;
    private final int d;
    private final int e;
    private final t f;

    public l(int i, int j, byte abyte0[], int k, t t, int ai[])
    {
        c = i;
        d = j;
        a = abyte0;
        e = k;
        f = t;
        b = ai;
    }

    public final int a()
    {
        return 6;
    }

    public final a b()
    {
        return a.a;
    }

    public final t d()
    {
        return f;
    }

    public final int e()
    {
        return e;
    }

    public final int[] f()
    {
        return b;
    }

    public final int g()
    {
        return a.length + 36;
    }
}
