// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util

public class StrictLineReader
    implements Closeable
{

    private static final byte CR = 13;
    private static final byte LF = 10;
    private byte buf[];
    private final Charset charset;
    private int end;
    private final InputStream in;
    private int pos;

    public StrictLineReader(InputStream inputstream, int i, Charset charset1)
    {
        if (inputstream == null || charset1 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset1.equals(Util.US_ASCII))
        {
            throw new IllegalArgumentException("Unsupported encoding");
        } else
        {
            in = inputstream;
            charset = charset1;
            buf = new byte[i];
            return;
        }
    }

    public StrictLineReader(InputStream inputstream, Charset charset1)
    {
        this(inputstream, 8192, charset1);
    }

    private void fillBuf()
        throws IOException
    {
        int i = in.read(buf, 0, buf.length);
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            pos = 0;
            end = i;
            return;
        }
    }

    public void close()
        throws IOException
    {
        synchronized (in)
        {
            if (buf != null)
            {
                buf = null;
                in.close();
            }
        }
        return;
        exception;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int readInt()
        throws IOException
    {
        String s = readLine();
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new IOException((new StringBuilder()).append("expected an int but was \"").append(s).append("\"").toString());
        }
        return i;
    }

    public String readLine()
        throws IOException
    {
        InputStream inputstream = in;
        inputstream;
        JVM INSTR monitorenter ;
        if (buf == null)
        {
            throw new IOException("LineReader is closed");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception;
        int i;
        if (pos >= end)
        {
            fillBuf();
        }
        i = pos;
_L9:
        if (i == end) goto _L2; else goto _L1
_L1:
        if (buf[i] != 10)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        Object obj;
        int j;
        if (i != pos && buf[i - 1] == 13)
        {
            j = i - 1;
        } else
        {
            j = i;
        }
        obj = new String(buf, pos, j - pos, charset.name());
        pos = i + 1;
        inputstream;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = new ByteArrayOutputStream((end - pos) + 80) {

            final StrictLineReader this$0;

            public String toString()
            {
                String s;
                int k;
                if (count > 0 && buf[count - 1] == 13)
                {
                    k = count - 1;
                } else
                {
                    k = count;
                }
                try
                {
                    s = new String(buf, 0, k, charset.name());
                }
                catch (UnsupportedEncodingException unsupportedencodingexception)
                {
                    throw new AssertionError(unsupportedencodingexception);
                }
                return s;
            }

            
            {
                this$0 = StrictLineReader.this;
                super(i);
            }
        };
_L8:
        ((ByteArrayOutputStream) (obj)).write(buf, pos, end - pos);
        end = -1;
        fillBuf();
        i = pos;
_L6:
        if (i == end)
        {
            break; /* Loop/switch isn't completed */
        }
        if (buf[i] != 10) goto _L4; else goto _L3
_L3:
        if (i != pos)
        {
            ((ByteArrayOutputStream) (obj)).write(buf, pos, i - pos);
        }
        pos = i + 1;
        obj = ((ByteArrayOutputStream) (obj)).toString();
        inputstream;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        i++;
          goto _L9
    }

}
