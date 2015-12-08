// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Extension

public class X509Extensions extends ASN1Encodable
{

    public static final ASN1ObjectIdentifier A = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
    public static final ASN1ObjectIdentifier B = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
    public static final ASN1ObjectIdentifier C = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
    public static final ASN1ObjectIdentifier D = new ASN1ObjectIdentifier("2.5.29.56");
    public static final ASN1ObjectIdentifier E = new ASN1ObjectIdentifier("2.5.29.55");
    public static final ASN1ObjectIdentifier a = new ASN1ObjectIdentifier("2.5.29.9");
    public static final ASN1ObjectIdentifier b = new ASN1ObjectIdentifier("2.5.29.14");
    public static final ASN1ObjectIdentifier c = new ASN1ObjectIdentifier("2.5.29.15");
    public static final ASN1ObjectIdentifier d = new ASN1ObjectIdentifier("2.5.29.16");
    public static final ASN1ObjectIdentifier e = new ASN1ObjectIdentifier("2.5.29.17");
    public static final ASN1ObjectIdentifier f = new ASN1ObjectIdentifier("2.5.29.18");
    public static final ASN1ObjectIdentifier g = new ASN1ObjectIdentifier("2.5.29.19");
    public static final ASN1ObjectIdentifier h = new ASN1ObjectIdentifier("2.5.29.20");
    public static final ASN1ObjectIdentifier i = new ASN1ObjectIdentifier("2.5.29.21");
    public static final ASN1ObjectIdentifier j = new ASN1ObjectIdentifier("2.5.29.23");
    public static final ASN1ObjectIdentifier k = new ASN1ObjectIdentifier("2.5.29.24");
    public static final ASN1ObjectIdentifier l = new ASN1ObjectIdentifier("2.5.29.27");
    public static final ASN1ObjectIdentifier m = new ASN1ObjectIdentifier("2.5.29.28");
    public static final ASN1ObjectIdentifier n = new ASN1ObjectIdentifier("2.5.29.29");
    public static final ASN1ObjectIdentifier o = new ASN1ObjectIdentifier("2.5.29.30");
    public static final ASN1ObjectIdentifier p = new ASN1ObjectIdentifier("2.5.29.31");
    public static final ASN1ObjectIdentifier q = new ASN1ObjectIdentifier("2.5.29.32");
    public static final ASN1ObjectIdentifier r = new ASN1ObjectIdentifier("2.5.29.33");
    public static final ASN1ObjectIdentifier s = new ASN1ObjectIdentifier("2.5.29.35");
    public static final ASN1ObjectIdentifier t = new ASN1ObjectIdentifier("2.5.29.36");
    public static final ASN1ObjectIdentifier u = new ASN1ObjectIdentifier("2.5.29.37");
    public static final ASN1ObjectIdentifier v = new ASN1ObjectIdentifier("2.5.29.46");
    public static final ASN1ObjectIdentifier w = new ASN1ObjectIdentifier("2.5.29.54");
    public static final ASN1ObjectIdentifier x = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
    public static final ASN1ObjectIdentifier y = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
    public static final ASN1ObjectIdentifier z = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
    private Hashtable F;
    private Vector G;

    private X509Extensions(ASN1Sequence asn1sequence)
    {
        F = new Hashtable();
        G = new Vector();
        asn1sequence = asn1sequence.e();
        while (asn1sequence.hasMoreElements()) 
        {
            ASN1Sequence asn1sequence1 = ASN1Sequence.a(asn1sequence.nextElement());
            if (asn1sequence1.f() == 3)
            {
                F.put(asn1sequence1.a(0), new X509Extension(DERBoolean.a(asn1sequence1.a(1)), ASN1OctetString.a(asn1sequence1.a(2))));
            } else
            if (asn1sequence1.f() == 2)
            {
                F.put(asn1sequence1.a(0), new X509Extension(ASN1OctetString.a(asn1sequence1.a(1))));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence1.f()).toString());
            }
            G.addElement(asn1sequence1.a(0));
        }
    }

    public static X509Extensions a(Object obj)
    {
        do
        {
            if (obj == null || (obj instanceof X509Extensions))
            {
                return (X509Extensions)obj;
            }
            if (obj instanceof ASN1Sequence)
            {
                return new X509Extensions((ASN1Sequence)obj);
            }
            if (obj instanceof ASN1TaggedObject)
            {
                obj = ((ASN1TaggedObject)obj).i();
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
            }
        } while (true);
    }

    public final X509Extension a(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (X509Extension)F.get(asn1objectidentifier);
    }

    public final X509Extension a(DERObjectIdentifier derobjectidentifier)
    {
        return (X509Extension)F.get(derobjectidentifier);
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1;
        for (Enumeration enumeration = G.elements(); enumeration.hasMoreElements(); asn1encodablevector.a(new DERSequence(asn1encodablevector1)))
        {
            ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
            X509Extension x509extension = (X509Extension)F.get(asn1objectidentifier);
            asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.a(asn1objectidentifier);
            if (x509extension.F)
            {
                asn1encodablevector1.a(new DERBoolean(true));
            }
            asn1encodablevector1.a(x509extension.G);
        }

        return new DERSequence(asn1encodablevector);
    }

    public final Enumeration e()
    {
        return G.elements();
    }

}
