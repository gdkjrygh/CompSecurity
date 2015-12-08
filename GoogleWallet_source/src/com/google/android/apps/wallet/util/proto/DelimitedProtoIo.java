// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.proto;

import com.google.protobuf.nano.MessageNano;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class DelimitedProtoIo
{

    private static int computePreferredBufferSize(int i)
    {
        int j = i;
        if (i > 4096)
        {
            j = 4096;
        }
        return j;
    }

    private static int computeRawVarint32Size(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public static MessageNano parseDelimitedFrom(MessageNano messagenano, InputStream inputstream)
        throws IOException
    {
        int i = inputstream.read();
        if (i == -1)
        {
            return null;
        }
        int k = readRawVarint32(i, inputstream);
        byte abyte0[] = new byte[k];
        int l;
        for (int j = 0; j < k; j += l)
        {
            l = inputstream.read(abyte0, j, k - j);
            if (l == -1)
            {
                throw new IOException();
            }
        }

        return MessageNano.mergeFrom(messagenano, abyte0);
    }

    private static int readRawVarint32(int i, InputStream inputstream)
        throws IOException
    {
        if ((i & 0x80) != 0) goto _L2; else goto _L1
_L1:
        int k = i;
_L4:
        return k;
_L2:
        int j;
        j = i & 0x7f;
        i = 7;
        do
        {
            k = i;
            if (i >= 32)
            {
                break; /* Loop/switch isn't completed */
            }
            int l = inputstream.read();
            if (l == -1)
            {
                throw new IOException();
            }
            j |= (l & 0x7f) << i;
            k = j;
            if ((l & 0x80) == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i += 7;
        } while (true);
        if (true) goto _L4; else goto _L3
_L6:
        k += 7;
_L3:
        if (k < 64)
        {
            i = inputstream.read();
            if (i == -1)
            {
                throw new IOException();
            }
            if ((i & 0x80) == 0)
            {
                return j;
            }
        } else
        {
            throw new IOException();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void writeDelimitedTo(MessageNano messagenano, OutputStream outputstream)
        throws IOException
    {
        int i = messagenano.getCachedSize();
        outputstream = new BufferedOutputStream(outputstream, computePreferredBufferSize(computeRawVarint32Size(i) + i));
        writeRawVarint32(i, outputstream);
        outputstream.write(MessageNano.toByteArray(messagenano));
        outputstream.flush();
    }

    private static void writeRawVarint32(int i, OutputStream outputstream)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                outputstream.write(i);
                return;
            }
            outputstream.write(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }
}
