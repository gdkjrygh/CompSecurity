// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah

public final class aj
    implements bd
{
    public static final class a
    {

        private static final Integer c[] = new Integer[0];
        com.google.android.m4b.maps.ak.a a;
        Set b;

        public final aj a()
        {
            if (b.contains(Integer.valueOf(-1)))
            {
                b.clear();
            }
            return new aj(a, (Integer[])b.toArray(c));
        }


        public a()
        {
            b = new HashSet();
        }
    }


    private final com.google.android.m4b.maps.ak.a a;
    private final Integer b[];

    protected aj(com.google.android.m4b.maps.ak.a a1, Integer ainteger[])
    {
        j.a(ainteger);
        a = a1;
        Arrays.sort(ainteger);
        b = ainteger;
    }

    public final bd.a a()
    {
        return bd.a.e;
    }

    public final void a(com.google.android.m4b.maps.ac.a a1)
    {
        if (a != null)
        {
            a1.b(9, a.a());
        }
        Integer ainteger[] = b;
        int k = ainteger.length;
        for (int i = 0; i < k; i++)
        {
            a1.a(12, ainteger[i].intValue());
        }

    }

    public final boolean a(ah ah1)
    {
        return ah1 == ah.m && (a != null || b.length != 0);
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
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a != null || b.length != 0)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!(obj instanceof aj))
        {
            return false;
        }
        obj = (aj)obj;
        if (!h.a(a, ((aj) (obj)).a) || !Arrays.equals(b, ((aj) (obj)).b))
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final int hashCode()
    {
        int i;
        int k;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        k = i + 31;
        i = k;
        if (b.length > 0)
        {
            i = k * 31 + Arrays.hashCode(b);
        }
        return i;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj;
        int k;
        if (a == null)
        {
            obj = "";
        } else
        {
            obj = a.toString();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("|");
        obj = b;
        k = obj.length;
        for (int i = 0; i < k; i++)
        {
            stringbuilder.append(obj[i].intValue());
            stringbuilder.append(",");
        }

        return stringbuilder.toString();
    }
}
