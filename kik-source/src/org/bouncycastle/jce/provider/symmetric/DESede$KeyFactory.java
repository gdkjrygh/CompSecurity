// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.JCESecretKeyFactory;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            DESede

public static class  extends JCESecretKeyFactory
{

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof DESedeKeySpec)
        {
            return new SecretKeySpec(((DESedeKeySpec)keyspec).getKey(), "DESede");
        } else
        {
            return super.engineGenerateSecret(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(SecretKey secretkey, Class class1)
    {
        if (class1 == null)
        {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretkey == null)
        {
            throw new InvalidKeySpecException("key parameter is null");
        }
        if (javax/crypto/spec/SecretKeySpec.isAssignableFrom(class1))
        {
            return new SecretKeySpec(secretkey.getEncoded(), a);
        }
        if (!javax/crypto/spec/DESedeKeySpec.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_137;
        }
        secretkey = secretkey.getEncoded();
        if (secretkey.length != 16)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        class1 = new byte[24];
        System.arraycopy(secretkey, 0, class1, 0, 16);
        System.arraycopy(secretkey, 0, class1, 16, 8);
        secretkey = new DESedeKeySpec(class1);
        return secretkey;
        try
        {
            secretkey = new DESedeKeySpec(secretkey);
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new InvalidKeySpecException(secretkey.toString());
        }
        return secretkey;
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    public ()
    {
        super("DESede", null);
    }
}
