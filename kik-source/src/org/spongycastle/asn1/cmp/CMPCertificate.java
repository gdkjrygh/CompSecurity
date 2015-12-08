// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AttributeCertificate;
import org.spongycastle.asn1.x509.Certificate;

public class CMPCertificate extends ASN1Object
    implements ASN1Choice
{

    private Certificate a;
    private AttributeCertificate b;

    public final ASN1Primitive a()
    {
        if (b != null)
        {
            return new DERTaggedObject(true, 1, b);
        } else
        {
            return a.a();
        }
    }
}
