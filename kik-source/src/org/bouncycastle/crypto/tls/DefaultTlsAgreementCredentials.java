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

    protected Certificate a;
    protected AsymmetricKeyParameter b;
    protected BasicAgreement c;

    public DefaultTlsAgreementCredentials(Certificate certificate, AsymmetricKeyParameter asymmetrickeyparameter)
    {
        if (certificate == null)
        {
            throw new IllegalArgumentException("'clientCertificate' cannot be null");
        }
        if (certificate.b.length == 0)
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
            c = new DHBasicAgreement();
        } else
        if (asymmetrickeyparameter instanceof ECPrivateKeyParameters)
        {
            c = new ECDHBasicAgreement();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("'clientPrivateKey' type not supported: ")).append(asymmetrickeyparameter.getClass().getName()).toString());
        }
        a = certificate;
        b = asymmetrickeyparameter;
    }

    public byte[] generateAgreement(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        c.init(b);
        return BigIntegers.a(c.calculateAgreement(asymmetrickeyparameter));
    }

    public Certificate getCertificate()
    {
        return a;
    }
}
