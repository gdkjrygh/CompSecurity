// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.asn1.x509.V2Form;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Selector;

public class AttributeCertificateIssuer
    implements CertSelector, Selector
{

    final ASN1Encodable form;

    public AttributeCertificateIssuer(X500Principal x500principal)
        throws IOException
    {
        this(new X509Principal(x500principal.getEncoded()));
    }

    public AttributeCertificateIssuer(AttCertIssuer attcertissuer)
    {
        form = attcertissuer.getIssuer();
    }

    public AttributeCertificateIssuer(X509Principal x509principal)
    {
        form = new V2Form(GeneralNames.getInstance(new DERSequence(new GeneralName(x509principal))));
    }

    private Object[] getNames()
    {
        Object obj;
        ArrayList arraylist;
        int i;
        if (form instanceof V2Form)
        {
            obj = ((V2Form)form).getIssuerName();
        } else
        {
            obj = (GeneralNames)form;
        }
        obj = ((GeneralNames) (obj)).getNames();
        arraylist = new ArrayList(obj.length);
        i = 0;
        while (i != obj.length) 
        {
            if (obj[i].getTagNo() == 4)
            {
                try
                {
                    arraylist.add(new X500Principal(obj[i].getName().toASN1Primitive().getEncoded()));
                }
                catch (IOException ioexception)
                {
                    throw new RuntimeException("badly formed Name object");
                }
            }
            i++;
        }
        return arraylist.toArray(new Object[arraylist.size()]);
    }

    private boolean matchesDN(X500Principal x500principal, GeneralNames generalnames)
    {
        int i;
        boolean flag1;
        flag1 = false;
        generalnames = generalnames.getNames();
        i = 0;
_L2:
        GeneralName generalname;
        boolean flag;
        flag = flag1;
        if (i == generalnames.length)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        generalname = generalnames[i];
        if (generalname.getTagNo() != 4)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        flag = (new X500Principal(generalname.getName().toASN1Primitive().getEncoded())).equals(x500principal);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        flag = true;
        return flag;
        IOException ioexception;
        ioexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object clone()
    {
        return new AttributeCertificateIssuer(AttCertIssuer.getInstance(form));
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof AttributeCertificateIssuer))
        {
            return false;
        } else
        {
            obj = (AttributeCertificateIssuer)obj;
            return form.equals(((AttributeCertificateIssuer) (obj)).form);
        }
    }

    public Principal[] getPrincipals()
    {
        Object aobj[] = getNames();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i != aobj.length; i++)
        {
            if (aobj[i] instanceof Principal)
            {
                arraylist.add(aobj[i]);
            }
        }

        return (Principal[])(Principal[])arraylist.toArray(new Principal[arraylist.size()]);
    }

    public int hashCode()
    {
        return form.hashCode();
    }

    public boolean match(Object obj)
    {
        if (!(obj instanceof X509Certificate))
        {
            return false;
        } else
        {
            return match((Certificate)obj);
        }
    }

    public boolean match(Certificate certificate)
    {
        if (certificate instanceof X509Certificate) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        certificate = (X509Certificate)certificate;
        if (!(form instanceof V2Form))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (V2Form)form;
        if (((V2Form) (obj)).getBaseCertificateID() != null)
        {
            boolean flag;
            if (((V2Form) (obj)).getBaseCertificateID().getSerial().getValue().equals(certificate.getSerialNumber()) && matchesDN(certificate.getIssuerX500Principal(), ((V2Form) (obj)).getBaseCertificateID().getIssuer()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }
        obj = ((V2Form) (obj)).getIssuerName();
        if (matchesDN(certificate.getSubjectX500Principal(), ((GeneralNames) (obj))))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        GeneralNames generalnames = (GeneralNames)form;
        if (matchesDN(certificate.getSubjectX500Principal(), generalnames))
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
