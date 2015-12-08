// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            DistributionPoint

public class CRLDistPoint extends ASN1Object
{

    ASN1Sequence a;

    private CRLDistPoint(ASN1Sequence asn1sequence)
    {
        a = null;
        a = asn1sequence;
    }

    public static CRLDistPoint a(Object obj)
    {
        if (obj instanceof CRLDistPoint)
        {
            return (CRLDistPoint)obj;
        }
        if (obj != null)
        {
            return new CRLDistPoint(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final DistributionPoint[] c()
    {
        DistributionPoint adistributionpoint[] = new DistributionPoint[a.e()];
        for (int i = 0; i != a.e(); i++)
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
        DistributionPoint adistributionpoint[] = c();
        for (int i = 0; i != adistributionpoint.length; i++)
        {
            stringbuffer.append("    ");
            stringbuffer.append(adistributionpoint[i]);
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }
}
