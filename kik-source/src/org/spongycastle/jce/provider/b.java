// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.Permission;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.spongycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider

final class b
    implements ProviderConfiguration
{

    private static Permission a;
    private static Permission b;
    private static Permission c;
    private static Permission d;
    private ThreadLocal e;
    private ThreadLocal f;
    private volatile ECParameterSpec g;
    private volatile DHParameterSpec h;

    b()
    {
        e = new ThreadLocal();
        f = new ThreadLocal();
    }

    public final ECParameterSpec a()
    {
        ECParameterSpec ecparameterspec = (ECParameterSpec)e.get();
        if (ecparameterspec != null)
        {
            return ecparameterspec;
        } else
        {
            return g;
        }
    }

    public final DHParameterSpec b()
    {
        DHParameterSpec dhparameterspec = (DHParameterSpec)f.get();
        if (dhparameterspec != null)
        {
            return dhparameterspec;
        } else
        {
            return h;
        }
    }

    static 
    {
        a = new ProviderConfigurationPermission(BouncyCastleProvider.a, "threadLocalEcImplicitlyCa");
        b = new ProviderConfigurationPermission(BouncyCastleProvider.a, "ecImplicitlyCa");
        c = new ProviderConfigurationPermission(BouncyCastleProvider.a, "threadLocalDhDefaultParams");
        d = new ProviderConfigurationPermission(BouncyCastleProvider.a, "DhDefaultParams");
    }
}
