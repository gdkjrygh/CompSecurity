// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.paddings.BlockCipherPadding;

// Referenced classes of package org.spongycastle.crypto.macs:
//            a

public class CFBBlockCipherMac
    implements Mac
{

    private byte a[];
    private byte b[];
    private int c;
    private a d;
    private BlockCipherPadding e;
    private int f;

    public CFBBlockCipherMac(BlockCipher blockcipher)
    {
        this(blockcipher, (blockcipher.b() * 8) / 2);
    }

    private CFBBlockCipherMac(BlockCipher blockcipher, int i)
    {
        e = null;
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else
        {
            a = new byte[blockcipher.b()];
            d = new a(blockcipher);
            e = null;
            f = i / 8;
            b = new byte[d.a()];
            c = 0;
            return;
        }
    }

    public final int a()
    {
        return f;
    }

    public final int a(byte abyte0[], int i)
    {
        int j = d.a();
        if (e == null)
        {
            for (; c < j; c = c + 1)
            {
                b[c] = 0;
            }

        } else
        {
            e.a(b, c);
        }
        d.a(b, 0, a);
        d.a(a);
        System.arraycopy(a, 0, abyte0, i, f);
        b();
        return f;
    }

    public final void a(byte byte0)
    {
        if (c == b.length)
        {
            d.a(b, 0, a);
            c = 0;
        }
        byte abyte0[] = b;
        int i = c;
        c = i + 1;
        abyte0[i] = byte0;
    }

    public final void a(CipherParameters cipherparameters)
    {
        b();
        d.a(cipherparameters);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i1 = d.a();
        int j1 = i1 - c;
        int k = i;
        int l = j;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, b, c, j1);
            d.a(b, 0, a);
            c = 0;
            j -= j1;
            i += j1;
            do
            {
                k = i;
                l = j;
                if (j <= i1)
                {
                    break;
                }
                d.a(abyte0, i, a);
                j -= i1;
                i += i1;
            } while (true);
        }
        System.arraycopy(abyte0, k, b, c, l);
        c = c + l;
    }

    public final void b()
    {
        for (int i = 0; i < b.length; i++)
        {
            b[i] = 0;
        }

        c = 0;
        d.b();
    }
}
