// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DEREnumerated;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.Holder;
import org.spongycastle.asn1.x509.IssuerSerial;
import org.spongycastle.asn1.x509.ObjectDigestInfo;
import org.spongycastle.jce.PrincipalUtil;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Selector;

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
        flag = (new X509Principal(generalname.d().a().b())).equals(x509principal);
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

    private static Object[] a(GeneralName ageneralname[])
    {
        ArrayList arraylist = new ArrayList(ageneralname.length);
        int i = 0;
        while (i != ageneralname.length) 
        {
            if (ageneralname[i].c() == 4)
            {
                try
                {
                    arraylist.add(new X500Principal(ageneralname[i].d().a().b()));
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
        generalnames = ((GeneralNames) (a(generalnames.c())));
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
        if (a.d() != null)
        {
            return a(a.d());
        } else
        {
            return null;
        }
    }

    public final Principal[] b()
    {
        if (a.c() != null)
        {
            return a(a.c().c());
        } else
        {
            return null;
        }
    }

    public final BigInteger c()
    {
        if (a.c() != null)
        {
            return a.c().d().c();
        } else
        {
            return null;
        }
    }

    public Object clone()
    {
        return new AttributeCertificateHolder((ASN1Sequence)a.a());
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
        if (a.c() != null)
        {
            return a.c().d().c().equals(((X509Certificate) (obj)).getSerialNumber()) && a(PrincipalUtil.a(((X509Certificate) (obj))), a.c().c());
        }
        if (a.d() != null && a(PrincipalUtil.b(((X509Certificate) (obj))), a.d()))
        {
            return true;
        }
        try
        {
            obj = a.e();
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            return false;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (a.e() == null) goto _L4; else goto _L3
_L3:
        obj = a.e().d().c().c();
_L14:
        obj = MessageDigest.getInstance(((String) (obj)), "SC");
        if (a.e() == null) goto _L6; else goto _L5
_L5:
        i = a.e().c().c().intValue();
          goto _L7
_L10:
        obj = ((MessageDigest) (obj)).digest();
        if (a.e() == null) goto _L9; else goto _L8
_L8:
        certificate = a.e().e().c();
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
