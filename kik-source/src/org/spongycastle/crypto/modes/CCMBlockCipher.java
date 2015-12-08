// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.modes:
//            AEADBlockCipher, SICBlockCipher

public class CCMBlockCipher
    implements AEADBlockCipher
{

    private BlockCipher a;
    private int b;
    private boolean c;
    private byte d[];
    private byte e[];
    private int f;
    private CipherParameters g;
    private byte h[];
    private ByteArrayOutputStream i;

    public CCMBlockCipher(BlockCipher blockcipher)
    {
        i = new ByteArrayOutputStream();
        a = blockcipher;
        b = blockcipher.b();
        h = new byte[b];
        if (b != 16)
        {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        } else
        {
            return;
        }
    }

    private int a(byte abyte0[], int j, byte abyte1[])
    {
        int k = 1;
        CBCBlockCipherMac cbcblockciphermac = new CBCBlockCipherMac(a, f * 8);
        cbcblockciphermac.a(g);
        byte abyte2[] = new byte[16];
        if (b())
        {
            abyte2[0] = (byte)(abyte2[0] | 0x40);
        }
        abyte2[0] = (byte)(abyte2[0] | ((cbcblockciphermac.a() - 2) / 2 & 7) << 3);
        abyte2[0] = (byte)(abyte2[0] | 15 - d.length - 1 & 7);
        System.arraycopy(d, 0, abyte2, 1, d.length);
        for (int i1 = j; i1 > 0;)
        {
            abyte2[16 - k] = (byte)(i1 & 0xff);
            i1 >>>= 8;
            k++;
        }

        cbcblockciphermac.a(abyte2, 0, 16);
        if (b())
        {
            int l;
            int j1;
            if (e.length < 65280)
            {
                cbcblockciphermac.a((byte)(e.length >> 8));
                cbcblockciphermac.a((byte)e.length);
                l = 2;
            } else
            {
                cbcblockciphermac.a((byte)-1);
                cbcblockciphermac.a((byte)-2);
                cbcblockciphermac.a((byte)(e.length >> 24));
                cbcblockciphermac.a((byte)(e.length >> 16));
                cbcblockciphermac.a((byte)(e.length >> 8));
                cbcblockciphermac.a((byte)e.length);
                l = 6;
            }
            cbcblockciphermac.a(e, 0, e.length);
            j1 = (l + e.length) % 16;
            if (j1 != 0)
            {
                for (l = 0; l != 16 - j1; l++)
                {
                    cbcblockciphermac.a((byte)0);
                }

            }
        }
        cbcblockciphermac.a(abyte0, 0, j);
        return cbcblockciphermac.a(abyte1, 0);
    }

    private boolean b()
    {
        return e != null && e.length != 0;
    }

    public final int a(int j)
    {
        return 0;
    }

    public final int a(byte abyte0[], int j)
    {
        byte abyte3[];
        SICBlockCipher sicblockcipher;
        int l1;
        abyte3 = i.toByteArray();
        l1 = abyte3.length;
        if (g == null)
        {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        sicblockcipher = new SICBlockCipher(a);
        byte abyte1[] = new byte[b];
        abyte1[0] = (byte)(15 - d.length - 1 & 7);
        System.arraycopy(d, 0, abyte1, 1, d.length);
        sicblockcipher.a(c, new ParametersWithIV(g, abyte1));
        if (!c) goto _L2; else goto _L1
_L1:
        byte abyte2[];
        abyte2 = new byte[f + l1];
        a(abyte3, l1, h);
        sicblockcipher.a(h, 0, h, 0);
        int j1 = 0;
        int k;
        for (k = 0; k < l1 - b; k += b)
        {
            sicblockcipher.a(abyte3, k, abyte2, j1);
            j1 += b;
        }

        byte abyte4[] = new byte[b];
        System.arraycopy(abyte3, k, abyte4, 0, l1 - k);
        sicblockcipher.a(abyte4, 0, abyte4, 0);
        System.arraycopy(abyte4, 0, abyte2, j1, l1 - k);
        k = j1 + (l1 - k);
        System.arraycopy(h, 0, abyte2, k, abyte2.length - k);
_L4:
        System.arraycopy(abyte2, 0, abyte0, j, abyte2.length);
        a.c();
        i.reset();
        return abyte2.length;
_L2:
        abyte2 = new byte[l1 - f];
        System.arraycopy(abyte3, (l1 + 0) - f, h, 0, f);
        sicblockcipher.a(h, 0, h, 0);
        for (int l = f; l != h.length; l++)
        {
            h[l] = 0;
        }

        break;
        while (false) 
        {
            i1 = 0;
            k1 = 0;
            while (i1 < abyte2.length - b) 
            {
                sicblockcipher.a(abyte3, k1, abyte2, i1);
                i1 += b;
                k1 += b;
            }
            abyte5 = new byte[b];
            System.arraycopy(abyte3, k1, abyte5, 0, abyte2.length - i1);
            sicblockcipher.a(abyte5, 0, abyte5, 0);
            System.arraycopy(abyte5, 0, abyte2, i1, abyte2.length - i1);
            abyte3 = new byte[b];
            a(abyte2, abyte2.length, abyte3);
            if (!Arrays.b(h, abyte3))
            {
                throw new InvalidCipherTextException("mac check in CCM failed");
            }
        }
_L6:
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int a(byte abyte0[], int j, int k, byte abyte1[], int l)
    {
        i.write(abyte0, j, k);
        return 0;
    }

    public final BlockCipher a()
    {
        return a;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            d = cipherparameters.d();
            e = cipherparameters.c();
            f = cipherparameters.b() / 8;
            g = cipherparameters.a();
            return;
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            d = cipherparameters.a();
            e = null;
            f = h.length / 2;
            g = cipherparameters.b();
            return;
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to CCM");
        }
    }

    public final int b(int j)
    {
        if (c)
        {
            return i.size() + j + f;
        } else
        {
            return (i.size() + j) - f;
        }
    }
}
