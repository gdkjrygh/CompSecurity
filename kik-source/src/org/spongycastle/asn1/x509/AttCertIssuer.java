// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.x509:
//            V2Form, GeneralNames

public class AttCertIssuer extends ASN1Object
    implements ASN1Choice
{

    ASN1Encodable a;
    ASN1Primitive b;

    private AttCertIssuer(GeneralNames generalnames)
    {
        a = generalnames;
        b = a.a();
    }

    private AttCertIssuer(V2Form v2form)
    {
        a = v2form;
        b = new DERTaggedObject(false, 0, a);
    }

    public static AttCertIssuer a(Object obj)
    {
        if (obj == null || (obj instanceof AttCertIssuer))
        {
            return (AttCertIssuer)obj;
        }
        if (obj instanceof V2Form)
        {
            return new AttCertIssuer(V2Form.a(obj));
        }
        if (obj instanceof GeneralNames)
        {
            return new AttCertIssuer((GeneralNames)obj);
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new AttCertIssuer(V2Form.a((ASN1TaggedObject)obj));
        }
        if (obj instanceof ASN1Sequence)
        {
            return new AttCertIssuer(GeneralNames.a(obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final ASN1Primitive a()
    {
        return b;
    }

    public final ASN1Encodable c()
    {
        return a;
    }
}
