// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;

// Referenced classes of package org.bouncycastle.asn1.isismtt.x509:
//            NamingAuthority, ProfessionInfo

public class Admissions extends ASN1Object
{

    private GeneralName admissionAuthority;
    private NamingAuthority namingAuthority;
    private ASN1Sequence professionInfos;

    private Admissions(ASN1Sequence asn1sequence)
    {
        Enumeration enumeration;
        if (asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        enumeration = asn1sequence.getObjects();
        asn1sequence = (ASN1Encodable)enumeration.nextElement();
        if (!(asn1sequence instanceof ASN1TaggedObject)) goto _L2; else goto _L1
_L1:
        ((ASN1TaggedObject)asn1sequence).getTagNo();
        JVM INSTR tableswitch 0 1: default 92
    //                   0 125
    //                   1 213;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(((ASN1TaggedObject)asn1sequence).getTagNo()).toString());
_L4:
        admissionAuthority = GeneralName.getInstance((ASN1TaggedObject)asn1sequence, true);
_L7:
        asn1sequence = (ASN1Encodable)enumeration.nextElement();
_L2:
        if (!(asn1sequence instanceof ASN1TaggedObject))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        switch (((ASN1TaggedObject)asn1sequence).getTagNo())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(((ASN1TaggedObject)asn1sequence).getTagNo()).toString());

        case 1: // '\001'
            namingAuthority = NamingAuthority.getInstance((ASN1TaggedObject)asn1sequence, true);
            break;
        }
        break; /* Loop/switch isn't completed */
_L5:
        namingAuthority = NamingAuthority.getInstance((ASN1TaggedObject)asn1sequence, true);
        if (true) goto _L7; else goto _L6
_L6:
        asn1sequence = (ASN1Encodable)enumeration.nextElement();
        professionInfos = ASN1Sequence.getInstance(asn1sequence);
        if (enumeration.hasMoreElements())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad object encountered: ").append(enumeration.nextElement().getClass()).toString());
        } else
        {
            return;
        }
    }

    public Admissions(GeneralName generalname, NamingAuthority namingauthority, ProfessionInfo aprofessioninfo[])
    {
        admissionAuthority = generalname;
        namingAuthority = namingauthority;
        professionInfos = new DERSequence(aprofessioninfo);
    }

    public static Admissions getInstance(Object obj)
    {
        if (obj == null || (obj instanceof Admissions))
        {
            return (Admissions)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new Admissions((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public GeneralName getAdmissionAuthority()
    {
        return admissionAuthority;
    }

    public NamingAuthority getNamingAuthority()
    {
        return namingAuthority;
    }

    public ProfessionInfo[] getProfessionInfos()
    {
        ProfessionInfo aprofessioninfo[] = new ProfessionInfo[professionInfos.size()];
        int i = 0;
        for (Enumeration enumeration = professionInfos.getObjects(); enumeration.hasMoreElements();)
        {
            aprofessioninfo[i] = ProfessionInfo.getInstance(enumeration.nextElement());
            i++;
        }

        return aprofessioninfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (admissionAuthority != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, admissionAuthority));
        }
        if (namingAuthority != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, namingAuthority));
        }
        asn1encodablevector.add(professionInfos);
        return new DERSequence(asn1encodablevector);
    }
}
