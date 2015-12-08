// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.f;
import c.i;
import c.k;
import c.l;
import c.r;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FrameWriter, Spdy3, Header, ErrorCode, 
//            Settings

final class headerBlockBuffer
    implements FrameWriter
{

    private final boolean client;
    private boolean closed;
    private final f headerBlockBuffer = new f();
    private final i headerBlockOut;
    private final i sink;

    private void writeNameValueBlockToBuffer(List list)
    {
        headerBlockOut.g(list.size());
        int i1 = list.size();
        for (int j = 0; j < i1; j++)
        {
            k k1 = ((Header)list.get(j)).name;
            headerBlockOut.g(k1.f());
            headerBlockOut.b(k1);
            k1 = ((Header)list.get(j)).value;
            headerBlockOut.g(k1.f());
            headerBlockOut.b(k1);
        }

        headerBlockOut.flush();
    }

    public void ackSettings(Settings settings1)
    {
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        closed = true;
        Util.closeAll(sink, headerBlockOut);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void connectionPreface()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void data(boolean flag, int j, f f1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        int j1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        sendDataFrame(j, j1, f1, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        throw f1;
    }

    public void flush()
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void goAway(int j, ErrorCode errorcode, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
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
        sink.g(0x80030007);
        sink.g(8);
        sink.g(j);
        sink.g(errorcode.spdyGoAwayCode);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void headers(int j, List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        writeNameValueBlockToBuffer(list);
        int i1 = (int)(headerBlockBuffer.a() + 4L);
        sink.g(0x80030008);
        sink.g(i1 & 0xffffff | 0);
        sink.g(0x7fffffff & j);
        sink.a(headerBlockBuffer);
        this;
        JVM INSTR monitorexit ;
    }

    public int maxDataLength()
    {
        return 16383;
    }

    public void ping(boolean flag, int j, int i1)
    {
        boolean flag2 = true;
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag3 = client;
        boolean flag1;
        if ((j & 1) == 1)
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
        sink.g(0x80030006);
        sink.g(4);
        sink.g(j);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void pushPromise(int j, int i1, List list)
    {
    }

    public void rstStream(int j, ErrorCode errorcode)
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
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
        sink.g(0x80030003);
        sink.g(8);
        sink.g(0x7fffffff & j);
        sink.g(errorcode.spdyRstCode);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    void sendDataFrame(int j, int i1, f f1, int j1)
    {
        if (closed)
        {
            throw new IOException("closed");
        }
        if ((long)j1 > 0xffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("FRAME_TOO_LARGE max size is 16Mib: ").append(j1).toString());
        }
        sink.g(0x7fffffff & j);
        sink.g((i1 & 0xff) << 24 | 0xffffff & j1);
        if (j1 > 0)
        {
            sink.write(f1, j1);
        }
    }

    public void settings(Settings settings1)
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        settings1;
        this;
        JVM INSTR monitorexit ;
        throw settings1;
        int j = settings1.size();
        sink.g(0x80030004);
        sink.g(j * 8 + 4 & 0xffffff | 0);
        sink.g(j);
        int i1 = 0;
_L2:
        if (i1 > 10)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (!settings1.isSet(i1))
        {
            break MISSING_BLOCK_LABEL_151;
        }
        int j1 = settings1.flags(i1);
        sink.g((j1 & 0xff) << 24 | i1 & 0xffffff);
        sink.g(settings1.get(i1));
        break MISSING_BLOCK_LABEL_151;
        sink.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void synReply(boolean flag, int j, List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        writeNameValueBlockToBuffer(list);
        int i1;
        int j1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = (int)(headerBlockBuffer.a() + 4L);
        sink.g(0x80030002);
        sink.g((i1 & 0xff) << 24 | j1 & 0xffffff);
        sink.g(0x7fffffff & j);
        sink.a(headerBlockBuffer);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void synStream(boolean flag, boolean flag1, int j, int i1, List list)
    {
        byte byte0 = 0;
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_29;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int j1;
        writeNameValueBlockToBuffer(list);
        j1 = (int)(10L + headerBlockBuffer.a());
        break MISSING_BLOCK_LABEL_49;
_L2:
        sink.g(0x80030001);
        sink.g(((byte0 | flag2) & 0xff) << 24 | j1 & 0xffffff);
        sink.g(j & 0x7fffffff);
        sink.g(i1 & 0x7fffffff);
        sink.h(0);
        sink.a(headerBlockBuffer);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag2;
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte0 = 2;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void windowUpdate(int j, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
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
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("windowSizeIncrement must be between 1 and 0x7fffffff: ").append(l1).toString());
        sink.g(0x80030009);
        sink.g(8);
        sink.g(j);
        sink.g((int)l1);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    (i j, boolean flag)
    {
        sink = j;
        client = flag;
        j = new Deflater();
        j.setDictionary(Spdy3.DICTIONARY);
        headerBlockOut = r.a(new l(headerBlockBuffer, j));
    }
}
