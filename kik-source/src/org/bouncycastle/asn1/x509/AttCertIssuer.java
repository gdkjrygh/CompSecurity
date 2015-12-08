// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            V2Form, GeneralNames

public class AttCertIssuer extends ASN1Encodable
    implements ASN1Choice
{

    ASN1Encodable a;
    DERObject b;

    private AttCertIssuer(GeneralNames generalnames)
    {
        a = generalnames;
        b = a.c();
    }

    private AttCertIssuer(V2Form v2form)
    {
        a = v2form;
        b = new DERTaggedObject(false, 0, a);
    }

    public static AttCertIssuer a(Object obj)
    {
        if (obj instanceof AttCertIssuer)
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

    public final DERObject d()
    {
        return b;
    }

    public final ASN1Encodable e()
    {
        return a;
    }
}
