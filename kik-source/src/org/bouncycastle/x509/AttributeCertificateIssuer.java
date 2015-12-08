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
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.asn1.x509.V2Form;
import org.bouncycastle.util.Selector;

public class AttributeCertificateIssuer
    implements CertSelector, Selector
{

    final ASN1Encodable a;

    public AttributeCertificateIssuer(AttCertIssuer attcertissuer)
    {
        a = attcertissuer.e();
    }

    private static boolean a(X500Principal x500principal, GeneralNames generalnames)
    {
        int i;
        boolean flag1;
        flag1 = false;
        generalnames = generalnames.e();
        i = 0;
_L2:
        GeneralName generalname;
        boolean flag;
        flag = flag1;
        if (i == generalnames.length)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        generalname = generalnames[i];
        if (generalname.e() != 4)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = (new X500Principal(((ASN1Encodable)generalname.f()).a())).equals(x500principal);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = true;
        return flag;
        IOException ioexception;
        ioexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Object[] b()
    {
        Object obj;
        ArrayList arraylist;
        int i;
        if (a instanceof V2Form)
        {
            obj = ((V2Form)a).e();
        } else
        {
            obj = (GeneralNames)a;
        }
        obj = ((GeneralNames) (obj)).e();
        arraylist = new ArrayList(obj.length);
        i = 0;
        while (i != obj.length) 
        {
            if (obj[i].e() == 4)
            {
                try
                {
                    arraylist.add(new X500Principal(((ASN1Encodable)obj[i].f()).a()));
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

    public final boolean a(Object obj)
    {
        if (!(obj instanceof X509Certificate))
        {
            return false;
        } else
        {
            return match((Certificate)obj);
        }
    }

    public final Principal[] a()
    {
        Object aobj[] = b();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i != aobj.length; i++)
        {
            if (aobj[i] instanceof Principal)
            {
                arraylist.add(aobj[i]);
            }
        }

        return (Principal[])arraylist.toArray(new Principal[arraylist.size()]);
    }

    public Object clone()
    {
        return new AttributeCertificateIssuer(AttCertIssuer.a(a));
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
            return a.equals(((AttributeCertificateIssuer) (obj)).a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public boolean match(Certificate certificate)
    {
        if (!(certificate instanceof X509Certificate))
        {
            return false;
        }
        certificate = (X509Certificate)certificate;
        if (a instanceof V2Form)
        {
            Object obj = (V2Form)a;
            if (((V2Form) (obj)).f() != null)
            {
                return ((V2Form) (obj)).f().f().e().equals(certificate.getSerialNumber()) && a(certificate.getIssuerX500Principal(), ((V2Form) (obj)).f().e());
            }
            obj = ((V2Form) (obj)).e();
            if (a(certificate.getSubjectX500Principal(), ((GeneralNames) (obj))))
            {
                return true;
            }
        } else
        {
            GeneralNames generalnames = (GeneralNames)a;
            if (a(certificate.getSubjectX500Principal(), generalnames))
            {
                return true;
            }
        }
        return false;
    }
}
