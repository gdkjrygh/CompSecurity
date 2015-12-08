// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Okio;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameWriter, Spdy3, Header, ErrorCode, 
//            Settings

final class headerBlockBuffer
    implements FrameWriter
{

    private final boolean client;
    private boolean closed;
    private final Buffer headerBlockBuffer = new Buffer();
    private final BufferedSink headerBlockOut;
    private final BufferedSink sink;

    private void writeNameValueBlockToBuffer(List list)
    {
        if (headerBlockBuffer.size() != 0L)
        {
            throw new IllegalStateException();
        }
        headerBlockOut.writeInt(list.size());
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            ByteString bytestring = ((Header)list.get(i)).name;
            headerBlockOut.writeInt(bytestring.size());
            headerBlockOut.write(bytestring);
            bytestring = ((Header)list.get(i)).value;
            headerBlockOut.writeInt(bytestring.size());
            headerBlockOut.write(bytestring);
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

    public void data(boolean flag, int i, Buffer buffer, int j)
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
        sendDataFrame(i, k, buffer, j);
        this;
        JVM INSTR monitorexit ;
        return;
        buffer;
        throw buffer;
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

    public void goAway(int i, ErrorCode errorcode, byte abyte0[])
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
        sink.writeInt(0x80030007);
        sink.writeInt(8);
        sink.writeInt(i);
        sink.writeInt(errorcode.spdyGoAwayCode);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void headers(int i, List list)
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
        int j = (int)(headerBlockBuffer.size() + 4L);
        sink.writeInt(0x80030008);
        sink.writeInt(j & 0xffffff | 0);
        sink.writeInt(0x7fffffff & i);
        sink.writeAll(headerBlockBuffer);
        this;
        JVM INSTR monitorexit ;
    }

    public int maxDataLength()
    {
        return 16383;
    }

    public void ping(boolean flag, int i, int j)
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
        sink.writeInt(0x80030006);
        sink.writeInt(4);
        sink.writeInt(i);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void pushPromise(int i, int j, List list)
    {
    }

    public void rstStream(int i, ErrorCode errorcode)
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
        sink.writeInt(0x80030003);
        sink.writeInt(8);
        sink.writeInt(0x7fffffff & i);
        sink.writeInt(errorcode.spdyRstCode);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    void sendDataFrame(int i, int j, Buffer buffer, int k)
    {
        if (closed)
        {
            throw new IOException("closed");
        }
        if ((long)k > 0xffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("FRAME_TOO_LARGE max size is 16Mib: ").append(k).toString());
        }
        sink.writeInt(0x7fffffff & i);
        sink.writeInt((j & 0xff) << 24 | 0xffffff & k);
        if (k > 0)
        {
            sink.write(buffer, k);
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
        int i = settings1.size();
        sink.writeInt(0x80030004);
        sink.writeInt(i * 8 + 4 & 0xffffff | 0);
        sink.writeInt(i);
        int j = 0;
_L2:
        if (j > 10)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (!settings1.isSet(j))
        {
            break MISSING_BLOCK_LABEL_151;
        }
        int k = settings1.flags(j);
        sink.writeInt((k & 0xff) << 24 | j & 0xffffff);
        sink.writeInt(settings1.get(j));
        break MISSING_BLOCK_LABEL_151;
        sink.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void synReply(boolean flag, int i, List list)
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
        int j;
        int k;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = (int)(headerBlockBuffer.size() + 4L);
        sink.writeInt(0x80030002);
        sink.writeInt((j & 0xff) << 24 | k & 0xffffff);
        sink.writeInt(0x7fffffff & i);
        sink.writeAll(headerBlockBuffer);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void synStream(boolean flag, boolean flag1, int i, int j, List list)
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
        int k;
        writeNameValueBlockToBuffer(list);
        k = (int)(10L + headerBlockBuffer.size());
        break MISSING_BLOCK_LABEL_49;
_L2:
        sink.writeInt(0x80030001);
        sink.writeInt(((byte0 | flag2) & 0xff) << 24 | k & 0xffffff);
        sink.writeInt(i & 0x7fffffff);
        sink.writeInt(j & 0x7fffffff);
        sink.writeShort(0);
        sink.writeAll(headerBlockBuffer);
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

    public void windowUpdate(int i, long l)
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
        if (l != 0L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("windowSizeIncrement must be between 1 and 0x7fffffff: ").append(l).toString());
        sink.writeInt(0x80030009);
        sink.writeInt(8);
        sink.writeInt(i);
        sink.writeInt((int)l);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    (BufferedSink bufferedsink, boolean flag)
    {
        sink = bufferedsink;
        client = flag;
        bufferedsink = new Deflater();
        bufferedsink.setDictionary(Spdy3.DICTIONARY);
        headerBlockOut = Okio.buffer(new DeflaterSink(headerBlockBuffer, bufferedsink));
    }
}
