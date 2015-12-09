// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.os.ConditionVariable;
import crittercism.android.ab;
import crittercism.android.ae;
import crittercism.android.ai;
import crittercism.android.ap;
import crittercism.android.at;
import crittercism.android.l;

// Referenced classes of package com.crittercism.app:
//            Crittercism

static final class a
    implements Runnable
{

    final boolean a;

    public final void run()
    {
        ab ab1;
        ai ai1;
        l l1;
        l1 = l.i();
        ai1 = l1.k;
        ab1 = null;
        at at1 = l1.e;
        ai1;
        JVM INSTR monitorenter ;
        if (!ai1.a())
        {
            ab1 = new ab(new ConditionVariable(ai1.a()), at1);
            ai1.a(ab1);
        }
        ai1;
        JVM INSTR monitorexit ;
        if (ab1 != null)
        {
            ab1.a();
        }
        at1.c().a(a);
        at1.c().a(l1, ae.f.a(), ae.f.b());
        return;
        Exception exception;
        exception;
        throw exception;
    }

    (boolean flag)
    {
        a = flag;
        super();
    }
}
