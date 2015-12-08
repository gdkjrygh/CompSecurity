// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.util;

import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.util:
//            DSAEncoder

public abstract class DSABase extends SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    protected DSA bA;
    protected DSAEncoder bB;
    protected Digest bz;

    protected DSABase(Digest digest, DSA dsa, DSAEncoder dsaencoder)
    {
        bz = digest;
        bA = dsa;
        bB = dsaencoder;
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
    {
        Object aobj[] = new byte[bz.b()];
        bz.a(((byte []) (aobj)), 0);
        try
        {
            aobj = bA.a(((byte []) (aobj)));
            aobj = bB.a(aobj[0], aobj[1]);
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return ((byte []) (aobj));
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
        try
        {
            abyte0 = bB.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        return bA.a(abyte1, abyte0[0], abyte0[1]);
    }
}
