// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;

import org.spongycastle.util.Arrays;

public class LongPolynomial2
{

    private long a[];
    private int b;

    private LongPolynomial2(long al[])
    {
        a = al;
    }

    public Object clone()
    {
        LongPolynomial2 longpolynomial2 = new LongPolynomial2((long[])a.clone());
        longpolynomial2.b = b;
        return longpolynomial2;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LongPolynomial2)
        {
            return Arrays.a(a, ((LongPolynomial2)obj).a);
        } else
        {
            return false;
        }
    }
}
