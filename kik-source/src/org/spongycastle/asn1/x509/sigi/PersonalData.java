// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509.sigi;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.DirectoryString;

// Referenced classes of package org.spongycastle.asn1.x509.sigi:
//            NameOrPseudonym

public class PersonalData extends ASN1Object
{

    private NameOrPseudonym a;
    private BigInteger b;
    private DERGeneralizedTime c;
    private DirectoryString d;
    private String e;
    private DirectoryString f;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, new ASN1Integer(b)));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, c));
        }
        if (d != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, d));
        }
        if (e != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 3, new DERPrintableString(e, true)));
        }
        if (f != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 4, f));
        }
        return new DERSequence(asn1encodablevector);
    }
}
