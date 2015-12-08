// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames

public class DistributionPointName extends ASN1Object
    implements ASN1Choice
{

    public static final int FULL_NAME = 0;
    public static final int NAME_RELATIVE_TO_CRL_ISSUER = 1;
    ASN1Encodable name;
    int type;

    public DistributionPointName(int i, ASN1Encodable asn1encodable)
    {
        type = i;
        name = asn1encodable;
    }

    public DistributionPointName(ASN1TaggedObject asn1taggedobject)
    {
        type = asn1taggedobject.getTagNo();
        if (type == 0)
        {
            name = GeneralNames.getInstance(asn1taggedobject, false);
            return;
        } else
        {
            name = ASN1Set.getInstance(asn1taggedobject, false);
            return;
        }
    }

    public DistributionPointName(GeneralNames generalnames)
    {
        this(0, ((ASN1Encodable) (generalnames)));
    }

    private void appendObject(StringBuffer stringbuffer, String s, String s1, String s2)
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

    public static DistributionPointName getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DistributionPointName))
        {
            return (DistributionPointName)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new DistributionPointName((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DistributionPointName getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1TaggedObject.getInstance(asn1taggedobject, true));
    }

    public ASN1Encodable getName()
    {
        return name;
    }

    public int getType()
    {
        return type;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERTaggedObject(false, type, name);
    }

    public String toString()
    {
        String s = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("DistributionPointName: [");
        stringbuffer.append(s);
        if (type == 0)
        {
            appendObject(stringbuffer, s, "fullName", name.toString());
        } else
        {
            appendObject(stringbuffer, s, "nameRelativeToCRLIssuer", name.toString());
        }
        stringbuffer.append("]");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }
}
