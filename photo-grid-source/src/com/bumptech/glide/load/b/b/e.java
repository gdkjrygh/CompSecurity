// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import com.bumptech.glide.load.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            g, f

final class e
{

    private final Map a = new HashMap();
    private final g b = new g((byte)0);

    e()
    {
    }

    final void a(c c)
    {
        this;
        JVM INSTR monitorenter ;
        f f2 = (f)a.get(c);
        f f1;
        f1 = f2;
        if (f2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        f1 = b.a();
        a.put(c, f1);
        f1.b = f1.b + 1;
        this;
        JVM INSTR monitorexit ;
        f1.a.lock();
        return;
        c;
        this;
        JVM INSTR monitorexit ;
        throw c;
    }

    final void b(c c)
    {
        this;
        JVM INSTR monitorenter ;
        f f1 = (f)a.get(c);
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (f1.b > 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        c = (new StringBuilder("Cannot release a lock that is not held, key: ")).append(c).append(", interestedThreads: ");
        int i;
        if (f1 != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        i = 0;
_L1:
        throw new IllegalArgumentException(c.append(i).toString());
        c;
        this;
        JVM INSTR monitorexit ;
        throw c;
        i = f1.b;
          goto _L1
        i = f1.b - 1;
        f1.b = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        f f2 = (f)a.remove(c);
        if (!f2.equals(f1))
        {
            throw new IllegalStateException((new StringBuilder("Removed the wrong lock, expected to remove: ")).append(f1).append(", but actually removed: ").append(f2).append(", key: ").append(c).toString());
        }
        b.a(f2);
        this;
        JVM INSTR monitorexit ;
        f1.a.unlock();
        return;
    }
}
