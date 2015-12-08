// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            a, d, o

class ata.g
{

    boolean a;
    String b;
    String c;

    boolean a()
    {
        while (!a || a.l.c.a(b)) 
        {
            return true;
        }
        return false;
    }

    boolean a(ata.g g)
    {
        boolean flag = true;
        if (g == null)
        {
            flag = false;
        } else
        {
            a = g.h("enabled");
            if (a)
            {
                b = g.e("url");
                c = g.e("last_modified");
                return true;
            }
        }
        return flag;
    }

    void b()
    {
        a.l.c.a(b, c);
    }

    ata.g()
    {
    }
}
