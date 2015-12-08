// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.ocsp;

import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ocsp.CertID;

public class CertificateID
{

    private final CertID a;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof CertificateID))
        {
            return false;
        } else
        {
            obj = (CertificateID)obj;
            return a.a().equals(((CertificateID) (obj)).a.a());
        }
    }

    public int hashCode()
    {
        return a.a().hashCode();
    }
}
