// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.crmf.EncryptedValue;

// Referenced classes of package org.spongycastle.asn1.cmp:
//            CMPCertificate

public class CertOrEncCert extends ASN1Object
    implements ASN1Choice
{

    private CMPCertificate a;
    private EncryptedValue b;

    public final ASN1Primitive a()
    {
        if (a != null)
        {
            return new DERTaggedObject(true, 0, a);
        } else
        {
            return new DERTaggedObject(true, 1, b);
        }
    }
}
