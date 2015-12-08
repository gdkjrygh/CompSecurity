// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.io.Serializable;

// Referenced classes of package com.c.a.a:
//            v, w

private static final class ct
    implements v, Serializable
{

    private final Object a;

    public final boolean a(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ct)
        {
            obj = (ct)obj;
            return a.equals(((ct) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 20)).append("Predicates.equalTo(").append(s).append(")").toString();
    }

    private ct(Object obj)
    {
        a = obj;
    }

    ct(Object obj, byte byte0)
    {
        this(obj);
    }
}
