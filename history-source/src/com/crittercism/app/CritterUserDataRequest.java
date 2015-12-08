// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import crittercism.android.az;
import crittercism.android.dg;
import crittercism.android.dl;
import crittercism.android.dw;
import crittercism.android.dx;
import crittercism.android.dy;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crittercism.app:
//            CritterCallback, CritterUserData

public class CritterUserDataRequest
{

    private final CritterCallback a;
    private az b;
    private Map c;
    private dl d;

    public CritterUserDataRequest(CritterCallback crittercallback)
    {
        a = crittercallback;
        b = az.A();
        c = new HashMap();
        d = new dl(b);
    }

    static dl a(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.d;
    }

    static Map a(CritterUserDataRequest critteruserdatarequest, Map map)
    {
        critteruserdatarequest.c = map;
        return map;
    }

    static az b(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.b;
    }

    static Map c(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.c;
    }

    static CritterCallback d(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.a;
    }

    public void makeRequest()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = b.r;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new IllegalStateException();
        dx.a("Crittercism", (new StringBuilder("Must initialize Crittercism before calling ")).append(getClass().getName()).append(".makeRequest()").toString(), ((Throwable) (obj)));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Runnable runnable = new Runnable() {

            final CritterUserDataRequest a;

            public final void run()
            {
                CritterUserDataRequest.a(a).run();
                CritterUserDataRequest.a(a, CritterUserDataRequest.a(a).a);
                boolean flag = CritterUserDataRequest.b(a).f.b();
                CritterUserDataRequest.d(a).onCritterDataReceived(new CritterUserData(CritterUserDataRequest.c(a), flag));
            }

            
            {
                a = CritterUserDataRequest.this;
                super();
            }
        };
        if (!((dg) (obj)).a(runnable))
        {
            (new dy(runnable)).start();
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public CritterUserDataRequest requestDidCrashOnLastLoad()
    {
        d.c();
        return this;
    }

    public CritterUserDataRequest requestOptOutStatus()
    {
        d.b();
        return this;
    }

    public CritterUserDataRequest requestRateMyAppInfo()
    {
        d.e();
        return this;
    }

    public CritterUserDataRequest requestUserUUID()
    {
        d.d();
        return this;
    }
}
