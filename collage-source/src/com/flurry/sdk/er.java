// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            fp, es, gd, ho

public class er
{

    private static final String b = com/flurry/sdk/er.getSimpleName();
    boolean a;
    private final es c;
    private final File d;
    private String e;

    public er()
    {
        this(fp.a().c());
    }

    public er(Context context)
    {
        c = new es();
        d = context.getFileStreamPath(".flurryinstallreceiver.");
        gd.a(3, b, (new StringBuilder()).append("Referrer file name if it exists:  ").append(d).toString());
    }

    private void b()
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            gd.a(4, b, (new StringBuilder()).append("Loading referrer info from file: ").append(d.getAbsolutePath()).toString());
            String s = ho.c(d);
            gd.a(b, (new StringBuilder()).append("Referrer file contents: ").append(s).toString());
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
        ho.a(d, e);
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
