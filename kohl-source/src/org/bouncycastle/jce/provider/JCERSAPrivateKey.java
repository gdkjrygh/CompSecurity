// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class JCERSAPrivateKey
    implements RSAPrivateKey, PKCS12BagAttributeCarrier
{

    private static BigInteger ZERO = BigInteger.valueOf(0L);
    static final long serialVersionUID = 0x46eb09c007cf411cL;
    private PKCS12BagAttributeCarrierImpl attrCarrier;
    protected BigInteger modulus;
    protected BigInteger privateExponent;

    protected JCERSAPrivateKey()
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    JCERSAPrivateKey(RSAPrivateKey rsaprivatekey)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        modulus = rsaprivatekey.getModulus();
        privateExponent = rsaprivatekey.getPrivateExponent();
    }

    JCERSAPrivateKey(RSAPrivateKeySpec rsaprivatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        modulus = rsaprivatekeyspec.getModulus();
        privateExponent = rsaprivatekeyspec.getPrivateExponent();
    }

    JCERSAPrivateKey(RSAKeyParameters rsakeyparameters)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        modulus = rsakeyparameters.getModulus();
        privateExponent = rsakeyparameters.getExponent();
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        modulus = (BigInteger)objectinputstream.readObject();
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        attrCarrier.readObject(objectinputstream);
        privateExponent = (BigInteger)objectinputstream.readObject();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(modulus);
        attrCarrier.writeObject(objectoutputstream);
        objectoutputstream.writeObject(privateExponent);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof RSAPrivateKey) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (RSAPrivateKey)obj;
        if (!getModulus().equals(((RSAPrivateKey) (obj)).getModulus()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (getPrivateExponent().equals(((RSAPrivateKey) (obj)).getPrivateExponent())) goto _L4; else goto _L5
_L5:
        return false;
    }

    public String getAlgorithm()
    {
        return "RSA";
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
        return KeyUtil.getEncodedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, new DERNull()), new org.bouncycastle.asn1.pkcs.RSAPrivateKey(getModulus(), ZERO, getPrivateExponent(), ZERO, ZERO, ZERO, ZERO, ZERO));
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public BigInteger getModulus()
    {
        return modulus;
    }

    public BigInteger getPrivateExponent()
    {
        return privateExponent;
    }

    public int hashCode()
    {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }

}
