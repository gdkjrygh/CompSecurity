// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;

// Referenced classes of package org.bouncycastle.asn1.tsp:
//            MessageImprint

public class TimeStampReq extends ASN1Object
{

    ASN1Boolean certReq;
    Extensions extensions;
    MessageImprint messageImprint;
    ASN1Integer nonce;
    ASN1ObjectIdentifier tsaPolicy;
    ASN1Integer version;

    private TimeStampReq(ASN1Sequence asn1sequence)
    {
        int j = asn1sequence.size();
        version = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        messageImprint = MessageImprint.getInstance(asn1sequence.getObjectAt(1));
        int i = 2;
        while (i < j) 
        {
            if (asn1sequence.getObjectAt(i) instanceof ASN1ObjectIdentifier)
            {
                tsaPolicy = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(i));
            } else
            if (asn1sequence.getObjectAt(i) instanceof ASN1Integer)
            {
                nonce = ASN1Integer.getInstance(asn1sequence.getObjectAt(i));
            } else
            if (asn1sequence.getObjectAt(i) instanceof DERBoolean)
            {
                certReq = DERBoolean.getInstance(asn1sequence.getObjectAt(i));
            } else
            if (asn1sequence.getObjectAt(i) instanceof ASN1TaggedObject)
            {
                ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.getObjectAt(i);
                if (asn1taggedobject.getTagNo() == 0)
                {
                    extensions = Extensions.getInstance(asn1taggedobject, false);
                }
            }
            i++;
        }
    }

    public TimeStampReq(MessageImprint messageimprint, ASN1ObjectIdentifier asn1objectidentifier, ASN1Integer asn1integer, ASN1Boolean asn1boolean, Extensions extensions1)
    {
        version = new ASN1Integer(1);
        messageImprint = messageimprint;
        tsaPolicy = asn1objectidentifier;
        nonce = asn1integer;
        certReq = asn1boolean;
        extensions = extensions1;
    }

    public static TimeStampReq getInstance(Object obj)
    {
        if (obj instanceof TimeStampReq)
        {
            return (TimeStampReq)obj;
        }
        if (obj != null)
        {
            return new TimeStampReq(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Boolean getCertReq()
    {
        return certReq;
    }

    public Extensions getExtensions()
    {
        return extensions;
    }

    public MessageImprint getMessageImprint()
    {
        return messageImprint;
    }

    public ASN1Integer getNonce()
    {
        return nonce;
    }

    public ASN1ObjectIdentifier getReqPolicy()
    {
        return tsaPolicy;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(messageImprint);
        if (tsaPolicy != null)
        {
            asn1encodablevector.add(tsaPolicy);
        }
        if (nonce != null)
        {
            asn1encodablevector.add(nonce);
        }
        if (certReq != null && certReq.isTrue())
        {
            asn1encodablevector.add(certReq);
        }
        if (extensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, extensions));
        }
        return new DERSequence(asn1encodablevector);
    }
}
