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

public class CVCertificate extends ASN1Object
{

    public static String a = "ISO-8859-1";
    private static int e = 1;
    private static int f = 2;
    private CertificateBody b;
    private byte c[];
    private int d;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (d != (f | e))
        {
            return null;
        }
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
