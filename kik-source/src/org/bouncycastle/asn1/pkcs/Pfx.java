// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, ContentInfo, MacData

public class Pfx extends ASN1Encodable
    implements PKCSObjectIdentifiers
{

    private ContentInfo by;
    private MacData bz;

    public Pfx(ASN1Sequence asn1sequence)
    {
        bz = null;
        if (((DERInteger)asn1sequence.a(0)).e().intValue() != 3)
        {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        by = ContentInfo.a(asn1sequence.a(1));
        if (asn1sequence.f() == 3)
        {
            bz = MacData.a(asn1sequence.a(2));
        }
    }

    public Pfx(ContentInfo contentinfo, MacData macdata)
    {
        bz = null;
        by = contentinfo;
        bz = macdata;
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(3));
        asn1encodablevector.a(by);
        if (bz != null)
        {
            asn1encodablevector.a(bz);
        }
        return new BERSequence(asn1encodablevector);
    }

    public final ContentInfo e()
    {
        return by;
    }

    public final MacData f()
    {
        return bz;
    }
}
