// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            NoticeReference, DisplayText

public class UserNotice extends ASN1Object
{

    private DisplayText explicitText;
    private NoticeReference noticeRef;

    private UserNotice(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() == 2)
        {
            noticeRef = NoticeReference.getInstance(asn1sequence.getObjectAt(0));
            explicitText = DisplayText.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
        if (asn1sequence.size() == 1)
        {
            if (asn1sequence.getObjectAt(0).toASN1Primitive() instanceof ASN1Sequence)
            {
                noticeRef = NoticeReference.getInstance(asn1sequence.getObjectAt(0));
                return;
            } else
            {
                explicitText = DisplayText.getInstance(asn1sequence.getObjectAt(0));
                return;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
    }

    public UserNotice(NoticeReference noticereference, String s)
    {
        this(noticereference, new DisplayText(s));
    }

    public UserNotice(NoticeReference noticereference, DisplayText displaytext)
    {
        noticeRef = noticereference;
        explicitText = displaytext;
    }

    public static UserNotice getInstance(Object obj)
    {
        if (obj instanceof UserNotice)
        {
            return (UserNotice)obj;
        }
        if (obj != null)
        {
            return new UserNotice(ASN1Sequence.getInstance(obj));
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
