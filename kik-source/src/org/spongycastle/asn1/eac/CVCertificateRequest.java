// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.eac;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERApplicationSpecific;
import org.spongycastle.asn1.DEROctetString;

// Referenced classes of package org.spongycastle.asn1.eac:
//            CertificateBody

public class CVCertificateRequest extends ASN1Object
{

    public static byte a[] = {
        0
    };
    private static int d = 1;
    private static int e = 2;
    private CertificateBody b;
    private byte c[];

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(b);
        try
        {
            asn1encodablevector.a(new DERApplicationSpecific(55, new DEROctetString(c)));
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("unable to convert signature!");
        }
        return new DERApplicationSpecific(33, asn1encodablevector);
    }

}
