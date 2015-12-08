// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PrivateKeySpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public class BCGOST3410PrivateKey
    implements GOST3410PrivateKey, PKCS12BagAttributeCarrier
{

    static final long serialVersionUID = 0x77182fb116c68338L;
    private transient PKCS12BagAttributeCarrier attrCarrier;
    private transient GOST3410Params gost3410Spec;
    private BigInteger x;

    protected BCGOST3410PrivateKey()
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    BCGOST3410PrivateKey(PrivateKeyInfo privatekeyinfo)
        throws IOException
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        GOST3410PublicKeyAlgParameters gost3410publickeyalgparameters = new GOST3410PublicKeyAlgParameters((ASN1Sequence)privatekeyinfo.getAlgorithmId().getParameters());
        privatekeyinfo = ASN1OctetString.getInstance(privatekeyinfo.parsePrivateKey()).getOctets();
        byte abyte0[] = new byte[privatekeyinfo.length];
        for (int i = 0; i != privatekeyinfo.length; i++)
        {
            abyte0[i] = privatekeyinfo[privatekeyinfo.length - 1 - i];
        }

        x = new BigInteger(1, abyte0);
        gost3410Spec = GOST3410ParameterSpec.fromPublicKeyAlg(gost3410publickeyalgparameters);
    }

    BCGOST3410PrivateKey(GOST3410PrivateKeyParameters gost3410privatekeyparameters, GOST3410ParameterSpec gost3410parameterspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = gost3410privatekeyparameters.getX();
        gost3410Spec = gost3410parameterspec;
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
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = gost3410privatekey.getX();
        gost3410Spec = gost3410privatekey.getParameters();
    }

    BCGOST3410PrivateKey(GOST3410PrivateKeySpec gost3410privatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = gost3410privatekeyspec.getX();
        gost3410Spec = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gost3410privatekeyspec.getP(), gost3410privatekeyspec.getQ(), gost3410privatekeyspec.getA()));
    }

    private boolean compareObj(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        } else
        {
            return obj.equals(obj1);
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        String s = (String)objectinputstream.readObject();
        if (s != null)
        {
            gost3410Spec = new GOST3410ParameterSpec(s, (String)objectinputstream.readObject(), (String)objectinputstream.readObject());
        } else
        {
            gost3410Spec = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject()));
            objectinputstream.readObject();
            objectinputstream.readObject();
        }
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        if (gost3410Spec.getPublicKeyParamSetOID() != null)
        {
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParamSetOID());
            objectoutputstream.writeObject(gost3410Spec.getDigestParamSetOID());
            objectoutputstream.writeObject(gost3410Spec.getEncryptionParamSetOID());
            return;
        } else
        {
            objectoutputstream.writeObject(null);
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParameters().getP());
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParameters().getQ());
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParameters().getA());
            objectoutputstream.writeObject(gost3410Spec.getDigestParamSetOID());
            objectoutputstream.writeObject(gost3410Spec.getEncryptionParamSetOID());
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GOST3410PrivateKey)
        {
            if (getX().equals(((GOST3410PrivateKey) (obj = (GOST3410PrivateKey)obj)).getX()) && getParameters().getPublicKeyParameters().equals(((GOST3410PrivateKey) (obj)).getParameters().getPublicKeyParameters()) && getParameters().getDigestParamSetOID().equals(((GOST3410PrivateKey) (obj)).getParameters().getDigestParamSetOID()) && compareObj(getParameters().getEncryptionParamSetOID(), ((GOST3410PrivateKey) (obj)).getParameters().getEncryptionParamSetOID()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "GOST3410";
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
        int i = 0;
        byte abyte0[] = getX().toByteArray();
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
            if (gost3410Spec instanceof GOST3410ParameterSpec)
            {
                obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(gost3410Spec.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(gost3410Spec.getDigestParamSetOID()))), new DEROctetString(((byte []) (obj))));
            } else
            {
                obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94), new DEROctetString(((byte []) (obj))));
            }
            return ((PrivateKeyInfo) (obj)).getEncoded("DER");
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

    public GOST3410Params getParameters()
    {
        return gost3410Spec;
    }

    public BigInteger getX()
    {
        return x;
    }

    public int hashCode()
    {
        return getX().hashCode() ^ gost3410Spec.hashCode();
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }
}
