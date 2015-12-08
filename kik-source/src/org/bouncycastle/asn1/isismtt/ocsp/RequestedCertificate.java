// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

public class RequestedCertificate extends ASN1Encodable
    implements ASN1Choice
{

    private X509CertificateStructure a;
    private byte b[];
    private byte c[];

    public final DERObject d()
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
            return a.c();
        }
    }
}
