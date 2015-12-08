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

public class ECGOST3410Signer
    implements DSA
{

    ECKeyParameters a;
    SecureRandom b;

    public ECGOST3410Signer()
    {
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
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i != abyte1.length; i++)
        {
            abyte1[i] = abyte0[abyte1.length - 1 - i];
        }

        BigInteger biginteger2 = new BigInteger(1, abyte1);
        for (abyte0 = a.b().c(); biginteger.compareTo(ECConstants.g) < 0 || biginteger.compareTo(abyte0) >= 0 || biginteger1.compareTo(ECConstants.g) < 0 || biginteger1.compareTo(abyte0) >= 0;)
        {
            return false;
        }

        biginteger2 = biginteger2.modInverse(abyte0);
        biginteger1 = biginteger1.multiply(biginteger2).mod(abyte0);
        biginteger2 = abyte0.subtract(biginteger).multiply(biginteger2).mod(abyte0);
        return ECAlgorithms.a(a.b().b(), biginteger1, ((ECPublicKeyParameters)a).c(), biginteger2).b().a().mod(abyte0).equals(biginteger);
    }

    public final BigInteger[] a(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i != abyte1.length; i++)
        {
            abyte1[i] = abyte0[abyte1.length - 1 - i];
        }

        abyte0 = new BigInteger(1, abyte1);
        BigInteger biginteger = a.b().c();
        BigInteger biginteger1;
        BigInteger biginteger2;
        do
        {
            do
            {
                do
                {
                    biginteger2 = new BigInteger(biginteger.bitLength(), b);
                } while (biginteger2.equals(ECConstants.f));
                biginteger1 = a.b().b().a(biginteger2).b().a().mod(biginteger);
            } while (biginteger1.equals(ECConstants.f));
            BigInteger biginteger3 = ((ECPrivateKeyParameters)a).c();
            biginteger2 = biginteger2.multiply(abyte0).add(biginteger3.multiply(biginteger1)).mod(biginteger);
        } while (biginteger2.equals(ECConstants.f));
        return (new BigInteger[] {
            biginteger1, biginteger2
        });
    }
}
