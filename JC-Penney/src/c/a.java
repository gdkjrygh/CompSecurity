// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.InterruptedIOException;

// Referenced classes of package c:
//            ae, d, b, c, 
//            ac, ad

public class a extends ae
{

    private static a head;
    private boolean inQueue;
    private a next;
    private long timeoutAt;

    public a()
    {
    }

    private static a awaitTimeout()
    {
        Object obj = null;
        c/a;
        JVM INSTR monitorenter ;
        a a1 = head.next;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        c/a.wait();
_L4:
        c/a;
        JVM INSTR monitorexit ;
        return ((a) (obj));
_L2:
        long l = a1.remainingNanos(System.nanoTime());
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        long l1 = l / 0xf4240L;
        c/a.wait(l1, (int)(l - 0xf4240L * l1));
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        head.next = a1.next;
        a1.next = null;
        obj = a1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean cancelScheduledTimeout(a a1)
    {
        c/a;
        JVM INSTR monitorenter ;
        a a2 = head;
_L8:
        if (a2 == null) goto _L2; else goto _L1
_L1:
        if (a2.next != a1) goto _L4; else goto _L3
_L3:
        a2.next = a1.next;
        a1.next = null;
        boolean flag = false;
_L6:
        c/a;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        a2 = a2.next;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        a1;
        throw a1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private long remainingNanos(long l)
    {
        return timeoutAt - l;
    }

    private static void scheduleTimeout(a a1, long l, boolean flag)
    {
        c/a;
        JVM INSTR monitorenter ;
        long l1;
        if (head == null)
        {
            head = new a();
            (new d()).start();
        }
        l1 = System.nanoTime();
        if (l == 0L || !flag) goto _L2; else goto _L1
_L1:
        a1.timeoutAt = Math.min(l, a1.deadlineNanoTime() - l1) + l1;
_L3:
        l = a1.remainingNanos(l1);
        for (a a2 = head; a2.next != null && l >= a2.next.remainingNanos(l1); a2 = a2.next)
        {
            break MISSING_BLOCK_LABEL_175;
        }

        a1.next = a2.next;
        a2.next = a1;
        if (a2 == head)
        {
            c/a.notify();
        }
        c/a;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        a1.timeoutAt = l1 + l;
          goto _L3
        a1;
        throw a1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        a1.timeoutAt = a1.deadlineNanoTime();
          goto _L3
        throw new AssertionError();
    }

    public final void enter()
    {
        if (inQueue)
        {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long l = timeoutNanos();
        boolean flag = hasDeadline();
        if (l == 0L && !flag)
        {
            return;
        } else
        {
            inQueue = true;
            scheduleTimeout(this, l, flag);
            return;
        }
    }

    final IOException exit(IOException ioexception)
    {
        if (!exit())
        {
            return ioexception;
        } else
        {
            return newTimeoutException(ioexception);
        }
    }

    final void exit(boolean flag)
    {
        if (exit() && flag)
        {
            throw newTimeoutException(null);
        } else
        {
            return;
        }
    }

    public final boolean exit()
    {
        if (!inQueue)
        {
            return false;
        } else
        {
            inQueue = false;
            return cancelScheduledTimeout(this);
        }
    }

    protected IOException newTimeoutException(IOException ioexception)
    {
        InterruptedIOException interruptedioexception = new InterruptedIOException("timeout");
        if (ioexception != null)
        {
            interruptedioexception.initCause(ioexception);
        }
        return interruptedioexception;
    }

    public final ac sink(ac ac)
    {
        return new b(this, ac);
    }

    public final ad source(ad ad)
    {
        return new c(this, ad);
    }

    protected void timedOut()
    {
    }

}
