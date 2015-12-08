// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            CRLReason, X509Extension, Time, Extensions

public class V2TBSCertListGenerator
{

    private static final ASN1Sequence e[];
    private ASN1Integer a;
    private Time b;
    private Extensions c;
    private ASN1EncodableVector d;

    public V2TBSCertListGenerator()
    {
        a = new ASN1Integer(1);
        b = null;
        c = null;
        d = new ASN1EncodableVector();
    }

    private static ASN1Sequence a(int i)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        CRLReason crlreason = CRLReason.a(i);
        try
        {
            asn1encodablevector.a(X509Extension.i);
            asn1encodablevector.a(new DEROctetString(crlreason.b()));
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder("error encoding reason: ")).append(ioexception).toString());
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        ASN1Sequence aasn1sequence[] = new ASN1Sequence[11];
        e = aasn1sequence;
        aasn1sequence[0] = a(0);
        e[1] = a(1);
        e[2] = a(2);
        e[3] = a(3);
        e[4] = a(4);
        e[5] = a(5);
        e[6] = a(6);
        e[7] = a(7);
        e[8] = a(8);
        e[9] = a(9);
        e[10] = a(10);
    }
}
