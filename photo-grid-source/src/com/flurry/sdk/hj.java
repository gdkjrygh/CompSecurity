// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            jo, hk, kc, lo

public class hj
{

    private static final String b = com/flurry/sdk/hj.getSimpleName();
    boolean a;
    private final hk c;
    private final File d;
    private String e;

    public hj()
    {
        this(jo.a().c());
    }

    public hj(Context context)
    {
        c = new hk();
        d = context.getFileStreamPath(".flurryinstallreceiver.");
        kc.a(3, b, (new StringBuilder("Referrer file name if it exists:  ")).append(d).toString());
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
        if (a)
        {
            return;
        } else
        {
            a = true;
            kc.a(4, b, (new StringBuilder("Loading referrer info from file: ")).append(d.getAbsolutePath()).toString());
            String s = lo.c(d);
            kc.a(b, (new StringBuilder("Referrer file contents: ")).append(s).toString());
            b(s);
            return;
        }
    }

    private void d()
    {
        lo.a(d, e);
    }

    public Map a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Map map;
        c();
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
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        c();
        s = e;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
