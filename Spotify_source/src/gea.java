// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.spotify.mobile.android.util.Assertion;

public final class gea
{

    private int a;
    private final Object b = new Object();

    public gea()
    {
        a = 1;
    }

    private boolean c()
    {
        boolean flag = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            while (a != 1) 
            {
                b.wait();
            }
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (a != 1)
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int a()
    {
        int i;
        synchronized (b)
        {
            i = a;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        synchronized (b)
        {
            a = i;
            b.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b()
    {
        Object obj;
        Object obj1;
        long l;
        long l1;
        boolean flag;
        if (4000L >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, "Seriously, no negative timeouts, ok?");
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (4000L != 0L)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        flag = c();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        l = SystemClock.elapsedRealtime() + 4000L;
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        flag = c();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L2:
        if (a == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = SystemClock.elapsedRealtime();
        if (l <= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = l - SystemClock.elapsedRealtime();
        if (l1 > 0L)
        {
            try
            {
                b.wait(l1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            finally { }
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (a == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    public final String toString()
    {
        switch (a)
        {
        default:
            return "INVALID";

        case 0: // '\0'
            return "STOPPING";

        case 1: // '\001'
            return "STOPPED";

        case 2: // '\002'
            return "STARTING";

        case 3: // '\003'
            return "STARTED";
        }
    }
}
