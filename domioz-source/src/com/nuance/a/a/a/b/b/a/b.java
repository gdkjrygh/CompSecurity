// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.b.a;

import com.nuance.a.a.a.a.c.d;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.nuance.a.a.a.b.b.a:
//            a

public final class b
    implements X509TrustManager
{

    private static X509TrustManager b;
    private a a;

    public b(a a1)
    {
        a = a1;
        a1 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        a1.init(null);
        b = (X509TrustManager)a1.getTrustManagers()[0];
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
        int i;
        boolean flag1;
        flag1 = false;
        int j;
        try
        {
            b.checkServerTrusted(ax509certificate, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (!a.a)
            {
                throw s;
            }
        }
        if (a.b == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L6:
        if (i >= ax509certificate.length)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        s = ax509certificate[i].getSubjectDN().getName();
        j = s.indexOf("CN=");
        if (j == -1) goto _L4; else goto _L3
_L3:
        int k;
        k += 3;
        int l = s.indexOf(',', k);
        if (l == -1)
        {
            s = s.substring(k);
        } else
        {
            s = s.substring(k, l);
        }
        if (!a.b.equals(s)) goto _L4; else goto _L5
_L5:
        i = 1;
_L7:
        if (i == 0)
        {
            throw new CertificateException("certificate summary is not identical");
        }
          goto _L2
_L4:
        i++;
          goto _L6
_L2:
        if (a.c != null)
        {
            i = 0;
label0:
            do
            {
label1:
                {
                    boolean flag = flag1;
                    if (i < ax509certificate.length)
                    {
                        s = d.a(ax509certificate[i].getEncoded());
                        if (!a.c.equals(s))
                        {
                            break label1;
                        }
                        flag = true;
                    }
                    if (!flag)
                    {
                        throw new CertificateException("certificate data is not identical");
                    }
                    break label0;
                }
                i++;
            } while (true);
        }
        return;
        i = 0;
          goto _L7
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return b.getAcceptedIssuers();
    }
}
