// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;
import okio.ByteString;
import okio.c;
import okio.d;
import okio.f;
import okio.l;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            b, n, e, ErrorCode, 
//            m

static final class b
    implements b
{

    private final d a;
    private final c b = new c();
    private final d c;
    private final boolean d;
    private boolean e;

    private void a(List list)
        throws IOException
    {
        c.f(list.size());
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            ByteString bytestring = ((e)list.get(i)).h;
            c.f(bytestring.c.length);
            c.b(bytestring);
            bytestring = ((e)list.get(i)).i;
            c.f(bytestring.c.length);
            c.b(bytestring);
        }

        c.flush();
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public final void a(int i, long l1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (l1 != 0L && l1 <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new IllegalArgumentException((new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ")).append(l1).toString());
        a.f(0x80030009);
        a.f(8);
        a.f(i);
        a.f((int)l1);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, ErrorCode errorcode)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        if (errorcode.t == -1)
        {
            throw new IllegalArgumentException();
        }
        a.f(0x80030003);
        a.f(8);
        a.f(0x7fffffff & i);
        a.f(errorcode.t);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, ErrorCode errorcode, byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        if (errorcode.u == -1)
        {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        }
        a.f(0x80030007);
        a.f(8);
        a.f(i);
        a.f(errorcode.u);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(m m1)
    {
    }

    public final void a(boolean flag, int i, int j)
        throws IOException
    {
        boolean flag2 = true;
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag3 = d;
        boolean flag1;
        if ((i & 1) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag3 != flag1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
          goto _L1
_L3:
        if (flag == flag1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new IllegalArgumentException("payload != reply");
        a.f(0x80030006);
        a.f(4);
        a.f(i);
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void a(boolean flag, int i, List list)
        throws IOException
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_27;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int j;
        a(list);
        j = (int)(10L + b.b);
        if (flag)
        {
            flag1 = true;
        }
        a.f(0x80030001);
        a.f(((flag1 | false) & 0xff) << 24 | j & 0xffffff);
        a.f(0x7fffffff & i);
        a.f(0);
        a.g(0);
        a.a(b);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int i, c c1, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_37;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
        if ((long)j <= 0xffffffL)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        throw new IllegalArgumentException((new StringBuilder("FRAME_TOO_LARGE max size is 16Mib: ")).append(j).toString());
        a.f(0x7fffffff & i);
        a.f((i1 & 0xff) << 24 | 0xffffff & j);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        a.a_(c1, j);
        this;
        JVM INSTR monitorexit ;
    }

    public final void b()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void b(m m1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
        int i = Integer.bitCount(m1.a);
        a.f(0x80030004);
        a.f(i * 8 + 4 & 0xffffff | 0);
        a.f(i);
        int j = 0;
_L2:
        if (j > 10)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (m1.a(j))
        {
            int i1 = m1.b(j);
            a.f((i1 & 0xff) << 24 | j & 0xffffff);
            a.f(m1.d[j]);
        }
        break MISSING_BLOCK_LABEL_152;
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int c()
    {
        return 16383;
    }

    public final void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        k.a(a, c);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    rCode(d d1, boolean flag)
    {
        a = d1;
        d = flag;
        d1 = new Deflater();
        d1.setDictionary(n.a);
        c = l.a(new f(b, d1));
    }
}
