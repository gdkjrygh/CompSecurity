// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            StreamCipher, BlockCipher, DataLengthException, CipherParameters

public class StreamBlockCipher
    implements StreamCipher
{

    private BlockCipher a;
    private byte b[];

    public StreamBlockCipher(BlockCipher blockcipher)
    {
        b = new byte[1];
        if (blockcipher.b() != 1)
        {
            throw new IllegalArgumentException("block cipher block size != 1.");
        } else
        {
            a = blockcipher;
            return;
        }
    }

    public final byte a(byte byte0)
    {
        b[0] = byte0;
        a.a(b, 0, b, 0);
        return b[0];
    }

    public final String a()
    {
        return a.a();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a.a(flag, cipherparameters);
    }

    public final void a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too small in processBytes()");
        }
        for (int l = 0; l != j; l++)
        {
            a.a(abyte0, i + l, abyte1, k + l);
        }

    }

    public final void b()
    {
        a.c();
    }
}
