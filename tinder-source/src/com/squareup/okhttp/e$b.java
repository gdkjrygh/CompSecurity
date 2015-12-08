// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.f;
import com.squareup.okhttp.internal.http.h;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.squareup.okhttp:
//            e, t, p, f, 
//            s, m

final class <init> extends f
{

    final e a;
    private final com.squareup.okhttp.f c;
    private final boolean d;

    final String a()
    {
        return a.d.a.c;
    }

    protected final void b()
    {
        boolean flag = true;
        v v;
        boolean flag1;
        v = a.a(d);
        flag1 = a.c;
        if (!flag1) goto _L2; else goto _L1
_L1:
        c.a(new IOException("Canceled"));
_L4:
        a.a.d.b(this);
        return;
_L2:
        c.a(v);
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
        logger = d.a;
        level = Level.INFO;
        stringbuilder = new StringBuilder("Callback failure for ");
        obj1 = a;
        String s1;
        if (((e) (obj1)).c)
        {
            s1 = "canceled call";
        } else
        {
            s1 = "call";
        }
        obj1 = ((e) (obj1)).d.a.c("/...");
        logger.log(level, stringbuilder.append((new StringBuilder()).append(s1).append(" to ").append(obj1).toString()).toString(), ((Throwable) (obj)));
_L8:
        a.a.d.b(this);
        return;
_L6:
        com.squareup.okhttp.f f1 = c;
        t t1 = a.e.l;
        f1.a(((IOException) (obj)));
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        a.a.d.b(this);
        throw obj;
        obj;
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private rnal.http.h(e e1, com.squareup.okhttp.f f1)
    {
        a = e1;
        super("OkHttp %s", new Object[] {
            e1.d.a.toString()
        });
        c = f1;
        d = true;
    }

    d(e e1, com.squareup.okhttp.f f1, byte byte0)
    {
        this(e1, f1);
    }
}
