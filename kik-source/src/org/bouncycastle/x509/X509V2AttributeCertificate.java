// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AttCertValidityPeriod;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.AttributeCertificateInfo;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.x509:
//            X509AttributeCertificate, X509Attribute, AttributeCertificateHolder, AttributeCertificateIssuer

public class X509V2AttributeCertificate
    implements X509AttributeCertificate
{

    private AttributeCertificate a;
    private Date b;
    private Date c;

    private X509V2AttributeCertificate(InputStream inputstream)
    {
        this(a(inputstream));
    }

    private X509V2AttributeCertificate(AttributeCertificate attributecertificate)
    {
        a = attributecertificate;
        try
        {
            c = attributecertificate.e().h().f().f();
            b = attributecertificate.e().h().e().f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeCertificate attributecertificate)
        {
            throw new IOException("invalid data structure in certificate!");
        }
    }

    public X509V2AttributeCertificate(byte abyte0[])
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    private Set a(boolean flag)
    {
        X509Extensions x509extensions = a.e().j();
        if (x509extensions != null)
        {
            HashSet hashset = new HashSet();
            Enumeration enumeration = x509extensions.e();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                if (x509extensions.a(derobjectidentifier).a() == flag)
                {
                    hashset.add(derobjectidentifier.e());
                }
            } while (true);
            return hashset;
        } else
        {
            return null;
        }
    }

    private static AttributeCertificate a(InputStream inputstream)
    {
        try
        {
            inputstream = AttributeCertificate.a((new ASN1InputStream(inputstream)).a());
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new IOException((new StringBuilder("exception decoding certificate structure: ")).append(inputstream.toString()).toString());
        }
        return inputstream;
    }

    public final BigInteger a()
    {
        return a.e().g().e();
    }

    public final void a(Date date)
    {
        if (date.after(c))
        {
            throw new CertificateExpiredException((new StringBuilder("certificate expired on ")).append(c).toString());
        }
        if (date.before(b))
        {
            throw new CertificateNotYetValidException((new StringBuilder("certificate not valid till ")).append(b).toString());
        } else
        {
            return;
        }
    }

    public final X509Attribute[] a(String s)
    {
        ASN1Sequence asn1sequence = a.e().i();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i != asn1sequence.f(); i++)
        {
            X509Attribute x509attribute = new X509Attribute((ASN1Encodable)asn1sequence.a(i));
            if (x509attribute.a.e().e().equals(s))
            {
                arraylist.add(x509attribute);
            }
        }

        if (arraylist.size() == 0)
        {
            return null;
        } else
        {
            return (X509Attribute[])arraylist.toArray(new X509Attribute[arraylist.size()]);
        }
    }

    public final Date b()
    {
        return c;
    }

    public final AttributeCertificateHolder c()
    {
        return new AttributeCertificateHolder((ASN1Sequence)a.e().e().d());
    }

    public final AttributeCertificateIssuer d()
    {
        return new AttributeCertificateIssuer(a.e().f());
    }

    public final byte[] e()
    {
        return a.a();
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        if (obj == this)
        {
            flag = true;
        } else
        if (obj instanceof X509AttributeCertificate)
        {
            obj = (X509AttributeCertificate)obj;
            boolean flag1;
            try
            {
                flag1 = Arrays.a(a.a(), ((X509AttributeCertificate) (obj)).e());
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

    public Set getCriticalExtensionOIDs()
    {
        return a(true);
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = a.e().j();
        if (x509extensions != null)
        {
            s = x509extensions.a(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.b().a("DER");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new RuntimeException((new StringBuilder("error encoding ")).append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return a(false);
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = Arrays.b(a.a());
        }
        catch (IOException ioexception)
        {
            return 0;
        }
        return i;
    }
}
