// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSADigestSigner;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsSigner

abstract class TlsDSASigner
    implements TlsSigner
{

    TlsDSASigner()
    {
    }

    public byte[] calculateRawSignature(SecureRandom securerandom, AsymmetricKeyParameter asymmetrickeyparameter, byte abyte0[])
        throws CryptoException
    {
        DSADigestSigner dsadigestsigner = new DSADigestSigner(createDSAImpl(), new NullDigest());
        dsadigestsigner.init(true, new ParametersWithRandom(asymmetrickeyparameter, securerandom));
        dsadigestsigner.update(abyte0, 16, 20);
        return dsadigestsigner.generateSignature();
    }

    protected abstract DSA createDSAImpl();

    public Signer createVerifyer(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        DSADigestSigner dsadigestsigner = new DSADigestSigner(createDSAImpl(), new SHA1Digest());
        dsadigestsigner.init(false, asymmetrickeyparameter);
        return dsadigestsigner;
    }
}
