// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsUtils, TlsFatalAlert

public class TlsDHUtils
{

    static final BigInteger ONE = BigInteger.valueOf(1L);
    static final BigInteger TWO = BigInteger.valueOf(2L);

    public TlsDHUtils()
    {
    }

    public static byte[] calculateDHBasicAgreement(DHPublicKeyParameters dhpublickeyparameters, DHPrivateKeyParameters dhprivatekeyparameters)
    {
        DHBasicAgreement dhbasicagreement = new DHBasicAgreement();
        dhbasicagreement.init(dhprivatekeyparameters);
        return BigIntegers.asUnsignedByteArray(dhbasicagreement.calculateAgreement(dhpublickeyparameters));
    }

    public static AsymmetricCipherKeyPair generateDHKeyPair(SecureRandom securerandom, DHParameters dhparameters)
    {
        DHBasicKeyPairGenerator dhbasickeypairgenerator = new DHBasicKeyPairGenerator();
        dhbasickeypairgenerator.init(new DHKeyGenerationParameters(securerandom, dhparameters));
        return dhbasickeypairgenerator.generateKeyPair();
    }

    public static DHPrivateKeyParameters generateEphemeralClientKeyExchange(SecureRandom securerandom, DHParameters dhparameters, OutputStream outputstream)
        throws IOException
    {
        securerandom = generateDHKeyPair(securerandom, dhparameters);
        dhparameters = (DHPrivateKeyParameters)securerandom.getPrivate();
        TlsUtils.writeOpaque16(BigIntegers.asUnsignedByteArray(((DHPublicKeyParameters)securerandom.getPublic()).getY()), outputstream);
        return dhparameters;
    }

    public static DHPublicKeyParameters validateDHPublicKey(DHPublicKeyParameters dhpublickeyparameters)
        throws IOException
    {
        BigInteger biginteger = dhpublickeyparameters.getY();
        Object obj = dhpublickeyparameters.getParameters();
        BigInteger biginteger1 = ((DHParameters) (obj)).getP();
        obj = ((DHParameters) (obj)).getG();
        if (!biginteger1.isProbablePrime(2))
        {
            throw new TlsFatalAlert((short)47);
        }
        if (((BigInteger) (obj)).compareTo(TWO) < 0 || ((BigInteger) (obj)).compareTo(biginteger1.subtract(TWO)) > 0)
        {
            throw new TlsFatalAlert((short)47);
        }
        if (biginteger.compareTo(TWO) < 0 || biginteger.compareTo(biginteger1.subtract(ONE)) > 0)
        {
            throw new TlsFatalAlert((short)47);
        } else
        {
            return dhpublickeyparameters;
        }
    }

}
