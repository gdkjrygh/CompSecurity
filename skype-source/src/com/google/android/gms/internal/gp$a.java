// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            gp

public static final class e
{

    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public final boolean equals(Object obj)
    {
        if (obj instanceof e)
        {
            if (x.a(a, ((a) (obj = (a)obj)).a) && b == ((b) (obj)).b && c == ((c) (obj)).c && e == ((e) (obj)).e && Double.compare(d, ((d) (obj)).d) == 0)
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
        return x.a(this).("name", a).("minBound", Double.valueOf(c)).("maxBound", Double.valueOf(b)).("percent", Double.valueOf(d)).("count", Integer.valueOf(e)).oString();
    }

    public l.x.a(String s, double d1, double d2, double d3, 
            int i)
    {
        a = s;
        c = d1;
        b = d2;
        d = d3;
        e = i;
    }
}
