// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.z;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            k

static final class g
{

    private final String a;
    private final g b;
    private final z c;
    private final float d;
    private final int e;
    private final int f;
    private final int g;

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof g)
            {
                if (((g) (obj = (g)obj)).d != d || ((d) (obj)).e != e || ((e) (obj)).f != f || ((f) (obj)).g != g || ((g) (obj)).b != b || ((b) (obj)).c != c && (((c) (obj)).c == null || !((c) (obj)).c.equals(c)) || !((c) (obj)).a.equals(a))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = (a.hashCode() + 31) * 31 + b.hashCode();
        int i = j;
        if (c != null)
        {
            i = j * 31 + c.hashCode();
        }
        return (((i * 31 + Float.floatToIntBits(d)) * 31 + e) * 31 + f) * 31 + g;
    }

    public (String s,  , z z1, float f1, int i, int j, int l)
    {
        a = s;
        b = ;
        c = z1;
        d = f1;
        e = i;
        f = j;
        g = l;
    }
}
