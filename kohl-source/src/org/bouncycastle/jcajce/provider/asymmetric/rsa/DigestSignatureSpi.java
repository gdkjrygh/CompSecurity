// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.RIPEMD256Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.rsa:
//            RSAUtil

public class DigestSignatureSpi extends SignatureSpi
{
    public static class MD2 extends DigestSignatureSpi
    {

        public MD2()
        {
            super(PKCSObjectIdentifiers.md2, new MD2Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD4 extends DigestSignatureSpi
    {

        public MD4()
        {
            super(PKCSObjectIdentifiers.md4, new MD4Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD5 extends DigestSignatureSpi
    {

        public MD5()
        {
            super(PKCSObjectIdentifiers.md5, new MD5Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi
    {

        public RIPEMD128()
        {
            super(TeleTrusTObjectIdentifiers.ripemd128, new RIPEMD128Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi
    {

        public RIPEMD160()
        {
            super(TeleTrusTObjectIdentifiers.ripemd160, new RIPEMD160Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi
    {

        public RIPEMD256()
        {
            super(TeleTrusTObjectIdentifiers.ripemd256, new RIPEMD256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi
    {

        public SHA1()
        {
            super(OIWObjectIdentifiers.idSHA1, new SHA1Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi
    {

        public SHA224()
        {
            super(NISTObjectIdentifiers.id_sha224, new SHA224Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi
    {

        public SHA256()
        {
            super(NISTObjectIdentifiers.id_sha256, new SHA256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi
    {

        public SHA384()
        {
            super(NISTObjectIdentifiers.id_sha384, new SHA384Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi
    {

        public SHA512()
        {
            super(NISTObjectIdentifiers.id_sha512, new SHA512Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi
    {

        public noneRSA()
        {
            super(new NullDigest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }


    private AlgorithmIdentifier algId;
    private AsymmetricBlockCipher cipher;
    private Digest digest;

    protected DigestSignatureSpi(ASN1ObjectIdentifier asn1objectidentifier, Digest digest1, AsymmetricBlockCipher asymmetricblockcipher)
    {
        digest = digest1;
        cipher = asymmetricblockcipher;
        algId = new AlgorithmIdentifier(asn1objectidentifier, DERNull.INSTANCE);
    }

    protected DigestSignatureSpi(Digest digest1, AsymmetricBlockCipher asymmetricblockcipher)
    {
        digest = digest1;
        cipher = asymmetricblockcipher;
        algId = null;
    }

    private byte[] derEncode(byte abyte0[])
        throws IOException
    {
        if (algId == null)
        {
            return abyte0;
        } else
        {
            return (new DigestInfo(algId, abyte0)).getEncoded("DER");
        }
    }

    private String getType(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return obj.getClass().getName();
        }
    }

    protected Object engineGetParameter(String s)
    {
        return null;
    }

    protected AlgorithmParameters engineGetParameters()
    {
        return null;
    }

    protected void engineInitSign(PrivateKey privatekey)
        throws InvalidKeyException
    {
        if (!(privatekey instanceof RSAPrivateKey))
        {
            throw new InvalidKeyException((new StringBuilder()).append("Supplied key (").append(getType(privatekey)).append(") is not a RSAPrivateKey instance").toString());
        } else
        {
            privatekey = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey)privatekey);
            digest.reset();
            cipher.init(true, privatekey);
            return;
        }
    }

    protected void engineInitVerify(PublicKey publickey)
        throws InvalidKeyException
    {
        if (!(publickey instanceof RSAPublicKey))
        {
            throw new InvalidKeyException((new StringBuilder()).append("Supplied key (").append(getType(publickey)).append(") is not a RSAPublicKey instance").toString());
        } else
        {
            publickey = RSAUtil.generatePublicKeyParameter((RSAPublicKey)publickey);
            digest.reset();
            cipher.init(false, publickey);
            return;
        }
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
        throws SignatureException
    {
        byte abyte0[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        try
        {
            abyte0 = derEncode(abyte0);
            abyte0 = cipher.processBlock(abyte0, 0, abyte0.length);
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new SignatureException("key too small for signature type");
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return abyte0;
    }

    protected void engineUpdate(byte byte0)
        throws SignatureException
    {
        digest.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
        throws SignatureException
    {
        digest.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
        throws SignatureException
    {
        byte abyte1[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        byte abyte2[];
        int i;
        int j;
        int k;
        int l;
        try
        {
            abyte0 = cipher.processBlock(abyte0, 0, abyte0.length);
            abyte2 = derEncode(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (abyte0.length != abyte2.length) goto _L2; else goto _L1
_L1:
        i = 0;
_L8:
        if (i >= abyte0.length) goto _L4; else goto _L3
_L3:
        if (abyte0[i] == abyte2[i]) goto _L6; else goto _L5
_L5:
        return false;
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (abyte0.length != abyte2.length - 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = abyte0.length - abyte1.length - 2;
        k = abyte2.length;
        l = abyte1.length;
        abyte2[1] = (byte)(abyte2[1] - 2);
        abyte2[3] = (byte)(abyte2[3] - 2);
        for (i = 0; i < abyte1.length; i++)
        {
            if (abyte0[j + i] != abyte2[(k - l - 2) + i])
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        i = 0;
        do
        {
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (abyte0[i] != abyte2[i])
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
