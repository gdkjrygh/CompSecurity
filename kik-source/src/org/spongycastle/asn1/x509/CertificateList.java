// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.X500Name;

// Referenced classes of package org.spongycastle.asn1.x509:
//            TBSCertList, AlgorithmIdentifier, Time

public class CertificateList extends ASN1Object
{

    TBSCertList a;
    AlgorithmIdentifier b;
    DERBitString c;

    private CertificateList(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() == 3)
        {
            a = TBSCertList.a(asn1sequence.a(0));
            b = AlgorithmIdentifier.a(asn1sequence.a(1));
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

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }

    public final TBSCertList c()
    {
        return a;
    }

    public final TBSCertList.CRLEntry[] d()
    {
        int l = 0;
        TBSCertList tbscertlist = a;
        if (tbscertlist.f == null)
        {
            return new TBSCertList.CRLEntry[0];
        }
        TBSCertList.CRLEntry acrlentry[];
        for (acrlentry = new TBSCertList.CRLEntry[tbscertlist.f.e()]; l < acrlentry.length; l++)
        {
            acrlentry[l] = TBSCertList.CRLEntry.a(tbscertlist.f.a(l));
        }

        return acrlentry;
    }

    public final Enumeration e()
    {
        TBSCertList tbscertlist = a;
        if (tbscertlist.f == null)
        {
            return new TBSCertList.a(tbscertlist, (byte)0);
        } else
        {
            return new TBSCertList.b(tbscertlist, tbscertlist.f.d());
        }
    }

    public final AlgorithmIdentifier f()
    {
        return b;
    }

    public final DERBitString g()
    {
        return c;
    }

    public final int h()
    {
        TBSCertList tbscertlist = a;
        if (tbscertlist.a == null)
        {
            return 1;
        } else
        {
            return tbscertlist.a.c().intValue() + 1;
        }
    }

    public final X500Name i()
    {
        return a.c;
    }

    public final Time j()
    {
        return a.d;
    }

    public final Time k()
    {
        return a.e;
    }
}
