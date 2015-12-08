// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

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
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseWrapCipher, PBE, BCPBEKey

public class BaseStreamCipher extends BaseWrapCipher
    implements PBE
{

    private Class e[] = {
        javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec, javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec
    };
    private StreamCipher f;
    private ParametersWithIV g;
    private int h;
    private PBEParameterSpec i;
    private String j;

    protected BaseStreamCipher(StreamCipher streamcipher, int k)
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
            f.a(abyte0, k, l, abyte1, i1);
        }
        f.b();
        return l;
    }

    protected byte[] engineDoFinal(byte abyte0[], int k, int l)
    {
        if (l != 0)
        {
            abyte0 = engineUpdate(abyte0, k, l);
            f.b();
            return abyte0;
        } else
        {
            f.b();
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
            return g.a();
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
                if (key instanceof BCPBEKey)
                {
                    BCPBEKey bcpbekey = (BCPBEKey)key;
                    if (bcpbekey.b != null)
                    {
                        j = bcpbekey.b.c();
                    } else
                    {
                        j = bcpbekey.getAlgorithm();
                    }
                    if (bcpbekey.g != null)
                    {
                        key = bcpbekey.g;
                        i = new PBEParameterSpec(bcpbekey.getSalt(), bcpbekey.getIterationCount());
                    } else
                    if (algorithmparameterspec instanceof PBEParameterSpec)
                    {
                        key = PBE.Util.a(bcpbekey, algorithmparameterspec, f.a());
                        i = (PBEParameterSpec)algorithmparameterspec;
                    } else
                    {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    if (bcpbekey.f != 0)
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
                    f.a(true, algorithmparameterspec);
                    return;

                case 2: // '\002'
                case 4: // '\004'
                    f.a(false, algorithmparameterspec);
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
            f.a(abyte0, k, l, abyte1, i1);
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
        f.a(abyte0, k, l, abyte1, 0);
        return abyte1;
    }
}
