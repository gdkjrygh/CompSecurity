// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.GOST3410KeyParameters;
import org.spongycastle.crypto.params.GOST3410Parameters;
import org.spongycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.spongycastle.crypto.params.GOST3410PublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

public class GOST3410Signer
    implements DSA
{

    GOST3410KeyParameters a;
    SecureRandom b;

    public GOST3410Signer()
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
                a = (GOST3410PrivateKeyParameters)cipherparameters.b();
                return;
            } else
            {
                b = new SecureRandom();
                a = (GOST3410PrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            a = (GOST3410PublicKeyParameters)cipherparameters;
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
        abyte0 = a.b();
        for (BigInteger biginteger3 = BigInteger.valueOf(0L); biginteger3.compareTo(biginteger) >= 0 || abyte0.b().compareTo(biginteger) <= 0 || biginteger3.compareTo(biginteger1) >= 0 || abyte0.b().compareTo(biginteger1) <= 0;)
        {
            return false;
        }

        biginteger2 = biginteger2.modPow(abyte0.b().subtract(new BigInteger("2")), abyte0.b());
        biginteger1 = biginteger1.multiply(biginteger2).mod(abyte0.b());
        biginteger2 = abyte0.b().subtract(biginteger).multiply(biginteger2).mod(abyte0.b());
        return abyte0.c().modPow(biginteger1, abyte0.a()).multiply(((GOST3410PublicKeyParameters)a).c().modPow(biginteger2, abyte0.a())).mod(abyte0.a()).mod(abyte0.b()).equals(biginteger);
    }

    public final BigInteger[] a(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i != abyte1.length; i++)
        {
            abyte1[i] = abyte0[abyte1.length - 1 - i];
        }

        abyte0 = new BigInteger(1, abyte1);
        GOST3410Parameters gost3410parameters = a.b();
        BigInteger biginteger;
        do
        {
            biginteger = new BigInteger(gost3410parameters.b().bitLength(), b);
        } while (biginteger.compareTo(gost3410parameters.b()) >= 0);
        BigInteger biginteger1 = gost3410parameters.c().modPow(biginteger, gost3410parameters.a()).mod(gost3410parameters.b());
        return (new BigInteger[] {
            biginteger1, biginteger.multiply(abyte0).add(((GOST3410PrivateKeyParameters)a).c().multiply(biginteger1)).mod(gost3410parameters.b())
        });
    }
}
