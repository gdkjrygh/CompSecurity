// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509.qualified:
//            ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers

public class QCStatement extends ASN1Encodable
    implements ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers
{

    DERObjectIdentifier f;
    ASN1Encodable g;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(f);
        if (g != null)
        {
            asn1encodablevector.a(g);
        }
        return new DERSequence(asn1encodablevector);
    }
}
