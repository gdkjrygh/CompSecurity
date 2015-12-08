// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.jce.provider:
//            DSAEncoder

public abstract class DSABase extends SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    protected DSAEncoder bA;
    protected Digest by;
    protected DSA bz;

    protected DSABase(Digest digest, DSA dsa, DSAEncoder dsaencoder)
    {
        by = digest;
        bz = dsa;
        bA = dsaencoder;
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        engineInitSign(privatekey, null);
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
        Object aobj[] = new byte[by.getDigestSize()];
        by.doFinal(((byte []) (aobj)), 0);
        try
        {
            aobj = bz.generateSignature(((byte []) (aobj)));
            aobj = bA.a(aobj[0], aobj[1]);
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return ((byte []) (aobj));
    }

    protected void engineUpdate(byte byte0)
    {
        by.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        by.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[by.getDigestSize()];
        by.doFinal(abyte1, 0);
        try
        {
            abyte0 = bA.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        return bz.verifySignature(abyte1, abyte0[0], abyte0[1]);
    }
}
