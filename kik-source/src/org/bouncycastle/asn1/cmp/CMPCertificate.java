// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

public class CMPCertificate extends ASN1Encodable
    implements ASN1Choice
{

    private X509CertificateStructure a;
    private AttributeCertificate b;

    public final DERObject d()
    {
        if (b != null)
        {
            return new DERTaggedObject(true, 1, b);
        } else
        {
            return a.d();
        }
    }
}
