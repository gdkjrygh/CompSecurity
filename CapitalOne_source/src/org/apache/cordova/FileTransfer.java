// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import android.webkit.CookieManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, FileUploadResult, FileProgressResult, FileUtils

public class FileTransfer extends CordovaPlugin
{
    private static final class DoneHandlerInputStream extends FilterInputStream
    {

        private boolean done;

        public int read()
            throws IOException
        {
            int i;
            boolean flag;
            if (done)
            {
                i = -1;
            } else
            {
                i = super.read();
            }
            if (i == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            done = flag;
            return i;
        }

        public int read(byte abyte0[])
            throws IOException
        {
            int i;
            boolean flag;
            if (done)
            {
                i = -1;
            } else
            {
                i = super.read(abyte0);
            }
            if (i == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            done = flag;
            return i;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            boolean flag;
            if (done)
            {
                i = -1;
            } else
            {
                i = super.read(abyte0, i, j);
            }
            if (i == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            done = flag;
            return i;
        }

        public DoneHandlerInputStream(InputStream inputstream)
        {
            super(inputstream);
        }
    }

    private static final class RequestContext
    {

        boolean aborted;
        CallbackContext callbackContext;
        InputStream currentInputStream;
        OutputStream currentOutputStream;
        String source;
        String target;

        void sendPluginResult(PluginResult pluginresult)
        {
            this;
            JVM INSTR monitorenter ;
            if (!aborted)
            {
                callbackContext.sendPluginResult(pluginresult);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            pluginresult;
            this;
            JVM INSTR monitorexit ;
            throw pluginresult;
        }

        RequestContext(String s, String s1, CallbackContext callbackcontext)
        {
            source = s;
            target = s1;
            callbackContext = callbackcontext;
        }
    }


    public static int ABORTED_ERR = 0;
    private static final String BOUNDARY = "+++++";
    public static int CONNECTION_ERR = 0;
    private static final HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {

        public boolean verify(String s, SSLSession sslsession)
        {
            return true;
        }

    };
    public static int FILE_NOT_FOUND_ERR = 0;
    public static int INVALID_URL_ERR = 0;
    private static final String LINE_END = "\r\n";
    private static final String LINE_START = "--";
    private static final String LOG_TAG = "FileTransfer";
    private static final int MAX_BUFFER_SIZE = 16384;
    private static HashMap activeRequests = new HashMap();
    private static final TrustManager trustAllCerts[] = {
        new X509TrustManager() {

            public void checkClientTrusted(X509Certificate ax509certificate[], String s)
                throws CertificateException
            {
            }

            public void checkServerTrusted(X509Certificate ax509certificate[], String s)
                throws CertificateException
            {
            }

            public X509Certificate[] getAcceptedIssuers()
            {
                return new X509Certificate[0];
            }

        }
    };

    public FileTransfer()
    {
    }

    private void abort(final String context)
    {
        synchronized (activeRequests)
        {
            context = (RequestContext)activeRequests.remove(context);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = createFileTransferError(ABORTED_ERR, ((RequestContext) (context)).source, ((RequestContext) (context)).target, Integer.valueOf(-1));
        context;
        JVM INSTR monitorenter ;
        context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, ((JSONObject) (obj))));
        context.aborted = true;
        context;
        JVM INSTR monitorexit ;
        cordova.getThreadPool().execute(new Runnable() {

            final FileTransfer this$0;
            final RequestContext val$context;

            public void run()
            {
                synchronized (context)
                {
                    FileTransfer.safeClose(context.currentInputStream);
                    FileTransfer.safeClose(context.currentOutputStream);
                }
                return;
                exception1;
                requestcontext;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                this$0 = FileTransfer.this;
                context = requestcontext;
                super();
            }
        });
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static JSONObject createFileTransferError(int i, String s, String s1, Integer integer)
    {
        Object obj = null;
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("code", i);
        jsonobject.put("source", s);
        jsonobject.put("target", s1);
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        jsonobject.put("http_status", integer);
        return jsonobject;
        s;
        s1 = obj;
_L2:
        Log.e("FileTransfer", s.getMessage(), s);
        return s1;
        s;
        s1 = jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static JSONObject createFileTransferError(int i, String s, String s1, HttpURLConnection httpurlconnection)
    {
        Integer integer;
        Object obj;
        obj = null;
        integer = obj;
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        int j = httpurlconnection.getResponseCode();
        integer = Integer.valueOf(j);
_L2:
        return createFileTransferError(i, s, s1, integer);
        httpurlconnection;
        Log.w("FileTransfer", "Error getting HTTP status code from connection.", httpurlconnection);
        integer = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void download(final String source, final String target, final JSONArray objectId, CallbackContext callbackcontext)
        throws JSONException
    {
        Log.d("FileTransfer", (new StringBuilder()).append("download ").append(source).append(" to ").append(target).toString());
        final boolean trustEveryone = objectId.optBoolean(2);
        objectId = objectId.getString(3);
        final URL url;
        final boolean useHttps;
        try
        {
            url = new URL(source);
        }
        // Misplaced declaration of an exception variable
        catch (final JSONArray objectId)
        {
            source = createFileTransferError(INVALID_URL_ERR, source, target, Integer.valueOf(0));
            Log.e("FileTransfer", source.toString(), objectId);
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, source));
            return;
        }
        useHttps = url.getProtocol().toLowerCase().equals("https");
        if (!webView.isUrlWhiteListed(source))
        {
            Log.w("FileTransfer", (new StringBuilder()).append("Source URL is not in white list: '").append(source).append("'").toString());
            source = createFileTransferError(CONNECTION_ERR, source, target, Integer.valueOf(401));
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, source));
            return;
        }
        final RequestContext context = new RequestContext(source, target, callbackcontext);
        synchronized (activeRequests)
        {
            activeRequests.put(objectId, context);
        }
        cordova.getThreadPool().execute(new Runnable() {

            final FileTransfer this$0;
            final RequestContext val$context;
            final String val$objectId;
            final String val$source;
            final String val$target;
            final boolean val$trustEveryone;
            final URL val$url;
            final boolean val$useHttps;

            public void run()
            {
                if (!context.aborted) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Object obj6;
                Object obj7;
                SSLSocketFactory sslsocketfactory;
                Object obj9;
                Object obj10;
                SSLSocketFactory sslsocketfactory1;
                Object obj11;
                SSLSocketFactory sslsocketfactory2;
                Object obj12;
                SSLSocketFactory sslsocketfactory3;
                Object obj13;
                SSLSocketFactory sslsocketfactory4;
                Object obj14;
                Object obj15;
                Object obj16;
                Object obj17;
                Object obj18;
                Object obj19;
                FileOutputStream fileoutputstream;
                FileProgressResult fileprogressresult;
                Object obj20;
                Object obj21;
                Object obj22;
                Object obj23;
                Object obj24;
                Object obj25;
                Object obj26;
                Object obj27;
                Object obj28;
                Object obj29;
                obj18 = null;
                obj19 = null;
                fileoutputstream = null;
                fileprogressresult = null;
                obj = null;
                obj20 = null;
                obj21 = null;
                obj22 = null;
                obj23 = null;
                obj24 = null;
                obj7 = null;
                obj25 = null;
                obj26 = null;
                obj27 = null;
                obj28 = null;
                obj29 = null;
                sslsocketfactory = null;
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                File file = getFileFromPath(target);
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                file.getParentFile().mkdirs();
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                if (!useHttps) goto _L4; else goto _L3
_L3:
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                if (trustEveryone) goto _L6; else goto _L5
_L5:
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                obj = (HttpsURLConnection)url.openConnection();
_L7:
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestMethod("GET");
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                obj18 = CookieManager.getInstance().getCookie(source);
                if (obj18 == null)
                {
                    break MISSING_BLOCK_LABEL_583;
                }
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestProperty("cookie", ((String) (obj18)));
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                ((HttpURLConnection) (obj)).connect();
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                Log.d("FileTransfer", (new StringBuilder()).append("Download file:").append(url).toString());
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                fileprogressresult = new FileProgressResult();
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                if (((HttpURLConnection) (obj)).getContentEncoding() != null)
                {
                    break MISSING_BLOCK_LABEL_965;
                }
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                fileprogressresult.setLengthComputable(true);
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                fileprogressresult.setTotal(((HttpURLConnection) (obj)).getContentLength());
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                fileoutputstream = new FileOutputStream(file);
                obj18 = null;
                obj19 = FileTransfer.getInputStream(((HttpURLConnection) (obj)));
                obj18 = obj19;
                obj5 = context;
                obj18 = obj19;
                obj5;
                JVM INSTR monitorenter ;
                if (!context.aborted)
                {
                    break MISSING_BLOCK_LABEL_1645;
                }
                obj5;
                JVM INSTR monitorexit ;
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                context.currentInputStream = null;
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj19)));
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                FileTransfer.safeClose(fileoutputstream);
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj != null)
                {
                    if (trustEveryone && useHttps)
                    {
                        obj5 = (HttpsURLConnection)obj;
                        ((HttpsURLConnection) (obj5)).setHostnameVerifier(((HostnameVerifier) (obj7)));
                        ((HttpsURLConnection) (obj5)).setSSLSocketFactory(sslsocketfactory);
                    }
                    ((HttpURLConnection) (obj)).disconnect();
                    return;
                }
                  goto _L1
_L6:
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                HttpsURLConnection httpsurlconnection = (HttpsURLConnection)url.openConnection();
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                sslsocketfactory = FileTransfer.trustAllHosts(httpsurlconnection);
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = sslsocketfactory;
                obj7 = httpsurlconnection.getHostnameVerifier();
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj18;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj19;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = fileoutputstream;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = fileprogressresult;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                httpsurlconnection.setHostnameVerifier(FileTransfer.DO_NOT_VERIFY);
                obj = httpsurlconnection;
                  goto _L7
_L4:
                obj14 = obj;
                obj10 = obj20;
                sslsocketfactory1 = obj25;
                obj15 = obj18;
                obj11 = obj21;
                sslsocketfactory2 = obj26;
                obj17 = obj19;
                obj13 = obj22;
                sslsocketfactory4 = obj27;
                obj16 = fileoutputstream;
                obj12 = obj23;
                sslsocketfactory3 = obj28;
                obj9 = fileprogressresult;
                obj5 = obj24;
                obj6 = obj29;
                obj = (HttpURLConnection)url.openConnection();
                  goto _L7
                obj;
                obj5;
                JVM INSTR monitorexit ;
                throw obj;
                context.currentInputStream = ((InputStream) (obj19));
                obj5;
                JVM INSTR monitorexit ;
                obj18 = obj19;
                obj5 = new byte[16384];
                long l = 0L;
_L9:
                obj18 = obj19;
                int i = ((InputStream) (obj19)).read(((byte []) (obj5)));
                if (i <= 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                obj18 = obj19;
                fileoutputstream.write(((byte []) (obj5)), 0, i);
                l += i;
                obj18 = obj19;
                fileprogressresult.setLoaded(l);
                obj18 = obj19;
                obj6 = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, fileprogressresult.toJSONObject());
                obj18 = obj19;
                ((PluginResult) (obj6)).setKeepCallback(true);
                obj18 = obj19;
                context.sendPluginResult(((PluginResult) (obj6)));
                if (true) goto _L9; else goto _L8
                obj19;
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                context.currentInputStream = null;
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj18)));
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                FileTransfer.safeClose(fileoutputstream);
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                throw obj19;
                obj;
                obj9 = obj14;
                obj5 = obj10;
                obj6 = sslsocketfactory1;
                obj7 = FileTransfer.createFileTransferError(FileTransfer.FILE_NOT_FOUND_ERR, source, target, ((HttpURLConnection) (obj14)));
                obj9 = obj14;
                obj5 = obj10;
                obj6 = sslsocketfactory1;
                Log.e("FileTransfer", ((JSONObject) (obj7)).toString(), ((Throwable) (obj)));
                obj9 = obj14;
                obj5 = obj10;
                obj6 = sslsocketfactory1;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, ((JSONObject) (obj7))));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj14 == null) goto _L1; else goto _L10
_L10:
                if (trustEveryone && useHttps)
                {
                    obj = (HttpsURLConnection)obj14;
                    ((HttpsURLConnection) (obj)).setHostnameVerifier(((HostnameVerifier) (obj10)));
                    ((HttpsURLConnection) (obj)).setSSLSocketFactory(sslsocketfactory1);
                }
                ((HttpURLConnection) (obj14)).disconnect();
                return;
                obj6;
                obj5;
                JVM INSTR monitorexit ;
                obj18 = obj19;
                throw obj6;
_L8:
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                context.currentInputStream = null;
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj19)));
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                FileTransfer.safeClose(fileoutputstream);
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                Log.d("FileTransfer", (new StringBuilder()).append("Saved file: ").append(target).toString());
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                obj18 = (new FileUtils()).getEntry(file);
                obj14 = obj;
                obj10 = obj7;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj11 = obj7;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj13 = obj7;
                sslsocketfactory4 = sslsocketfactory;
                obj16 = obj;
                obj12 = obj7;
                sslsocketfactory3 = sslsocketfactory;
                obj9 = obj;
                obj5 = obj7;
                obj6 = sslsocketfactory;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, ((JSONObject) (obj18))));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj == null) goto _L1; else goto _L11
_L11:
                if (trustEveryone && useHttps)
                {
                    obj5 = (HttpsURLConnection)obj;
                    ((HttpsURLConnection) (obj5)).setHostnameVerifier(((HostnameVerifier) (obj7)));
                    ((HttpsURLConnection) (obj5)).setSSLSocketFactory(sslsocketfactory);
                }
                ((HttpURLConnection) (obj)).disconnect();
                return;
                obj;
                obj5;
                JVM INSTR monitorexit ;
                throw obj;
                obj5;
                obj;
                JVM INSTR monitorexit ;
                throw obj5;
                Object obj1;
                obj1;
                obj9 = obj15;
                obj5 = obj11;
                obj6 = sslsocketfactory2;
                obj7 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, source, target, ((HttpURLConnection) (obj15)));
                obj9 = obj15;
                obj5 = obj11;
                obj6 = sslsocketfactory2;
                Log.e("FileTransfer", ((JSONObject) (obj7)).toString(), ((Throwable) (obj1)));
                obj9 = obj15;
                obj5 = obj11;
                obj6 = sslsocketfactory2;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, ((JSONObject) (obj7))));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj15 == null) goto _L1; else goto _L12
_L12:
                if (trustEveryone && useHttps)
                {
                    obj2 = (HttpsURLConnection)obj15;
                    ((HttpsURLConnection) (obj2)).setHostnameVerifier(((HostnameVerifier) (obj11)));
                    ((HttpsURLConnection) (obj2)).setSSLSocketFactory(sslsocketfactory2);
                }
                ((HttpURLConnection) (obj15)).disconnect();
                return;
                obj5;
                obj2;
                JVM INSTR monitorexit ;
                throw obj5;
                obj2;
                obj9 = obj17;
                obj5 = obj13;
                obj6 = sslsocketfactory4;
                Log.e("FileTransfer", ((JSONException) (obj2)).getMessage(), ((Throwable) (obj2)));
                obj9 = obj17;
                obj5 = obj13;
                obj6 = sslsocketfactory4;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj17 == null) goto _L1; else goto _L13
_L13:
                if (trustEveryone && useHttps)
                {
                    obj3 = (HttpsURLConnection)obj17;
                    ((HttpsURLConnection) (obj3)).setHostnameVerifier(((HostnameVerifier) (obj13)));
                    ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory4);
                }
                ((HttpURLConnection) (obj17)).disconnect();
                return;
                obj5;
                obj3;
                JVM INSTR monitorexit ;
                throw obj5;
                obj3;
                obj9 = obj16;
                obj5 = obj12;
                obj6 = sslsocketfactory3;
                obj7 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, source, target, ((HttpURLConnection) (obj16)));
                obj9 = obj16;
                obj5 = obj12;
                obj6 = sslsocketfactory3;
                Log.e("FileTransfer", ((JSONObject) (obj7)).toString(), ((Throwable) (obj3)));
                obj9 = obj16;
                obj5 = obj12;
                obj6 = sslsocketfactory3;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, ((JSONObject) (obj7))));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj16 == null) goto _L1; else goto _L14
_L14:
                if (trustEveryone && useHttps)
                {
                    obj4 = (HttpsURLConnection)obj16;
                    ((HttpsURLConnection) (obj4)).setHostnameVerifier(((HostnameVerifier) (obj12)));
                    ((HttpsURLConnection) (obj4)).setSSLSocketFactory(sslsocketfactory3);
                }
                ((HttpURLConnection) (obj16)).disconnect();
                return;
                obj5;
                obj4;
                JVM INSTR monitorexit ;
                throw obj5;
                obj4;
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj9 != null)
                {
                    if (trustEveryone && useHttps)
                    {
                        obj8 = (HttpsURLConnection)obj9;
                        ((HttpsURLConnection) (obj8)).setHostnameVerifier(((HostnameVerifier) (obj5)));
                        ((HttpsURLConnection) (obj8)).setSSLSocketFactory(((SSLSocketFactory) (obj6)));
                    }
                    ((HttpURLConnection) (obj9)).disconnect();
                }
                throw obj4;
                exception;
                obj8;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = FileTransfer.this;
                context = requestcontext;
                target = s;
                useHttps = flag;
                trustEveryone = flag1;
                url = url1;
                source = s1;
                objectId = s2;
                super();
            }
        });
        return;
        source;
        callbackcontext;
        JVM INSTR monitorexit ;
        throw source;
    }

    private static String getArgument(JSONArray jsonarray, int i, String s)
    {
        Object obj;
label0:
        {
            obj = s;
            if (jsonarray.length() < i)
            {
                break label0;
            }
            jsonarray = jsonarray.optString(i);
            if (jsonarray != null)
            {
                obj = jsonarray;
                if (!"null".equals(jsonarray))
                {
                    break label0;
                }
            }
            obj = s;
        }
        return ((String) (obj));
    }

    private File getFileFromPath(String s)
        throws FileNotFoundException
    {
        if (s.startsWith("file://"))
        {
            s = new File(s.substring("file://".length()));
        } else
        {
            s = new File(s);
        }
        if (s.getParent() == null)
        {
            throw new FileNotFoundException();
        } else
        {
            return s;
        }
    }

    private static InputStream getInputStream(HttpURLConnection httpurlconnection)
        throws IOException
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return new DoneHandlerInputStream(httpurlconnection.getInputStream());
        } else
        {
            return httpurlconnection.getInputStream();
        }
    }

    private InputStream getPathFromUri(String s)
        throws FileNotFoundException
    {
        if (s.startsWith("content:"))
        {
            s = Uri.parse(s);
            return cordova.getActivity().getContentResolver().openInputStream(s);
        }
        if (s.startsWith("file://"))
        {
            int i = s.indexOf("?");
            if (i == -1)
            {
                return new FileInputStream(s.substring(7));
            } else
            {
                return new FileInputStream(s.substring(7, i));
            }
        } else
        {
            return new FileInputStream(s);
        }
    }

    private static void safeClose(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    private static SSLSocketFactory trustAllHosts(HttpsURLConnection httpsurlconnection)
    {
        SSLSocketFactory sslsocketfactory = httpsurlconnection.getSSLSocketFactory();
        try
        {
            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, trustAllCerts, new SecureRandom());
            httpsurlconnection.setSSLSocketFactory(sslcontext.getSocketFactory());
        }
        // Misplaced declaration of an exception variable
        catch (HttpsURLConnection httpsurlconnection)
        {
            Log.e("FileTransfer", httpsurlconnection.getMessage(), httpsurlconnection);
            return sslsocketfactory;
        }
        return sslsocketfactory;
    }

    private void upload(final String source, final String target, final JSONArray objectId, CallbackContext callbackcontext)
        throws JSONException
    {
        Log.d("FileTransfer", (new StringBuilder()).append("upload ").append(source).append(" to ").append(target).toString());
        final String fileKey = getArgument(objectId, 2, "file");
        final String fileName = getArgument(objectId, 3, "image.jpg");
        final String mimeType = getArgument(objectId, 4, "image/jpeg");
        final JSONObject params;
        final JSONObject headers;
        final URL url;
        final RequestContext context;
        final boolean chunkedMode;
        final boolean trustEveryone;
        final boolean useHttps;
        if (objectId.optJSONObject(5) == null)
        {
            params = new JSONObject();
        } else
        {
            params = objectId.optJSONObject(5);
        }
        trustEveryone = objectId.optBoolean(6);
        if (objectId.optBoolean(7) || objectId.isNull(7))
        {
            chunkedMode = true;
        } else
        {
            chunkedMode = false;
        }
        if (objectId.optJSONObject(8) == null)
        {
            headers = params.optJSONObject("headers");
        } else
        {
            headers = objectId.optJSONObject(8);
        }
        objectId = objectId.getString(9);
        Log.d("FileTransfer", (new StringBuilder()).append("fileKey: ").append(fileKey).toString());
        Log.d("FileTransfer", (new StringBuilder()).append("fileName: ").append(fileName).toString());
        Log.d("FileTransfer", (new StringBuilder()).append("mimeType: ").append(mimeType).toString());
        Log.d("FileTransfer", (new StringBuilder()).append("params: ").append(params).toString());
        Log.d("FileTransfer", (new StringBuilder()).append("trustEveryone: ").append(trustEveryone).toString());
        Log.d("FileTransfer", (new StringBuilder()).append("chunkedMode: ").append(chunkedMode).toString());
        Log.d("FileTransfer", (new StringBuilder()).append("headers: ").append(headers).toString());
        Log.d("FileTransfer", (new StringBuilder()).append("objectId: ").append(objectId).toString());
        try
        {
            url = new URL(target);
        }
        // Misplaced declaration of an exception variable
        catch (final JSONArray objectId)
        {
            source = createFileTransferError(INVALID_URL_ERR, source, target, Integer.valueOf(0));
            Log.e("FileTransfer", source.toString(), objectId);
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, source));
            return;
        }
        useHttps = url.getProtocol().toLowerCase().equals("https");
        context = new RequestContext(source, target, callbackcontext);
        synchronized (activeRequests)
        {
            activeRequests.put(objectId, context);
        }
        cordova.getThreadPool().execute(new Runnable() {

            final FileTransfer this$0;
            final boolean val$chunkedMode;
            final RequestContext val$context;
            final String val$fileKey;
            final String val$fileName;
            final JSONObject val$headers;
            final String val$mimeType;
            final String val$objectId;
            final JSONObject val$params;
            final String val$source;
            final String val$target;
            final boolean val$trustEveryone;
            final URL val$url;
            final boolean val$useHttps;

            public void run()
            {
                if (!context.aborted) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Object obj4;
                Object obj5;
                SSLSocketFactory sslsocketfactory;
                Object obj7;
                Object obj8;
                Object obj9;
                SSLSocketFactory sslsocketfactory1;
                Object obj10;
                SSLSocketFactory sslsocketfactory2;
                Object obj11;
                SSLSocketFactory sslsocketfactory3;
                Object obj12;
                Object obj13;
                Object obj14;
                Object obj15;
                Object obj16;
                Object obj17;
                Object obj18;
                Object obj19;
                String s;
                byte abyte1[];
                Object obj20;
                Object obj21;
                Object obj22;
                Object obj23;
                Object obj24;
                Object obj25;
                Object obj26;
                Object obj27;
                Object obj28;
                obj7 = null;
                obj18 = null;
                obj19 = null;
                s = null;
                obj = null;
                abyte1 = null;
                obj20 = null;
                obj21 = null;
                obj22 = null;
                obj23 = null;
                obj5 = null;
                obj24 = null;
                obj25 = null;
                obj26 = null;
                obj27 = null;
                obj28 = null;
                sslsocketfactory = null;
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                FileUploadResult fileuploadresult = new FileUploadResult();
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                FileProgressResult fileprogressresult = new FileProgressResult();
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                if (!useHttps) goto _L4; else goto _L3
_L3:
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                if (trustEveryone) goto _L6; else goto _L5
_L5:
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                obj = (HttpsURLConnection)url.openConnection();
_L11:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setDoInput(true);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setDoOutput(true);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setUseCaches(false);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestMethod("POST");
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestProperty("Connection", "Keep-Alive");
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "multipart/form-data;boundary=+++++");
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj7 = CookieManager.getInstance().getCookie(target);
                if (obj7 == null)
                {
                    break MISSING_BLOCK_LABEL_875;
                }
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestProperty("Cookie", ((String) (obj7)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj7 = headers;
                if (obj7 == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj13 = headers.keys();
_L8:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (!((Iterator) (obj13)).hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj17 = ((Iterator) (obj13)).next().toString();
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj12 = headers.optJSONArray(((String) (obj17)));
                obj7 = obj12;
                if (obj12 != null)
                {
                    break MISSING_BLOCK_LABEL_1266;
                }
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj7 = new JSONArray();
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((JSONArray) (obj7)).put(headers.getString(((String) (obj17))));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestProperty(((String) (obj17)), ((JSONArray) (obj7)).getString(0));
                int i = 1;
_L9:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (i >= ((JSONArray) (obj7)).length()) goto _L8; else goto _L7
_L7:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).addRequestProperty(((String) (obj17)), ((JSONArray) (obj7)).getString(i));
                i++;
                  goto _L9
_L6:
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                HttpsURLConnection httpsurlconnection = (HttpsURLConnection)url.openConnection();
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                sslsocketfactory = FileTransfer.trustAllHosts(httpsurlconnection);
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = sslsocketfactory;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = s;
                obj3 = obj23;
                obj4 = sslsocketfactory;
                obj5 = httpsurlconnection.getHostnameVerifier();
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj7;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj18;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj19;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = s;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                httpsurlconnection.setHostnameVerifier(FileTransfer.DO_NOT_VERIFY);
                obj = httpsurlconnection;
                continue; /* Loop/switch isn't completed */
_L4:
                obj14 = obj;
                obj9 = abyte1;
                sslsocketfactory1 = obj24;
                obj15 = obj7;
                obj10 = obj20;
                sslsocketfactory2 = obj25;
                obj17 = obj18;
                obj12 = obj21;
                obj13 = obj26;
                obj16 = obj19;
                obj11 = obj22;
                sslsocketfactory3 = obj27;
                obj8 = s;
                obj3 = obj23;
                obj4 = obj28;
                obj = (HttpURLConnection)url.openConnection();
                if (true) goto _L11; else goto _L10
_L10:
                obj12 = "";
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj13 = params.keys();
_L13:
                obj7 = obj12;
                obj18 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (!((Iterator) (obj13)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_2449;
                }
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj17 = ((Iterator) (obj13)).next();
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (String.valueOf(obj17).equals("headers")) goto _L13; else goto _L12
_L12:
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj12 = (new StringBuilder()).append(((String) (obj12))).append("--+++++\r\n").toString();
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj12 = (new StringBuilder()).append(((String) (obj12))).append("Content-Disposition: form-data; name=\"").append(obj17.toString()).append("\";").toString();
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj12 = (new StringBuilder()).append(((String) (obj12))).append("\r\n\r\n").toString();
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj12 = (new StringBuilder()).append(((String) (obj12))).append(params.getString(obj17.toString())).toString();
                obj7 = obj12;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj12 = (new StringBuilder()).append(((String) (obj12))).append("\r\n").toString();
                  goto _L13
                obj18;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                Log.e("FileTransfer", ((JSONException) (obj18)).getMessage(), ((Throwable) (obj18)));
                obj18 = obj7;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj7 = (new StringBuilder()).append(((String) (obj18))).append("--+++++\r\n").toString();
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                byte abyte0[] = (new StringBuilder()).append(((String) (obj7))).append("Content-Disposition: form-data; name=\"").append(fileKey).append("\";").append(" filename=\"").toString().getBytes("UTF-8");
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                s = (new StringBuilder()).append("\"\r\nContent-Type: ").append(mimeType).append("\r\n").append("\r\n").toString();
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                abyte1 = fileName.getBytes("UTF-8");
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                obj19 = getPathFromUri(source);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                int j = abyte0.length + s.length() + "\r\n--+++++--\r\n".length() + abyte1.length;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                Log.d("FileTransfer", (new StringBuilder()).append("String Length: ").append(j).toString());
                i = -1;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (!(obj19 instanceof FileInputStream))
                {
                    break MISSING_BLOCK_LABEL_3246;
                }
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                i = (int)((FileInputStream)obj19).getChannel().size() + j;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                fileprogressresult.setLengthComputable(true);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                fileprogressresult.setTotal(i);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                Log.d("FileTransfer", (new StringBuilder()).append("Content Length: ").append(i).toString());
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (!chunkedMode) goto _L15; else goto _L14
_L14:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (android.os.Build.VERSION.SDK_INT < 8) goto _L17; else goto _L16
_L16:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                if (!useHttps) goto _L15; else goto _L17
_L23:
                if (j == 0) goto _L19; else goto _L18
_L18:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setChunkedStreamingMode(16384);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setRequestProperty("Transfer-Encoding", "chunked");
_L24:
                obj3 = null;
                obj7 = new DataOutputStream(((HttpURLConnection) (obj)).getOutputStream());
                obj3 = context;
                obj3;
                JVM INSTR monitorenter ;
                if (!context.aborted) goto _L21; else goto _L20
_L20:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj19)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj7)));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj != null)
                {
                    if (trustEveryone && useHttps)
                    {
                        obj3 = (HttpsURLConnection)obj;
                        ((HttpsURLConnection) (obj3)).setHostnameVerifier(((HostnameVerifier) (obj5)));
                        ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory);
                    }
                    ((HttpURLConnection) (obj)).disconnect();
                    return;
                }
                  goto _L1
_L15:
                j = 0;
                  goto _L22
_L37:
                j = 0;
                  goto _L23
_L19:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                ((HttpURLConnection) (obj)).setFixedLengthStreamingMode(i);
                  goto _L24
                obj;
                obj8 = obj14;
                obj3 = obj9;
                obj4 = sslsocketfactory1;
                obj5 = FileTransfer.createFileTransferError(FileTransfer.FILE_NOT_FOUND_ERR, source, target, ((HttpURLConnection) (obj14)));
                obj8 = obj14;
                obj3 = obj9;
                obj4 = sslsocketfactory1;
                Log.e("FileTransfer", ((JSONObject) (obj5)).toString(), ((Throwable) (obj)));
                obj8 = obj14;
                obj3 = obj9;
                obj4 = sslsocketfactory1;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, ((JSONObject) (obj5))));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj14 == null) goto _L1; else goto _L25
_L25:
                if (trustEveryone && useHttps)
                {
                    obj = (HttpsURLConnection)obj14;
                    ((HttpsURLConnection) (obj)).setHostnameVerifier(((HostnameVerifier) (obj9)));
                    ((HttpsURLConnection) (obj)).setSSLSocketFactory(sslsocketfactory1);
                }
                ((HttpURLConnection) (obj14)).disconnect();
                return;
                obj;
                obj3;
                JVM INSTR monitorexit ;
                throw obj;
_L21:
                context.currentOutputStream = ((OutputStream) (obj7));
                obj3;
                JVM INSTR monitorexit ;
                int k;
                ((DataOutputStream) (obj7)).write(abyte0);
                ((DataOutputStream) (obj7)).write(abyte1);
                ((DataOutputStream) (obj7)).writeBytes(s);
                j = Math.min(((InputStream) (obj19)).available(), 16384);
                obj3 = new byte[j];
                k = ((InputStream) (obj19)).read(((byte []) (obj3)), 0, j);
                long l;
                long l1;
                l1 = 0L;
                l = 0L;
_L27:
                if (k <= 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                l1 += k;
                fileuploadresult.setBytesSent(l1);
                ((DataOutputStream) (obj7)).write(((byte []) (obj3)), 0, j);
                long l2;
                l2 = l;
                if (l1 <= 0x19000L + l)
                {
                    break MISSING_BLOCK_LABEL_4228;
                }
                l2 = l1;
                Log.d("FileTransfer", (new StringBuilder()).append("Uploaded ").append(l1).append(" of ").append(i).append(" bytes").toString());
                j = Math.min(((InputStream) (obj19)).available(), 16384);
                k = ((InputStream) (obj19)).read(((byte []) (obj3)), 0, j);
                fileprogressresult.setLoaded(l1);
                obj4 = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, fileprogressresult.toJSONObject());
                ((PluginResult) (obj4)).setKeepCallback(true);
                context.sendPluginResult(((PluginResult) (obj4)));
                l = l2;
                if (true) goto _L27; else goto _L26
                abyte0;
_L35:
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj19)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj7)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                throw abyte0;
                obj;
                obj8 = obj15;
                obj3 = obj10;
                obj4 = sslsocketfactory2;
                obj5 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, source, target, ((HttpURLConnection) (obj15)));
                obj8 = obj15;
                obj3 = obj10;
                obj4 = sslsocketfactory2;
                Log.e("FileTransfer", ((JSONObject) (obj5)).toString(), ((Throwable) (obj)));
                obj8 = obj15;
                obj3 = obj10;
                obj4 = sslsocketfactory2;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, ((JSONObject) (obj5))));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj15 == null) goto _L1; else goto _L28
_L28:
                if (trustEveryone && useHttps)
                {
                    obj = (HttpsURLConnection)obj15;
                    ((HttpsURLConnection) (obj)).setHostnameVerifier(((HostnameVerifier) (obj10)));
                    ((HttpsURLConnection) (obj)).setSSLSocketFactory(sslsocketfactory2);
                }
                ((HttpURLConnection) (obj15)).disconnect();
                return;
                obj4;
                obj3;
                JVM INSTR monitorexit ;
                throw obj4;
_L26:
                ((DataOutputStream) (obj7)).writeBytes("\r\n--+++++--\r\n");
                ((DataOutputStream) (obj7)).flush();
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj19)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj7)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                context.currentOutputStream = null;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                i = ((HttpURLConnection) (obj)).getResponseCode();
                obj7 = null;
                abyte0 = FileTransfer.getInputStream(((HttpURLConnection) (obj)));
                obj7 = abyte0;
                obj3 = context;
                obj7 = abyte0;
                obj3;
                JVM INSTR monitorenter ;
                if (!context.aborted)
                {
                    break MISSING_BLOCK_LABEL_5083;
                }
                obj3;
                JVM INSTR monitorexit ;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                context.currentInputStream = null;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(abyte0);
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj == null) goto _L1; else goto _L29
_L29:
                if (trustEveryone && useHttps)
                {
                    obj3 = (HttpsURLConnection)obj;
                    ((HttpsURLConnection) (obj3)).setHostnameVerifier(((HostnameVerifier) (obj5)));
                    ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory);
                }
                ((HttpURLConnection) (obj)).disconnect();
                return;
                obj;
                obj3;
                JVM INSTR monitorexit ;
                throw obj;
                context.currentInputStream = abyte0;
                obj3;
                JVM INSTR monitorexit ;
                obj7 = abyte0;
                obj3 = new ByteArrayOutputStream();
                obj7 = abyte0;
                obj4 = new byte[1024];
_L31:
                obj7 = abyte0;
                j = abyte0.read(((byte []) (obj4)));
                if (j <= 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                obj7 = abyte0;
                ((ByteArrayOutputStream) (obj3)).write(((byte []) (obj4)), 0, j);
                if (true) goto _L31; else goto _L30
                abyte0;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                context.currentInputStream = null;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(((Closeable) (obj7)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                throw abyte0;
                obj;
                obj8 = obj17;
                obj3 = obj12;
                obj4 = obj13;
                Log.e("FileTransfer", ((JSONException) (obj)).getMessage(), ((Throwable) (obj)));
                obj8 = obj17;
                obj3 = obj12;
                obj4 = obj13;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj17 == null) goto _L1; else goto _L32
_L32:
                if (trustEveryone && useHttps)
                {
                    obj = (HttpsURLConnection)obj17;
                    ((HttpsURLConnection) (obj)).setHostnameVerifier(((HostnameVerifier) (obj12)));
                    ((HttpsURLConnection) (obj)).setSSLSocketFactory(((SSLSocketFactory) (obj13)));
                }
                ((HttpURLConnection) (obj17)).disconnect();
                return;
                obj4;
                obj3;
                JVM INSTR monitorexit ;
                obj7 = abyte0;
                throw obj4;
_L30:
                obj7 = abyte0;
                obj19 = ((ByteArrayOutputStream) (obj3)).toString("UTF-8");
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                context.currentInputStream = null;
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                FileTransfer.safeClose(abyte0);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                Log.d("FileTransfer", "got response from server");
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                Log.d("FileTransfer", ((String) (obj19)).substring(0, Math.min(256, ((String) (obj19)).length())));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                fileuploadresult.setResponseCode(i);
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                fileuploadresult.setResponse(((String) (obj19)));
                obj14 = obj;
                obj9 = obj5;
                sslsocketfactory1 = sslsocketfactory;
                obj15 = obj;
                obj10 = obj5;
                sslsocketfactory2 = sslsocketfactory;
                obj17 = obj;
                obj12 = obj5;
                obj13 = sslsocketfactory;
                obj16 = obj;
                obj11 = obj5;
                sslsocketfactory3 = sslsocketfactory;
                obj8 = obj;
                obj3 = obj5;
                obj4 = sslsocketfactory;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, fileuploadresult.toJSONObject()));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj == null) goto _L1; else goto _L33
_L33:
                if (trustEveryone && useHttps)
                {
                    obj3 = (HttpsURLConnection)obj;
                    ((HttpsURLConnection) (obj3)).setHostnameVerifier(((HostnameVerifier) (obj5)));
                    ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory);
                }
                ((HttpURLConnection) (obj)).disconnect();
                return;
                obj;
                obj3;
                JVM INSTR monitorexit ;
                throw obj;
                obj3;
                obj;
                JVM INSTR monitorexit ;
                throw obj3;
                obj3;
                obj;
                JVM INSTR monitorexit ;
                throw obj3;
                obj3;
                obj;
                JVM INSTR monitorexit ;
                throw obj3;
                Object obj1;
                obj1;
                obj8 = obj16;
                obj3 = obj11;
                obj4 = sslsocketfactory3;
                obj5 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, source, target, ((HttpURLConnection) (obj16)));
                obj8 = obj16;
                obj3 = obj11;
                obj4 = sslsocketfactory3;
                Log.e("FileTransfer", ((JSONObject) (obj5)).toString(), ((Throwable) (obj1)));
                obj8 = obj16;
                obj3 = obj11;
                obj4 = sslsocketfactory3;
                context.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.IO_EXCEPTION, ((JSONObject) (obj5))));
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj16 == null) goto _L1; else goto _L34
_L34:
                if (trustEveryone && useHttps)
                {
                    obj2 = (HttpsURLConnection)obj16;
                    ((HttpsURLConnection) (obj2)).setHostnameVerifier(((HostnameVerifier) (obj11)));
                    ((HttpsURLConnection) (obj2)).setSSLSocketFactory(sslsocketfactory3);
                }
                ((HttpURLConnection) (obj16)).disconnect();
                return;
                obj3;
                obj2;
                JVM INSTR monitorexit ;
                throw obj3;
                obj2;
                synchronized (FileTransfer.activeRequests)
                {
                    FileTransfer.activeRequests.remove(objectId);
                }
                if (obj8 != null)
                {
                    if (trustEveryone && useHttps)
                    {
                        obj6 = (HttpsURLConnection)obj8;
                        ((HttpsURLConnection) (obj6)).setHostnameVerifier(((HostnameVerifier) (obj3)));
                        ((HttpsURLConnection) (obj6)).setSSLSocketFactory(((SSLSocketFactory) (obj4)));
                    }
                    ((HttpURLConnection) (obj8)).disconnect();
                }
                throw obj2;
                exception;
                obj6;
                JVM INSTR monitorexit ;
                throw exception;
                abyte0;
                obj7 = obj3;
                  goto _L35
                JSONException jsonexception;
                jsonexception;
                  goto _L10
_L17:
                j = 1;
_L22:
                if (j == 0 && i != -1) goto _L37; else goto _L36
_L36:
                j = 1;
                  goto _L23
            }

            
            {
                this$0 = FileTransfer.this;
                context = requestcontext;
                useHttps = flag;
                trustEveryone = flag1;
                url = url1;
                target = s;
                headers = jsonobject;
                params = jsonobject1;
                fileKey = s1;
                mimeType = s2;
                fileName = s3;
                source = s4;
                chunkedMode = flag2;
                objectId = s5;
                super();
            }
        });
        return;
        source;
        callbackcontext;
        JVM INSTR monitorexit ;
        throw source;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (s.equals("upload") || s.equals("download"))
        {
            String s1 = jsonarray.getString(0);
            String s2 = jsonarray.getString(1);
            if (s.equals("upload"))
            {
                try
                {
                    upload(URLDecoder.decode(s1, "UTF-8"), s2, jsonarray, callbackcontext);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.MALFORMED_URL_EXCEPTION, "UTF-8 error."));
                    return true;
                }
                return true;
            } else
            {
                download(s1, s2, jsonarray, callbackcontext);
                return true;
            }
        }
        if (s.equals("abort"))
        {
            abort(jsonarray.getString(0));
            callbackcontext.success();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        FILE_NOT_FOUND_ERR = 1;
        INVALID_URL_ERR = 2;
        CONNECTION_ERR = 3;
        ABORTED_ERR = 4;
    }








}
