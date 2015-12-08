// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.sec.SECNamedCurves;
import org.spongycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.spongycastle.asn1.x9.X962NamedCurves;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            BCECPublicKey, EC5Util

public class ECUtil
{

    public ECUtil()
    {
    }

    public static ASN1ObjectIdentifier a(String s)
    {
        ASN1ObjectIdentifier asn1objectidentifier1 = X962NamedCurves.b(s);
        ASN1ObjectIdentifier asn1objectidentifier = asn1objectidentifier1;
        if (asn1objectidentifier1 == null)
        {
            ASN1ObjectIdentifier asn1objectidentifier2 = SECNamedCurves.b(s);
            asn1objectidentifier = asn1objectidentifier2;
            if (asn1objectidentifier2 == null)
            {
                asn1objectidentifier = NISTNamedCurves.b(s);
            }
            asn1objectidentifier2 = asn1objectidentifier;
            if (asn1objectidentifier == null)
            {
                asn1objectidentifier2 = TeleTrusTNamedCurves.b(s);
            }
            asn1objectidentifier = asn1objectidentifier2;
            if (asn1objectidentifier2 == null)
            {
                asn1objectidentifier = ECGOST3410NamedCurves.b(s);
            }
        }
        return asn1objectidentifier;
    }

    public static X9ECParameters a(ASN1ObjectIdentifier asn1objectidentifier)
    {
        X9ECParameters x9ecparameters = X962NamedCurves.a(asn1objectidentifier);
        X9ECParameters x9ecparameters2 = x9ecparameters;
        if (x9ecparameters == null)
        {
            x9ecparameters2 = SECNamedCurves.a(asn1objectidentifier);
            X9ECParameters x9ecparameters1 = x9ecparameters2;
            if (x9ecparameters2 == null)
            {
                x9ecparameters1 = NISTNamedCurves.a(asn1objectidentifier);
            }
            x9ecparameters2 = x9ecparameters1;
            if (x9ecparameters1 == null)
            {
                x9ecparameters2 = TeleTrusTNamedCurves.a(asn1objectidentifier);
            }
        }
        return x9ecparameters2;
    }

    public static AsymmetricKeyParameter a(PrivateKey privatekey)
    {
        if (privatekey instanceof ECPrivateKey)
        {
            ECPrivateKey ecprivatekey = (ECPrivateKey)privatekey;
            privatekey = ecprivatekey.b();
            if (privatekey == null)
            {
                privatekey = BouncyCastleProvider.b.a();
            }
            return new ECPrivateKeyParameters(ecprivatekey.c(), new ECDomainParameters(privatekey.b(), privatekey.c(), privatekey.d(), privatekey.e(), privatekey.f()));
        } else
        {
            throw new InvalidKeyException("can't identify EC private key.");
        }
    }

    public static AsymmetricKeyParameter a(PublicKey publickey)
    {
        if (publickey instanceof ECPublicKey)
        {
            publickey = (ECPublicKey)publickey;
            ECParameterSpec ecparameterspec = publickey.b();
            if (ecparameterspec == null)
            {
                ecparameterspec = BouncyCastleProvider.b.a();
                return new ECPublicKeyParameters(((BCECPublicKey)publickey).c(), new ECDomainParameters(ecparameterspec.b(), ecparameterspec.c(), ecparameterspec.d(), ecparameterspec.e(), ecparameterspec.f()));
            } else
            {
                return new ECPublicKeyParameters(publickey.a(), new ECDomainParameters(ecparameterspec.b(), ecparameterspec.c(), ecparameterspec.d(), ecparameterspec.e(), ecparameterspec.f()));
            }
        }
        if (publickey instanceof java.security.interfaces.ECPublicKey)
        {
            publickey = (java.security.interfaces.ECPublicKey)publickey;
            ECParameterSpec ecparameterspec1 = EC5Util.a(publickey.getParams(), false);
            return new ECPublicKeyParameters(EC5Util.a(publickey.getParams(), publickey.getW()), new ECDomainParameters(ecparameterspec1.b(), ecparameterspec1.c(), ecparameterspec1.d(), ecparameterspec1.e(), ecparameterspec1.f()));
        } else
        {
            throw new InvalidKeyException("cannot identify EC public key.");
        }
    }

    static int[] a(int ai[])
    {
        int ai1[] = new int[3];
        if (ai.length == 1)
        {
            ai1[0] = ai[0];
            return ai1;
        }
        if (ai.length != 3)
        {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        if (ai[0] < ai[1] && ai[0] < ai[2])
        {
            ai1[0] = ai[0];
            if (ai[1] < ai[2])
            {
                ai1[1] = ai[1];
                ai1[2] = ai[2];
                return ai1;
            } else
            {
                ai1[1] = ai[2];
                ai1[2] = ai[1];
                return ai1;
            }
        }
        if (ai[1] < ai[2])
        {
            ai1[0] = ai[1];
            if (ai[0] < ai[2])
            {
                ai1[1] = ai[0];
                ai1[2] = ai[2];
                return ai1;
            } else
            {
                ai1[1] = ai[2];
                ai1[2] = ai[0];
                return ai1;
            }
        }
        ai1[0] = ai[2];
        if (ai[0] < ai[1])
        {
            ai1[1] = ai[0];
            ai1[2] = ai[1];
            return ai1;
        } else
        {
            ai1[1] = ai[1];
            ai1[2] = ai[0];
            return ai1;
        }
    }

    public static String b(ASN1ObjectIdentifier asn1objectidentifier)
    {
        String s1 = X962NamedCurves.b(asn1objectidentifier);
        String s = s1;
        if (s1 == null)
        {
            String s2 = SECNamedCurves.b(asn1objectidentifier);
            s = s2;
            if (s2 == null)
            {
                s = NISTNamedCurves.b(asn1objectidentifier);
            }
            s2 = s;
            if (s == null)
            {
                s2 = TeleTrusTNamedCurves.b(asn1objectidentifier);
            }
            s = s2;
            if (s2 == null)
            {
                s = ECGOST3410NamedCurves.b(asn1objectidentifier);
            }
        }
        return s;
    }
}
