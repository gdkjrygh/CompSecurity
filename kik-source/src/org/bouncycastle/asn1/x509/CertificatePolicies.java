// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class CertificatePolicies extends ASN1Encodable
{

    static final DERObjectIdentifier a = new DERObjectIdentifier("2.5.29.32.0");
    Vector b;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i < b.size(); i++)
        {
            asn1encodablevector.a(new DERSequence((DERObjectIdentifier)b.elementAt(i)));
        }

        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        String s = null;
        for (int i = 0; i < b.size(); i++)
        {
            String s1 = s;
            if (s != null)
            {
                s1 = (new StringBuilder()).append(s).append(", ").toString();
            }
            s = (new StringBuilder()).append(s1).append(((DERObjectIdentifier)b.elementAt(i)).e()).toString();
        }

        return (new StringBuilder("CertificatePolicies: ")).append(s).toString();
    }

}
