// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSABlindingParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;

public class PSSSigner
    implements Signer
{

    private Digest a;
    private Digest b;
    private AsymmetricBlockCipher c;
    private SecureRandom d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte i[];
    private byte j[];
    private byte k[];
    private byte l;

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, Digest digest1, int i1, byte byte0)
    {
        c = asymmetricblockcipher;
        a = digest;
        b = digest1;
        e = digest.b();
        f = digest1.b();
        g = i1;
        i = new byte[i1];
        j = new byte[i1 + 8 + e];
        l = byte0;
    }

    private static void a(int i1, byte abyte0[])
    {
        abyte0[0] = (byte)(i1 >>> 24);
        abyte0[1] = (byte)(i1 >>> 16);
        abyte0[2] = (byte)(i1 >>> 8);
        abyte0[3] = (byte)(i1 >>> 0);
    }

    private byte[] a(byte abyte0[], int i1, int j1, int k1)
    {
        byte abyte1[] = new byte[k1];
        byte abyte2[] = new byte[f];
        byte abyte3[] = new byte[4];
        b.c();
        int l1;
        for (l1 = 0; l1 < k1 / f; l1++)
        {
            a(l1, abyte3);
            b.a(abyte0, i1, j1);
            b.a(abyte3, 0, 4);
            b.a(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, f * l1, f);
        }

        if (f * l1 < k1)
        {
            a(l1, abyte3);
            b.a(abyte0, i1, j1);
            b.a(abyte3, 0, 4);
            b.a(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, f * l1, abyte1.length - l1 * f);
        }
        return abyte1;
    }

    private static void b(byte abyte0[])
    {
        for (int i1 = 0; i1 != abyte0.length; i1++)
        {
            abyte0[i1] = 0;
        }

    }

    public final void a(byte byte0)
    {
        a.a(byte0);
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            ParametersWithRandom parameterswithrandom = (ParametersWithRandom)cipherparameters;
            cipherparameters = parameterswithrandom.b();
            d = parameterswithrandom.a();
        } else
        if (flag)
        {
            d = new SecureRandom();
        }
        c.a(flag, cipherparameters);
        if (cipherparameters instanceof RSABlindingParameters)
        {
            cipherparameters = ((RSABlindingParameters)cipherparameters).a();
        } else
        {
            cipherparameters = (RSAKeyParameters)cipherparameters;
        }
        h = cipherparameters.b().bitLength() - 1;
        if (h < e * 8 + g * 8 + 9)
        {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        } else
        {
            k = new byte[(h + 7) / 8];
            a.c();
            return;
        }
    }

    public final void a(byte abyte0[], int i1, int j1)
    {
        a.a(abyte0, i1, j1);
    }

    public final boolean a(byte abyte0[])
    {
        a.a(j, j.length - e - g);
        int l1;
        try
        {
            abyte0 = c.a(abyte0, 0, abyte0.length);
            System.arraycopy(abyte0, 0, k, k.length - abyte0.length, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (k[k.length - 1] != l)
        {
            b(k);
            return false;
        }
        abyte0 = a(k, k.length - e - 1, e, k.length - e - 1);
        for (int i1 = 0; i1 != abyte0.length; i1++)
        {
            byte abyte1[] = k;
            abyte1[i1] = (byte)(abyte1[i1] ^ abyte0[i1]);
        }

        abyte0 = k;
        abyte0[0] = (byte)(abyte0[0] & 255 >> k.length * 8 - h);
        for (int j1 = 0; j1 != k.length - e - g - 2; j1++)
        {
            if (k[j1] != 0)
            {
                b(k);
                return false;
            }
        }

        if (k[k.length - e - g - 2] != 1)
        {
            b(k);
            return false;
        }
        System.arraycopy(k, k.length - g - e - 1, j, j.length - g, g);
        a.a(j, 0, j.length);
        a.a(j, j.length - e);
        l1 = k.length - e - 1;
        for (int k1 = j.length - e; k1 != j.length; k1++)
        {
            if ((k[l1] ^ j[k1]) != 0)
            {
                b(j);
                b(k);
                return false;
            }
            l1++;
        }

        b(j);
        b(k);
        return true;
    }

    public final byte[] a()
    {
        a.a(j, j.length - e - g);
        if (g != 0)
        {
            d.nextBytes(i);
            System.arraycopy(i, 0, j, j.length - g, g);
        }
        byte abyte0[] = new byte[e];
        a.a(j, 0, j.length);
        a.a(abyte0, 0);
        k[k.length - g - 1 - e - 1] = 1;
        System.arraycopy(i, 0, k, k.length - g - e - 1, g);
        byte abyte1[] = a(abyte0, 0, abyte0.length, k.length - e - 1);
        for (int i1 = 0; i1 != abyte1.length; i1++)
        {
            byte abyte2[] = k;
            abyte2[i1] = (byte)(abyte2[i1] ^ abyte1[i1]);
        }

        abyte1 = k;
        abyte1[0] = (byte)(abyte1[0] & 255 >> k.length * 8 - h);
        System.arraycopy(abyte0, 0, k, k.length - e - 1, e);
        k[k.length - 1] = l;
        abyte0 = c.a(k, 0, k.length);
        b(k);
        return abyte0;
    }
}
