// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.GenericSigner;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsSigner, CombinedHash

class TlsRSASigner
    implements TlsSigner
{

    TlsRSASigner()
    {
    }

    public byte[] calculateRawSignature(SecureRandom securerandom, AsymmetricKeyParameter asymmetrickeyparameter, byte abyte0[])
        throws CryptoException
    {
        GenericSigner genericsigner = new GenericSigner(new PKCS1Encoding(new RSABlindedEngine()), new NullDigest());
        genericsigner.init(true, new ParametersWithRandom(asymmetrickeyparameter, securerandom));
        genericsigner.update(abyte0, 0, abyte0.length);
        return genericsigner.generateSignature();
    }

    public Signer createVerifyer(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        GenericSigner genericsigner = new GenericSigner(new PKCS1Encoding(new RSABlindedEngine()), new CombinedHash());
        genericsigner.init(false, asymmetrickeyparameter);
        return genericsigner;
    }

    public boolean isValidPublicKey(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        return (asymmetrickeyparameter instanceof RSAKeyParameters) && !asymmetrickeyparameter.isPrivate();
    }
}
