// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.PrintStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BrokenPBE, BouncyCastleProvider

public class BrokenJCEBlockCipher
    implements BrokenPBE
{
    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher
    {

        public BrokePBEWithMD5AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher
    {

        public BrokePBEWithSHA1AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher
    {

        public BrokePBEWithSHAAndDES2Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher
    {

        public BrokePBEWithSHAAndDES3Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher
    {

        public OldPBEWithSHAAndDES3Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher
    {

        public OldPBEWithSHAAndTwofish()
        {
            super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
        }
    }


    private Class availableSpecs[] = {
        javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec, javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec
    };
    private BufferedBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    protected BrokenJCEBlockCipher(BlockCipher blockcipher)
    {
        pbeType = 2;
        pbeHash = 1;
        ivLength = 0;
        engineParams = null;
        cipher = new PaddedBufferedBlockCipher(blockcipher);
    }

    protected BrokenJCEBlockCipher(BlockCipher blockcipher, int i, int j, int k, int l)
    {
        pbeType = 2;
        pbeHash = 1;
        ivLength = 0;
        engineParams = null;
        cipher = new PaddedBufferedBlockCipher(blockcipher);
        pbeType = i;
        pbeHash = j;
        pbeKeySize = k;
        pbeIvSize = l;
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws IllegalBlockSizeException, BadPaddingException
    {
        int l = 0;
        if (j != 0)
        {
            l = cipher.processBytes(abyte0, i, j, abyte1, k);
        }
        try
        {
            i = cipher.doFinal(abyte1, k + l);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalBlockSizeException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return l + i;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i, int j)
        throws IllegalBlockSizeException, BadPaddingException
    {
        byte abyte1[] = new byte[engineGetOutputSize(j)];
        if (j != 0)
        {
            i = cipher.processBytes(abyte0, i, j, abyte1, 0);
        } else
        {
            i = 0;
        }
        try
        {
            j = cipher.doFinal(abyte1, i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalBlockSizeException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        i += j;
        abyte0 = new byte[i];
        System.arraycopy(abyte1, 0, abyte0, 0, i);
        return abyte0;
    }

    protected int engineGetBlockSize()
    {
        return cipher.getBlockSize();
    }

    protected byte[] engineGetIV()
    {
        if (ivParam != null)
        {
            return ivParam.getIV();
        } else
        {
            return null;
        }
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length;
    }

    protected int engineGetOutputSize(int i)
    {
        return cipher.getOutputSize(i);
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (engineParams == null && ivParam != null)
        {
            String s1 = cipher.getUnderlyingCipher().getAlgorithmName();
            String s = s1;
            if (s1.indexOf('/') >= 0)
            {
                s = s1.substring(0, s1.indexOf('/'));
            }
            try
            {
                engineParams = AlgorithmParameters.getInstance(s, BouncyCastleProvider.PROVIDER_NAME);
                engineParams.init(ivParam.getIV());
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return engineParams;
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
        throws InvalidKeyException, InvalidAlgorithmParameterException
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j == availableSpecs.length)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Object obj = algorithmparameters.getParameterSpec(availableSpecs[j]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("can't handle parameter ").append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        j++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        engineParams = algorithmparameters;
        engineInit(i, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int i, Key key, SecureRandom securerandom)
        throws InvalidKeyException
    {
        try
        {
            engineInit(i, key, (AlgorithmParameterSpec)null, securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new IllegalArgumentException(key.getMessage());
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidKeyException, InvalidAlgorithmParameterException
    {
label0:
        {
label1:
            {
                if (key instanceof BCPBEKey)
                {
                    key = BrokenPBE.Util.makePBEParameters((BCPBEKey)key, algorithmparameterspec, pbeType, pbeHash, cipher.getUnderlyingCipher().getAlgorithmName(), pbeKeySize, pbeIvSize);
                    if (pbeIvSize != 0)
                    {
                        ivParam = (ParametersWithIV)key;
                    }
                } else
                if (algorithmparameterspec == null)
                {
                    key = new KeyParameter(key.getEncoded());
                } else
                if (algorithmparameterspec instanceof IvParameterSpec)
                {
                    if (ivLength != 0)
                    {
                        key = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
                        ivParam = (ParametersWithIV)key;
                    } else
                    {
                        key = new KeyParameter(key.getEncoded());
                    }
                } else
                if (algorithmparameterspec instanceof RC2ParameterSpec)
                {
                    RC2ParameterSpec rc2parameterspec = (RC2ParameterSpec)algorithmparameterspec;
                    key = new RC2Parameters(key.getEncoded(), ((RC2ParameterSpec)algorithmparameterspec).getEffectiveKeyBits());
                    if (rc2parameterspec.getIV() != null && ivLength != 0)
                    {
                        key = new ParametersWithIV(key, rc2parameterspec.getIV());
                        ivParam = (ParametersWithIV)key;
                    }
                } else
                if (algorithmparameterspec instanceof RC5ParameterSpec)
                {
                    RC5ParameterSpec rc5parameterspec = (RC5ParameterSpec)algorithmparameterspec;
                    key = new RC5Parameters(key.getEncoded(), ((RC5ParameterSpec)algorithmparameterspec).getRounds());
                    if (rc5parameterspec.getWordSize() != 32)
                    {
                        throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                    }
                    if (rc5parameterspec.getIV() != null && ivLength != 0)
                    {
                        key = new ParametersWithIV(key, rc5parameterspec.getIV());
                        ivParam = (ParametersWithIV)key;
                    }
                } else
                {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
                algorithmparameterspec = key;
                if (ivLength != 0)
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
                        securerandom = new byte[ivLength];
                        algorithmparameterspec.nextBytes(securerandom);
                        algorithmparameterspec = new ParametersWithIV(key, securerandom);
                        ivParam = (ParametersWithIV)algorithmparameterspec;
                    }
                }
                switch (i)
                {
                default:
                    System.out.println("eeek!");
                    return;

                case 1: // '\001'
                case 3: // '\003'
                    cipher.init(true, algorithmparameterspec);
                    return;

                case 2: // '\002'
                case 4: // '\004'
                    cipher.init(false, algorithmparameterspec);
                    break;
                }
                break label0;
            }
            throw new InvalidAlgorithmParameterException("no IV set when one expected");
        }
    }

    protected void engineSetMode(String s)
    {
        String s1 = Strings.toUpperCase(s);
        if (s1.equals("ECB"))
        {
            ivLength = 0;
            cipher = new PaddedBufferedBlockCipher(cipher.getUnderlyingCipher());
            return;
        }
        if (s1.equals("CBC"))
        {
            ivLength = cipher.getUnderlyingCipher().getBlockSize();
            cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(cipher.getUnderlyingCipher()));
            return;
        }
        if (s1.startsWith("OFB"))
        {
            ivLength = cipher.getUnderlyingCipher().getBlockSize();
            if (s1.length() != 3)
            {
                int i = Integer.parseInt(s1.substring(3));
                cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(cipher.getUnderlyingCipher(), i));
                return;
            } else
            {
                cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(cipher.getUnderlyingCipher(), cipher.getBlockSize() * 8));
                return;
            }
        }
        if (s1.startsWith("CFB"))
        {
            ivLength = cipher.getUnderlyingCipher().getBlockSize();
            if (s1.length() != 3)
            {
                int j = Integer.parseInt(s1.substring(3));
                cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(cipher.getUnderlyingCipher(), j));
                return;
            } else
            {
                cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(cipher.getUnderlyingCipher(), cipher.getBlockSize() * 8));
                return;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("can't support mode ").append(s).toString());
        }
    }

    protected void engineSetPadding(String s)
        throws NoSuchPaddingException
    {
        String s1 = Strings.toUpperCase(s);
        if (s1.equals("NOPADDING"))
        {
            cipher = new BufferedBlockCipher(cipher.getUnderlyingCipher());
            return;
        }
        if (s1.equals("PKCS5PADDING") || s1.equals("PKCS7PADDING") || s1.equals("ISO10126PADDING"))
        {
            cipher = new PaddedBufferedBlockCipher(cipher.getUnderlyingCipher());
            return;
        }
        if (s1.equals("WITHCTS"))
        {
            cipher = new CTSBlockCipher(cipher.getUnderlyingCipher());
            return;
        } else
        {
            throw new NoSuchPaddingException((new StringBuilder()).append("Padding ").append(s).append(" unknown.").toString());
        }
    }

    protected Key engineUnwrap(byte abyte0[], String s, int i)
        throws InvalidKeyException
    {
        try
        {
            abyte0 = engineDoFinal(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException(abyte0.getMessage());
        }
        if (i == 3)
        {
            return new SecretKeySpec(abyte0, s);
        }
        try
        {
            s = KeyFactory.getInstance(s, BouncyCastleProvider.PROVIDER_NAME);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(abyte0.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(abyte0.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(abyte0.getMessage()).toString());
        }
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        return s.generatePublic(new X509EncodedKeySpec(abyte0));
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        abyte0 = s.generatePrivate(new PKCS8EncodedKeySpec(abyte0));
        return abyte0;
        throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(i).toString());
    }

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        return cipher.processBytes(abyte0, i, j, abyte1, k);
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        int k = cipher.getUpdateOutputSize(j);
        if (k > 0)
        {
            byte abyte1[] = new byte[k];
            cipher.processBytes(abyte0, i, j, abyte1, 0);
            return abyte1;
        } else
        {
            cipher.processBytes(abyte0, i, j, null, 0);
            return null;
        }
    }

    protected byte[] engineWrap(Key key)
        throws IllegalBlockSizeException, InvalidKeyException
    {
        key = key.getEncoded();
        if (key == null)
        {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try
        {
            key = engineDoFinal(key, 0, key.length);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new IllegalBlockSizeException(key.getMessage());
        }
        return key;
    }
}
