// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.DERTaggedObject;

public class V3TBSCertificateGenerator
{

    DERTaggedObject a;

    public V3TBSCertificateGenerator()
    {
        a = new DERTaggedObject(true, 0, new ASN1Integer(2));
    }
}
