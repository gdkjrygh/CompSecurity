// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.security.cert.X509Extension;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.ocsp.CertStatus;
import org.bouncycastle.asn1.ocsp.RevokedInfo;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            CertificateID, RevokedStatus, UnknownStatus

public class SingleResp
    implements X509Extension
{

    SingleResponse resp;

    public SingleResp(SingleResponse singleresponse)
    {
        resp = singleresponse;
    }

    private Set getExtensionOIDs(boolean flag)
    {
        HashSet hashset = new HashSet();
        X509Extensions x509extensions = getSingleExtensions();
        if (x509extensions != null)
        {
            Enumeration enumeration = x509extensions.oids();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                if (flag == x509extensions.getExtension(derobjectidentifier).isCritical())
                {
                    hashset.add(derobjectidentifier.getId());
                }
            } while (true);
        }
        return hashset;
    }

    public CertificateID getCertID()
    {
        return new CertificateID(resp.getCertID());
    }

    public Object getCertStatus()
    {
        CertStatus certstatus = resp.getCertStatus();
        if (certstatus.getTagNo() == 0)
        {
            return null;
        }
        if (certstatus.getTagNo() == 1)
        {
            return new RevokedStatus(RevokedInfo.getInstance(certstatus.getStatus()));
        } else
        {
            return new UnknownStatus();
        }
    }

    public Set getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = getSingleExtensions();
        if (x509extensions != null)
        {
            s = x509extensions.getExtension(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.getValue().getEncoded("DER");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new RuntimeException((new StringBuilder()).append("error encoding ").append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Date getNextUpdate()
    {
        if (resp.getNextUpdate() == null)
        {
            return null;
        }
        Date date;
        try
        {
            date = resp.getNextUpdate().getDate();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("ParseException: ").append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return getExtensionOIDs(false);
    }

    public X509Extensions getSingleExtensions()
    {
        return X509Extensions.getInstance(resp.getSingleExtensions());
    }

    public Date getThisUpdate()
    {
        Date date;
        try
        {
            date = resp.getThisUpdate().getDate();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("ParseException: ").append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }
}
