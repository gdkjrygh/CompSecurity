// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedList;

public final class ouo
    implements Closeable
{

    private qta a;
    private qti b;
    private LinkedList c;

    ouo()
    {
        c = new LinkedList();
    }

    public transient ouo(qta qta1, qti qti1, Closeable acloseable[])
    {
        c = new LinkedList();
        b = (qti)p.a(qti1);
        a = (qta)p.a(qta1);
        a(acloseable);
    }

    private transient void a(Closeable acloseable[])
    {
        int j = acloseable.length;
        for (int i = 0; i < j; i++)
        {
            Closeable closeable = acloseable[i];
            if (closeable != null)
            {
                c.add(closeable);
            }
        }

    }

    private final void b()
    {
        this;
        JVM INSTR monitorenter ;
_L1:
        Closeable closeable;
        if (c.isEmpty())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        closeable = (Closeable)p.a(c.pop());
        closeable.close();
          goto _L1
        Object obj;
        obj;
        orw.a("Exception while closing resource", ((Throwable) (obj)));
          goto _L1
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    public final bbe a()
    {
        return b.a(a);
    }

    public final void close()
    {
        b();
    }
}
