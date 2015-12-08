// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralNames

public class DistributionPointName extends ASN1Object
    implements ASN1Choice
{

    ASN1Encodable a;
    int b;

    public DistributionPointName(ASN1Encodable asn1encodable)
    {
        b = 0;
        a = asn1encodable;
    }

    private DistributionPointName(ASN1TaggedObject asn1taggedobject)
    {
        b = asn1taggedobject.c();
        if (b == 0)
        {
            a = GeneralNames.a(asn1taggedobject);
            return;
        } else
        {
            a = ASN1Set.a(asn1taggedobject);
            return;
        }
    }

    public static DistributionPointName a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = ASN1TaggedObject.a(asn1taggedobject);
        if (asn1taggedobject == null || (asn1taggedobject instanceof DistributionPointName))
        {
            return (DistributionPointName)asn1taggedobject;
        }
        if (asn1taggedobject instanceof ASN1TaggedObject)
        {
            return new DistributionPointName((ASN1TaggedObject)asn1taggedobject);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(asn1taggedobject.getClass().getName()).toString());
        }
    }

    private static void a(StringBuffer stringbuffer, String s, String s1, String s2)
    {
        stringbuffer.append("    ");
        stringbuffer.append(s1);
        stringbuffer.append(":");
        stringbuffer.append(s);
        stringbuffer.append("    ");
        stringbuffer.append("    ");
        stringbuffer.append(s2);
        stringbuffer.append(s);
    }

    public final ASN1Primitive a()
    {
        return new DERTaggedObject(false, b, a);
    }

    public final int c()
    {
        return b;
    }

    public final ASN1Encodable d()
    {
        return a;
    }

    public String toString()
    {
        String s = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("DistributionPointName: [");
        stringbuffer.append(s);
        if (b == 0)
        {
            a(stringbuffer, s, "fullName", a.toString());
        } else
        {
            a(stringbuffer, s, "nameRelativeToCRLIssuer", a.toString());
        }
        stringbuffer.append("]");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }
}
