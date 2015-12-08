// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.a.a;

import com.google.userfeedback.android.api.a.b.a;

// Referenced classes of package com.google.userfeedback.android.api.a.a.a:
//            d

public final class c
{

    private static final d b[];
    final a a = new a();
    private final String c = null;

    public c()
    {
    }

    public final c a(int i, int j, Object obj)
    {
        a a1 = a;
        if (obj == null)
        {
            obj = b[(i >> 8 & 0xff) * 21 + ((i & 0xff) - 16)];
        } else
        {
            obj = new d(i, obj);
        }
        a1.a(j, obj);
        return this;
    }

    public final Object a(int i)
    {
        d d1 = (d)a.a(i);
        if (d1 == null)
        {
            return d1;
        } else
        {
            return d1.b;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (getClass() == obj.getClass())
            {
                obj = (c)obj;
                return a.equals(((c) (obj)).a);
            }
        }
        return false;
    }

    public final int hashCode()
    {
        if (a != null)
        {
            return a.hashCode();
        } else
        {
            return super.hashCode();
        }
    }

    public final String toString()
    {
        String s = String.valueOf(c);
        if (s.length() != 0)
        {
            return "ProtoBufType Name: ".concat(s);
        } else
        {
            return new String("ProtoBufType Name: ");
        }
    }

    static 
    {
        b = new d[168];
        int i = 0;
        int j = 0;
        for (; i <= 7; i++)
        {
            for (int k = 16; k < 37;)
            {
                b[j] = new d((i << 8) + k, null);
                k++;
                j++;
            }

        }

    }
}
