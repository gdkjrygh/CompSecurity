// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dq;

import java.util.Vector;
import p.dm.d;
import p.dm.f;
import p.dm.g;
import p.dm.i;
import p.dm.m;

// Referenced classes of package p.dq:
//            c, d

public class b extends Thread
{

    private Vector a;
    private c b;
    private boolean c;

    public b(c c1)
    {
        a = new Vector();
        c = false;
        b = c1;
        c1 = c1.getClass().getSimpleName();
        setName((new StringBuilder()).append(getClass().getSimpleName()).append("$").append(c1.substring(c1.lastIndexOf('.') + 1)).toString());
    }

    private f d()
        throws InterruptedException
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_22;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        for (; a.isEmpty(); wait()) { }
        f f1;
        f1 = (f)a.firstElement();
        a.removeElementAt(0);
        this;
        JVM INSTR monitorexit ;
        return f1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        interrupt();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(String s)
    {
        if (b != null)
        {
            b.b(s);
        }
    }

    public void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f1 != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        b("FrameDispatcher ignoring null frame");
          goto _L1
        f1;
        throw f1;
        a.addElement(f1);
        notify();
          goto _L1
    }

    protected void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.removeAllElements();
        a = null;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b(String s)
    {
        if (b != null)
        {
            b.a(s);
        }
    }

    protected void c()
    {
        if (b != null)
        {
            b.g();
        }
    }

    public void run()
    {
        m.m("PANDORALINK [FrameDispatcher] THREAD STARTED");
_L2:
        Object obj;
        if (c || a == null || b == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj = b.g;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        b();
        m.m("PANDORALINK [FrameDispatcher] THREAD STOPPED");
        return;
        boolean flag = b.g.E();
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = d();
        if (b.g.Z() && (obj instanceof d))
        {
            b.g.a(((d)obj).b());
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_197;
        obj;
        a((new StringBuilder()).append("drop bad frames on the floor ").append(((i) (obj)).getMessage()).toString());
        m.c((new StringBuilder()).append(b.h()).append(" drop bad frames on the floor ").toString(), ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        b();
        m.m("PANDORALINK [FrameDispatcher] THREAD STOPPED");
        throw obj;
        obj;
        b("FrameDispatcher thread interrupted");
        continue; /* Loop/switch isn't completed */
        b.g.a(((f) (obj)));
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        StringBuilder stringbuilder = (new StringBuilder()).append("Irrecoverable error processing frame ");
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((f) (obj)).a(g.c);
_L3:
        a(stringbuilder.append(((String) (obj))).append(", shutting down PandoraLink connection [Error: ").append(exception).append("]").toString());
        exception.printStackTrace();
        c();
        if (true) goto _L2; else goto _L1
_L1:
        obj = "";
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }
}
