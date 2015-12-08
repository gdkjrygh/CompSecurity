// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PBE, JCEPBEKey

public static class nerator
{

    static CipherParameters a(PBEKeySpec pbekeyspec, int i, int j, int k)
    {
        PBEParametersGenerator pbeparametersgenerator = a(i, j);
        byte abyte0[];
        if (i == 2)
        {
            abyte0 = PBEParametersGenerator.PKCS12PasswordToBytes(pbekeyspec.getPassword());
        } else
        {
            abyte0 = PBEParametersGenerator.PKCS5PasswordToBytes(pbekeyspec.getPassword());
        }
        pbeparametersgenerator.init(abyte0, pbekeyspec.getSalt(), pbekeyspec.getIterationCount());
        pbekeyspec = pbeparametersgenerator.generateDerivedMacParameters(k);
        for (i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = 0;
        }

        return pbekeyspec;
    }

    static CipherParameters a(PBEKeySpec pbekeyspec, int i, int j, int k, int l)
    {
        PBEParametersGenerator pbeparametersgenerator = a(i, j);
        byte abyte0[];
        if (i == 2)
        {
            abyte0 = PBEParametersGenerator.PKCS12PasswordToBytes(pbekeyspec.getPassword());
        } else
        {
            abyte0 = PBEParametersGenerator.PKCS5PasswordToBytes(pbekeyspec.getPassword());
        }
        pbeparametersgenerator.init(abyte0, pbekeyspec.getSalt(), pbekeyspec.getIterationCount());
        if (l != 0)
        {
            pbekeyspec = pbeparametersgenerator.generateDerivedParameters(k, l);
        } else
        {
            pbekeyspec = pbeparametersgenerator.generateDerivedParameters(k);
        }
        for (i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = 0;
        }

        return pbekeyspec;
    }

    static CipherParameters a(JCEPBEKey jcepbekey, AlgorithmParameterSpec algorithmparameterspec)
    {
        if (algorithmparameterspec == null || !(algorithmparameterspec instanceof PBEParameterSpec))
        {
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pbeparameterspec = (PBEParameterSpec)algorithmparameterspec;
        PBEParametersGenerator pbeparametersgenerator = a(jcepbekey.c, jcepbekey.d);
        algorithmparameterspec = jcepbekey.getEncoded();
        if (jcepbekey.i)
        {
            algorithmparameterspec = new byte[2];
        }
        pbeparametersgenerator.init(algorithmparameterspec, pbeparameterspec.getSalt(), pbeparameterspec.getIterationCount());
        jcepbekey = pbeparametersgenerator.generateDerivedMacParameters(jcepbekey.e);
        for (int i = 0; i != algorithmparameterspec.length; i++)
        {
            algorithmparameterspec[i] = 0;
        }

        return jcepbekey;
    }

    static CipherParameters a(JCEPBEKey jcepbekey, AlgorithmParameterSpec algorithmparameterspec, String s)
    {
        if (algorithmparameterspec == null || !(algorithmparameterspec instanceof PBEParameterSpec))
        {
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pbeparameterspec = (PBEParameterSpec)algorithmparameterspec;
        PBEParametersGenerator pbeparametersgenerator = a(jcepbekey.c, jcepbekey.d);
        algorithmparameterspec = jcepbekey.getEncoded();
        if (jcepbekey.i)
        {
            algorithmparameterspec = new byte[2];
        }
        pbeparametersgenerator.init(algorithmparameterspec, pbeparameterspec.getSalt(), pbeparameterspec.getIterationCount());
        int i;
        if (jcepbekey.f != 0)
        {
            jcepbekey = pbeparametersgenerator.generateDerivedParameters(jcepbekey.e, jcepbekey.f);
        } else
        {
            jcepbekey = pbeparametersgenerator.generateDerivedParameters(jcepbekey.e);
        }
        if (s.startsWith("DES"))
        {
            if (jcepbekey instanceof ParametersWithIV)
            {
                DESParameters.setOddParity(((KeyParameter)((ParametersWithIV)jcepbekey).getParameters()).getKey());
            } else
            {
                DESParameters.setOddParity(((KeyParameter)jcepbekey).getKey());
            }
        }
        for (i = 0; i != algorithmparameterspec.length; i++)
        {
            algorithmparameterspec[i] = 0;
        }

        return jcepbekey;
    }

    private static PBEParametersGenerator a(int i, int j)
    {
        if (i == 0)
        {
            switch (j)
            {
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            default:
                throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");

            case 5: // '\005'
                return new PKCS5S1ParametersGenerator(new MD2Digest());

            case 0: // '\0'
                return new PKCS5S1ParametersGenerator(new MD5Digest());

            case 1: // '\001'
                return new PKCS5S1ParametersGenerator(new SHA1Digest());
            }
        }
        if (i == 1)
        {
            return new PKCS5S2ParametersGenerator();
        }
        if (i == 2)
        {
            switch (j)
            {
            default:
                throw new IllegalStateException("unknown digest scheme for PBE encryption.");

            case 5: // '\005'
                return new PKCS12ParametersGenerator(new MD2Digest());

            case 0: // '\0'
                return new PKCS12ParametersGenerator(new MD5Digest());

            case 1: // '\001'
                return new PKCS12ParametersGenerator(new SHA1Digest());

            case 2: // '\002'
                return new PKCS12ParametersGenerator(new RIPEMD160Digest());

            case 3: // '\003'
                return new PKCS12ParametersGenerator(new TigerDigest());

            case 4: // '\004'
                return new PKCS12ParametersGenerator(new SHA256Digest());
            }
        } else
        {
            return new OpenSSLPBEParametersGenerator();
        }
    }

    public nerator()
    {
    }
}
