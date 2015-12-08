// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.asymmetric.ec;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.JCEECPublicKey;
import org.bouncycastle.jce.provider.ProviderUtil;
import org.bouncycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider.asymmetric.ec:
//            EC5Util

public class ECUtil
{

    public ECUtil()
    {
    }

    public static DERObjectIdentifier a(String s)
    {
        DERObjectIdentifier derobjectidentifier1 = X962NamedCurves.b(s);
        DERObjectIdentifier derobjectidentifier = derobjectidentifier1;
        if (derobjectidentifier1 == null)
        {
            DERObjectIdentifier derobjectidentifier2 = SECNamedCurves.b(s);
            derobjectidentifier = derobjectidentifier2;
            if (derobjectidentifier2 == null)
            {
                derobjectidentifier = NISTNamedCurves.b(s);
            }
            derobjectidentifier2 = derobjectidentifier;
            if (derobjectidentifier == null)
            {
                derobjectidentifier2 = TeleTrusTNamedCurves.b(s);
            }
            derobjectidentifier = derobjectidentifier2;
            if (derobjectidentifier2 == null)
            {
                derobjectidentifier = ECGOST3410NamedCurves.b(s);
            }
        }
        return derobjectidentifier;
    }

    public static X9ECParameters a(DERObjectIdentifier derobjectidentifier)
    {
        X9ECParameters x9ecparameters = X962NamedCurves.a(derobjectidentifier);
        X9ECParameters x9ecparameters2 = x9ecparameters;
        if (x9ecparameters == null)
        {
            x9ecparameters2 = SECNamedCurves.a(derobjectidentifier);
            X9ECParameters x9ecparameters1 = x9ecparameters2;
            if (x9ecparameters2 == null)
            {
                x9ecparameters1 = NISTNamedCurves.a(derobjectidentifier);
            }
            x9ecparameters2 = x9ecparameters1;
            if (x9ecparameters1 == null)
            {
                x9ecparameters2 = TeleTrusTNamedCurves.a(derobjectidentifier);
            }
        }
        return x9ecparameters2;
    }

    public static AsymmetricKeyParameter a(PrivateKey privatekey)
    {
        if (privatekey instanceof ECPrivateKey)
        {
            ECPrivateKey ecprivatekey = (ECPrivateKey)privatekey;
            privatekey = ecprivatekey.a();
            if (privatekey == null)
            {
                privatekey = ProviderUtil.a();
            }
            return new ECPrivateKeyParameters(ecprivatekey.b(), new ECDomainParameters(privatekey.b(), privatekey.c(), privatekey.d(), privatekey.e(), privatekey.f()));
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
            ECParameterSpec ecparameterspec = publickey.a();
            if (ecparameterspec == null)
            {
                ecparameterspec = ProviderUtil.a();
                return new ECPublicKeyParameters(((JCEECPublicKey)publickey).c(), new ECDomainParameters(ecparameterspec.b(), ecparameterspec.c(), ecparameterspec.d(), ecparameterspec.e(), ecparameterspec.f()));
            } else
            {
                return new ECPublicKeyParameters(publickey.b(), new ECDomainParameters(ecparameterspec.b(), ecparameterspec.c(), ecparameterspec.d(), ecparameterspec.e(), ecparameterspec.f()));
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

    public static String b(DERObjectIdentifier derobjectidentifier)
    {
        String s1 = X962NamedCurves.b(derobjectidentifier);
        String s = s1;
        if (s1 == null)
        {
            String s2 = SECNamedCurves.b(derobjectidentifier);
            s = s2;
            if (s2 == null)
            {
                s = NISTNamedCurves.b(derobjectidentifier);
            }
            s2 = s;
            if (s == null)
            {
                s2 = TeleTrusTNamedCurves.b(derobjectidentifier);
            }
            s = s2;
            if (s2 == null)
            {
                s = ECGOST3410NamedCurves.b(derobjectidentifier);
            }
        }
        return s;
    }
}
