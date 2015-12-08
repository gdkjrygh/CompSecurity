// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.netflix.mediaclient.util:
//            Base64

public static class decodabet extends FilterOutputStream
{

    private byte b4[];
    private boolean breakLines;
    private byte buffer[];
    private int bufferLength;
    private byte decodabet[];
    private boolean encode;
    private int lineLength;
    private int options;
    private int position;
    private boolean suspendEncoding;

    public void close()
        throws IOException
    {
        flushBase64();
        super.close();
        buffer = null;
        out = null;
    }

    public void flushBase64()
        throws IOException
    {
label0:
        {
            if (position > 0)
            {
                if (!encode)
                {
                    break label0;
                }
                out.write(Base64.access$300(b4, buffer, position, options));
                position = 0;
            }
            return;
        }
        throw new IOException("Base64 input not properly padded.");
    }

    public void resumeEncoding()
    {
        suspendEncoding = false;
    }

    public void suspendEncoding()
        throws IOException
    {
        flushBase64();
        suspendEncoding = true;
    }

    public void write(int i)
        throws IOException
    {
        if (!suspendEncoding) goto _L2; else goto _L1
_L1:
        out.write(i);
_L4:
        return;
_L2:
        if (!encode)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = buffer;
        int j = position;
        position = j + 1;
        abyte0[j] = (byte)i;
        if (position >= bufferLength)
        {
            out.write(Base64.access$300(b4, buffer, bufferLength, options));
            lineLength = lineLength + 4;
            if (breakLines && lineLength >= 76)
            {
                out.write(10);
                lineLength = 0;
            }
            position = 0;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (decodabet[i & 0x7f] <= -5)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte abyte1[] = buffer;
        int k = position;
        position = k + 1;
        abyte1[k] = (byte)i;
        if (position < bufferLength) goto _L4; else goto _L5
_L5:
        i = Base64.access$200(buffer, 0, b4, 0, options);
        out.write(b4, 0, i);
        position = 0;
        return;
        if (decodabet[i & 0x7f] == -5) goto _L4; else goto _L6
_L6:
        throw new IOException("Invalid character in Base64 data.");
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        if (suspendEncoding)
        {
            out.write(abyte0, i, j);
        } else
        {
            int k = 0;
            while (k < j) 
            {
                write(abyte0[i + k]);
                k++;
            }
        }
    }

    public (OutputStream outputstream)
    {
        this(outputstream, 1);
    }

    public <init>(OutputStream outputstream, int i)
    {
        boolean flag1 = true;
        super(outputstream);
        int j;
        boolean flag;
        if ((i & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        breakLines = flag;
        if ((i & 1) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        encode = flag;
        if (encode)
        {
            j = 3;
        } else
        {
            j = 4;
        }
        bufferLength = j;
        buffer = new byte[bufferLength];
        position = 0;
        lineLength = 0;
        suspendEncoding = false;
        b4 = new byte[4];
        options = i;
        decodabet = Base64.access$000(i);
    }
}
