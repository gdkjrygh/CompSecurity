// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;

// Referenced classes of package org.bouncycastle.asn1.tsp:
//            MessageImprint, Accuracy

public class TSTInfo extends ASN1Object
{

    private Accuracy accuracy;
    private Extensions extensions;
    private ASN1GeneralizedTime genTime;
    private MessageImprint messageImprint;
    private ASN1Integer nonce;
    private ASN1Boolean ordering;
    private ASN1Integer serialNumber;
    private GeneralName tsa;
    private ASN1ObjectIdentifier tsaPolicyId;
    private ASN1Integer version;

    public TSTInfo(ASN1ObjectIdentifier asn1objectidentifier, MessageImprint messageimprint, ASN1Integer asn1integer, ASN1GeneralizedTime asn1generalizedtime, Accuracy accuracy1, ASN1Boolean asn1boolean, ASN1Integer asn1integer1, 
            GeneralName generalname, Extensions extensions1)
    {
        version = new ASN1Integer(1);
        tsaPolicyId = asn1objectidentifier;
        messageImprint = messageimprint;
        serialNumber = asn1integer;
        genTime = asn1generalizedtime;
        accuracy = accuracy1;
        ordering = asn1boolean;
        nonce = asn1integer1;
        tsa = generalname;
        extensions = extensions1;
    }

    private TSTInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        version = ASN1Integer.getInstance(asn1sequence.nextElement());
        tsaPolicyId = ASN1ObjectIdentifier.getInstance(asn1sequence.nextElement());
        messageImprint = MessageImprint.getInstance(asn1sequence.nextElement());
        serialNumber = ASN1Integer.getInstance(asn1sequence.nextElement());
        genTime = ASN1GeneralizedTime.getInstance(asn1sequence.nextElement());
        ordering = ASN1Boolean.getInstance(false);
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            Object obj = (ASN1Object)asn1sequence.nextElement();
            if (obj instanceof ASN1TaggedObject)
            {
                obj = (DERTaggedObject)obj;
                switch (((DERTaggedObject) (obj)).getTagNo())
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Unknown tag value ").append(((DERTaggedObject) (obj)).getTagNo()).toString());

                case 0: // '\0'
                    tsa = GeneralName.getInstance(((ASN1TaggedObject) (obj)), true);
                    break;

                case 1: // '\001'
                    extensions = Extensions.getInstance(((ASN1TaggedObject) (obj)), false);
                    break;
                }
            } else
            if ((obj instanceof ASN1Sequence) || (obj instanceof Accuracy))
            {
                accuracy = Accuracy.getInstance(obj);
            } else
            if (obj instanceof ASN1Boolean)
            {
                ordering = ASN1Boolean.getInstance(obj);
            } else
            if (obj instanceof ASN1Integer)
            {
                nonce = ASN1Integer.getInstance(obj);
            }
        } while (true);
    }

    public static TSTInfo getInstance(Object obj)
    {
        if (obj instanceof TSTInfo)
        {
            return (TSTInfo)obj;
        }
        if (obj != null)
        {
            return new TSTInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public Accuracy getAccuracy()
    {
        return accuracy;
    }

    public Extensions getExtensions()
    {
        return extensions;
    }

    public ASN1GeneralizedTime getGenTime()
    {
        return genTime;
    }

    public MessageImprint getMessageImprint()
    {
        return messageImprint;
    }

    public ASN1Integer getNonce()
    {
        return nonce;
    }

    public ASN1Boolean getOrdering()
    {
        return ordering;
    }

    public ASN1ObjectIdentifier getPolicy()
    {
        return tsaPolicyId;
    }

    public ASN1Integer getSerialNumber()
    {
        return serialNumber;
    }

    public GeneralName getTsa()
    {
        return tsa;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(tsaPolicyId);
        asn1encodablevector.add(messageImprint);
        asn1encodablevector.add(serialNumber);
        asn1encodablevector.add(genTime);
        if (accuracy != null)
        {
            asn1encodablevector.add(accuracy);
        }
        if (ordering != null && ordering.isTrue())
        {
            asn1encodablevector.add(ordering);
        }
        if (nonce != null)
        {
            asn1encodablevector.add(nonce);
        }
        if (tsa != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, tsa));
        }
        if (extensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, extensions));
        }
        return new DERSequence(asn1encodablevector);
    }
}
