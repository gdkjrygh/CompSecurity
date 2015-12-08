// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.icao;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.icao:
//            ICAOObjectIdentifiers, DataGroupHash, LDSVersionInfo

public class LDSSecurityObject extends ASN1Object
    implements ICAOObjectIdentifiers
{

    private ASN1Integer k;
    private AlgorithmIdentifier l;
    private DataGroupHash m[];
    private LDSVersionInfo n;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(k);
        asn1encodablevector.a(l);
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        for (int i = 0; i < m.length; i++)
        {
            asn1encodablevector1.a(m[i]);
        }

        asn1encodablevector.a(new DERSequence(asn1encodablevector1));
        if (n != null)
        {
            asn1encodablevector.a(n);
        }
        return new DERSequence(asn1encodablevector);
    }
}
