// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.DLSequence;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            ContentInfo

public class AuthenticatedSafe extends ASN1Object
{

    private ContentInfo a[];
    private boolean b;

    private AuthenticatedSafe(ASN1Sequence asn1sequence)
    {
        b = true;
        a = new ContentInfo[asn1sequence.e()];
        for (int i = 0; i != a.length; i++)
        {
            a[i] = ContentInfo.a(asn1sequence.a(i));
        }

        b = asn1sequence instanceof BERSequence;
    }

    public AuthenticatedSafe(ContentInfo acontentinfo[])
    {
        b = true;
        a = acontentinfo;
    }

    public static AuthenticatedSafe a(Object obj)
    {
        if (obj instanceof AuthenticatedSafe)
        {
            return (AuthenticatedSafe)obj;
        }
        if (obj != null)
        {
            return new AuthenticatedSafe(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != a.length; i++)
        {
            asn1encodablevector.a(a[i]);
        }

        if (b)
        {
            return new BERSequence(asn1encodablevector);
        } else
        {
            return new DLSequence(asn1encodablevector);
        }
    }

    public final ContentInfo[] c()
    {
        return a;
    }
}
