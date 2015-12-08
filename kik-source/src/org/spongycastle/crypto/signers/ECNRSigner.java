// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.generators.ECKeyPairGenerator;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;

public class ECNRSigner
    implements DSA
{

    private boolean a;
    private ECKeyParameters b;
    private SecureRandom c;

    public ECNRSigner()
    {
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a = flag;
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                c = cipherparameters.a();
                b = (ECPrivateKeyParameters)cipherparameters.b();
                return;
            } else
            {
                c = new SecureRandom();
                b = (ECPrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            b = (ECPublicKeyParameters)cipherparameters;
            return;
        }
    }

    public final boolean a(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        if (a)
        {
            throw new IllegalStateException("not initialised for verifying");
        }
        ECPublicKeyParameters ecpublickeyparameters = (ECPublicKeyParameters)b;
        BigInteger biginteger2 = ecpublickeyparameters.b().c();
        int i = biginteger2.bitLength();
        abyte0 = new BigInteger(1, abyte0);
        if (abyte0.bitLength() > i)
        {
            throw new DataLengthException("input too large for ECNR key.");
        }
        if (biginteger.compareTo(ECConstants.g) < 0 || biginteger.compareTo(biginteger2) >= 0)
        {
            return false;
        }
        if (biginteger1.compareTo(ECConstants.f) < 0 || biginteger1.compareTo(biginteger2) >= 0)
        {
            return false;
        } else
        {
            return biginteger.subtract(ECAlgorithms.a(ecpublickeyparameters.b().b(), biginteger1, ecpublickeyparameters.c(), biginteger).b().a()).mod(biginteger2).equals(abyte0);
        }
    }

    public final BigInteger[] a(byte abyte0[])
    {
        if (!a)
        {
            throw new IllegalStateException("not initialised for signing");
        }
        BigInteger biginteger = ((ECPrivateKeyParameters)b).b().c();
        int i = biginteger.bitLength();
        abyte0 = new BigInteger(1, abyte0);
        int j = abyte0.bitLength();
        ECPrivateKeyParameters ecprivatekeyparameters = (ECPrivateKeyParameters)b;
        if (j > i)
        {
            throw new DataLengthException("input too large for ECNR key.");
        }
        Object obj;
        BigInteger biginteger1;
        do
        {
            obj = new ECKeyPairGenerator();
            ((ECKeyPairGenerator) (obj)).a(new ECKeyGenerationParameters(ecprivatekeyparameters.b(), c));
            obj = ((ECKeyPairGenerator) (obj)).a();
            biginteger1 = ((ECPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).a()).c().b().a().add(abyte0).mod(biginteger);
        } while (biginteger1.equals(ECConstants.f));
        abyte0 = ecprivatekeyparameters.c();
        return (new BigInteger[] {
            biginteger1, ((ECPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).b()).c().subtract(biginteger1.multiply(abyte0)).mod(biginteger)
        });
    }
}
