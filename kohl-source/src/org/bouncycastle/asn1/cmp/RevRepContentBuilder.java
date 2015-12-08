// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.CertificateList;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            RevRepContent, PKIStatusInfo

public class RevRepContentBuilder
{

    private ASN1EncodableVector crls;
    private ASN1EncodableVector revCerts;
    private ASN1EncodableVector status;

    public RevRepContentBuilder()
    {
        status = new ASN1EncodableVector();
        revCerts = new ASN1EncodableVector();
        crls = new ASN1EncodableVector();
    }

    public RevRepContentBuilder add(PKIStatusInfo pkistatusinfo)
    {
        status.add(pkistatusinfo);
        return this;
    }

    public RevRepContentBuilder add(PKIStatusInfo pkistatusinfo, CertId certid)
    {
        if (status.size() != revCerts.size())
        {
            throw new IllegalStateException("status and revCerts sequence must be in common order");
        } else
        {
            status.add(pkistatusinfo);
            revCerts.add(certid);
            return this;
        }
    }

    public RevRepContentBuilder addCrl(CertificateList certificatelist)
    {
        crls.add(certificatelist);
        return this;
    }

    public RevRepContent build()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new DERSequence(status));
        if (revCerts.size() != 0)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, new DERSequence(revCerts)));
        }
        if (crls.size() != 0)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, new DERSequence(crls)));
        }
        return RevRepContent.getInstance(new DERSequence(asn1encodablevector));
    }
}
