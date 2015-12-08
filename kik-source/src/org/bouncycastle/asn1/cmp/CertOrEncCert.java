// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedValue;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            CMPCertificate

public class CertOrEncCert extends ASN1Encodable
    implements ASN1Choice
{

    private CMPCertificate a;
    private EncryptedValue b;

    public final DERObject d()
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
