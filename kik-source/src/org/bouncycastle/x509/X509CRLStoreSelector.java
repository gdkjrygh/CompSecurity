// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

// Referenced classes of package org.bouncycastle.x509:
//            X509AttributeCertificate

public class X509CRLStoreSelector extends X509CRLSelector
    implements Selector
{

    private boolean a;
    private boolean b;
    private BigInteger c;
    private byte d[];
    private boolean e;
    private X509AttributeCertificate f;

    public X509CRLStoreSelector()
    {
        a = false;
        b = false;
        c = null;
        d = null;
        e = false;
    }

    private static X509CRLStoreSelector a(X509CRLSelector x509crlselector)
    {
        if (x509crlselector == null)
        {
            throw new IllegalArgumentException("cannot create from null selector");
        }
        X509CRLStoreSelector x509crlstoreselector = new X509CRLStoreSelector();
        x509crlstoreselector.setCertificateChecking(x509crlselector.getCertificateChecking());
        x509crlstoreselector.setDateAndTime(x509crlselector.getDateAndTime());
        try
        {
            x509crlstoreselector.setIssuerNames(x509crlselector.getIssuerNames());
        }
        // Misplaced declaration of an exception variable
        catch (X509CRLSelector x509crlselector)
        {
            throw new IllegalArgumentException(x509crlselector.getMessage());
        }
        x509crlstoreselector.setIssuers(x509crlselector.getIssuers());
        x509crlstoreselector.setMaxCRLNumber(x509crlselector.getMaxCRL());
        x509crlstoreselector.setMinCRLNumber(x509crlselector.getMinCRL());
        return x509crlstoreselector;
    }

    public final void a()
    {
        e = true;
    }

    public final void a(BigInteger biginteger)
    {
        c = biginteger;
    }

    public final void a(X509AttributeCertificate x509attributecertificate)
    {
        f = x509attributecertificate;
    }

    public final void a(byte abyte0[])
    {
        d = Arrays.c(abyte0);
    }

    public final boolean a(Object obj)
    {
        DERInteger derinteger;
        X509CRL x509crl;
        if (!(obj instanceof X509CRL))
        {
            return false;
        }
        x509crl = (X509CRL)obj;
        derinteger = null;
        byte abyte1[];
        try
        {
            abyte1 = x509crl.getExtensionValue(X509Extensions.l.e());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        derinteger = DERInteger.a(X509ExtensionUtil.a(abyte1));
        if (a && derinteger == null)
        {
            return false;
        }
        if (b && derinteger != null)
        {
            return false;
        }
        if (derinteger != null && c != null && derinteger.f().compareTo(c) == 1)
        {
            return false;
        }
        if (e)
        {
            byte abyte0[] = x509crl.getExtensionValue(X509Extensions.m.e());
            if (d == null)
            {
                if (abyte0 != null)
                {
                    return false;
                }
            } else
            if (!Arrays.a(abyte0, d))
            {
                return false;
            }
        }
        return super.match((X509CRL)obj);
    }

    public final X509AttributeCertificate b()
    {
        return f;
    }

    public final boolean c()
    {
        return a;
    }

    public Object clone()
    {
        X509CRLStoreSelector x509crlstoreselector = a(this);
        x509crlstoreselector.a = a;
        x509crlstoreselector.b = b;
        x509crlstoreselector.c = c;
        x509crlstoreselector.f = f;
        x509crlstoreselector.e = e;
        x509crlstoreselector.d = Arrays.c(d);
        return x509crlstoreselector;
    }

    public final void d()
    {
        b = true;
    }

    public boolean match(CRL crl)
    {
        return a(crl);
    }
}
