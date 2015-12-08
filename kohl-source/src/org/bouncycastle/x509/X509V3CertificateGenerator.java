// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.X509CertificateObject;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

// Referenced classes of package org.bouncycastle.x509:
//            X509Util, ExtCertificateEncodingException

public class X509V3CertificateGenerator
{

    private X509ExtensionsGenerator extGenerator;
    private AlgorithmIdentifier sigAlgId;
    private DERObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private V3TBSCertificateGenerator tbsGen;

    public X509V3CertificateGenerator()
    {
        tbsGen = new V3TBSCertificateGenerator();
        extGenerator = new X509ExtensionsGenerator();
    }

    private DERBitString booleanToBitString(boolean aflag[])
    {
        byte abyte0[] = new byte[(aflag.length + 7) / 8];
        int i = 0;
        while (i != aflag.length) 
        {
            int k = i / 8;
            byte byte0 = abyte0[k];
            int j;
            if (aflag[i])
            {
                j = 1 << 7 - i % 8;
            } else
            {
                j = 0;
            }
            abyte0[k] = (byte)(j | byte0);
            i++;
        }
        i = aflag.length % 8;
        if (i == 0)
        {
            return new DERBitString(abyte0);
        } else
        {
            return new DERBitString(abyte0, 8 - i);
        }
    }

    private X509Certificate generateJcaObject(TBSCertificate tbscertificate, byte abyte0[])
        throws CertificateParsingException
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(tbscertificate);
        asn1encodablevector.add(sigAlgId);
        asn1encodablevector.add(new DERBitString(abyte0));
        return new X509CertificateObject(new X509CertificateStructure(new DERSequence(asn1encodablevector)));
    }

    private TBSCertificate generateTbsCert()
    {
        if (!extGenerator.isEmpty())
        {
            tbsGen.setExtensions(extGenerator.generate());
        }
        return tbsGen.generateTBSCertificate();
    }

    public void addExtension(String s, boolean flag, ASN1Encodable asn1encodable)
    {
        addExtension(new DERObjectIdentifier(s), flag, asn1encodable);
    }

    public void addExtension(String s, boolean flag, byte abyte0[])
    {
        addExtension(new DERObjectIdentifier(s), flag, abyte0);
    }

    public void addExtension(DERObjectIdentifier derobjectidentifier, boolean flag, ASN1Encodable asn1encodable)
    {
        extGenerator.addExtension(new ASN1ObjectIdentifier(derobjectidentifier.getId()), flag, asn1encodable);
    }

    public void addExtension(DERObjectIdentifier derobjectidentifier, boolean flag, byte abyte0[])
    {
        extGenerator.addExtension(new ASN1ObjectIdentifier(derobjectidentifier.getId()), flag, abyte0);
    }

    public void copyAndAddExtension(String s, boolean flag, X509Certificate x509certificate)
        throws CertificateParsingException
    {
        x509certificate = x509certificate.getExtensionValue(s);
        if (x509certificate == null)
        {
            throw new CertificateParsingException((new StringBuilder()).append("extension ").append(s).append(" not present").toString());
        }
        try
        {
            addExtension(s, flag, X509ExtensionUtil.fromExtensionValue(x509certificate));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new CertificateParsingException(s.toString());
        }
    }

    public void copyAndAddExtension(DERObjectIdentifier derobjectidentifier, boolean flag, X509Certificate x509certificate)
        throws CertificateParsingException
    {
        copyAndAddExtension(derobjectidentifier.getId(), flag, x509certificate);
    }

    public X509Certificate generate(PrivateKey privatekey)
        throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        return generate(privatekey, (SecureRandom)null);
    }

    public X509Certificate generate(PrivateKey privatekey, String s)
        throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        return generate(privatekey, s, null);
    }

    public X509Certificate generate(PrivateKey privatekey, String s, SecureRandom securerandom)
        throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        TBSCertificate tbscertificate = generateTbsCert();
        try
        {
            privatekey = X509Util.calculateSignature(sigOID, signatureAlgorithm, s, privatekey, securerandom, tbscertificate);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", privatekey);
        }
        try
        {
            privatekey = generateJcaObject(tbscertificate, privatekey);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new ExtCertificateEncodingException("exception producing certificate object", privatekey);
        }
        return privatekey;
    }

    public X509Certificate generate(PrivateKey privatekey, SecureRandom securerandom)
        throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        TBSCertificate tbscertificate = generateTbsCert();
        try
        {
            privatekey = X509Util.calculateSignature(sigOID, signatureAlgorithm, privatekey, securerandom, tbscertificate);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", privatekey);
        }
        try
        {
            privatekey = generateJcaObject(tbscertificate, privatekey);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new ExtCertificateEncodingException("exception producing certificate object", privatekey);
        }
        return privatekey;
    }

    public X509Certificate generateX509Certificate(PrivateKey privatekey)
        throws SecurityException, SignatureException, InvalidKeyException
    {
        try
        {
            privatekey = generateX509Certificate(privatekey, "BC", null);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new SecurityException("BC provider not installed!");
        }
        return privatekey;
    }

    public X509Certificate generateX509Certificate(PrivateKey privatekey, String s)
        throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException
    {
        return generateX509Certificate(privatekey, s, null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privatekey, String s, SecureRandom securerandom)
        throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException
    {
        try
        {
            privatekey = generate(privatekey, s, securerandom);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new SecurityException((new StringBuilder()).append("exception: ").append(privatekey).toString());
        }
        return privatekey;
    }

    public X509Certificate generateX509Certificate(PrivateKey privatekey, SecureRandom securerandom)
        throws SecurityException, SignatureException, InvalidKeyException
    {
        try
        {
            privatekey = generateX509Certificate(privatekey, "BC", securerandom);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new SecurityException("BC provider not installed!");
        }
        return privatekey;
    }

    public Iterator getSignatureAlgNames()
    {
        return X509Util.getAlgNames();
    }

    public void reset()
    {
        tbsGen = new V3TBSCertificateGenerator();
        extGenerator.reset();
    }

    public void setIssuerDN(X500Principal x500principal)
    {
        try
        {
            tbsGen.setIssuer(new X509Principal(x500principal.getEncoded()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (X500Principal x500principal)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("can't process principal: ").append(x500principal).toString());
        }
    }

    public void setIssuerDN(X509Name x509name)
    {
        tbsGen.setIssuer(x509name);
    }

    public void setIssuerUniqueID(boolean aflag[])
    {
        tbsGen.setIssuerUniqueID(booleanToBitString(aflag));
    }

    public void setNotAfter(Date date)
    {
        tbsGen.setEndDate(new Time(date));
    }

    public void setNotBefore(Date date)
    {
        tbsGen.setStartDate(new Time(date));
    }

    public void setPublicKey(PublicKey publickey)
        throws IllegalArgumentException
    {
        try
        {
            tbsGen.setSubjectPublicKeyInfo(SubjectPublicKeyInfo.getInstance((new ASN1InputStream(publickey.getEncoded())).readObject()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unable to process key - ").append(publickey.toString()).toString());
        }
    }

    public void setSerialNumber(BigInteger biginteger)
    {
        if (biginteger.compareTo(BigInteger.ZERO) <= 0)
        {
            throw new IllegalArgumentException("serial number must be a positive integer");
        } else
        {
            tbsGen.setSerialNumber(new ASN1Integer(biginteger));
            return;
        }
    }

    public void setSignatureAlgorithm(String s)
    {
        signatureAlgorithm = s;
        try
        {
            sigOID = X509Util.getAlgorithmOID(s);
        }
        catch (Exception exception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown signature type requested: ").append(s).toString());
        }
        sigAlgId = X509Util.getSigAlgID(sigOID, s);
        tbsGen.setSignature(sigAlgId);
    }

    public void setSubjectDN(X500Principal x500principal)
    {
        try
        {
            tbsGen.setSubject(new X509Principal(x500principal.getEncoded()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (X500Principal x500principal)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("can't process principal: ").append(x500principal).toString());
        }
    }

    public void setSubjectDN(X509Name x509name)
    {
        tbsGen.setSubject(x509name);
    }

    public void setSubjectUniqueID(boolean aflag[])
    {
        tbsGen.setSubjectUniqueID(booleanToBitString(aflag));
    }
}
