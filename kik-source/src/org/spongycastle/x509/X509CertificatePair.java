// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import java.security.cert.X509Certificate;
import org.spongycastle.asn1.x509.CertificatePair;
import org.spongycastle.jce.provider.X509CertificateObject;

public class X509CertificatePair
{

    private X509Certificate a;
    private X509Certificate b;

    public X509CertificatePair(CertificatePair certificatepair)
    {
        if (certificatepair.c() != null)
        {
            a = new X509CertificateObject(certificatepair.c());
        }
        if (certificatepair.d() != null)
        {
            b = new X509CertificateObject(certificatepair.d());
        }
    }

    public final X509Certificate a()
    {
        return a;
    }

    public final X509Certificate b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof X509CertificatePair))
        {
            obj = (X509CertificatePair)obj;
            boolean flag;
            boolean flag1;
            if (a != null)
            {
                flag = a.equals(((X509CertificatePair) (obj)).a);
            } else
            if (((X509CertificatePair) (obj)).a != null)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (b != null)
            {
                flag1 = b.equals(((X509CertificatePair) (obj)).b);
            } else
            if (((X509CertificatePair) (obj)).b != null)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            if (flag && flag1)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int i = -1;
        if (a != null)
        {
            i = ~a.hashCode();
        }
        int j = i;
        if (b != null)
        {
            j = i * 17 ^ b.hashCode();
        }
        return j;
    }
}
