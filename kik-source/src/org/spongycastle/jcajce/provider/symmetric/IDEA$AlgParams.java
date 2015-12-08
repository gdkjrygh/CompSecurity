// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.misc.IDEACBCPar;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            IDEA

public static class thmParameters extends BaseAlgorithmParameters
{

    private byte a[];

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
            return (new IDEACBCPar(engineGetEncoded("RAW"))).b();
        }
        if (s.equals("RAW"))
        {
            s = new byte[a.length];
            System.arraycopy(a, 0, s, 0, a.length);
            return s;
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
        a = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, a, 0, a.length);
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (s.equals("RAW"))
        {
            engineInit(abyte0);
            return;
        }
        if (s.equals("ASN.1"))
        {
            engineInit((new IDEACBCPar((ASN1Sequence)(new ASN1InputStream(abyte0)).b())).c());
            return;
        } else
        {
            throw new IOException("Unknown parameters format in IV parameters object");
        }
    }

    protected String engineToString()
    {
        return "IDEA Parameters";
    }

    public thmParameters()
    {
    }
}
