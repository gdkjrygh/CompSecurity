// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class RSAUtil
{

    public static final ASN1ObjectIdentifier a[];

    public RSAUtil()
    {
    }

    static RSAKeyParameters a(RSAPrivateKey rsaprivatekey)
    {
        if (rsaprivatekey instanceof RSAPrivateCrtKey)
        {
            rsaprivatekey = (RSAPrivateCrtKey)rsaprivatekey;
            return new RSAPrivateCrtKeyParameters(rsaprivatekey.getModulus(), rsaprivatekey.getPublicExponent(), rsaprivatekey.getPrivateExponent(), rsaprivatekey.getPrimeP(), rsaprivatekey.getPrimeQ(), rsaprivatekey.getPrimeExponentP(), rsaprivatekey.getPrimeExponentQ(), rsaprivatekey.getCrtCoefficient());
        } else
        {
            return new RSAKeyParameters(true, rsaprivatekey.getModulus(), rsaprivatekey.getPrivateExponent());
        }
    }

    static RSAKeyParameters a(RSAPublicKey rsapublickey)
    {
        return new RSAKeyParameters(false, rsapublickey.getModulus(), rsapublickey.getPublicExponent());
    }

    public static boolean a(ASN1ObjectIdentifier asn1objectidentifier)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i != a.length)
                {
                    if (!asn1objectidentifier.equals(a[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    static 
    {
        a = (new ASN1ObjectIdentifier[] {
            PKCSObjectIdentifiers.D_, X509ObjectIdentifiers.l, PKCSObjectIdentifiers.h, PKCSObjectIdentifiers.k
        });
    }
}
