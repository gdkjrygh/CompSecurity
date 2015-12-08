// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.Permission;
import org.bouncycastle.jce.ProviderConfigurationPermission;
import org.bouncycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider

public class ProviderUtil
{

    private static final long a = Runtime.getRuntime().maxMemory();
    private static Permission b;
    private static Permission c;
    private static ThreadLocal d = new ThreadLocal();
    private static volatile ECParameterSpec e;

    public ProviderUtil()
    {
    }

    static int a(InputStream inputstream)
    {
        if (inputstream instanceof ByteArrayInputStream)
        {
            return inputstream.available();
        }
        if (a > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)a;
        }
    }

    public static ECParameterSpec a()
    {
        ECParameterSpec ecparameterspec = (ECParameterSpec)d.get();
        if (ecparameterspec != null)
        {
            return ecparameterspec;
        } else
        {
            return e;
        }
    }

    static 
    {
        b = new ProviderConfigurationPermission(BouncyCastleProvider.a, "threadLocalEcImplicitlyCa");
        c = new ProviderConfigurationPermission(BouncyCastleProvider.a, "ecImplicitlyCa");
    }
}
