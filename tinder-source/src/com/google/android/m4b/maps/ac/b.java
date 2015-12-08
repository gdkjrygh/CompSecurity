// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ac;


public final class b
{
    static final class a
    {

        int a;
        Object b;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || !(obj instanceof a))
                {
                    return false;
                }
                obj = (a)obj;
                if (a != ((a) (obj)).a || b != ((a) (obj)).b && (b == null || !b.equals(((a) (obj)).b)))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return a;
        }

        public final String toString()
        {
            int i = a;
            String s = String.valueOf(b);
            return (new StringBuilder(String.valueOf(s).length() + 33)).append("TypeInfo{type=").append(i).append(", data=").append(s).append("}").toString();
        }

        a(int i, Object obj)
        {
            a = i;
            b = obj;
        }
    }


    private static final a b[];
    final com.google.android.m4b.maps.ae.b a;
    private final String c;

    public b()
    {
        this((byte)0);
    }

    private b(byte byte0)
    {
        c = null;
        a = new com.google.android.m4b.maps.ae.b();
    }

    public final b a(int i, int j, Object obj)
    {
        com.google.android.m4b.maps.ae.b b1 = a;
        if (obj == null)
        {
            obj = b[((0xff00 & i) >> 8) * 21 + ((i & 0xff) - 16)];
        } else
        {
            obj = new a(i, obj);
        }
        b1.a(j, obj);
        return this;
    }

    public final Object a(int i)
    {
        a a1 = (a)a.a(i);
        if (a1 == null)
        {
            return a1;
        } else
        {
            return a1.b;
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
                obj = (b)obj;
                return a.equals(((b) (obj)).a);
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode();
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
        b = new a[168];
        int i = 0;
        int j = 0;
        for (; i <= 7; i++)
        {
            for (int k = 16; k < 37;)
            {
                b[j] = new a((i << 8) + k, null);
                k++;
                j++;
            }

        }

    }
}
