// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.x509.AttCertIssuer;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.IssuerSerial;
import org.spongycastle.asn1.x509.V2Form;
import org.spongycastle.util.Selector;

public class AttributeCertificateIssuer
    implements CertSelector, Selector
{

    final ASN1Encodable a;

    public AttributeCertificateIssuer(AttCertIssuer attcertissuer)
    {
        a = attcertissuer.c();
    }

    private static boolean a(X500Principal x500principal, GeneralNames generalnames)
    {
        int i;
        boolean flag1;
        flag1 = false;
        generalnames = generalnames.c();
        i = 0;
_L2:
        GeneralName generalname;
        boolean flag;
        flag = flag1;
        if (i == generalnames.length)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        generalname = generalnames[i];
        if (generalname.c() != 4)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        flag = (new X500Principal(generalname.d().a().b())).equals(x500principal);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
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
            obj = ((V2Form)a).c();
        } else
        {
            obj = (GeneralNames)a;
        }
        obj = ((GeneralNames) (obj)).c();
        arraylist = new ArrayList(obj.length);
        i = 0;
        while (i != obj.length) 
        {
            if (obj[i].c() == 4)
            {
                try
                {
                    arraylist.add(new X500Principal(obj[i].d().a().b()));
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
            if (((V2Form) (obj)).d() != null)
            {
                return ((V2Form) (obj)).d().d().c().equals(certificate.getSerialNumber()) && a(certificate.getIssuerX500Principal(), ((V2Form) (obj)).d().c());
            }
            obj = ((V2Form) (obj)).c();
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
