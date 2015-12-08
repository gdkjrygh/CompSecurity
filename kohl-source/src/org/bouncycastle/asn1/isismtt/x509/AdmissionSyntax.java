// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

// Referenced classes of package org.bouncycastle.asn1.isismtt.x509:
//            Admissions

public class AdmissionSyntax extends ASN1Object
{

    private GeneralName admissionAuthority;
    private ASN1Sequence contentsOfAdmissions;

    private AdmissionSyntax(ASN1Sequence asn1sequence)
    {
        switch (asn1sequence.size())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());

        case 1: // '\001'
            contentsOfAdmissions = DERSequence.getInstance(asn1sequence.getObjectAt(0));
            return;

        case 2: // '\002'
            admissionAuthority = GeneralName.getInstance(asn1sequence.getObjectAt(0));
            break;
        }
        contentsOfAdmissions = DERSequence.getInstance(asn1sequence.getObjectAt(1));
    }

    public AdmissionSyntax(GeneralName generalname, ASN1Sequence asn1sequence)
    {
        admissionAuthority = generalname;
        contentsOfAdmissions = asn1sequence;
    }

    public static AdmissionSyntax getInstance(Object obj)
    {
        if (obj == null || (obj instanceof AdmissionSyntax))
        {
            return (AdmissionSyntax)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new AdmissionSyntax((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public GeneralName getAdmissionAuthority()
    {
        return admissionAuthority;
    }

    public Admissions[] getContentsOfAdmissions()
    {
        Admissions aadmissions[] = new Admissions[contentsOfAdmissions.size()];
        int i = 0;
        for (Enumeration enumeration = contentsOfAdmissions.getObjects(); enumeration.hasMoreElements();)
        {
            aadmissions[i] = Admissions.getInstance(enumeration.nextElement());
            i++;
        }

        return aadmissions;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (admissionAuthority != null)
        {
            asn1encodablevector.add(admissionAuthority);
        }
        asn1encodablevector.add(contentsOfAdmissions);
        return new DERSequence(asn1encodablevector);
    }
}
