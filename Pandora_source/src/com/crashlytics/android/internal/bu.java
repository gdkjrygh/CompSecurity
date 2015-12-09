// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.crashlytics.android.internal:
//            ck, ah, ag, af, 
//            cj, bv, bw, bx

public class bu
{

    private final cj a;
    private af b;
    private SSLSocketFactory c;
    private boolean d;

    public bu()
    {
        this(((cj) (new ck())));
    }

    public bu(cj cj1)
    {
        a = cj1;
    }

    private SSLSocketFactory a()
    {
        this;
        JVM INSTR monitorenter ;
        SSLSocketFactory sslsocketfactory;
        if (c == null && !d)
        {
            c = b();
        }
        sslsocketfactory = c;
        this;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean a(X509Certificate x509certificate, X509Certificate x509certificate1)
    {
        if (!x509certificate.getSubjectX500Principal().equals(x509certificate1.getIssuerX500Principal()))
        {
            return false;
        }
        try
        {
            x509certificate1.verify(x509certificate.getPublicKey());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return false;
        }
        return true;
    }

    public static X509Certificate[] a(X509Certificate ax509certificate[], ah ah1)
        throws CertificateException
    {
        boolean flag2 = true;
        LinkedList linkedlist = new LinkedList();
        boolean flag;
        boolean flag1;
        int i;
        if (ah1.a(ax509certificate[0]))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linkedlist.add(ax509certificate[0]);
        i = 1;
        do
        {
            flag1 = flag;
            if (i >= ax509certificate.length)
            {
                break;
            }
            if (ah1.a(ax509certificate[i]))
            {
                flag = true;
            }
            flag1 = flag;
            if (!a(ax509certificate[i], ax509certificate[i - 1]))
            {
                break;
            }
            linkedlist.add(ax509certificate[i]);
            i++;
        } while (true);
        ax509certificate = ah1.b(ax509certificate[i - 1]);
        if (ax509certificate != null)
        {
            linkedlist.add(ax509certificate);
            flag = flag2;
        } else
        {
            flag = flag1;
        }
        if (flag)
        {
            return (X509Certificate[])linkedlist.toArray(new X509Certificate[linkedlist.size()]);
        } else
        {
            throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
        }
    }

    private SSLSocketFactory b()
    {
        this;
        JVM INSTR monitorenter ;
        d = true;
        Object obj;
        obj = b;
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        sslcontext.init(null, new TrustManager[] {
            new ag(new ah(((af) (obj)).a(), ((af) (obj)).b()), ((af) (obj)))
        }, null);
        obj = sslcontext.getSocketFactory();
        a.a("Crashlytics", "Custom SSL pinning enabled");
_L2:
        this;
        JVM INSTR monitorexit ;
        return ((SSLSocketFactory) (obj));
        Object obj1;
        obj1;
        a.a("Crashlytics", "Exception while validating pinned certs", ((Throwable) (obj1)));
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        throw obj1;
    }

    public bx a(bw bw1, String s, Map map)
    {
        bv.a[bw1.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 50
    //                   2 98
    //                   3 108
    //                   4 116;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_116;
_L1:
        throw new IllegalArgumentException("Unsupported HTTP method!");
_L2:
        bw1 = bx.a(s, map, true);
_L6:
        boolean flag;
        if (s == null)
        {
            flag = false;
        } else
        {
            flag = s.toLowerCase().startsWith("https");
        }
        if (flag && b != null)
        {
            s = a();
            if (s != null)
            {
                ((HttpsURLConnection)bw1.a()).setSSLSocketFactory(s);
            }
        }
        return bw1;
_L3:
        bw1 = bx.b(s, map, true);
          goto _L6
_L4:
        bw1 = bx.a(s);
          goto _L6
        bw1 = bx.b(s);
          goto _L6
    }
}
