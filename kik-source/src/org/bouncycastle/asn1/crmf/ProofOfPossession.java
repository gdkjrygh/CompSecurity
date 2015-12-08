// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class ProofOfPossession extends ASN1Encodable
    implements ASN1Choice
{

    private int a;
    private ASN1Encodable b;

    public ProofOfPossession()
    {
        a = 0;
        b = DERNull.b;
    }

    public final DERObject d()
    {
        return new DERTaggedObject(false, a, b);
    }
}
