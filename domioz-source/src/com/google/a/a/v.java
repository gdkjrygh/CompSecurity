// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.io.Serializable;

// Referenced classes of package com.google.a.a:
//            t, ad

final class v
    implements t, Serializable
{

    private final t a;
    private final t b;

    public v(t t1, t t2)
    {
        a = (t)ad.a(t1);
        b = (t)ad.a(t2);
    }

    public final Object apply(Object obj)
    {
        return a.apply(b.apply(obj));
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof v)
        {
            obj = (v)obj;
            flag = flag1;
            if (b.equals(((v) (obj)).b))
            {
                flag = flag1;
                if (a.equals(((v) (obj)).a))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b.hashCode() ^ a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        String s1 = String.valueOf(String.valueOf(b));
        return (new StringBuilder(s.length() + 2 + s1.length())).append(s).append("(").append(s1).append(")").toString();
    }
}
