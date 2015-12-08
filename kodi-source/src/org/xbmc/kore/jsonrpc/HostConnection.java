// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc:
//            ApiException, ApiMethod, ApiCallback

public class HostConnection
{
    public static interface InputNotificationsObserver
    {

        public abstract void onInputRequested(org.xbmc.kore.jsonrpc.notification.Input.OnInputRequested oninputrequested);
    }

    private static class MethodCallInfo
    {

        public final ApiCallback callback;
        public final Handler handler;
        public final ApiMethod method;

        public MethodCallInfo(ApiMethod apimethod, ApiCallback apicallback, Handler handler1)
        {
            method = apimethod;
            callback = apicallback;
            handler = handler1;
        }
    }

    public static interface PlayerNotificationsObserver
    {

        public abstract void onPause(org.xbmc.kore.jsonrpc.notification.Player.OnPause onpause);

        public abstract void onPlay(org.xbmc.kore.jsonrpc.notification.Player.OnPlay onplay);

        public abstract void onSeek(org.xbmc.kore.jsonrpc.notification.Player.OnSeek onseek);

        public abstract void onSpeedChanged(org.xbmc.kore.jsonrpc.notification.Player.OnSpeedChanged onspeedchanged);

        public abstract void onStop(org.xbmc.kore.jsonrpc.notification.Player.OnStop onstop);
    }

    public static interface SystemNotificationsObserver
    {

        public abstract void onQuit(org.xbmc.kore.jsonrpc.notification.System.OnQuit onquit);

        public abstract void onRestart(org.xbmc.kore.jsonrpc.notification.System.OnRestart onrestart);

        public abstract void onSleep(org.xbmc.kore.jsonrpc.notification.System.OnSleep onsleep);
    }


    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json");
    public static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/jsonrpc/HostConnection);
    private final HashMap clientCallbacks;
    private final int connectTimeout;
    private ExecutorService executorService;
    private final HostInfo hostInfo;
    private OkHttpClient httpClient;
    private final HashMap inputNotificationsObservers;
    private Thread listenerThread;
    private final ObjectMapper objectMapper;
    private final HashMap playerNotificationsObservers;
    private int protocol;
    private Socket socket;
    private final HashMap systemNotificationsObservers;

    public HostConnection(HostInfo hostinfo)
    {
        this(hostinfo, 5000);
    }

    public HostConnection(HostInfo hostinfo, int i)
    {
        objectMapper = new ObjectMapper();
        socket = null;
        listenerThread = null;
        clientCallbacks = new HashMap();
        playerNotificationsObservers = new HashMap();
        systemNotificationsObservers = new HashMap();
        inputNotificationsObservers = new HashMap();
        httpClient = null;
        hostInfo = hostinfo;
        protocol = hostinfo.getProtocol();
        executorService = Executors.newSingleThreadExecutor();
        connectTimeout = i;
    }

    private void callErrorCallback(String s, final ApiException error)
    {
        HashMap hashmap = clientCallbacks;
        hashmap;
        JVM INSTR monitorenter ;
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj = (MethodCallInfo)clientCallbacks.get(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        final ApiCallback callback = ((MethodCallInfo) (obj)).callback;
        if (((MethodCallInfo) (obj)).handler == null || callback == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ((MethodCallInfo) (obj)).handler.post(new Runnable() {

            final HostConnection this$0;
            final ApiCallback val$callback;
            final ApiException val$error;

            public void run()
            {
                callback.onError(error.getCode(), error.getMessage());
            }

            
            {
                this$0 = HostConnection.this;
                callback = apicallback;
                error = apiexception;
                super();
            }
        });
        clientCallbacks.remove(s);
_L5:
        hashmap;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = clientCallbacks.keySet().iterator();
_L4:
        do
        {
            if (!s.hasNext())
            {
                break MISSING_BLOCK_LABEL_176;
            }
            obj = (String)s.next();
            obj = (MethodCallInfo)clientCallbacks.get(obj);
            callback = ((MethodCallInfo) (obj)).callback;
        } while (((MethodCallInfo) (obj)).handler == null || callback == null);
        ((MethodCallInfo) (obj)).handler.post(new Runnable() {

            final HostConnection this$0;
            final ApiCallback val$callback;
            final ApiException val$error;

            public void run()
            {
                callback.onError(error.getCode(), error.getMessage());
            }

            
            {
                this$0 = HostConnection.this;
                callback = apicallback;
                error = apiexception;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        clientCallbacks.clear();
          goto _L5
    }

    private void executeThroughOkHttp(final ApiMethod result, final ApiCallback callback, Handler handler)
    {
        OkHttpClient okhttpclient;
        String s;
        okhttpclient = getOkHttpClient();
        s = result.toJsonString();
        Request request = (new com.squareup.okhttp.Request.Builder()).url(hostInfo.getJsonRpcHttpEndpoint()).post(RequestBody.create(MEDIA_TYPE_JSON, s)).build();
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Sending request via OkHttp: ").append(s).toString());
        result = ((ApiMethod) (result.resultFromJson(parseJsonResponse(handleOkHttpResponse(sendOkHttpRequest(okhttpclient, request))))));
        if (handler == null || callback == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        handler.post(new Runnable() {

            final HostConnection this$0;
            final ApiCallback val$callback;
            final Object val$result;

            public void run()
            {
                callback.onSuccess(result);
            }

            
            {
                this$0 = HostConnection.this;
                callback = apicallback;
                result = obj;
                super();
            }
        });
_L1:
        return;
        result;
        if (handler != null && callback != null)
        {
            handler.post(new Runnable() {

                final HostConnection this$0;
                final ApiCallback val$callback;
                final ApiException val$e;

                public void run()
                {
                    callback.onError(e.getCode(), e.getMessage());
                }

            
            {
                this$0 = HostConnection.this;
                callback = apicallback;
                e = apiexception;
                super();
            }
            });
            return;
        }
          goto _L1
    }

    private void executeThroughTcp(ApiMethod apimethod, final ApiCallback callback, Handler handler)
    {
        String s = String.valueOf(apimethod.getId());
        HashMap hashmap = clientCallbacks;
        hashmap;
        JVM INSTR monitorenter ;
        if (!clientCallbacks.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (handler == null || callback == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        handler.post(new Runnable() {

            final HostConnection this$0;
            final ApiCallback val$callback;

            public void run()
            {
                callback.onError(ApiException.API_METHOD_WITH_SAME_ID_ALREADY_EXECUTING, "A method with the same Id is already executing");
            }

            
            {
                this$0 = HostConnection.this;
                callback = apicallback;
                super();
            }
        });
        hashmap;
        JVM INSTR monitorexit ;
        return;
        clientCallbacks.put(s, new MethodCallInfo(apimethod, callback, handler));
        hashmap;
        JVM INSTR monitorexit ;
        try
        {
            if (socket == null)
            {
                socket = openTcpConnection(hostInfo);
                listenerThread = newListenerThread(socket);
                listenerThread.start();
            }
            sendTcpRequest(socket, apimethod.toJsonString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ApiMethod apimethod)
        {
            callErrorCallback(s, apimethod);
        }
        return;
        apimethod;
        hashmap;
        JVM INSTR monitorexit ;
        throw apimethod;
    }

    private OkHttpClient getNewOkHttpClientNoKeepAlive()
    {
        System.setProperty("http.keepAlive", "false");
        httpClient = null;
        return getOkHttpClient();
    }

    private String handleOkHttpResponse(Response response)
        throws ApiException
    {
        response.code();
        JVM INSTR lookupswitch 3: default 270
    //                   200: 116
    //                   401: 159
    //                   404: 214;
           goto _L1 _L2 _L3 _L4
_L1:
        LogUtils.LOGD(TAG, (new StringBuilder()).append("OkHTTP response read error. Got: ").append(response).toString());
        throw new ApiException(4, (new StringBuilder()).append("Server returned response code: ").append(response).toString());
_L2:
        String s;
        try
        {
            s = response.body().string();
            response.body().close();
            LogUtils.LOGD(TAG, (new StringBuilder()).append("OkHTTP response: ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            LogUtils.LOGW(TAG, "Failed to read OkHTTP response.", response);
            throw new ApiException(3, response);
        }
        return s;
_L3:
        LogUtils.LOGD(TAG, (new StringBuilder()).append("OkHTTP response read error. Got a 401: ").append(response).toString());
        throw new ApiException(5, (new StringBuilder()).append("Server returned response code: ").append(response).toString());
_L4:
        LogUtils.LOGD(TAG, (new StringBuilder()).append("OkHTTP response read error. Got a 404: ").append(response).toString());
        throw new ApiException(6, (new StringBuilder()).append("Server returned response code: ").append(response).toString());
    }

    private void handleTcpResponse(final ObjectNode result)
    {
        if (result.has("id")) goto _L2; else goto _L1
_L1:
        final Object apiNotification = result.get("method").asText();
        Object obj = (ObjectNode)result.get("params");
        if (((String) (apiNotification)).equals("Player.OnPause"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.Player.OnPause(((ObjectNode) (obj)));
            final PlayerNotificationsObserver observer;
            for (obj = playerNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)playerNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.Player.OnPause val$apiNotification;
        final PlayerNotificationsObserver val$observer;

        public void run()
        {
            observer.onPause(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = playernotificationsobserver;
                apiNotification = onpause;
                super();
            }
    }))
            {
                observer = (PlayerNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("Player.OnPlay"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.Player.OnPlay(((ObjectNode) (obj)));
            final PlayerNotificationsObserver observer;
            for (obj = playerNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)playerNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.Player.OnPlay val$apiNotification;
        final PlayerNotificationsObserver val$observer;

        public void run()
        {
            observer.onPlay(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = playernotificationsobserver;
                apiNotification = onplay;
                super();
            }
    }))
            {
                observer = (PlayerNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("Player.OnSeek"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.Player.OnSeek(((ObjectNode) (obj)));
            final PlayerNotificationsObserver observer;
            for (obj = playerNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)playerNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.Player.OnSeek val$apiNotification;
        final PlayerNotificationsObserver val$observer;

        public void run()
        {
            observer.onSeek(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = playernotificationsobserver;
                apiNotification = onseek;
                super();
            }
    }))
            {
                observer = (PlayerNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("Player.OnSpeedChanged"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.Player.OnSpeedChanged(((ObjectNode) (obj)));
            final PlayerNotificationsObserver observer;
            for (obj = playerNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)playerNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.Player.OnSpeedChanged val$apiNotification;
        final PlayerNotificationsObserver val$observer;

        public void run()
        {
            observer.onSpeedChanged(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = playernotificationsobserver;
                apiNotification = onspeedchanged;
                super();
            }
    }))
            {
                observer = (PlayerNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("Player.OnStop"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.Player.OnStop(((ObjectNode) (obj)));
            final PlayerNotificationsObserver observer;
            for (obj = playerNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)playerNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.Player.OnStop val$apiNotification;
        final PlayerNotificationsObserver val$observer;

        public void run()
        {
            observer.onStop(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = playernotificationsobserver;
                apiNotification = onstop;
                super();
            }
    }))
            {
                observer = (PlayerNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("System.OnQuit"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.System.OnQuit(((ObjectNode) (obj)));
            final SystemNotificationsObserver observer;
            for (obj = systemNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)systemNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.System.OnQuit val$apiNotification;
        final SystemNotificationsObserver val$observer;

        public void run()
        {
            observer.onQuit(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = systemnotificationsobserver;
                apiNotification = onquit;
                super();
            }
    }))
            {
                observer = (SystemNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("System.OnRestart"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.System.OnRestart(((ObjectNode) (obj)));
            final SystemNotificationsObserver observer;
            for (obj = systemNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)systemNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.System.OnRestart val$apiNotification;
        final SystemNotificationsObserver val$observer;

        public void run()
        {
            observer.onRestart(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = systemnotificationsobserver;
                apiNotification = onrestart;
                super();
            }
    }))
            {
                observer = (SystemNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("System.OnSleep"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.System.OnSleep(((ObjectNode) (obj)));
            final SystemNotificationsObserver observer;
            for (obj = systemNotificationsObservers.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((Handler)systemNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.System.OnSleep val$apiNotification;
        final SystemNotificationsObserver val$observer;

        public void run()
        {
            observer.onSleep(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = systemnotificationsobserver;
                apiNotification = onsleep;
                super();
            }
    }))
            {
                observer = (SystemNotificationsObserver)((Iterator) (obj)).next();
            }

        } else
        if (((String) (apiNotification)).equals("Input.OnInputRequested"))
        {
            apiNotification = new org.xbmc.kore.jsonrpc.notification.Input.OnInputRequested(((ObjectNode) (obj)));
            final InputNotificationsObserver observer;
            for (Iterator iterator = inputNotificationsObservers.keySet().iterator(); iterator.hasNext(); ((Handler)inputNotificationsObservers.get(observer)).post(new Runnable() {

        final HostConnection this$0;
        final org.xbmc.kore.jsonrpc.notification.Input.OnInputRequested val$apiNotification;
        final InputNotificationsObserver val$observer;

        public void run()
        {
            observer.onInputRequested(apiNotification);
        }

            
            {
                this$0 = HostConnection.this;
                observer = inputnotificationsobserver;
                apiNotification = oninputrequested;
                super();
            }
    }))
            {
                observer = (InputNotificationsObserver)iterator.next();
            }

        }
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Got a notification: ").append(result.get("method").textValue()).toString());
_L4:
        return;
_L2:
        String s;
        MethodCallInfo methodcallinfo;
        s = result.get("id").asText();
        if (result.has("error"))
        {
            callErrorCallback(s, new ApiException(ApiException.API_ERROR, result));
            return;
        }
        methodcallinfo = (MethodCallInfo)clientCallbacks.get(s);
        if (methodcallinfo == null) goto _L4; else goto _L3
_L3:
        final ApiCallback callback;
        result = ((ObjectNode) (methodcallinfo.method.resultFromJson(result)));
        callback = methodcallinfo.callback;
        if (methodcallinfo.handler == null || callback == null)
        {
            break MISSING_BLOCK_LABEL_906;
        }
        methodcallinfo.handler.post(new Runnable() {

            final HostConnection this$0;
            final ApiCallback val$callback;
            final Object val$result;

            public void run()
            {
                callback.onSuccess(result);
            }

            
            {
                this$0 = HostConnection.this;
                callback = apicallback;
                result = obj;
                super();
            }
        });
        synchronized (clientCallbacks)
        {
            clientCallbacks.remove(s);
        }
        return;
        exception;
        result;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (final ObjectNode result)
        {
            callErrorCallback(s, result);
        }
        return;
    }

    public static boolean isValidProtocol(int i)
    {
        return i == 0 || i == 1;
    }

    private Thread newListenerThread(final Socket socket)
    {
        return new Thread(new Runnable() {

            final HostConnection this$0;
            final Socket val$socket;

            public void run()
            {
                Process.setThreadPriority(10);
                com.fasterxml.jackson.core.JsonParser jsonparser;
                LogUtils.LOGD(HostConnection.TAG, "Starting socket listener thread...");
                jsonparser = objectMapper.getFactory().createParser(socket.getInputStream());
_L1:
                ObjectNode objectnode = (ObjectNode)objectMapper.readTree(jsonparser);
                if (objectnode == null)
                {
                    break MISSING_BLOCK_LABEL_119;
                }
                LogUtils.LOGD(HostConnection.TAG, (new StringBuilder()).append("Read from socket: ").append(objectnode.toString()).toString());
                handleTcpResponse(objectnode);
                  goto _L1
                Object obj;
                obj;
                LogUtils.LOGW(HostConnection.TAG, "Got an exception while parsing JSON response.", ((Throwable) (obj)));
                callErrorCallback(null, new ApiException(0, ((Exception) (obj))));
                return;
                obj;
                LogUtils.LOGW(HostConnection.TAG, "Error reading from socket.", ((Throwable) (obj)));
                disconnect();
                callErrorCallback(null, new ApiException(3, ((Exception) (obj))));
                return;
            }

            
            {
                this$0 = HostConnection.this;
                socket = socket1;
                super();
            }
        });
    }

    private Socket openTcpConnection(HostInfo hostinfo)
        throws ApiException
    {
        Socket socket1;
        try
        {
            LogUtils.LOGD(TAG, (new StringBuilder()).append("Opening TCP connection on host: ").append(hostinfo.getAddress()).toString());
            socket1 = new Socket();
            InetSocketAddress inetsocketaddress = new InetSocketAddress(hostinfo.getAddress(), hostinfo.getTcpPort());
            socket1.setSoTimeout(30000);
            socket1.connect(inetsocketaddress, connectTimeout);
        }
        catch (IOException ioexception)
        {
            LogUtils.LOGW(TAG, (new StringBuilder()).append("Failed to open TCP connection to host: ").append(hostinfo.getAddress()).toString());
            throw new ApiException(1, ioexception);
        }
        return socket1;
    }

    private ObjectNode parseJsonResponse(String s)
        throws ApiException
    {
        try
        {
            s = (ObjectNode)objectMapper.readTree(s);
            if (s.has("error"))
            {
                throw new ApiException(ApiException.API_ERROR, s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtils.LOGW(TAG, "Got an exception while parsing JSON response.", s);
            throw new ApiException(0, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtils.LOGW(TAG, "Got an exception while parsing JSON response.", s);
            throw new ApiException(0, s);
        }
        if (!s.has("result"))
        {
            throw new ApiException(0, "Result doesn't contain a result node.");
        }
        return s;
    }

    private Response sendOkHttpRequest(OkHttpClient okhttpclient, Request request)
        throws ApiException
    {
        try
        {
            okhttpclient = okhttpclient.newCall(request).execute();
        }
        // Misplaced declaration of an exception variable
        catch (OkHttpClient okhttpclient)
        {
            LogUtils.LOGW(TAG, "Got a Protocol Exception when trying to send OkHttp request. Trying again without connection pooling to try to circunvent this", okhttpclient);
            httpClient = getNewOkHttpClientNoKeepAlive();
            throw new ApiException(2, okhttpclient);
        }
        // Misplaced declaration of an exception variable
        catch (OkHttpClient okhttpclient)
        {
            LogUtils.LOGW(TAG, "Failed to send OkHttp request.", okhttpclient);
            throw new ApiException(2, okhttpclient);
        }
        // Misplaced declaration of an exception variable
        catch (OkHttpClient okhttpclient)
        {
            LogUtils.LOGW(TAG, "Got a Runtime exception when sending OkHttp request. Probably a malformed URL.", okhttpclient);
            throw new ApiException(2, okhttpclient);
        }
        return okhttpclient;
    }

    private void sendTcpRequest(Socket socket1, String s)
        throws ApiException
    {
        try
        {
            LogUtils.LOGD(TAG, (new StringBuilder()).append("Sending request via TCP: ").append(s).toString());
            socket1 = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
            socket1.write(s);
            socket1.flush();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket1)
        {
            LogUtils.LOGW(TAG, "Failed to send TCP request.", socket1);
        }
        disconnect();
        throw new ApiException(2, socket1);
    }

    public void disconnect()
    {
        if (protocol == 1)
        {
            return;
        }
        if (socket != null && !socket.isClosed())
        {
            socket.close();
        }
        socket = null;
        return;
        Object obj;
        obj;
        LogUtils.LOGE(TAG, "Error while closing socket", ((Throwable) (obj)));
        socket = null;
        return;
        obj;
        socket = null;
        throw obj;
    }

    public void execute(final ApiMethod method, final ApiCallback callback, final Handler handler)
    {
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Starting method execute. Method: ").append(method.getMethodName()).append(" on host: ").append(hostInfo.getJsonRpcHttpEndpoint()).toString());
        method = new Runnable() {

            final HostConnection this$0;
            final ApiCallback val$callback;
            final Handler val$handler;
            final ApiMethod val$method;

            public void run()
            {
                Process.setThreadPriority(10);
                if (protocol == 1)
                {
                    executeThroughOkHttp(method, callback, handler);
                    return;
                } else
                {
                    executeThroughTcp(method, callback, handler);
                    return;
                }
            }

            
            {
                this$0 = HostConnection.this;
                method = apimethod;
                callback = apicallback;
                handler = handler1;
                super();
            }
        };
        executorService.execute(method);
    }

    public OkHttpClient getOkHttpClient()
    {
        if (httpClient == null)
        {
            httpClient = new OkHttpClient();
            httpClient.setConnectTimeout(connectTimeout, TimeUnit.MILLISECONDS);
            httpClient.setAuthenticator(new Authenticator() {

                final HostConnection this$0;

                public Request authenticate(Proxy proxy, Response response)
                    throws IOException
                {
                    if (TextUtils.isEmpty(hostInfo.getUsername()))
                    {
                        return null;
                    } else
                    {
                        proxy = Credentials.basic(hostInfo.getUsername(), hostInfo.getPassword());
                        return response.request().newBuilder().header("Authorization", proxy).build();
                    }
                }

                public Request authenticateProxy(Proxy proxy, Response response)
                    throws IOException
                {
                    return null;
                }

            
            {
                this$0 = HostConnection.this;
                super();
            }
            });
        }
        return httpClient;
    }

    public int getProtocol()
    {
        return protocol;
    }

    public void registerInputNotificationsObserver(InputNotificationsObserver inputnotificationsobserver, Handler handler)
    {
        inputNotificationsObservers.put(inputnotificationsobserver, handler);
    }

    public void registerPlayerNotificationsObserver(PlayerNotificationsObserver playernotificationsobserver, Handler handler)
    {
        playerNotificationsObservers.put(playernotificationsobserver, handler);
    }

    public void registerSystemNotificationsObserver(SystemNotificationsObserver systemnotificationsobserver, Handler handler)
    {
        systemNotificationsObservers.put(systemnotificationsobserver, handler);
    }

    public void setProtocol(int i)
    {
        if (!isValidProtocol(i))
        {
            throw new IllegalArgumentException("Invalid protocol specified.");
        } else
        {
            protocol = i;
            return;
        }
    }

    public void unregisterInputNotificationsObserver(InputNotificationsObserver inputnotificationsobserver)
    {
        inputNotificationsObservers.remove(inputnotificationsobserver);
    }

    public void unregisterPlayerNotificationsObserver(PlayerNotificationsObserver playernotificationsobserver)
    {
        playerNotificationsObservers.remove(playernotificationsobserver);
    }

    public void unregisterSystemNotificationsObserver(SystemNotificationsObserver systemnotificationsobserver)
    {
        systemNotificationsObservers.remove(systemnotificationsobserver);
    }








}
