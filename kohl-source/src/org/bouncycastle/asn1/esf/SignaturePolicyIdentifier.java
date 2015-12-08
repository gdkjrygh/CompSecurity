// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            SignaturePolicyId

public class SignaturePolicyIdentifier extends ASN1Object
{

    private boolean isSignaturePolicyImplied;
    private SignaturePolicyId signaturePolicyId;

    public SignaturePolicyIdentifier()
    {
        isSignaturePolicyImplied = true;
    }

    public SignaturePolicyIdentifier(SignaturePolicyId signaturepolicyid)
    {
        signaturePolicyId = signaturepolicyid;
        isSignaturePolicyImplied = false;
    }

    public static SignaturePolicyIdentifier getInstance(Object obj)
    {
        if (obj instanceof SignaturePolicyIdentifier)
        {
            return (SignaturePolicyIdentifier)obj;
        }
        if ((obj instanceof ASN1Null) || hasEncodedTagValue(obj, 5))
        {
            return new SignaturePolicyIdentifier();
        }
        if (obj != null)
        {
            return new SignaturePolicyIdentifier(SignaturePolicyId.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public SignaturePolicyId getSignaturePolicyId()
    {
        return signaturePolicyId;
    }

    public boolean isSignaturePolicyImplied()
    {
        return isSignaturePolicyImplied;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (isSignaturePolicyImplied)
        {
            return new DERNull();
        } else
        {
            return signaturePolicyId.toASN1Primitive();
        }
    }
}
