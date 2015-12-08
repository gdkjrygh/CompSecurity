// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PrivateKeySpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            e

public class JDKGOST3410PrivateKey
    implements GOST3410PrivateKey, PKCS12BagAttributeCarrier
{

    BigInteger a;
    GOST3410Params b;
    private PKCS12BagAttributeCarrier c;

    protected JDKGOST3410PrivateKey()
    {
        c = new e();
    }

    JDKGOST3410PrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        c = new e();
        GOST3410PublicKeyAlgParameters gost3410publickeyalgparameters = new GOST3410PublicKeyAlgParameters((ASN1Sequence)privatekeyinfo.e().g());
        privatekeyinfo = ((DEROctetString)privatekeyinfo.f()).f();
        byte abyte0[] = new byte[privatekeyinfo.length];
        for (int i = 0; i != privatekeyinfo.length; i++)
        {
            abyte0[i] = privatekeyinfo[privatekeyinfo.length - 1 - i];
        }

        a = new BigInteger(1, abyte0);
        b = GOST3410ParameterSpec.a(gost3410publickeyalgparameters);
    }

    JDKGOST3410PrivateKey(GOST3410PrivateKeyParameters gost3410privatekeyparameters, GOST3410ParameterSpec gost3410parameterspec)
    {
        c = new e();
        a = gost3410privatekeyparameters.getX();
        b = gost3410parameterspec;
        if (gost3410parameterspec == null)
        {
            throw new IllegalArgumentException("spec is null");
        } else
        {
            return;
        }
    }

    JDKGOST3410PrivateKey(GOST3410PrivateKeySpec gost3410privatekeyspec)
    {
        c = new e();
        a = gost3410privatekeyspec.a();
        b = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gost3410privatekeyspec.b(), gost3410privatekeyspec.c(), gost3410privatekeyspec.d()));
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return c.a(derobjectidentifier);
    }

    public final GOST3410Params a()
    {
        return b;
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        c.a(derobjectidentifier, derencodable);
    }

    public final BigInteger b()
    {
        return a;
    }

    public final Enumeration c()
    {
        return c.c();
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

        if (b instanceof GOST3410ParameterSpec)
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.c, (new GOST3410PublicKeyAlgParameters(new DERObjectIdentifier(b.a()), new DERObjectIdentifier(b.b()))).c()), new DEROctetString(((byte []) (obj))));
        } else
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.c), new DEROctetString(((byte []) (obj))));
        }
        return ((PrivateKeyInfo) (obj)).b();
    }

    public String getFormat()
    {
        return "PKCS#8";
    }
}
