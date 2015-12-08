// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            n, aa, ao, an

abstract class aq
    implements n
{

    final aa b;

    private aq(aa aa1)
    {
        b = aa1;
        super();
    }

    aq(aa aa1, byte byte0)
    {
        this(aa1);
    }

    public void onConnectionSuspended(int i)
    {
        aa.a(b).lock();
        i;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 82
    //                   2 49;
           goto _L1 _L2 _L3
_L1:
        aa.a(b).unlock();
        return;
_L3:
        aa.a(b, i);
        b.c();
          goto _L1
        Exception exception;
        exception;
        aa.a(b).unlock();
        throw exception;
_L2:
        boolean flag = b.h();
        if (flag)
        {
            aa.a(b).unlock();
            return;
        }
        aa.d(b);
        if (b.b == null)
        {
            b.b = new ao(b);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            aa.e(b).getApplicationContext().registerReceiver(b.b, intentfilter);
        }
        aa.f(b).sendMessageDelayed(aa.f(b).obtainMessage(1), aa.g(b));
        aa.f(b).sendMessageDelayed(aa.f(b).obtainMessage(2), aa.h(b));
        aa.a(b, i);
          goto _L1
    }
}
