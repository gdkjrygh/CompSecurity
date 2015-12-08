// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import android.net.Uri;
import android.util.Log;
import android.webkit.CookieManager;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.Config;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginManager;
import org.apache.cordova.PluginResult;
import org.apache.cordova.file.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileUploadResult, FileProgressResult

public class FileTransfer extends CordovaPlugin
{
    private static class ExposedGZIPInputStream extends GZIPInputStream
    {

        public Inflater getInflater()
        {
            return inf;
        }

        public ExposedGZIPInputStream(InputStream inputstream)
            throws IOException
        {
            super(inputstream);
        }
    }

    private static final class RequestContext
    {

        boolean aborted;
        CallbackContext callbackContext;
        HttpURLConnection connection;
        String source;
        String target;
        File targetFile;

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

    private static class SimpleTrackingInputStream extends TrackingInputStream
    {

        private long bytesRead;

        private int updateBytesRead(int i)
        {
            if (i != -1)
            {
                bytesRead = bytesRead + (long)i;
            }
            return i;
        }

        public long getTotalRawBytesRead()
        {
            return bytesRead;
        }

        public int read()
            throws IOException
        {
            return updateBytesRead(super.read());
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            return updateBytesRead(super.read(abyte0, i, j));
        }

        public SimpleTrackingInputStream(InputStream inputstream)
        {
            super(inputstream);
            bytesRead = 0L;
        }
    }

    private static class TrackingGZIPInputStream extends TrackingInputStream
    {

        p