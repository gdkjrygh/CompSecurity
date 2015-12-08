// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIStatusInfo, CMPCertificate, CertifiedKeyPair

public class KeyRecRepContent extends ASN1Object
{

    private ASN1Sequence caCerts;
    private ASN1Sequence keyPairHist;
    private CMPCertificate newSigCert;
    private PKIStatusInfo status;

    private KeyRecRepContent(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        status = PKIStatusInfo.getInstance(asn1sequence.nextElement());
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.nextElement());
            switch (asn1taggedobject.getTagNo())
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("unknown tag number: ").append(asn1taggedobject.getTagNo()).toString());

            case 0: // '\0'
                newSigCert = CMPCertificate.getInstance(asn1taggedobject.getObject());
                break;

            case 1: // '\001'
                caCerts = ASN1Sequence.getInstance(asn1taggedobject.getObject());
                break;

            case 2: // '\002'
                keyPairHist = ASN1Sequence.getInstance(asn1taggedobject.getObject());
                break;
            }
        } while (true);
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    public static KeyRecRepContent getInstance(Object obj)
    {
        if (obj instanceof KeyRecRepContent)
        {
            return (KeyRecRepContent)obj;
        }
        if (obj != null)
        {
            return new KeyRecRepContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CMPCertificate[] getCaCerts()
    {
        if (caCerts == null)
        {
            return null;
        }
        CMPCertificate acmpcertificate[] = new CMPCertificate[caCerts.size()];
        for (int i = 0; i != acmpcertificate.length; i++)
        {
            acmpcertificate[i] = CMPCertificate.getInstance(caCerts.getObjectAt(i));
        }

        return acmpcertificate;
    }

    public CertifiedKeyPair[] getKeyPairHist()
    {
        if (keyPairHist == null)
        {
            return null;
        }
        CertifiedKeyPair acertifiedkeypair[] = new CertifiedKeyPair[keyPairHist.size()];
        for (int i = 0; i != acertifiedkeypair.length; i++)
        {
            acertifiedkeypair[i] = CertifiedKeyPair.getInstance(keyPairHist.getObjectAt(i));
        }

        return acertifiedkeypair;
    }

    public CMPCertificate getNewSigCert()
    {
        return newSigCert;
    }

    public PKIStatusInfo getStatus()
    {
        return status;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(status);
        addOptional(asn1encodablevector, 0, newSigCert);
        addOptional(asn1encodablevector, 1, caCerts);
        addOptional(asn1encodablevector, 2, keyPairHist);
        return new DERSequence(asn1encodablevector);
    }
}
