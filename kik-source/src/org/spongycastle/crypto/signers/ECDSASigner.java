// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;

public class ECDSASigner
    implements DSA, ECConstants
{

    ECKeyParameters a;
    SecureRandom b;

    public ECDSASigner()
    {
    }

    private static BigInteger a(BigInteger biginteger, byte abyte0[])
    {
        int i = biginteger.bitLength();
        int j = abyte0.length * 8;
        if (i >= j)
        {
            return new BigInteger(1, abyte0);
        } else
        {
            return (new BigInteger(1, abyte0)).shiftRight(j - i);
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
                a = (ECPrivateKeyParameters)cipherparameters.b();
                return;
            } else
            {
                b = new SecureRandom();
                a = (ECPrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            a = (ECPublicKeyParameters)cipherparameters;
            return;
        }
    }

    public final boolean a(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        BigInteger biginteger2 = a.b().c();
        for (abyte0 = a(biginteger2, abyte0); biginteger.compareTo(g) < 0 || biginteger.compareTo(biginteger2) >= 0 || biginteger1.compareTo(g) < 0 || biginteger1.compareTo(biginteger2) >= 0;)
        {
            return false;
        }

        biginteger1 = biginteger1.modInverse(biginteger2);
        abyte0 = abyte0.multiply(biginteger1).mod(biginteger2);
        biginteger1 = biginteger.multiply(biginteger1).mod(biginteger2);
        return ECAlgorithms.a(a.b().b(), abyte0, ((ECPublicKeyParameters)a).c(), biginteger1).b().a().mod(biginteger2).equals(biginteger);
    }

    public final BigInteger[] a(byte abyte0[])
    {
        BigInteger biginteger = a.b().c();
        abyte0 = a(biginteger, abyte0);
        BigInteger biginteger1;
        BigInteger biginteger2;
        do
        {
            int i = biginteger.bitLength();
            do
            {
                do
                {
                    biginteger2 = new BigInteger(i, b);
                } while (biginteger2.equals(f) || biginteger2.compareTo(biginteger) >= 0);
                biginteger1 = a.b().b().a(biginteger2).b().a().mod(biginteger);
            } while (biginteger1.equals(f));
            BigInteger biginteger3 = ((ECPrivateKeyParameters)a).c();
            biginteger2 = biginteger2.modInverse(biginteger).multiply(abyte0.add(biginteger3.multiply(biginteger1))).mod(biginteger);
        } while (biginteger2.equals(f));
        return (new BigInteger[] {
            biginteger1, biginteger2
        });
    }
}
