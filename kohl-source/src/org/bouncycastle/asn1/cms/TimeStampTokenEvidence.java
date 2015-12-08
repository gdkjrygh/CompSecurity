// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            TimeStampAndCRL

public class TimeStampTokenEvidence extends ASN1Object
{

    private TimeStampAndCRL timeStampAndCRLs[];

    private TimeStampTokenEvidence(ASN1Sequence asn1sequence)
    {
        timeStampAndCRLs = new TimeStampAndCRL[asn1sequence.size()];
        int i = 0;
        for (asn1sequence = asn1sequence.getObjects(); asn1sequence.hasMoreElements();)
        {
            timeStampAndCRLs[i] = TimeStampAndCRL.getInstance(asn1sequence.nextElement());
            i++;
        }

    }

    public TimeStampTokenEvidence(TimeStampAndCRL timestampandcrl)
    {
        timeStampAndCRLs = new TimeStampAndCRL[1];
        timeStampAndCRLs[0] = timestampandcrl;
    }

    public TimeStampTokenEvidence(TimeStampAndCRL atimestampandcrl[])
    {
        timeStampAndCRLs = atimestampandcrl;
    }

    public static TimeStampTokenEvidence getInstance(Object obj)
    {
        if (obj instanceof TimeStampTokenEvidence)
        {
            return (TimeStampTokenEvidence)obj;
        }
        if (obj != null)
        {
            return new TimeStampTokenEvidence(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static TimeStampTokenEvidence getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != timeStampAndCRLs.length; i++)
        {
            asn1encodablevector.add(timeStampAndCRLs[i]);
        }

        return new DERSequence(asn1encodablevector);
    }

    public TimeStampAndCRL[] toTimeStampAndCRLArray()
    {
        return timeStampAndCRLs;
    }
}
