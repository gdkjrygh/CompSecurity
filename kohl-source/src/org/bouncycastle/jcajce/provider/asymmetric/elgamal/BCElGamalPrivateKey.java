// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

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
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;

public class BCElGamalPrivateKey
    implements ElGamalPrivateKey, DHPrivateKey, PKCS12BagAttributeCarrier
{

    static final long serialVersionUID = 0x42e1c55fb6bcc04eL;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient ElGamalParameterSpec elSpec;
    private BigInteger x;

    protected BCElGamalPrivateKey()
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    BCElGamalPrivateKey(DHPrivateKey dhprivatekey)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dhprivatekey.getX();
        elSpec = new ElGamalParameterSpec(dhprivatekey.getParams().getP(), dhprivatekey.getParams().getG());
    }

    BCElGamalPrivateKey(DHPrivateKeySpec dhprivatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dhprivatekeyspec.getX();
        elSpec = new ElGamalParameterSpec(dhprivatekeyspec.getP(), dhprivatekeyspec.getG());
    }

    BCElGamalPrivateKey(PrivateKeyInfo privatekeyinfo)
        throws IOException
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)privatekeyinfo.getAlgorithmId().getParameters());
        x = ASN1Integer.getInstance(privatekeyinfo.parsePrivateKey()).getValue();
        elSpec = new ElGamalParameterSpec(elgamalparameter.getP(), elgamalparameter.getG());
    }

    BCElGamalPrivateKey(ElGamalPrivateKeyParameters elgamalprivatekeyparameters)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = elgamalprivatekeyparameters.getX();
        elSpec = new ElGamalParameterSpec(elgamalprivatekeyparameters.getParameters().getP(), elgamalprivatekeyparameters.getParameters().getG());
    }

    BCElGamalPrivateKey(ElGamalPrivateKey elgamalprivatekey)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = elgamalprivatekey.getX();
        elSpec = elgamalprivatekey.getParameters();
    }

    BCElGamalPrivateKey(ElGamalPrivateKeySpec elgamalprivatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = elgamalprivatekeyspec.getX();
        elSpec = new ElGamalParameterSpec(elgamalprivatekeyspec.getParams().getP(), elgamalprivatekeyspec.getParams().getG());
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        elSpec = new ElGamalParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject());
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(elSpec.getP());
        objectoutputstream.writeObject(elSpec.getG());
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
        return "ElGamal";
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
            abyte0 = (new PrivateKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.elGamalAlgorithm, new ElGamalParameter(elSpec.getP(), elSpec.getG())), new DERInteger(getX()))).getEncoded("DER");
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

    public ElGamalParameterSpec getParameters()
    {
        return elSpec;
    }

    public DHParameterSpec getParams()
    {
        return new DHParameterSpec(elSpec.getP(), elSpec.getG());
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
