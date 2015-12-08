// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.ocsp.CertID;

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
            return a.c().equals(((CertificateID) (obj)).a.c());
        }
    }

    public int hashCode()
    {
        return a.c().hashCode();
    }
}
