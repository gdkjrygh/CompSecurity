// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.icao:
//            ICAOObjectIdentifiers, DataGroupHash, LDSVersionInfo

public class LDSSecurityObject extends ASN1Encodable
    implements ICAOObjectIdentifiers
{

    private DERInteger k;
    private AlgorithmIdentifier l;
    private DataGroupHash m[];
    private LDSVersionInfo n;

    public final DERObject d()
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
