// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, TlsClientContext, TlsUtils, TlsFatalAlert, 
//            TlsSignerCredentials, Certificate, CertificateRequest, TlsCredentials

final class m
    implements TlsKeyExchange
{

    protected TlsClientContext a;
    protected AsymmetricKeyParameter b;
    protected RSAKeyParameters c;
    protected byte d[];

    m(TlsClientContext tlsclientcontext)
    {
        b = null;
        c = null;
        a = tlsclientcontext;
    }

    public final void generateClientKeyExchange(OutputStream outputstream)
    {
        d = new byte[48];
        a.getSecureRandom().nextBytes(d);
        TlsUtils.writeVersion(d, 0);
        PKCS1Encoding pkcs1encoding = new PKCS1Encoding(new RSABlindedEngine());
        pkcs1encoding.init(true, new ParametersWithRandom(c, a.getSecureRandom()));
        try
        {
            byte abyte0[] = pkcs1encoding.processBlock(d, 0, d.length);
            TlsUtils.writeUint24(abyte0.length + 2, outputstream);
            TlsUtils.writeOpaque16(abyte0, outputstream);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new TlsFatalAlert((short)80);
        }
    }

    public final byte[] generatePremasterSecret()
    {
        byte abyte0[] = d;
        d = null;
        return abyte0;
    }

    public final void processClientCredentials(TlsCredentials tlscredentials)
    {
        if (!(tlscredentials instanceof TlsSignerCredentials))
        {
            throw new TlsFatalAlert((short)80);
        } else
        {
            return;
        }
    }

    public final void processServerCertificate(Certificate certificate)
    {
        certificate = certificate.b[0];
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectpublickeyinfo = certificate.l();
        try
        {
            b = PublicKeyFactory.createKey(subjectpublickeyinfo);
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            throw new TlsFatalAlert((short)43);
        }
        if (b.isPrivate())
        {
            throw new TlsFatalAlert((short)80);
        } else
        {
            c = validateRSAPublicKey((RSAKeyParameters)b);
            TlsUtils.validateKeyUsage(certificate, 32);
            return;
        }
    }

    public final void processServerKeyExchange(InputStream inputstream)
    {
        throw new TlsFatalAlert((short)10);
    }

    public final void skipClientCredentials()
    {
    }

    public final void skipServerCertificate()
    {
        throw new TlsFatalAlert((short)10);
    }

    public final void skipServerKeyExchange()
    {
    }

    public final void validateCertificateRequest(CertificateRequest certificaterequest)
    {
        certificaterequest = certificaterequest.getCertificateTypes();
        int i = 0;
        do
        {
            if (i >= certificaterequest.length)
            {
                break;
            }
            switch (certificaterequest[i])
            {
            default:
                throw new TlsFatalAlert((short)47);

            case 1: // '\001'
            case 2: // '\002'
            case 64: // '@'
                i++;
                break;
            }
        } while (true);
    }

    protected final RSAKeyParameters validateRSAPublicKey(RSAKeyParameters rsakeyparameters)
    {
        if (!rsakeyparameters.getExponent().isProbablePrime(2))
        {
            throw new TlsFatalAlert((short)47);
        } else
        {
            return rsakeyparameters;
        }
    }
}
