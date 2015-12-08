// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;

// Referenced classes of package org.spongycastle.asn1.esf:
//            OtherHashAlgAndValue

public class OtherHash extends ASN1Object
    implements ASN1Choice
{

    private ASN1OctetString a;
    private OtherHashAlgAndValue b;

    public final ASN1Primitive a()
    {
        if (b == null)
        {
            return a;
        } else
        {
            return b.a();
        }
    }
}
