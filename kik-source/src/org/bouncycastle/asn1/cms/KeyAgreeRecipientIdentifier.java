// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            IssuerAndSerialNumber, RecipientKeyIdentifier

public class KeyAgreeRecipientIdentifier extends ASN1Encodable
    implements ASN1Choice
{

    private IssuerAndSerialNumber a;
    private RecipientKeyIdentifier b;

    public final DERObject d()
    {
        if (a != null)
        {
            return a.d();
        } else
        {
            return new DERTaggedObject(false, 0, b);
        }
    }
}
