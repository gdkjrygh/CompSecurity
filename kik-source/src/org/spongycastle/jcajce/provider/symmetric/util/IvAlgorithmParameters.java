// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseAlgorithmParameters

public class IvAlgorithmParameters extends BaseAlgorithmParameters
{

    private byte a[];

    public IvAlgorithmParameters()
    {
    }

    protected final AlgorithmParameterSpec a(Class class1)
    {
        if (class1 == javax/crypto/spec/IvParameterSpec)
        {
            return new IvParameterSpec(a);
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }
    }

    protected byte[] engineGetEncoded()
    {
        return engineGetEncoded("ASN.1");
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (a(s))
        {
            return (new DEROctetString(engineGetEncoded("RAW"))).b();
        }
        if (s.equals("RAW"))
        {
            return Arrays.b(a);
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof IvParameterSpec))
        {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        } else
        {
            a = ((IvParameterSpec)algorithmparameterspec).getIV();
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        byte abyte1[] = abyte0;
        if (abyte0.length % 8 != 0)
        {
            abyte1 = abyte0;
            if (abyte0[0] == 4)
            {
                abyte1 = abyte0;
                if (abyte0[1] == abyte0.length - 2)
                {
                    abyte1 = ((ASN1OctetString)ASN1Primitive.a(abyte0)).d();
                }
            }
        }
        a = Arrays.b(abyte1);
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (a(s))
        {
            try
            {
                engineInit(((ASN1OctetString)ASN1Primitive.a(abyte0)).d());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IOException((new StringBuilder("Exception decoding: ")).append(abyte0).toString());
            }
        }
        if (s.equals("RAW"))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException("Unknown parameters format in IV parameters object");
        }
    }

    protected String engineToString()
    {
        return "IV Parameters";
    }
}
