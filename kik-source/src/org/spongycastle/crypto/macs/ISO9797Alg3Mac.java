// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class ISO9797Alg3Mac
    implements Mac
{

    private byte a[];
    private byte b[];
    private int c;
    private BlockCipher d;
    private BlockCipherPadding e;
    private int f;
    private KeyParameter g;
    private KeyParameter h;

    public ISO9797Alg3Mac(BlockCipher blockcipher)
    {
        this(blockcipher, blockcipher.b() * 8, null);
    }

    private ISO9797Alg3Mac(BlockCipher blockcipher, int i, BlockCipherPadding blockcipherpadding)
    {
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(blockcipher instanceof DESEngine))
        {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
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

    public ISO9797Alg3Mac(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        this(blockcipher, blockcipher.b() * 8, blockcipherpadding);
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
        DESEngine desengine = new DESEngine();
        desengine.a(false, g);
        desengine.a(a, 0, a, 0);
        desengine.a(true, h);
        desengine.a(a, 0, a, 0);
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
        if (!(cipherparameters instanceof KeyParameter) && !(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        KeyParameter keyparameter;
        byte abyte0[];
        if (cipherparameters instanceof KeyParameter)
        {
            keyparameter = (KeyParameter)cipherparameters;
        } else
        {
            keyparameter = (KeyParameter)((ParametersWithIV)cipherparameters).b();
        }
        abyte0 = keyparameter.a();
        if (abyte0.length == 16)
        {
            keyparameter = new KeyParameter(abyte0, 0, 8);
            g = new KeyParameter(abyte0, 8, 8);
            h = keyparameter;
        } else
        if (abyte0.length == 24)
        {
            keyparameter = new KeyParameter(abyte0, 0, 8);
            g = new KeyParameter(abyte0, 8, 8);
            h = new KeyParameter(abyte0, 16, 8);
        } else
        {
            throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            d.a(true, new ParametersWithIV(keyparameter, ((ParametersWithIV)cipherparameters).a()));
            return;
        } else
        {
            d.a(true, keyparameter);
            return;
        }
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
