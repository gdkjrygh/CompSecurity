// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            RevDetails

public class RevReqContent extends ASN1Object
{

    private ASN1Sequence content;

    private RevReqContent(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public RevReqContent(RevDetails revdetails)
    {
        content = new DERSequence(revdetails);
    }

    public RevReqContent(RevDetails arevdetails[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != arevdetails.length; i++)
        {
            asn1encodablevector.add(arevdetails[i]);
        }

        content = new DERSequence(asn1encodablevector);
    }

    public static RevReqContent getInstance(Object obj)
    {
        if (obj instanceof RevReqContent)
        {
            return (RevReqContent)obj;
        }
        if (obj != null)
        {
            return new RevReqContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }

    public RevDetails[] toRevDetailsArray()
    {
        RevDetails arevdetails[] = new RevDetails[content.size()];
        for (int i = 0; i != arevdetails.length; i++)
        {
            arevdetails[i] = RevDetails.getInstance(content.getObjectAt(i));
        }

        return arevdetails;
    }
}
