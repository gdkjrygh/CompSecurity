// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.eac;

import java.io.IOException;
import java.io.PrintStream;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERApplicationSpecific;

// Referenced classes of package org.spongycastle.asn1.eac:
//            PublicKeyDataObject, CertificateHolderAuthorization

public class CertificateBody extends ASN1Object
{

    private DERApplicationSpecific a;
    private DERApplicationSpecific b;
    private PublicKeyDataObject c;
    private DERApplicationSpecific d;
    private CertificateHolderAuthorization e;
    private DERApplicationSpecific f;
    private DERApplicationSpecific g;
    private int h;

    public final ASN1Primitive a()
    {
label0:
        {
            Object obj;
            try
            {
                if (h == 127)
                {
                    ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
                    asn1encodablevector.a(a);
                    asn1encodablevector.a(b);
                    asn1encodablevector.a(new DERApplicationSpecific(73, c));
                    asn1encodablevector.a(d);
                    asn1encodablevector.a(e);
                    asn1encodablevector.a(f);
                    asn1encodablevector.a(g);
                    return new DERApplicationSpecific(78, asn1encodablevector);
                }
                if (h != 13)
                {
                    break label0;
                }
                obj = new ASN1EncodableVector();
                ((ASN1EncodableVector) (obj)).a(a);
                ((ASN1EncodableVector) (obj)).a(new DERApplicationSpecific(73, c));
                ((ASN1EncodableVector) (obj)).a(d);
                obj = new DERApplicationSpecific(78, ((ASN1EncodableVector) (obj)));
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                return null;
            }
            return ((ASN1Primitive) (obj));
        }
        System.err.println("returning null");
        return null;
    }
}
