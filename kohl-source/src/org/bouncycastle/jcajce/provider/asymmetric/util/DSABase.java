// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.util:
//            DSAEncoder

public abstract class DSABase extends SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    protected Digest digest;
    protected DSAEncoder encoder;
    protected DSA signer;

    protected DSABase(Digest digest1, DSA dsa, DSAEncoder dsaencoder)
    {
        digest = digest1;
        signer = dsa;
        encoder = dsaencoder;
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
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
        Object aobj[] = new byte[digest.getDigestSize()];
        digest.doFinal(((byte []) (aobj)), 0);
        try
        {
            aobj = signer.generateSignature(((byte []) (aobj)));
            aobj = encoder.encode(aobj[0], aobj[1]);
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return ((byte []) (aobj));
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
        try
        {
            abyte0 = encoder.decode(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        return signer.verifySignature(abyte1, abyte0[0], abyte0[1]);
    }
}
