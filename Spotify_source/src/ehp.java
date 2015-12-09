// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class ehp
{

    public ehp()
    {
    }

    static byte a(DataInputStream datainputstream)
    {
        byte byte0;
        try
        {
            byte0 = datainputstream.readByte();
        }
        // Misplaced declaration of an exception variable
        catch (DataInputStream datainputstream)
        {
            throw new EOFException("IO exception while waiting for start byte");
        }
        if (byte0 == 126)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = datainputstream.readByte();
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_5;
_L1:
        return byte0;
    }

    public static void a(byte abyte0[], int i, byte byte0, byte byte1, ByteBuffer bytebuffer)
    {
        eho eho1 = new eho();
        bytebuffer.put((byte)126);
        bytebuffer.put(eho1.a(byte0));
        bytebuffer.put(eho1.a(byte1));
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(4);
        bytebuffer1.putInt(i);
        a(bytebuffer1.array(), 4, bytebuffer, eho1);
        a(abyte0, i, bytebuffer, eho1);
        abyte0 = ByteBuffer.allocate(2);
        abyte0.putShort((short)eho1.a);
        a(abyte0.array(), 2, bytebuffer, eho1);
        bytebuffer.put((byte)124);
    }

    private static void a(byte abyte0[], int i, ByteBuffer bytebuffer, eho eho1)
    {
        int j = 0;
        while (j < i) 
        {
            byte byte0 = eho1.a(abyte0[j]);
            if (byte0 == 124 || byte0 == 126 || byte0 == 125)
            {
                bytebuffer.put((byte)125);
                bytebuffer.put((byte)(byte0 - 32));
            } else
            {
                bytebuffer.put(byte0);
            }
            j++;
        }
    }
}
