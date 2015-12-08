// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.x500.X500Name;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertificate, Time, Extension, Extensions, 
//            X509Name, AlgorithmIdentifier, SubjectPublicKeyInfo, X509Extensions

public class V3TBSCertificateGenerator
{

    private boolean altNamePresentAndCritical;
    Time endDate;
    Extensions extensions;
    X500Name issuer;
    private DERBitString issuerUniqueID;
    ASN1Integer serialNumber;
    AlgorithmIdentifier signature;
    Time startDate;
    X500Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    private DERBitString subjectUniqueID;
    DERTaggedObject version;

    public V3TBSCertificateGenerator()
    {
        version = new DERTaggedObject(true, 0, new ASN1Integer(2));
    }

    public TBSCertificate generateTBSCertificate()
    {
        if (serialNumber == null || signature == null || issuer == null || startDate == null || endDate == null || subject == null && !altNamePresentAndCritical || subjectPublicKeyInfo == null)
        {
            throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
        }
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(serialNumber);
        asn1encodablevector.add(signature);
        asn1encodablevector.add(issuer);
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        asn1encodablevector1.add(startDate);
        asn1encodablevector1.add(endDate);
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        if (subject != null)
        {
            asn1encodablevector.add(subject);
        } else
        {
            asn1encodablevector.add(new DERSequence());
        }
        asn1encodablevector.add(subjectPublicKeyInfo);
        if (issuerUniqueID != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, issuerUniqueID));
        }
        if (subjectUniqueID != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 2, subjectUniqueID));
        }
        if (extensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 3, extensions));
        }
        return TBSCertificate.getInstance(new DERSequence(asn1encodablevector));
    }

    public void setEndDate(DERUTCTime derutctime)
    {
        endDate = new Time(derutctime);
    }

    public void setEndDate(Time time)
    {
        endDate = time;
    }

    public void setExtensions(Extensions extensions1)
    {
        extensions = extensions1;
        if (extensions1 != null)
        {
            extensions1 = extensions1.getExtension(Extension.subjectAlternativeName);
            if (extensions1 != null && extensions1.isCritical())
            {
                altNamePresentAndCritical = true;
            }
        }
    }

    public void setExtensions(X509Extensions x509extensions)
    {
        setExtensions(Extensions.getInstance(x509extensions));
    }

    public void setIssuer(X500Name x500name)
    {
        issuer = x500name;
    }

    public void setIssuer(X509Name x509name)
    {
        issuer = X500Name.getInstance(x509name);
    }

    public void setIssuerUniqueID(DERBitString derbitstring)
    {
        issuerUniqueID = derbitstring;
    }

    public void setSerialNumber(ASN1Integer asn1integer)
    {
        serialNumber = asn1integer;
    }

    public void setSignature(AlgorithmIdentifier algorithmidentifier)
    {
        signature = algorithmidentifier;
    }

    public void setStartDate(DERUTCTime derutctime)
    {
        startDate = new Time(derutctime);
    }

    public void setStartDate(Time time)
    {
        startDate = time;
    }

    public void setSubject(X500Name x500name)
    {
        subject = x500name;
    }

    public void setSubject(X509Name x509name)
    {
        subject = X500Name.getInstance(x509name.toASN1Primitive());
    }

    public void setSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        subjectPublicKeyInfo = subjectpublickeyinfo;
    }

    public void setSubjectUniqueID(DERBitString derbitstring)
    {
        subjectUniqueID = derbitstring;
    }
}
