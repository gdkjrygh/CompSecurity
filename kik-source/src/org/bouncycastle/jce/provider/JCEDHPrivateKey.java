// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.DHDomainParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

// Referenced classes of package org.bouncycastle.jce.provider:
//            e

public class JCEDHPrivateKey
    implements DHPrivateKey, PKCS12BagAttributeCarrier
{

    BigInteger a;
    private DHParameterSpec b;
    private PrivateKeyInfo c;
    private PKCS12BagAttributeCarrier d;

    protected JCEDHPrivateKey()
    {
        d = new e();
    }

    JCEDHPrivateKey(DHPrivateKey dhprivatekey)
    {
        d = new e();
        a = dhprivatekey.getX();
        b = dhprivatekey.getParams();
    }

    JCEDHPrivateKey(DHPrivateKeySpec dhprivatekeyspec)
    {
        d = new e();
        a = dhprivatekeyspec.getX();
        b = new DHParameterSpec(dhprivatekeyspec.getP(), dhprivatekeyspec.getG());
    }

    JCEDHPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        d = new e();
        ASN1Sequence asn1sequence = ASN1Sequence.a(privatekeyinfo.e().g());
        DERInteger derinteger = (DERInteger)privatekeyinfo.f();
        DERObjectIdentifier derobjectidentifier = privatekeyinfo.e().e();
        c = privatekeyinfo;
        a = derinteger.e();
        if (derobjectidentifier.equals(PKCSObjectIdentifiers.q))
        {
            privatekeyinfo = new DHParameter(asn1sequence);
            if (privatekeyinfo.g() != null)
            {
                b = new DHParameterSpec(privatekeyinfo.e(), privatekeyinfo.f(), privatekeyinfo.g().intValue());
                return;
            } else
            {
                b = new DHParameterSpec(privatekeyinfo.e(), privatekeyinfo.f());
                return;
            }
        }
        if (derobjectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            privatekeyinfo = DHDomainParameters.a(asn1sequence);
            b = new DHParameterSpec(privatekeyinfo.e().e(), privatekeyinfo.f().e());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown algorithm type: ")).append(derobjectidentifier).toString());
        }
    }

    JCEDHPrivateKey(DHPrivateKeyParameters dhprivatekeyparameters)
    {
        d = new e();
        a = dhprivatekeyparameters.getX();
        b = new DHParameterSpec(dhprivatekeyparameters.getParameters().getP(), dhprivatekeyparameters.getParameters().getG(), dhprivatekeyparameters.getParameters().getL());
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return d.a(derobjectidentifier);
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        d.a(derobjectidentifier, derencodable);
    }

    public final Enumeration c()
    {
        return d.c();
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
            return (new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.q, (new DHParameter(b.getP(), b.getG(), b.getL())).c()), new DERInteger(getX()))).b();
        }
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public DHParameterSpec getParams()
    {
        return b;
    }

    public BigInteger getX()
    {
        return a;
    }
}
