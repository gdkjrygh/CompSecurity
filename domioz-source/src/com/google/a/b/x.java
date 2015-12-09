// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import com.google.a.a.t;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.google.a.b:
//            cn

final class x extends cn
    implements Serializable
{

    final t a;
    final cn b;

    x(t t1, cn cn1)
    {
        a = (t)ad.a(t1);
        b = (cn)ad.a(cn1);
    }

    public final int compare(Object obj, Object obj1)
    {
        return b.compare(a.apply(obj), a.apply(obj1));
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof x)
            {
                if (!a.equals(((x) (obj = (x)obj)).a) || !b.equals(((x) (obj)).b))
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
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(b));
        String s1 = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 13 + s1.length())).append(s).append(".onResultOf(").append(s1).append(")").toString();
    }
}
