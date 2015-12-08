// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERIA5String;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            MetaData, Evidence

public class TimeStampedData extends ASN1Object
{

    private ASN1OctetString content;
    private DERIA5String dataUri;
    private MetaData metaData;
    private Evidence temporalEvidence;
    private ASN1Integer version;

    private TimeStampedData(ASN1Sequence asn1sequence)
    {
label0:
        {
            super();
            version = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
            int i;
            int j;
            if (asn1sequence.getObjectAt(1) instanceof DERIA5String)
            {
                j = 2;
                dataUri = DERIA5String.getInstance(asn1sequence.getObjectAt(1));
            } else
            {
                j = 1;
            }
            if (!(asn1sequence.getObjectAt(j) instanceof MetaData))
            {
                i = j;
                if (!(asn1sequence.getObjectAt(j) instanceof ASN1Sequence))
                {
                    break label0;
                }
            }
            metaData = MetaData.getInstance(asn1sequence.getObjectAt(j));
            i = j + 1;
        }
        j = i;
        if (asn1sequence.getObjectAt(i) instanceof ASN1OctetString)
        {
            content = ASN1OctetString.getInstance(asn1sequence.getObjectAt(i));
            j = i + 1;
        }
        temporalEvidence = Evidence.getInstance(asn1sequence.getObjectAt(j));
    }

    public TimeStampedData(DERIA5String deria5string, MetaData metadata, ASN1OctetString asn1octetstring, Evidence evidence)
    {
        version = new ASN1Integer(1);
        dataUri = deria5string;
        metaData = metadata;
        content = asn1octetstring;
        temporalEvidence = evidence;
    }

    public static TimeStampedData getInstance(Object obj)
    {
        if (obj instanceof TimeStampedData)
        {
            return (TimeStampedData)obj;
        }
        if (obj != null)
        {
            return new TimeStampedData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1OctetString getContent()
    {
        return content;
    }

    public DERIA5String getDataUri()
    {
        return dataUri;
    }

    public MetaData getMetaData()
    {
        return metaData;
    }

    public Evidence getTemporalEvidence()
    {
        return temporalEvidence;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        if (dataUri != null)
        {
            asn1encodablevector.add(dataUri);
        }
        if (metaData != null)
        {
            asn1encodablevector.add(metaData);
        }
        if (content != null)
        {
            asn1encodablevector.add(content);
        }
        asn1encodablevector.add(temporalEvidence);
        return new BERSequence(asn1encodablevector);
    }
}
