// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric:
//            X509

public static class er extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("KeyFactory.X.509", "org.bouncycastle.jcajce.provider.asymmetric.x509.KeyFactory");
        configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.X509", "X.509");
        configurableprovider.addAlgorithm("CertificateFactory.X.509", "org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory");
        configurableprovider.addAlgorithm("Alg.Alias.CertificateFactory.X509", "X.509");
    }

    public er()
    {
    }
}
