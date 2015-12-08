// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.y.h;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah

public final class r
    implements bd
{
    public static final class a
    {

        String a;

        public final r a()
        {
            return new r(a);
        }

        public a()
        {
        }
    }


    private final String a;

    protected r(String s)
    {
        a = s;
    }

    public final bd.a a()
    {
        return com.google.android.m4b.maps.bo.bd.a.a;
    }

    public final void a(com.google.android.m4b.maps.ac.a a1)
    {
        a1.b(10, a);
    }

    public final boolean a(ah ah1)
    {
        return ah1 == ah.r && a != null;
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
            if (!(obj instanceof r))
            {
                return false;
            } else
            {
                obj = (r)obj;
                return h.a(a, ((r) (obj)).a);
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
            i = a.hashCode();
        }
        return i + 31;
    }

    public final String toString()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a;
        }
    }
}
