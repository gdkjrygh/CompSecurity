// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.IESParameters;
import org.spongycastle.crypto.params.IESWithCipherParameters;
import org.spongycastle.crypto.params.KDFParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.BigIntegers;

public class IESEngine
{

    BasicAgreement a;
    DerivationFunction b;
    Mac c;
    BufferedBlockCipher d;
    byte e[];
    boolean f;
    CipherParameters g;
    CipherParameters h;
    IESParameters i;

    public IESEngine(BasicAgreement basicagreement, DerivationFunction derivationfunction, Mac mac)
    {
        a = basicagreement;
        b = derivationfunction;
        c = mac;
        e = new byte[mac.a()];
        d = null;
    }

    private byte[] a(KDFParameters kdfparameters, int j)
    {
        byte abyte0[] = new byte[j];
        b.a(kdfparameters);
        b.a(abyte0, 0, abyte0.length);
        return abyte0;
    }

    public final void a(boolean flag, CipherParameters cipherparameters, CipherParameters cipherparameters1, CipherParameters cipherparameters2)
    {
        f = flag;
        g = cipherparameters;
        h = cipherparameters1;
        i = (IESParameters)cipherparameters2;
    }

    public final byte[] a(byte abyte0[], int j)
    {
        byte abyte1[];
        int k;
        k = 0;
        a.a(g);
        abyte1 = BigIntegers.a(a.b(h));
        if (!f) goto _L2; else goto _L1
_L1:
        Object obj1;
        abyte1 = new KDFParameters(abyte1, i.a());
        int l = i.c();
        byte abyte3[];
        if (d == null)
        {
            byte abyte2[] = a(((KDFParameters) (abyte1)), l / 8 + j);
            abyte1 = new byte[c.a() + j];
            for (k = 0; k != j; k++)
            {
                abyte1[k] = (byte)(abyte0[k + 0] ^ abyte2[k]);
            }

            KeyParameter keyparameter = new KeyParameter(abyte2, j, l / 8);
            abyte0 = abyte1;
            abyte1 = keyparameter;
        } else
        {
            k = ((IESWithCipherParameters)i).d();
            abyte1 = a(((KDFParameters) (abyte1)), k / 8 + l / 8);
            d.a(true, new KeyParameter(abyte1, 0, k / 8));
            obj1 = new byte[d.b(j)];
            j = d.a(abyte0, 0, j, ((byte []) (obj1)), 0);
            j += d.a(((byte []) (obj1)), j);
            abyte0 = new byte[c.a() + j];
            System.arraycopy(obj1, 0, abyte0, 0, j);
            abyte1 = new KeyParameter(abyte1, k / 8, l / 8);
        }
        abyte3 = i.b();
        c.a(abyte1);
        c.a(abyte0, 0, j);
        c.a(abyte3, 0, abyte3.length);
        c.a(abyte0, j);
        obj1 = abyte0;
_L4:
        return ((byte []) (obj1));
_L2:
        Object obj = new KDFParameters(abyte1, i.a());
        int j1 = i.c();
        b.a(((org.spongycastle.crypto.DerivationParameters) (obj)));
        int i1 = j - c.a();
        byte abyte4[];
        if (d == null)
        {
            obj1 = a(((KDFParameters) (obj)), j1 / 8 + i1);
            obj = new byte[i1];
            for (j = 0; j != i1; j++)
            {
                obj[j] = (byte)(abyte0[j + 0] ^ obj1[j]);
            }

            obj1 = new KeyParameter(((byte []) (obj1)), i1, j1 / 8);
        } else
        {
            j = ((IESWithCipherParameters)i).d();
            obj1 = a(((KDFParameters) (obj)), j / 8 + j1 / 8);
            d.a(false, new KeyParameter(((byte []) (obj1)), 0, j / 8));
            byte abyte5[] = new byte[d.b(i1)];
            int k1 = d.a(abyte0, 0, i1, abyte5, 0);
            k1 += d.a(abyte5, k1);
            obj = new byte[k1];
            System.arraycopy(abyte5, 0, obj, 0, k1);
            obj1 = new KeyParameter(((byte []) (obj1)), j / 8, j1 / 8);
        }
        abyte4 = i.b();
        c.a(((CipherParameters) (obj1)));
        c.a(abyte0, 0, i1);
        c.a(abyte4, 0, abyte4.length);
        c.a(e, 0);
        j = k;
        obj1 = obj;
        if (j < e.length)
        {
            if (e[j] != abyte0[i1 + 0 + j])
            {
                throw new InvalidCipherTextException("Mac codes failed to equal.");
            }
            j++;
            break MISSING_BLOCK_LABEL_544;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }
}
