// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
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

    private final Digest a;
    private final DSA b;
    private boolean c;

    public DSADigestSigner(DSA dsa, Digest digest)
    {
        a = digest;
        b = dsa;
    }

    private BigInteger[] derDecode(byte abyte0[])
    {
        abyte0 = (ASN1Sequence)ASN1Object.a(abyte0);
        return (new BigInteger[] {
            ((DERInteger)abyte0.a(0)).e(), ((DERInteger)abyte0.a(1)).e()
        });
    }

    private byte[] derEncode(BigInteger biginteger, BigInteger biginteger1)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(biginteger));
        asn1encodablevector.a(new DERInteger(biginteger1));
        return (new DERSequence(asn1encodablevector)).b();
    }

    public byte[] generateSignature()
    {
        if (!c)
        {
            throw new IllegalStateException("DSADigestSigner not initialised for signature generation.");
        } else
        {
            Object aobj[] = new byte[a.getDigestSize()];
            a.doFinal(((byte []) (aobj)), 0);
            aobj = b.generateSignature(((byte []) (aobj)));
            return derEncode(aobj[0], aobj[1]);
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
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
            b.init(flag, cipherparameters);
            return;
        }
    }

    public void reset()
    {
        a.reset();
    }

    public void update(byte byte0)
    {
        a.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }

    public boolean verifySignature(byte abyte0[])
    {
        if (c)
        {
            throw new IllegalStateException("DSADigestSigner not initialised for verification");
        }
        byte abyte1[] = new byte[a.getDigestSize()];
        a.doFinal(abyte1, 0);
        boolean flag;
        try
        {
            abyte0 = derDecode(abyte0);
            flag = b.verifySignature(abyte1, abyte0[0], abyte0[1]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        return flag;
    }
}
