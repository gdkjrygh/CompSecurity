// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.Target;
import org.spongycastle.asn1.x509.TargetInformation;
import org.spongycastle.asn1.x509.Targets;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.util.Selector;

// Referenced classes of package org.spongycastle.x509:
//            X509AttributeCertificate, AttributeCertificateHolder, AttributeCertificateIssuer

public class X509AttributeCertStoreSelector
    implements Selector
{

    private AttributeCertificateHolder a;
    private AttributeCertificateIssuer b;
    private BigInteger c;
    private Date d;
    private X509AttributeCertificate e;
    private Collection f;
    private Collection g;

    public X509AttributeCertStoreSelector()
    {
        f = new HashSet();
        g = new HashSet();
    }

    public final X509AttributeCertificate a()
    {
        return e;
    }

    public final boolean a(Object obj)
    {
        if (obj instanceof X509AttributeCertificate) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (X509AttributeCertificate)obj;
        if (e != null && !e.equals(obj) || c != null && !((X509AttributeCertificate) (obj)).a().equals(c) || a != null && !((X509AttributeCertificate) (obj)).c().equals(a) || b != null && !((X509AttributeCertificate) (obj)).d().equals(b)) goto _L1; else goto _L3
_L3:
        Target atarget[];
        int i;
        boolean flag;
        boolean flag1;
        int j;
        if (d != null)
        {
            try
            {
                ((X509AttributeCertificate) (obj)).a(d);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
        }
        if (f.isEmpty() && g.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((X509AttributeCertificate) (obj)).getExtensionValue(X509Extensions.E.c());
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            obj = TargetInformation.a((new ASN1InputStream(((DEROctetString)DEROctetString.a(((byte []) (obj)))).d())).b());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        obj = ((TargetInformation) (obj)).c();
        if (f.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        flag = false;
        if (i >= obj.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        atarget = obj[i].c();
        j = 0;
        do
        {
label0:
            {
                flag1 = flag;
                if (j < atarget.length)
                {
                    if (!f.contains(GeneralName.a(atarget[j].d())))
                    {
                        break label0;
                    }
                    flag1 = true;
                }
                i++;
                flag = flag1;
            }
            if (true)
            {
                break MISSING_BLOCK_LABEL_205;
            }
            j++;
        } while (true);
        if (true)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (!flag) goto _L1; else goto _L4
_L4:
        if (g.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        flag = false;
        do
        {
            if (i >= obj.length)
            {
                continue; /* Loop/switch isn't completed */
            }
            atarget = obj[i].c();
            j = 0;
            do
            {
label1:
                {
                    flag1 = flag;
                    if (j < atarget.length)
                    {
                        if (!g.contains(GeneralName.a(atarget[j].c())))
                        {
                            break label1;
                        }
                        flag1 = true;
                    }
                    i++;
                    flag = flag1;
                }
                if (true)
                {
                    break;
                }
                j++;
            } while (true);
        } while (true);
        if (!flag) goto _L1; else goto _L5
_L5:
        return true;
    }

    public final AttributeCertificateHolder b()
    {
        return a;
    }

    public final BigInteger c()
    {
        return c;
    }

    public Object clone()
    {
        X509AttributeCertStoreSelector x509attributecertstoreselector = new X509AttributeCertStoreSelector();
        x509attributecertstoreselector.e = e;
        Date date;
        if (d != null)
        {
            date = new Date(d.getTime());
        } else
        {
            date = null;
        }
        x509attributecertstoreselector.d = date;
        x509attributecertstoreselector.a = a;
        x509attributecertstoreselector.b = b;
        x509attributecertstoreselector.c = c;
        x509attributecertstoreselector.g = Collections.unmodifiableCollection(g);
        x509attributecertstoreselector.f = Collections.unmodifiableCollection(f);
        return x509attributecertstoreselector;
    }
}
