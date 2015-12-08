// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.DHDomainParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

public class JCEDHPublicKey
    implements DHPublicKey
{

    private BigInteger a;
    private DHParameterSpec b;
    private SubjectPublicKeyInfo c;

    JCEDHPublicKey(BigInteger biginteger, DHParameterSpec dhparameterspec)
    {
        a = biginteger;
        b = dhparameterspec;
    }

    JCEDHPublicKey(DHPublicKey dhpublickey)
    {
        a = dhpublickey.getY();
        b = dhpublickey.getParams();
    }

    JCEDHPublicKey(DHPublicKeySpec dhpublickeyspec)
    {
        a = dhpublickeyspec.getY();
        b = new DHParameterSpec(dhpublickeyspec.getP(), dhpublickeyspec.getG());
    }

    JCEDHPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        Object obj;
        boolean flag;
        c = subjectpublickeyinfo;
        try
        {
            obj = (DERInteger)subjectpublickeyinfo.f();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
        a = ((DERInteger) (obj)).e();
        obj = ASN1Sequence.a(subjectpublickeyinfo.e().g());
        subjectpublickeyinfo = subjectpublickeyinfo.e().e();
        if (subjectpublickeyinfo.equals(PKCSObjectIdentifiers.q)) goto _L2; else goto _L1
_L1:
        if (((ASN1Sequence) (obj)).f() == 2) goto _L4; else goto _L3
_L3:
        if (((ASN1Sequence) (obj)).f() <= 3) goto _L6; else goto _L5
_L5:
        flag = false;
_L8:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        subjectpublickeyinfo = new DHParameter(((ASN1Sequence) (obj)));
        DERInteger derinteger;
        DERInteger derinteger1;
        if (subjectpublickeyinfo.g() != null)
        {
            b = new DHParameterSpec(subjectpublickeyinfo.e(), subjectpublickeyinfo.f(), subjectpublickeyinfo.g().intValue());
            return;
        } else
        {
            b = new DHParameterSpec(subjectpublickeyinfo.e(), subjectpublickeyinfo.f());
            return;
        }
_L6:
        derinteger = DERInteger.a(((ASN1Sequence) (obj)).a(2));
        derinteger1 = DERInteger.a(((ASN1Sequence) (obj)).a(0));
        if (derinteger.e().compareTo(BigInteger.valueOf(derinteger1.e().bitLength())) > 0)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
        if (subjectpublickeyinfo.equals(X9ObjectIdentifiers.ab))
        {
            subjectpublickeyinfo = DHDomainParameters.a(obj);
            b = new DHParameterSpec(subjectpublickeyinfo.e().e(), subjectpublickeyinfo.f().e());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown algorithm type: ")).append(subjectpublickeyinfo).toString());
        }
    }

    JCEDHPublicKey(DHPublicKeyParameters dhpublickeyparameters)
    {
        a = dhpublickeyparameters.getY();
        b = new DHParameterSpec(dhpublickeyparameters.getParameters().getP(), dhpublickeyparameters.getParameters().getG(), dhpublickeyparameters.getParameters().getL());
    }

    public String getAlgorithm()
    {
        return "DH";
    }

    public byte[] getEncoded()
    {
        if (c != null)
        {
            return c.b();
        } else
        {
            return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.q, (new DHParameter(b.getP(), b.getG(), b.getL())).c()), new DERInteger(a))).b();
        }
    }

    public String getFormat()
    {
        return "X.509";
    }

    public DHParameterSpec getParams()
    {
        return b;
    }

    public BigInteger getY()
    {
        return a;
    }
}
