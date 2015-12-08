// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            Extension

public class Extensions extends ASN1Object
{

    private Hashtable a;
    private Vector b;

    private Extensions(ASN1Sequence asn1sequence)
    {
        a = new Hashtable();
        b = new Vector();
        asn1sequence = asn1sequence.d();
        while (asn1sequence.hasMoreElements()) 
        {
            ASN1Sequence asn1sequence1 = ASN1Sequence.a(asn1sequence.nextElement());
            if (asn1sequence1.e() == 3)
            {
                a.put(asn1sequence1.a(0), new Extension(ASN1ObjectIdentifier.a(asn1sequence1.a(0)), ASN1Boolean.a(asn1sequence1.a(1)), ASN1OctetString.a(asn1sequence1.a(2))));
            } else
            if (asn1sequence1.e() == 2)
            {
                a.put(asn1sequence1.a(0), new Extension(ASN1ObjectIdentifier.a(asn1sequence1.a(0)), false, ASN1OctetString.a(asn1sequence1.a(1))));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence1.e()).toString());
            }
            b.addElement(asn1sequence1.a(0));
        }
    }

    public static Extensions a(Object obj)
    {
        if (obj instanceof Extensions)
        {
            return (Extensions)obj;
        }
        if (obj != null)
        {
            return new Extensions(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1;
        for (Enumeration enumeration = b.elements(); enumeration.hasMoreElements(); asn1encodablevector.a(new DERSequence(asn1encodablevector1)))
        {
            ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
            Extension extension = (Extension)a.get(asn1objectidentifier);
            asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.a(asn1objectidentifier);
            if (extension.F)
            {
                asn1encodablevector1.a(ASN1Boolean.c());
            }
            asn1encodablevector1.a(extension.G);
        }

        return new DERSequence(asn1encodablevector);
    }

    public final Extension a(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (Extension)a.get(asn1objectidentifier);
    }

    public final Enumeration c()
    {
        return b.elements();
    }
}
