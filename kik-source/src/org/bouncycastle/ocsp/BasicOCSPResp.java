// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.security.cert.X509Extension;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.x509.X509Extensions;

public class BasicOCSPResp
    implements X509Extension
{

    BasicOCSPResponse a;
    ResponseData b;

    private Set a(boolean flag)
    {
        HashSet hashset = new HashSet();
        X509Extensions x509extensions = b.e();
        if (x509extensions != null)
        {
            Enumeration enumeration = x509extensions.e();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                if (flag == x509extensions.a(derobjectidentifier).a())
                {
                    hashset.add(derobjectidentifier.e());
                }
            } while (true);
        }
        return hashset;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof BasicOCSPResp))
        {
            return false;
        } else
        {
            obj = (BasicOCSPResp)obj;
            return a.equals(((BasicOCSPResp) (obj)).a);
        }
    }

    public Set getCriticalExtensionOIDs()
    {
        return a(true);
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = b.e();
        if (x509extensions != null)
        {
            s = x509extensions.a(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.b().a("DER");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new RuntimeException((new StringBuilder("error encoding ")).append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return a(false);
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
