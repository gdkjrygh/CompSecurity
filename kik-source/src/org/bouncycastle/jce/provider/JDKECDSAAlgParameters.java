// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.DEROctetString;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameters

public abstract class JDKECDSAAlgParameters extends AlgorithmParametersSpi
{
    public static class SigAlgParameters extends JDKAlgorithmParameters
    {

        protected final AlgorithmParameterSpec a(Class class1)
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ECDSA parameters object.");
        }

        protected byte[] engineGetEncoded()
        {
            return engineGetEncoded("ASN.1");
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (s == null)
            {
                return engineGetEncoded("ASN.1");
            }
            if (s.equals("ASN.1"))
            {
                return (new DEROctetString(engineGetEncoded("RAW"))).a();
            } else
            {
                return null;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ECDSA parameters object.");
        }

        protected void engineInit(byte abyte0[])
        {
        }

        protected void engineInit(byte abyte0[], String s)
        {
            throw new IOException("Unknown parameters format in IV parameters object");
        }

        protected String engineToString()
        {
            return "ECDSA Parameters";
        }

        public SigAlgParameters()
        {
        }
    }


    public JDKECDSAAlgParameters()
    {
    }
}
