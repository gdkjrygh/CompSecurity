// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.mozilla;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class PublicKeyAndChallenge extends ASN1Object
{

    private DERIA5String challenge;
    private ASN1Sequence pkacSeq;
    private SubjectPublicKeyInfo spki;

    private PublicKeyAndChallenge(ASN1Sequence asn1sequence)
    {
        pkacSeq = asn1sequence;
        spki = SubjectPublicKeyInfo.getInstance(asn1sequence.getObjectAt(0));
        challenge = DERIA5String.getInstance(asn1sequence.getObjectAt(1));
    }

    public static PublicKeyAndChallenge getInstance(Object obj)
    {
        if (obj instanceof PublicKeyAndChallenge)
        {
            return (PublicKeyAndChallenge)obj;
        }
        if (obj != null)
        {
            return new PublicKeyAndChallenge(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERIA5String getChallenge()
    {
        return challenge;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo()
    {
        return spki;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return pkacSeq;
    }
}
