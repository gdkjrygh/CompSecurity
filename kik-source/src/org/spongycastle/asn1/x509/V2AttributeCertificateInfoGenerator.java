// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;

public class V2AttributeCertificateInfoGenerator
{

    private ASN1Integer a;
    private ASN1EncodableVector b;

    public V2AttributeCertificateInfoGenerator()
    {
        a = new ASN1Integer(1);
        b = new ASN1EncodableVector();
    }
}
