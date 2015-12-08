// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.p;
import java.util.Hashtable;

// Referenced classes of package com.nuance.a.a.a.b:
//            f

public final class k
    implements Runnable
{

    private p a;
    private f b;

    public k(f f1, p p1)
    {
        b = f1;
        super();
        a = p1;
        f.a(f1).put(p1, this);
    }

    public final void run()
    {
        k k1 = (k)f.a(b).remove(a);
        if (f.d().b())
        {
            f.d();
            (new StringBuilder("TIMER run() _pendingTimerTasks.size():")).append(f.a(b).size()).append(", this:").append(this).append(", r:").append(k1);
        }
        if (k1 != null)
        {
            k1.a.run();
        }
    }
}
