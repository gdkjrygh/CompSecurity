// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.asn1.x509.ObjectDigestInfo;
import org.bouncycastle.jce.PrincipalUtil;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

public class AttributeCertificateHolder
    implements CertSelector, Selector
{

    final Holder a;

    AttributeCertificateHolder(ASN1Sequence asn1sequence)
    {
        a = Holder.a(asn1sequence);
    }

    private static boolean a(X509Principal x509principal, GeneralNames generalnames)
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
        flag = (new X509Principal(((ASN1Encodable)generalname.f()).a())).equals(x509principal);
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

    private static Object[] a(GeneralName ageneralname[])
    {
        ArrayList arraylist = new ArrayList(ageneralname.length);
        int i = 0;
        while (i != ageneralname.length) 
        {
            if (ageneralname[i].e() == 4)
            {
                try
                {
                    arraylist.add(new X500Principal(((ASN1Encodable)ageneralname[i].f()).a()));
                }
                // Misplaced declaration of an exception variable
                catch (GeneralName ageneralname[])
                {
                    throw new RuntimeException("badly formed Name object");
                }
            }
            i++;
        }
        return arraylist.toArray(new Object[arraylist.size()]);
    }

    private static Principal[] a(GeneralNames generalnames)
    {
        generalnames = ((GeneralNames) (a(generalnames.e())));
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i != generalnames.length; i++)
        {
            if (generalnames[i] instanceof Principal)
            {
                arraylist.add(generalnames[i]);
            }
        }

        return (Principal[])arraylist.toArray(new Principal[arraylist.size()]);
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
        if (a.f() != null)
        {
            return a(a.f());
        } else
        {
            return null;
        }
    }

    public final Principal[] b()
    {
        if (a.e() != null)
        {
            return a(a.e().e());
        } else
        {
            return null;
        }
    }

    public final BigInteger c()
    {
        if (a.e() != null)
        {
            return a.e().f().e();
        } else
        {
            return null;
        }
    }

    public Object clone()
    {
        return new AttributeCertificateHolder((ASN1Sequence)a.d());
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof AttributeCertificateHolder))
        {
            return false;
        } else
        {
            obj = (AttributeCertificateHolder)obj;
            return a.equals(((AttributeCertificateHolder) (obj)).a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public boolean match(Certificate certificate)
    {
        Object obj;
        if (!(certificate instanceof X509Certificate))
        {
            return false;
        }
        obj = (X509Certificate)certificate;
        int i;
        if (a.e() != null)
        {
            return a.e().f().e().equals(((X509Certificate) (obj)).getSerialNumber()) && a(PrincipalUtil.a(((X509Certificate) (obj))), a.e().e());
        }
        if (a.f() != null && a(PrincipalUtil.b(((X509Certificate) (obj))), a.f()))
        {
            return true;
        }
        try
        {
            obj = a.g();
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            return false;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (a.g() == null) goto _L4; else goto _L3
_L3:
        obj = a.g().f().e().e();
_L14:
        obj = MessageDigest.getInstance(((String) (obj)), "BC");
        if (a.g() == null) goto _L6; else goto _L5
_L5:
        i = a.g().e().e().intValue();
          goto _L7
_L10:
        obj = ((MessageDigest) (obj)).digest();
        if (a.g() == null) goto _L9; else goto _L8
_L8:
        certificate = a.g().g().e();
_L11:
        if (!Arrays.a(((byte []) (obj)), certificate))
        {
            return false;
        }
          goto _L2
_L12:
        ((MessageDigest) (obj)).update(certificate.getPublicKey().getEncoded());
          goto _L10
_L13:
        ((MessageDigest) (obj)).update(certificate.getEncoded());
          goto _L10
_L9:
        certificate = null;
          goto _L11
_L2:
        return false;
_L7:
        i;
        JVM INSTR tableswitch 0 1: default 272
    //                   0 213
    //                   1 229;
           goto _L10 _L12 _L13
_L4:
        obj = null;
          goto _L14
        certificate;
        return false;
_L6:
        i = -1;
          goto _L7
    }
}
