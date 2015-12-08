// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.ocsp:
//            RevokedInfo

public class CertStatus extends ASN1Object
    implements ASN1Choice
{

    private int tagNo;
    private ASN1Encodable value;

    public CertStatus()
    {
        tagNo = 0;
        value = new DERNull();
    }

    public CertStatus(int i, ASN1Encodable asn1encodable)
    {
        tagNo = i;
        value = asn1encodable;
    }

    public CertStatus(ASN1TaggedObject asn1taggedobject)
    {
        tagNo = asn1taggedobject.getTagNo();
        switch (asn1taggedobject.getTagNo())
        {
        default:
            return;

        case 0: // '\0'
            value = new DERNull();
            return;

        case 1: // '\001'
            value = RevokedInfo.getInstance(asn1taggedobject, false);
            return;

        case 2: // '\002'
            value = new DERNull();
            break;
        }
    }

    public CertStatus(RevokedInfo revokedinfo)
    {
        tagNo = 1;
        value = revokedinfo;
    }

    public static CertStatus getInstance(Object obj)
    {
        if (obj == null || (obj instanceof CertStatus))
        {
            return (CertStatus)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new CertStatus((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public static CertStatus getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(asn1taggedobject.getObject());
    }

    public ASN1Encodable getStatus()
    {
        return value;
    }

    public int getTagNo()
    {
        return tagNo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERTaggedObject(false, tagNo, value);
    }
}
