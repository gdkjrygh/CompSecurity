// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            DistributionPointName, ReasonFlags

public class IssuingDistributionPoint extends ASN1Encodable
{

    private DistributionPointName a;
    private boolean b;
    private boolean c;
    private ReasonFlags d;
    private boolean e;
    private boolean f;
    private ASN1Sequence g;

    public IssuingDistributionPoint(ASN1Sequence asn1sequence)
    {
        int k;
        g = asn1sequence;
        k = 0;
_L9:
        ASN1TaggedObject asn1taggedobject;
        if (k == asn1sequence.f())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        asn1taggedobject = ASN1TaggedObject.a(asn1sequence.a(k));
        asn1taggedobject.e();
        JVM INSTR tableswitch 0 5: default 72
    //                   0 82
    //                   1 97
    //                   2 111
    //                   3 125
    //                   4 143
    //                   5 157;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_157;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
_L2:
        a = DistributionPointName.a(asn1taggedobject);
_L10:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
        b = DERBoolean.a(asn1taggedobject).e();
          goto _L10
_L4:
        c = DERBoolean.a(asn1taggedobject).e();
          goto _L10
_L5:
        d = new ReasonFlags(ReasonFlags.a(asn1taggedobject));
          goto _L10
_L6:
        e = DERBoolean.a(asn1taggedobject).e();
          goto _L10
        f = DERBoolean.a(asn1taggedobject).e();
          goto _L10
    }

    private static String a(boolean flag)
    {
        if (flag)
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public static IssuingDistributionPoint a(Object obj)
    {
        if (obj == null || (obj instanceof IssuingDistributionPoint))
        {
            return (IssuingDistributionPoint)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new IssuingDistributionPoint((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
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
        return g;
    }

    public final boolean e()
    {
        return b;
    }

    public final boolean f()
    {
        return c;
    }

    public final boolean g()
    {
        return e;
    }

    public final boolean h()
    {
        return f;
    }

    public final DistributionPointName i()
    {
        return a;
    }

    public final ReasonFlags j()
    {
        return d;
    }

    public String toString()
    {
        String s = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("IssuingDistributionPoint: [");
        stringbuffer.append(s);
        if (a != null)
        {
            a(stringbuffer, s, "distributionPoint", a.toString());
        }
        if (b)
        {
            a(stringbuffer, s, "onlyContainsUserCerts", a(b));
        }
        if (c)
        {
            a(stringbuffer, s, "onlyContainsCACerts", a(c));
        }
        if (d != null)
        {
            a(stringbuffer, s, "onlySomeReasons", d.toString());
        }
        if (f)
        {
            a(stringbuffer, s, "onlyContainsAttributeCerts", a(f));
        }
        if (e)
        {
            a(stringbuffer, s, "indirectCRL", a(e));
        }
        stringbuffer.append("]");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }
}
