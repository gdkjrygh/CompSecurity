// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTCTime;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier, X509Name, Time, X509Extensions

public class TBSCertList extends ASN1Encodable
{
    public static class CRLEntry extends ASN1Encodable
    {

        ASN1Sequence a;
        DERInteger b;
        Time c;
        X509Extensions d;

        public final DERObject d()
        {
            return a;
        }

        public final DERInteger e()
        {
            return b;
        }

        public final Time f()
        {
            return c;
        }

        public final X509Extensions g()
        {
            if (d == null && a.f() == 3)
            {
                d = X509Extensions.a(a.a(2));
            }
            return d;
        }

        public CRLEntry(ASN1Sequence asn1sequence)
        {
            if (asn1sequence.f() < 2 || asn1sequence.f() > 3)
            {
                throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
            } else
            {
                a = asn1sequence;
                b = DERInteger.a(asn1sequence.a(0));
                c = Time.a(asn1sequence.a(1));
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
            return new CRLEntry(ASN1Sequence.a(b.nextElement()));
        }

        b(Enumeration enumeration)
        {
            a = TBSCertList.this;
            super();
            b = enumeration;
        }
    }


    ASN1Sequence a;
    DERInteger b;
    AlgorithmIdentifier c;
    X509Name d;
    Time e;
    Time f;
    ASN1Sequence g;
    X509Extensions h;

    private TBSCertList(ASN1Sequence asn1sequence)
    {
label0:
        {
            super();
            if (asn1sequence.f() < 3 || asn1sequence.f() > 7)
            {
                throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
            }
            a = asn1sequence;
            int i;
            int j;
            if (asn1sequence.a(0) instanceof DERInteger)
            {
                i = 1;
                b = DERInteger.a(asn1sequence.a(0));
            } else
            {
                b = new DERInteger(0);
                i = 0;
            }
            j = i + 1;
            c = AlgorithmIdentifier.b(asn1sequence.a(i));
            i = j + 1;
            d = X509Name.a(asn1sequence.a(j));
            j = i + 1;
            e = Time.a(asn1sequence.a(i));
            i = j;
            if (j >= asn1sequence.f())
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
            f = Time.a(asn1sequence.a(j));
            i = j + 1;
        }
        j = i;
        if (i < asn1sequence.f())
        {
            j = i;
            if (!(asn1sequence.a(i) instanceof DERTaggedObject))
            {
                g = ASN1Sequence.a(asn1sequence.a(i));
                j = i + 1;
            }
        }
        if (j < asn1sequence.f() && (asn1sequence.a(j) instanceof DERTaggedObject))
        {
            h = X509Extensions.a(asn1sequence.a(j));
        }
    }

    public static TBSCertList a(Object obj)
    {
        if (obj instanceof TBSCertList)
        {
            return (TBSCertList)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new TBSCertList((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        return a;
    }

    public final AlgorithmIdentifier e()
    {
        return c;
    }

    public final X509Extensions f()
    {
        return h;
    }
}
