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
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

public class X509CRLEntryObject extends X509CRLEntry
{

    private org.bouncycastle.asn1.x509.TBSCertList.CRLEntry a;
    private boolean b;
    private X500Principal c;
    private X500Principal d;
    private int e;
    private boolean f;

    public X509CRLEntryObject(org.bouncycastle.asn1.x509.TBSCertList.CRLEntry crlentry, boolean flag, X500Principal x500principal)
    {
        a = crlentry;
        b = flag;
        c = x500principal;
        d = a();
    }

    private Set a(boolean flag)
    {
        X509Extensions x509extensions = a.g();
        if (x509extensions != null)
        {
            HashSet hashset = new HashSet();
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
            return hashset;
        } else
        {
            return null;
        }
    }

    private X500Principal a()
    {
        if (b) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object aobj[] = getExtensionValue(X509Extensions.n.e());
        if (aobj == null)
        {
            return c;
        }
        X500Principal x500principal;
        int i;
        try
        {
            aobj = GeneralNames.a(X509ExtensionUtil.a(((byte []) (aobj)))).e();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        i = 0;
        if (i >= aobj.length)
        {
            continue;
        }
        if (aobj[i].e() != 4)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        x500principal = new X500Principal(aobj[i].f().c().b());
        return x500principal;
label0:
        {
            for (i++; true;)
            {
                break MISSING_BLOCK_LABEL_42;
            }

            break label0;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public X500Principal getCertificateIssuer()
    {
        return d;
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
        X509Extensions x509extensions = a.g();
        if (x509extensions != null)
        {
            s = x509extensions.a(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.b().a();
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
        return a.f().f();
    }

    public BigInteger getSerialNumber()
    {
        return a.e().e();
    }

    public boolean hasExtensions()
    {
        return a.g() != null;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public int hashCode()
    {
        if (!f)
        {
            e = super.hashCode();
            f = true;
        }
        return e;
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        String s;
        X509Extensions x509extensions;
        stringbuffer = new StringBuffer();
        s = System.getProperty("line.separator");
        stringbuffer.append("      userCertificate: ").append(getSerialNumber()).append(s);
        stringbuffer.append("       revocationDate: ").append(getRevocationDate()).append(s);
        stringbuffer.append("       certificateIssuer: ").append(getCertificateIssuer()).append(s);
        x509extensions = a.g();
        if (x509extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration = x509extensions.e();
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L3
_L3:
        stringbuffer.append("   crlEntryExtensions:").append(s);
_L4:
        DERObjectIdentifier derobjectidentifier;
        ASN1InputStream asn1inputstream;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
        X509Extension x509extension = x509extensions.a(derobjectidentifier);
        if (x509extension.b() == null)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        asn1inputstream = new ASN1InputStream(x509extension.b().f());
        stringbuffer.append("                       critical(").append(x509extension.a()).append(") ");
        Exception exception;
        if (derobjectidentifier.equals(X509Extensions.i))
        {
            stringbuffer.append(new CRLReason(DEREnumerated.a(asn1inputstream.a()))).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extensions.n))
        {
            stringbuffer.append("Certificate issuer: ").append(new GeneralNames((ASN1Sequence)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuffer.append(derobjectidentifier.e());
            stringbuffer.append(" value = ").append(ASN1Dump.a(asn1inputstream.a())).append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            stringbuffer.append(derobjectidentifier.e());
            stringbuffer.append(" value = *****").append(s);
        }
        continue; /* Loop/switch isn't completed */
        stringbuffer.append(s);
        if (true) goto _L4; else goto _L2
_L2:
        return stringbuffer.toString();
    }
}
