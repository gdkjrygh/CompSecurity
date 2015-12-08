// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            q

final class bm extends q
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private q a;

    bm(q q1)
    {
        a = (q)j.a(q1);
    }

    public final q a()
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
        if (obj instanceof bm)
        {
            obj = (bm)obj;
            return a.equals(((bm) (obj)).a);
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
