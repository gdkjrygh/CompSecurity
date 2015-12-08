// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseSecretKeyFactory, PBE, BCPBEKey

public class PBESecretKeyFactory extends BaseSecretKeyFactory
    implements PBE
{

    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;

    public PBESecretKeyFactory(String s)
    {
        super(s);
        c = true;
        d = 2;
        e = 1;
        f = 128;
        g = 64;
    }

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof PBEKeySpec)
        {
            PBEKeySpec pbekeyspec = (PBEKeySpec)keyspec;
            if (pbekeyspec.getSalt() == null)
            {
                return new BCPBEKey(a, b, d, e, f, g, pbekeyspec, null);
            }
            if (c)
            {
                keyspec = PBE.Util.a(pbekeyspec, d, e, f, g);
            } else
            {
                keyspec = PBE.Util.a(pbekeyspec, d, e, f);
            }
            return new BCPBEKey(a, b, d, e, f, g, pbekeyspec, keyspec);
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }
}
