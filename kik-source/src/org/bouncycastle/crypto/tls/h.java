// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerInputStream;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            i, p, SecurityParameters, TlsSignerCredentials, 
//            TlsFatalAlert, TlsClientContext, TlsUtils, NamedCurve, 
//            CertificateRequest, TlsCredentials

final class h extends i
{

    h(TlsClientContext tlsclientcontext, int j)
    {
        super(tlsclientcontext, j);
    }

    protected final Signer initSigner(p p1, SecurityParameters securityparameters)
    {
        p1 = p1.createVerifyer(d);
        p1.update(securityparameters.a, 0, securityparameters.a.length);
        p1.update(securityparameters.b, 0, securityparameters.b.length);
        return p1;
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

    public final void processServerKeyExchange(InputStream inputstream)
    {
        Object obj = a.getSecurityParameters();
        obj = initSigner(c, ((SecurityParameters) (obj)));
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
                e = validateECPublicKey(new ECPublicKeyParameters(ecdomainparameters.getCurve().a(abyte0), ecdomainparameters));
                return;
            }
        } else
        {
            throw new TlsFatalAlert((short)40);
        }
    }

    public final void skipServerKeyExchange()
    {
        throw new TlsFatalAlert((short)10);
    }

    public final void validateCertificateRequest(CertificateRequest certificaterequest)
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
            case 64: // '@'
                j++;
                break;
            }
        } while (true);
    }
}
