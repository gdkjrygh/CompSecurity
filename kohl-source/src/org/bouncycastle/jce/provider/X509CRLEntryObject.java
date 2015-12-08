// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

public class X509CRLEntryObject extends X509CRLEntry
{

    private org.bouncycastle.asn1.x509.TBSCertList.CRLEntry c;
    private X500Name certificateIssuer;
    private int hashValue;
    private boolean isHashValueSet;

    public X509CRLEntryObject(org.bouncycastle.asn1.x509.TBSCertList.CRLEntry crlentry)
    {
        c = crlentry;
        certificateIssuer = null;
    }

    public X509CRLEntryObject(org.bouncycastle.asn1.x509.TBSCertList.CRLEntry crlentry, boolean flag, X500Name x500name)
    {
        c = crlentry;
        certificateIssuer = loadCertificateIssuer(flag, x500name);
    }

    private Set getExtensionOIDs(boolean flag)
    {
        Extensions extensions = c.getExtensions();
        if (extensions != null)
        {
            HashSet hashset = new HashSet();
            Enumeration enumeration = extensions.oids();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                if (flag == extensions.getExtension(asn1objectidentifier).isCritical())
                {
                    hashset.add(asn1objectidentifier.getId());
                }
            } while (true);
            return hashset;
        } else
        {
            return null;
        }
    }

    private X500Name loadCertificateIssuer(boolean flag, X500Name x500name)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        x500name = null;
_L4:
        return x500name;
_L2:
        byte abyte0[] = getExtensionValue(X509Extension.certificateIssuer.getId());
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            x500name = GeneralNames.getInstance(X509ExtensionUtil.fromExtensionValue(abyte0)).getNames();
        }
        // Misplaced declaration of an exception variable
        catch (X500Name x500name)
        {
            return null;
        }
        i = 0;
        if (i >= x500name.length)
        {
            break;
        }
        if (x500name[i].getTagNo() != 4)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        x500name = X500Name.getInstance(x500name[i].getName());
        return x500name;
        for (i++; true;)
        {
            break MISSING_BLOCK_LABEL_37;
        }

        return null;
    }

    public X500Principal getCertificateIssuer()
    {
        if (certificateIssuer == null)
        {
            return null;
        }
        X500Principal x500principal;
        try
        {
            x500principal = new X500Principal(certificateIssuer.getEncoded());
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return x500principal;
    }

    public Set getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public byte[] getEncoded()
        throws CRLException
    {
        byte abyte0[];
        try
        {
            abyte0 = c.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new CRLException(ioexception.toString());
        }
        return abyte0;
    }

    public byte[] getExtensionValue(String s)
    {
        Extensions extensions = c.getExtensions();
        if (extensions != null)
        {
            s = extensions.getExtension(new ASN1ObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.getExtnValue().getEncoded();
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

    public Set getNonCriticalExtensionOIDs()
    {
        return getExtensionOIDs(false);
    }

    public Date getRevocationDate()
    {
        return c.getRevocationDate().getDate();
    }

    public BigInteger getSerialNumber()
    {
        return c.getUserCertificate().getValue();
    }

    public boolean hasExtensions()
    {
        return c.getExtensions() != null;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public int hashCode()
    {
        if (!isHashValueSet)
        {
            hashValue = super.hashCode();
            isHashValueSet = true;
        }
        return hashValue;
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        String s;
        Extensions extensions;
        stringbuffer = new StringBuffer();
        s = System.getProperty("line.separator");
        stringbuffer.append("      userCertificate: ").append(getSerialNumber()).append(s);
        stringbuffer.append("       revocationDate: ").append(getRevocationDate()).append(s);
        stringbuffer.append("       certificateIssuer: ").append(getCertificateIssuer()).append(s);
        extensions = c.getExtensions();
        if (extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration = extensions.oids();
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L3
_L3:
        stringbuffer.append("   crlEntryExtensions:").append(s);
_L4:
        ASN1ObjectIdentifier asn1objectidentifier;
        ASN1InputStream asn1inputstream;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
        Extension extension = extensions.getExtension(asn1objectidentifier);
        if (extension.getExtnValue() == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        asn1inputstream = new ASN1InputStream(extension.getExtnValue().getOctets());
        stringbuffer.append("                       critical(").append(extension.isCritical()).append(") ");
        Exception exception;
        if (asn1objectidentifier.equals(X509Extension.reasonCode))
        {
            stringbuffer.append(CRLReason.getInstance(DEREnumerated.getInstance(asn1inputstream.readObject()))).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(X509Extension.certificateIssuer))
        {
            stringbuffer.append("Certificate issuer: ").append(GeneralNames.getInstance(asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuffer.append(asn1objectidentifier.getId());
            stringbuffer.append(" value = ").append(ASN1Dump.dumpAsString(asn1inputstream.readObject())).append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            stringbuffer.append(asn1objectidentifier.getId());
            stringbuffer.append(" value = ").append("*****").append(s);
        }
        continue; /* Loop/switch isn't completed */
        stringbuffer.append(s);
        if (true) goto _L4; else goto _L2
_L2:
        return stringbuffer.toString();
    }
}
