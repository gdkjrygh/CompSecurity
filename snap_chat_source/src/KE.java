// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class KE
    implements X509TrustManager
{

    private static final String TRUSTED_SUBJECT_ALTERNATIVE_DNS_NAMES[] = {
        "feelinsonice.com", "www.feelinsonice.com"
    };
    private static final Set sTrustedSubjectAlternativeDNSNames = new HashSet(Arrays.asList(TRUSTED_SUBJECT_ALTERNATIVE_DNS_NAMES));
    private X509TrustManager mDefaultTrustManager;

    public KE()
    {
        this(null);
    }

    KE(KeyStore keystore)
    {
        try
        {
            TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustmanagerfactory.init(keystore);
            mDefaultTrustManager = a(trustmanagerfactory);
            if (mDefaultTrustManager == null)
            {
                throw new IllegalStateException("Couldn't find X509TrustManager");
            }
        }
        // Misplaced declaration of an exception variable
        catch (KeyStore keystore)
        {
            throw new RuntimeException(keystore);
        }
    }

    private static X509TrustManager a(TrustManagerFactory trustmanagerfactory)
    {
        trustmanagerfactory = trustmanagerfactory.getTrustManagers();
        int j = trustmanagerfactory.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = trustmanagerfactory[i];
            if (obj instanceof X509TrustManager)
            {
                return (X509TrustManager)obj;
            }
        }

        return null;
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
        throw new CertificateException("Client certificate checking is unsupported.");
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
        mDefaultTrustManager.checkServerTrusted(ax509certificate, s);
        ax509certificate = ax509certificate[0].getSubjectAlternativeNames();
        if (ax509certificate == null) goto _L2; else goto _L1
_L1:
        ax509certificate = ax509certificate.iterator();
_L5:
        if (!ax509certificate.hasNext()) goto _L2; else goto _L3
_L3:
        s = (List)ax509certificate.next();
        if (((Integer)s.get(0)).intValue() != 2) goto _L5; else goto _L4
_L4:
        s = (String)s.get(1);
        if (!sTrustedSubjectAlternativeDNSNames.contains(s)) goto _L5; else goto _L6
_L6:
        boolean flag = true;
_L8:
        if (!flag)
        {
            throw new CertificateException("Certificate did not match an expected DNS name.");
        } else
        {
            return;
        }
_L2:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return mDefaultTrustManager.getAcceptedIssuers();
    }

}
