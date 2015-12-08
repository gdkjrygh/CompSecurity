// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.PrintStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.engines.SkipjackEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jce.provider:
//            WrapCipherSpi, PBE, BouncyCastleProvider, JCEPBEKey

public class JCEStreamCipher extends WrapCipherSpi
    implements PBE
{
    public static class Blowfish_CFB8 extends JCEStreamCipher
    {

        public Blowfish_CFB8()
        {
            super(new CFBBlockCipher(new BlowfishEngine(), 8), 64);
        }
    }

    public static class Blowfish_OFB8 extends JCEStreamCipher
    {

        public Blowfish_OFB8()
        {
            super(new OFBBlockCipher(new BlowfishEngine(), 8), 64);
        }
    }

    public static class DES_CFB8 extends JCEStreamCipher
    {

        public DES_CFB8()
        {
            super(new CFBBlockCipher(new DESEngine(), 8), 64);
        }
    }

    public static class DES_OFB8 extends JCEStreamCipher
    {

        public DES_OFB8()
        {
            super(new OFBBlockCipher(new DESEngine(), 8), 64);
        }
    }

    public static class DESede_CFB8 extends JCEStreamCipher
    {

        public DESede_CFB8()
        {
            super(new CFBBlockCipher(new DESedeEngine(), 8), 64);
        }
    }

    public static class DESede_OFB8 extends JCEStreamCipher
    {

        public DESede_OFB8()
        {
            super(new OFBBlockCipher(new DESedeEngine(), 8), 64);
        }
    }

    public static class PBEWithSHAAnd128BitRC4 extends JCEStreamCipher
    {

        public PBEWithSHAAnd128BitRC4()
        {
            super(new RC4Engine(), 0);
        }
    }

    public static class PBEWithSHAAnd40BitRC4 extends JCEStreamCipher
    {

        public PBEWithSHAAnd40BitRC4()
        {
            super(new RC4Engine(), 0);
        }
    }

    public static class Skipjack_CFB8 extends JCEStreamCipher
    {

        public Skipjack_CFB8()
        {
            super(new CFBBlockCipher(new SkipjackEngine(), 8), 64);
        }
    }

    public static class Skipjack_OFB8 extends JCEStreamCipher
    {

        public Skipjack_OFB8()
        {
            super(new OFBBlockCipher(new SkipjackEngine(), 8), 64);
        }
    }

    public static class Twofish_CFB8 extends JCEStreamCipher
    {

        public Twofish_CFB8()
        {
            super(new CFBBlockCipher(new TwofishEngine(), 8), 128);
        }
    }

    public static class Twofish_OFB8 extends JCEStreamCipher
    {

        public Twofish_OFB8()
        {
            super(new OFBBlockCipher(new TwofishEngine(), 8), 128);
        }
    }


    private Class e[] = {
        javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec, javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec
    };
    private StreamCipher f;
    private ParametersWithIV g;
    private int h;
    private PBEParameterSpec i;
    private String j;

    protected JCEStreamCipher(BlockCipher blockcipher, int k)
    {
        h = 0;
        i = null;
        j = null;
        h = k;
        f = new StreamBlockCipher(blockcipher);
    }

    protected JCEStreamCipher(StreamCipher streamcipher, int k)
    {
        h = 0;
        i = null;
        j = null;
        f = streamcipher;
        h = k;
    }

    protected int engineDoFinal(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        if (l != 0)
        {
            f.processBytes(abyte0, k, l, abyte1, i1);
        }
        f.reset();
        return l;
    }

    protected byte[] engineDoFinal(byte abyte0[], int k, int l)
    {
        if (l != 0)
        {
            abyte0 = engineUpdate(abyte0, k, l);
            f.reset();
            return abyte0;
        } else
        {
            f.reset();
            return new byte[0];
        }
    }

    protected int engineGetBlockSize()
    {
        return 0;
    }

    protected byte[] engineGetIV()
    {
        if (g != null)
        {
            return g.getIV();
        } else
        {
            return null;
        }
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length * 8;
    }

    protected int engineGetOutputSize(int k)
    {
        return k;
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (c == null && i != null)
        {
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance(j, BouncyCastleProvider.a);
                algorithmparameters.init(i);
            }
            catch (Exception exception)
            {
                return null;
            }
            return algorithmparameters;
        } else
        {
            return c;
        }
    }

    protected void engineInit(int k, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        if (l == e.length)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = algorithmparameters.getParameterSpec(e[l]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("can't handle parameter ")).append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        l++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        engineInit(k, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        c = algorithmparameters;
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int k, Key key, SecureRandom securerandom)
    {
        try
        {
            engineInit(k, key, ((AlgorithmParameterSpec) (null)), securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
    }

    protected void engineInit(int k, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
label0:
        {
label1:
            {
                i = null;
                j = null;
                c = null;
                if (!(key instanceof SecretKey))
                {
                    throw new InvalidKeyException((new StringBuilder("Key for algorithm ")).append(key.getAlgorithm()).append(" not suitable for symmetric enryption.").toString());
                }
                if (key instanceof JCEPBEKey)
                {
                    JCEPBEKey jcepbekey = (JCEPBEKey)key;
                    if (jcepbekey.b != null)
                    {
                        j = jcepbekey.b.e();
                    } else
                    {
                        j = jcepbekey.getAlgorithm();
                    }
                    if (jcepbekey.g != null)
                    {
                        key = jcepbekey.g;
                        i = new PBEParameterSpec(jcepbekey.getSalt(), jcepbekey.getIterationCount());
                    } else
                    if (algorithmparameterspec instanceof PBEParameterSpec)
                    {
                        key = PBE.Util.a(jcepbekey, algorithmparameterspec, f.getAlgorithmName());
                        i = (PBEParameterSpec)algorithmparameterspec;
                    } else
                    {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    if (jcepbekey.f != 0)
                    {
                        g = (ParametersWithIV)key;
                    }
                } else
                if (algorithmparameterspec == null)
                {
                    key = new KeyParameter(key.getEncoded());
                } else
                if (algorithmparameterspec instanceof IvParameterSpec)
                {
                    key = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
                    g = (ParametersWithIV)key;
                } else
                {
                    throw new IllegalArgumentException("unknown parameter type.");
                }
                algorithmparameterspec = key;
                if (h != 0)
                {
                    algorithmparameterspec = key;
                    if (!(key instanceof ParametersWithIV))
                    {
                        algorithmparameterspec = securerandom;
                        if (securerandom == null)
                        {
                            algorithmparameterspec = new SecureRandom();
                        }
                        if (k != 1 && k != 3)
                        {
                            break label1;
                        }
                        securerandom = new byte[h];
                        algorithmparameterspec.nextBytes(securerandom);
                        algorithmparameterspec = new ParametersWithIV(key, securerandom);
                        g = (ParametersWithIV)algorithmparameterspec;
                    }
                }
                switch (k)
                {
                default:
                    System.out.println("eeek!");
                    return;

                case 1: // '\001'
                case 3: // '\003'
                    f.init(true, algorithmparameterspec);
                    return;

                case 2: // '\002'
                case 4: // '\004'
                    f.init(false, algorithmparameterspec);
                    break;
                }
                break label0;
            }
            throw new InvalidAlgorithmParameterException("no IV set when one expected");
        }
    }

    protected void engineSetMode(String s)
    {
        if (!s.equalsIgnoreCase("ECB"))
        {
            throw new IllegalArgumentException((new StringBuilder("can't support mode ")).append(s).toString());
        } else
        {
            return;
        }
    }

    protected void engineSetPadding(String s)
    {
        if (!s.equalsIgnoreCase("NoPadding"))
        {
            throw new NoSuchPaddingException((new StringBuilder("Padding ")).append(s).append(" unknown.").toString());
        } else
        {
            return;
        }
    }

    protected int engineUpdate(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        try
        {
            f.processBytes(abyte0, k, l, abyte1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ShortBufferException(abyte0.getMessage());
        }
        return l;
    }

    protected byte[] engineUpdate(byte abyte0[], int k, int l)
    {
        byte abyte1[] = new byte[l];
        f.processBytes(abyte0, k, l, abyte1, 0);
        return abyte1;
    }
}
