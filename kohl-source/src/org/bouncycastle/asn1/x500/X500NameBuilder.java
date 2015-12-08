// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

// Referenced classes of package org.bouncycastle.asn1.x500:
//            X500NameStyle, AttributeTypeAndValue, RDN, X500Name

public class X500NameBuilder
{

    private Vector rdns;
    private X500NameStyle template;

    public X500NameBuilder(X500NameStyle x500namestyle)
    {
        rdns = new Vector();
        template = x500namestyle;
    }

    public X500NameBuilder addMultiValuedRDN(ASN1ObjectIdentifier aasn1objectidentifier[], String as[])
    {
        ASN1Encodable aasn1encodable[] = new ASN1Encodable[as.length];
        for (int i = 0; i != aasn1encodable.length; i++)
        {
            aasn1encodable[i] = template.stringToValue(aasn1objectidentifier[i], as[i]);
        }

        return addMultiValuedRDN(aasn1objectidentifier, aasn1encodable);
    }

    public X500NameBuilder addMultiValuedRDN(ASN1ObjectIdentifier aasn1objectidentifier[], ASN1Encodable aasn1encodable[])
    {
        AttributeTypeAndValue aattributetypeandvalue[] = new AttributeTypeAndValue[aasn1objectidentifier.length];
        for (int i = 0; i != aasn1objectidentifier.length; i++)
        {
            aattributetypeandvalue[i] = new AttributeTypeAndValue(aasn1objectidentifier[i], aasn1encodable[i]);
        }

        return addMultiValuedRDN(aattributetypeandvalue);
    }

    public X500NameBuilder addMultiValuedRDN(AttributeTypeAndValue aattributetypeandvalue[])
    {
        rdns.addElement(new RDN(aattributetypeandvalue));
        return this;
    }

    public X500NameBuilder addRDN(ASN1ObjectIdentifier asn1objectidentifier, String s)
    {
        addRDN(asn1objectidentifier, template.stringToValue(asn1objectidentifier, s));
        return this;
    }

    public X500NameBuilder addRDN(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        rdns.addElement(new RDN(asn1objectidentifier, asn1encodable));
        return this;
    }

    public X500NameBuilder addRDN(AttributeTypeAndValue attributetypeandvalue)
    {
        rdns.addElement(new RDN(attributetypeandvalue));
        return this;
    }

    public X500Name build()
    {
        RDN ardn[] = new RDN[rdns.size()];
        for (int i = 0; i != ardn.length; i++)
        {
            ardn[i] = (RDN)rdns.elementAt(i);
        }

        return new X500Name(template, ardn);
    }
}
