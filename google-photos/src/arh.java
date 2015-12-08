// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

final class arh
{

    final Map a = new HashMap();
    final arj b = new arj();

    arh()
    {
    }

    final void a(ane ane)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = (ari)b.a(a.get(ane), "Argument must not be null");
        if (((ari) (obj)).b <= 0)
        {
            String s = String.valueOf("Cannot release a lock that is not held, key: ");
            ane = String.valueOf(ane);
            int i = ((ari) (obj)).b;
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(ane).length())).append(s).append(ane).append(", interestedThreads: ").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_104;
        ane;
        this;
        JVM INSTR monitorexit ;
        throw ane;
        Object obj1;
        arj arj1;
        obj.b = ((ari) (obj)).b - 1;
        if (((ari) (obj)).b != 0)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        obj1 = (ari)a.remove(ane);
        if (!obj1.equals(obj))
        {
            String s1 = String.valueOf("Removed the wrong lock, expected to remove: ");
            obj = String.valueOf(obj);
            obj1 = String.valueOf(obj1);
            ane = String.valueOf(ane);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 31 + String.valueOf(obj).length() + String.valueOf(obj1).length() + String.valueOf(ane).length())).append(s1).append(((String) (obj))).append(", but actually removed: ").append(((String) (obj1))).append(", key: ").append(ane).toString());
        }
        arj1 = b;
        synchronized (arj1.a)
        {
            if (arj1.a.size() < 10)
            {
                arj1.a.offer(obj1);
            }
        }
        this;
        JVM INSTR monitorexit ;
        ((ari) (obj)).a.unlock();
        return;
        exception;
        ane;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
