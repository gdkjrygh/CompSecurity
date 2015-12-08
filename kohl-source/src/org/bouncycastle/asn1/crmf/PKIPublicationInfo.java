// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            SinglePubInfo

public class PKIPublicationInfo extends ASN1Object
{

    private ASN1Integer action;
    private ASN1Sequence pubInfos;

    private PKIPublicationInfo(ASN1Sequence asn1sequence)
    {
        action = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        pubInfos = ASN1Sequence.getInstance(asn1sequence.getObjectAt(1));
    }

    public static PKIPublicationInfo getInstance(Object obj)
    {
        if (obj instanceof PKIPublicationInfo)
        {
            return (PKIPublicationInfo)obj;
        }
        if (obj != null)
        {
            return new PKIPublicationInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getAction()
    {
        return action;
    }

    public SinglePubInfo[] getPubInfos()
    {
        if (pubInfos == null)
        {
            return null;
        }
        SinglePubInfo asinglepubinfo[] = new SinglePubInfo[pubInfos.size()];
        for (int i = 0; i != asinglepubinfo.length; i++)
        {
            asinglepubinfo[i] = SinglePubInfo.getInstance(pubInfos.getObjectAt(i));
        }

        return asinglepubinfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(action);
        asn1encodablevector.add(pubInfos);
        return new DERSequence(asn1encodablevector);
    }
}
