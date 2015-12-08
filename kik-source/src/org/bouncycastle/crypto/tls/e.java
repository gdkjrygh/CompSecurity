// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, n, g, TlsUtils, 
//            TlsClientContext, TlsAgreementCredentials, TlsSignerCredentials, TlsFatalAlert, 
//            Certificate, p, CertificateRequest, TlsCredentials

class e
    implements TlsKeyExchange
{

    protected static final BigInteger a = BigInteger.valueOf(1L);
    protected static final BigInteger b = BigInteger.valueOf(2L);
    protected TlsClientContext c;
    protected int d;
    protected p e;
    protected AsymmetricKeyParameter f;
    protected DHPublicKeyParameters g;
    protected TlsAgreementCredentials h;
    protected DHPrivateKeyParameters i;

    e(TlsClientContext tlsclientcontext, int j)
    {
        f = null;
        g = null;
        i = null;
        j;
        JVM INSTR tableswitch 3 9: default 64
    //                   3 104
    //                   4 64
    //                   5 90
    //                   6 64
    //                   7 74
    //                   8 64
    //                   9 74;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L1 _L4
_L1:
        throw new IllegalArgumentException("unsupported key exchange algorithm");
_L4:
        e = null;
_L6:
        c = tlsclientcontext;
        d = j;
        return;
_L3:
        e = new n();
        continue; /* Loop/switch isn't completed */
_L2:
        e = new g();
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected boolean areCompatibleParameters(DHParameters dhparameters, DHParameters dhparameters1)
    {
        return dhparameters.getP().equals(dhparameters1.getP()) && dhparameters.getG().equals(dhparameters1.getG());
    }

    protected byte[] calculateDHBasicAgreement(DHPublicKeyParameters dhpublickeyparameters, DHPrivateKeyParameters dhprivatekeyparameters)
    {
        dhpublickeyparameters = new DHBasicAgreement();
        dhpublickeyparameters.init(i);
        return BigIntegers.a(dhpublickeyparameters.calculateAgreement(g));
    }

    public void generateClientKeyExchange(OutputStream outputstream)
    {
        if (h != null)
        {
            TlsUtils.writeUint24(0, outputstream);
            return;
        } else
        {
            generateEphemeralClientKeyExchange(g.getParameters(), outputstream);
            return;
        }
    }

    protected AsymmetricCipherKeyPair generateDHKeyPair(DHParameters dhparameters)
    {
        DHBasicKeyPairGenerator dhbasickeypairgenerator = new DHBasicKeyPairGenerator();
        dhbasickeypairgenerator.init(new DHKeyGenerationParameters(c.getSecureRandom(), dhparameters));
        return dhbasickeypairgenerator.generateKeyPair();
    }

    protected void generateEphemeralClientKeyExchange(DHParameters dhparameters, OutputStream outputstream)
    {
        dhparameters = generateDHKeyPair(dhparameters);
        i = (DHPrivateKeyParameters)dhparameters.getPrivate();
        dhparameters = BigIntegers.a(((DHPublicKeyParameters)dhparameters.getPublic()).getY());
        TlsUtils.writeUint24(dhparameters.length + 2, outputstream);
        TlsUtils.writeOpaque16(dhparameters, outputstream);
    }

    public byte[] generatePremasterSecret()
    {
        if (h != null)
        {
            return h.generateAgreement(g);
        } else
        {
            return calculateDHBasicAgreement(g, i);
        }
    }

    public void processClientCredentials(TlsCredentials tlscredentials)
    {
        if (tlscredentials instanceof TlsAgreementCredentials)
        {
            h = (TlsAgreementCredentials)tlscredentials;
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
            f = PublicKeyFactory.createKey(subjectpublickeyinfo);
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            throw new TlsFatalAlert((short)43);
        }
        if (e == null)
        {
            try
            {
                g = validateDHPublicKey((DHPublicKeyParameters)f);
            }
            // Misplaced declaration of an exception variable
            catch (Certificate certificate)
            {
                throw new TlsFatalAlert((short)46);
            }
            TlsUtils.validateKeyUsage(certificate, 8);
            return;
        }
        if (!e.isValidPublicKey(f))
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
        h = null;
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
        int j = 0;
        do
        {
            if (j >= certificaterequest.length)
            {
                break;
            }
            switch (certificaterequest[j])
            {
            default:
                throw new TlsFatalAlert((short)47);

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 64: // '@'
                j++;
                break;
            }
        } while (true);
    }

    protected DHPublicKeyParameters validateDHPublicKey(DHPublicKeyParameters dhpublickeyparameters)
    {
        BigInteger biginteger = dhpublickeyparameters.getY();
        Object obj = dhpublickeyparameters.getParameters();
        BigInteger biginteger1 = ((DHParameters) (obj)).getP();
        obj = ((DHParameters) (obj)).getG();
        if (!biginteger1.isProbablePrime(2))
        {
            throw new TlsFatalAlert((short)47);
        }
        if (((BigInteger) (obj)).compareTo(b) < 0 || ((BigInteger) (obj)).compareTo(biginteger1.subtract(b)) > 0)
        {
            throw new TlsFatalAlert((short)47);
        }
        if (biginteger.compareTo(b) < 0 || biginteger.compareTo(biginteger1.subtract(a)) > 0)
        {
            throw new TlsFatalAlert((short)47);
        } else
        {
            return dhpublickeyparameters;
        }
    }

}
