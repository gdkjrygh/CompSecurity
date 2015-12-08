// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.x509;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.SignedData;
import org.spongycastle.asn1.x509.CertificateList;
import org.spongycastle.asn1.x509.X509CertificateStructure;
import org.spongycastle.jce.provider.X509CRLObject;
import org.spongycastle.jce.provider.X509CertificateObject;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.x509:
//            PEMUtil, PKIXCertPath

public class CertificateFactory extends CertificateFactorySpi
{
    private final class a extends CertificateException
    {

        final CertificateFactory a;
        private Throwable b;

        public final Throwable getCause()
        {
            return b;
        }

        public a(Throwable throwable)
        {
            a = CertificateFactory.this;
            super();
            b = throwable;
        }
    }


    private static final PEMUtil a = new PEMUtil("CERTIFICATE");
    private static final PEMUtil b = new PEMUtil("CRL");
    private ASN1Set c;
    private int d;
    private InputStream e;
    private ASN1Set f;
    private int g;
    private InputStream h;

    public CertificateFactory()
    {
        c = null;
        d = 0;
        e = null;
        f = null;
        g = 0;
        h = null;
    }

    private static CRL a(CertificateList certificatelist)
    {
        return new X509CRLObject(certificatelist);
    }

    private Certificate a()
    {
        if (c != null)
        {
            while (d < c.d()) 
            {
                Object obj = c;
                int i = d;
                d = i + 1;
                obj = ((ASN1Set) (obj)).a(i);
                if (obj instanceof ASN1Sequence)
                {
                    return new X509CertificateObject(X509CertificateStructure.a(obj));
                }
            }
        }
        return null;
    }

    private Certificate a(ASN1InputStream asn1inputstream)
    {
        asn1inputstream = (ASN1Sequence)asn1inputstream.b();
        if (asn1inputstream.e() > 1 && (asn1inputstream.a(0) instanceof ASN1ObjectIdentifier) && asn1inputstream.a(0).equals(PKCSObjectIdentifiers.N))
        {
            c = SignedData.a(ASN1Sequence.a((ASN1TaggedObject)asn1inputstream.a(1), true)).c();
            return a();
        } else
        {
            return new X509CertificateObject(X509CertificateStructure.a(asn1inputstream));
        }
    }

    private CRL b()
    {
        if (f == null || g >= f.d())
        {
            return null;
        } else
        {
            ASN1Set asn1set = f;
            int i = g;
            g = i + 1;
            return a(CertificateList.a(asn1set.a(i)));
        }
    }

    public CRL engineGenerateCRL(InputStream inputstream)
    {
        Object obj = null;
        if (h != null) goto _L2; else goto _L1
_L1:
        h = inputstream;
        f = null;
        g = 0;
_L11:
        if (f == null) goto _L4; else goto _L3
_L3:
        if (g == f.d()) goto _L6; else goto _L5
_L5:
        inputstream = b();
_L8:
        return inputstream;
_L2:
        if (h != inputstream)
        {
            h = inputstream;
            f = null;
            g = 0;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        f = null;
        g = 0;
        return null;
        inputstream;
        throw inputstream;
_L4:
        Object obj1;
        int i;
        obj1 = new PushbackInputStream(inputstream);
        i = ((PushbackInputStream) (obj1)).read();
        inputstream = obj;
        if (i == -1) goto _L8; else goto _L7
_L7:
        ((PushbackInputStream) (obj1)).unread(i);
        if (i == 48)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        obj1 = b.a(((InputStream) (obj1)));
        inputstream = obj;
        if (obj1 == null) goto _L8; else goto _L9
_L9:
        return a(CertificateList.a(obj1));
        inputstream = (ASN1Sequence)(new ASN1InputStream(((InputStream) (obj1)), (byte)0)).b();
        if (inputstream.e() > 1 && (inputstream.a(0) instanceof ASN1ObjectIdentifier) && inputstream.a(0).equals(PKCSObjectIdentifiers.N))
        {
            f = SignedData.a(ASN1Sequence.a((ASN1TaggedObject)inputstream.a(1), true)).d();
            return b();
        }
        inputstream = a(CertificateList.a(inputstream));
        return inputstream;
        inputstream;
        throw new CRLException(inputstream.toString());
        if (true) goto _L11; else goto _L10
_L10:
    }

    public Collection engineGenerateCRLs(InputStream inputstream)
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            CRL crl = engineGenerateCRL(inputstream);
            if (crl != null)
            {
                arraylist.add(crl);
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    public CertPath engineGenerateCertPath(InputStream inputstream)
    {
        return engineGenerateCertPath(inputstream, "PkiPath");
    }

    public CertPath engineGenerateCertPath(InputStream inputstream, String s)
    {
        return new PKIXCertPath(inputstream, s);
    }

    public CertPath engineGenerateCertPath(List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Object obj = iterator.next();
            if (obj != null && !(obj instanceof X509Certificate))
            {
                throw new CertificateException((new StringBuilder("list contains non X509Certificate object while creating CertPath\n")).append(obj.toString()).toString());
            }
        }

        return new PKIXCertPath(list);
    }

    public Certificate engineGenerateCertificate(InputStream inputstream)
    {
        Object obj = null;
        if (e != null) goto _L2; else goto _L1
_L1:
        e = inputstream;
        c = null;
        d = 0;
_L11:
        if (c == null) goto _L4; else goto _L3
_L3:
        if (d == c.d()) goto _L6; else goto _L5
_L5:
        inputstream = a();
_L8:
        return inputstream;
_L2:
        if (e != inputstream)
        {
            e = inputstream;
            c = null;
            d = 0;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        try
        {
            c = null;
            d = 0;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new a(inputstream);
        }
        return null;
_L4:
        Object obj1;
        int i;
        obj1 = new PushbackInputStream(inputstream);
        i = ((PushbackInputStream) (obj1)).read();
        inputstream = obj;
        if (i == -1) goto _L8; else goto _L7
_L7:
        ((PushbackInputStream) (obj1)).unread(i);
        if (i == 48)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        obj1 = a.a(((InputStream) (obj1)));
        inputstream = obj;
        if (obj1 == null) goto _L8; else goto _L9
_L9:
        return new X509CertificateObject(X509CertificateStructure.a(obj1));
        inputstream = a(new ASN1InputStream(((InputStream) (obj1))));
        return inputstream;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public Collection engineGenerateCertificates(InputStream inputstream)
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            Certificate certificate = engineGenerateCertificate(inputstream);
            if (certificate != null)
            {
                arraylist.add(certificate);
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    public Iterator engineGetCertPathEncodings()
    {
        return null;
    }

}
