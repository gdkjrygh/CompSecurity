// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;

public final class oul extends InputStream
{

    private ArrayList a;
    private final ouo b;
    private long c;
    private long d;
    private final long e;
    private byte f[];
    private boolean g;
    private long h;
    private ReadableByteChannel i;

    public oul(ouo ouo1)
    {
        b = ouo1;
        f = new byte[0x989680];
        c = -1L;
        a = new ArrayList();
        h = 0L;
        d = 0L;
        g = false;
        i = null;
        oun oun1 = new oun(this, a, 0x989680L);
        ouo1.a().b(oun1);
        oun1.close();
        p.b(oun1.b);
        e = oun1.a;
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        ouo1 = Pipe.open();
        (new oum(this, b, ouo1.sink())).start();
        i = ouo1.source();
        return;
        ouo1;
        b.close();
        throw ouo1;
    }

    public final int available()
    {
        this;
        JVM INSTR monitorenter ;
        if (!g) goto _L2; else goto _L1
_L1:
        long l;
        long l1;
        l = c;
        l1 = d;
        if (l != l1) goto _L2; else goto _L3
_L3:
        int j = 0;
_L5:
        this;
        JVM INSTR monitorexit ;
        return j;
_L2:
        l = e;
        l1 = d;
        j = (int)(l - l1);
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.close();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        int l;
        int i1;
        p.a(i);
        l = (int)(d / 0x989680L);
        i1 = (int)(d % 0x989680L);
        if (d <= c || g) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = 0;
        j = 0;
_L14:
        if (j >= 0x989680 || k == -1) goto _L4; else goto _L3
_L3:
        k = i.read(ByteBuffer.wrap(f, j, 0x989680 - j));
        if (k != -1) goto _L6; else goto _L5
_L5:
        g = true;
        b.close();
_L4:
        h = 0L;
        k = ((flag) ? 1 : 0);
_L8:
        if (k >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        h = h + (long)(f[k] & 0xff);
        k++;
        if (true) goto _L8; else goto _L7
_L7:
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        long l1 = ((Long)a.get(l)).longValue();
        if (h != l1)
        {
            long l2 = c;
            throw new IOException((new StringBuilder(99)).append("CRC mismatch from MP4Parser stream at buffer index: ").append(l).append(" bufferPosition:").append(l2).toString());
        }
        break MISSING_BLOCK_LABEL_230;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        long l3 = c;
        c = (long)j + l3;
_L2:
        if (d > c) goto _L10; else goto _L9
_L9:
        d = d + 1L;
        j = f[i1];
        j &= 0xff;
_L12:
        this;
        JVM INSTR monitorexit ;
        return j;
_L10:
        if (g && c + 1L < e)
        {
            throw new IOException("End of File found without reaching full data size");
        }
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        j = -1;
        if (true) goto _L12; else goto _L11
_L11:
        throw new IOException("MovieInputStream had issue fetching more data");
_L6:
        j += k;
        if (true) goto _L14; else goto _L13
_L13:
    }
}
