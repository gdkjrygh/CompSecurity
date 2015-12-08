// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

// Referenced classes of package org.bouncycastle.jce.provider:
//            OldPKCS12ParametersGenerator

public interface BrokenPBE
{
    public static class Util
    {

        private static PBEParametersGenerator makePBEGenerator(int i, int j)
        {
            if (i == 0)
            {
                switch (j)
                {
                default:
                    throw new IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");

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
            if (i == 3)
            {
                switch (j)
                {
                default:
                    throw new IllegalStateException("unknown digest scheme for PBE encryption.");

                case 0: // '\0'
                    return new OldPKCS12ParametersGenerator(new MD5Digest());

                case 1: // '\001'
                    return new OldPKCS12ParametersGenerator(new SHA1Digest());

                case 2: // '\002'
                    return new OldPKCS12ParametersGenerator(new RIPEMD160Digest());
                }
            }
            switch (j)
            {
            default:
                throw new IllegalStateException("unknown digest scheme for PBE encryption.");

            case 0: // '\0'
                return new PKCS12ParametersGenerator(new MD5Digest());

            case 1: // '\001'
                return new PKCS12ParametersGenerator(new SHA1Digest());

            case 2: // '\002'
                return new PKCS12ParametersGenerator(new RIPEMD160Digest());
            }
        }

        static CipherParameters makePBEMacParameters(BCPBEKey bcpbekey, AlgorithmParameterSpec algorithmparameterspec, int i, int j, int k)
        {
            if (algorithmparameterspec == null || !(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
            PBEParametersGenerator pbeparametersgenerator = makePBEGenerator(i, j);
            bcpbekey = bcpbekey.getEncoded();
            pbeparametersgenerator.init(bcpbekey, algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
            algorithmparameterspec = pbeparametersgenerator.generateDerivedMacParameters(k);
            for (i = 0; i != bcpbekey.length; i++)
            {
                bcpbekey[i] = 0;
            }

            return algorithmparameterspec;
        }

        static CipherParameters makePBEParameters(BCPBEKey bcpbekey, AlgorithmParameterSpec algorithmparameterspec, int i, int j, String s, int k, int l)
        {
            if (algorithmparameterspec == null || !(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pbeparameterspec = (PBEParameterSpec)algorithmparameterspec;
            PBEParametersGenerator pbeparametersgenerator = makePBEGenerator(i, j);
            algorithmparameterspec = bcpbekey.getEncoded();
            pbeparametersgenerator.init(algorithmparameterspec, pbeparameterspec.getSalt(), pbeparameterspec.getIterationCount());
            if (l != 0)
            {
                bcpbekey = pbeparametersgenerator.generateDerivedParameters(k, l);
            } else
            {
                bcpbekey = pbeparametersgenerator.generateDerivedParameters(k);
            }
            if (s.startsWith("DES"))
            {
                if (bcpbekey instanceof ParametersWithIV)
                {
                    setOddParity(((KeyParameter)((ParametersWithIV)bcpbekey).getParameters()).getKey());
                } else
                {
                    setOddParity(((KeyParameter)bcpbekey).getKey());
                }
            }
            for (i = 0; i != algorithmparameterspec.length; i++)
            {
                algorithmparameterspec[i] = 0;
            }

            return bcpbekey;
        }

        private static void setOddParity(byte abyte0[])
        {
            for (int i = 0; i < abyte0.length; i++)
            {
                byte byte0 = abyte0[i];
                abyte0[i] = (byte)(byte0 >> 7 ^ (byte0 >> 1 ^ byte0 >> 2 ^ byte0 >> 3 ^ byte0 >> 4 ^ byte0 >> 5 ^ byte0 >> 6) ^ 1 | byte0 & 0xfe);
            }

        }

        public Util()
        {
        }
    }


    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
}
