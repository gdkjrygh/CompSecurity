// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.crypto.params.DESParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseSecretKeyFactory, BCPBEKey

public static class  extends BaseSecretKeyFactory
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
                return new BCPBEKey(a, b, d, e, f, g, pbekeyspec, null);
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
                keyparameter = (KeyParameter)((ParametersWithIV)keyspec).b();
            } else
            {
                keyparameter = (KeyParameter)keyspec;
            }
            DESParameters.a(keyparameter.a());
            return new BCPBEKey(a, b, d, e, f, g, pbekeyspec, keyspec);
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }
}
