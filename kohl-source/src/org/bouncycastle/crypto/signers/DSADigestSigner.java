// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DSADigestSigner
    implements Signer
{

    private final Digest digest;
    private final DSA dsaSigner;
    private boolean forSigning;

    public DSADigestSigner(DSA dsa, Digest digest1)
    {
        digest = digest1;
        dsaSigner = dsa;
    }

    private BigInteger[] derDecode(byte abyte0[])
        throws IOException
    {
        abyte0 = (ASN1Sequence)ASN1Primitive.fromByteArray(abyte0);
        return (new BigInteger[] {
            ((DERInteger)abyte0.getObjectAt(0)).getValue(), ((DERInteger)abyte0.getObjectAt(1)).getValue()
        });
    }

    private byte[] derEncode(BigInteger biginteger, BigInteger biginteger1)
        throws IOException
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new DERInteger(biginteger));
        asn1encodablevector.add(new DERInteger(biginteger1));
        return (new DERSequence(asn1encodablevector)).getEncoded("DER");
    }

    public byte[] generateSignature()
    {
        if (!forSigning)
        {
            throw new IllegalStateException("DSADigestSigner not initialised for signature generation.");
        }
        Object aobj[] = new byte[digest.getDigestSize()];
        digest.doFinal(((byte []) (aobj)), 0);
        aobj = dsaSigner.generateSignature(((byte []) (aobj)));
        try
        {
            aobj = derEncode(aobj[0], aobj[1]);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("unable to encode signature");
        }
        return ((byte []) (aobj));
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        forSigning = flag;
        AsymmetricKeyParameter asymmetrickeyparameter;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)cipherparameters;
        }
        if (flag && !asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        }
        if (!flag && asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        } else
        {
            reset();
            dsaSigner.init(flag, cipherparameters);
            return;
        }
    }

    public void reset()
    {
        digest.reset();
    }

    public void update(byte byte0)
    {
        digest.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
    }

    public boolean verifySignature(byte abyte0[])
    {
        if (forSigning)
        {
            throw new IllegalStateException("DSADigestSigner not initialised for verification");
        }
        byte abyte1[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        boolean flag;
        try
        {
            abyte0 = derDecode(abyte0);
            flag = dsaSigner.verifySignature(abyte1, abyte0[0], abyte0[1]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        return flag;
    }
}
