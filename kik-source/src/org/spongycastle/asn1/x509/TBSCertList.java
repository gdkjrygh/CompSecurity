// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.DERUTCTime;
import org.spongycastle.asn1.x500.X500Name;

// Referenced classes of package org.spongycastle.asn1.x509:
//            AlgorithmIdentifier, Time, Extensions

public class TBSCertList extends ASN1Object
{
    public static class CRLEntry extends ASN1Object
    {

        ASN1Sequence a;
        Extensions b;

        public static CRLEntry a(Object obj)
        {
            if (obj instanceof CRLEntry)
            {
                return (CRLEntry)obj;
            }
            if (obj != null)
            {
                return new CRLEntry(ASN1Sequence.a(obj));
            } else
            {
                return null;
            }
        }

        public final ASN1Primitive a()
        {
            return a;
        }

        public final ASN1Integer c()
        {
            return ASN1Integer.a(a.a(0));
        }

        public final Time d()
        {
            return Time.a(a.a(1));
        }

        public final Extensions e()
        {
            if (b == null && a.e() == 3)
            {
                b = Extensions.a(a.a(2));
            }
            return b;
        }

        public final boolean f()
        {
            return a.e() == 3;
        }

        private CRLEntry(ASN1Sequence asn1sequence)
        {
            if (asn1sequence.e() < 2 || asn1sequence.e() > 3)
            {
                throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
            } else
            {
                a = asn1sequence;
                return;
            }
        }
    }

    private final class a
        implements Enumeration
    {

        final TBSCertList a;

        public final boolean hasMoreElements()
        {
            return false;
        }

        public final Object nextElement()
        {
            return null;
        }

        private a()
        {
            a = TBSCertList.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements Enumeration
    {

        final TBSCertList a;
        private final Enumeration b;

        public final boolean hasMoreElements()
        {
            return b.hasMoreElements();
        }

        public final Object nextElement()
        {
            return CRLEntry.a(b.nextElement());
        }

        b(Enumeration enumeration)
        {
            a = TBSCertList.this;
            super();
            b = enumeration;
        }
    }


    ASN1Integer a;
    AlgorithmIdentifier b;
    X500Name c;
    Time d;
    Time e;
    ASN1Sequence f;
    Extensions g;

    private TBSCertList(ASN1Sequence asn1sequence)
    {
label0:
        {
            int i = 0;
            super();
            if (asn1sequence.e() < 3 || asn1sequence.e() > 7)
            {
                throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
            }
            int j;
            if (asn1sequence.a(0) instanceof ASN1Integer)
            {
                a = ASN1Integer.a(asn1sequence.a(0));
                i = 1;
            } else
            {
                a = null;
            }
            j = i + 1;
            b = AlgorithmIdentifier.a(asn1sequence.a(i));
            i = j + 1;
            c = X500Name.a(asn1sequence.a(j));
            j = i + 1;
            d = Time.a(asn1sequence.a(i));
            i = j;
            if (j >= asn1sequence.e())
            {
                break label0;
            }
            if (!(asn1sequence.a(j) instanceof DERUTCTime) && !(asn1sequence.a(j) instanceof DERGeneralizedTime))
            {
                i = j;
                if (!(asn1sequence.a(j) instanceof Time))
                {
                    break label0;
                }
            }
            e = Time.a(asn1sequence.a(j));
            i = j + 1;
        }
        j = i;
        if (i < asn1sequence.e())
        {
            j = i;
            if (!(asn1sequence.a(i) instanceof DERTaggedObject))
            {
                f = ASN1Sequence.a(asn1sequence.a(i));
                j = i + 1;
            }
        }
        if (j < asn1sequence.e() && (asn1sequence.a(j) instanceof DERTaggedObject))
        {
            g = Extensions.a(ASN1Sequence.a((ASN1TaggedObject)asn1sequence.a(j), true));
        }
    }

    public static TBSCertList a(Object obj)
    {
        if (obj instanceof TBSCertList)
        {
            return (TBSCertList)obj;
        }
        if (obj != null)
        {
            return new TBSCertList(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(a);
        }
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        if (e != null)
        {
            asn1encodablevector.a(e);
        }
        if (f != null)
        {
            asn1encodablevector.a(f);
        }
        if (g != null)
        {
            asn1encodablevector.a(new DERTaggedObject(0, g));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier c()
    {
        return b;
    }

    public final Extensions d()
    {
        return g;
    }
}
