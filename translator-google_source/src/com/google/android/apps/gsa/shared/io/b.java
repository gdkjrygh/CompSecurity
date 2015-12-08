// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.android.apps.gsa.shared.util.debug.a.a;
import com.google.common.base.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            a

public final class b
    implements a
{

    public static final int a = 32768;
    private final Object b = new Object();
    private final Object c = new Object();
    private final Queue d = new ArrayDeque();
    private final Queue e = new ArrayDeque();
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicInteger m = new AtomicInteger(0);
    private final AtomicInteger n = new AtomicInteger(0);
    private final AtomicInteger o = new AtomicInteger(0);

    public b()
    {
    }

    static boolean c(ByteBuffer bytebuffer)
    {
        return bytebuffer.isDirect();
    }

    public final com.google.android.apps.gsa.shared.io.a a(InputStream inputstream)
    {
        ByteBuffer bytebuffer;
        boolean flag;
        flag = false;
        bytebuffer = a();
        if (!bytebuffer.hasArray()) goto _L2; else goto _L1
_L1:
        int j1 = inputstream.read(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
        int i1;
        i1 = j1;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        bytebuffer.position(bytebuffer.position() + j1);
        i1 = j1;
_L5:
        if (i1 <= 0) goto _L4; else goto _L3
_L3:
        inputstream = a(bytebuffer);
_L8:
        byte abyte0[];
label0:
        {
            if (inputstream != null)
            {
                abyte0 = inputstream;
                if (((com.google.android.apps.gsa.shared.io.a) (inputstream)).b == 1)
                {
                    break label0;
                }
            }
            b(bytebuffer);
            abyte0 = inputstream;
        }
_L6:
        o.incrementAndGet();
        return abyte0;
_L2:
        abyte0 = b();
        i1 = inputstream.read(abyte0, 0, abyte0.length);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        bytebuffer.put(abyte0, 0, i1);
        a(abyte0);
          goto _L5
_L7:
        inputstream = new com.google.android.apps.gsa.shared.io.a(inputstream);
        abyte0 = inputstream;
        if (((com.google.android.apps.gsa.shared.io.a) (inputstream)).b != 1)
        {
            b(bytebuffer);
            abyte0 = inputstream;
        }
          goto _L6
        inputstream;
        try
        {
            a(abyte0);
            throw inputstream;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        finally
        {
            if (true) goto _L0; else goto _L0
        }
          goto _L7
        throw new NullPointerException();
        b(bytebuffer);
        throw inputstream;
_L4:
        if (i1 == -1)
        {
            flag = true;
        }
        p.b(flag, "Unexpected number of bytes read: %s", new Object[] {
            Integer.valueOf(i1)
        });
        inputstream = com.google.android.apps.gsa.shared.io.a.a;
          goto _L8
    }

    public final com.google.android.apps.gsa.shared.io.a a(ByteBuffer bytebuffer)
    {
        boolean flag1 = true;
        p.a(bytebuffer.isDirect());
        boolean flag;
        if (bytebuffer.position() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (bytebuffer.limit() == a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        bytebuffer.flip();
        n.incrementAndGet();
        return new com.google.android.apps.gsa.shared.io.a(this, bytebuffer);
    }

    public final ByteBuffer a()
    {
        boolean flag1 = true;
        ByteBuffer bytebuffer;
        synchronized (b)
        {
            bytebuffer = (ByteBuffer)d.poll();
        }
        obj = bytebuffer;
        if (bytebuffer == null)
        {
            obj = ByteBuffer.allocateDirect(a);
        }
        p.b(((ByteBuffer) (obj)).isDirect());
        boolean flag;
        if (((ByteBuffer) (obj)).capacity() == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (((ByteBuffer) (obj)).position() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (((ByteBuffer) (obj)).limit() == a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag);
        f.incrementAndGet();
        return ((ByteBuffer) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(byte abyte0[])
    {
        if (abyte0.length != a)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (e.size() >= 4)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        e.add(abyte0);
        k.incrementAndGet();
_L2:
        return;
        l.incrementAndGet();
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        m.incrementAndGet();
        return;
    }

    public final void b(ByteBuffer bytebuffer)
    {
        if (bytebuffer.capacity() != a || !bytebuffer.isDirect())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        bytebuffer.clear();
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (d.size() >= 28)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        d.add(bytebuffer);
        g.incrementAndGet();
_L2:
        return;
        h.incrementAndGet();
        if (true) goto _L2; else goto _L1
_L1:
        bytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw bytebuffer;
        i.incrementAndGet();
        return;
    }

    public final byte[] b()
    {
        byte abyte1[];
        synchronized (c)
        {
            abyte1 = (byte[])e.poll();
        }
        abyte0 = abyte1;
        if (abyte1 == null)
        {
            abyte0 = new byte[a];
        }
        boolean flag;
        if (abyte0.length == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        j.incrementAndGet();
        return abyte0;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
