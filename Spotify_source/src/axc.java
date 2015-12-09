// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class axc
    implements atf, awz
{

    public static CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public axa b;
    public byte c;
    public axl d;
    public ate e;
    public ath f;
    private awz g;

    private axc()
    {
        b = null;
        e = null;
        f = new ath();
    }

    public static axa a(axl axl1)
    {
        axa axa1 = null;
        int i = 0;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            axa axa2 = (axa)iterator.next();
            if (axa2.a.c() == axl1.a() && (i == 0 || i >= axa2.g.size()))
            {
                i = axa2.g.size();
                axa1 = axa2;
            }
        } while (true);
        return axa1;
    }

    public static axc a(awz awz1, axl axl1)
    {
        axc axc1 = new axc();
        axc1.g = awz1;
        axc1.d = axl1;
        return axc1;
    }

    public final void a()
    {
        Log.d("SyncSession", "Asked to send heartbeat");
        if (b != null)
        {
            axa axa1 = b;
            if (axa1.b != null && this != null)
            {
                axa1.b.a(c);
            }
        }
    }

    public final void a(byte byte0)
    {
        g.a(byte0);
    }

    public final void a(asw asw)
    {
        g.a(asw);
    }

    public final void a(atc atc1, byte byte0, byte byte1, String s)
    {
        c = byte0;
        f.a();
        g.a(atc1, byte0, byte1, s);
        if (e != null)
        {
            e.a();
        }
    }

    public final void a(atc atc1, byte byte0, String s)
    {
        g.a(atc1, byte0, s);
    }

    public final void a(String s)
    {
        g.a(s);
    }

    public final void a(String s, Exception exception)
    {
        g.a(s, exception);
    }

    public final void b()
    {
        if (b != null)
        {
            b.c.a(c);
        }
        c();
    }

    public final void b(String s, Exception exception)
    {
        g.b(s, exception);
    }

    public final void c()
    {
        axa axa1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        axa1 = b;
        Object obj = axa1.f;
        obj;
        JVM INSTR monitorenter ;
        axa1.g.remove(this);
        byte byte0;
        Object obj1;
        boolean flag;
        if (axa1.g.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte0 = c;
        obj1 = axa1.e;
        obj1;
        JVM INSTR monitorenter ;
        if (axa1.b == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (axa1.a != null && axa1.a.a.booleanValue())
        {
            axa1.b.a(atc.b, byte0);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        axa1.b = null;
        obj1;
        JVM INSTR monitorexit ;
        obj1 = axa1.d;
        obj1;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (axa1.a != null)
        {
            axa1.a.b();
        }
        axa1.a = null;
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        if (b.g.size() == 0)
        {
            a.remove(b);
        }
        b = null;
        return;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean d()
    {
        while (b == null || b == null || !b.a().booleanValue()) 
        {
            return false;
        }
        return true;
    }

}
