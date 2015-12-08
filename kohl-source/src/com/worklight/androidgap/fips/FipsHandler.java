// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.fips;

import android.content.Context;
import android.util.Base64;
import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.fips.FipsHttpClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;
import org.json.JSONObject;

public class FipsHandler
{

    private static final String ERROR_LOG_PREFIX = "Error processing X509Certificate: ";
    private static FipsHandler fipsHandler = null;
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/fips/FipsHandler.getName());
    private FipsHttpClient clnt;

    private FipsHandler(Context context)
    {
        if (System.getProperty("javax.net.ssl.trustStore") != null)
        {
            if (!(new File(context.getFilesDir(), "ca-bundle.crt")).exists())
            {
                saveCrtBundle(context);
            }
        } else
        {
            saveCrtBundle(context);
        }
        FipsHttpClient.setCtx(context);
        WLUtils.loadLib(context, "libcrypto.so.1.0.0");
        WLUtils.loadLib(context, "libssl.so.1.0.0");
        clnt = new FipsHttpClient(null, null);
    }

    public static FipsHandler getInstance(Context context)
    {
        com/worklight/androidgap/fips/FipsHandler;
        JVM INSTR monitorenter ;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new RuntimeException("Cannot pass null Context parameter");
        context;
        com/worklight/androidgap/fips/FipsHandler;
        JVM INSTR monitorexit ;
        throw context;
        if (fipsHandler == null)
        {
            fipsHandler = new FipsHandler(context);
        }
        context = fipsHandler;
        com/worklight/androidgap/fips/FipsHandler;
        JVM INSTR monitorexit ;
        return context;
    }

    private void saveCrtBundle(Context context)
    {
        Object obj;
        obj = new File(context.getFilesDir(), "ca-bundle.crt");
        context = null;
        X509Certificate ax509certificate[];
        int j;
        obj = new FileOutputStream(((File) (obj)));
        TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustmanagerfactory.init((KeyStore)null);
        ax509certificate = ((X509TrustManager)trustmanagerfactory.getTrustManagers()[0]).getAcceptedIssuers();
        j = ax509certificate.length;
        int i = 0;
_L2:
        X509Certificate x509certificate;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        x509certificate = ax509certificate[i];
        byte abyte1[] = "-----BEGIN CERTIFICATE-----\n".getBytes("UTF-8");
        ((OutputStream) (obj)).write(abyte1, 0, abyte1.length);
        byte abyte0[] = Base64.encode(x509certificate.getEncoded(), 0);
        ((OutputStream) (obj)).write(abyte0, 0, abyte0.length);
        abyte0 = "-----END CERTIFICATE-----\n".getBytes("UTF-8");
        ((OutputStream) (obj)).write(abyte0, 0, abyte0.length);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        logger.error("Error processing X509Certificate: ", ioexception);
          goto _L3
_L1:
        try
        {
            ((OutputStream) (obj)).flush();
            ((OutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (context != null)
        {
            logger.error("Error processing X509Certificate: ", context);
        }
        return;
        certificateencodingexception;
        logger.error("Error processing X509Certificate: ", certificateencodingexception);
          goto _L3
    }

    public String VPNWLSend(String s, String s1, JSONObject jsonobject, String s2)
        throws IOException
    {
        Object obj = null;
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        String as[];
        Iterator iterator;
        int i;
        iterator = jsonobject.keys();
        as = new String[jsonobject.length()];
        i = 0;
_L3:
        obj = as;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        String s3 = jsonobject.get(((String) (obj))).toString();
        as[i] = (new StringBuilder()).append(((String) (obj))).append(": ").append(s3).toString();
        i++;
        continue; /* Loop/switch isn't completed */
        obj;
        logger.error("addHeader error: ", ((Throwable) (obj)));
        if (true) goto _L3; else goto _L2
_L2:
        if (s1.equalsIgnoreCase("get"))
        {
            return clnt.executeRaw(s, "get", null, ((String []) (obj)));
        } else
        {
            return clnt.executeRaw(s, "post", s2, ((String []) (obj)));
        }
    }

    public FipsHttpClient getHttpClientInstance()
    {
        return clnt;
    }

    public void resetCookies()
    {
        clnt.resetCookies();
    }

}
