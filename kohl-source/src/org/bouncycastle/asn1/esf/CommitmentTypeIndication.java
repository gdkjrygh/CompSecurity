// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class CommitmentTypeIndication extends ASN1Object
{

    private ASN1ObjectIdentifier commitmentTypeId;
    private ASN1Sequence commitmentTypeQualifier;

    public CommitmentTypeIndication(ASN1ObjectIdentifier asn1objectidentifier)
    {
        commitmentTypeId = asn1objectidentifier;
    }

    public CommitmentTypeIndication(ASN1ObjectIdentifier asn1objectidentifier, ASN1Sequence asn1sequence)
    {
        commitmentTypeId = asn1objectidentifier;
        commitmentTypeQualifier = asn1sequence;
    }

    private CommitmentTypeIndication(ASN1Sequence asn1sequence)
    {
        commitmentTypeId = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        if (asn1sequence.size() > 1)
        {
            commitmentTypeQualifier = (ASN1Sequence)asn1sequence.getObjectAt(1);
        }
    }

    public static CommitmentTypeIndication getInstance(Object obj)
    {
        if (obj == null || (obj instanceof CommitmentTypeIndication))
        {
            return (CommitmentTypeIndication)obj;
        } else
        {
            return new CommitmentTypeIndication(ASN1Sequence.getInstance(obj));
        }
    }

    public ASN1ObjectIdentifier getCommitmentTypeId()
    {
        return commitmentTypeId;
    }

    public ASN1Sequence getCommitmentTypeQualifier()
    {
        return commitmentTypeQualifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(commitmentTypeId);
        if (commitmentTypeQualifier != null)
        {
            asn1encodablevector.add(commitmentTypeQualifier);
        }
        return new DERSequence(asn1encodablevector);
    }
}
