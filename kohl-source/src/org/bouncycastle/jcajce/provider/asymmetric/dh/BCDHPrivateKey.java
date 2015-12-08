// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.DHDomainParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class BCDHPrivateKey
    implements DHPrivateKey, PKCS12BagAttributeCarrier
{

    static final long serialVersionUID = 0x4511a58411962b4L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient DHParameterSpec dhSpec;
    private transient PrivateKeyInfo info;
    private BigInteger x;

    protected BCDHPrivateKey()
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    BCDHPrivateKey(DHPrivateKey dhprivatekey)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dhprivatekey.getX();
        dhSpec = dhprivatekey.getParams();
    }

    BCDHPrivateKey(DHPrivateKeySpec dhprivatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dhprivatekeyspec.getX();
        dhSpec = new DHParameterSpec(dhprivatekeyspec.getP(), dhprivatekeyspec.getG());
    }

    public BCDHPrivateKey(PrivateKeyInfo privatekeyinfo)
        throws IOException
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ASN1Sequence asn1sequence = ASN1Sequence.getInstance(privatekeyinfo.getPrivateKeyAlgorithm().getParameters());
        ASN1Integer asn1integer = (ASN1Integer)privatekeyinfo.parsePrivateKey();
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm();
        info = privatekeyinfo;
        x = asn1integer.getValue();
        if (asn1objectidentifier.equals(PKCSObjectIdentifiers.dhKeyAgreement))
        {
            privatekeyinfo = DHParameter.getInstance(asn1sequence);
            if (privatekeyinfo.getL() != null)
            {
                dhSpec = new DHParameterSpec(privatekeyinfo.getP(), privatekeyinfo.getG(), privatekeyinfo.getL().intValue());
                return;
            } else
            {
                dhSpec = new DHParameterSpec(privatekeyinfo.getP(), privatekeyinfo.getG());
                return;
            }
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.dhpublicnumber))
        {
            privatekeyinfo = DHDomainParameters.getInstance(asn1sequence);
            dhSpec = new DHParameterSpec(privatekeyinfo.getP().getValue(), privatekeyinfo.getG().getValue());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown algorithm type: ").append(asn1objectidentifier).toString());
        }
    }

    BCDHPrivateKey(DHPrivateKeyParameters dhprivatekeyparameters)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dhprivatekeyparameters.getX();
        dhSpec = new DHParameterSpec(dhprivatekeyparameters.getParameters().getP(), dhprivatekeyparameters.getParameters().getG(), dhprivatekeyparameters.getParameters().getL());
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        dhSpec = new DHParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject(), objectinputstream.readInt());
        info = null;
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(dhSpec.getP());
        objectoutputstream.writeObject(dhSpec.getG());
        objectoutputstream.writeInt(dhSpec.getL());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHPrivateKey)
        {
            if (getX().equals(((DHPrivateKey) (obj = (DHPrivateKey)obj)).getX()) && getParams().getG().equals(((DHPrivateKey) (obj)).getParams().getG()) && getParams().getP().equals(((DHPrivateKey) (obj)).getParams().getP()) && getParams().getL() == ((DHPrivateKey) (obj)).getParams().getL())
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

    public ASN1Encodable getBagAttribute(DERObjectIdentifier derobjectidentifier)
    {
        return attrCarrier.getBagAttribute(derobjectidentifier);
    }

    public Enumeration getBagAttributeKeys()
    {
        return attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            if (info != null)
            {
                return info.getEncoded("DER");
            }
            abyte0 = (new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.dhKeyAgreement, (new DHParameter(dhSpec.getP(), dhSpec.getG(), dhSpec.getL())).toASN1Primitive()), new ASN1Integer(getX()))).getEncoded("DER");
        }
        catch (Exception exception)
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
        return dhSpec;
    }

    public BigInteger getX()
    {
        return x;
    }

    public int hashCode()
    {
        return getX().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getL();
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }
}
