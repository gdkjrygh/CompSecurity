// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsSignerCredentials, Certificate, n, g, 
//            j, TlsClientContext, p, TlsFatalAlert

public class DefaultTlsSignerCredentials
    implements TlsSignerCredentials
{

    protected TlsClientContext a;
    protected Certificate b;
    protected AsymmetricKeyParameter c;
    protected p d;

    public DefaultTlsSignerCredentials(TlsClientContext tlsclientcontext, Certificate certificate, AsymmetricKeyParameter asymmetrickeyparameter)
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
        if (asymmetrickeyparameter instanceof RSAKeyParameters)
        {
            d = new n();
        } else
        if (asymmetrickeyparameter instanceof DSAPrivateKeyParameters)
        {
            d = new g();
        } else
        if (asymmetrickeyparameter instanceof ECPrivateKeyParameters)
        {
            d = new j();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("'clientPrivateKey' type not supported: ")).append(asymmetrickeyparameter.getClass().getName()).toString());
        }
        a = tlsclientcontext;
        b = certificate;
        c = asymmetrickeyparameter;
    }

    public byte[] generateCertificateSignature(byte abyte0[])
    {
        try
        {
            abyte0 = d.calculateRawSignature(a.getSecureRandom(), c, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new TlsFatalAlert((short)80);
        }
        return abyte0;
    }

    public Certificate getCertificate()
    {
        return b;
    }
}
