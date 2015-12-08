// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameWriter, Spdy3, ErrorCode, Settings

static final class nameValueBlockBuffer
    implements FrameWriter
{

    private final boolean client;
    private final ByteArrayOutputStream nameValueBlockBuffer = new ByteArrayOutputStream();
    private final DataOutputStream nameValueBlockOut;
    private final DataOutputStream out;

    private void writeNameValueBlockToBuffer(List list)
        throws IOException
    {
        nameValueBlockBuffer.reset();
        int i = list.size() / 2;
        nameValueBlockOut.writeInt(i);
        String s;
        for (list = list.iterator(); list.hasNext(); nameValueBlockOut.write(s.getBytes("UTF-8")))
        {
            s = (String)list.next();
            nameValueBlockOut.writeInt(s.length());
        }

        nameValueBlockOut.flush();
    }

    public void close()
        throws IOException
    {
        Util.closeAll(out, nameValueBlockOut);
    }

    public void connectionHeader()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void data(boolean flag, int i, byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        data(flag, i, abyte0, 0, abyte0.length);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public void data(boolean flag, int i, byte abyte0[], int j, int k)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        out.writeInt(0x7fffffff & i);
        out.writeInt((l & 0xff) << 24 | 0xffffff & k);
        out.write(abyte0, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public void flush()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void goAway(int i, ErrorCode errorcode)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (errorcode.spdyGoAwayCode == -1)
        {
            throw new IllegalArgumentException();
        }
        break MISSING_BLOCK_LABEL_23;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        out.writeInt(0x80030007);
        out.writeInt(8);
        out.writeInt(i);
        out.writeInt(errorcode.spdyGoAwayCode);
        out.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void headers(int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        writeNameValueBlockToBuffer(list);
        int j = nameValueBlockBuffer.size();
        out.writeInt(0x80030008);
        out.writeInt(0xffffff & j + 4 | 0);
        out.writeInt(0x7fffffff & i);
        nameValueBlockBuffer.writeTo(out);
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void noop()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        out.writeInt(0x80030005);
        out.writeInt(0);
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void ping(boolean flag, int i, int j)
        throws IOException
    {
        boolean flag2 = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag3 = client;
        Exception exception;
        boolean flag1;
        if (i % 2 == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L1
_L7:
        if (flag == flag1) goto _L3; else goto _L2
_L2:
        throw new IllegalArgumentException("payload != reply");
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L5:
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L3:
        out.writeInt(0x80030006);
        out.writeInt(4);
        out.writeInt(i);
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (flag3 == flag1) goto _L5; else goto _L4
_L4:
        flag1 = flag2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void rstStream(int i, ErrorCode errorcode)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (errorcode.spdyRstCode == -1)
        {
            throw new IllegalArgumentException();
        }
        break MISSING_BLOCK_LABEL_23;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        out.writeInt(0x80030003);
        out.writeInt(8);
        out.writeInt(0x7fffffff & i);
        out.writeInt(errorcode.spdyRstCode);
        out.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void settings(Settings settings1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int i = settings1.size();
        out.writeInt(0x80030004);
        out.writeInt(i * 8 + 4 & 0xffffff | 0);
        out.writeInt(i);
        int j = 0;
_L2:
        if (j > 10)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (!settings1.isSet(j))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        int k = settings1.flags(j);
        out.writeInt((k & 0xff) << 24 | j & 0xffffff);
        out.writeInt(settings1.get(j));
        break MISSING_BLOCK_LABEL_117;
        settings1;
        throw settings1;
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void synReply(boolean flag, int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
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
        k = nameValueBlockBuffer.size();
        out.writeInt(0x80030002);
        out.writeInt((j & 0xff) << 24 | 0xffffff & k + 4);
        out.writeInt(0x7fffffff & i);
        nameValueBlockBuffer.writeTo(out);
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void synStream(boolean flag, boolean flag1, int i, int j, int k, int l, List list)
        throws IOException
    {
        byte byte0 = 0;
        this;
        JVM INSTR monitorenter ;
        int i1;
        writeNameValueBlockToBuffer(list);
        i1 = nameValueBlockBuffer.size();
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
          goto _L1
_L3:
        out.writeInt(0x80030001);
        out.writeInt(((flag2 | byte0) & 0xff) << 24 | 0xffffff & i1 + 10);
        out.writeInt(i & 0x7fffffff);
        out.writeInt(j & 0x7fffffff);
        out.writeShort((k & 7) << 13 | 0 | l & 0xff);
        nameValueBlockBuffer.writeTo(out);
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void windowUpdate(int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        out.writeInt(0x80030009);
        out.writeInt(8);
        out.writeInt(i);
        out.writeInt(j);
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    (OutputStream outputstream, boolean flag)
    {
        out = new DataOutputStream(outputstream);
        client = flag;
        outputstream = new Deflater();
        outputstream.setDictionary(Spdy3.DICTIONARY);
        nameValueBlockOut = new DataOutputStream(Platform.get().newDeflaterOutputStream(nameValueBlockBuffer, outputstream, true));
    }
}
