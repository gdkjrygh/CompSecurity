// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.spec.ElGamalParameterSpec;

public class JCEElGamalPrivateKey
    implements DHPrivateKey, ElGamalPrivateKey, PKCS12BagAttributeCarrier
{

    BigInteger a;
    ElGamalParameterSpec b;
    private PKCS12BagAttributeCarrierImpl c;

    protected JCEElGamalPrivateKey()
    {
        c = new PKCS12BagAttributeCarrierImpl();
    }

    public final Enumeration a()
    {
        return c.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return c.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        c.a(asn1objectidentifier, asn1encodable);
    }

    public final ElGamalParameterSpec b()
    {
        return b;
    }

    public String getAlgorithm()
    {
        return "ElGamal";
    }

    public byte[] getEncoded()
    {
        return KeyUtil.b(new AlgorithmIdentifier(OIWObjectIdentifiers.l, new ElGamalParameter(b.a(), b.b())), new DERInteger(getX()));
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
