// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.io.Serializable;

// Referenced classes of package com.google.a.a:
//            ae

final class ah
    implements ae, Serializable
{

    private final Object a;

    private ah(Object obj)
    {
        a = obj;
    }

    ah(Object obj, byte byte0)
    {
        this(obj);
    }

    public final boolean apply(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ah)
        {
            obj = (ah)obj;
            return a.equals(((ah) (obj)).a);
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
}
