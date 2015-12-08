// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;

public class CBCBlockCipherMac
    implements Mac
{

    private byte a[];
    private byte b[];
    private int c;
    private BlockCipher d;
    private BlockCipherPadding e;
    private int f;

    public CBCBlockCipherMac(BlockCipher blockcipher)
    {
        this(blockcipher, (blockcipher.b() * 8) / 2, null);
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, int i)
    {
        this(blockcipher, i, null);
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, int i, BlockCipherPadding blockcipherpadding)
    {
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else
        {
            d = new CBCBlockCipher(blockcipher);
            e = blockcipherpadding;
            f = i / 8;
            a = new byte[blockcipher.b()];
            b = new byte[blockcipher.b()];
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
        int j = d.b();
        if (e == null)
        {
            for (; c < j; c = c + 1)
            {
                b[c] = 0;
            }

        } else
        {
            if (c == j)
            {
                d.a(b, 0, a, 0);
                c = 0;
            }
            e.a(b, c);
        }
        d.a(b, 0, a, 0);
        System.arraycopy(a, 0, abyte0, i, f);
        b();
        return f;
    }

    public final void a(byte byte0)
    {
        if (c == b.length)
        {
            d.a(b, 0, a, 0);
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
        d.a(true, cipherparameters);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i1 = d.b();
        int j1 = i1 - c;
        int k = i;
        int l = j;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, b, c, j1);
            d.a(b, 0, a, 0);
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
                d.a(abyte0, i, a, 0);
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
        d.c();
    }
}
