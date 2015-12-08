// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.DSAKey;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.NullDigest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.dsa:
//            DSAUtil, BCDSAPublicKey

public class DSASigner extends SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{
    public static class dsa224 extends DSASigner
    {

        public dsa224()
        {
            super(new SHA224Digest(), new org.spongycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa256 extends DSASigner
    {

        public dsa256()
        {
            super(new SHA256Digest(), new org.spongycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa384 extends DSASigner
    {

        public dsa384()
        {
            super(new SHA384Digest(), new org.spongycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa512 extends DSASigner
    {

        public dsa512()
        {
            super(new SHA512Digest(), new org.spongycastle.crypto.signers.DSASigner());
        }
    }

    public static class noneDSA extends DSASigner
    {

        public noneDSA()
        {
            super(new NullDigest(), new org.spongycastle.crypto.signers.DSASigner());
        }
    }

    public static class stdDSA extends DSASigner
    {

        public stdDSA()
        {
            super(new SHA1Digest(), new org.spongycastle.crypto.signers.DSASigner());
        }
    }


    private DSA bA;
    private SecureRandom bB;
    private Digest bz;

    protected DSASigner(Digest digest, DSA dsa)
    {
        bz = digest;
        bA = dsa;
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        privatekey = DSAUtil.a(privatekey);
        if (bB != null)
        {
            privatekey = new ParametersWithRandom(privatekey, bB);
        }
        bz.c();
        bA.a(true, privatekey);
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
    {
        bB = securerandom;
        engineInitSign(privatekey);
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (publickey instanceof DSAKey)
        {
            publickey = DSAUtil.a(publickey);
        } else
        {
            try
            {
                publickey = DSAUtil.a(new BCDSAPublicKey(SubjectPublicKeyInfo.a(publickey.getEncoded())));
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                throw new InvalidKeyException("can't recognise key type in DSA based signer");
            }
        }
        bz.c();
        bA.a(false, publickey);
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
        byte abyte0[] = new byte[bz.b()];
        bz.a(abyte0, 0);
        BigInteger biginteger;
        BigInteger abiginteger[];
        BigInteger biginteger1;
        try
        {
            abiginteger = bA.a(abyte0);
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        biginteger = abiginteger[0];
        biginteger1 = abiginteger[1];
        biginteger = (new DERSequence(new ASN1Integer[] {
            new ASN1Integer(biginteger), new ASN1Integer(biginteger1)
        })).a("DER");
        return biginteger;
    }

    protected void engineUpdate(byte byte0)
    {
        bz.a(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        bz.a(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[bz.b()];
        bz.a(abyte1, 0);
        BigInteger abiginteger[];
        try
        {
            abyte0 = (ASN1Sequence)ASN1Primitive.a(abyte0);
            abiginteger = new BigInteger[2];
            abiginteger[0] = ((ASN1Integer)abyte0.a(0)).c();
            abiginteger[1] = ((ASN1Integer)abyte0.a(1)).c();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        return bA.a(abyte1, abiginteger[0], abiginteger[1]);
    }
}
