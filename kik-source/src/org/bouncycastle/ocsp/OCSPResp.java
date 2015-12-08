// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import org.bouncycastle.asn1.ocsp.OCSPResponse;

public class OCSPResp
{

    private OCSPResponse a;

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof OCSPResp))
        {
            return false;
        } else
        {
            obj = (OCSPResp)obj;
            return a.equals(((OCSPResp) (obj)).a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
