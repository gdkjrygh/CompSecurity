// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic;

import android.util.Log;
import com.taobao.statistic.core.b;
import com.taobao.statistic.core.c;
import com.taobao.statistic.core.h;

// Referenced classes of package com.taobao.statistic:
//            TBS, c

static final class 
    implements Runnable
{

    public void run()
    {
        Object obj = TBS.access$000();
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = TBS.access$100();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        TBS.access$100().start();
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj2;
        obj2;
        Log.e("TbsEngine start Error", "TBS.init()");
          goto _L3
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
_L2:
        obj2 = TBS.access$100().getRuntime();
        if (obj2 == null) goto _L3; else goto _L4
_L4:
        obj2 = ((h) (obj2)).getExecProxy();
        if (obj2 == null) goto _L3; else goto _L5
_L5:
        obj2 = ((c) (obj2)).Y();
        if (obj2 == null) goto _L3; else goto _L6
_L6:
        ((b) (obj2)).L();
          goto _L3
        obj2;
        ((Exception) (obj2)).printStackTrace();
          goto _L3
    }

    ()
    {
    }
}
