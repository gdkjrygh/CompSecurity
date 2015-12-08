// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            MetaData, Evidence

public class TimeStampedData extends ASN1Encodable
{

    private DERInteger a;
    private DERIA5String b;
    private MetaData c;
    private ASN1OctetString d;
    private Evidence e;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        if (b != null)
        {
            asn1encodablevector.a(b);
        }
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        if (d != null)
        {
            asn1encodablevector.a(d);
        }
        asn1encodablevector.a(e);
        return new BERSequence(asn1encodablevector);
    }
}
