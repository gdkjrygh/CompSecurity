// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.sec.ECPrivateKeyStructure;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.spongycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.interfaces.ECPointEncoder;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider

public class JCEECPrivateKey
    implements ECPrivateKey, ECPointEncoder, org.spongycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier
{

    private String a;
    private BigInteger b;
    private java.security.spec.ECParameterSpec c;
    private boolean d;
    private DERBitString e;
    private PKCS12BagAttributeCarrierImpl f;

    protected JCEECPrivateKey()
    {
        a = "EC";
        f = new PKCS12BagAttributeCarrierImpl();
    }

    private ECParameterSpec d()
    {
        if (c != null)
        {
            return EC5Util.a(c, d);
        } else
        {
            return BouncyCastleProvider.b.a();
        }
    }

    public final Enumeration a()
    {
        return f.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return f.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        f.a(asn1objectidentifier, asn1encodable);
    }

    public final ECParameterSpec b()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return EC5Util.a(c, d);
        }
    }

    public final BigInteger c()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof JCEECPrivateKey)
        {
            if (b.equals(((JCEECPrivateKey) (obj = (JCEECPrivateKey)obj)).b) && d().equals(((JCEECPrivateKey) (obj)).d()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return a;
    }

    public byte[] getEncoded()
    {
        Object obj;
        ECPrivateKeyStructure ecprivatekeystructure;
        if (c instanceof ECNamedCurveSpec)
        {
            ASN1ObjectIdentifier asn1objectidentifier = ECUtil.a(((ECNamedCurveSpec)c).a());
            obj = asn1objectidentifier;
            if (asn1objectidentifier == null)
            {
                obj = new DERObjectIdentifier(((ECNamedCurveSpec)c).a());
            }
            obj = new X962Parameters(((org.spongycastle.asn1.ASN1Primitive) (obj)));
        } else
        if (c == null)
        {
            obj = new X962Parameters(DERNull.a);
        } else
        {
            obj = EC5Util.a(c.getCurve());
            obj = new X962Parameters(new X9ECParameters(((org.spongycastle.math.ec.ECCurve) (obj)), EC5Util.a(((org.spongycastle.math.ec.ECCurve) (obj)), c.getGenerator(), d), c.getOrder(), BigInteger.valueOf(c.getCofactor()), c.getCurve().getSeed()));
        }
        if (e != null)
        {
            ecprivatekeystructure = new ECPrivateKeyStructure(getS(), e, ((ASN1Encodable) (obj)));
        } else
        {
            ecprivatekeystructure = new ECPrivateKeyStructure(getS(), ((ASN1Encodable) (obj)));
        }
        if (!a.equals("ECGOST3410"))
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.d, ((X962Parameters) (obj)).a()), ecprivatekeystructure.a());
_L1:
        obj = ((PrivateKeyInfo) (obj)).a("DER");
        return ((byte []) (obj));
        try
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.k, ((X962Parameters) (obj)).a()), ecprivatekeystructure.a());
        }
        catch (IOException ioexception)
        {
            return null;
        }
          goto _L1
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public java.security.spec.ECParameterSpec getParams()
    {
        return c;
    }

    public BigInteger getS()
    {
        return b;
    }

    public int hashCode()
    {
        return b.hashCode() ^ d().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("EC Private Key").append(s);
        stringbuffer.append("             S: ").append(b.toString(16)).append(s);
        return stringbuffer.toString();
    }
}
