// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.Serializable;

// Referenced classes of package a.a:
//            dv

final class dx
    implements dv, Serializable
{

    private final Object a;

    private dx(Object obj)
    {
        a = obj;
    }

    dx(Object obj, byte byte0)
    {
        this(obj);
    }

    public final boolean a(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof dx)
        {
            obj = (dx)obj;
            return a.equals(((dx) (obj)).a);
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
        return (new StringBuilder("Predicates.equalTo(")).append(a).append(")").toString();
    }
}
