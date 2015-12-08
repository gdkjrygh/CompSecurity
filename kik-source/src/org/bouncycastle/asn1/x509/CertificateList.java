// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertList, AlgorithmIdentifier, X509Name, Time

public class CertificateList extends ASN1Encodable
{

    TBSCertList a;
    AlgorithmIdentifier b;
    DERBitString c;

    public CertificateList(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() == 3)
        {
            a = TBSCertList.a(asn1sequence.a(0));
            b = AlgorithmIdentifier.b(asn1sequence.a(1));
            c = DERBitString.a(asn1sequence.a(2));
            return;
        } else
        {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
    }

    public static CertificateList a(Object obj)
    {
        if (obj instanceof CertificateList)
        {
            return (CertificateList)obj;
        }
        if (obj != null)
        {
            return new CertificateList(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }

    public final TBSCertList e()
    {
        return a;
    }

    public final TBSCertList.CRLEntry[] f()
    {
        int i1 = 0;
        TBSCertList tbscertlist = a;
        if (tbscertlist.g == null)
        {
            return new TBSCertList.CRLEntry[0];
        }
        TBSCertList.CRLEntry acrlentry[];
        for (acrlentry = new TBSCertList.CRLEntry[tbscertlist.g.f()]; i1 < acrlentry.length; i1++)
        {
            acrlentry[i1] = new TBSCertList.CRLEntry(ASN1Sequence.a(tbscertlist.g.a(i1)));
        }

        return acrlentry;
    }

    public final Enumeration g()
    {
        TBSCertList tbscertlist = a;
        if (tbscertlist.g == null)
        {
            return new TBSCertList.a(tbscertlist, (byte)0);
        } else
        {
            return new TBSCertList.b(tbscertlist, tbscertlist.g.e());
        }
    }

    public final AlgorithmIdentifier h()
    {
        return b;
    }

    public final DERBitString i()
    {
        return c;
    }

    public final int j()
    {
        return a.b.e().intValue() + 1;
    }

    public final X509Name k()
    {
        return a.d;
    }

    public final Time l()
    {
        return a.e;
    }

    public final Time m()
    {
        return a.f;
    }
}
