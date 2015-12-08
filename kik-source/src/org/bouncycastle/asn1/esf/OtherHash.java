// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            OtherHashAlgAndValue

public class OtherHash extends ASN1Encodable
    implements ASN1Choice
{

    private ASN1OctetString a;
    private OtherHashAlgAndValue b;

    public final DERObject d()
    {
        if (b == null)
        {
            return a;
        } else
        {
            return b.d();
        }
    }
}
