// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;


// Referenced classes of package com.android.slyce.a.c.d:
//            g

final class l
{

    public static final g a = com.android.slyce.a.c.d.g.a(":status");
    public static final g b = com.android.slyce.a.c.d.g.a(":method");
    public static final g c = com.android.slyce.a.c.d.g.a(":path");
    public static final g d = com.android.slyce.a.c.d.g.a(":scheme");
    public static final g e = com.android.slyce.a.c.d.g.a(":authority");
    public static final g f = com.android.slyce.a.c.d.g.a(":host");
    public static final g g = com.android.slyce.a.c.d.g.a(":version");
    public final g h;
    public final g i;
    final int j;

    public l(g g1, g g2)
    {
        h = g1;
        i = g2;
        j = g1.d() + 32 + g2.d();
    }

    public l(g g1, String s)
    {
        this(g1, com.android.slyce.a.c.d.g.a(s));
    }

    public l(String s, String s1)
    {
        this(com.android.slyce.a.c.d.g.a(s), com.android.slyce.a.c.d.g.a(s1));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof l)
        {
            obj = (l)obj;
            flag = flag1;
            if (h.equals(((l) (obj)).h))
            {
                flag = flag1;
                if (i.equals(((l) (obj)).i))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (h.hashCode() + 527) * 31 + i.hashCode();
    }

    public String toString()
    {
        return String.format("%s: %s", new Object[] {
            h.a(), i.a()
        });
    }

}
