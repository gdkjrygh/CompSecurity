// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

// Referenced classes of package org.bouncycastle.jce.provider:
//            X509SignatureUtil, ExtCRLException, X509CRLEntryObject, RFC3280CertPathUtilities, 
//            BouncyCastleProvider

public class X509CRLObject extends X509CRL
{

    private CertificateList c;
    private boolean isIndirect;
    private String sigAlgName;
    private byte sigAlgParams[];

    public X509CRLObject(CertificateList certificatelist)
        throws CRLException
    {
        c = certificatelist;
        sigAlgName = X509SignatureUtil.getSignatureName(certificatelist.getSignatureAlgorithm());
        if (certificatelist.getSignatureAlgorithm().getParameters() == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        sigAlgParams = certificatelist.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded("DER");
_L1:
        isIndirect = isIndirectCRL(this);
        return;
        try
        {
            sigAlgParams = null;
        }
        // Misplaced declaration of an exception variable
        catch (CertificateList certificatelist)
        {
            throw new CRLException((new StringBuilder()).append("CRL contents invalid: ").append(certificatelist).toString());
        }
          goto _L1
    }

    private Set getExtensionOIDs(boolean flag)
    {
        if (getVersion() == 2)
        {
            Extensions extensions = c.getTBSCertList().getExtensions();
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
            }
        }
        return null;
    }

    static boolean isIndirectCRL(X509CRL x509crl)
        throws CRLException
    {
        boolean flag;
        try
        {
            x509crl = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", x509crl);
        }
        if (x509crl == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        flag = IssuingDistributionPoint.getInstance(X509ExtensionUtil.fromExtensionValue(x509crl)).isIndirectCRL();
        if (flag)
        {
            return true;
        }
        return false;
    }

    private Set loadCRLEntries()
    {
        HashSet hashset = new HashSet();
        Enumeration enumeration = c.getRevokedCertificateEnumeration();
        X500Name x500name = null;
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            Object obj = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry)enumeration.nextElement();
            hashset.add(new X509CRLEntryObject(((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) (obj)), isIndirect, x500name));
            if (isIndirect && ((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).hasExtensions())
            {
                obj = ((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).getExtensions().getExtension(Extension.certificateIssuer);
                if (obj != null)
                {
                    x500name = X500Name.getInstance(GeneralNames.getInstance(((Extension) (obj)).getParsedValue()).getNames()[0].getName());
                }
            }
        } while (true);
        return hashset;
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
        Extensions extensions = c.getTBSCertList().getExtensions();
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
                    throw new IllegalStateException((new StringBuilder()).append("error parsing ").append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Principal getIssuerDN()
    {
        return new X509Principal(X500Name.getInstance(c.getIssuer().toASN1Primitive()));
    }

    public X500Principal getIssuerX500Principal()
    {
        X500Principal x500principal;
        try
        {
            x500principal = new X500Principal(c.getIssuer().getEncoded());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return x500principal;
    }

    public Date getNextUpdate()
    {
        if (c.getNextUpdate() != null)
        {
            return c.getNextUpdate().getDate();
        } else
        {
            return null;
        }
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return getExtensionOIDs(false);
    }

    public X509CRLEntry getRevokedCertificate(BigInteger biginteger)
    {
        Object obj1 = null;
        Enumeration enumeration = c.getRevokedCertificateEnumeration();
        X500Name x500name = null;
        do
        {
            Object obj;
label0:
            {
                obj = obj1;
                if (enumeration.hasMoreElements())
                {
                    obj = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry)enumeration.nextElement();
                    if (!biginteger.equals(((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).getUserCertificate().getValue()))
                    {
                        break label0;
                    }
                    obj = new X509CRLEntryObject(((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) (obj)), isIndirect, x500name);
                }
                return ((X509CRLEntry) (obj));
            }
            if (isIndirect && ((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).hasExtensions())
            {
                obj = ((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) (obj)).getExtensions().getExtension(Extension.certificateIssuer);
                if (obj != null)
                {
                    x500name = X500Name.getInstance(GeneralNames.getInstance(((Extension) (obj)).getParsedValue()).getNames()[0].getName());
                }
            }
        } while (true);
    }

    public Set getRevokedCertificates()
    {
        Set set = loadCRLEntries();
        if (!set.isEmpty())
        {
            return Collections.unmodifiableSet(set);
        } else
        {
            return null;
        }
    }

    public String getSigAlgName()
    {
        return sigAlgName;
    }

    public String getSigAlgOID()
    {
        return c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    public byte[] getSigAlgParams()
    {
        if (sigAlgParams != null)
        {
            byte abyte0[] = new byte[sigAlgParams.length];
            System.arraycopy(sigAlgParams, 0, abyte0, 0, abyte0.length);
            return abyte0;
        } else
        {
            return null;
        }
    }

    public byte[] getSignature()
    {
        return c.getSignature().getBytes();
    }

    public byte[] getTBSCertList()
        throws CRLException
    {
        byte abyte0[];
        try
        {
            abyte0 = c.getTBSCertList().getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new CRLException(ioexception.toString());
        }
        return abyte0;
    }

    public Date getThisUpdate()
    {
        return c.getThisUpdate().getDate();
    }

    public int getVersion()
    {
        return c.getVersionNumber();
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        if (set != null)
        {
            set.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
            set.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
            if (!set.isEmpty())
            {
                return true;
            }
        }
        return false;
    }

    public boolean isRevoked(Certificate certificate)
    {
        X500Name x500name1;
        org.bouncycastle.asn1.x509.TBSCertList.CRLEntry acrlentry[];
        if (!certificate.getType().equals("X.509"))
        {
            throw new RuntimeException("X.509 CRL used with non X.509 Cert");
        }
        acrlentry = c.getRevokedCertificates();
        x500name1 = c.getIssuer();
        if (acrlentry == null) goto _L2; else goto _L1
_L1:
        BigInteger biginteger;
        int i;
        biginteger = ((X509Certificate)certificate).getSerialNumber();
        i = 0;
_L8:
        if (i >= acrlentry.length) goto _L2; else goto _L3
_L3:
        X500Name x500name;
        x500name = x500name1;
        if (isIndirect)
        {
            x500name = x500name1;
            if (acrlentry[i].hasExtensions())
            {
                Extension extension = acrlentry[i].getExtensions().getExtension(Extension.certificateIssuer);
                x500name = x500name1;
                if (extension != null)
                {
                    x500name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                }
            }
        }
        if (!acrlentry[i].getUserCertificate().getValue().equals(biginteger)) goto _L5; else goto _L4
_L4:
        if (certificate instanceof X509Certificate)
        {
            certificate = X500Name.getInstance(((X509Certificate)certificate).getIssuerX500Principal().getEncoded());
        } else
        {
            try
            {
                certificate = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
            }
            // Misplaced declaration of an exception variable
            catch (Certificate certificate)
            {
                throw new RuntimeException("Cannot process certificate");
            }
        }
        if (x500name.equals(certificate)) goto _L6; else goto _L2
_L2:
        return false;
_L6:
        return true;
_L5:
        i++;
        x500name1 = x500name;
        if (true) goto _L8; else goto _L7
_L7:
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
        stringbuffer.append("            Signature: ").append(new String(Hex.encode(abyte0, 0, 20))).append(s);
        int i = 20;
        while (i < abyte0.length) 
        {
            if (i < abyte0.length - 20)
            {
                stringbuffer.append("                       ").append(new String(Hex.encode(abyte0, i, 20))).append(s);
            } else
            {
                stringbuffer.append("                       ").append(new String(Hex.encode(abyte0, i, abyte0.length - i))).append(s);
            }
            i += 20;
        }
        extensions = c.getTBSCertList().getExtensions();
        if (extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration;
        enumeration = extensions.oids();
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
        Extension extension = extensions.getExtension(asn1objectidentifier);
        if (extension.getExtnValue() == null)
        {
            break MISSING_BLOCK_LABEL_624;
        }
        asn1inputstream = new ASN1InputStream(extension.getExtnValue().getOctets());
        stringbuffer.append("                       critical(").append(extension.isCritical()).append(") ");
        Exception exception;
        if (asn1objectidentifier.equals(Extension.cRLNumber))
        {
            stringbuffer.append(new CRLNumber(DERInteger.getInstance(asn1inputstream.readObject()).getPositiveValue())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.deltaCRLIndicator))
        {
            stringbuffer.append((new StringBuilder()).append("Base CRL: ").append(new CRLNumber(DERInteger.getInstance(asn1inputstream.readObject()).getPositiveValue())).toString()).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.issuingDistributionPoint))
        {
            stringbuffer.append(IssuingDistributionPoint.getInstance(asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.cRLDistributionPoints))
        {
            stringbuffer.append(CRLDistPoint.getInstance(asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.freshestCRL))
        {
            stringbuffer.append(CRLDistPoint.getInstance(asn1inputstream.readObject())).append(s);
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
        throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException
    {
        verify(publickey, BouncyCastleProvider.PROVIDER_NAME);
    }

    public void verify(PublicKey publickey, String s)
        throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException
    {
        if (!c.getSignatureAlgorithm().equals(c.getTBSCertList().getSignature()))
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
