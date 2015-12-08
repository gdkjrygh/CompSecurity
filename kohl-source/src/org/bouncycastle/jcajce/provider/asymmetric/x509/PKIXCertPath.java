// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

public class PKIXCertPath extends CertPath
{

    static final List certPathEncodings;
    private List certificates;

    PKIXCertPath(InputStream inputstream, String s)
        throws CertificateException
    {
        super("X.509");
        if (!s.equalsIgnoreCase("PkiPath"))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        inputstream = (new ASN1InputStream(inputstream)).readObject();
        if (!(inputstream instanceof ASN1Sequence))
        {
            throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
        }
        try
        {
            inputstream = ((ASN1Sequence)inputstream).getObjects();
            certificates = new ArrayList();
            s = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
            byte abyte0[];
            for (; inputstream.hasMoreElements(); certificates.add(0, s.generateCertificate(new ByteArrayInputStream(abyte0))))
            {
                abyte0 = ((ASN1Encodable)inputstream.nextElement()).toASN1Primitive().getEncoded("DER");
            }

        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new CertificateException((new StringBuilder()).append("IOException throw while decoding CertPath:\n").append(inputstream.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new CertificateException((new StringBuilder()).append("BouncyCastle provider not found while trying to get a CertificateFactory:\n").append(inputstream.toString()).toString());
        }
        break MISSING_BLOCK_LABEL_286;
        if (!s.equalsIgnoreCase("PKCS7") && !s.equalsIgnoreCase("PEM"))
        {
            break MISSING_BLOCK_LABEL_259;
        }
        inputstream = new BufferedInputStream(inputstream);
        certificates = new ArrayList();
        s = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
_L1:
        java.security.cert.Certificate certificate = s.generateCertificate(inputstream);
        if (certificate == null)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        certificates.add(certificate);
          goto _L1
        throw new CertificateException((new StringBuilder()).append("unsupported encoding: ").append(s).toString());
        certificates = sortCerts(certificates);
        return;
    }

    PKIXCertPath(List list)
    {
        super("X.509");
        certificates = sortCerts(new ArrayList(list));
    }

    private List sortCerts(List list)
    {
        if (list.size() >= 2) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        X500Principal x500principal = ((X509Certificate)list.get(0)).getIssuerX500Principal();
        int i = 1;
        do
        {
            if (i == list.size())
            {
                break MISSING_BLOCK_LABEL_367;
            }
            if (!x500principal.equals(((X509Certificate)list.get(i)).getSubjectX500Principal()))
            {
                break;
            }
            x500principal = ((X509Certificate)list.get(i)).getIssuerX500Principal();
            i++;
        } while (true);
        ArrayList arraylist;
        ArrayList arraylist1;
        Object obj;
        Object obj1;
        int k;
        for (int j = 0; j != 0; j = 1)
        {
            continue; /* Loop/switch isn't completed */
        }

        arraylist = new ArrayList(list.size());
        arraylist1 = new ArrayList(list);
        j = 0;
        if (j >= list.size()) goto _L4; else goto _L3
_L3:
        obj = (X509Certificate)list.get(j);
        obj1 = ((X509Certificate) (obj)).getSubjectX500Principal();
        k = 0;
_L7:
        if (k == list.size())
        {
            break MISSING_BLOCK_LABEL_361;
        }
        if (!((X509Certificate)list.get(k)).getIssuerX500Principal().equals(obj1)) goto _L6; else goto _L5
_L5:
        k = 1;
_L8:
        if (k == 0)
        {
            arraylist.add(obj);
            list.remove(j);
        }
        j++;
        break MISSING_BLOCK_LABEL_119;
_L6:
        k++;
          goto _L7
_L4:
        if (arraylist.size() > 1)
        {
            return arraylist1;
        }
        j = 0;
label0:
        do
        {
            if (j != arraylist.size())
            {
                obj = ((X509Certificate)arraylist.get(j)).getIssuerX500Principal();
                k = 0;
                do
                {
label1:
                    {
                        if (k < list.size())
                        {
                            obj1 = (X509Certificate)list.get(k);
                            if (!((X500Principal) (obj)).equals(((X509Certificate) (obj1)).getSubjectX500Principal()))
                            {
                                break label1;
                            }
                            arraylist.add(obj1);
                            list.remove(k);
                        }
                        j++;
                        continue label0;
                    }
                    k++;
                } while (true);
            }
            if (list.size() > 0)
            {
                return arraylist1;
            } else
            {
                return arraylist;
            }
        } while (true);
        k = 0;
          goto _L8
        if (true) goto _L1; else goto _L9
_L9:
    }

    private ASN1Primitive toASN1Object(X509Certificate x509certificate)
        throws CertificateEncodingException
    {
        try
        {
            x509certificate = (new ASN1InputStream(x509certificate.getEncoded())).readObject();
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateEncodingException((new StringBuilder()).append("Exception while encoding certificate: ").append(x509certificate.toString()).toString());
        }
        return x509certificate;
    }

    private byte[] toDEREncoded(ASN1Encodable asn1encodable)
        throws CertificateEncodingException
    {
        try
        {
            asn1encodable = asn1encodable.toASN1Primitive().getEncoded("DER");
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Encodable asn1encodable)
        {
            throw new CertificateEncodingException((new StringBuilder()).append("Exception thrown: ").append(asn1encodable).toString());
        }
        return asn1encodable;
    }

    public List getCertificates()
    {
        return Collections.unmodifiableList(new ArrayList(certificates));
    }

    public byte[] getEncoded()
        throws CertificateEncodingException
    {
        Object obj = getEncodings();
        if (((Iterator) (obj)).hasNext())
        {
            obj = ((Iterator) (obj)).next();
            if (obj instanceof String)
            {
                return getEncoded((String)obj);
            }
        }
        return null;
    }

    public byte[] getEncoded(String s)
        throws CertificateEncodingException
    {
        if (s.equalsIgnoreCase("PkiPath"))
        {
            s = new ASN1EncodableVector();
            for (ListIterator listiterator = certificates.listIterator(certificates.size()); listiterator.hasPrevious(); s.add(toASN1Object((X509Certificate)listiterator.previous()))) { }
            return toDEREncoded(new DERSequence(s));
        }
        if (s.equalsIgnoreCase("PKCS7"))
        {
            s = new ContentInfo(PKCSObjectIdentifiers.data, null);
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            for (int i = 0; i != certificates.size(); i++)
            {
                asn1encodablevector.add(toASN1Object((X509Certificate)certificates.get(i)));
            }

            s = new SignedData(new ASN1Integer(1), new DERSet(), s, new DERSet(asn1encodablevector), null, new DERSet());
            return toDEREncoded(new ContentInfo(PKCSObjectIdentifiers.signedData, s));
        }
        if (!s.equalsIgnoreCase("PEM"))
        {
            break MISSING_BLOCK_LABEL_312;
        }
        s = new ByteArrayOutputStream();
        PemWriter pemwriter = new PemWriter(new OutputStreamWriter(s));
        int j = 0;
        do
        {
            try
            {
                if (j == certificates.size())
                {
                    break;
                }
                pemwriter.writeObject(new PemObject("CERTIFICATE", ((X509Certificate)certificates.get(j)).getEncoded()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
            }
            j++;
        } while (true);
        pemwriter.close();
        return s.toByteArray();
        throw new CertificateEncodingException((new StringBuilder()).append("unsupported encoding: ").append(s).toString());
    }

    public Iterator getEncodings()
    {
        return certPathEncodings.iterator();
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("PkiPath");
        arraylist.add("PEM");
        arraylist.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arraylist);
    }
}
