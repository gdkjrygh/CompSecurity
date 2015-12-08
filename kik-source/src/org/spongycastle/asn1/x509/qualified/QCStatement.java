// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509.qualified;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509.qualified:
//            ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers

public class QCStatement extends ASN1Object
    implements ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers
{

    ASN1ObjectIdentifier f;
    ASN1Encodable g;

    public final ASN1Primitive a()
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
