// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class KeyUtil
{

    public KeyUtil()
    {
    }

    public static byte[] getEncodedPrivateKeyInfo(PrivateKeyInfo privatekeyinfo)
    {
        try
        {
            privatekeyinfo = privatekeyinfo.getEncoded("DER");
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKeyInfo privatekeyinfo)
        {
            return null;
        }
        return privatekeyinfo;
    }

    public static byte[] getEncodedPrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        try
        {
            algorithmidentifier = getEncodedPrivateKeyInfo(new PrivateKeyInfo(algorithmidentifier, asn1encodable.toASN1Primitive()));
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            return null;
        }
        return algorithmidentifier;
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        try
        {
            algorithmidentifier = getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(algorithmidentifier, asn1encodable));
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            return null;
        }
        return algorithmidentifier;
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        try
        {
            algorithmidentifier = getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(algorithmidentifier, abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            return null;
        }
        return algorithmidentifier;
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        try
        {
            subjectpublickeyinfo = subjectpublickeyinfo.getEncoded("DER");
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            return null;
        }
        return subjectpublickeyinfo;
    }
}
