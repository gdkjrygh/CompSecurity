// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;
import okio.ByteString;

final class gts
    implements gss
{

    private final hci a;
    private final hch b = new hch();
    private final hci c;
    private final boolean d;
    private boolean e;

    gts(hci hci1, boolean flag)
    {
        a = hci1;
        d = flag;
        hci1 = new Deflater();
        hci1.setDictionary(gtq.a);
        c = hcq.a(new hck(b, hci1));
    }

    private void a(List list)
    {
        c.f(list.size());
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            ByteString bytestring = ((gta)list.get(i)).h;
            c.f(bytestring.f());
            c.b(bytestring);
            bytestring = ((gta)list.get(i)).i;
            c.f(bytestring.f());
            c.b(bytestring);
        }

        c.flush();
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public final void a(int i, long l)
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
        if (l != 0L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new IllegalArgumentException((new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ")).append(l).toString());
        a.f(0x80030009);
        a.f(8);
        a.f(i);
        a.f((int)l);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, ErrorCode errorcode)
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
        if (errorcode.spdyRstCode == -1)
        {
            throw new IllegalArgumentException();
        }
        a.f(0x80030003);
        a.f(8);
        a.f(0x7fffffff & i);
        a.f(errorcode.spdyRstCode);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, ErrorCode errorcode, byte abyte0[])
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
        if (errorcode.spdyGoAwayCode == -1)
        {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        }
        a.f(0x80030007);
        a.f(8);
        a.f(i);
        a.f(errorcode.spdyGoAwayCode);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(gtp gtp1)
    {
    }

    public final void a(boolean flag, int i, int j)
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

    public final void a(boolean flag, int i, hch hch1, int j)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_37;
        hch1;
        this;
        JVM INSTR monitorexit ;
        throw hch1;
        if ((long)j <= 0xffffffL)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        throw new IllegalArgumentException((new StringBuilder("FRAME_TOO_LARGE max size is 16Mib: ")).append(j).toString());
        a.f(0x7fffffff & i);
        a.f((k & 0xff) << 24 | 0xffffff & j);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        a.a_(hch1, j);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int i, List list)
    {
        int j = 0;
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
        int k;
        a(list);
        k = (int)(10L + b.b);
        if (flag)
        {
            j = 1;
        }
        a.f(0x80030001);
        a.f((j & 0xff) << 24 | k & 0xffffff);
        a.f(0x7fffffff & i);
        a.f(0);
        a.g(0);
        a.a(b);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void b()
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

    public final void b(gtp gtp1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        gtp1;
        this;
        JVM INSTR monitorexit ;
        throw gtp1;
        int i = Integer.bitCount(gtp1.a);
        a.f(0x80030004);
        a.f((i << 3) + 4 & 0xffffff | 0);
        a.f(i);
        int j = 0;
_L2:
        if (j > 10)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (gtp1.a(j))
        {
            int k = gtp1.b(j);
            a.f((k & 0xff) << 24 | j & 0xffffff);
            a.f(gtp1.d[j]);
        }
        break MISSING_BLOCK_LABEL_151;
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
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        gsp.a(a, c);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
