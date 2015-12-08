// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;

// Referenced classes of package bo.app:
//            hn, ff

final class hv extends hn
    implements Serializable
{

    final hn a;

    hv(hn hn1)
    {
        a = (hn)ff.a(hn1);
    }

    public final hn a()
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
        if (obj instanceof hv)
        {
            obj = (hv)obj;
            return a.equals(((hv) (obj)).a);
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
