// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

final class ahk
{

    private int a;
    private Object b;
    private final ReentrantLock c = new ReentrantLock(true);
    private final Condition d;

    ahk(ahj ahj)
    {
        a = 0;
        d = c.newCondition();
    }

    public final boolean a(Object obj)
    {
        c.lock();
        if (a == 1)
        {
            try
            {
                d.await();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
        }
        a = 1;
        b = obj;
        c.unlock();
        return true;
    }

    public final void b(Object obj)
    {
        c.lock();
        if (a != 1)
        {
            throw new RuntimeException("Not in IN_USE state");
        }
        if (obj != b)
        {
            throw new RuntimeException("Lock is not owned by this context");
        } else
        {
            a = 0;
            b = null;
            d.signal();
            c.unlock();
            return;
        }
    }
}
