// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERIA5String;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            MetaData, Evidence

public class TimeStampedDataParser
{

    private ASN1OctetStringParser content;
    private DERIA5String dataUri;
    private MetaData metaData;
    private ASN1SequenceParser parser;
    private Evidence temporalEvidence;
    private ASN1Integer version;

    private TimeStampedDataParser(ASN1SequenceParser asn1sequenceparser)
        throws IOException
    {
        ASN1Encodable asn1encodable1;
label0:
        {
            super();
            parser = asn1sequenceparser;
            version = ASN1Integer.getInstance(asn1sequenceparser.readObject());
            asn1encodable1 = asn1sequenceparser.readObject();
            ASN1Encodable asn1encodable = asn1encodable1;
            if (asn1encodable1 instanceof DERIA5String)
            {
                dataUri = DERIA5String.getInstance(asn1encodable1);
                asn1encodable = asn1sequenceparser.readObject();
            }
            if (!(asn1encodable instanceof MetaData))
            {
                asn1encodable1 = asn1encodable;
                if (!(asn1encodable instanceof ASN1SequenceParser))
                {
                    break label0;
                }
            }
            metaData = MetaData.getInstance(asn1encodable.toASN1Primitive());
            asn1encodable1 = asn1sequenceparser.readObject();
        }
        if (asn1encodable1 instanceof ASN1OctetStringParser)
        {
            content = (ASN1OctetStringParser)asn1encodable1;
        }
    }

    public static TimeStampedDataParser getInstance(Object obj)
        throws IOException
    {
        if (obj instanceof ASN1Sequence)
        {
            return new TimeStampedDataParser(((ASN1Sequence)obj).parser());
        }
        if (obj instanceof ASN1SequenceParser)
        {
            return new TimeStampedDataParser((ASN1SequenceParser)obj);
        } else
        {
            return null;
        }
    }

    public ASN1OctetStringParser getContent()
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
        throws IOException
    {
        if (temporalEvidence == null)
        {
            temporalEvidence = Evidence.getInstance(parser.readObject().toASN1Primitive());
        }
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
