// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.macs.CMac;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.modes:
//            AEADBlockCipher, SICBlockCipher

public class EAXBlockCipher
    implements AEADBlockCipher
{

    private SICBlockCipher a;
    private boolean b;
    private int c;
    private Mac d;
    private byte e[];
    private byte f[];
    private byte g[];
    private int h;
    private byte i[];
    private int j;

    public EAXBlockCipher(BlockCipher blockcipher)
    {
        c = blockcipher.b();
        d = new CMac(blockcipher);
        g = new byte[c];
        i = new byte[c * 2];
        f = new byte[d.a()];
        e = new byte[d.a()];
        a = new SICBlockCipher(blockcipher);
    }

    private void b()
    {
        int k = 0;
        byte abyte0[] = new byte[c];
        d.a(abyte0, 0);
        for (; k < g.length; k++)
        {
            g[k] = (byte)(e[k] ^ f[k] ^ abyte0[k]);
        }

    }

    private void c()
    {
        a.c();
        d.b();
        j = 0;
        Arrays.a(i, (byte)0);
        byte abyte0[] = new byte[c];
        abyte0[c - 1] = 2;
        d.a(abyte0, 0, c);
    }

    public final int a(int k)
    {
        return ((j + k) / c) * c;
    }

    public final int a(byte abyte0[], int k)
    {
        boolean flag;
        int l;
        int i1;
        flag = false;
        l = j;
        byte abyte1[] = new byte[i.length];
        j = 0;
        if (b)
        {
            a.a(i, 0, abyte1, 0);
            a.a(i, c, abyte1, c);
            System.arraycopy(abyte1, 0, abyte0, k, l);
            d.a(abyte1, 0, l);
            b();
            System.arraycopy(g, 0, abyte0, k + l, h);
            c();
            return h + l;
        }
        if (l > h)
        {
            d.a(i, 0, l - h);
            a.a(i, 0, abyte1, 0);
            a.a(i, c, abyte1, c);
            System.arraycopy(abyte1, 0, abyte0, k, l - h);
        }
        b();
        abyte0 = i;
        i1 = h;
        k = 0;
_L3:
        if (k >= h)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (g[k] == abyte0[(l - i1) + k]) goto _L2; else goto _L1
_L1:
        k = ((flag) ? 1 : 0);
_L4:
        if (k == 0)
        {
            throw new InvalidCipherTextException("mac check in EAX failed");
        } else
        {
            c();
            return l - h;
        }
_L2:
        k++;
          goto _L3
        k = 1;
          goto _L4
    }

    public final int a(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        int k1 = 0;
        int l1 = 0;
        while (k1 != l) 
        {
            byte byte0 = abyte0[k + k1];
            int i2 = i1 + l1;
            byte abyte2[] = i;
            int j1 = j;
            j = j1 + 1;
            abyte2[j1] = byte0;
            if (j == i.length)
            {
                if (b)
                {
                    j1 = a.a(i, 0, abyte1, i2);
                    d.a(abyte1, i2, c);
                } else
                {
                    d.a(i, 0, c);
                    j1 = a.a(i, 0, abyte1, i2);
                }
                j = c;
                System.arraycopy(i, c, i, 0, c);
            } else
            {
                j1 = 0;
            }
            l1 += j1;
            k1++;
        }
        return l1;
    }

    public final BlockCipher a()
    {
        return a.d();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        b = flag;
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            abyte1 = cipherparameters.d();
            abyte0 = cipherparameters.c();
            h = cipherparameters.b() / 8;
            cipherparameters = cipherparameters.a();
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            abyte1 = cipherparameters.a();
            abyte0 = new byte[0];
            h = d.a() / 2;
            cipherparameters = cipherparameters.b();
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        abyte2 = new byte[c];
        d.a(cipherparameters);
        abyte2[c - 1] = 1;
        d.a(abyte2, 0, c);
        d.a(abyte0, 0, abyte0.length);
        d.a(f, 0);
        abyte2[c - 1] = 0;
        d.a(abyte2, 0, c);
        d.a(abyte1, 0, abyte1.length);
        d.a(e, 0);
        abyte2[c - 1] = 2;
        d.a(abyte2, 0, c);
        a.a(true, new ParametersWithIV(cipherparameters, e));
    }

    public final int b(int k)
    {
        if (b)
        {
            return j + k + h;
        } else
        {
            return (j + k) - h;
        }
    }
}
