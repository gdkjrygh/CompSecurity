// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.EnvelopedData;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            EncryptedValue

public class EncryptedKey extends ASN1Encodable
    implements ASN1Choice
{

    private EnvelopedData a;
    private EncryptedValue b;

    public final DERObject d()
    {
        if (b != null)
        {
            return b.d();
        } else
        {
            return new DERTaggedObject(false, 0, a);
        }
    }
}
