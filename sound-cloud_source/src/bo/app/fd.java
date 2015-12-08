// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;

// Referenced classes of package bo.app:
//            fb

final class fd
    implements fb, Serializable
{

    private final Object a;

    private fd(Object obj)
    {
        a = obj;
    }

    fd(Object obj, byte byte0)
    {
        this(obj);
    }

    public final boolean a(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof fd)
        {
            obj = (fd)obj;
            return a.equals(((fd) (obj)).a);
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
