// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            DistributionPoint

public class CRLDistPoint extends ASN1Encodable
{

    ASN1Sequence a;

    public CRLDistPoint(ASN1Sequence asn1sequence)
    {
        a = null;
        a = asn1sequence;
    }

    public static CRLDistPoint a(Object obj)
    {
        if ((obj instanceof CRLDistPoint) || obj == null)
        {
            return (CRLDistPoint)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new CRLDistPoint((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        return a;
    }

    public final DistributionPoint[] e()
    {
        DistributionPoint adistributionpoint[] = new DistributionPoint[a.f()];
        for (int i = 0; i != a.f(); i++)
        {
            adistributionpoint[i] = DistributionPoint.a(a.a(i));
        }

        return adistributionpoint;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("CRLDistPoint:");
        stringbuffer.append(s);
        DistributionPoint adistributionpoint[] = e();
        for (int i = 0; i != adistributionpoint.length; i++)
        {
            stringbuffer.append("    ");
            stringbuffer.append(adistributionpoint[i]);
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }
}
