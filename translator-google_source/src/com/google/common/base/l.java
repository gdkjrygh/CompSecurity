// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            m, p

public final class l
{

    private final String a;
    private m b;
    private m c;
    private boolean d;

    public l(String s)
    {
        b = new m();
        c = b;
        d = false;
        a = (String)p.a(s);
    }

    public final l a(String s, int i)
    {
        return a(s, String.valueOf(i));
    }

    public final l a(String s, Object obj)
    {
        m m1 = new m();
        c.c = m1;
        c = m1;
        m1.b = obj;
        m1.a = (String)p.a(s);
        return this;
    }

    public final String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        m m1 = b.c;
        String s1;
        for (String s = ""; m1 != null; s = s1)
        {
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (m1.b == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (m1.a != null)
                {
                    stringbuilder.append(m1.a).append('=');
                }
                stringbuilder.append(m1.b);
            }
            m1 = m1.c;
        }

        return stringbuilder.append('}').toString();
    }
}
