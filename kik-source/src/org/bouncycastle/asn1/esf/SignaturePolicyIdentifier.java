// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            SignaturePolicyId

public class SignaturePolicyIdentifier extends ASN1Encodable
{

    private SignaturePolicyId a;
    private boolean b;

    public SignaturePolicyIdentifier()
    {
        b = true;
    }

    public final DERObject d()
    {
        if (b)
        {
            return new DERNull();
        } else
        {
            return a.c();
        }
    }
}
