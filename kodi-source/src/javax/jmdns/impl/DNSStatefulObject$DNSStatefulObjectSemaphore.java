// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package javax.jmdns.impl:
//            DNSStatefulObject

public static final class _name
{

    private static Logger logger = Logger.getLogger(javax/jmdns/impl/DNSStatefulObject$DNSStatefulObjectSemaphore.getName());
    private final String _name;
    private final ConcurrentMap _semaphores = new ConcurrentHashMap(50);

    public void signalEvent()
    {
        Collection collection = _semaphores.values();
        Semaphore semaphore;
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); collection.remove(semaphore))
        {
            semaphore = (Semaphore)iterator.next();
            semaphore.release();
        }

    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(1000);
        stringbuilder.append("Semaphore: ");
        stringbuilder.append(_name);
        if (_semaphores.size() == 0)
        {
            stringbuilder.append(" no semaphores.");
        } else
        {
            stringbuilder.append(" semaphores:\n");
            Iterator iterator = _semaphores.keySet().iterator();
            while (iterator.hasNext()) 
            {
                Thread thread = (Thread)iterator.next();
                stringbuilder.append("\tThread: ");
                stringbuilder.append(thread.getName());
                stringbuilder.append(' ');
                stringbuilder.append(_semaphores.get(thread));
                stringbuilder.append('\n');
            }
        }
        return stringbuilder.toString();
    }

    public void waitForEvent(long l)
    {
        Object obj = Thread.currentThread();
        if ((Semaphore)_semaphores.get(obj) == null)
        {
            Semaphore semaphore = new Semaphore(1, true);
            semaphore.drainPermits();
            _semaphores.putIfAbsent(obj, semaphore);
        }
        obj = (Semaphore)_semaphores.get(obj);
        try
        {
            ((Semaphore) (obj)).tryAcquire(l, TimeUnit.MILLISECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            logger.log(Level.FINER, "Exception ", interruptedexception);
        }
    }


    public (String s)
    {
        _name = s;
    }
}
