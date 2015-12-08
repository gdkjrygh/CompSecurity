// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERNull;

// Referenced classes of package org.spongycastle.asn1.esf:
//            SignaturePolicyId

public class SignaturePolicyIdentifier extends ASN1Object
{

    private SignaturePolicyId a;
    private boolean b;

    public SignaturePolicyIdentifier()
    {
        b = true;
    }

    public final ASN1Primitive a()
    {
        if (b)
        {
            return new DERNull();
        } else
        {
            return a.a();
        }
    }
}
