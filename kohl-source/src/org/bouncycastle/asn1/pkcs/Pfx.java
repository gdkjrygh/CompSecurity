// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, ContentInfo, MacData

public class Pfx extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private ContentInfo contentInfo;
    private MacData macData;

    private Pfx(ASN1Sequence asn1sequence)
    {
        macData = null;
        if (((ASN1Integer)asn1sequence.getObjectAt(0)).getValue().intValue() != 3)
        {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        contentInfo = ContentInfo.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() == 3)
        {
            macData = MacData.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public Pfx(ContentInfo contentinfo, MacData macdata)
    {
        macData = null;
        contentInfo = contentinfo;
        macData = macdata;
    }

    public static Pfx getInstance(Object obj)
    {
        if (obj instanceof Pfx)
        {
            return (Pfx)obj;
        }
        if (obj != null)
        {
            return new Pfx(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ContentInfo getAuthSafe()
    {
        return contentInfo;
    }

    public MacData getMacData()
    {
        return macData;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(3));
        asn1encodablevector.add(contentInfo);
        if (macData != null)
        {
            asn1encodablevector.add(macData);
        }
        return new BERSequence(asn1encodablevector);
    }
}
