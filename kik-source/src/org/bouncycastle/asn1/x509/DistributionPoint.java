// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            DistributionPointName, ReasonFlags, GeneralNames

public class DistributionPoint extends ASN1Encodable
{

    DistributionPointName a;
    ReasonFlags b;
    GeneralNames c;

    private DistributionPoint(ASN1Sequence asn1sequence)
    {
        int i;
        i = 0;
_L6:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.f())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        asn1taggedobject = ASN1TaggedObject.a(asn1sequence.a(i));
        asn1taggedobject.e();
        JVM INSTR tableswitch 0 2: default 52
    //                   0 59
    //                   1 70
    //                   2 88;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_88;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        a = DistributionPointName.a(asn1taggedobject);
          goto _L7
_L3:
        b = new ReasonFlags(DERBitString.a(asn1taggedobject));
          goto _L7
        c = GeneralNames.a(asn1taggedobject);
          goto _L7
    }

    public DistributionPoint(DistributionPointName distributionpointname)
    {
        a = distributionpointname;
        b = null;
        c = null;
    }

    public static DistributionPoint a(Object obj)
    {
        if (obj == null || (obj instanceof DistributionPoint))
        {
            return (DistributionPoint)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DistributionPoint((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid DistributionPoint: ")).append(obj.getClass().getName()).toString());
        }
    }

    private static void a(StringBuffer stringbuffer, String s, String s1, String s2)
    {
        stringbuffer.append("    ");
        stringbuffer.append(s1);
        stringbuffer.append(":");
        stringbuffer.append(s);
        stringbuffer.append("    ");
        stringbuffer.append("    ");
        stringbuffer.append(s2);
        stringbuffer.append(s);
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, b));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 2, c));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final DistributionPointName e()
    {
        return a;
    }

    public final ReasonFlags f()
    {
        return b;
    }

    public final GeneralNames g()
    {
        return c;
    }

    public String toString()
    {
        String s = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("DistributionPoint: [");
        stringbuffer.append(s);
        if (a != null)
        {
            a(stringbuffer, s, "distributionPoint", a.toString());
        }
        if (b != null)
        {
            a(stringbuffer, s, "reasons", b.toString());
        }
        if (c != null)
        {
            a(stringbuffer, s, "cRLIssuer", c.toString());
        }
        stringbuffer.append("]");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }
}
