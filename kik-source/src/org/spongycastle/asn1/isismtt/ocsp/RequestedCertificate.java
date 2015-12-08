// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.isismtt.ocsp;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.X509CertificateStructure;

public class RequestedCertificate extends ASN1Object
    implements ASN1Choice
{

    private X509CertificateStructure a;
    private byte b[];
    private byte c[];

    public final ASN1Primitive a()
    {
        if (b != null)
        {
            return new DERTaggedObject(0, new DEROctetString(b));
        }
        if (c != null)
        {
            return new DERTaggedObject(1, new DEROctetString(c));
        } else
        {
            return a.a();
        }
    }
}
