// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.y.h;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah

public final class br
    implements bd
{

    public final a a;

    public br(a a1)
    {
        a = a1;
    }

    public final bd.a a()
    {
        return bd.a.f;
    }

    public final void a(a a1)
    {
        a1.b(29, a);
    }

    public final boolean a(ah ah1)
    {
        return ah1 == ah.x || ah1 == ah.w;
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
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof br))
        {
            return false;
        } else
        {
            obj = (br)obj;
            return h.a(a.toString(), ((br) (obj)).a.toString());
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a.toString()
        });
    }

    public final String toString()
    {
        return a.toString();
    }
}
