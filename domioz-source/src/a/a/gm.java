// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.Serializable;

// Referenced classes of package a.a:
//            ge, du

final class gm extends ge
    implements Serializable
{

    final ge a;

    gm(ge ge1)
    {
        a = (ge)du.a(ge1);
    }

    public final ge a()
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
        if (obj instanceof gm)
        {
            obj = (gm)obj;
            return a.equals(((gm) (obj)).a);
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
