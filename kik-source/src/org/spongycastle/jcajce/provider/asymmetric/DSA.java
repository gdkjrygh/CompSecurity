// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.dsa.DSAUtil;
import org.spongycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class DSA
{
    public static class Mappings extends AsymmetricAlgorithmProvider
    {

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("AlgorithmParameters.DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.AlgorithmParametersSpi");
            configurableprovider.a("AlgorithmParameterGenerator.DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.AlgorithmParameterGeneratorSpi");
            configurableprovider.a("KeyPairGenerator.DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.KeyPairGeneratorSpi");
            configurableprovider.a("KeyFactory.DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi");
            configurableprovider.a("Signature.DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.DSASigner$stdDSA");
            configurableprovider.a("Signature.NONEWITHDSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.DSASigner$noneDSA");
            configurableprovider.a("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
            a(configurableprovider, "SHA224", "DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa224", NISTObjectIdentifiers.C);
            a(configurableprovider, "SHA256", "DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa256", NISTObjectIdentifiers.D);
            a(configurableprovider, "SHA384", "DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa384", NISTObjectIdentifiers.E);
            a(configurableprovider, "SHA512", "DSA", "org.spongycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512", NISTObjectIdentifiers.F);
            configurableprovider.a("Alg.Alias.Signature.SHA/DSA", "DSA");
            configurableprovider.a("Alg.Alias.Signature.SHA1withDSA", "DSA");
            configurableprovider.a("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
            configurableprovider.a("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
            configurableprovider.a("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
            configurableprovider.a("Alg.Alias.Signature.DSAwithSHA1", "DSA");
            configurableprovider.a("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
            configurableprovider.a("Alg.Alias.Signature.SHA1WithDSA", "DSA");
            configurableprovider.a("Alg.Alias.Signature.DSAWithSHA1", "DSA");
            configurableprovider.a("Alg.Alias.Signature.1.2.840.10040.4.3", "DSA");
            KeyFactorySpi keyfactoryspi = new KeyFactorySpi();
            for (int i = 0; i != DSAUtil.a.length; i++)
            {
                a(configurableprovider, DSAUtil.a[i], "DSA", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (keyfactoryspi)));
                a(configurableprovider, DSAUtil.a[i], "DSA");
            }

        }

        public Mappings()
        {
        }
    }


    public DSA()
    {
    }
}
