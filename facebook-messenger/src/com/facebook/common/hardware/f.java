// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.facebook.debug.log.b;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.common.hardware:
//            i, h

public class f
{

    private static final Class a = com/facebook/common/hardware/f;
    private final TelephonyManager b;
    private final ExecutorService c;
    private final PhoneStateListener d = new i(this, null);
    private final Map e = ik.a();

    public f(TelephonyManager telephonymanager, ExecutorService executorservice)
    {
        b = telephonymanager;
        c = executorservice;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        h h1;
        for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); c.submit((Runnable)e.get(h1)))
        {
            h1 = (h)iterator.next();
        }

        break MISSING_BLOCK_LABEL_67;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    static void a(f f1)
    {
        f1.a();
    }

    public boolean a(h h1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1;
        Preconditions.checkNotNull(h1);
        flag1 = e.containsKey(h1);
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e.remove(h1);
        if (e.isEmpty())
        {
            com.facebook.debug.log.b.c(a, "Turning off listener for cell data activity");
            b.listen(d, 0);
        }
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        h1;
        throw h1;
    }

}
