// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsSignerCredentials, Certificate, TlsRSASigner, TlsDSSSigner, 
//            TlsECDSASigner, TlsClientContext, TlsSigner, TlsFatalAlert

public class DefaultTlsSignerCredentials
    implements TlsSignerCredentials
{

    protected Certificate clientCert;
    protected AsymmetricKeyParameter clientPrivateKey;
    protected TlsSigner clientSigner;
    protected TlsClientContext context;

    public DefaultTlsSignerCredentials(TlsClientContext tlsclientcontext, Certificate certificate, AsymmetricKeyParameter asymmetrickeyparameter)
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
        if (asymmetrickeyparameter instanceof RSAKeyParameters)
        {
            clientSigner = new TlsRSASigner();
        } else
        if (asymmetrickeyparameter instanceof DSAPrivateKeyParameters)
        {
            clientSigner = new TlsDSSSigner();
        } else
        if (asymmetrickeyparameter instanceof ECPrivateKeyParameters)
        {
            clientSigner = new TlsECDSASigner();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("'clientPrivateKey' type not supported: ").append(asymmetrickeyparameter.getClass().getName()).toString());
        }
        context = tlsclientcontext;
        clientCert = certificate;
        clientPrivateKey = asymmetrickeyparameter;
    }

    public byte[] generateCertificateSignature(byte abyte0[])
        throws IOException
    {
        try
        {
            abyte0 = clientSigner.calculateRawSignature(context.getSecureRandom(), clientPrivateKey, abyte0);
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
        return clientCert;
    }
}
