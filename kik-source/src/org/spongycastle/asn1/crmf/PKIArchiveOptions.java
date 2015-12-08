// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.crmf;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.crmf:
//            EncryptedKey

public class PKIArchiveOptions extends ASN1Object
    implements ASN1Choice
{

    private ASN1Encodable a;

    public final ASN1Primitive a()
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
