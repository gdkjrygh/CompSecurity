// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            TimeStampTokenEvidence

public class Evidence extends ASN1Object
    implements ASN1Choice
{

    private TimeStampTokenEvidence tstEvidence;

    private Evidence(ASN1TaggedObject asn1taggedobject)
    {
        if (asn1taggedobject.getTagNo() == 0)
        {
            tstEvidence = TimeStampTokenEvidence.getInstance(asn1taggedobject, false);
        }
    }

    public Evidence(TimeStampTokenEvidence timestamptokenevidence)
    {
        tstEvidence = timestamptokenevidence;
    }

    public static Evidence getInstance(Object obj)
    {
        if (obj == null || (obj instanceof Evidence))
        {
            return (Evidence)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new Evidence(ASN1TaggedObject.getInstance(obj));
        } else
        {
            throw new IllegalArgumentException("unknown object in getInstance");
        }
    }

    public TimeStampTokenEvidence getTstEvidence()
    {
        return tstEvidence;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (tstEvidence != null)
        {
            return new DERTaggedObject(false, 0, tstEvidence);
        } else
        {
            return null;
        }
    }
}
