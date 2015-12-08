// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralNames, GeneralName

public class RoleSyntax extends ASN1Object
{

    private GeneralNames a;
    private GeneralName b;

    private String[] c()
    {
        if (a == null)
        {
            return new String[0];
        }
        GeneralName ageneralname[] = a.c();
        String as[] = new String[ageneralname.length];
        int i = 0;
        while (i < ageneralname.length) 
        {
            org.spongycastle.asn1.ASN1Encodable asn1encodable = ageneralname[i].d();
            if (asn1encodable instanceof ASN1String)
            {
                as[i] = ((ASN1String)asn1encodable).o_();
            } else
            {
                as[i] = asn1encodable.toString();
            }
            i++;
        }
        return as;
    }

    public final ASN1Primitive a()
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
        StringBuffer stringbuffer = new StringBuffer((new StringBuilder("Name: ")).append(((ASN1String)b.d()).o_()).append(" - Auth: ").toString());
        if (a == null || a.c().length == 0)
        {
            stringbuffer.append("N/A");
        } else
        {
            String as[] = c();
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
