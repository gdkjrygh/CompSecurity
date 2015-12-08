// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.PrintStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.engines.BlowfishEngine;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.engines.RC4Engine;
import org.spongycastle.crypto.engines.SkipjackEngine;
import org.spongycastle.crypto.engines.TwofishEngine;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider

public class JCEStreamCipher extends CipherSpi
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
            super(new RC4Engine());
        }
    }

    public static class PBEWithSHAAnd40BitRC4 extends JCEStreamCipher
    {

        public PBEWithSHAAnd40BitRC4()
        {
            super(new RC4Engine());
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


    private Class a[] = {
        javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec, javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec
    };
    private StreamCipher b;
    private ParametersWithIV c;
    private int d;
    private PBEParameterSpec e;
    private String f;
    private AlgorithmParameters g;

    protected JCEStreamCipher(BlockCipher blockcipher, int i)
    {
        d = 0;
        e = null;
        f = null;
        d = i;
        b = new StreamBlockCipher(blockcipher);
    }

    protected JCEStreamCipher(StreamCipher streamcipher)
    {
        d = 0;
        e = null;
        f = null;
        b = streamcipher;
        d = 0;
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (j != 0)
        {
            b.a(abyte0, i, j, abyte1, k);
        }
        b.b();
        return j;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i, int j)
    {
        if (j != 0)
        {
            abyte0 = engineUpdate(abyte0, i, j);
            b.b();
            return abyte0;
        } else
        {
            b.b();
            return new byte[0];
        }
    }

    protected int engineGetBlockSize()
    {
        return 0;
    }

    protected byte[] engineGetIV()
    {
        if (c != null)
        {
            return c.a();
        } else
        {
            return null;
        }
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length * 8;
    }

    protected int engineGetOutputSize(int i)
    {
        return i;
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (g == null && e != null)
        {
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance(f, BouncyCastleProvider.a);
                algorithmparameters.init(e);
            }
            catch (Exception exception)
            {
                return null;
            }
            return algorithmparameters;
        } else
        {
            return g;
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j == a.length)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = algorithmparameters.getParameterSpec(a[j]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("can't handle parameter ")).append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        j++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        engineInit(i, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        g = algorithmparameters;
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int i, Key key, SecureRandom securerandom)
    {
        try
        {
            engineInit(i, key, ((AlgorithmParameterSpec) (null)), securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
label0:
        {
label1:
            {
                e = null;
                f = null;
                g = null;
                if (!(key instanceof SecretKey))
                {
                    throw new InvalidKeyException((new StringBuilder("Key for algorithm ")).append(key.getAlgorithm()).append(" not suitable for symmetric enryption.").toString());
                }
                if (key instanceof BCPBEKey)
                {
                    BCPBEKey bcpbekey = (BCPBEKey)key;
                    if (bcpbekey.c() != null)
                    {
                        f = bcpbekey.c().c();
                    } else
                    {
                        f = bcpbekey.getAlgorithm();
                    }
                    if (bcpbekey.b() != null)
                    {
                        key = bcpbekey.b();
                        e = new PBEParameterSpec(bcpbekey.getSalt(), bcpbekey.getIterationCount());
                    } else
                    if (algorithmparameterspec instanceof PBEParameterSpec)
                    {
                        key = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.a(bcpbekey, algorithmparameterspec, b.a());
                        e = (PBEParameterSpec)algorithmparameterspec;
                    } else
                    {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    if (bcpbekey.a() != 0)
                    {
                        c = (ParametersWithIV)key;
                    }
                } else
                if (algorithmparameterspec == null)
                {
                    key = new KeyParameter(key.getEncoded());
                } else
                if (algorithmparameterspec instanceof IvParameterSpec)
                {
                    key = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
                    c = (ParametersWithIV)key;
                } else
                {
                    throw new IllegalArgumentException("unknown parameter type.");
                }
                algorithmparameterspec = key;
                if (d != 0)
                {
                    algorithmparameterspec = key;
                    if (!(key instanceof ParametersWithIV))
                    {
                        algorithmparameterspec = securerandom;
                        if (securerandom == null)
                        {
                            algorithmparameterspec = new SecureRandom();
                        }
                        if (i != 1 && i != 3)
                        {
                            break label1;
                        }
                        securerandom = new byte[d];
                        algorithmparameterspec.nextBytes(securerandom);
                        algorithmparameterspec = new ParametersWithIV(key, securerandom);
                        c = (ParametersWithIV)algorithmparameterspec;
                    }
                }
                switch (i)
                {
                default:
                    System.out.println("eeek!");
                    return;

                case 1: // '\001'
                case 3: // '\003'
                    b.a(true, algorithmparameterspec);
                    return;

                case 2: // '\002'
                case 4: // '\004'
                    b.a(false, algorithmparameterspec);
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

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        try
        {
            b.a(abyte0, i, j, abyte1, k);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ShortBufferException(abyte0.getMessage());
        }
        return j;
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        b.a(abyte0, i, j, abyte1, 0);
        return abyte1;
    }
}
