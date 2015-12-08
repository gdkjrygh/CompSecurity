// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            BaseSecretKeyFactory, BCPBEKey

public static class ivSize extends BaseSecretKeyFactory
{

    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
        throws InvalidKeySpecException
    {
        if (keyspec instanceof PBEKeySpec)
        {
            PBEKeySpec pbekeyspec = (PBEKeySpec)keyspec;
            if (pbekeyspec.getSalt() == null)
            {
                return new BCPBEKey(algName, algOid, scheme, digest, keySize, ivSize, pbekeyspec, null);
            }
            KeyParameter keyparameter;
            if (forCipher)
            {
                keyspec = forCipher(pbekeyspec, scheme, digest, keySize, ivSize);
            } else
            {
                keyspec = ivSize(pbekeyspec, scheme, digest, keySize);
            }
            if (keyspec instanceof ParametersWithIV)
            {
                keyparameter = (KeyParameter)((ParametersWithIV)keyspec).getParameters();
            } else
            {
                keyparameter = (KeyParameter)keyspec;
            }
            DESParameters.setOddParity(keyparameter.getKey());
            return new BCPBEKey(algName, algOid, scheme, digest, keySize, ivSize, pbekeyspec, keyspec);
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public (String s, DERObjectIdentifier derobjectidentifier, boolean flag, int i, int j, int k, int l)
    {
        super(s, derobjectidentifier);
        forCipher = flag;
        scheme = i;
        digest = j;
        keySize = k;
        ivSize = l;
    }
}
