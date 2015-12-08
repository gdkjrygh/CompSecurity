// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.io.Serializable;

// Referenced classes of package com.google.a.b:
//            cn

final class cw extends cn
    implements Serializable
{

    final cn a;

    cw(cn cn1)
    {
        a = (cn)ad.a(cn1);
    }

    public final cn a()
    {
        return a;
    }

    public final Object a(Object obj, Object obj1)
    {
        return a.b(obj, obj1);
    }

    public final Object b(Object obj, Object obj1)
    {
        return a.a(obj, obj1);
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
        if (obj instanceof cw)
        {
            obj = (cw)obj;
            return a.equals(((cw) (obj)).a);
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
        String s = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 10)).append(s).append(".reverse()").toString();
    }
}
