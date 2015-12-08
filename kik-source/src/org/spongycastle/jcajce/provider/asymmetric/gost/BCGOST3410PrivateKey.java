// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.GOST3410Params;
import org.spongycastle.jce.interfaces.GOST3410PrivateKey;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.spec.GOST3410ParameterSpec;
import org.spongycastle.jce.spec.GOST3410PrivateKeySpec;
import org.spongycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public class BCGOST3410PrivateKey
    implements GOST3410PrivateKey, PKCS12BagAttributeCarrier
{

    private BigInteger a;
    private transient GOST3410Params b;
    private transient PKCS12BagAttributeCarrier c;

    protected BCGOST3410PrivateKey()
    {
        c = new PKCS12BagAttributeCarrierImpl();
    }

    BCGOST3410PrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        GOST3410PublicKeyAlgParameters gost3410publickeyalgparameters = new GOST3410PublicKeyAlgParameters((ASN1Sequence)privatekeyinfo.d().e());
        privatekeyinfo = ASN1OctetString.a(privatekeyinfo.e()).d();
        byte abyte0[] = new byte[privatekeyinfo.length];
        for (int i = 0; i != privatekeyinfo.length; i++)
        {
            abyte0[i] = privatekeyinfo[privatekeyinfo.length - 1 - i];
        }

        a = new BigInteger(1, abyte0);
        b = GOST3410ParameterSpec.a(gost3410publickeyalgparameters);
    }

    BCGOST3410PrivateKey(GOST3410PrivateKeyParameters gost3410privatekeyparameters, GOST3410ParameterSpec gost3410parameterspec)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = gost3410privatekeyparameters.c();
        b = gost3410parameterspec;
        if (gost3410parameterspec == null)
        {
            throw new IllegalArgumentException("spec is null");
        } else
        {
            return;
        }
    }

    BCGOST3410PrivateKey(GOST3410PrivateKey gost3410privatekey)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = gost3410privatekey.c();
        b = gost3410privatekey.b();
    }

    BCGOST3410PrivateKey(GOST3410PrivateKeySpec gost3410privatekeyspec)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = gost3410privatekeyspec.a();
        b = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gost3410privatekeyspec.b(), gost3410privatekeyspec.c(), gost3410privatekeyspec.d()));
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

    public final GOST3410Params b()
    {
        return b;
    }

    public final BigInteger c()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        Object obj1;
        if (obj instanceof GOST3410PrivateKey)
        {
            if (a.equals(((GOST3410PrivateKey) (obj1 = (GOST3410PrivateKey)obj)).c()) && b.d().equals(((GOST3410PrivateKey) (obj1)).b().d()) && b.b().equals(((GOST3410PrivateKey) (obj1)).b().b()))
            {
                obj = b.c();
                obj1 = ((GOST3410PrivateKey) (obj1)).b().c();
                boolean flag;
                if (obj == obj1)
                {
                    flag = true;
                } else
                if (obj == null)
                {
                    flag = false;
                } else
                {
                    flag = obj.equals(obj1);
                }
                if (flag)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "GOST3410";
    }

    public byte[] getEncoded()
    {
        int i = 0;
        byte abyte0[] = a.toByteArray();
        Object obj;
        if (abyte0[0] == 0)
        {
            obj = new byte[abyte0.length - 1];
        } else
        {
            obj = new byte[abyte0.length];
        }
        for (; i != obj.length; i++)
        {
            obj[i] = abyte0[abyte0.length - 1 - i];
        }

        try
        {
            if (b instanceof GOST3410ParameterSpec)
            {
                obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.c, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(b.a()), new ASN1ObjectIdentifier(b.b()))), new DEROctetString(((byte []) (obj))));
            } else
            {
                obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.c), new DEROctetString(((byte []) (obj))));
            }
            return ((PrivateKeyInfo) (obj)).a("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }
}
