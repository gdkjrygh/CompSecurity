// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class iwm
    implements omb, opn, opr, opv
{

    noz a;
    private final am b;
    private final iwk c;
    private ExecutorService d;
    private Future e;
    private Object f;
    private noz g;

    public iwm(am am1, opd opd1, iwk iwk1)
    {
        p.a(iwk1);
        b = am1;
        c = iwk1;
        opd1.a(this);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b.w && f != null)
        {
            c.a(f);
            f = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = ((iwl)olm1.a(iwl)).a;
        g = noz.a(context, "TransformMixin", new String[0]);
        a = noz.a(context, 2, "TransformMixin", new String[] {
            "perf"
        });
    }

    public final void a(iwj iwj, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        p.b(iwj, "Must set a transformer before request.");
        if (e != null)
        {
            e.cancel(false);
        }
        e = d.submit(new iwn(this, iwj, obj));
        this;
        JVM INSTR monitorexit ;
        return;
        iwj;
        throw iwj;
    }

    void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        f = obj;
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final void al_()
    {
        b();
    }

    public final void c()
    {
        if (e != null)
        {
            e.cancel(true);
        }
        f = null;
    }
}
