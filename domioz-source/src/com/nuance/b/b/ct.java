// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.am;
import com.nuance.b.b.a.an;
import com.nuance.b.b.a.ao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            fr, bx, cv, au, 
//            cw, cu

final class ct
    implements am
{

    final bx a;

    ct(bx bx1)
    {
        a = bx1;
        super();
    }

    public final void onRecordingError(ak ak1)
    {
        fr.f((new StringBuilder("onRecordingError ")).append(ak1.a).append(" ").append(ak1.b).toString());
        List list = bx.i(a);
        list;
        JVM INSTR monitorenter ;
        am am1;
        for (Iterator iterator = bx.i(a).iterator(); iterator.hasNext(); bx.d().execute(new cv(this, am1, ak1)))
        {
            am1 = (am)iterator.next();
        }

        break MISSING_BLOCK_LABEL_104;
        ak1;
        list;
        JVM INSTR monitorexit ;
        throw ak1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void onRecordingStarted(an an1)
    {
        fr.f((new StringBuilder("onRecordingStarted ")).append(an1.a).toString());
        int i;
        if (a.a != null)
        {
            i = au.a;
        }
        List list = bx.i(a);
        list;
        JVM INSTR monitorenter ;
        am am1;
        for (Iterator iterator = bx.i(a).iterator(); iterator.hasNext(); bx.d().execute(new cw(this, am1, an1)))
        {
            am1 = (am)iterator.next();
        }

        break MISSING_BLOCK_LABEL_107;
        an1;
        list;
        JVM INSTR monitorexit ;
        throw an1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void onRecordingStopped(ao ao1)
    {
        fr.f((new StringBuilder("onRecordingStopped ")).append(ao1.a).toString());
        int i;
        if (a.a != null)
        {
            i = au.e;
        }
        List list = bx.i(a);
        list;
        JVM INSTR monitorenter ;
        am am1;
        for (Iterator iterator = bx.i(a).iterator(); iterator.hasNext(); bx.d().execute(new cu(this, am1, ao1)))
        {
            am1 = (am)iterator.next();
        }

        break MISSING_BLOCK_LABEL_107;
        ao1;
        list;
        JVM INSTR monitorexit ;
        throw ao1;
        list;
        JVM INSTR monitorexit ;
    }
}
