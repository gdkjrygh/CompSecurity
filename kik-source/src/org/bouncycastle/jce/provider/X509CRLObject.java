// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

// Referenced classes of package org.bouncycastle.jce.provider:
//            i, c, X509CRLEntryObject, RFC3280CertPathUtilities, 
//            BouncyCastleProvider

public class X509CRLObject extends X509CRL
{

    private CertificateList a;
    private String b;
    private byte c[];
    private boolean d;

    public X509CRLObject(CertificateList certificatelist)
    {
        a = certificatelist;
        b = i.a(certificatelist.h());
        if (certificatelist.h().g() == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        c = ((ASN1Encodable)certificatelist.h().g()).b();
_L1:
        d = a();
        return;
        try
        {
            c = null;
        }
        // Misplaced declaration of an exception variable
        catch (CertificateList certificatelist)
        {
            throw new CRLException((new StringBuilder("CRL contents invalid: ")).append(certificatelist).toString());
        }
          goto _L1
    }

    private Set a(boolean flag)
    {
        if (getVersion() == 2)
        {
            X509Extensions x509extensions = a.e().f();
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
            }
        }
        return null;
    }

    private boolean a()
    {
        byte abyte0[] = getExtensionValue(X509Extensions.m.e());
        boolean flag = false;
        if (abyte0 != null)
        {
            try
            {
                flag = IssuingDistributionPoint.a(X509ExtensionUtil.a(abyte0)).g();
            }
            catch (Exception exception)
            {
                throw new c("Exception reading IssuingDistributionPoint", exception);
            }
        }
        return flag;
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
        X509Extensions x509extensions = a.e().f();
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
                    throw new IllegalStateException((new StringBuilder("error parsing ")).append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Principal getIssuerDN()
    {
        return new X509Principal(a.k());
    }

    public X500Principal getIssuerX500Principal()
    {
        Object obj;
        try
        {
            obj = new ByteArrayOutputStream();
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).a(a.k());
            obj = new X500Principal(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return ((X500Principal) (obj));
    }

    public Date getNextUpdate()
    {
        if (a.m() != null)
        {
            return a.m().f();
        } else
        {
            return null;
        }
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return a(false);
    }

    public X509CRLEntry getRevokedCertificate(BigInteger biginteger)
    {
        Enumeration enumeration = a.g();
        for (Object obj = getIssuerX500Principal(); enumeration.hasMoreElements(); obj = ((X509CRLEntryObject) (obj)).getCertificateIssuer())
        {
            org.bouncycastle.asn1.x509.TBSCertList.CRLEntry crlentry = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry)enumeration.nextElement();
            obj = new X509CRLEntryObject(crlentry, d, ((X500Principal) (obj)));
            if (biginteger.equals(crlentry.e().e()))
            {
                return ((X509CRLEntry) (obj));
            }
        }

        return null;
    }

    public Set getRevokedCertificates()
    {
        HashSet hashset = new HashSet();
        Enumeration enumeration = a.g();
        for (Object obj = getIssuerX500Principal(); enumeration.hasMoreElements(); obj = ((X509CRLEntryObject) (obj)).getCertificateIssuer())
        {
            obj = new X509CRLEntryObject((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry)enumeration.nextElement(), d, ((X500Principal) (obj)));
            hashset.add(obj);
        }

        if (!hashset.isEmpty())
        {
            return Collections.unmodifiableSet(hashset);
        } else
        {
            return null;
        }
    }

    public String getSigAlgName()
    {
        return b;
    }

    public String getSigAlgOID()
    {
        return a.h().e().e();
    }

    public byte[] getSigAlgParams()
    {
        if (c != null)
        {
            byte abyte0[] = new byte[c.length];
            System.arraycopy(c, 0, abyte0, 0, abyte0.length);
            return abyte0;
        } else
        {
            return null;
        }
    }

    public byte[] getSignature()
    {
        return a.i().e();
    }

    public byte[] getTBSCertList()
    {
        byte abyte0[];
        try
        {
            abyte0 = a.e().a("DER");
        }
        catch (IOException ioexception)
        {
            throw new CRLException(ioexception.toString());
        }
        return abyte0;
    }

    public Date getThisUpdate()
    {
        return a.l().f();
    }

    public int getVersion()
    {
        return a.j();
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        if (set != null)
        {
            set.remove(RFC3280CertPathUtilities.d);
            set.remove(RFC3280CertPathUtilities.f);
            if (!set.isEmpty())
            {
                return true;
            }
        }
        return false;
    }

    public boolean isRevoked(Certificate certificate)
    {
        boolean flag1 = false;
        if (!certificate.getType().equals("X.509"))
        {
            throw new RuntimeException("X.509 CRL used with non X.509 Cert");
        }
        org.bouncycastle.asn1.x509.TBSCertList.CRLEntry acrlentry[] = a.f();
        certificate = ((X509Certificate)certificate).getSerialNumber();
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < acrlentry.length)
                {
                    if (!acrlentry[j].e().e().equals(certificate))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        String s;
        X509Extensions x509extensions;
        stringbuffer = new StringBuffer();
        s = System.getProperty("line.separator");
        stringbuffer.append("              Version: ").append(getVersion()).append(s);
        stringbuffer.append("             IssuerDN: ").append(getIssuerDN()).append(s);
        stringbuffer.append("          This update: ").append(getThisUpdate()).append(s);
        stringbuffer.append("          Next update: ").append(getNextUpdate()).append(s);
        stringbuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(s);
        byte abyte0[] = getSignature();
        stringbuffer.append("            Signature: ").append(new String(Hex.a(abyte0, 0, 20))).append(s);
        int j = 20;
        while (j < abyte0.length) 
        {
            if (j < abyte0.length - 20)
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, j, 20))).append(s);
            } else
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, j, abyte0.length - j))).append(s);
            }
            j += 20;
        }
        x509extensions = a.e().f();
        if (x509extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration;
        enumeration = x509extensions.e();
        if (enumeration.hasMoreElements())
        {
            stringbuffer.append("           Extensions: ").append(s);
        }
_L3:
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
            break MISSING_BLOCK_LABEL_636;
        }
        asn1inputstream = new ASN1InputStream(x509extension.b().f());
        stringbuffer.append("                       critical(").append(x509extension.a()).append(") ");
        Exception exception;
        if (derobjectidentifier.equals(X509Extensions.h))
        {
            stringbuffer.append(new CRLNumber(DERInteger.a(asn1inputstream.a()).f())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extensions.l))
        {
            stringbuffer.append((new StringBuilder("Base CRL: ")).append(new CRLNumber(DERInteger.a(asn1inputstream.a()).f())).toString()).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extensions.m))
        {
            stringbuffer.append(new IssuingDistributionPoint((ASN1Sequence)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extensions.p))
        {
            stringbuffer.append(new CRLDistPoint((ASN1Sequence)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extensions.v))
        {
            stringbuffer.append(new CRLDistPoint((ASN1Sequence)asn1inputstream.a())).append(s);
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
        if (true) goto _L3; else goto _L2
_L2:
        Object obj = getRevokedCertificates();
        if (obj != null)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuffer.append(s))
            {
                stringbuffer.append(((Iterator) (obj)).next());
            }

        }
        return stringbuffer.toString();
    }

    public void verify(PublicKey publickey)
    {
        verify(publickey, BouncyCastleProvider.a);
    }

    public void verify(PublicKey publickey, String s)
    {
        if (!a.h().equals(a.e().e()))
        {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        s = Signature.getInstance(getSigAlgName(), s);
        s.initVerify(publickey);
        s.update(getTBSCertList());
        if (!s.verify(getSignature()))
        {
            throw new SignatureException("CRL does not verify with supplied public key.");
        } else
        {
            return;
        }
    }
}
