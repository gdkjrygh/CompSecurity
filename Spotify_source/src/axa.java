// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.transport.TCPTransport;
import com.ford.syncV4.transport.TransportType;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class axa
    implements asu, axm
{

    public axo a;
    public ass b;
    awz c;
    Object d;
    Object e;
    public Object f;
    public CopyOnWriteArrayList g;

    public axa(axl axl1)
    {
        a = null;
        b = null;
        c = null;
        d = new Object();
        e = new Object();
        f = new Object();
        g = new CopyOnWriteArrayList();
        c = new axb(this, (byte)0);
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            if (a.a.booleanValue())
            {
                a.b();
            }
            a = null;
        }
        if (axl1.a() != TransportType.a) goto _L2; else goto _L1
_L1:
        a = new axh(this, ((axk)axl1).a);
_L4:
        synchronized (e)
        {
            if (b != null)
            {
                b = null;
            }
            b = new asx(this);
        }
        return;
_L2:
        if (axl1.a() != TransportType.b) goto _L4; else goto _L3
_L3:
        a = new TCPTransport((axq)axl1, this);
          goto _L4
        axl1;
        obj;
        JVM INSTR monitorexit ;
        throw axl1;
        exception;
        axl1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Boolean a()
    {
        if (a == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return a.a;
        }
    }

    public final void a(byte byte0)
    {
        axc axc1;
        for (axc1 = c(byte0); axc1 == null || axc1.e == null;)
        {
            return;
        }

        axc1.e.d();
    }

    public final void a(asw asw)
    {
        c.a(asw);
    }

    public final void a(atc atc1, byte byte0, byte byte1, String s)
    {
        c.a(atc1, byte0, byte1, s);
    }

    public final void a(atc atc1, byte byte0, String s)
    {
        c.a(atc1, byte0, s);
    }

    public final void a(String s)
    {
        c.a(s);
    }

    public final void a(String s, Exception exception)
    {
        c.b(s, exception);
    }

    public final void a(byte abyte0[], int i)
    {
        synchronized (e)
        {
            if (b != null)
            {
                b.a(abyte0, i);
            }
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final void a(byte abyte0[], int i, int j)
    {
        synchronized (d)
        {
            if (a != null)
            {
                a.b(abyte0, i, j);
            }
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final void b()
    {
        synchronized (e)
        {
            if (b != null)
            {
                b.a(atc.b);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(byte byte0)
    {
        axc axc1;
        for (axc1 = c(byte0); axc1 == null || axc1.e == null;)
        {
            return;
        }

        axc1.e.c();
    }

    public final void b(String s, Exception exception)
    {
        c.a(s, exception);
    }

    final axc c(byte byte0)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            axc axc1 = (axc)iterator.next();
            if (axc1.c == byte0)
            {
                return axc1;
            }
        }

        return null;
    }

    public final void c()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            Iterator iterator = g.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((axc)iterator.next()).c == 0)
                {
                    b();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }
}
