// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.crmf;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.cms.EnvelopedData;

// Referenced classes of package org.spongycastle.asn1.crmf:
//            EncryptedValue

public class EncryptedKey extends ASN1Object
    implements ASN1Choice
{

    private EnvelopedData a;
    private EncryptedValue b;

    public final ASN1Primitive a()
    {
        if (b != null)
        {
            return b.a();
        } else
        {
            return new DERTaggedObject(false, 0, a);
        }
    }
}
