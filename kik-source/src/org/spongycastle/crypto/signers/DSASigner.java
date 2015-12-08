// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.DSAKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

public class DSASigner
    implements DSA
{

    DSAKeyParameters a;
    SecureRandom b;

    public DSASigner()
    {
    }

    private static BigInteger a(BigInteger biginteger, byte abyte0[])
    {
        if (biginteger.bitLength() >= abyte0.length * 8)
        {
            return new BigInteger(1, abyte0);
        } else
        {
            biginteger = new byte[biginteger.bitLength() / 8];
            System.arraycopy(abyte0, 0, biginteger, 0, biginteger.length);
            return new BigInteger(1, biginteger);
        }
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                b = cipherparameters.a();
                a = (DSAPrivateKeyParameters)cipherparameters.b();
                return;
            } else
            {
                b = new SecureRandom();
                a = (DSAPrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            a = (DSAPublicKeyParameters)cipherparameters;
            return;
        }
    }

    public final boolean a(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        DSAParameters dsaparameters = a.b();
        abyte0 = a(dsaparameters.b(), abyte0);
        for (BigInteger biginteger2 = BigInteger.valueOf(0L); biginteger2.compareTo(biginteger) >= 0 || dsaparameters.b().compareTo(biginteger) <= 0 || biginteger2.compareTo(biginteger1) >= 0 || dsaparameters.b().compareTo(biginteger1) <= 0;)
        {
            return false;
        }

        biginteger1 = biginteger1.modInverse(dsaparameters.b());
        abyte0 = abyte0.multiply(biginteger1).mod(dsaparameters.b());
        biginteger1 = biginteger.multiply(biginteger1).mod(dsaparameters.b());
        return dsaparameters.c().modPow(abyte0, dsaparameters.a()).multiply(((DSAPublicKeyParameters)a).c().modPow(biginteger1, dsaparameters.a())).mod(dsaparameters.a()).mod(dsaparameters.b()).equals(biginteger);
    }

    public final BigInteger[] a(byte abyte0[])
    {
        DSAParameters dsaparameters = a.b();
        abyte0 = a(dsaparameters.b(), abyte0);
        int i = dsaparameters.b().bitLength();
        BigInteger biginteger;
        do
        {
            biginteger = new BigInteger(i, b);
        } while (biginteger.compareTo(dsaparameters.b()) >= 0);
        BigInteger biginteger1 = dsaparameters.c().modPow(biginteger, dsaparameters.a()).mod(dsaparameters.b());
        return (new BigInteger[] {
            biginteger1, biginteger.modInverse(dsaparameters.b()).multiply(abyte0.add(((DSAPrivateKeyParameters)a).c().multiply(biginteger1))).mod(dsaparameters.b())
        });
    }
}
