// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;

public class PKIConfirmContent extends ASN1Encodable
{

    private ASN1Null a;

    public PKIConfirmContent()
    {
        a = DERNull.b;
    }

    public final DERObject d()
    {
        return a;
    }
}
