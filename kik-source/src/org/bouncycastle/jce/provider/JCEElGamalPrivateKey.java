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
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            e

public class JCEElGamalPrivateKey
    implements DHPrivateKey, ElGamalPrivateKey, PKCS12BagAttributeCarrier
{

    BigInteger a;
    ElGamalParameterSpec b;
    private e c;

    protected JCEElGamalPrivateKey()
    {
        c = new e();
    }

    JCEElGamalPrivateKey(DHPrivateKey dhprivatekey)
    {
        c = new e();
        a = dhprivatekey.getX();
        b = new ElGamalParameterSpec(dhprivatekey.getParams().getP(), dhprivatekey.getParams().getG());
    }

    JCEElGamalPrivateKey(DHPrivateKeySpec dhprivatekeyspec)
    {
        c = new e();
        a = dhprivatekeyspec.getX();
        b = new ElGamalParameterSpec(dhprivatekeyspec.getP(), dhprivatekeyspec.getG());
    }

    JCEElGamalPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        c = new e();
        ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)privatekeyinfo.e().g());
        a = ((DERInteger)privatekeyinfo.f()).e();
        b = new ElGamalParameterSpec(elgamalparameter.e(), elgamalparameter.f());
    }

    JCEElGamalPrivateKey(ElGamalPrivateKeyParameters elgamalprivatekeyparameters)
    {
        c = new e();
        a = elgamalprivatekeyparameters.getX();
        b = new ElGamalParameterSpec(elgamalprivatekeyparameters.getParameters().getP(), elgamalprivatekeyparameters.getParameters().getG());
    }

    JCEElGamalPrivateKey(ElGamalPrivateKey elgamalprivatekey)
    {
        c = new e();
        a = elgamalprivatekey.getX();
        b = elgamalprivatekey.a();
    }

    JCEElGamalPrivateKey(ElGamalPrivateKeySpec elgamalprivatekeyspec)
    {
        c = new e();
        a = elgamalprivatekeyspec.b();
        b = new ElGamalParameterSpec(elgamalprivatekeyspec.a().a(), elgamalprivatekeyspec.a().b());
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return c.a(derobjectidentifier);
    }

    public final ElGamalParameterSpec a()
    {
        return b;
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        c.a(derobjectidentifier, derencodable);
    }

    public final Enumeration c()
    {
        return c.c();
    }

    public String getAlgorithm()
    {
        return "ElGamal";
    }

    public byte[] getEncoded()
    {
        return (new PrivateKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.l, (new ElGamalParameter(b.a(), b.b())).c()), new DERInteger(getX()))).b();
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public DHParameterSpec getParams()
    {
        return new DHParameterSpec(b.a(), b.b());
    }

    public BigInteger getX()
    {
        return a;
    }
}
