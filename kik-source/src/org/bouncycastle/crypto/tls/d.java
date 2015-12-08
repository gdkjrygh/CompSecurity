// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerInputStream;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            e, p, SecurityParameters, TlsClientContext, 
//            TlsUtils, TlsFatalAlert

final class d extends e
{

    d(TlsClientContext tlsclientcontext, int i)
    {
        super(tlsclientcontext, i);
    }

    protected final Signer initSigner(p p1, SecurityParameters securityparameters)
    {
        p1 = p1.createVerifyer(f);
        p1.update(securityparameters.a, 0, securityparameters.a.length);
        p1.update(securityparameters.b, 0, securityparameters.b.length);
        return p1;
    }

    public final void processServerKeyExchange(InputStream inputstream)
    {
        SecurityParameters securityparameters = c.getSecurityParameters();
        Signer signer = initSigner(e, securityparameters);
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
            g = validateDHPublicKey(new DHPublicKeyParameters(new BigInteger(1, abyte1), new DHParameters(inputstream, biginteger)));
            return;
        }
    }

    public final void skipServerKeyExchange()
    {
        throw new TlsFatalAlert((short)10);
    }
}
