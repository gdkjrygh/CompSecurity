// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.crmf.PKIPublicationInfo;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            CertOrEncCert

public class CertifiedKeyPair extends ASN1Encodable
{

    private CertOrEncCert a;
    private EncryptedValue b;
    private PKIPublicationInfo c;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, b));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, c));
        }
        return new DERSequence(asn1encodablevector);
    }
}
