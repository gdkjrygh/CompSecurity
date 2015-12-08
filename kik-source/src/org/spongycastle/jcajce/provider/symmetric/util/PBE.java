// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.MD2Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.TigerDigest;
import org.spongycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.spongycastle.crypto.generators.PKCS12ParametersGenerator;
import org.spongycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.params.DESParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BCPBEKey

public interface PBE
{
    public static class Util
    {

        public static CipherParameters a(PBEKeySpec pbekeyspec, int i, int j, int k)
        {
            PBEParametersGenerator pbeparametersgenerator = a(i, j);
            byte abyte0[];
            if (i == 2)
            {
                abyte0 = PBEParametersGenerator.b(pbekeyspec.getPassword());
            } else
            {
                abyte0 = PBEParametersGenerator.a(pbekeyspec.getPassword());
            }
            pbeparametersgenerator.a(abyte0, pbekeyspec.getSalt(), pbekeyspec.getIterationCount());
            pbekeyspec = pbeparametersgenerator.b(k);
            for (i = 0; i != abyte0.length; i++)
            {
                abyte0[i] = 0;
            }

            return pbekeyspec;
        }

        public static CipherParameters a(PBEKeySpec pbekeyspec, int i, int j, int k, int l)
        {
            PBEParametersGenerator pbeparametersgenerator = a(i, j);
            byte abyte0[];
            if (i == 2)
            {
                abyte0 = PBEParametersGenerator.b(pbekeyspec.getPassword());
            } else
            {
                abyte0 = PBEParametersGenerator.a(pbekeyspec.getPassword());
            }
            pbeparametersgenerator.a(abyte0, pbekeyspec.getSalt(), pbekeyspec.getIterationCount());
            if (l != 0)
            {
                pbekeyspec = pbeparametersgenerator.a(k, l);
            } else
            {
                pbekeyspec = pbeparametersgenerator.a(k);
            }
            for (i = 0; i != abyte0.length; i++)
            {
                abyte0[i] = 0;
            }

            return pbekeyspec;
        }

        public static CipherParameters a(BCPBEKey bcpbekey, AlgorithmParameterSpec algorithmparameterspec)
        {
            if (algorithmparameterspec == null || !(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pbeparameterspec = (PBEParameterSpec)algorithmparameterspec;
            PBEParametersGenerator pbeparametersgenerator = a(bcpbekey.c, bcpbekey.d);
            algorithmparameterspec = bcpbekey.getEncoded();
            if (bcpbekey.i)
            {
                algorithmparameterspec = new byte[2];
            }
            pbeparametersgenerator.a(algorithmparameterspec, pbeparameterspec.getSalt(), pbeparameterspec.getIterationCount());
            bcpbekey = pbeparametersgenerator.b(bcpbekey.e);
            for (int i = 0; i != algorithmparameterspec.length; i++)
            {
                algorithmparameterspec[i] = 0;
            }

            return bcpbekey;
        }

        public static CipherParameters a(BCPBEKey bcpbekey, AlgorithmParameterSpec algorithmparameterspec, String s)
        {
            if (algorithmparameterspec == null || !(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pbeparameterspec = (PBEParameterSpec)algorithmparameterspec;
            PBEParametersGenerator pbeparametersgenerator = a(bcpbekey.c, bcpbekey.d);
            algorithmparameterspec = bcpbekey.getEncoded();
            if (bcpbekey.i)
            {
                algorithmparameterspec = new byte[2];
            }
            pbeparametersgenerator.a(algorithmparameterspec, pbeparameterspec.getSalt(), pbeparameterspec.getIterationCount());
            int i;
            if (bcpbekey.f != 0)
            {
                bcpbekey = pbeparametersgenerator.a(bcpbekey.e, bcpbekey.f);
            } else
            {
                bcpbekey = pbeparametersgenerator.a(bcpbekey.e);
            }
            if (s.startsWith("DES"))
            {
                if (bcpbekey instanceof ParametersWithIV)
                {
                    DESParameters.a(((KeyParameter)((ParametersWithIV)bcpbekey).b()).a());
                } else
                {
                    DESParameters.a(((KeyParameter)bcpbekey).a());
                }
            }
            for (i = 0; i != algorithmparameterspec.length; i++)
            {
                algorithmparameterspec[i] = 0;
            }

            return bcpbekey;
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

        public Util()
        {
        }
    }

}
