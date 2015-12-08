// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.f;
import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            q

final class h extends q
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private f a;
    private q b;

    h(f f1, q q1)
    {
        a = (f)j.a(f1);
        b = (q)j.a(q1);
    }

    public final int compare(Object obj, Object obj1)
    {
        return b.compare(a.a(obj), a.a(obj1));
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof h)
            {
                if (!a.equals(((h) (obj = (h)obj)).a) || !b.equals(((h) (obj)).b))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b).append(".onResultOf(").append(a).append(")").toString();
    }
}
