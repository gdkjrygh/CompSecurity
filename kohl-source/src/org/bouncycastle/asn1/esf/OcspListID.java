// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            OcspResponsesID

public class OcspListID extends ASN1Object
{

    private ASN1Sequence ocspResponses;

    private OcspListID(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        ocspResponses = (ASN1Sequence)asn1sequence.getObjectAt(0);
        for (asn1sequence = ocspResponses.getObjects(); asn1sequence.hasMoreElements(); OcspResponsesID.getInstance(asn1sequence.nextElement())) { }
    }

    public OcspListID(OcspResponsesID aocspresponsesid[])
    {
        ocspResponses = new DERSequence(aocspresponsesid);
    }

    public static OcspListID getInstance(Object obj)
    {
        if (obj instanceof OcspListID)
        {
            return (OcspListID)obj;
        }
        if (obj != null)
        {
            return new OcspListID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public OcspResponsesID[] getOcspResponses()
    {
        OcspResponsesID aocspresponsesid[] = new OcspResponsesID[ocspResponses.size()];
        for (int i = 0; i < aocspresponsesid.length; i++)
        {
            aocspresponsesid[i] = OcspResponsesID.getInstance(ocspResponses.getObjectAt(i));
        }

        return aocspresponsesid;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERSequence(ocspResponses);
    }
}
