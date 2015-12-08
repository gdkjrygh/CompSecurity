// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.y.h;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah

public final class at
    implements bd
{
    public static final class a
    {

        public String a;

        public final at a()
        {
            return new at(a);
        }

        public a()
        {
        }
    }


    private final String a;

    protected at(String s)
    {
        a = s;
    }

    public final bd.a a()
    {
        return bd.a.g;
    }

    public final void a(com.google.android.m4b.maps.ac.a a1)
    {
        a1.b(13, a);
    }

    public final boolean a(ah ah)
    {
        return a != null;
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
            if (!(obj instanceof at))
            {
                return false;
            } else
            {
                return h.a(a, ((at)obj).a);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a
        });
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
