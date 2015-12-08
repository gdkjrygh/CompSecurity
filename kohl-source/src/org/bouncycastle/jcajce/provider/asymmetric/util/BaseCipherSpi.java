// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public abstract class BaseCipherSpi extends CipherSpi
{

    private Class availableSpecs[] = {
        javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec, javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec
    };
    protected AlgorithmParameters engineParams;
    private byte iv[];
    private int ivSize;
    protected Wrapper wrapEngine;

    protected BaseCipherSpi()
    {
        engineParams = null;
        wrapEngine = null;
    }

    protected int engineGetBlockSize()
    {
        return 0;
    }

    protected byte[] engineGetIV()
    {
        return null;
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length;
    }

    protected int engineGetOutputSize(int i)
    {
        return -1;
    }

    protected AlgorithmParameters engineGetParameters()
    {
        return null;
    }

    protected void engineSetMode(String s)
        throws NoSuchAlgorithmException
    {
        throw new NoSuchAlgorithmException((new StringBuilder()).append("can't support mode ").append(s).toString());
    }

    protected void engineSetPadding(String s)
        throws NoSuchPaddingException
    {
        throw new NoSuchPaddingException((new StringBuilder()).append("Padding ").append(s).append(" unknown.").toString());
    }

    protected Key engineUnwrap(byte abyte0[], String s, int i)
        throws InvalidKeyException
    {
        if (wrapEngine != null) goto _L2; else goto _L1
_L1:
        abyte0 = engineDoFinal(abyte0, 0, abyte0.length);
_L8:
        if (i != 3) goto _L4; else goto _L3
_L3:
        abyte0 = new SecretKeySpec(abyte0, s);
_L6:
        return abyte0;
_L2:
        try
        {
            abyte0 = wrapEngine.unwrap(abyte0, 0, abyte0.length);
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
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException(abyte0.getMessage());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s.equals("") || i != 2)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        PrivateKeyInfo privatekeyinfo;
        try
        {
            privatekeyinfo = PrivateKeyInfo.getInstance(abyte0);
            s = BouncyCastleProvider.getPrivateKey(privatekeyinfo);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException("Invalid key encoding.");
        }
        abyte0 = s;
        if (s != null) goto _L6; else goto _L5
_L5:
        throw new InvalidKeyException((new StringBuilder()).append("algorithm ").append(privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm()).append(" not supported").toString());
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
            break MISSING_BLOCK_LABEL_197;
        }
        return s.generatePublic(new X509EncodedKeySpec(abyte0));
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        abyte0 = s.generatePrivate(new PKCS8EncodedKeySpec(abyte0));
        return abyte0;
        throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(i).toString());
        if (true) goto _L8; else goto _L7
_L7:
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
            if (wrapEngine == null)
            {
                return engineDoFinal(key, 0, key.length);
            }
            key = wrapEngine.wrap(key, 0, key.length);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new IllegalBlockSizeException(key.getMessage());
        }
        return key;
    }
}
