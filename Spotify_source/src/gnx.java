// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class gnx
{

    private static final long a;
    private static final gip b = gip.a("activation-payload-persisted-payload");
    private static gnx e;
    private final gin c;
    private gny d;

    private gnx(Context context)
    {
        c = ((giq)dmz.a(giq)).a(context);
        context = gny.a(c.a(b, ""));
        if (context.b() && ((gny)context.c()).a())
        {
            d = (gny)context.c();
            return;
        } else
        {
            c.b().a(b).b();
            return;
        }
    }

    public static gnx a(Context context)
    {
        gnx;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new gnx(context);
        }
        context = e;
        gnx;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(gny gny1)
    {
        this;
        JVM INSTR monitorenter ;
        gny1 = gny1.b();
        if (gny1.b())
        {
            c.b().a(b, (String)gny1.c()).b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        gny1;
        throw gny1;
    }

    private void a(JSONObject jsonobject, long l)
    {
        this;
        JVM INSTR monitorenter ;
        d = new gny(jsonobject, System.currentTimeMillis() + l);
        a(d);
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        c.b().a(b).b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        a(jsonobject, a);
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public final Optional b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null || !d.a()) goto _L2; else goto _L1
_L1:
        Optional optional = Optional.c(d.a);
_L4:
        this;
        JVM INSTR monitorexit ;
        return optional;
_L2:
        optional = Optional.e();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(7L);
    }
}
