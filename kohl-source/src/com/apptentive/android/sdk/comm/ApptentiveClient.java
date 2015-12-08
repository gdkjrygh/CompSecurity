// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.comm;

import android.content.Context;
import com.apptentive.android.sdk.GlobalInfo;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.AppRelease;
import com.apptentive.android.sdk.model.ConversationTokenRequest;
import com.apptentive.android.sdk.model.Device;
import com.apptentive.android.sdk.model.Event;
import com.apptentive.android.sdk.model.FileMessage;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.model.Person;
import com.apptentive.android.sdk.model.Sdk;
import com.apptentive.android.sdk.model.StoredFile;
import com.apptentive.android.sdk.model.SurveyResponse;
import com.apptentive.android.sdk.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.apptentive.android.sdk.comm:
//            ApptentiveHttpResponse

public class ApptentiveClient
{
    private static final class Method extends Enum
    {

        private static final Method $VALUES[];
        public static final Method GET;
        public static final Method POST;
        public static final Method PUT;

        public static Method valueOf(String s)
        {
            return (Method)Enum.valueOf(com/apptentive/android/sdk/comm/ApptentiveClient$Method, s);
        }

        public static Method[] values()
        {
            return (Method[])$VALUES.clone();
        }

        static 
        {
            GET = new Method("GET", 0);
            PUT = new Method("PUT", 1);
            POST = new Method("POST", 2);
            $VALUES = (new Method[] {
                GET, PUT, POST
            });
        }

        private Method(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String API_VERSION = "1";
    private static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 30000;
    private static final int DEFAULT_HTTP_SOCKET_TIMEOUT = 30000;
    private static final String ENDPOINT_BASE = "https://api.apptentive.com";
    private static final String ENDPOINT_CONFIGURATION = "https://api.apptentive.com/conversation/configuration";
    private static final String ENDPOINT_CONVERSATION = "https://api.apptentive.com/conversation";
    private static final String ENDPOINT_CONVERSATION_FETCH = "https://api.apptentive.com/conversation?count=%s&after_id=%s&before_id=%s";
    private static final String ENDPOINT_DEVICES = "https://api.apptentive.com/devices";
    private static final String ENDPOINT_EVENTS = "https://api.apptentive.com/events";
    private static final String ENDPOINT_INTERACTIONS = "https://api.apptentive.com/interactions";
    private static final String ENDPOINT_MESSAGES = "https://api.apptentive.com/messages";
    private static final String ENDPOINT_PEOPLE = "https://api.apptentive.com/people";
    private static final String ENDPOINT_SURVEYS_POST = "https://api.apptentive.com/surveys/%s/respond";
    private static final String USER_AGENT_STRING = "Apptentive/%s (Android)";

    public ApptentiveClient()
    {
    }

    public static ApptentiveHttpResponse getAppConfiguration()
    {
        return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/conversation/configuration", Method.GET, null);
    }

    public static ApptentiveHttpResponse getConversationToken(ConversationTokenRequest conversationtokenrequest)
    {
        return performHttpRequest(GlobalInfo.apiKey, "https://api.apptentive.com/conversation", Method.POST, conversationtokenrequest.toString());
    }

    public static ApptentiveHttpResponse getInteractions()
    {
        return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/interactions", Method.GET, null);
    }

    public static ApptentiveHttpResponse getMessages(Integer integer, String s, String s1)
    {
        String s2;
        if (integer == null)
        {
            integer = "";
        } else
        {
            integer = integer.toString();
        }
        s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        integer = String.format("https://api.apptentive.com/conversation?count=%s&after_id=%s&before_id=%s", new Object[] {
            integer, s2, s
        });
        return performHttpRequest(GlobalInfo.conversationToken, integer, Method.GET, null);
    }

    private static String getUserAgentString()
    {
        return String.format("Apptentive/%s (Android)", new Object[] {
            "1.6.4"
        });
    }

    private static ApptentiveHttpResponse performHttpRequest(String s, String s1, Method method, String s2)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ApptentiveHttpResponse apptentivehttpresponse;
        Log.d("Performing request to %s", new Object[] {
            s1
        });
        apptentivehttpresponse = new ApptentiveHttpResponse();
        obj3 = null;
        obj2 = null;
        obj = null;
        obj1 = null;
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$comm$ApptentiveClient$Method[];
            static final int $SwitchMap$com$apptentive$android$sdk$model$Message$Type[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$comm$ApptentiveClient$Method = new int[Method.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$comm$ApptentiveClient$Method[Method.GET.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$comm$ApptentiveClient$Method[Method.PUT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$comm$ApptentiveClient$Method[Method.POST.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$apptentive$android$sdk$model$Message$Type = new int[com.apptentive.android.sdk.model.Message.Type.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[com.apptentive.android.sdk.model.Message.Type.TextMessage.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[com.apptentive.android.sdk.model.Message.Type.AutomatedMessage.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[com.apptentive.android.sdk.model.Message.Type.FileMessage.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[com.apptentive.android.sdk.model.Message.Type.unknown.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.apptentive.android.sdk.comm.ApptentiveClient.Method[method.ordinal()];
        JVM INSTR tableswitch 1 3: default 828
    //                   1 125
    //                   2 389
    //                   3 490;
           goto _L1 _L2 _L3 _L4
_L1:
        Log.e((new StringBuilder()).append("Unrecognized method: ").append(method.name()).toString(), new Object[0]);
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
_L9:
        return apptentivehttpresponse;
_L2:
        s1 = new HttpGet(s1);
_L10:
        int i;
        method = s1.getParams();
        HttpConnectionParams.setConnectionTimeout(method, 30000);
        HttpConnectionParams.setSoTimeout(method, 30000);
        method.setParameter("http.useragent", getUserAgentString());
        s1.setHeader("Authorization", (new StringBuilder()).append("OAuth ").append(s).toString());
        s1.setHeader("Accept-Encoding", "gzip");
        s1.setHeader("Accept", "application/json");
        s1.setHeader("X-API-Version", "1");
        s = defaulthttpclient.execute(s1);
        i = s.getStatusLine().getStatusCode();
        apptentivehttpresponse.setCode(i);
        apptentivehttpresponse.setReason(s.getStatusLine().getReasonPhrase());
        Log.d((new StringBuilder()).append("Response Status Line: ").append(s.getStatusLine().toString()).toString(), new Object[0]);
        s1 = s.headerIterator();
        if (s1 == null) goto _L6; else goto _L5
_L5:
        method = new HashMap();
        for (; s1.hasNext(); method.put(s2.getName(), s2.getValue()))
        {
            s2 = (Header)s1.next();
        }

          goto _L7
        s1;
        s = defaulthttpclient;
_L19:
        obj = s;
        Log.w("Error communicating with server.", s1, new Object[0]);
        if (s == null) goto _L9; else goto _L8
_L8:
        s.getConnectionManager().shutdown();
        return apptentivehttpresponse;
_L3:
        s1 = new HttpPut(s1);
        s1.setHeader("Content-Type", "application/json");
        Log.d((new StringBuilder()).append("PUT body: ").append(s2).toString(), new Object[0]);
        ((HttpPut)s1).setEntity(new StringEntity(s2, "UTF-8"));
          goto _L10
        s;
        s = defaulthttpclient;
_L18:
        obj = s;
        Log.w("Timeout communicating with server.", new Object[0]);
        if (s == null) goto _L9; else goto _L11
_L11:
        s.getConnectionManager().shutdown();
        return apptentivehttpresponse;
_L4:
        s1 = new HttpPost(s1);
        s1.setHeader("Content-Type", "application/json");
        Log.d((new StringBuilder()).append("POST body: ").append(s2).toString(), new Object[0]);
        ((HttpPost)s1).setEntity(new StringEntity(s2, "UTF-8"));
          goto _L10
        s1;
        s = defaulthttpclient;
_L17:
        obj = s;
        Log.w("Error communicating with server.", s1, new Object[0]);
        if (s == null) goto _L9; else goto _L12
_L12:
        s.getConnectionManager().shutdown();
        return apptentivehttpresponse;
_L7:
        apptentivehttpresponse.setHeaders(method);
_L6:
        s = s.getEntity();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_722;
        }
        s1 = s.getContent();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_722;
        }
        method = (String)apptentivehttpresponse.getHeaders().get("Content-Encoding");
        s = s1;
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_663;
        }
        s = s1;
        if (method.equalsIgnoreCase("gzip"))
        {
            s = new GZIPInputStream(s1);
        }
        apptentivehttpresponse.setContent(Util.readStringFromInputStream(s, "UTF-8"));
        if (i < 200 || i >= 300)
        {
            break MISSING_BLOCK_LABEL_742;
        }
        Log.d((new StringBuilder()).append("Response: ").append(apptentivehttpresponse.getContent()).toString(), new Object[0]);
_L14:
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
            return apptentivehttpresponse;
        }
        break MISSING_BLOCK_LABEL_825;
        Log.w((new StringBuilder()).append("Response: ").append(apptentivehttpresponse.getContent()).toString(), new Object[0]);
        if (true) goto _L14; else goto _L13
_L13:
        s;
        obj = defaulthttpclient;
_L16:
        if (obj != null)
        {
            ((HttpClient) (obj)).getConnectionManager().shutdown();
        }
        throw s;
        s;
        if (true) goto _L16; else goto _L15
_L15:
        s1;
        s = obj2;
          goto _L17
        s;
        s = obj3;
          goto _L18
        s1;
        s = obj1;
          goto _L19
        return apptentivehttpresponse;
          goto _L10
    }

    private static ApptentiveHttpResponse performMultipartFilePost(Context context, String s, String s1, String s2, StoredFile storedfile)
    {
        Object obj;
        Object obj1;
        Context context1;
        Context context2;
        Context context3;
        Context context4;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        ApptentiveHttpResponse apptentivehttpresponse;
        String s3;
        Log.d("Performing multipart request to %s", new Object[] {
            s1
        });
        apptentivehttpresponse = new ApptentiveHttpResponse();
        if (storedfile == null)
        {
            Log.e("StoredFile is null. Unable to send.", new Object[0]);
            return apptentivehttpresponse;
        }
        s3 = UUID.randomUUID().toString();
        obj3 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj2 = null;
        obj = null;
        context2 = null;
        context3 = null;
        context4 = null;
        context1 = null;
        obj1 = obj6;
        context = context.openFileInput(storedfile.getLocalFilePath());
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s1)).openConnection();
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setDoInput(true);
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setDoOutput(true);
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setUseCaches(false);
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setConnectTimeout(30000);
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setReadTimeout(30000);
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setRequestMethod("POST");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setRequestProperty("Connection", "Keep-Alive");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setRequestProperty("Content-Type", (new StringBuilder()).append("multipart/form-data;boundary=").append(s3).toString());
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setRequestProperty("Authorization", (new StringBuilder()).append("OAuth ").append(s).toString());
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setRequestProperty("Accept", "application/json");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setRequestProperty("X-API-Version", "1");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        httpurlconnection.setRequestProperty("User-Agent", getUserAgentString());
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1 = new StringBuilder();
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("--").append(s3).append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("Content-Disposition: form-data; name=\"message\"").append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("Content-Type: text/plain").append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append(s2);
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("--").append(s3).append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append(String.format("Content-Disposition: form-data; name=\"file\"; filename=\"%s\"", new Object[] {
            storedfile.getFileName()
        })).append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("Content-Type: ").append(storedfile.getMimeType()).append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s1.append("\r\n");
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        Log.d((new StringBuilder()).append("Post body: ").append(s1).toString(), new Object[0]);
        context1 = context;
        obj = context;
        obj1 = obj6;
        context2 = context;
        context3 = context;
        context4 = context;
        s = new DataOutputStream(httpurlconnection.getOutputStream());
        s.writeBytes(s1.toString());
        s1 = new byte[4096];
_L3:
        int i = context.read(s1, 0, 4096);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        s.write(s1, 0, i);
          goto _L3
        s1;
        Log.d("Error writing file bytes to HTTP connection.", s1, new Object[0]);
        apptentivehttpresponse.setBadPayload(true);
        throw s1;
        s1;
_L17:
        obj = context;
        obj1 = s;
        Log.e("Error getting file to upload.", s1, new Object[0]);
        Util.ensureClosed(context);
        Util.ensureClosed(s);
        return apptentivehttpresponse;
_L2:
        s.writeBytes((new StringBuilder()).append("--").append(s3).append("--").append("\r\n").toString());
        s.close();
        apptentivehttpresponse.setCode(httpurlconnection.getResponseCode());
        apptentivehttpresponse.setReason(httpurlconnection.getResponseMessage());
        context3 = null;
        s2 = null;
        context2 = null;
        context1 = null;
        obj1 = s2;
        obj = context2;
        s1 = context3;
        Log.d((new StringBuilder()).append("Sending file: ").append(storedfile.getLocalFilePath()).toString(), new Object[0]);
        obj1 = s2;
        obj = context2;
        s1 = context3;
        s2 = httpurlconnection.getInputStream();
        obj1 = s2;
        obj = context2;
        s1 = s2;
        storedfile = new ByteArrayOutputStream();
        s1 = new byte[1024];
_L5:
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = s2.read(s1, 0, 1024);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        storedfile.write(s1, 0, i);
        if (true) goto _L5; else goto _L4
        s1;
        obj1 = s2;
        s2 = storedfile;
        storedfile = s1;
_L21:
        obj = s2;
        s1 = ((String) (obj1));
        Log.w("Can't read return stream.", storedfile, new Object[0]);
        Util.ensureClosed(((java.io.Closeable) (obj1)));
        Util.ensureClosed(s2);
_L8:
        s2 = null;
        obj = null;
        obj1 = null;
        context1 = null;
        storedfile = ((StoredFile) (obj1));
        s1 = httpurlconnection.getErrorStream();
        obj = s1;
        storedfile = ((StoredFile) (obj1));
        s2 = s1;
        obj1 = new ByteArrayOutputStream();
        s2 = new byte[1024];
_L7:
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = s1.read(s2, 0, 1024);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ByteArrayOutputStream) (obj1)).write(s2, 0, i);
        if (true) goto _L7; else goto _L6
        s2;
        obj = s1;
        s1 = ((String) (obj1));
        obj1 = s2;
_L19:
        storedfile = s1;
        s2 = ((String) (obj));
        Log.w("Can't read error stream.", ((Throwable) (obj1)), new Object[0]);
        Util.ensureClosed(((java.io.Closeable) (obj)));
        Util.ensureClosed(s1);
_L9:
        Log.d((new StringBuilder()).append("HTTP ").append(httpurlconnection.getResponseCode()).append(": ").append(httpurlconnection.getResponseMessage()).append("").toString(), new Object[0]);
        Log.v(apptentivehttpresponse.getContent(), new Object[0]);
        Util.ensureClosed(context);
        Util.ensureClosed(s);
        return apptentivehttpresponse;
_L4:
        apptentivehttpresponse.setContent(storedfile.toString());
        Util.ensureClosed(s2);
        Util.ensureClosed(storedfile);
          goto _L8
_L20:
        Util.ensureClosed(s1);
        Util.ensureClosed(((java.io.Closeable) (obj)));
        throw s2;
        s1;
_L16:
        obj = context;
        obj1 = s;
        Log.e("Error constructing url for file upload.", s1, new Object[0]);
        Util.ensureClosed(context);
        Util.ensureClosed(s);
        return apptentivehttpresponse;
_L6:
        if (((ByteArrayOutputStream) (obj1)).size() > 0)
        {
            apptentivehttpresponse.setContent(((ByteArrayOutputStream) (obj1)).toString());
        }
        Util.ensureClosed(s1);
        Util.ensureClosed(((java.io.Closeable) (obj1)));
          goto _L9
_L18:
        Util.ensureClosed(s1);
        Util.ensureClosed(storedfile);
        throw s2;
        s1;
_L15:
        obj = context;
        obj1 = s;
        Log.w("Timeout communicating with server.", new Object[0]);
        Util.ensureClosed(context);
        Util.ensureClosed(s);
        return apptentivehttpresponse;
        s1;
        s = obj5;
        context = context1;
_L13:
        obj = context;
        obj1 = s;
        Log.e("Error executing file upload.", s1, new Object[0]);
        Util.ensureClosed(context);
        Util.ensureClosed(s);
        return apptentivehttpresponse;
        s;
        context = ((Context) (obj));
_L11:
        Util.ensureClosed(context);
        Util.ensureClosed(((java.io.Closeable) (obj1)));
        throw s;
        s1;
        obj1 = s;
        s = s1;
        if (true) goto _L11; else goto _L10
_L10:
        s1;
        if (true) goto _L13; else goto _L12
_L12:
        context;
        context = context2;
        s = obj4;
        if (true) goto _L15; else goto _L14
_L14:
        s1;
        context = context3;
        s = obj3;
          goto _L16
        s1;
        context = context4;
        s = obj2;
          goto _L17
        s2;
        storedfile = ((StoredFile) (obj1));
          goto _L18
        obj1;
        s1 = context1;
          goto _L19
        Exception exception1;
        exception1;
        obj = storedfile;
        s1 = s2;
        s2 = exception1;
          goto _L20
        storedfile;
        s2 = context1;
          goto _L21
        s2;
          goto _L20
        Exception exception;
        exception;
        s1 = s2;
        s2 = exception;
          goto _L18
    }

    public static ApptentiveHttpResponse postEvent(Event event)
    {
        return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/events", Method.POST, event.marshallForSending());
    }

    public static ApptentiveHttpResponse postMessage(Context context, Message message)
    {
        StoredFile storedfile;
        switch (_cls1..SwitchMap.com.apptentive.android.sdk.model.Message.Type[message.getType().ordinal()])
        {
        default:
            return new ApptentiveHttpResponse();

        case 1: // '\001'
            return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/messages", Method.POST, message.marshallForSending());

        case 2: // '\002'
            return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/messages", Method.POST, message.marshallForSending());

        case 3: // '\003'
            storedfile = ((FileMessage)message).getStoredFile(context);
            break;
        }
        return performMultipartFilePost(context, GlobalInfo.conversationToken, "https://api.apptentive.com/messages", message.marshallForSending(), storedfile);
    }

    public static ApptentiveHttpResponse postSurvey(SurveyResponse surveyresponse)
    {
        String s = String.format("https://api.apptentive.com/surveys/%s/respond", new Object[] {
            surveyresponse.getId()
        });
        return performHttpRequest(GlobalInfo.conversationToken, s, Method.POST, surveyresponse.marshallForSending());
    }

    public static ApptentiveHttpResponse putAppRelease(AppRelease apprelease)
    {
        return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/conversation", Method.PUT, apprelease.marshallForSending());
    }

    public static ApptentiveHttpResponse putDevice(Device device)
    {
        return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/devices", Method.PUT, device.marshallForSending());
    }

    public static ApptentiveHttpResponse putPerson(Person person)
    {
        return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/people", Method.PUT, person.marshallForSending());
    }

    public static ApptentiveHttpResponse putSdk(Sdk sdk)
    {
        return performHttpRequest(GlobalInfo.conversationToken, "https://api.apptentive.com/conversation", Method.PUT, sdk.marshallForSending());
    }
}
