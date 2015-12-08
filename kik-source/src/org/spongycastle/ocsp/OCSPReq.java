// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.ocsp;

import java.security.cert.X509Extension;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ocsp.OCSPRequest;
import org.spongycastle.asn1.ocsp.TBSRequest;
import org.spongycastle.asn1.x509.X509Extensions;

public class OCSPReq
    implements X509Extension
{

    private OCSPRequest a;

    private Set a(boolean flag)
    {
        HashSet hashset = new HashSet();
        X509Extensions x509extensions = a();
        if (x509extensions != null)
        {
            Enumeration enumeration = x509extensions.c();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                if (flag == x509extensions.a(asn1objectidentifier).a())
                {
                    hashset.add(asn1objectidentifier.c());
                }
            } while (true);
        }
        return hashset;
    }

    private X509Extensions a()
    {
        return X509Extensions.a(a.c().c());
    }

    public Set getCriticalExtensionOIDs()
    {
        return a(true);
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = a();
        if (x509extensions != null)
        {
            s = x509extensions.a(new ASN1ObjectIdentifier(s));
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
}
