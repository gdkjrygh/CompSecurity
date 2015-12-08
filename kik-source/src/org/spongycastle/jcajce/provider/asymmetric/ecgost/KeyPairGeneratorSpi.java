// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ecgost;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.spongycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.ECKeyPairGenerator;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ecgost:
//            BCECGOST3410PublicKey, BCECGOST3410PrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    Object a;
    ECKeyPairGenerator b;
    String c;
    ECKeyGenerationParameters d;
    int e;
    SecureRandom f;
    boolean g;

    public KeyPairGeneratorSpi()
    {
        super("ECGOST3410");
        a = null;
        b = new ECKeyPairGenerator();
        c = "ECGOST3410";
        e = 239;
        f = null;
        g = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!g)
        {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
        Object obj = b.a();
        Object obj1 = (ECPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).a();
        obj = (ECPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).b();
        if (a instanceof ECParameterSpec)
        {
            ECParameterSpec ecparameterspec = (ECParameterSpec)a;
            obj1 = new BCECGOST3410PublicKey(c, ((ECPublicKeyParameters) (obj1)), ecparameterspec);
            return new KeyPair(((java.security.PublicKey) (obj1)), new BCECGOST3410PrivateKey(c, ((ECPrivateKeyParameters) (obj)), ((BCECGOST3410PublicKey) (obj1)), ecparameterspec));
        }
        if (a == null)
        {
            return new KeyPair(new BCECGOST3410PublicKey(c, ((ECPublicKeyParameters) (obj1))), new BCECGOST3410PrivateKey(c, ((ECPrivateKeyParameters) (obj))));
        } else
        {
            java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)a;
            obj1 = new BCECGOST3410PublicKey(c, ((ECPublicKeyParameters) (obj1)), ecparameterspec1);
            return new KeyPair(((java.security.PublicKey) (obj1)), new BCECGOST3410PrivateKey(c, ((ECPrivateKeyParameters) (obj)), ((BCECGOST3410PublicKey) (obj1)), ecparameterspec1));
        }
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        e = i;
        f = securerandom;
        if (a != null)
        {
            try
            {
                initialize(((AlgorithmParameterSpec) ((ECGenParameterSpec)a)), securerandom);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SecureRandom securerandom)
            {
                throw new InvalidParameterException("key size not configurable.");
            }
        } else
        {
            throw new InvalidParameterException("unknown key size.");
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (algorithmparameterspec instanceof ECParameterSpec)
        {
            ECParameterSpec ecparameterspec = (ECParameterSpec)algorithmparameterspec;
            a = algorithmparameterspec;
            d = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec.b(), ecparameterspec.c(), ecparameterspec.d()), securerandom);
            b.a(d);
            g = true;
            return;
        }
        if (algorithmparameterspec instanceof java.security.spec.ECParameterSpec)
        {
            java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)algorithmparameterspec;
            a = algorithmparameterspec;
            algorithmparameterspec = EC5Util.a(ecparameterspec1.getCurve());
            d = new ECKeyGenerationParameters(new ECDomainParameters(algorithmparameterspec, EC5Util.a(algorithmparameterspec, ecparameterspec1.getGenerator(), false), ecparameterspec1.getOrder(), BigInteger.valueOf(ecparameterspec1.getCofactor())), securerandom);
            b.a(d);
            g = true;
            return;
        }
        if ((algorithmparameterspec instanceof ECGenParameterSpec) || (algorithmparameterspec instanceof ECNamedCurveGenParameterSpec))
        {
            Object obj;
            if (algorithmparameterspec instanceof ECGenParameterSpec)
            {
                algorithmparameterspec = ((ECGenParameterSpec)algorithmparameterspec).getName();
            } else
            {
                algorithmparameterspec = ((ECNamedCurveGenParameterSpec)algorithmparameterspec).a();
            }
            obj = ECGOST3410NamedCurves.a(algorithmparameterspec);
            if (obj == null)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder("unknown curve name: ")).append(algorithmparameterspec).toString());
            } else
            {
                a = new ECNamedCurveSpec(algorithmparameterspec, ((ECDomainParameters) (obj)).a(), ((ECDomainParameters) (obj)).b(), ((ECDomainParameters) (obj)).c(), ((ECDomainParameters) (obj)).d(), ((ECDomainParameters) (obj)).e());
                algorithmparameterspec = (java.security.spec.ECParameterSpec)a;
                obj = EC5Util.a(algorithmparameterspec.getCurve());
                d = new ECKeyGenerationParameters(new ECDomainParameters(((org.spongycastle.math.ec.ECCurve) (obj)), EC5Util.a(((org.spongycastle.math.ec.ECCurve) (obj)), algorithmparameterspec.getGenerator(), false), algorithmparameterspec.getOrder(), BigInteger.valueOf(algorithmparameterspec.getCofactor())), securerandom);
                b.a(d);
                g = true;
                return;
            }
        }
        if (algorithmparameterspec == null && BouncyCastleProvider.b.a() != null)
        {
            ECParameterSpec ecparameterspec2 = BouncyCastleProvider.b.a();
            a = algorithmparameterspec;
            d = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec2.b(), ecparameterspec2.c(), ecparameterspec2.d()), securerandom);
            b.a(d);
            g = true;
            return;
        }
        if (algorithmparameterspec == null && BouncyCastleProvider.b.a() == null)
        {
            throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
        } else
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("parameter object not a ECParameterSpec: ")).append(algorithmparameterspec.getClass().getName()).toString());
        }
    }
}
