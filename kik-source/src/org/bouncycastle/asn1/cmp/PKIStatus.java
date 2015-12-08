// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

public class PKIStatus extends ASN1Encodable
{

    public static final PKIStatus a = new PKIStatus(0);
    public static final PKIStatus b = new PKIStatus(1);
    public static final PKIStatus c = new PKIStatus(2);
    public static final PKIStatus d = new PKIStatus(3);
    public static final PKIStatus e = new PKIStatus(4);
    public static final PKIStatus f = new PKIStatus(5);
    public static final PKIStatus g = new PKIStatus(6);
    private DERInteger h;

    private PKIStatus(int i)
    {
        this(new DERInteger(i));
    }

    private PKIStatus(DERInteger derinteger)
    {
        h = derinteger;
    }

    public final DERObject d()
    {
        return h;
    }

}
