// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            j, p

public final class i
{

    private final String a;
    private j b;
    private j c;
    private boolean d;

    public i(String s)
    {
        b = new j();
        c = b;
        d = false;
        a = (String)p.a(s);
    }

    private j a()
    {
        j j1 = new j();
        c.c = j1;
        c = j1;
        return j1;
    }

    public final i a(Object obj)
    {
        a().b = obj;
        return this;
    }

    public final i a(String s, int k)
    {
        return a(s, String.valueOf(k));
    }

    public final i a(String s, Object obj)
    {
        j j1 = a();
        j1.b = obj;
        j1.a = (String)p.a(s);
        return this;
    }

    public final String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        j j1 = b.c;
        String s1;
        for (String s = ""; j1 != null; s = s1)
        {
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (j1.b == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (j1.a != null)
                {
                    stringbuilder.append(j1.a).append('=');
                }
                stringbuilder.append(j1.b);
            }
            j1 = j1.c;
        }

        return stringbuilder.append('}').toString();
    }
}
