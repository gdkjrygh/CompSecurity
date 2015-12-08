// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.util;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;

public class KeyUtil
{

    public KeyUtil()
    {
    }

    private static byte[] a(PrivateKeyInfo privatekeyinfo)
    {
        try
        {
            privatekeyinfo = privatekeyinfo.a("DER");
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKeyInfo privatekeyinfo)
        {
            return null;
        }
        return privatekeyinfo;
    }

    public static byte[] a(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        try
        {
            algorithmidentifier = a(new SubjectPublicKeyInfo(algorithmidentifier, asn1encodable));
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            return null;
        }
        return algorithmidentifier;
    }

    public static byte[] a(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        try
        {
            subjectpublickeyinfo = subjectpublickeyinfo.a("DER");
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            return null;
        }
        return subjectpublickeyinfo;
    }

    public static byte[] b(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        try
        {
            algorithmidentifier = a(new PrivateKeyInfo(algorithmidentifier, asn1encodable.a()));
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            return null;
        }
        return algorithmidentifier;
    }
}
