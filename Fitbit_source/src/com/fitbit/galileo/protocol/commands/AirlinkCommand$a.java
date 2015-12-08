// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.protocol.commands;

import android.os.Handler;
import com.fitbit.galileo.bluetooth.a;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.bluetooth.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.fitbit.galileo.protocol.commands:
//            AirlinkCommand

private static class c extends h
{

    final Map a = new HashMap();
    final Handler b;
    final a c;

    private void a(ates ates, UUID uuid)
    {
        synchronized (a)
        {
            uuid = (f)a.get(uuid);
        }
        if (uuid != null)
        {
            b.sendMessage(b.obtainMessage(ates.ordinal(), uuid));
        }
        return;
        ates;
        map;
        JVM INSTR monitorexit ;
        throw ates;
    }

    public void a(f f1)
    {
        synchronized (a)
        {
            a.put(f1.i(), f1);
        }
        if (!c.a(f1))
        {
            b(f1.i());
        }
        return;
        f1;
        map;
        JVM INSTR monitorexit ;
        throw f1;
    }

    protected void a(UUID uuid)
    {
        a(com.fitbit.galileo.protocol.commands.ates.a, uuid);
    }

    public void b()
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        java.util.h.f f1;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); c.b((f)f1.e()))
        {
            f1 = (java.util.e)iterator.next();
        }

        break MISSING_BLOCK_LABEL_67;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
    }

    protected void b(UUID uuid)
    {
        a(ates.e, uuid);
    }

    protected void c(UUID uuid)
    {
        a(ates.b, uuid);
    }

    public boolean c()
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        map;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void d(UUID uuid)
    {
        a(ates.c, uuid);
    }

    protected void e(UUID uuid)
    {
        a(ates.d, uuid);
    }

    public ates(Handler handler, a a1)
    {
        b = handler;
        c = a1;
    }
}
