// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERTaggedObject;

public class V3TBSCertificateGenerator
{

    DERTaggedObject a;

    public V3TBSCertificateGenerator()
    {
        a = new DERTaggedObject(0, new DERInteger(2));
    }
}
