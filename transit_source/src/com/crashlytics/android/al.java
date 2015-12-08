// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.crashlytics.android:
//            az, c

final class al
    implements X509TrustManager
{

    private final TrustManager a[];
    private final az b;
    private final List c = new LinkedList();
    private final Set d = Collections.synchronizedSet(new HashSet());

    public al(az az1, String as[])
    {
        a = a(az1);
        b = az1;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            az1 = as[i];
            c.add(a(az1));
        }

    }

    private boolean a(X509Certificate x509certificate)
        throws CertificateException
    {
        Iterator iterator;
        x509certificate = MessageDigest.getInstance("SHA1").digest(x509certificate.getPublicKey().getEncoded());
        iterator = c.iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        flag = Arrays.equals((byte[])iterator.next(), x509certificate);
        if (flag)
        {
            return true;
        }
          goto _L1
        return false;
        x509certificate;
        throw new CertificateException(x509certificate);
    }

    private static byte[] a(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    private static TrustManager[] a(az az1)
    {
        try
        {
            TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance("X509");
            trustmanagerfactory.init(az1.a);
            az1 = trustmanagerfactory.getTrustManagers();
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw new AssertionError(az1);
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw new AssertionError(az1);
        }
        return az1;
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        if (d.contains(ax509certificate[0]))
        {
            return;
        }
        TrustManager atrustmanager[] = a;
        int k = atrustmanager.length;
        for (int i = 0; i < k; i++)
        {
            ((X509TrustManager)atrustmanager[i]).checkServerTrusted(ax509certificate, s);
        }

        s = com.crashlytics.android.c.a(ax509certificate, b);
        k = s.length;
        for (int j = 0; j < k;)
        {
            if (!a(s[j]))
            {
                j++;
            } else
            {
                d.add(ax509certificate[0]);
                return;
            }
        }

        throw new CertificateException("No valid pins found in chain!");
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }
}
