// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class X509
{
    public static class Mappings extends AsymmetricAlgorithmProvider
    {

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("KeyFactory.X.509", "org.spongycastle.jcajce.provider.asymmetric.x509.KeyFactory");
            configurableprovider.a("Alg.Alias.KeyFactory.X509", "X.509");
            configurableprovider.a("CertificateFactory.X.509", "org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory");
            configurableprovider.a("Alg.Alias.CertificateFactory.X509", "X.509");
        }

        public Mappings()
        {
        }
    }


    public X509()
    {
    }
}
