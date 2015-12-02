// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.d;

import com.facebook.abtest.qe.b.f;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.abtest.qe.d:
//            c, b, d

public class a
{

    private final com.facebook.abtest.qe.b.a a;
    private final com.facebook.abtest.qe.e.a b;
    private final String c;
    private final c d;
    private QuickExperimentInfo e;
    private Object f;
    private f g;
    private boolean h;
    private d i;

    a(com.facebook.abtest.qe.b.a a1, com.facebook.abtest.qe.e.a a2, String s, c c1)
    {
        a = (com.facebook.abtest.qe.b.a)Preconditions.checkNotNull(a1);
        b = (com.facebook.abtest.qe.e.a)Preconditions.checkNotNull(a2);
        c = (String)Preconditions.checkNotNull(s);
        d = (c)Preconditions.checkNotNull(c1);
        h = false;
        g = new b(this);
        a.a(g);
    }

    private void a(QuickExperimentInfo quickexperimentinfo)
    {
        this;
        JVM INSTR monitorenter ;
        e = quickexperimentinfo;
        f = d.a(quickexperimentinfo);
        this;
        JVM INSTR monitorexit ;
        return;
        quickexperimentinfo;
        throw quickexperimentinfo;
    }

    static boolean a(a a1)
    {
        return a1.h;
    }

    static void b(a a1)
    {
        a1.f();
    }

    private void f()
    {
        QuickExperimentInfo quickexperimentinfo = i();
        if (!QuickExperimentInfo.a(quickexperimentinfo, e))
        {
            a(quickexperimentinfo);
            if (i != null)
            {
                i.a(f);
            }
        }
    }

    private void g()
    {
        if (e == null)
        {
            a(i());
        }
    }

    private boolean h()
    {
        return h;
    }

    private QuickExperimentInfo i()
    {
        return (QuickExperimentInfo)Preconditions.checkNotNull(a.a(c));
    }

    public Object a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        boolean flag;
        if (!h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Shall not force to refresh the adapter when auto-refresh is enabled.");
        f();
        obj = f;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (i == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Only one observer is allowed for an adapter.");
        i = d1;
        d1.a(b());
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public void a(String s, JsonNode jsonnode)
    {
        b.a(c(), s, jsonnode);
    }

    public Object b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        g();
        obj = f;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public QuickExperimentInfo c()
    {
        this;
        JVM INSTR monitorenter ;
        QuickExperimentInfo quickexperimentinfo;
        g();
        quickexperimentinfo = e;
        this;
        JVM INSTR monitorexit ;
        return quickexperimentinfo;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        a("ConfigLoaderDefaultExposureContext", null);
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        h = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
