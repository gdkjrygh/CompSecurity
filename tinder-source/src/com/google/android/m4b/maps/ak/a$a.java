// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;


// Referenced classes of package com.google.android.m4b.maps.ak:
//            a

public static class d extends a
{

    protected final long b;
    protected final long c;
    protected final long d;

    public final String a()
    {
        String s = String.valueOf(Long.toHexString(c));
        String s1 = String.valueOf(Long.toHexString(d));
        return (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length())).append("0x").append(s).append(":0x").append(s1).toString();
    }

    public final boolean a(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof d)
        {
            obj = (d)obj;
            flag = flag1;
            if (((d) (obj)).c == c)
            {
                flag = flag1;
                if (((c) (obj)).d == d)
                {
                    flag = flag1;
                    if (((d) (obj)).b == b)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final com.google.android.m4b.maps.an.b c()
    {
        com.google.android.m4b.maps.an.a a1 = com.google.android.m4b.maps.an.b();
        long l = c;
        a1.b();
        com.google.android.m4b.maps.an.a((com.google.android.m4b.maps.an.a)a1.a, l);
        l = d;
        a1.b();
        com.google.android.m4b.maps.an.b((com.google.android.m4b.maps.an.b)a1.a, l);
        return (com.google.android.m4b.maps.an.a.a)a1.e();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof a.e)
        {
            return ((a.e)obj).b == b;
        } else
        {
            return a(obj);
        }
    }

    public int hashCode()
    {
        return (int)(b ^ b >>> 32);
    }

    public String toString()
    {
        return a();
    }

    a(long l)
    {
        this(0L, l);
    }

    <init>(long l, long l1)
    {
        long l2 = l >>> 16;
        l2 = (l2 >>> 44 ^ l2 << 4) & 0xffffffffffffL ^ (l << 32 & 0xffffffffffffL | l1 >>> 32);
        b = (l2 >>> 44 ^ l2 << 4) & 0xffffffffffffL ^ 0xffffffffL & l1;
        c = l;
        d = l1;
    }
}
