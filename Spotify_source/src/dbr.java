// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class dbr
{

    public static byte[] a(int i)
    {
        int k = 2;
        byte abyte0[] = new byte[2];
        for (int j = 0; k > 0; j++)
        {
            abyte0[j] = (byte)(i >> (k - 1) * 8);
            k--;
        }

        return abyte0;
    }

    public static byte[] a(String s)
    {
        return a(s, 10, new byte[] {
            32
        });
    }

    public static byte[] a(String s, int i, byte abyte0[])
    {
        byte abyte1[] = s.getBytes();
        ByteBuffer bytebuffer = ByteBuffer.allocate(i);
        if (s.length() >= i)
        {
            bytebuffer.put(abyte1, abyte1.length - i, i);
        } else
        {
            bytebuffer.put(abyte1);
            int j = i - abyte1.length;
            i = j % abyte0.length;
            if (i > 0)
            {
                try
                {
                    bytebuffer.position(bytebuffer.position() - i);
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            i = 0;
            while (i < j) 
            {
                bytebuffer.put(abyte0);
                i += abyte0.length;
            }
        }
        if (bytebuffer.hasArray())
        {
            return bytebuffer.array();
        } else
        {
            return null;
        }
    }
}
