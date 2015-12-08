// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

public class ECNRSigner
    implements DSA
{

    private boolean a;
    private ECKeyParameters b;
    private SecureRandom c;

    public ECNRSigner()
    {
    }

    public BigInteger[] generateSignature(byte abyte0[])
    {
        if (!a)
        {
            throw new IllegalStateException("not initialised for signing");
        }
        BigInteger biginteger = ((ECPrivateKeyParameters)b).getParameters().getN();
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
            ((ECKeyPairGenerator) (obj)).init(new ECKeyGenerationParameters(ecprivatekeyparameters.getParameters(), c));
            obj = ((ECKeyPairGenerator) (obj)).generateKeyPair();
            biginteger1 = ((ECPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic()).getQ().b().a().add(abyte0).mod(biginteger);
        } while (biginteger1.equals(ECConstants.f));
        abyte0 = ecprivatekeyparameters.getD();
        return (new BigInteger[] {
            biginteger1, ((ECPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate()).getD().subtract(biginteger1.multiply(abyte0)).mod(biginteger)
        });
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        a = flag;
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                c = cipherparameters.getRandom();
                b = (ECPrivateKeyParameters)cipherparameters.getParameters();
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

    public boolean verifySignature(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        if (a)
        {
            throw new IllegalStateException("not initialised for verifying");
        }
        ECPublicKeyParameters ecpublickeyparameters = (ECPublicKeyParameters)b;
        BigInteger biginteger2 = ecpublickeyparameters.getParameters().getN();
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
            return biginteger.subtract(ECAlgorithms.a(ecpublickeyparameters.getParameters().getG(), biginteger1, ecpublickeyparameters.getQ(), biginteger).b().a()).mod(biginteger2).equals(abyte0);
        }
    }
}
