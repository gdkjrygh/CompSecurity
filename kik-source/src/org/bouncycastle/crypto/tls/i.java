// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, n, j, TlsUtils, 
//            TlsClientContext, TlsAgreementCredentials, TlsSignerCredentials, TlsFatalAlert, 
//            Certificate, p, CertificateRequest, TlsCredentials

class i
    implements TlsKeyExchange
{

    protected TlsClientContext a;
    protected int b;
    protected p c;
    protected AsymmetricKeyParameter d;
    protected ECPublicKeyParameters e;
    protected TlsAgreementCredentials f;
    protected ECPrivateKeyParameters g;

    i(TlsClientContext tlsclientcontext, int k)
    {
        g = null;
        k;
        JVM INSTR tableswitch 16 19: default 40
    //                   16 86
    //                   17 72
    //                   18 86
    //                   19 50;
           goto _L1 _L2 _L3 _L2 _L4
_L1:
        throw new IllegalArgumentException("unsupported key exchange algorithm");
_L4:
        c = new n();
_L6:
        a = tlsclientcontext;
        b = k;
        return;
_L3:
        c = new j();
        continue; /* Loop/switch isn't completed */
_L2:
        c = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected boolean areOnSameCurve(ECDomainParameters ecdomainparameters, ECDomainParameters ecdomainparameters1)
    {
        return ecdomainparameters.getCurve().equals(ecdomainparameters1.getCurve()) && ecdomainparameters.getG().equals(ecdomainparameters1.getG()) && ecdomainparameters.getN().equals(ecdomainparameters1.getN()) && ecdomainparameters.getH().equals(ecdomainparameters1.getH());
    }

    protected byte[] calculateECDHBasicAgreement(ECPublicKeyParameters ecpublickeyparameters, ECPrivateKeyParameters ecprivatekeyparameters)
    {
        ECDHBasicAgreement ecdhbasicagreement = new ECDHBasicAgreement();
        ecdhbasicagreement.init(ecprivatekeyparameters);
        return BigIntegers.a(ecdhbasicagreement.calculateAgreement(ecpublickeyparameters));
    }

    protected byte[] externalizeKey(ECPublicKeyParameters ecpublickeyparameters)
    {
        return ecpublickeyparameters.getQ().f();
    }

    public void generateClientKeyExchange(OutputStream outputstream)
    {
        if (f != null)
        {
            TlsUtils.writeUint24(0, outputstream);
            return;
        } else
        {
            generateEphemeralClientKeyExchange(e.getParameters(), outputstream);
            return;
        }
    }

    protected AsymmetricCipherKeyPair generateECKeyPair(ECDomainParameters ecdomainparameters)
    {
        ECKeyPairGenerator eckeypairgenerator = new ECKeyPairGenerator();
        eckeypairgenerator.init(new ECKeyGenerationParameters(ecdomainparameters, a.getSecureRandom()));
        return eckeypairgenerator.generateKeyPair();
    }

    protected void generateEphemeralClientKeyExchange(ECDomainParameters ecdomainparameters, OutputStream outputstream)
    {
        ecdomainparameters = generateECKeyPair(ecdomainparameters);
        g = (ECPrivateKeyParameters)ecdomainparameters.getPrivate();
        ecdomainparameters = externalizeKey((ECPublicKeyParameters)ecdomainparameters.getPublic());
        TlsUtils.writeUint24(ecdomainparameters.length + 1, outputstream);
        TlsUtils.writeOpaque8(ecdomainparameters, outputstream);
    }

    public byte[] generatePremasterSecret()
    {
        if (f != null)
        {
            return f.generateAgreement(e);
        } else
        {
            return calculateECDHBasicAgreement(e, g);
        }
    }

    public void processClientCredentials(TlsCredentials tlscredentials)
    {
        if (tlscredentials instanceof TlsAgreementCredentials)
        {
            f = (TlsAgreementCredentials)tlscredentials;
        } else
        if (!(tlscredentials instanceof TlsSignerCredentials))
        {
            throw new TlsFatalAlert((short)80);
        }
    }

    public void processServerCertificate(Certificate certificate)
    {
        certificate = certificate.b[0];
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectpublickeyinfo = certificate.l();
        try
        {
            d = PublicKeyFactory.createKey(subjectpublickeyinfo);
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            throw new TlsFatalAlert((short)43);
        }
        if (c == null)
        {
            try
            {
                e = validateECPublicKey((ECPublicKeyParameters)d);
            }
            // Misplaced declaration of an exception variable
            catch (Certificate certificate)
            {
                throw new TlsFatalAlert((short)46);
            }
            TlsUtils.validateKeyUsage(certificate, 8);
            return;
        }
        if (!c.isValidPublicKey(d))
        {
            throw new TlsFatalAlert((short)46);
        } else
        {
            TlsUtils.validateKeyUsage(certificate, 128);
            return;
        }
    }

    public void processServerKeyExchange(InputStream inputstream)
    {
        throw new TlsFatalAlert((short)10);
    }

    public void skipClientCredentials()
    {
        f = null;
    }

    public void skipServerCertificate()
    {
        throw new TlsFatalAlert((short)10);
    }

    public void skipServerKeyExchange()
    {
    }

    public void validateCertificateRequest(CertificateRequest certificaterequest)
    {
        certificaterequest = certificaterequest.getCertificateTypes();
        int k = 0;
        do
        {
            if (k >= certificaterequest.length)
            {
                break;
            }
            switch (certificaterequest[k])
            {
            default:
                throw new TlsFatalAlert((short)47);

            case 1: // '\001'
            case 2: // '\002'
            case 64: // '@'
            case 65: // 'A'
            case 66: // 'B'
                k++;
                break;
            }
        } while (true);
    }

    protected ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters ecpublickeyparameters)
    {
        return ecpublickeyparameters;
    }
}
