// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            PKMACValue

public class POPOSigningKeyInput extends ASN1Encodable
{

    private GeneralName a;
    private PKMACValue b;
    private SubjectPublicKeyInfo c;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, a));
        } else
        {
            asn1encodablevector.a(b);
        }
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }
}
