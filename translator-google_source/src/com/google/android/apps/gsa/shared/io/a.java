// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.android.apps.gsa.shared.util.e;
import com.google.common.base.p;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            b

public final class a
{

    public static final a a = new a();
    public final int b;
    private final Object c;
    private b d;
    private ByteBuffer e;
    private final IOException f;
    private volatile RuntimeException g;

    private a()
    {
        c = new Object();
        b = 3;
        d = null;
        e = null;
        f = null;
    }

    a(b b1, ByteBuffer bytebuffer)
    {
        c = new Object();
        b = 1;
        d = (b)p.a(b1);
        e = (ByteBuffer)p.a(bytebuffer);
        p.a(com.google.android.apps.gsa.shared.io.b.c(e));
        boolean flag;
        if (e.position() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(e.hasRemaining());
        f = null;
    }

    public a(IOException ioexception)
    {
        c = new Object();
        b = 2;
        d = null;
        e = null;
        f = (IOException)p.a(ioexception);
    }

    public final int a(ByteBuffer bytebuffer)
    {
        boolean flag = true;
        int i;
        if (b != 1)
        {
            flag = false;
        }
        p.b(flag);
        synchronized (c)
        {
            i = com.google.android.apps.gsa.shared.util.e.a(e, bytebuffer);
        }
        return i;
        bytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw bytebuffer;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        Object obj;
        switch (b)
        {
        default:
            i = b;
            throw new AssertionError((new StringBuilder(34)).append("Unexpected chunk type: ").append(i).toString());

        case 3: // '\003'
            return -1;

        case 2: // '\002'
            throw f;

        case 1: // '\001'
            obj = c;
            break;
        }
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Chunk already released.");
        j = Math.min(e.remaining(), j);
        e.get(abyte0, i, j);
        obj;
        JVM INSTR monitorexit ;
        return j;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final void a()
    {
        boolean flag1;
        flag1 = true;
        if (b != 1)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        ByteBuffer bytebuffer;
        b b1;
        boolean flag;
        if (e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (d != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag);
        bytebuffer = e;
        b1 = d;
        e = null;
        d = null;
        obj;
        JVM INSTR monitorexit ;
        b1.b(bytebuffer);
        g = null;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final IOException b()
    {
        boolean flag;
        if (b == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        return f;
    }

    public final int c()
    {
        boolean flag = false;
        b;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 66
    //                   2 107
    //                   3 107;
           goto _L1 _L2 _L3 _L3
_L1:
        int i = b;
        throw new AssertionError((new StringBuilder(34)).append("Unexpected chunk type: ").append(i).toString());
_L2:
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            flag = true;
        }
        int j;
        p.b(flag, "Chunk already released.");
        j = e.remaining();
        obj;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        return 0;
    }

    protected final void finalize()
    {
        super.finalize();
    }

    public final String toString()
    {
        Object obj1;
        switch (b)
        {
        default:
            return "Chunk(unknown type)";

        case 3: // '\003'
            return "Chunk(EOF)";

        case 2: // '\002'
            String s = String.valueOf(f);
            return (new StringBuilder(String.valueOf(s).length() + 7)).append("Chunk(").append(s).append(")").toString();

        case 1: // '\001'
            obj1 = c;
            break;
        }
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj = String.format(Locale.US, "Chunk(pos=%d, remaining=%d)", new Object[] {
            Integer.valueOf(e.position()), Integer.valueOf(e.remaining())
        });
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = "Chunk(released)";
          goto _L1
    }

}
