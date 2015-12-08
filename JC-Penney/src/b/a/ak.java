// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.os.ConditionVariable;
import java.util.List;

// Referenced classes of package b.a:
//            ek, ag, q, ei, 
//            be

final class ak extends ek
{

    final ag a;
    final ag b;

    ak(ag ag1, ag ag2)
    {
        b = ag1;
        a = ag2;
        super();
    }

    public final void a()
    {
        b.a.r.a.block();
        if (ag.l())
        {
            b.a.o.a(a);
            return;
        }
        synchronized (ag.m())
        {
            ag.m().clear();
        }
    }
}
