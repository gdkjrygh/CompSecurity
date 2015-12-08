// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class JCEDHPrivateKey
    implements DHPrivateKey, PKCS12BagAttributeCarrier
{

    BigInteger a;
    private DHParameterSpec b;
    private PrivateKeyInfo c;
    private PKCS12BagAttributeCarrier d;

    protected JCEDHPrivateKey()
    {
        d = new PKCS12BagAttributeCarrierImpl();
    }

    public final Enumeration a()
    {
        return d.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return d.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        d.a(asn1objectidentifier, asn1encodable);
    }

    public String getAlgorithm()
    {
        return "DH";
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            if (c != null)
            {
                return c.a("DER");
            }
            abyte0 = (new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.q, new DHParameter(b.getP(), b.getG(), b.getL())), new DERInteger(getX()))).a("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
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
