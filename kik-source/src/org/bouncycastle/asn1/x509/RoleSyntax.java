// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames, GeneralName

public class RoleSyntax extends ASN1Encodable
{

    private GeneralNames a;
    private GeneralName b;

    private String[] e()
    {
        if (a == null)
        {
            return new String[0];
        }
        GeneralName ageneralname[] = a.e();
        String as[] = new String[ageneralname.length];
        int i = 0;
        while (i < ageneralname.length) 
        {
            org.bouncycastle.asn1.DEREncodable derencodable = ageneralname[i].a;
            if (derencodable instanceof ASN1String)
            {
                as[i] = ((ASN1String)derencodable).n_();
            } else
            {
                as[i] = derencodable.toString();
            }
            i++;
        }
        return as;
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, a));
        }
        asn1encodablevector.a(new DERTaggedObject(true, 1, b));
        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer((new StringBuilder("Name: ")).append(((ASN1String)b.a).n_()).append(" - Auth: ").toString());
        if (a == null || a.e().length == 0)
        {
            stringbuffer.append("N/A");
        } else
        {
            String as[] = e();
            stringbuffer.append('[').append(as[0]);
            for (int i = 1; i < as.length; i++)
            {
                stringbuffer.append(", ").append(as[i]);
            }

            stringbuffer.append(']');
        }
        return stringbuffer.toString();
    }
}
