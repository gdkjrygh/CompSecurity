// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bk;
import java.util.Arrays;

public final class qp
{

    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public qp(String s, double d1, double d2, double d3, 
            int i)
    {
        a = s;
        c = d1;
        b = d2;
        d = d3;
        e = i;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof qp)
        {
            if (bj.a(a, ((qp) (obj = (qp)obj)).a) && b == ((qp) (obj)).b && c == ((qp) (obj)).c && e == ((qp) (obj)).e && Double.compare(d, ((qp) (obj)).d) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, Double.valueOf(b), Double.valueOf(c), Double.valueOf(d), Integer.valueOf(e)
        });
    }

    public final String toString()
    {
        return bj.a(this).a("name", a).a("minBound", Double.valueOf(c)).a("maxBound", Double.valueOf(b)).a("percent", Double.valueOf(d)).a("count", Integer.valueOf(e)).toString();
    }
}
