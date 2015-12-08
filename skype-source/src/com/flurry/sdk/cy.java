// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            do, cz, eo, fd

public class cy
{

    private static final String b = com/flurry/sdk/cy.getSimpleName();
    boolean a;
    private final cz c;
    private final File d;
    private String e;

    public cy()
    {
        this(com.flurry.sdk.do.a().b());
    }

    public cy(Context context)
    {
        c = new cz();
        d = context.getFileStreamPath(".flurryinstallreceiver.");
        eo.a(3, b, (new StringBuilder("Referrer file name if it exists:  ")).append(d).toString());
    }

    private void b()
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            eo.a(4, b, (new StringBuilder("Loading referrer info from file: ")).append(d.getAbsolutePath()).toString());
            String s = fd.c(d);
            eo.a(b, (new StringBuilder("Referrer file contents: ")).append(s).toString());
            b(s);
            return;
        }
    }

    private void b(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            e = s;
            return;
        }
    }

    private void c()
    {
        fd.a(d, e);
    }

    public Map a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Map map;
        b();
        map = c.a(e);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        a();
        this;
        JVM INSTR monitorexit ;
        return map;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        d.delete();
        e = null;
        a = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        b(s);
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

}
