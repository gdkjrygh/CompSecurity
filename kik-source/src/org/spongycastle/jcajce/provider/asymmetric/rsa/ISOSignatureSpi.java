// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.engines.RSABlindedEngine;
import org.spongycastle.crypto.signers.ISO9796d2Signer;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            RSAUtil

public class ISOSignatureSpi extends SignatureSpi
{
    public static class MD5WithRSAEncryption extends ISOSignatureSpi
    {

        public MD5WithRSAEncryption()
        {
            super(new MD5Digest(), new RSABlindedEngine());
        }
    }

    public static class RIPEMD160WithRSAEncryption extends ISOSignatureSpi
    {

        public RIPEMD160WithRSAEncryption()
        {
            super(new RIPEMD160Digest(), new RSABlindedEngine());
        }
    }

    public static class SHA1WithRSAEncryption extends ISOSignatureSpi
    {

        public SHA1WithRSAEncryption()
        {
            super(new SHA1Digest(), new RSABlindedEngine());
        }
    }


    private ISO9796d2Signer a;

    protected ISOSignatureSpi(Digest digest, AsymmetricBlockCipher asymmetricblockcipher)
    {
        a = new ISO9796d2Signer(asymmetricblockcipher, digest);
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        privatekey = RSAUtil.a((RSAPrivateKey)privatekey);
        a.a(true, privatekey);
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        publickey = RSAUtil.a((RSAPublicKey)publickey);
        a.a(false, publickey);
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
            abyte0 = a.a();
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return abyte0;
    }

    protected void engineUpdate(byte byte0)
    {
        a.a(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        return a.a(abyte0);
    }
}
