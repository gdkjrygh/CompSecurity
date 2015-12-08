// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            AccessDescription

public class AuthorityInformationAccess extends ASN1Object
{

    private AccessDescription a[];

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != a.length; i++)
        {
            asn1encodablevector.a(a[i]);
        }

        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        return (new StringBuilder("AuthorityInformationAccess: Oid(")).append(a[0].c.c()).append(")").toString();
    }
}
