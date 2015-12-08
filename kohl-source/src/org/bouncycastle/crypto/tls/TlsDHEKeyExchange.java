// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerInputStream;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsDHKeyExchange, TlsSigner, SecurityParameters, TlsClientContext, 
//            TlsUtils, TlsFatalAlert

class TlsDHEKeyExchange extends TlsDHKeyExchange
{

    TlsDHEKeyExchange(TlsClientContext tlsclientcontext, int i)
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

    public void processServerKeyExchange(InputStream inputstream)
        throws IOException
    {
        SecurityParameters securityparameters = context.getSecurityParameters();
        Signer signer = initSigner(tlsSigner, securityparameters);
        SignerInputStream signerinputstream = new SignerInputStream(inputstream, signer);
        byte abyte2[] = TlsUtils.readOpaque16(signerinputstream);
        byte abyte0[] = TlsUtils.readOpaque16(signerinputstream);
        byte abyte1[] = TlsUtils.readOpaque16(signerinputstream);
        if (!signer.verifySignature(TlsUtils.readOpaque16(inputstream)))
        {
            throw new TlsFatalAlert((short)42);
        } else
        {
            inputstream = new BigInteger(1, abyte2);
            BigInteger biginteger = new BigInteger(1, abyte0);
            dhAgreeServerPublicKey = validateDHPublicKey(new DHPublicKeyParameters(new BigInteger(1, abyte1), new DHParameters(inputstream, biginteger)));
            return;
        }
    }

    public void skipServerKeyExchange()
        throws IOException
    {
        throw new TlsFatalAlert((short)10);
    }
}
