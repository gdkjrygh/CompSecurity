// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERInteger;

public class V2AttributeCertificateInfoGenerator
{

    private DERInteger a;
    private ASN1EncodableVector b;

    public V2AttributeCertificateInfoGenerator()
    {
        a = new DERInteger(1);
        b = new ASN1EncodableVector();
    }
}
