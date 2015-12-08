// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.BERSequence;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, ContentInfo, MacData

public class Pfx extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private MacData bA;
    private ContentInfo bz;

    private Pfx(ASN1Sequence asn1sequence)
    {
        bA = null;
        if (((ASN1Integer)asn1sequence.a(0)).c().intValue() != 3)
        {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        bz = ContentInfo.a(asn1sequence.a(1));
        if (asn1sequence.e() == 3)
        {
            bA = MacData.a(asn1sequence.a(2));
        }
    }

    public Pfx(ContentInfo contentinfo, MacData macdata)
    {
        bA = null;
        bz = contentinfo;
        bA = macdata;
    }

    public static Pfx a(Object obj)
    {
        if (obj instanceof Pfx)
        {
            return (Pfx)obj;
        }
        if (obj != null)
        {
            return new Pfx(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(3));
        asn1encodablevector.a(bz);
        if (bA != null)
        {
            asn1encodablevector.a(bA);
        }
        return new BERSequence(asn1encodablevector);
    }

    public final ContentInfo c()
    {
        return bz;
    }

    public final MacData d()
    {
        return bA;
    }
}
