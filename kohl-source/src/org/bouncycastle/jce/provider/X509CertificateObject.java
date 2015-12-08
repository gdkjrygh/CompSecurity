// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.misc.NetscapeRevocationURL;
import org.bouncycastle.asn1.misc.VerisignCzagExtension;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.jce.provider:
//            X509SignatureUtil, BouncyCastleProvider, RFC3280CertPathUtilities

public class X509CertificateObject extends X509Certificate
    implements PKCS12BagAttributeCarrier
{

    private PKCS12BagAttributeCarrier attrCarrier;
    private BasicConstraints basicConstraints;
    private X509CertificateStructure c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean keyUsage[];

    public X509CertificateObject(X509CertificateStructure x509certificatestructure)
        throws CertificateParsingException
    {
        int i;
        int j;
        i = 9;
        super();
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        c = x509certificatestructure;
        DERBitString derbitstring;
        boolean aflag[];
        try
        {
            x509certificatestructure = getExtensionBytes("2.5.29.19");
        }
        // Misplaced declaration of an exception variable
        catch (X509CertificateStructure x509certificatestructure)
        {
            throw new CertificateParsingException((new StringBuilder()).append("cannot construct BasicConstraints: ").append(x509certificatestructure).toString());
        }
        if (x509certificatestructure == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        basicConstraints = BasicConstraints.getInstance(ASN1Primitive.fromByteArray(x509certificatestructure));
        try
        {
            x509certificatestructure = getExtensionBytes("2.5.29.15");
        }
        // Misplaced declaration of an exception variable
        catch (X509CertificateStructure x509certificatestructure)
        {
            throw new CertificateParsingException((new StringBuilder()).append("cannot construct KeyUsage: ").append(x509certificatestructure).toString());
        }
        if (x509certificatestructure == null) goto _L2; else goto _L1
_L1:
        derbitstring = DERBitString.getInstance(ASN1Primitive.fromByteArray(x509certificatestructure));
        x509certificatestructure = derbitstring.getBytes();
        j = x509certificatestructure.length * 8 - derbitstring.getPadBits();
        if (j >= 9)
        {
            i = j;
        }
        keyUsage = new boolean[i];
        i = 0;
_L4:
        if (i == j)
        {
            break; /* Loop/switch isn't completed */
        }
        aflag = keyUsage;
        boolean flag;
        if ((x509certificatestructure[i / 8] & 128 >>> i % 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aflag[i] = flag;
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        keyUsage = null;
_L3:
    }

    private int calculateHashCode()
    {
        byte abyte0[] = getEncoded();
        int i;
        int j;
        j = 1;
        i = 0;
_L2:
        int k;
        k = j;
        j = i;
        if (k >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        byte byte0 = abyte0[k];
        j = k + 1;
        i = byte0 * k + i;
        if (true) goto _L2; else goto _L1
        CertificateEncodingException certificateencodingexception;
        certificateencodingexception;
        j = 0;
_L1:
        return j;
    }

    private void checkSignature(PublicKey publickey, Signature signature)
        throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        if (!isAlgIdEqual(c.getSignatureAlgorithm(), c.getTBSCertificate().getSignature()))
        {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature, c.getSignatureAlgorithm().getParameters());
        signature.initVerify(publickey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature()))
        {
            throw new SignatureException("certificate does not verify with supplied key");
        } else
        {
            return;
        }
    }

    private byte[] getExtensionBytes(String s)
    {
        X509Extensions x509extensions = c.getTBSCertificate().getExtensions();
        if (x509extensions != null)
        {
            s = x509extensions.getExtension(new DERObjectIdentifier(s));
            if (s != null)
            {
                return s.getValue().getOctets();
            }
        }
        return null;
    }

    private boolean isAlgIdEqual(AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1)
    {
        if (algorithmidentifier.getObjectId().equals(algorithmidentifier1.getObjectId())) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (algorithmidentifier.getParameters() != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (algorithmidentifier1.getParameters() == null || algorithmidentifier1.getParameters().equals(DERNull.INSTANCE))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (algorithmidentifier1.getParameters() == null)
        {
            if (algorithmidentifier.getParameters() == null || algorithmidentifier.getParameters().equals(DERNull.INSTANCE))
            {
                return true;
            }
        } else
        {
            return algorithmidentifier.getParameters().equals(algorithmidentifier1.getParameters());
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void checkValidity()
        throws CertificateExpiredException, CertificateNotYetValidException
    {
        checkValidity(new Date());
    }

    public void checkValidity(Date date)
        throws CertificateExpiredException, CertificateNotYetValidException
    {
        if (date.getTime() > getNotAfter().getTime())
        {
            throw new CertificateExpiredException((new StringBuilder()).append("certificate expired on ").append(c.getEndDate().getTime()).toString());
        }
        if (date.getTime() < getNotBefore().getTime())
        {
            throw new CertificateNotYetValidException((new StringBuilder()).append("certificate not valid till ").append(c.getStartDate().getTime()).toString());
        } else
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        if (obj == this)
        {
            flag = true;
        } else
        if (obj instanceof Certificate)
        {
            obj = (Certificate)obj;
            boolean flag1;
            try
            {
                flag1 = Arrays.areEqual(getEncoded(), ((Certificate) (obj)).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag1;
        }
        return flag;
    }

    public ASN1Encodable getBagAttribute(DERObjectIdentifier derobjectidentifier)
    {
        return attrCarrier.getBagAttribute(derobjectidentifier);
    }

    public Enumeration getBagAttributeKeys()
    {
        return attrCarrier.getBagAttributeKeys();
    }

    public int getBasicConstraints()
    {
label0:
        {
            byte byte0 = -1;
            int i = byte0;
            if (basicConstraints != null)
            {
                i = byte0;
                if (basicConstraints.isCA())
                {
                    if (basicConstraints.getPathLenConstraint() != null)
                    {
                        break label0;
                    }
                    i = 0x7fffffff;
                }
            }
            return i;
        }
        return basicConstraints.getPathLenConstraint().intValue();
    }

    public Set getCriticalExtensionOIDs()
    {
        if (getVersion() == 3)
        {
            HashSet hashset = new HashSet();
            X509Extensions x509extensions = c.getTBSCertificate().getExtensions();
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
                    if (x509extensions.getExtension(derobjectidentifier).isCritical())
                    {
                        hashset.add(derobjectidentifier.getId());
                    }
                } while (true);
                return hashset;
            }
        }
        return null;
    }

    public byte[] getEncoded()
        throws CertificateEncodingException
    {
        byte abyte0[];
        try
        {
            abyte0 = c.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new CertificateEncodingException(ioexception.toString());
        }
        return abyte0;
    }

    public List getExtendedKeyUsage()
        throws CertificateParsingException
    {
        byte abyte0[] = getExtensionBytes("2.5.29.37");
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        Object obj;
        ArrayList arraylist;
        int i;
        try
        {
            obj = (ASN1Sequence)(new ASN1InputStream(abyte0)).readObject();
            arraylist = new ArrayList();
        }
        catch (Exception exception)
        {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
        i = 0;
        if (i == ((ASN1Sequence) (obj)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((DERObjectIdentifier)((ASN1Sequence) (obj)).getObjectAt(i)).getId());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        obj = Collections.unmodifiableList(arraylist);
        return ((List) (obj));
        return null;
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = c.getTBSCertificate().getExtensions();
        if (x509extensions != null)
        {
            s = x509extensions.getExtension(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.getValue().getEncoded();
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
        X509Principal x509principal;
        try
        {
            x509principal = new X509Principal(X500Name.getInstance(c.getIssuer().getEncoded()));
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return x509principal;
    }

    public boolean[] getIssuerUniqueID()
    {
        DERBitString derbitstring = c.getTBSCertificate().getIssuerUniqueId();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.getBytes();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.getPadBits()];
            int i = 0;
            while (i != aflag.length) 
            {
                boolean flag;
                if ((abyte0[i / 8] & 128 >>> i % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[i] = flag;
                i++;
            }
            return aflag;
        } else
        {
            return null;
        }
    }

    public X500Principal getIssuerX500Principal()
    {
        Object obj;
        try
        {
            obj = new ByteArrayOutputStream();
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).writeObject(c.getIssuer());
            obj = new X500Principal(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return ((X500Principal) (obj));
    }

    public boolean[] getKeyUsage()
    {
        return keyUsage;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        if (getVersion() == 3)
        {
            HashSet hashset = new HashSet();
            X509Extensions x509extensions = c.getTBSCertificate().getExtensions();
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
                    if (!x509extensions.getExtension(derobjectidentifier).isCritical())
                    {
                        hashset.add(derobjectidentifier.getId());
                    }
                } while (true);
                return hashset;
            }
        }
        return null;
    }

    public Date getNotAfter()
    {
        return c.getEndDate().getDate();
    }

    public Date getNotBefore()
    {
        return c.getStartDate().getDate();
    }

    public PublicKey getPublicKey()
    {
        PublicKey publickey;
        try
        {
            publickey = BouncyCastleProvider.getPublicKey(c.getSubjectPublicKeyInfo());
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return publickey;
    }

    public BigInteger getSerialNumber()
    {
        return c.getSerialNumber().getValue();
    }

    public String getSigAlgName()
    {
        Object obj = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (obj != null)
        {
            obj = ((Provider) (obj)).getProperty((new StringBuilder()).append("Alg.Alias.Signature.").append(getSigAlgOID()).toString());
            if (obj != null)
            {
                return ((String) (obj));
            }
        }
        Provider aprovider[] = Security.getProviders();
        for (int i = 0; i != aprovider.length; i++)
        {
            String s = aprovider[i].getProperty((new StringBuilder()).append("Alg.Alias.Signature.").append(getSigAlgOID()).toString());
            if (s != null)
            {
                return s;
            }
        }

        return getSigAlgOID();
    }

    public String getSigAlgOID()
    {
        return c.getSignatureAlgorithm().getObjectId().getId();
    }

    public byte[] getSigAlgParams()
    {
        byte abyte0[] = null;
        if (c.getSignatureAlgorithm().getParameters() != null)
        {
            try
            {
                abyte0 = c.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded("DER");
            }
            catch (IOException ioexception)
            {
                return null;
            }
        }
        return abyte0;
    }

    public byte[] getSignature()
    {
        return c.getSignature().getBytes();
    }

    public Principal getSubjectDN()
    {
        return new X509Principal(X500Name.getInstance(c.getSubject().toASN1Primitive()));
    }

    public boolean[] getSubjectUniqueID()
    {
        DERBitString derbitstring = c.getTBSCertificate().getSubjectUniqueId();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.getBytes();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.getPadBits()];
            int i = 0;
            while (i != aflag.length) 
            {
                boolean flag;
                if ((abyte0[i / 8] & 128 >>> i % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[i] = flag;
                i++;
            }
            return aflag;
        } else
        {
            return null;
        }
    }

    public X500Principal getSubjectX500Principal()
    {
        Object obj;
        try
        {
            obj = new ByteArrayOutputStream();
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).writeObject(c.getSubject());
            obj = new X500Principal(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return ((X500Principal) (obj));
    }

    public byte[] getTBSCertificate()
        throws CertificateEncodingException
    {
        byte abyte0[];
        try
        {
            abyte0 = c.getTBSCertificate().getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new CertificateEncodingException(ioexception.toString());
        }
        return abyte0;
    }

    public int getVersion()
    {
        return c.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension()
    {
label0:
        {
            if (getVersion() != 3)
            {
                break label0;
            }
            X509Extensions x509extensions = c.getTBSCertificate().getExtensions();
            if (x509extensions == null)
            {
                break label0;
            }
            Enumeration enumeration = x509extensions.oids();
            DERObjectIdentifier derobjectidentifier;
            String s;
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break label0;
                }
                derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                s = derobjectidentifier.getId();
            } while (s.equals(RFC3280CertPathUtilities.KEY_USAGE) || s.equals(RFC3280CertPathUtilities.CERTIFICATE_POLICIES) || s.equals(RFC3280CertPathUtilities.POLICY_MAPPINGS) || s.equals(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY) || s.equals(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS) || s.equals(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT) || s.equals(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR) || s.equals(RFC3280CertPathUtilities.POLICY_CONSTRAINTS) || s.equals(RFC3280CertPathUtilities.BASIC_CONSTRAINTS) || s.equals(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME) || s.equals(RFC3280CertPathUtilities.NAME_CONSTRAINTS) || !x509extensions.getExtension(derobjectidentifier).isCritical());
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (!hashValueSet)
        {
            hashValue = calculateHashCode();
            hashValueSet = true;
        }
        i = hashValue;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        String s;
        X509Extensions x509extensions;
        stringbuffer = new StringBuffer();
        s = System.getProperty("line.separator");
        stringbuffer.append("  [0]         Version: ").append(getVersion()).append(s);
        stringbuffer.append("         SerialNumber: ").append(getSerialNumber()).append(s);
        stringbuffer.append("             IssuerDN: ").append(getIssuerDN()).append(s);
        stringbuffer.append("           Start Date: ").append(getNotBefore()).append(s);
        stringbuffer.append("           Final Date: ").append(getNotAfter()).append(s);
        stringbuffer.append("            SubjectDN: ").append(getSubjectDN()).append(s);
        stringbuffer.append("           Public Key: ").append(getPublicKey()).append(s);
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
        x509extensions = c.getTBSCertificate().getExtensions();
        if (x509extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration;
        enumeration = x509extensions.oids();
        if (enumeration.hasMoreElements())
        {
            stringbuffer.append("       Extensions: \n");
        }
_L3:
        DERObjectIdentifier derobjectidentifier;
        ASN1InputStream asn1inputstream;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
        X509Extension x509extension = x509extensions.getExtension(derobjectidentifier);
        if (x509extension.getValue() == null)
        {
            break MISSING_BLOCK_LABEL_666;
        }
        asn1inputstream = new ASN1InputStream(x509extension.getValue().getOctets());
        stringbuffer.append("                       critical(").append(x509extension.isCritical()).append(") ");
        Exception exception;
        if (derobjectidentifier.equals(X509Extension.basicConstraints))
        {
            stringbuffer.append(BasicConstraints.getInstance(asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extension.keyUsage))
        {
            stringbuffer.append(new KeyUsage((DERBitString)asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.netscapeCertType))
        {
            stringbuffer.append(new NetscapeCertType((DERBitString)asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.netscapeRevocationURL))
        {
            stringbuffer.append(new NetscapeRevocationURL((DERIA5String)asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.verisignCzagExtension))
        {
            stringbuffer.append(new VerisignCzagExtension((DERIA5String)asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuffer.append(derobjectidentifier.getId());
            stringbuffer.append(" value = ").append(ASN1Dump.dumpAsString(asn1inputstream.readObject())).append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            stringbuffer.append(derobjectidentifier.getId());
            stringbuffer.append(" value = ").append("*****").append(s);
        }
        continue; /* Loop/switch isn't completed */
        stringbuffer.append(s);
        if (true) goto _L3; else goto _L2
_L2:
        return stringbuffer.toString();
    }

    public final void verify(PublicKey publickey)
        throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException
    {
        String s = X509SignatureUtil.getSignatureName(c.getSignatureAlgorithm());
        Signature signature;
        try
        {
            signature = Signature.getInstance(s, BouncyCastleProvider.PROVIDER_NAME);
        }
        catch (Exception exception)
        {
            exception = Signature.getInstance(s);
        }
        checkSignature(publickey, signature);
    }

    public final void verify(PublicKey publickey, String s)
        throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException
    {
        checkSignature(publickey, Signature.getInstance(X509SignatureUtil.getSignatureName(c.getSignatureAlgorithm()), s));
    }
}
