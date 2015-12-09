// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.do;

import java.util.Vector;
import p.dm.m;

public class b extends Thread
{
    class a
    {

        String a;
        int b;
        final b c;

        public a(String s, int i)
        {
            c = b.this;
            super();
            a = s;
            b = i;
        }
    }


    Vector a;
    Vector b;
    Vector c;
    m d;

    public b(m m1)
    {
        d = m1;
        a = new Vector();
        b = new Vector();
        c = new Vector();
        setName(getClass().getSimpleName());
    }

    private boolean a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Vector vector = a;
        if (vector != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = a.contains(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    private a b()
        throws InterruptedException
    {
        this;
        JVM INSTR monitorenter ;
_L4:
        if (b == null) goto _L2; else goto _L1
_L1:
        Object obj = a;
        if (obj != null) goto _L3; else goto _L2
_L2:
        obj = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((a) (obj));
_L3:
        String s;
        if (b.isEmpty())
        {
            wait();
        }
        if (!b.isEmpty())
        {
            s = (String)b.firstElement();
            if (!a.contains(s))
            {
                break MISSING_BLOCK_LABEL_82;
            }
            wait();
        }
          goto _L4
        obj;
        throw obj;
        obj = (a)c.firstElement();
        b.removeElementAt(0);
        c.removeElementAt(0);
        a.addElement(s);
          goto _L5
    }

    private void b(String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        Vector vector = c;
        if (vector != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        b.addElement(s);
        c.addElement(new a(s, i));
        notify();
        if (true) goto _L2; else goto _L4
_L4:
        s;
        throw s;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.removeAllElements();
            a = null;
        }
        if (b != null)
        {
            b.removeAllElements();
            b = null;
        }
        if (c != null)
        {
            c.removeAllElements();
            c = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void c(String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
        Vector vector = a;
        if (vector != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.addElement(s);
        notify();
        d.b(s, i);
        a.removeElement(s);
        notify();
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        interrupt();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s, int i)
    {
        if (a(s))
        {
            b(s, i);
            return;
        } else
        {
            c(s, i);
            return;
        }
    }

    public void run()
    {
        Exception exception;
        do
        {
            a a1;
            do
            {
                a1 = b();
            } while (a1 == null);
            try
            {
                d.b(a1.a, a1.b);
            }
            catch (InterruptedException interruptedexception)
            {
                c();
                m.m("PANDORALINK [ReturnTrackAlbumArtWorker] THREAD STOPPED");
                return;
            }
            finally
            {
                c();
            }
        } while (true);
        m.m("PANDORALINK [ReturnTrackAlbumArtWorker] THREAD STOPPED");
        throw exception;
    }
}
