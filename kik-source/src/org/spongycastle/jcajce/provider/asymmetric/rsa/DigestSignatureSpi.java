// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD2Digest;
import org.spongycastle.crypto.digests.MD4Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.NullDigest;
import org.spongycastle.crypto.digests.RIPEMD128Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.RIPEMD256Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.encodings.PKCS1Encoding;
import org.spongycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            RSAUtil

public class DigestSignatureSpi extends SignatureSpi
{
    public static class MD2 extends DigestSignatureSpi
    {

        public MD2()
        {
            super(PKCSObjectIdentifiers.E, new MD2Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD4 extends DigestSignatureSpi
    {

        public MD4()
        {
            super(PKCSObjectIdentifiers.F, new MD4Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD5 extends DigestSignatureSpi
    {

        public MD5()
        {
            super(PKCSObjectIdentifiers.G, new MD5Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi
    {

        public RIPEMD128()
        {
            super(TeleTrusTObjectIdentifiers.c, new RIPEMD128Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi
    {

        public RIPEMD160()
        {
            super(TeleTrusTObjectIdentifiers.b, new RIPEMD160Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi
    {

        public RIPEMD256()
        {
            super(TeleTrusTObjectIdentifiers.d, new RIPEMD256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi
    {

        public SHA1()
        {
            super(OIWObjectIdentifiers.i, new SHA1Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi
    {

        public SHA224()
        {
            super(NISTObjectIdentifiers.e, new SHA224Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi
    {

        public SHA256()
        {
            super(NISTObjectIdentifiers.b, new SHA256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi
    {

        public SHA384()
        {
            super(NISTObjectIdentifiers.c, new SHA384Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi
    {

        public SHA512()
        {
            super(NISTObjectIdentifiers.d, new SHA512Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi
    {

        public noneRSA()
        {
            super(new NullDigest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }


    private Digest a;
    private AsymmetricBlockCipher b;
    private AlgorithmIdentifier c;

    protected DigestSignatureSpi(ASN1ObjectIdentifier asn1objectidentifier, Digest digest, AsymmetricBlockCipher asymmetricblockcipher)
    {
        a = digest;
        b = asymmetricblockcipher;
        c = new AlgorithmIdentifier(asn1objectidentifier, DERNull.a);
    }

    protected DigestSignatureSpi(Digest digest, AsymmetricBlockCipher asymmetricblockcipher)
    {
        a = digest;
        b = asymmetricblockcipher;
        c = null;
    }

    private static String a(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return obj.getClass().getName();
        }
    }

    private byte[] a(byte abyte0[])
    {
        if (c == null)
        {
            return abyte0;
        } else
        {
            return (new DigestInfo(c, abyte0)).a("DER");
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
    {
        if (!(privatekey instanceof RSAPrivateKey))
        {
            throw new InvalidKeyException((new StringBuilder("Supplied key (")).append(a(privatekey)).append(") is not a RSAPrivateKey instance").toString());
        } else
        {
            privatekey = RSAUtil.a((RSAPrivateKey)privatekey);
            a.c();
            b.a(true, privatekey);
            return;
        }
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (!(publickey instanceof RSAPublicKey))
        {
            throw new InvalidKeyException((new StringBuilder("Supplied key (")).append(a(publickey)).append(") is not a RSAPublicKey instance").toString());
        } else
        {
            publickey = RSAUtil.a((RSAPublicKey)publickey);
            a.c();
            b.a(false, publickey);
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
    {
        byte abyte0[] = new byte[a.b()];
        a.a(abyte0, 0);
        try
        {
            abyte0 = a(abyte0);
            abyte0 = b.a(abyte0, 0, abyte0.length);
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
    {
        a.a(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[a.b()];
        a.a(abyte1, 0);
        byte abyte2[];
        int i;
        int j;
        int k;
        int l;
        try
        {
            abyte0 = b.a(abyte0, 0, abyte0.length);
            abyte2 = a(abyte1);
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
