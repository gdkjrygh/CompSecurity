// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class AlgorithmIdentifier extends ASN1Object
{

    private ASN1ObjectIdentifier objectId;
    private ASN1Encodable parameters;
    private boolean parametersDefined;

    public AlgorithmIdentifier(String s)
    {
        parametersDefined = false;
        objectId = new ASN1ObjectIdentifier(s);
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier asn1objectidentifier)
    {
        parametersDefined = false;
        objectId = asn1objectidentifier;
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        parametersDefined = false;
        parametersDefined = true;
        objectId = asn1objectidentifier;
        parameters = asn1encodable;
    }

    public AlgorithmIdentifier(ASN1Sequence asn1sequence)
    {
        parametersDefined = false;
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        objectId = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() == 2)
        {
            parametersDefined = true;
            parameters = asn1sequence.getObjectAt(1);
            return;
        } else
        {
            parameters = null;
            return;
        }
    }

    public AlgorithmIdentifier(DERObjectIdentifier derobjectidentifier)
    {
        parametersDefined = false;
        objectId = new ASN1ObjectIdentifier(derobjectidentifier.getId());
    }

    public AlgorithmIdentifier(DERObjectIdentifier derobjectidentifier, ASN1Encodable asn1encodable)
    {
        parametersDefined = false;
        parametersDefined = true;
        objectId = new ASN1ObjectIdentifier(derobjectidentifier.getId());
        parameters = asn1encodable;
    }

    public static AlgorithmIdentifier getInstance(Object obj)
    {
        if (obj == null || (obj instanceof AlgorithmIdentifier))
        {
            return (AlgorithmIdentifier)obj;
        }
        if (obj instanceof ASN1ObjectIdentifier)
        {
            return new AlgorithmIdentifier((ASN1ObjectIdentifier)obj);
        }
        if (obj instanceof String)
        {
            return new AlgorithmIdentifier((String)obj);
        }
        if ((obj instanceof ASN1Sequence) || (obj instanceof ASN1SequenceParser))
        {
            return new AlgorithmIdentifier(ASN1Sequence.getInstance(obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public static AlgorithmIdentifier getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1ObjectIdentifier getAlgorithm()
    {
        return new ASN1ObjectIdentifier(objectId.getId());
    }

    public ASN1ObjectIdentifier getObjectId()
    {
        return objectId;
    }

    public ASN1Encodable getParameters()
    {
        return parameters;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(objectId);
        if (parametersDefined)
        {
            if (parameters != null)
            {
                asn1encodablevector.add(parameters);
            } else
            {
                asn1encodablevector.add(DERNull.INSTANCE);
            }
        }
        return new DERSequence(asn1encodablevector);
    }
}
