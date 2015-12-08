// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerInputStream;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsECDHKeyExchange, TlsSigner, SecurityParameters, TlsSignerCredentials, 
//            TlsFatalAlert, TlsClientContext, TlsUtils, NamedCurve, 
//            CertificateRequest, TlsCredentials

class TlsECDHEKeyExchange extends TlsECDHKeyExchange
{

    TlsECDHEKeyExchange(TlsClientContext tlsclientcontext, int i)
    {
        super(tlsclientcontext, i);
    }

    protected Signer initSigner(TlsSigner tlssigner, SecurityParameters securityparameters)
    {
        tlssigner = tlssigner.createVerifyer(serverPublicKey);
        tlssigner.update(securityparameters.clientRandom, 0, securityparameters.clientRandom.length);
        tlssigner.update(securityparameters.serverRandom, 0, securityparameters.serverRandom.length);
        return tlssigner;
    }

    public void processClientCredentials(TlsCredentials tlscredentials)
        throws IOException
    {
        if (tlscredentials instanceof TlsSignerCredentials)
        {
            return;
        } else
        {
            throw new TlsFatalAlert((short)80);
        }
    }

    public void processServerKeyExchange(InputStream inputstream)
        throws IOException
    {
        Object obj = context.getSecurityParameters();
        obj = initSigner(tlsSigner, ((SecurityParameters) (obj)));
        SignerInputStream signerinputstream = new SignerInputStream(inputstream, ((Signer) (obj)));
        if (TlsUtils.readUint8(signerinputstream) == 3)
        {
            ECDomainParameters ecdomainparameters = NamedCurve.getECParameters(TlsUtils.readUint16(signerinputstream));
            byte abyte0[] = TlsUtils.readOpaque8(signerinputstream);
            if (!((Signer) (obj)).verifySignature(TlsUtils.readOpaque16(inputstream)))
            {
                throw new TlsFatalAlert((short)42);
            } else
            {
                ecAgreeServerPublicKey = validateECPublicKey(new ECPublicKeyParameters(ecdomainparameters.getCurve().decodePoint(abyte0), ecdomainparameters));
                return;
            }
        } else
        {
            throw new TlsFatalAlert((short)40);
        }
    }

    public void skipServerKeyExchange()
        throws IOException
    {
        throw new TlsFatalAlert((short)10);
    }

    public void validateCertificateRequest(CertificateRequest certificaterequest)
        throws IOException
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
}
