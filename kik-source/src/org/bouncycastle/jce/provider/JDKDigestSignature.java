// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
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

// Referenced classes of package org.bouncycastle.jce.provider:
//            g

public class JDKDigestSignature extends SignatureSpi
{
    public static class MD2WithRSAEncryption extends JDKDigestSignature
    {

        public MD2WithRSAEncryption()
        {
            super(PKCSObjectIdentifiers.E, new MD2Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD4WithRSAEncryption extends JDKDigestSignature
    {

        public MD4WithRSAEncryption()
        {
            super(PKCSObjectIdentifiers.F, new MD4Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD5WithRSAEncryption extends JDKDigestSignature
    {

        public MD5WithRSAEncryption()
        {
            super(PKCSObjectIdentifiers.G, new MD5Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD128WithRSAEncryption extends JDKDigestSignature
    {

        public RIPEMD128WithRSAEncryption()
        {
            super(TeleTrusTObjectIdentifiers.c, new RIPEMD128Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD160WithRSAEncryption extends JDKDigestSignature
    {

        public RIPEMD160WithRSAEncryption()
        {
            super(TeleTrusTObjectIdentifiers.b, new RIPEMD160Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD256WithRSAEncryption extends JDKDigestSignature
    {

        public RIPEMD256WithRSAEncryption()
        {
            super(TeleTrusTObjectIdentifiers.d, new RIPEMD256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA1WithRSAEncryption extends JDKDigestSignature
    {

        public SHA1WithRSAEncryption()
        {
            super(X509ObjectIdentifiers.i, new SHA1Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA224WithRSAEncryption extends JDKDigestSignature
    {

        public SHA224WithRSAEncryption()
        {
            super(NISTObjectIdentifiers.e, new SHA224Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA256WithRSAEncryption extends JDKDigestSignature
    {

        public SHA256WithRSAEncryption()
        {
            super(NISTObjectIdentifiers.b, new SHA256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA384WithRSAEncryption extends JDKDigestSignature
    {

        public SHA384WithRSAEncryption()
        {
            super(NISTObjectIdentifiers.c, new SHA384Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512WithRSAEncryption extends JDKDigestSignature
    {

        public SHA512WithRSAEncryption()
        {
            super(NISTObjectIdentifiers.d, new SHA512Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class noneRSA extends JDKDigestSignature
    {

        public noneRSA()
        {
            super(new NullDigest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }


    private Digest a;
    private AsymmetricBlockCipher b;
    private AlgorithmIdentifier c;

    protected JDKDigestSignature(DERObjectIdentifier derobjectidentifier, Digest digest, AsymmetricBlockCipher asymmetricblockcipher)
    {
        a = digest;
        b = asymmetricblockcipher;
        c = new AlgorithmIdentifier(derobjectidentifier, DERNull.b);
    }

    protected JDKDigestSignature(Digest digest, AsymmetricBlockCipher asymmetricblockcipher)
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
            privatekey = g.a((RSAPrivateKey)privatekey);
            a.reset();
            b.init(true, privatekey);
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
            publickey = g.a((RSAPublicKey)publickey);
            a.reset();
            b.init(false, publickey);
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
        byte abyte0[] = new byte[a.getDigestSize()];
        a.doFinal(abyte0, 0);
        try
        {
            abyte0 = a(abyte0);
            abyte0 = b.processBlock(abyte0, 0, abyte0.length);
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
        a.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[a.getDigestSize()];
        a.doFinal(abyte1, 0);
        byte abyte2[];
        int i;
        int j;
        int k;
        int l;
        try
        {
            abyte0 = b.processBlock(abyte0, 0, abyte0.length);
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
