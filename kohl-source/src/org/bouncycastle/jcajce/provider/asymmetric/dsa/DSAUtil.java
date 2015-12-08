// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;

public class DSAUtil
{

    public static final ASN1ObjectIdentifier dsaOids[];

    public DSAUtil()
    {
    }

    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privatekey)
        throws InvalidKeyException
    {
        if (privatekey instanceof DSAPrivateKey)
        {
            privatekey = (DSAPrivateKey)privatekey;
            return new DSAPrivateKeyParameters(privatekey.getX(), new DSAParameters(privatekey.getParams().getP(), privatekey.getParams().getQ(), privatekey.getParams().getG()));
        } else
        {
            throw new InvalidKeyException("can't identify DSA private key.");
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publickey)
        throws InvalidKeyException
    {
        if (publickey instanceof DSAPublicKey)
        {
            publickey = (DSAPublicKey)publickey;
            return new DSAPublicKeyParameters(publickey.getY(), new DSAParameters(publickey.getParams().getP(), publickey.getParams().getQ(), publickey.getParams().getG()));
        } else
        {
            throw new InvalidKeyException((new StringBuilder()).append("can't identify DSA public key: ").append(publickey.getClass().getName()).toString());
        }
    }

    public static boolean isDsaOid(ASN1ObjectIdentifier asn1objectidentifier)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i != dsaOids.length)
                {
                    if (!asn1objectidentifier.equals(dsaOids[i]))
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
        dsaOids = (new ASN1ObjectIdentifier[] {
            X9ObjectIdentifiers.id_dsa, OIWObjectIdentifiers.dsaWithSHA1
        });
    }
}
