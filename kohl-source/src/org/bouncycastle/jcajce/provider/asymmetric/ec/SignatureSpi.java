// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.ECNRSigner;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSAEncoder;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            ECUtil

public class SignatureSpi extends DSABase
{
    private static class CVCDSAEncoder
        implements DSAEncoder
    {

        private byte[] makeUnsigned(BigInteger biginteger)
        {
            biginteger = biginteger.toByteArray();
            if (biginteger[0] == 0)
            {
                byte abyte0[] = new byte[biginteger.length - 1];
                System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
                return abyte0;
            } else
            {
                return biginteger;
            }
        }

        public BigInteger[] decode(byte abyte0[])
            throws IOException
        {
            byte abyte1[] = new byte[abyte0.length / 2];
            byte abyte2[] = new byte[abyte0.length / 2];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
            System.arraycopy(abyte0, abyte1.length, abyte2, 0, abyte2.length);
            return (new BigInteger[] {
                new BigInteger(1, abyte1), new BigInteger(1, abyte2)
            });
        }

        public byte[] encode(BigInteger biginteger, BigInteger biginteger1)
            throws IOException
        {
            byte abyte0[] = makeUnsigned(biginteger);
            biginteger1 = makeUnsigned(biginteger1);
            if (abyte0.length > biginteger1.length)
            {
                biginteger = new byte[abyte0.length * 2];
            } else
            {
                biginteger = new byte[biginteger1.length * 2];
            }
            System.arraycopy(abyte0, 0, biginteger, biginteger.length / 2 - abyte0.length, abyte0.length);
            System.arraycopy(biginteger1, 0, biginteger, biginteger.length - biginteger1.length, biginteger1.length);
            return biginteger;
        }

        private CVCDSAEncoder()
        {
        }

    }

    private static class StdDSAEncoder
        implements DSAEncoder
    {

        public BigInteger[] decode(byte abyte0[])
            throws IOException
        {
            abyte0 = (ASN1Sequence)ASN1Primitive.fromByteArray(abyte0);
            return (new BigInteger[] {
                ((DERInteger)abyte0.getObjectAt(0)).getValue(), ((DERInteger)abyte0.getObjectAt(1)).getValue()
            });
        }

        public byte[] encode(BigInteger biginteger, BigInteger biginteger1)
            throws IOException
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.add(new DERInteger(biginteger));
            asn1encodablevector.add(new DERInteger(biginteger1));
            return (new DERSequence(asn1encodablevector)).getEncoded("DER");
        }

        private StdDSAEncoder()
        {
        }

    }

    public static class ecCVCDSA extends SignatureSpi
    {

        public ecCVCDSA()
        {
            super(new SHA1Digest(), new ECDSASigner(), new CVCDSAEncoder());
        }
    }

    public static class ecCVCDSA224 extends SignatureSpi
    {

        public ecCVCDSA224()
        {
            super(new SHA224Digest(), new ECDSASigner(), new CVCDSAEncoder());
        }
    }

    public static class ecCVCDSA256 extends SignatureSpi
    {

        public ecCVCDSA256()
        {
            super(new SHA256Digest(), new ECDSASigner(), new CVCDSAEncoder());
        }
    }

    public static class ecDSA extends SignatureSpi
    {

        public ecDSA()
        {
            super(new SHA1Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    public static class ecDSA224 extends SignatureSpi
    {

        public ecDSA224()
        {
            super(new SHA224Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    public static class ecDSA256 extends SignatureSpi
    {

        public ecDSA256()
        {
            super(new SHA256Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    public static class ecDSA384 extends SignatureSpi
    {

        public ecDSA384()
        {
            super(new SHA384Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    public static class ecDSA512 extends SignatureSpi
    {

        public ecDSA512()
        {
            super(new SHA512Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    public static class ecDSARipeMD160 extends SignatureSpi
    {

        public ecDSARipeMD160()
        {
            super(new RIPEMD160Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    public static class ecDSAnone extends SignatureSpi
    {

        public ecDSAnone()
        {
            super(new NullDigest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    public static class ecNR extends SignatureSpi
    {

        public ecNR()
        {
            super(new SHA1Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    public static class ecNR224 extends SignatureSpi
    {

        public ecNR224()
        {
            super(new SHA224Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    public static class ecNR256 extends SignatureSpi
    {

        public ecNR256()
        {
            super(new SHA256Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    public static class ecNR384 extends SignatureSpi
    {

        public ecNR384()
        {
            super(new SHA384Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    public static class ecNR512 extends SignatureSpi
    {

        public ecNR512()
        {
            super(new SHA512Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }


    SignatureSpi(Digest digest, DSA dsa, DSAEncoder dsaencoder)
    {
        super(digest, dsa, dsaencoder);
    }

    protected void engineInitSign(PrivateKey privatekey)
        throws InvalidKeyException
    {
        if (privatekey instanceof ECKey)
        {
            privatekey = ECUtil.generatePrivateKeyParameter(privatekey);
            digest.reset();
            if (appRandom != null)
            {
                signer.init(true, new ParametersWithRandom(privatekey, appRandom));
                return;
            } else
            {
                signer.init(true, privatekey);
                return;
            }
        } else
        {
            throw new InvalidKeyException("can't recognise key type in ECDSA based signer");
        }
    }

    protected void engineInitVerify(PublicKey publickey)
        throws InvalidKeyException
    {
        if (!(publickey instanceof ECPublicKey)) goto _L2; else goto _L1
_L1:
        publickey = ECUtil.generatePublicKeyParameter(publickey);
_L4:
        digest.reset();
        signer.init(false, publickey);
        return;
_L2:
        publickey = BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(publickey.getEncoded()));
        if (!(publickey instanceof ECPublicKey))
        {
            break; /* Loop/switch isn't completed */
        }
        publickey = ECUtil.generatePublicKeyParameter(publickey);
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            throw new InvalidKeyException("can't recognise key type in ECDSA based signer");
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new InvalidKeyException("can't recognise key type in ECDSA based signer");
        }
    }
}
