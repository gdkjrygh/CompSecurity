// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;

// Referenced classes of package com.leanplum:
//            aJ, g, aP, af, 
//            aO

final class ac
{

    private aJ a;
    private boolean b;
    private Timer c;
    private boolean d;
    private boolean e;

    public ac()
    {
        d = false;
        e = false;
        try
        {
            a = new aJ(new URI((new StringBuilder("http://")).append(g.b).append(":").append(g.c).toString()), new aP(this));
        }
        catch (URISyntaxException urisyntaxexception)
        {
            urisyntaxexception.printStackTrace();
        }
        a();
        c = new Timer();
        c.schedule(new af(this), 0L, 5000L);
    }

    private void a()
    {
        e = true;
        aJ aj = a;
        if (aj.e == null)
        {
            (new aO(aj)).start();
        }
    }

    static void a(ac ac1, boolean flag)
    {
        ac1.d = flag;
    }

    static boolean a(ac ac1)
    {
        return ac1.b;
    }

    static aJ b(ac ac1)
    {
        return ac1.a;
    }

    static void b(ac ac1, boolean flag)
    {
        ac1.e = false;
    }

    static void c(ac ac1)
    {
        if (!ac1.d && !ac1.e)
        {
            ac1.a();
        }
    }

    static void c(ac ac1, boolean flag)
    {
        ac1.b = flag;
    }
}
