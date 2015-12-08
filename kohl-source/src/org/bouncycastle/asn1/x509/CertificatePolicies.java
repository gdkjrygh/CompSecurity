// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            PolicyInformation

public class CertificatePolicies extends ASN1Object
{

    private final PolicyInformation policyInformation[];

    private CertificatePolicies(ASN1Sequence asn1sequence)
    {
        policyInformation = new PolicyInformation[asn1sequence.size()];
        for (int i = 0; i != asn1sequence.size(); i++)
        {
            policyInformation[i] = PolicyInformation.getInstance(asn1sequence.getObjectAt(i));
        }

    }

    public CertificatePolicies(PolicyInformation policyinformation)
    {
        policyInformation = (new PolicyInformation[] {
            policyinformation
        });
    }

    public CertificatePolicies(PolicyInformation apolicyinformation[])
    {
        policyInformation = apolicyinformation;
    }

    public static CertificatePolicies getInstance(Object obj)
    {
        if (obj instanceof CertificatePolicies)
        {
            return (CertificatePolicies)obj;
        }
        if (obj != null)
        {
            return new CertificatePolicies(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static CertificatePolicies getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public PolicyInformation[] getPolicyInformation()
    {
        PolicyInformation apolicyinformation[] = new PolicyInformation[policyInformation.length];
        System.arraycopy(policyInformation, 0, apolicyinformation, 0, policyInformation.length);
        return apolicyinformation;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERSequence(policyInformation);
    }

    public String toString()
    {
        String s = null;
        for (int i = 0; i < policyInformation.length; i++)
        {
            String s1 = s;
            if (s != null)
            {
                s1 = (new StringBuilder()).append(s).append(", ").toString();
            }
            s = (new StringBuilder()).append(s1).append(policyInformation[i]).toString();
        }

        return (new StringBuilder()).append("CertificatePolicies: ").append(s).toString();
    }
}
