// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
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

// Referenced classes of package io.fabric.sdk.android.services.network:
//            PinningInfoProvider, CertificateChainCleaner, SystemKeyStore

class PinningTrustManager
    implements X509TrustManager
{

    private static final long PIN_FRESHNESS_DURATION_MILLIS = 0x39ef8b000L;
    private final Set cache = Collections.synchronizedSet(new HashSet());
    private final long pinCreationTimeMillis;
    private final List pins = new LinkedList();
    private final SystemKeyStore systemKeyStore;
    private final TrustManager systemTrustManagers[];

    public PinningTrustManager(SystemKeyStore systemkeystore, PinningInfoProvider pinninginfoprovider)
    {
        systemTrustManagers = initializeSystemTrustManagers(systemkeystore);
        systemKeyStore = systemkeystore;
        pinCreationTimeMillis = pinninginfoprovider.getPinCreationTimeInMillis();
        systemkeystore = pinninginfoprovider.getPins();
        int j = systemkeystore.length;
        for (int i = 0; i < j; i++)
        {
            pinninginfoprovider = systemkeystore[i];
            pins.add(hexStringToByteArray(pinninginfoprovider));
        }

    }

    private void checkPinTrust(X509Certificate ax509certificate[])
        throws CertificateException
    {
        if (pinCreationTimeMillis == -1L || System.currentTimeMillis() - pinCreationTimeMillis <= 0x39ef8b000L) goto _L2; else goto _L1
_L1:
        Fabric.getLogger().w("Fabric", (new StringBuilder()).append("Certificate pins are stale, (").append(System.currentTimeMillis() - pinCreationTimeMillis).append(" millis vs ").append(0x39ef8b000L).append(" millis) ").append("falling back to system trust.").toString());
_L4:
        return;
_L2:
        ax509certificate = CertificateChainCleaner.getCleanChain(ax509certificate, systemKeyStore);
        int j = ax509certificate.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (isValidPin(ax509certificate[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        throw new CertificateException("No valid pins found in chain!");
    }

    private void checkSystemTrust(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        TrustManager atrustmanager[] = systemTrustManagers;
        int j = atrustmanager.length;
        for (int i = 0; i < j; i++)
        {
            ((X509TrustManager)atrustmanager[i]).checkServerTrusted(ax509certificate, s);
        }

    }

    private byte[] hexStringToByteArray(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    private TrustManager[] initializeSystemTrustManagers(SystemKeyStore systemkeystore)
    {
        try
        {
            TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance("X509");
            trustmanagerfactory.init(systemkeystore.trustStore);
            systemkeystore = trustmanagerfactory.getTrustManagers();
        }
        // Misplaced declaration of an exception variable
        catch (SystemKeyStore systemkeystore)
        {
            throw new AssertionError(systemkeystore);
        }
        // Misplaced declaration of an exception variable
        catch (SystemKeyStore systemkeystore)
        {
            throw new AssertionError(systemkeystore);
        }
        return systemkeystore;
    }

    private boolean isValidPin(X509Certificate x509certificate)
        throws CertificateException
    {
        Iterator iterator;
        x509certificate = MessageDigest.getInstance("SHA1").digest(x509certificate.getPublicKey().getEncoded());
        iterator = pins.iterator();
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

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        if (cache.contains(ax509certificate[0]))
        {
            return;
        } else
        {
            checkSystemTrust(ax509certificate, s);
            checkPinTrust(ax509certificate);
            cache.add(ax509certificate[0]);
            return;
        }
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }
}
