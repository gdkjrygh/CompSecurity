// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.DHDomainParameters;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;

public class BCDHPublicKey
    implements DHPublicKey
{

    private BigInteger a;
    private transient DHParameterSpec b;
    private transient SubjectPublicKeyInfo c;

    BCDHPublicKey(BigInteger biginteger, DHParameterSpec dhparameterspec)
    {
        a = biginteger;
        b = dhparameterspec;
    }

    BCDHPublicKey(DHPublicKey dhpublickey)
    {
        a = dhpublickey.getY();
        b = dhpublickey.getParams();
    }

    BCDHPublicKey(DHPublicKeySpec dhpublickeyspec)
    {
        a = dhpublickeyspec.getY();
        b = new DHParameterSpec(dhpublickeyspec.getP(), dhpublickeyspec.getG());
    }

    public BCDHPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        Object obj;
        boolean flag;
        c = subjectpublickeyinfo;
        try
        {
            obj = (ASN1Integer)subjectpublickeyinfo.e();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
        a = ((ASN1Integer) (obj)).c();
        obj = ASN1Sequence.a(subjectpublickeyinfo.c().e());
        subjectpublickeyinfo = subjectpublickeyinfo.c().d();
        if (subjectpublickeyinfo.equals(PKCSObjectIdentifiers.q)) goto _L2; else goto _L1
_L1:
        if (((ASN1Sequence) (obj)).e() == 2) goto _L4; else goto _L3
_L3:
        if (((ASN1Sequence) (obj)).e() <= 3) goto _L6; else goto _L5
_L5:
        flag = false;
_L8:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        subjectpublickeyinfo = DHParameter.a(obj);
        ASN1Integer asn1integer;
        ASN1Integer asn1integer1;
        if (subjectpublickeyinfo.e() != null)
        {
            b = new DHParameterSpec(subjectpublickeyinfo.c(), subjectpublickeyinfo.d(), subjectpublickeyinfo.e().intValue());
            return;
        } else
        {
            b = new DHParameterSpec(subjectpublickeyinfo.c(), subjectpublickeyinfo.d());
            return;
        }
_L6:
        asn1integer = ASN1Integer.a(((ASN1Sequence) (obj)).a(2));
        asn1integer1 = ASN1Integer.a(((ASN1Sequence) (obj)).a(0));
        if (asn1integer.c().compareTo(BigInteger.valueOf(asn1integer1.c().bitLength())) > 0)
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
            b = new DHParameterSpec(subjectpublickeyinfo.c().c(), subjectpublickeyinfo.d().c());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown algorithm type: ")).append(subjectpublickeyinfo).toString());
        }
    }

    BCDHPublicKey(DHPublicKeyParameters dhpublickeyparameters)
    {
        a = dhpublickeyparameters.c();
        b = new DHParameterSpec(dhpublickeyparameters.b().a(), dhpublickeyparameters.b().b(), dhpublickeyparameters.b().e());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHPublicKey)
        {
            if (getY().equals(((DHPublicKey) (obj = (DHPublicKey)obj)).getY()) && getParams().getG().equals(((DHPublicKey) (obj)).getParams().getG()) && getParams().getP().equals(((DHPublicKey) (obj)).getParams().getP()) && getParams().getL() == ((DHPublicKey) (obj)).getParams().getL())
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "DH";
    }

    public byte[] getEncoded()
    {
        if (c != null)
        {
            return KeyUtil.a(c);
        } else
        {
            return KeyUtil.a(new AlgorithmIdentifier(PKCSObjectIdentifiers.q, (new DHParameter(b.getP(), b.getG(), b.getL())).a()), new ASN1Integer(a));
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

    public int hashCode()
    {
        return getY().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getL();
    }
}
