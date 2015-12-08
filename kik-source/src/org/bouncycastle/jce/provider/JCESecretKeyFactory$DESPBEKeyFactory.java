// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCESecretKeyFactory, JCEPBEKey

public static class g extends JCESecretKeyFactory
{

    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof PBEKeySpec)
        {
            PBEKeySpec pbekeyspec = (PBEKeySpec)keyspec;
            if (pbekeyspec.getSalt() == null)
            {
                return new JCEPBEKey(a, b, d, e, f, g, pbekeyspec, null);
            }
            KeyParameter keyparameter;
            if (c)
            {
                keyspec = c(pbekeyspec, d, e, f, g);
            } else
            {
                keyspec = g(pbekeyspec, d, e, f);
            }
            if (keyspec instanceof ParametersWithIV)
            {
                keyparameter = (KeyParameter)((ParametersWithIV)keyspec).getParameters();
            } else
            {
                keyparameter = (KeyParameter)keyspec;
            }
            DESParameters.setOddParity(keyparameter.getKey());
            return new JCEPBEKey(a, b, d, e, f, g, pbekeyspec, keyspec);
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public (String s, DERObjectIdentifier derobjectidentifier, int i, int j, int k)
    {
        super(s, derobjectidentifier);
        c = true;
        d = i;
        e = j;
        f = k;
        g = 64;
    }
}
