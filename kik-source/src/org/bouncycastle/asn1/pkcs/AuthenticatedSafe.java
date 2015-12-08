// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            ContentInfo

public class AuthenticatedSafe extends ASN1Encodable
{

    ContentInfo a[];

    public AuthenticatedSafe(ASN1Sequence asn1sequence)
    {
        a = new ContentInfo[asn1sequence.f()];
        for (int i = 0; i != a.length; i++)
        {
            a[i] = ContentInfo.a(asn1sequence.a(i));
        }

    }

    public AuthenticatedSafe(ContentInfo acontentinfo[])
    {
        a = acontentinfo;
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != a.length; i++)
        {
            asn1encodablevector.a(a[i]);
        }

        return new BERSequence(asn1encodablevector);
    }

    public final ContentInfo[] e()
    {
        return a;
    }
}
