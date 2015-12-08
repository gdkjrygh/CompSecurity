// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.x500.X500Name;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier, Time, Extensions

public class TBSCertList extends ASN1Object
{
    public static class CRLEntry extends ASN1Object
    {

        Extensions crlEntryExtensions;
        ASN1Sequence seq;

        public static CRLEntry getInstance(Object obj)
        {
            if (obj instanceof CRLEntry)
            {
                return (CRLEntry)obj;
            }
            if (obj != null)
            {
                return new CRLEntry(ASN1Sequence.getInstance(obj));
            } else
            {
                return null;
            }
        }

        public Extensions getExtensions()
        {
            if (crlEntryExtensions == null && seq.size() == 3)
            {
                crlEntryExtensions = Extensions.getInstance(seq.getObjectAt(2));
            }
            return crlEntryExtensions;
        }

        public Time getRevocationDate()
        {
            return Time.getInstance(seq.getObjectAt(1));
        }

        public ASN1Integer getUserCertificate()
        {
            return ASN1Integer.getInstance(seq.getObjectAt(0));
        }

        public boolean hasExtensions()
        {
            return seq.size() == 3;
        }

        public ASN1Primitive toASN1Primitive()
        {
            return seq;
        }

        private CRLEntry(ASN1Sequence asn1sequence)
        {
            if (asn1sequence.size() < 2 || asn1sequence.size() > 3)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
            } else
            {
                seq = asn1sequence;
                return;
            }
        }
    }

    private class EmptyEnumeration
        implements Enumeration
    {

        final TBSCertList this$0;

        public boolean hasMoreElements()
        {
            return false;
        }

        public Object nextElement()
        {
            return null;
        }

        private EmptyEnumeration()
        {
            this$0 = TBSCertList.this;
            super();
        }

    }

    private class RevokedCertificatesEnumeration
        implements Enumeration
    {

        private final Enumeration en;
        final TBSCertList this$0;

        public boolean hasMoreElements()
        {
            return en.hasMoreElements();
        }

        public Object nextElement()
        {
            return CRLEntry.getInstance(en.nextElement());
        }

        RevokedCertificatesEnumeration(Enumeration enumeration)
        {
            this$0 = TBSCertList.this;
            super();
            en = enumeration;
        }
    }


    Extensions crlExtensions;
    X500Name issuer;
    Time nextUpdate;
    ASN1Sequence revokedCertificates;
    AlgorithmIdentifier signature;
    Time thisUpdate;
    ASN1Integer version;

    public TBSCertList(ASN1Sequence asn1sequence)
    {
label0:
        {
            super();
            if (asn1sequence.size() < 3 || asn1sequence.size() > 7)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
            }
            int i = 0;
            int j;
            if (asn1sequence.getObjectAt(0) instanceof ASN1Integer)
            {
                version = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
                i = 1;
            } else
            {
                version = null;
            }
            j = i + 1;
            signature = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(i));
            i = j + 1;
            issuer = X500Name.getInstance(asn1sequence.getObjectAt(j));
            j = i + 1;
            thisUpdate = Time.getInstance(asn1sequence.getObjectAt(i));
            i = j;
            if (j >= asn1sequence.size())
            {
                break label0;
            }
            if (!(asn1sequence.getObjectAt(j) instanceof DERUTCTime) && !(asn1sequence.getObjectAt(j) instanceof DERGeneralizedTime))
            {
                i = j;
                if (!(asn1sequence.getObjectAt(j) instanceof Time))
                {
                    break label0;
                }
            }
            nextUpdate = Time.getInstance(asn1sequence.getObjectAt(j));
            i = j + 1;
        }
        j = i;
        if (i < asn1sequence.size())
        {
            j = i;
            if (!(asn1sequence.getObjectAt(i) instanceof DERTaggedObject))
            {
                revokedCertificates = ASN1Sequence.getInstance(asn1sequence.getObjectAt(i));
                j = i + 1;
            }
        }
        if (j < asn1sequence.size() && (asn1sequence.getObjectAt(j) instanceof DERTaggedObject))
        {
            crlExtensions = Extensions.getInstance(ASN1Sequence.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(j), true));
        }
    }

    public static TBSCertList getInstance(Object obj)
    {
        if (obj instanceof TBSCertList)
        {
            return (TBSCertList)obj;
        }
        if (obj != null)
        {
            return new TBSCertList(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static TBSCertList getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public Extensions getExtensions()
    {
        return crlExtensions;
    }

    public X500Name getIssuer()
    {
        return issuer;
    }

    public Time getNextUpdate()
    {
        return nextUpdate;
    }

    public Enumeration getRevokedCertificateEnumeration()
    {
        if (revokedCertificates == null)
        {
            return new EmptyEnumeration();
        } else
        {
            return new RevokedCertificatesEnumeration(revokedCertificates.getObjects());
        }
    }

    public CRLEntry[] getRevokedCertificates()
    {
        int i = 0;
        if (revokedCertificates == null)
        {
            return new CRLEntry[0];
        }
        CRLEntry acrlentry[];
        for (acrlentry = new CRLEntry[revokedCertificates.size()]; i < acrlentry.length; i++)
        {
            acrlentry[i] = CRLEntry.getInstance(revokedCertificates.getObjectAt(i));
        }

        return acrlentry;
    }

    public AlgorithmIdentifier getSignature()
    {
        return signature;
    }

    public Time getThisUpdate()
    {
        return thisUpdate;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public int getVersionNumber()
    {
        if (version == null)
        {
            return 1;
        } else
        {
            return version.getValue().intValue() + 1;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (version != null)
        {
            asn1encodablevector.add(version);
        }
        asn1encodablevector.add(signature);
        asn1encodablevector.add(issuer);
        asn1encodablevector.add(thisUpdate);
        if (nextUpdate != null)
        {
            asn1encodablevector.add(nextUpdate);
        }
        if (revokedCertificates != null)
        {
            asn1encodablevector.add(revokedCertificates);
        }
        if (crlExtensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(0, crlExtensions));
        }
        return new DERSequence(asn1encodablevector);
    }
}
