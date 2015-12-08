// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import b.a.a.a.d;
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

// Referenced classes of package b.a.a.a.a.e:
//            h, j, a

final class i
    implements X509TrustManager
{

    private final TrustManager a[];
    private final j b;
    private final long c = -1L;
    private final List d = new LinkedList();
    private final Set e = Collections.synchronizedSet(new HashSet());

    public i(j j1, h h1)
    {
        a = a(j1);
        b = j1;
        j1 = h1.c();
        int l = j1.length;
        for (int k = 0; k < l; k++)
        {
            h1 = j1[k];
            d.add(a(h1));
        }

    }

    private boolean a(X509Certificate x509certificate)
        throws CertificateException
    {
        Iterator iterator;
        x509certificate = MessageDigest.getInstance("SHA1").digest(x509certificate.getPublicKey().getEncoded());
        iterator = d.iterator();
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
        int l = s.length();
        byte abyte0[] = new byte[l / 2];
        for (int k = 0; k < l; k += 2)
        {
            abyte0[k / 2] = (byte)((Character.digit(s.charAt(k), 16) << 4) + Character.digit(s.charAt(k + 1), 16));
        }

        return abyte0;
    }

    private static TrustManager[] a(j j1)
    {
        try
        {
            TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance("X509");
            trustmanagerfactory.init(j1.a);
            j1 = trustmanagerfactory.getTrustManagers();
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new AssertionError(j1);
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new AssertionError(j1);
        }
        return j1;
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        if (e.contains(ax509certificate[0]))
        {
            return;
        }
        TrustManager atrustmanager[] = a;
        int i1 = atrustmanager.length;
        for (int k = 0; k < i1; k++)
        {
            ((X509TrustManager)atrustmanager[k]).checkServerTrusted(ax509certificate, s);
        }

        if (c == -1L || System.currentTimeMillis() - c <= 0x39ef8b000L) goto _L2; else goto _L1
_L1:
        b.a.a.a.d.a();
        (new StringBuilder("Certificate pins are stale, (")).append(System.currentTimeMillis() - c).append(" millis vs 15552000000 millis) falling back to system trust.");
_L4:
        e.add(ax509certificate[0]);
        return;
_L2:
        s = b.a.a.a.a.e.a.a(ax509certificate, b);
        int j1 = s.length;
        int l = 0;
label0:
        do
        {
label1:
            {
                if (l >= j1)
                {
                    break label1;
                }
                if (a(s[l]))
                {
                    break label0;
                }
                l++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        throw new CertificateException("No valid pins found in chain!");
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }
}
