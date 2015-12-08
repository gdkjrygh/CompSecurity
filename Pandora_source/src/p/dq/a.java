// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dq;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;
import p.dm.d;
import p.dm.e;
import p.dm.f;
import p.dm.g;
import p.dm.m;

// Referenced classes of package p.dq:
//            c

public class a extends Thread
{

    protected byte a;
    private boolean b;
    private Vector c;
    private Vector d;
    private p.dn.a e;
    private Object f;
    private Object g;
    private int h;
    private c i;
    private int j;
    private boolean k;
    private String l;

    public a(c c1, int i1, boolean flag)
    {
        b = false;
        c = new Vector();
        d = new Vector();
        e = null;
        f = new Object();
        g = new Object();
        h = 0;
        a = 0;
        i = null;
        j = 0;
        k = true;
        c = new Vector();
        e = null;
        h = 0;
        a = 0;
        i = c1;
        j = i1;
        k = flag;
        l = "[Pandora --> Device]";
        setName(getClass().getSimpleName());
    }

    private void a(byte abyte0[])
        throws IOException
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        OutputStream outputstream = f();
        if (!b && outputstream != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (-1 != j)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        outputstream.write(abyte0, 0, abyte0.length);
        outputstream.flush();
        obj;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        int k1 = j;
        int i1 = 0;
_L3:
        if (i1 >= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (i1 + k1 >= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        int j1 = k1;
_L1:
        outputstream.write(abyte0, i1, j1);
        outputstream.flush();
        i1 += k1;
        continue; /* Loop/switch isn't completed */
        j1 = abyte0.length - i1;
          goto _L1
        obj;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void e()
    {
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        OutputStream outputstream = f();
        Exception exception;
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            catch (Exception exception2) { }
            finally { }
        }
        f.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        synchronized (g)
        {
            if (c != null)
            {
                c.removeAllElements();
                c = null;
            }
            if (d != null)
            {
                d.removeAllElements();
                d = null;
            }
            e = null;
            g.notifyAll();
        }
        i = null;
        return;
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private OutputStream f()
    {
        if (i != null)
        {
            return i.b;
        } else
        {
            return null;
        }
    }

    public void a()
    {
        synchronized (g)
        {
            if (c != null)
            {
                c.removeAllElements();
            }
            if (d != null)
            {
                d.removeAllElements();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(byte byte0)
    {
label0:
        {
            synchronized (g)
            {
                if (!b)
                {
                    break label0;
                }
            }
            return;
        }
        if (byte0 != a)
        {
            a = byte0;
            if (i.f != -1)
            {
                a = (byte)i.f;
                i.f = -1;
            }
            e = null;
            g.notify();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Class class1)
    {
label0:
        {
            synchronized (g)
            {
                if (d != null)
                {
                    break label0;
                }
            }
            return;
        }
        int i1 = d.size() - 1;
_L2:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (d.elementAt(i1).getClass().equals(class1))
        {
            d.removeElementAt(i1);
        }
        break MISSING_BLOCK_LABEL_68;
        obj;
        JVM INSTR monitorexit ;
        return;
        class1;
        obj;
        JVM INSTR monitorexit ;
        throw class1;
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(String s)
    {
        if (i != null)
        {
            i.b(s);
        }
    }

    protected void a(String s, f f1, byte abyte0[])
    {
        if (i != null)
        {
            f1.c = abyte0;
            i.b(s, f1);
        }
    }

    protected void a(p.dm.a a1)
        throws IOException
    {
        if (b || f() == null)
        {
            return;
        } else
        {
            byte abyte0[] = p.dq.c.b(a1);
            a(l, ((f) (a1)), abyte0);
            a(abyte0);
            return;
        }
    }

    protected void a(p.dn.a a1)
        throws IOException
    {
        byte abyte0[] = p.dq.c.a(a, a1);
        a(l, ((f) (new d(a, a1))), abyte0);
        a(abyte0);
    }

    public void a(p.dn.a a1, boolean flag)
    {
label0:
        {
            synchronized (g)
            {
                if (!b && c != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        int i1 = c.size() - 1;
_L6:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        if (c.elementAt(i1).getClass().equals(a1.getClass()))
        {
            c.removeElementAt(i1);
        }
          goto _L4
_L2:
        c.addElement(a1);
        if (e == null)
        {
            g.notify();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
_L4:
        i1--;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void b(String s)
    {
        if (i != null)
        {
            i.a(s);
        }
    }

    public void b(p.dn.a a1, boolean flag)
    {
label0:
        {
            synchronized (g)
            {
                if (!b && d != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        int i1 = d.size() - 1;
_L6:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        if (d.elementAt(i1).getClass().equals(a1.getClass()))
        {
            d.removeElementAt(i1);
        }
          goto _L4
_L2:
        d.addElement(a1);
        if (e == null)
        {
            g.notify();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
_L4:
        i1--;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean b()
    {
        boolean flag;
label0:
        {
            flag = false;
            synchronized (g)
            {
                if (d != null)
                {
                    break label0;
                }
            }
            return false;
        }
        if (d.size() <= 25)
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        synchronized (f)
        {
            b = true;
            f.notifyAll();
        }
        synchronized (g)
        {
            b = true;
            g.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    protected void d()
    {
        if (i != null)
        {
            i.g();
        }
    }

    public void run()
    {
_L11:
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!b && c != null && d != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        e();
        return;
        if (e != null || c.size() <= 0) goto _L2; else goto _L1
_L1:
        h = 0;
        e = (p.dn.a)c.elementAt(0);
        c.removeElementAt(0);
_L8:
        if (e == null) goto _L4; else goto _L3
_L3:
        if (h < 10) goto _L6; else goto _L5
_L5:
        a((new StringBuilder()).append("exhausted 10 command retries, notify lost connection. command=").append(e.a(g.c)).toString());
        d();
        obj;
        JVM INSTR monitorexit ;
        e();
        return;
_L2:
        if (e != null || d.size() <= 0) goto _L8; else goto _L7
_L7:
        Object obj1;
        h = 0;
        e = (p.dn.a)d.elementAt(0);
        d.removeElementAt(0);
          goto _L8
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        StringBuilder stringbuilder;
        stringbuilder = (new StringBuilder()).append("Error writing command - notifyLostConnection. command: ");
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        obj = e.a(g.c);
_L9:
        b(stringbuilder.append(((String) (obj))).toString());
        if (m.bg.a(e.b))
        {
            ((Exception) (obj1)).printStackTrace();
        }
        d();
        e();
        return;
_L6:
        a(e);
        h = h + 1;
_L4:
        boolean flag = k;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        Exception exception;
        int i1;
        if (e != null)
        {
            i1 = 750;
        } else
        {
            i1 = 0;
        }
        try
        {
            g.wait(i1);
        }
        catch (InterruptedException interruptedexception1) { }
        obj;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        e = null;
        if (c.size() != 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        i1 = d.size();
        if (i1 == 0)
        {
            try
            {
                g.wait();
            }
            catch (InterruptedException interruptedexception) { }
            finally { }
        }
        break MISSING_BLOCK_LABEL_312;
        obj = "";
          goto _L9
        exception;
        e();
        throw exception;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
