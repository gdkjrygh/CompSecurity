// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package org.chromium.net:
//            AndroidCertVerifyResult

public class X509Util
{
    private static final class TrustStorageListener extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (!intent.getAction().equals("android.security.STORAGE_CHANGED"))
            {
                break MISSING_BLOCK_LABEL_15;
            }
            X509Util.reloadDefaultTrustManager();
            return;
            context;
            Log.e("X509Util", "Unable to reload the default TrustManager", context);
            return;
            context;
            Log.e("X509Util", "Unable to reload the default TrustManager", context);
            return;
            context;
            Log.e("X509Util", "Unable to reload the default TrustManager", context);
            return;
        }

        private TrustStorageListener()
        {
        }

    }

    private static final class X509TrustManagerIceCreamSandwich
        implements X509TrustManagerImplementation
    {

        private final X509TrustManager mTrustManager;

        public List checkServerTrusted(X509Certificate ax509certificate[], String s, String s1)
            throws CertificateException
        {
            mTrustManager.checkServerTrusted(ax509certificate, s);
            return Collections.emptyList();
        }

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509trustmanager)
        {
            mTrustManager = x509trustmanager;
        }
    }

    private static interface X509TrustManagerImplementation
    {

        public abstract List checkServerTrusted(X509Certificate ax509certificate[], String s, String s1)
            throws CertificateException;
    }

    private static final class X509TrustManagerJellyBean
        implements X509TrustManagerImplementation
    {

        private final X509TrustManagerExtensions mTrustManagerExtensions;

        public List checkServerTrusted(X509Certificate ax509certificate[], String s, String s1)
            throws CertificateException
        {
            return mTrustManagerExtensions.checkServerTrusted(ax509certificate, s, s1);
        }

        public X509TrustManagerJellyBean(X509TrustManager x509trustmanager)
        {
            mTrustManagerExtensions = new X509TrustManagerExtensions(x509trustmanager);
        }
    }


    private static final char HEX_DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerImplementation sDefaultTrustManager;
    private static boolean sDisableNativeCodeForTest = false;
    private static boolean sLoadedSystemKeyStore;
    private static final Object sLock = new Object();
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerImplementation sTestTrustManager;
    private static TrustStorageListener sTrustStorageListener;

    public X509Util()
    {
    }

    public static void addTestRootCertificate(byte abyte0[])
        throws CertificateException, KeyStoreException, NoSuchAlgorithmException
    {
        ensureInitialized();
        X509Certificate x509certificate = createCertificateFromBytes(abyte0);
        synchronized (sLock)
        {
            sTestKeyStore.setCertificateEntry((new StringBuilder()).append("root_cert_").append(Integer.toString(sTestKeyStore.size())).toString(), x509certificate);
            reloadTestTrustManager();
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void clearTestRootCertificates()
        throws NoSuchAlgorithmException, CertificateException, KeyStoreException
    {
        ensureInitialized();
        synchronized (sLock)
        {
            try
            {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        IOException ioexception;
        throw exception;
    }

    public static X509Certificate createCertificateFromBytes(byte abyte0[])
        throws CertificateException, KeyStoreException, NoSuchAlgorithmException
    {
        ensureInitialized();
        return (X509Certificate)sCertificateFactory.generateCertificate(new ByteArrayInputStream(abyte0));
    }

    private static X509TrustManagerImplementation createTrustManager(KeyStore keystore)
        throws KeyStoreException, NoSuchAlgorithmException
    {
        int i;
        int j;
        TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustmanagerfactory.init(keystore);
        keystore = trustmanagerfactory.getTrustManagers();
        j = keystore.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s;
        s = keystore[i];
        if (!(s instanceof X509TrustManager))
        {
            continue; /* Loop/switch isn't completed */
        }
        X509TrustManagerIceCreamSandwich x509trustmanagericecreamsandwich;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return new X509TrustManagerJellyBean((X509TrustManager)s);
        }
        x509trustmanagericecreamsandwich = new X509TrustManagerIceCreamSandwich((X509TrustManager)s);
        return x509trustmanagericecreamsandwich;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        s = s.getClass().getName();
        Log.e("X509Util", (new StringBuilder()).append("Error creating trust manager (").append(s).append("): ").append(illegalargumentexception).toString());
        i++;
          goto _L3
_L2:
        Log.e("X509Util", "Could not find suitable trust manager");
        return null;
    }

    private static void ensureInitialized()
        throws CertificateException, KeyStoreException, NoSuchAlgorithmException
    {
        boolean flag = true;
        Object obj = sLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        if (sCertificateFactory == null)
        {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null)
        {
            sDefaultTrustManager = createTrustManager(null);
        }
        flag1 = sLoadedSystemKeyStore;
        if (flag1) goto _L2; else goto _L1
_L1:
        sSystemKeyStore = KeyStore.getInstance("AndroidCAStore");
        Object obj1;
        try
        {
            sSystemKeyStore.load(null);
        }
        catch (IOException ioexception) { }
        sSystemCertificateDirectory = new File((new StringBuilder()).append(System.getenv("ANDROID_ROOT")).append("/etc/security/cacerts").toString());
_L8:
        if (sDisableNativeCodeForTest) goto _L4; else goto _L3
_L3:
        if (sSystemKeyStore == null)
        {
            flag = false;
        }
        nativeRecordCertVerifyCapabilitiesHistogram(flag);
_L4:
        sLoadedSystemKeyStore = true;
_L2:
        if (sSystemTrustAnchorCache == null)
        {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTestKeyStore != null) goto _L6; else goto _L5
_L5:
        sTestKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try
        {
            sTestKeyStore.load(null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
_L6:
        if (sTestTrustManager == null)
        {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
        if (!sDisableNativeCodeForTest && sTrustStorageListener == null)
        {
            sTrustStorageListener = new TrustStorageListener();
            nativeGetApplicationContext().registerReceiver(sTrustStorageListener, new IntentFilter("android.security.STORAGE_CHANGED"));
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static String hashPrincipal(X500Principal x500principal)
        throws NoSuchAlgorithmException
    {
        x500principal = MessageDigest.getInstance("MD5").digest(x500principal.getEncoded());
        char ac[] = new char[8];
        for (int i = 0; i < 4; i++)
        {
            ac[i * 2] = HEX_DIGITS[x500principal[3 - i] >> 4 & 0xf];
            ac[i * 2 + 1] = HEX_DIGITS[x500principal[3 - i] & 0xf];
        }

        return new String(ac);
    }

    private static boolean isKnownRoot(X509Certificate x509certificate)
        throws NoSuchAlgorithmException, KeyStoreException
    {
        if (sSystemKeyStore != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Pair pair = new Pair(x509certificate.getSubjectX500Principal(), x509certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair))
        {
            return true;
        }
        String s = hashPrincipal(x509certificate.getSubjectX500Principal());
        int i = 0;
        do
        {
            String s1 = (new StringBuilder()).append(s).append('.').append(i).toString();
            if (!(new File(sSystemCertificateDirectory, s1)).exists())
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj = sSystemKeyStore.getCertificate((new StringBuilder()).append("system:").append(s1).toString());
            if (obj != null)
            {
                if (!(obj instanceof X509Certificate))
                {
                    obj = obj.getClass().getName();
                    Log.e("X509Util", (new StringBuilder()).append("Anchor ").append(s1).append(" not an X509Certificate: ").append(((String) (obj))).toString());
                } else
                {
                    X509Certificate x509certificate1 = (X509Certificate)obj;
                    if (x509certificate.getSubjectX500Principal().equals(x509certificate1.getSubjectX500Principal()) && x509certificate.getPublicKey().equals(x509certificate1.getPublicKey()))
                    {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static native Context nativeGetApplicationContext();

    private static native void nativeNotifyKeyChainChanged();

    private static native void nativeRecordCertVerifyCapabilitiesHistogram(boolean flag);

    private static void reloadDefaultTrustManager()
        throws KeyStoreException, NoSuchAlgorithmException, CertificateException
    {
        sDefaultTrustManager = null;
        sSystemTrustAnchorCache = null;
        nativeNotifyKeyChainChanged();
        ensureInitialized();
    }

    private static void reloadTestTrustManager()
        throws KeyStoreException, NoSuchAlgorithmException
    {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    public static void setDisableNativeCodeForTest(boolean flag)
    {
        sDisableNativeCodeForTest = flag;
    }

    static boolean verifyKeyUsage(X509Certificate x509certificate)
        throws CertificateException
    {
        try
        {
            x509certificate = x509certificate.getExtendedKeyUsage();
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return false;
        }
        if (x509certificate != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        x509certificate = x509certificate.iterator();
label0:
        do
        {
label1:
            {
                if (!x509certificate.hasNext())
                {
                    break label1;
                }
                String s = (String)x509certificate.next();
                if (s.equals("1.3.6.1.5.5.7.3.1") || s.equals("2.5.29.37.0") || s.equals("2.16.840.1.113730.4.1"))
                {
                    continue;
                }
                if (s.equals("1.3.6.1.4.1.311.10.3.3"))
                {
                    return true;
                }
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte abyte0[][], String s, String s1)
        throws KeyStoreException, NoSuchAlgorithmException
    {
        X509Certificate ax509certificate[];
label0:
        {
            if (abyte0 == null || abyte0.length == 0 || abyte0[0] == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=").append(Arrays.deepToString(abyte0)).toString());
            }
            int i;
            try
            {
                ensureInitialized();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-1);
            }
            ax509certificate = new X509Certificate[abyte0.length];
            i = 0;
            do
            {
                try
                {
                    if (i >= abyte0.length)
                    {
                        break;
                    }
                    ax509certificate[i] = createCertificateFromBytes(abyte0[i]);
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[][])
                {
                    return new AndroidCertVerifyResult(-5);
                }
                i++;
            } while (true);
            try
            {
                ax509certificate[0].checkValidity();
                if (verifyKeyUsage(ax509certificate[0]))
                {
                    break label0;
                }
                abyte0 = new AndroidCertVerifyResult(-6);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-3);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-4);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-1);
            }
            return abyte0;
        }
        synchronized (sLock)
        {
            if (sDefaultTrustManager != null)
            {
                break MISSING_BLOCK_LABEL_199;
            }
            abyte0 = new AndroidCertVerifyResult(-1);
        }
        return abyte0;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0 = sDefaultTrustManager.checkServerTrusted(ax509certificate, s, s1);
_L2:
        boolean flag = false;
        if (abyte0.size() > 0)
        {
            flag = isKnownRoot((X509Certificate)abyte0.get(abyte0.size() - 1));
        }
        abyte0 = new AndroidCertVerifyResult(0, flag, abyte0);
        obj;
        JVM INSTR monitorexit ;
        return abyte0;
        CertificateException certificateexception;
        certificateexception;
        abyte0 = sTestTrustManager.checkServerTrusted(ax509certificate, s, s1);
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        Log.i("X509Util", (new StringBuilder()).append("Failed to validate the certificate chain, error: ").append(certificateexception.getMessage()).toString());
        abyte0 = new AndroidCertVerifyResult(-2);
        obj;
        JVM INSTR monitorexit ;
        return abyte0;
    }


}
