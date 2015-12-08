// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.CRLNumber;
import org.spongycastle.asn1.x509.CertificateList;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.IssuingDistributionPoint;
import org.spongycastle.asn1.x509.TBSCertList;
import org.spongycastle.asn1.x509.Time;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.util.encoders.Hex;
import org.spongycastle.x509.extension.X509ExtensionUtil;

// Referenced classes of package org.spongycastle.jce.provider:
//            g, d, X509CRLEntryObject, RFC3280CertPathUtilities, 
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
        b = g.a(certificatelist.f());
        if (certificatelist.f().e() == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        c = certificatelist.f().e().a().a("DER");
_L1:
        d = a(this);
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
            Extensions extensions = a.c().d();
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
            }
        }
        return null;
    }

    static boolean a(X509CRL x509crl)
    {
        boolean flag;
        try
        {
            x509crl = x509crl.getExtensionValue(Extension.m.c());
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new d("Exception reading IssuingDistributionPoint", x509crl);
        }
        if (x509crl == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        flag = IssuingDistributionPoint.a(X509ExtensionUtil.a(x509crl)).e();
        if (flag)
        {
            return true;
        }
        return false;
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
        Extensions extensions = a.c().d();
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
                    throw new IllegalStateException((new StringBuilder("error parsing ")).append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Principal getIssuerDN()
    {
        return new X509Principal(X500Name.a(a.i().a()));
    }

    public X500Principal getIssuerX500Principal()
    {
        X500Principal x500principal;
        try
        {
            x500principal = new X500Principal(a.i().b());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return x500principal;
    }

    public Date getNextUpdate()
    {
        if (a.k() != null)
        {
            return a.k().d();
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
        Object obj1 = null;
        Enumeration enumeration = a.e();
        X500Name x500name = null;
        do
        {
            Object obj;
label0:
            {
                obj = obj1;
                if (enumeration.hasMoreElements())
                {
                    obj = (org.spongycastle.asn1.x509.TBSCertList.CRLEntry)enumeration.nextElement();
                    if (!biginteger.equals(((org.spongycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).c().c()))
                    {
                        break label0;
                    }
                    obj = new X509CRLEntryObject(((org.spongycastle.asn1.x509.TBSCertList.CRLEntry) (obj)), d, x500name);
                }
                return ((X509CRLEntry) (obj));
            }
            if (d && ((org.spongycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).f())
            {
                obj = ((org.spongycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).e().a(Extension.n);
                if (obj != null)
                {
                    x500name = X500Name.a(GeneralNames.a(((Extension) (obj)).c()).c()[0].d());
                }
            }
        } while (true);
    }

    public Set getRevokedCertificates()
    {
        Object obj1 = null;
        HashSet hashset = new HashSet();
        Enumeration enumeration = a.e();
        Object obj = null;
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            Object obj2 = (org.spongycastle.asn1.x509.TBSCertList.CRLEntry)enumeration.nextElement();
            hashset.add(new X509CRLEntryObject(((org.spongycastle.asn1.x509.TBSCertList.CRLEntry) (obj2)), d, ((X500Name) (obj))));
            if (d && ((org.spongycastle.asn1.x509.TBSCertList.CRLEntry) (obj2)).f())
            {
                obj2 = ((org.spongycastle.asn1.x509.TBSCertList.CRLEntry) (obj2)).e().a(Extension.n);
                if (obj2 != null)
                {
                    obj = X500Name.a(GeneralNames.a(((Extension) (obj2)).c()).c()[0].d());
                }
            }
        } while (true);
        obj = obj1;
        if (!hashset.isEmpty())
        {
            obj = Collections.unmodifiableSet(hashset);
        }
        return ((Set) (obj));
    }

    public String getSigAlgName()
    {
        return b;
    }

    public String getSigAlgOID()
    {
        return a.f().d().c();
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
        return a.g().c();
    }

    public byte[] getTBSCertList()
    {
        byte abyte0[];
        try
        {
            abyte0 = a.c().a("DER");
        }
        catch (IOException ioexception)
        {
            throw new CRLException(ioexception.toString());
        }
        return abyte0;
    }

    public Date getThisUpdate()
    {
        return a.j().d();
    }

    public int getVersion()
    {
        return a.h();
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
        if (!certificate.getType().equals("X.509"))
        {
            throw new RuntimeException("X.509 CRL used with non X.509 Cert");
        }
        org.spongycastle.asn1.x509.TBSCertList.CRLEntry acrlentry[] = a.d();
        X500Name x500name1 = a.i();
        BigInteger biginteger = ((X509Certificate)certificate).getSerialNumber();
        int i = 0;
        do
        {
            X500Name x500name;
label0:
            {
label1:
                {
                    if (i < acrlentry.length)
                    {
                        x500name = x500name1;
                        if (d)
                        {
                            x500name = x500name1;
                            if (acrlentry[i].f())
                            {
                                Extension extension = acrlentry[i].e().a(Extension.n);
                                x500name = x500name1;
                                if (extension != null)
                                {
                                    x500name = X500Name.a(GeneralNames.a(extension.c()).c()[0].d());
                                }
                            }
                        }
                        if (!acrlentry[i].c().c().equals(biginteger))
                        {
                            break label0;
                        }
                        if (certificate instanceof X509Certificate)
                        {
                            certificate = X500Name.a(((X509Certificate)certificate).getIssuerX500Principal().getEncoded());
                        } else
                        {
                            try
                            {
                                certificate = org.spongycastle.asn1.x509.Certificate.a(certificate.getEncoded()).c();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Certificate certificate)
                            {
                                throw new RuntimeException("Cannot process certificate");
                            }
                        }
                        if (x500name.equals(certificate))
                        {
                            break label1;
                        }
                    }
                    return false;
                }
                return true;
            }
            i++;
            x500name1 = x500name;
        } while (true);
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        String s;
        Extensions extensions;
        stringbuffer = new StringBuffer();
        s = System.getProperty("line.separator");
        stringbuffer.append("              Version: ").append(getVersion()).append(s);
        stringbuffer.append("             IssuerDN: ").append(getIssuerDN()).append(s);
        stringbuffer.append("          This update: ").append(getThisUpdate()).append(s);
        stringbuffer.append("          Next update: ").append(getNextUpdate()).append(s);
        stringbuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(s);
        byte abyte0[] = getSignature();
        stringbuffer.append("            Signature: ").append(new String(Hex.a(abyte0, 0, 20))).append(s);
        int i = 20;
        while (i < abyte0.length) 
        {
            if (i < abyte0.length - 20)
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, i, 20))).append(s);
            } else
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, i, abyte0.length - i))).append(s);
            }
            i += 20;
        }
        extensions = a.c().d();
        if (extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration;
        enumeration = extensions.c();
        if (enumeration.hasMoreElements())
        {
            stringbuffer.append("           Extensions: ").append(s);
        }
_L3:
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
            break MISSING_BLOCK_LABEL_615;
        }
        asn1inputstream = new ASN1InputStream(extension.b().d());
        stringbuffer.append("                       critical(").append(extension.a()).append(") ");
        Exception exception;
        if (asn1objectidentifier.equals(Extension.h))
        {
            stringbuffer.append(new CRLNumber(DERInteger.a(asn1inputstream.b()).d())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.l))
        {
            stringbuffer.append((new StringBuilder("Base CRL: ")).append(new CRLNumber(DERInteger.a(asn1inputstream.b()).d())).toString()).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.m))
        {
            stringbuffer.append(IssuingDistributionPoint.a(asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.p))
        {
            stringbuffer.append(CRLDistPoint.a(asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.v))
        {
            stringbuffer.append(CRLDistPoint.a(asn1inputstream.b())).append(s);
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
        if (!a.f().equals(a.c().c()))
        {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        if (s != null)
        {
            s = Signature.getInstance(getSigAlgName(), s);
        } else
        {
            s = Signature.getInstance(getSigAlgName());
        }
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
