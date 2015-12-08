// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERSequence;
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
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.provider.DSABase;
import org.bouncycastle.jce.provider.DSAEncoder;
import org.bouncycastle.jce.provider.JDKKeyFactory;

// Referenced classes of package org.bouncycastle.jce.provider.asymmetric.ec:
//            ECUtil

public class Signature extends DSABase
{
    private static final class a
        implements DSAEncoder
    {

        private static byte[] a(BigInteger biginteger)
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

        public final byte[] a(BigInteger biginteger, BigInteger biginteger1)
        {
            byte abyte0[] = a(biginteger);
            biginteger1 = a(biginteger1);
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

        public final BigInteger[] a(byte abyte0[])
        {
            byte abyte1[] = new byte[abyte0.length / 2];
            byte abyte2[] = new byte[abyte0.length / 2];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
            System.arraycopy(abyte0, abyte1.length, abyte2, 0, abyte2.length);
            return (new BigInteger[] {
                new BigInteger(1, abyte1), new BigInteger(1, abyte2)
            });
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b
        implements DSAEncoder
    {

        public final byte[] a(BigInteger biginteger, BigInteger biginteger1)
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.a(new DERInteger(biginteger));
            asn1encodablevector.a(new DERInteger(biginteger1));
            return (new DERSequence(asn1encodablevector)).a("DER");
        }

        public final BigInteger[] a(byte abyte0[])
        {
            abyte0 = (ASN1Sequence)ASN1Object.a(abyte0);
            return (new BigInteger[] {
                ((DERInteger)abyte0.a(0)).e(), ((DERInteger)abyte0.a(1)).e()
            });
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static class ecCVCDSA extends Signature
    {

        public ecCVCDSA()
        {
            super(new SHA1Digest(), new ECDSASigner(), new a((byte)0));
        }
    }

    public static class ecCVCDSA224 extends Signature
    {

        public ecCVCDSA224()
        {
            super(new SHA224Digest(), new ECDSASigner(), new a((byte)0));
        }
    }

    public static class ecCVCDSA256 extends Signature
    {

        public ecCVCDSA256()
        {
            super(new SHA256Digest(), new ECDSASigner(), new a((byte)0));
        }
    }

    public static class ecDSA extends Signature
    {

        public ecDSA()
        {
            super(new SHA1Digest(), new ECDSASigner(), new b((byte)0));
        }
    }

    public static class ecDSA224 extends Signature
    {

        public ecDSA224()
        {
            super(new SHA224Digest(), new ECDSASigner(), new b((byte)0));
        }
    }

    public static class ecDSA256 extends Signature
    {

        public ecDSA256()
        {
            super(new SHA256Digest(), new ECDSASigner(), new b((byte)0));
        }
    }

    public static class ecDSA384 extends Signature
    {

        public ecDSA384()
        {
            super(new SHA384Digest(), new ECDSASigner(), new b((byte)0));
        }
    }

    public static class ecDSA512 extends Signature
    {

        public ecDSA512()
        {
            super(new SHA512Digest(), new ECDSASigner(), new b((byte)0));
        }
    }

    public static class ecDSARipeMD160 extends Signature
    {

        public ecDSARipeMD160()
        {
            super(new RIPEMD160Digest(), new ECDSASigner(), new b((byte)0));
        }
    }

    public static class ecDSAnone extends Signature
    {

        public ecDSAnone()
        {
            super(new NullDigest(), new ECDSASigner(), new b((byte)0));
        }
    }

    public static class ecNR extends Signature
    {

        public ecNR()
        {
            super(new SHA1Digest(), new ECNRSigner(), new b((byte)0));
        }
    }

    public static class ecNR224 extends Signature
    {

        public ecNR224()
        {
            super(new SHA224Digest(), new ECNRSigner(), new b((byte)0));
        }
    }

    public static class ecNR256 extends Signature
    {

        public ecNR256()
        {
            super(new SHA256Digest(), new ECNRSigner(), new b((byte)0));
        }
    }

    public static class ecNR384 extends Signature
    {

        public ecNR384()
        {
            super(new SHA384Digest(), new ECNRSigner(), new b((byte)0));
        }
    }

    public static class ecNR512 extends Signature
    {

        public ecNR512()
        {
            super(new SHA512Digest(), new ECNRSigner(), new b((byte)0));
        }
    }


    Signature(Digest digest, DSA dsa, DSAEncoder dsaencoder)
    {
        super(digest, dsa, dsaencoder);
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
    {
        if (privatekey instanceof ECKey)
        {
            privatekey = ECUtil.a(privatekey);
            by.reset();
            if (securerandom != null)
            {
                bz.init(true, new ParametersWithRandom(privatekey, securerandom));
                return;
            } else
            {
                bz.init(true, privatekey);
                return;
            }
        } else
        {
            throw new InvalidKeyException("can't recognise key type in ECDSA based signer");
        }
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (!(publickey instanceof ECPublicKey)) goto _L2; else goto _L1
_L1:
        publickey = ECUtil.a(publickey);
_L4:
        by.reset();
        bz.init(false, publickey);
        return;
_L2:
        publickey = JDKKeyFactory.a(publickey.getEncoded());
        if (!(publickey instanceof ECPublicKey))
        {
            break; /* Loop/switch isn't completed */
        }
        publickey = ECUtil.a(publickey);
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
