// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.KeyUsage;

public class X509KeyUsage extends ASN1Encodable
{

    private int a;

    public final DERObject d()
    {
        return new KeyUsage(a);
    }
}
