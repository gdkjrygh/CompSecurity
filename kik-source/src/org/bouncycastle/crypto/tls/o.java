// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.bouncycastle.crypto.agreement.srp.SRP6Util;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.io.SignerInputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, n, g, TlsUtils, 
//            TlsFatalAlert, p, SecurityParameters, Certificate, 
//            TlsClientContext, TlsCredentials, CertificateRequest

final class o
    implements TlsKeyExchange
{

    protected TlsClientContext a;
    protected int b;
    protected p c;
    protected byte d[];
    protected byte e[];
    protected AsymmetricKeyParameter f;
    protected byte g[];
    protected BigInteger h;
    protected SRP6Client i;

    o(TlsClientContext tlsclientcontext, int j, byte abyte0[], byte abyte1[])
    {
        f = null;
        g = null;
        h = null;
        i = new SRP6Client();
        j;
        JVM INSTR tableswitch 21 23: default 56
    //                   21 66
    //                   22 107
    //                   23 93;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("unsupported key exchange algorithm");
_L2:
        c = null;
_L6:
        a = tlsclientcontext;
        b = j;
        d = abyte0;
        e = abyte1;
        return;
_L4:
        c = new n();
        continue; /* Loop/switch isn't completed */
_L3:
        c = new g();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void generateClientKeyExchange(OutputStream outputstream)
    {
        byte abyte0[] = BigIntegers.a(i.generateClientCredentials(g, d, e));
        TlsUtils.writeUint24(abyte0.length + 2, outputstream);
        TlsUtils.writeOpaque16(abyte0, outputstream);
    }

    public final byte[] generatePremasterSecret()
    {
        byte abyte0[];
        try
        {
            abyte0 = BigIntegers.a(i.calculateSecret(h));
        }
        catch (CryptoException cryptoexception)
        {
            throw new TlsFatalAlert((short)47);
        }
        return abyte0;
    }

    protected final Signer initSigner(p p1, SecurityParameters securityparameters)
    {
        p1 = p1.createVerifyer(f);
        p1.update(securityparameters.a, 0, securityparameters.a.length);
        p1.update(securityparameters.b, 0, securityparameters.b.length);
        return p1;
    }

    public final void processClientCredentials(TlsCredentials tlscredentials)
    {
        throw new TlsFatalAlert((short)80);
    }

    public final void processServerCertificate(Certificate certificate)
    {
        if (c == null)
        {
            throw new TlsFatalAlert((short)10);
        }
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
        if (!c.isValidPublicKey(f))
        {
            throw new TlsFatalAlert((short)46);
        } else
        {
            TlsUtils.validateKeyUsage(certificate, 128);
            return;
        }
    }

    public final void processServerKeyExchange(InputStream inputstream)
    {
        Object obj1 = a.getSecurityParameters();
        Object obj = null;
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        if (c != null)
        {
            obj = initSigner(c, ((SecurityParameters) (obj1)));
            obj1 = new SignerInputStream(inputstream, ((Signer) (obj)));
        } else
        {
            obj1 = inputstream;
        }
        abyte2 = TlsUtils.readOpaque16(((InputStream) (obj1)));
        abyte1 = TlsUtils.readOpaque16(((InputStream) (obj1)));
        abyte0 = TlsUtils.readOpaque8(((InputStream) (obj1)));
        obj1 = TlsUtils.readOpaque16(((InputStream) (obj1)));
        if (obj != null && !((Signer) (obj)).verifySignature(TlsUtils.readOpaque16(inputstream)))
        {
            throw new TlsFatalAlert((short)42);
        }
        inputstream = new BigInteger(1, abyte2);
        obj = new BigInteger(1, abyte1);
        g = abyte0;
        try
        {
            h = SRP6Util.validatePublicValue(inputstream, new BigInteger(1, ((byte []) (obj1))));
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new TlsFatalAlert((short)47);
        }
        i.init(inputstream, ((BigInteger) (obj)), new SHA1Digest(), a.getSecureRandom());
    }

    public final void skipClientCredentials()
    {
    }

    public final void skipServerCertificate()
    {
        if (c != null)
        {
            throw new TlsFatalAlert((short)10);
        } else
        {
            return;
        }
    }

    public final void skipServerKeyExchange()
    {
        throw new TlsFatalAlert((short)10);
    }

    public final void validateCertificateRequest(CertificateRequest certificaterequest)
    {
        throw new TlsFatalAlert((short)10);
    }
}
