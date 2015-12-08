// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import com.conviva.platforms.ConvivaSSLSocketFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EncodingUtils;

// Referenced classes of package com.conviva.utils:
//            PlatformUtils, Settings

public class Utils extends PlatformUtils
{
    class _cls1LoadDataTask
        implements Runnable
    {

        final Utils this$0;

        public void run()
        {
            Object obj1;
            Object obj2;
            Object obj3;
            obj1 = null;
            obj3 = null;
            if (!Utils._appContext.getFileStreamPath("conviva.json").exists())
            {
                break MISSING_BLOCK_LABEL_307;
            }
            obj2 = new StringBuffer("");
            Object obj = Utils._appContext.openFileInput("conviva.json");
            obj1 = obj;
            obj = obj1;
            byte abyte0[] = new byte[1024];
_L2:
            obj = obj1;
            int i = ((FileInputStream) (obj1)).read(abyte0);
            if (i == -1)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = obj1;
            ((StringBuffer) (obj2)).append(new String(abyte0, 0, i));
            if (true) goto _L2; else goto _L1
            obj;
_L6:
            obj = obj1;
            err("Failed to load data from persistent storage");
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            ((FileInputStream) (obj1)).close();
            obj = null;
_L3:
            obj1 = obj3;
            if (obj != null)
            {
                obj1 = obj3;
                if (((Map) (obj)).containsKey("clId"))
                {
                    obj1 = ((Map) (obj)).get("clId").toString();
                }
            }
            if (obj1 != null && !((String) (obj1)).equals("0") && !((String) (obj1)).equals("null") && ((String) (obj1)).length() > 0)
            {
                clientId = ((String) (obj1));
                log((new StringBuilder()).append("Setting the client id to ").append(((String) (obj1))).append(" (from local storage)").toString());
                return;
            } else
            {
                log("Failed to load the client id from local storage");
                return;
            }
_L1:
            obj = obj1;
            ((FileInputStream) (obj1)).close();
            obj = obj1;
            obj2 = jsonDecode(((StringBuffer) (obj2)).toString());
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_239;
            }
            ((FileInputStream) (obj1)).close();
            obj = obj2;
              goto _L3
            obj;
            ((IOException) (obj)).printStackTrace();
            obj = obj2;
              goto _L3
            obj;
            ((IOException) (obj)).printStackTrace();
            obj = null;
              goto _L3
            obj;
_L5:
            if (obj1 != null)
            {
                try
                {
                    ((FileInputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((IOException) (obj1)).printStackTrace();
                }
            }
            throw obj;
            Exception exception;
            exception;
            obj1 = obj;
            obj = exception;
            if (true) goto _L5; else goto _L4
_L4:
            obj;
            obj1 = null;
              goto _L6
            obj = null;
              goto _L3
        }

        _cls1LoadDataTask()
        {
            this$0 = Utils.this;
            super();
        }
    }

    private class HTTPTask
        implements Runnable
    {

        private CallableWithParameters.With1 _callback;
        private HttpClient _client;
        private String _contentT;
        private String _data;
        private boolean _isPost;
        private HttpUriRequest _method;
        private ResponseHandler _responseHandler;
        private String _url;
        final Utils this$0;

        private void doneHandler(Exception exception, byte abyte0[])
        {
            CallableWithParameters.With1 with1 = _callback;
            _callback = null;
            if (exception != null)
            {
                err((new StringBuilder()).append("Failed to send heartbeat: ").append(exception.toString()).toString());
            }
            if (abyte0 == null)
            {
                abyte0 = null;
            } else
            {
                abyte0 = EncodingUtils.getString(abyte0, "UTF-8");
            }
            if (with1 != null)
            {
                if (exception != null)
                {
                    abyte0 = null;
                }
                with1.exec(abyte0);
            }
        }

        private boolean shouldUseSsl(String s)
        {
            return s.contains("https://");
        }

        private HttpClient sslClient(HttpClient httpclient)
        {
            try
            {
                Object obj = new X509TrustManager() {

                    final HTTPTask this$1;

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
                        return null;
                    }

            
            {
                this$1 = HTTPTask.this;
                super();
            }
                };
                Object obj1 = SSLContext.getInstance("TLS");
                ((SSLContext) (obj1)).init(null, new TrustManager[] {
                    obj
                }, null);
                obj = new ConvivaSSLSocketFactory(((SSLContext) (obj1)));
                ((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
                obj1 = httpclient.getConnectionManager();
                ((ClientConnectionManager) (obj1)).getSchemeRegistry().register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
                httpclient = new DefaultHttpClient(((ClientConnectionManager) (obj1)), httpclient.getParams());
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                log("Error in creating SSL client");
                return null;
            }
            return httpclient;
        }

        public void run()
        {
            Object obj;
            obj = new BasicHttpParams();
            HttpProtocolParams.setVersion(((org.apache.http.params.HttpParams) (obj)), HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(((org.apache.http.params.HttpParams) (obj)), "UTF-8");
            HttpProtocolParams.setUseExpectContinue(((org.apache.http.params.HttpParams) (obj)), false);
            HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 60000);
            obj = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)));
            if (shouldUseSsl(_url))
            {
                _client = sslClient(((HttpClient) (obj)));
            } else
            {
                _client = ((HttpClient) (obj));
            }
            if (!_isPost) goto _L2; else goto _L1
_L1:
            obj = new HttpPost(_url);
            ((HttpPost) (obj)).setEntity(new ByteArrayEntity(_data.getBytes("UTF-8")));
            _method = ((HttpUriRequest) (obj));
_L3:
            if (_contentT != null)
            {
                break MISSING_BLOCK_LABEL_193;
            }
            obj = "application/json";
            break MISSING_BLOCK_LABEL_115;
_L2:
            _method = new HttpGet(_url);
              goto _L3
_L4:
            try
            {
                _method.setHeader("Content-Type", ((String) (obj)));
                _responseHandler = new HttpResponseHandler();
                _client.execute(_method, _responseHandler);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                doneHandler(((Exception) (obj)), null);
            }
            return;
            obj = _contentT;
              goto _L4
        }

        public void setState(boolean flag, String s, String s1, String s2, CallableWithParameters.With1 with1)
        {
            _isPost = flag;
            _url = s;
            _data = s1;
            _contentT = s2;
            _callback = with1;
        }


        private HTTPTask()
        {
            this$0 = Utils.this;
            super();
            _callback = null;
            _client = null;
            _method = null;
        }

    }

    private class HTTPTask.HttpResponseHandler
        implements ResponseHandler
    {

        final HTTPTask this$1;

        public volatile Object handleResponse(HttpResponse httpresponse)
            throws ClientProtocolException, IOException
        {
            return handleResponse(httpresponse);
        }

        public Void handleResponse(HttpResponse httpresponse)
        {
            ByteArrayOutputStream bytearrayoutputstream;
            int i;
            byte abyte0[];
            try
            {
                i = httpresponse.getStatusLine().getStatusCode();
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                doneHandler(httpresponse, null);
                return null;
            }
            if (i != 200)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            httpresponse = httpresponse.getEntity().getContent();
            bytearrayoutputstream = new ByteArrayOutputStream();
            abyte0 = new byte[1024];
_L1:
            i = httpresponse.read(abyte0);
            if (i == -1)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            bytearrayoutputstream.write(abyte0, 0, i);
              goto _L1
            doneHandler(null, bytearrayoutputstream.toByteArray());
            return null;
            doneHandler(new Exception((new StringBuilder()).append("Status code in HTTP response is not OK: ").append(i).toString()), null);
            return null;
        }

        private HTTPTask.HttpResponseHandler()
        {
            this$1 = HTTPTask.this;
            super();
        }

    }


    private static Context _appContext = null;
    private static final String _clientIdKey = "clId";
    private static final String _convivaJsonFilename = "conviva.json";
    private static Map _platformMetadata = null;
    private static boolean _traceOverride = false;

    private Utils(Settings settings, Context context)
        throws Exception
    {
        super(settings);
        _appContext = context;
        _PLATFORM_VER = android.os.Build.VERSION.RELEASE;
    }

    public static PlatformUtils CreateUtils(Map map, Context context)
        throws Exception
    {
        if (_instance == null)
        {
            Settings settings = new Settings();
            settings.changeSettings(map);
            _instance = new Utils(settings, context);
            _traceOverride = (new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/conviva_debug.txt").toString())).exists();
            return _instance;
        } else
        {
            _instance.getSettings().changeSettings(map);
            map = _instance;
            map._referenceCount = ((PlatformUtils) (map))._referenceCount + 1;
            return _instance;
        }
    }

    private void writeClientId()
    {
        String s;
        HashMap hashmap = new HashMap();
        hashmap.put("clId", clientId);
        s = jsonEncode(hashmap);
        if (s != null) goto _L2; else goto _L1
_L1:
        log("failed to json encode client id");
_L3:
        return;
_L2:
        Object obj = null;
        FileOutputStream fileoutputstream = _appContext.openFileOutput("conviva.json", 0);
        Object obj1;
        obj = fileoutputstream;
        obj1 = fileoutputstream;
        fileoutputstream.write(s.getBytes());
        obj = fileoutputstream;
        obj1 = fileoutputstream;
        fileoutputstream.flush();
        obj = fileoutputstream;
        obj1 = fileoutputstream;
        fileoutputstream.close();
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
            return;
        }
          goto _L3
        obj1;
        obj1 = obj;
        log("Cannot save data to persistent storage");
        if (obj == null) goto _L3; else goto _L4
_L4:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return;
        Exception exception;
        exception;
        obj1 = null;
_L6:
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            catch (IOException ioexception1)
            {
                ioexception1.printStackTrace();
            }
        }
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void deleteLocalData()
    {
    }

    public Map getPlatformMetadata()
    {
        if (_platformMetadata == null)
        {
            _platformMetadata = new HashMap();
            _platformMetadata.put("sch", "and1");
            try
            {
                _platformMetadata.put("dv", "android");
                _platformMetadata.put("dvt", "Mobile");
                _platformMetadata.put("os", "AND");
                _platformMetadata.put("osv", android.os.Build.VERSION.RELEASE);
                _platformMetadata.put("manu", Build.MANUFACTURER);
                _platformMetadata.put("mod", Build.MODEL);
            }
            catch (Exception exception) { }
        }
        return _platformMetadata;
    }

    public void httpRequest(boolean flag, String s, String s1, String s2, CallableWithParameters.With1 with1)
    {
        HTTPTask httptask = new HTTPTask();
        httptask.setState(flag, s, s1, s2, with1);
        s = new Thread(httptask);
        if (s != null)
        {
            s.start();
        }
    }

    public boolean inSleepingMode()
    {
        return !((PowerManager)_appContext.getSystemService("power")).isScreenOn();
    }

    public boolean isVisible()
    {
        List list;
        int j;
        j = Process.myPid();
        list = ((ActivityManager)_appContext.getSystemService("activity")).getRunningAppProcesses();
        if (list != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                break;
            }
            if (((android.app.ActivityManager.RunningAppProcessInfo)list.get(i)).pid == j)
            {
                if (((android.app.ActivityManager.RunningAppProcessInfo)list.get(i)).importance <= 200)
                {
                    return true;
                }
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        return true;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void logConsole(String s)
    {
label0:
        {
            if (_settings.enableLogging || _traceOverride)
            {
                if (!s.contains("ERROR:"))
                {
                    break label0;
                }
                Log.e("CONVIVA", s);
            }
            return;
        }
        Log.d("CONVIVA", s);
    }

    public void setClientIdFromServer(String s)
    {
        if (!s.equals(clientId))
        {
            clientId = s;
            log((new StringBuilder()).append("Setting the client id to ").append(s).append(" (from server)").toString());
            writeClientId();
        }
    }

    public void startFetchClientId()
    {
        Thread thread = new Thread(new _cls1LoadDataTask());
        if (thread != null)
        {
            thread.start();
        }
    }


}
