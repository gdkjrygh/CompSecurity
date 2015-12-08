// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.y.h;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah

public final class q
    implements bd
{

    private final a a;

    public q(a a1)
    {
        a = a1;
    }

    public final bd.a a()
    {
        return bd.a.b;
    }

    public final void a(a a1)
    {
        a1.b(27, a);
    }

    public final boolean a(ah ah1)
    {
        return ah1 == ah.v && a != null;
    }

    public final boolean a(bd bd1)
    {
        return equals(bd1);
    }

    public final int compareTo(Object obj)
    {
        obj = (bd)obj;
        if (obj == null)
        {
            return 1;
        } else
        {
            return toString().compareTo(obj.toString());
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                if (a != null)
                {
                    return false;
                }
            } else
            if (!(obj instanceof q))
            {
                return false;
            } else
            {
                obj = (q)obj;
                return h.a(a.toString(), ((q) (obj)).a.toString());
            }
        }
        return true;
    }

    public final int hashCode()
    {
        String s;
        if (a == null)
        {
            s = "";
        } else
        {
            s = a.toString();
        }
        return s.hashCode();
    }

    public final String toString()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a.toString().substring(0, 20);
        }
    }
}
