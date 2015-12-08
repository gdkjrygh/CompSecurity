// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.asn1.x509.NoticeReference;

public class SPUserNotice extends ASN1Object
{

    private DisplayText explicitText;
    private NoticeReference noticeRef;

    private SPUserNotice(ASN1Sequence asn1sequence)
    {
        for (asn1sequence = asn1sequence.getObjects(); asn1sequence.hasMoreElements();)
        {
            ASN1Encodable asn1encodable = (ASN1Encodable)asn1sequence.nextElement();
            if (asn1encodable instanceof NoticeReference)
            {
                noticeRef = NoticeReference.getInstance(asn1encodable);
            } else
            if (asn1encodable instanceof DisplayText)
            {
                explicitText = DisplayText.getInstance(asn1encodable);
            } else
            {
                throw new IllegalArgumentException("Invalid element in 'SPUserNotice'.");
            }
        }

    }

    public SPUserNotice(NoticeReference noticereference, DisplayText displaytext)
    {
        noticeRef = noticereference;
        explicitText = displaytext;
    }

    public static SPUserNotice getInstance(Object obj)
    {
        if (obj instanceof SPUserNotice)
        {
            return (SPUserNotice)obj;
        }
        if (obj != null)
        {
            return new SPUserNotice(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DisplayText getExplicitText()
    {
        return explicitText;
    }

    public NoticeReference getNoticeRef()
    {
        return noticeRef;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (noticeRef != null)
        {
            asn1encodablevector.add(noticeRef);
        }
        if (explicitText != null)
        {
            asn1encodablevector.add(explicitText);
        }
        return new DERSequence(asn1encodablevector);
    }
}
