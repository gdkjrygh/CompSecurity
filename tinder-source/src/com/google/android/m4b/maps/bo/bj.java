// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.y.h;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah

public final class bj
    implements bd
{
    public static final class a
    {

        public c a;

        public final bj a()
        {
            return new bj(a);
        }

        public a()
        {
        }
    }


    public final c a;

    protected bj(c c1)
    {
        a = c1;
    }

    public static bj a(c c1)
    {
        a a1 = new a();
        a1.a = c1;
        return a1.a();
    }

    public final bd.a a()
    {
        return bd.a.d;
    }

    public final void a(com.google.android.m4b.maps.ac.a a1)
    {
        a1.b(6, a.a.toString());
    }

    public final boolean a(ah ah1)
    {
        return ah1 == ah.n && a != null;
    }

    public final boolean a(bd bd1)
    {
        return true;
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
            if (!(obj instanceof bj))
            {
                return false;
            } else
            {
                return h.a(a.a, ((bj)obj).a.a);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.a.hashCode();
        }
        return i + 31;
    }

    public final String toString()
    {
        return a.a.toString();
    }
}
