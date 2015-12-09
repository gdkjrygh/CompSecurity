// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.os.ConditionVariable;
import java.util.List;

// Referenced classes of package b.a:
//            ek, q, ei, ag, 
//            be

final class aj extends ek
{

    final q a;
    final ag b;

    aj(q q1, ag ag1)
    {
        a = q1;
        b = ag1;
        super();
    }

    public final void a()
    {
        a.r.a.block();
        if (ag.l())
        {
            a.o.a(b);
            return;
        }
        synchronized (ag.m())
        {
            ag.m().clear();
        }
    }
}
