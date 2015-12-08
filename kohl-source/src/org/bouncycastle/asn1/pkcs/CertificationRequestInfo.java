// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;

public class CertificationRequestInfo extends ASN1Object
{

    ASN1Set attributes;
    X500Name subject;
    SubjectPublicKeyInfo subjectPKInfo;
    ASN1Integer version;

    public CertificationRequestInfo(ASN1Sequence asn1sequence)
    {
        version = new ASN1Integer(0);
        attributes = null;
        version = (ASN1Integer)asn1sequence.getObjectAt(0);
        subject = X500Name.getInstance(asn1sequence.getObjectAt(1));
        subjectPKInfo = SubjectPublicKeyInfo.getInstance(asn1sequence.getObjectAt(2));
        if (asn1sequence.size() > 3)
        {
            attributes = ASN1Set.getInstance((DERTaggedObject)asn1sequence.getObjectAt(3), false);
        }
        if (subject == null || version == null || subjectPKInfo == null)
        {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        } else
        {
            return;
        }
    }

    public CertificationRequestInfo(X500Name x500name, SubjectPublicKeyInfo subjectpublickeyinfo, ASN1Set asn1set)
    {
        version = new ASN1Integer(0);
        attributes = null;
        subject = x500name;
        subjectPKInfo = subjectpublickeyinfo;
        attributes = asn1set;
        if (x500name == null || version == null || subjectPKInfo == null)
        {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        } else
        {
            return;
        }
    }

    public CertificationRequestInfo(X509Name x509name, SubjectPublicKeyInfo subjectpublickeyinfo, ASN1Set asn1set)
    {
        version = new ASN1Integer(0);
        attributes = null;
        subject = X500Name.getInstance(x509name.toASN1Primitive());
        subjectPKInfo = subjectpublickeyinfo;
        attributes = asn1set;
        if (x509name == null || version == null || subjectPKInfo == null)
        {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        } else
        {
            return;
        }
    }

    public static CertificationRequestInfo getInstance(Object obj)
    {
        if (obj instanceof CertificationRequestInfo)
        {
            return (CertificationRequestInfo)obj;
        }
        if (obj != null)
        {
            return new CertificationRequestInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Set getAttributes()
    {
        return attributes;
    }

    public X500Name getSubject()
    {
        return subject;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo()
    {
        return subjectPKInfo;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(subject);
        asn1encodablevector.add(subjectPKInfo);
        if (attributes != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, attributes));
        }
        return new DERSequence(asn1encodablevector);
    }
}
