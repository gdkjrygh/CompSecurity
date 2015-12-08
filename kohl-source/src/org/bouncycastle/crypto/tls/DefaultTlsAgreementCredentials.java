// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsAgreementCredentials, Certificate

public class DefaultTlsAgreementCredentials
    implements TlsAgreementCredentials
{

    protected BasicAgreement basicAgreement;
    protected Certificate clientCert;
    protected AsymmetricKeyParameter clientPrivateKey;

    public DefaultTlsAgreementCredentials(Certificate certificate, AsymmetricKeyParameter asymmetrickeyparameter)
    {
        if (certificate == null)
        {
            throw new IllegalArgumentException("'clientCertificate' cannot be null");
        }
        if (certificate.certs.length == 0)
        {
            throw new IllegalArgumentException("'clientCertificate' cannot be empty");
        }
        if (asymmetrickeyparameter == null)
        {
            throw new IllegalArgumentException("'clientPrivateKey' cannot be null");
        }
        if (!asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("'clientPrivateKey' must be private");
        }
        if (asymmetrickeyparameter instanceof DHPrivateKeyParameters)
        {
            basicAgreement = new DHBasicAgreement();
        } else
        if (asymmetrickeyparameter instanceof ECPrivateKeyParameters)
        {
            basicAgreement = new ECDHBasicAgreement();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("'clientPrivateKey' type not supported: ").append(asymmetrickeyparameter.getClass().getName()).toString());
        }
        clientCert = certificate;
        clientPrivateKey = asymmetrickeyparameter;
    }

    public byte[] generateAgreement(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        basicAgreement.init(clientPrivateKey);
        return BigIntegers.asUnsignedByteArray(basicAgreement.calculateAgreement(asymmetrickeyparameter));
    }

    public Certificate getCertificate()
    {
        return clientCert;
    }
}
