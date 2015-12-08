// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DEREnumerated;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.CRLReason;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.Time;
import org.spongycastle.asn1.x509.X509Extension;
import org.spongycastle.x509.extension.X509ExtensionUtil;

public class X509CRLEntryObject extends X509CRLEntry
{

    private org.spongycastle.asn1.x509.TBSCertList.CRLEntry a;
    private X500Name b;
    private int c;
    private boolean d;

    public X509CRLEntryObject(org.spongycastle.asn1.x509.TBSCertList.CRLEntry crlentry, boolean flag, X500Name x500name)
    {
        a = crlentry;
        b = a(flag, x500name);
    }

    private Set a(boolean flag)
    {
        Extensions extensions = a.e();
        if (extensions != null)
        {
            HashSet hashset = new HashSet();
            Enumeration enumeration = extensions.c();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                if (flag == extensions.a(asn1objectidentifier).a())
                {
                    hashset.add(asn1objectidentifier.c());
                }
            } while (true);
            return hashset;
        } else
        {
            return null;
        }
    }

    private X500Name a(boolean flag, X500Name x500name)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        x500name = null;
_L4:
        return x500name;
_L2:
        byte abyte0[] = getExtensionValue(X509Extension.n.c());
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            x500name = GeneralNames.a(X509ExtensionUtil.a(abyte0)).c();
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
        if (x500name[i].c() != 4)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        x500name = X500Name.a(x500name[i].d());
        return x500name;
        for (i++; true;)
        {
            break MISSING_BLOCK_LABEL_37;
        }

        return null;
    }

    public X500Principal getCertificateIssuer()
    {
        if (b == null)
        {
            return null;
        }
        X500Principal x500principal;
        try
        {
            x500principal = new X500Principal(b.b());
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return x500principal;
    }

    public Set getCriticalExtensionOIDs()
    {
        return a(true);
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = a.a("DER");
        }
        catch (IOException ioexception)
        {
            throw new CRLException(ioexception.toString());
        }
        return abyte0;
    }

    public byte[] getExtensionValue(String s)
    {
        Extensions extensions = a.e();
        if (extensions != null)
        {
            s = extensions.a(new ASN1ObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.b().b();
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

    public Date getRevocationDate()
    {
        return a.d().d();
    }

    public BigInteger getSerialNumber()
    {
        return a.c().c();
    }

    public boolean hasExtensions()
    {
        return a.e() != null;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public int hashCode()
    {
        if (!d)
        {
            c = super.hashCode();
            d = true;
        }
        return c;
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
        extensions = a.e();
        if (extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration = extensions.c();
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
        Extension extension = extensions.a(asn1objectidentifier);
        if (extension.b() == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        asn1inputstream = new ASN1InputStream(extension.b().d());
        stringbuffer.append("                       critical(").append(extension.a()).append(") ");
        Exception exception;
        if (asn1objectidentifier.equals(X509Extension.i))
        {
            stringbuffer.append(CRLReason.a(DEREnumerated.a(asn1inputstream.b()))).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(X509Extension.n))
        {
            stringbuffer.append("Certificate issuer: ").append(GeneralNames.a(asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuffer.append(asn1objectidentifier.c());
            stringbuffer.append(" value = ").append(ASN1Dump.a(asn1inputstream.b())).append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            stringbuffer.append(asn1objectidentifier.c());
            stringbuffer.append(" value = *****").append(s);
        }
        continue; /* Loop/switch isn't completed */
        stringbuffer.append(s);
        if (true) goto _L4; else goto _L2
_L2:
        return stringbuffer.toString();
    }
}
