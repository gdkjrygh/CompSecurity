// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            EncryptedKey

public class PKIArchiveOptions extends ASN1Encodable
    implements ASN1Choice
{

    private ASN1Encodable a;

    public final DERObject d()
    {
        if (a instanceof EncryptedKey)
        {
            return new DERTaggedObject(true, 0, a);
        }
        if (a instanceof ASN1OctetString)
        {
            return new DERTaggedObject(false, 1, a);
        } else
        {
            return new DERTaggedObject(false, 2, a);
        }
    }
}
