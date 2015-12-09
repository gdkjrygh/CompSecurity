// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.os.ConditionVariable;
import crittercism.android.aa;
import crittercism.android.ab;
import crittercism.android.ac;
import crittercism.android.ai;
import crittercism.android.at;
import crittercism.android.l;
import crittercism.android.y;
import crittercism.android.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.crittercism.app:
//            CritterCallback, CritterUserData

public class CritterUserDataRequest
{

    private List a;
    private final CritterCallback b;
    private at c;
    private ConditionVariable d;
    private ai e;
    private Map f;

    public CritterUserDataRequest(CritterCallback crittercallback)
    {
        a = new ArrayList();
        b = crittercallback;
        e = l.i().k;
        d = new ConditionVariable(e.a());
        c = l.i().e;
        f = new HashMap();
    }

    static List a(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.a;
    }

    static void a(CritterUserDataRequest critteruserdatarequest, Map map)
    {
        critteruserdatarequest.a(map);
    }

    private void a(z z)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(z);
        this;
        JVM INSTR monitorexit ;
        return;
        z;
        throw z;
    }

    private void a(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        f.putAll(map);
        this;
        JVM INSTR monitorexit ;
        return;
        map;
        throw map;
    }

    static Map b(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.f;
    }

    static at c(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.c;
    }

    static CritterCallback d(CritterUserDataRequest critteruserdatarequest)
    {
        return critteruserdatarequest.b;
    }

    public void makeRequest()
    {
        this;
        JVM INSTR monitorenter ;
        (new Thread(new Runnable() {

            final CritterUserDataRequest a;

            public final void run()
            {
                z z1;
                for (Iterator iterator = CritterUserDataRequest.a(a).iterator(); iterator.hasNext(); CritterUserDataRequest.a(a, z1.c()))
                {
                    z1 = (z)iterator.next();
                    z1.a();
                }

                CritterUserDataRequest.d(a).onCritterDataReceived(new CritterUserData(CritterUserDataRequest.b(a), CritterUserDataRequest.c(a).d()));
            }

            
            {
                a = CritterUserDataRequest.this;
                super();
            }
        })).start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public CritterUserDataRequest requestDidCrashOnLastLoad()
    {
        y y1 = new y(d, c);
        e.a(y1);
        a(y1);
        return this;
    }

    public CritterUserDataRequest requestOptOutStatus()
    {
        ab ab1 = new ab(d, c);
        e.a(ab1);
        a(ab1);
        return this;
    }

    public CritterUserDataRequest requestRateMyAppInfo()
    {
        ac ac1 = new ac(d, c);
        e.a(ac1);
        a(ac1);
        return this;
    }

    public CritterUserDataRequest requestUserUUID()
    {
        aa aa1 = new aa(d, c);
        e.a(aa1);
        a(aa1);
        return this;
    }
}
