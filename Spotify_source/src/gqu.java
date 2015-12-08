// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class gqu extends gsh
{

    private final gqv a;
    private gqs b;

    private gqu(gqs gqs1, gqv gqv1)
    {
        b = gqs1;
        super("OkHttp %s", new Object[] {
            gqs1.c.a.toString()
        });
        a = gqv1;
    }

    gqu(gqs gqs1, gqv gqv1, byte byte0)
    {
        this(gqs1, gqv1);
    }

    final String a()
    {
        return b.c.a.c;
    }

    protected final void b()
    {
        boolean flag = true;
        grt grt;
        boolean flag1;
        grt = b.a(false);
        flag1 = b.b;
        if (!flag1) goto _L2; else goto _L1
_L1:
        a.a(b.c, new IOException("Canceled"));
_L4:
        b.a.b.b(this);
        return;
_L2:
        a.a(grt);
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
_L10:
        if (!flag) goto _L6; else goto _L5
_L5:
        Logger logger;
        Level level;
        StringBuilder stringbuilder;
        Object obj1;
        logger = gsf.a;
        level = Level.INFO;
        stringbuilder = new StringBuilder("Callback failure for ");
        obj1 = b;
        String s;
        if (((gqs) (obj1)).b)
        {
            s = "canceled call";
        } else
        {
            s = "call";
        }
        obj1 = ((gqs) (obj1)).c.a.c("/...");
        logger.log(level, stringbuilder.append((new StringBuilder()).append(s).append(" to ").append(obj1).toString()).toString(), ((Throwable) (obj)));
_L8:
        b.a.b.b(this);
        return;
_L6:
        a.a(b.d.d, ((IOException) (obj)));
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        b.a.b.b(this);
        throw obj;
        obj;
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
