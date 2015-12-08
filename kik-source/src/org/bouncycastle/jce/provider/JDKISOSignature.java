// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.signers.ISO9796d2Signer;

// Referenced classes of package org.bouncycastle.jce.provider:
//            g

public class JDKISOSignature extends SignatureSpi
{
    public static class MD5WithRSAEncryption extends JDKISOSignature
    {

        public MD5WithRSAEncryption()
        {
            super(new MD5Digest(), new RSABlindedEngine());
        }
    }

    public static class RIPEMD160WithRSAEncryption extends JDKISOSignature
    {

        public RIPEMD160WithRSAEncryption()
        {
            super(new RIPEMD160Digest(), new RSABlindedEngine());
        }
    }

    public static class SHA1WithRSAEncryption extends JDKISOSignature
    {

        public SHA1WithRSAEncryption()
        {
            super(new SHA1Digest(), new RSABlindedEngine());
        }
    }


    private ISO9796d2Signer a;

    protected JDKISOSignature(Digest digest, AsymmetricBlockCipher asymmetricblockcipher)
    {
        a = new ISO9796d2Signer(asymmetricblockcipher, digest, true);
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        privatekey = g.a((RSAPrivateKey)privatekey);
        a.init(true, privatekey);
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        publickey = g.a((RSAPublicKey)publickey);
        a.init(false, publickey);
    }

    protected void engineSetParameter(String s, Object obj)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmparameterspec)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected byte[] engineSign()
    {
        byte abyte0[];
        try
        {
            abyte0 = a.generateSignature();
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return abyte0;
    }

    protected void engineUpdate(byte byte0)
    {
        a.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        return a.verifySignature(abyte0);
    }
}
