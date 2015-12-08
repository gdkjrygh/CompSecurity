// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentMap;

public class lpn
    implements jyv, jyw
{

    lpk a;
    lpk b;
    Status c;
    boolean d;
    lqr e;

    public lpn(Status status)
    {
        c = status;
    }

    public lpn(lqr lqr1, Looper looper, lpk lpk1, ds ds)
    {
        e = lqr1;
        if (looper == null)
        {
            Looper.getMainLooper();
        }
        a = lpk1;
        c = Status.a;
        lqr1.e.put(this, Boolean.valueOf(true));
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.a().a(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public Status a_()
    {
        return c;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d) goto _L2; else goto _L1
_L1:
        lqh.a("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = true;
        if (e.e.remove(this) == null);
        a.a = null;
        a = null;
        b = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public lpk c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d) goto _L2; else goto _L1
_L1:
        lqh.a("ContainerHolder is released.");
        lpk lpk1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return lpk1;
_L2:
        lpk1 = a;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
