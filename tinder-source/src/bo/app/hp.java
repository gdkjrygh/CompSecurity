// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;

// Referenced classes of package bo.app:
//            hh, ez

final class hp extends hh
    implements Serializable
{

    final hh a;

    hp(hh hh1)
    {
        a = (hh)ez.a(hh1);
    }

    public final hh a()
    {
        return a;
    }

    public final int compare(Object obj, Object obj1)
    {
        return a.compare(obj1, obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof hp)
        {
            obj = (hp)obj;
            return a.equals(((hp) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return -a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(".reverse()").toString();
    }
}
