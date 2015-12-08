// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class PKCS12BagAttributeCarrierImpl
    implements PKCS12BagAttributeCarrier
{

    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public PKCS12BagAttributeCarrierImpl()
    {
        this(new Hashtable(), new Vector());
    }

    PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector)
    {
        pkcs12Attributes = hashtable;
        pkcs12Ordering = vector;
    }

    Hashtable getAttributes()
    {
        return pkcs12Attributes;
    }

    public ASN1Encodable getBagAttribute(DERObjectIdentifier derobjectidentifier)
    {
        return (ASN1Encodable)pkcs12Attributes.get(derobjectidentifier);
    }

    public Enumeration getBagAttributeKeys()
    {
        return pkcs12Ordering.elements();
    }

    Vector getOrdering()
    {
        return pkcs12Ordering;
    }

    public void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        Object obj = objectinputstream.readObject();
        if (!(obj instanceof Hashtable)) goto _L2; else goto _L1
_L1:
        pkcs12Attributes = (Hashtable)obj;
        pkcs12Ordering = (Vector)objectinputstream.readObject();
_L4:
        return;
_L2:
        objectinputstream = new ASN1InputStream((byte[])(byte[])obj);
        do
        {
            ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)objectinputstream.readObject();
            if (asn1objectidentifier == null)
            {
                continue;
            }
            setBagAttribute(asn1objectidentifier, objectinputstream.readObject());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        if (pkcs12Attributes.containsKey(asn1objectidentifier))
        {
            pkcs12Attributes.put(asn1objectidentifier, asn1encodable);
            return;
        } else
        {
            pkcs12Attributes.put(asn1objectidentifier, asn1encodable);
            pkcs12Ordering.addElement(asn1objectidentifier);
            return;
        }
    }

    int size()
    {
        return pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        if (pkcs12Ordering.size() == 0)
        {
            objectoutputstream.writeObject(new Hashtable());
            objectoutputstream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        DERObjectIdentifier derobjectidentifier;
        for (Enumeration enumeration = getBagAttributeKeys(); enumeration.hasMoreElements(); asn1outputstream.writeObject((ASN1Encodable)pkcs12Attributes.get(derobjectidentifier)))
        {
            derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
            asn1outputstream.writeObject(derobjectidentifier);
        }

        objectoutputstream.writeObject(bytearrayoutputstream.toByteArray());
    }
}
