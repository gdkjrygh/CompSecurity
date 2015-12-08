// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiDateFormat;
import com.soundcloud.android.api.UnauthorisedRequestRegistry;
import com.soundcloud.android.api.legacy.model.CollectionHolder;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.utils.BuildHelper;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLContext;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultRequestDirector;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            Env, SoundCloudTokenListener, Request, UnexpectedResponseException, 
//            NotFoundException, Http, TokenListener, InvalidTokenException, 
//            ApiResponseException, ResolverException, BrokenHttpClientException

public class PublicApi
{

    private static final int API_LOOKUP_BATCH_SIZE = 200;
    public static final String BACKGROUND_PARAMETER = "_behavior[non_interactive]";
    public static final int BUFFER_SIZE = 8192;
    public static final String DEFAULT_CONTENT_TYPE = "application/json";
    public static final long KEEPALIVE_TIMEOUT = 20000L;
    public static final String LINKED_PARTITIONING = "linked_partitioning";
    public static final int MAX_TOTAL_CONNECTIONS = 10;
    private static final CookieStore NO_OP_COOKIE_STORE = new _cls2();
    public static final String OAUTH_SCHEME = "oauth";
    public static final String REALM = "SoundCloud";
    public static final String TAG = com/soundcloud/android/api/legacy/PublicApi.getSimpleName();
    public static final int TIMEOUT = 20000;
    private static final String UNCHECKED = "unchecked";
    public static final String USER_AGENT = "SoundCloud Java Wrapper (1.3.1)";
    public static final String VERSION = "1.3.1";
    protected static final ThreadLocal defaultParams = new _cls1();
    private static PublicApi instance;
    private AccountOperations accountOperations;
    private ApplicationProperties applicationProperties;
    public boolean debugRequests;
    private String defaultAcceptEncoding;
    protected String defaultContentType;
    public final Env env;
    private transient HttpClient httpClient;
    private transient TokenListener listener;
    protected final OAuth oAuth;
    private ObjectMapper objectMapper;
    private UnauthorisedRequestRegistry unauthorisedRequestRegistry;
    private String userAgent;

    public PublicApi(Context context)
    {
        this(context, SoundCloudApplication.fromContext(context).getAccountOperations(), new ApplicationProperties(context.getResources()), new BuildHelper());
    }

    PublicApi(Context context, ObjectMapper objectmapper, OAuth oauth, AccountOperations accountoperations, ApplicationProperties applicationproperties, UnauthorisedRequestRegistry unauthorisedrequestregistry, DeviceHelper devicehelper)
    {
        Object obj = null;
        super();
        env = Env.LIVE;
        accountOperations = accountoperations;
        oAuth = oauth;
        unauthorisedRequestRegistry = unauthorisedrequestregistry;
        applicationProperties = applicationproperties;
        objectMapper = objectmapper;
        if (context == null)
        {
            return;
        }
        setTokenListener(new SoundCloudTokenListener(accountoperations));
        userAgent = devicehelper.getUserAgent();
        objectmapper = new IntentFilter();
        objectmapper.addAction("com.soundcloud.android.action.CHANGE_PROXY");
        context.registerReceiver(new _cls3(), objectmapper);
        if (applicationproperties.shouldEnableNetworkProxy())
        {
            context = PreferenceManager.getDefaultSharedPreferences(context).getString("dev.http.proxy", null);
            if (TextUtils.isEmpty(context))
            {
                context = obj;
            } else
            {
                context = URI.create(context);
            }
            setProxy(context);
        }
        setDefaultAcceptEncoding("gzip");
    }

    public PublicApi(Context context, AccountOperations accountoperations, ApplicationProperties applicationproperties, BuildHelper buildhelper)
    {
        this(context, buildObjectMapper(), new OAuth(accountoperations), accountoperations, applicationproperties, UnauthorisedRequestRegistry.getInstance(context), new DeviceHelper(context, buildhelper));
    }

    private void addRequestParams(Request request, Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); request.add((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public static ObjectMapper buildObjectMapper()
    {
        return (new ObjectMapper()).configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).setDateFormat(new ApiDateFormat());
    }

    public static void clearDefaultParameters()
    {
        defaultParams.remove();
    }

    public static String generateRequestResponseLog(HttpHost httphost, HttpUriRequest httpurirequest, HttpResponse httpresponse)
    {
        StringBuilder stringbuilder = new StringBuilder(2000);
        stringbuilder.append(httpurirequest.getMethod()).append(' ').append(httphost.getSchemeName()).append(':').append(httphost.toHostString()).append(' ').append(httpurirequest.getURI()).append(";headers=");
        httphost = httpurirequest.getAllHeaders();
        int j = httphost.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(httphost[i].toString()).append(';');
        }

        httpurirequest = stringbuilder.append("response=");
        if (httpresponse == null)
        {
            httphost = "NULL";
        } else
        {
            httphost = httpresponse.getStatusLine();
        }
        httpurirequest.append(httphost);
        return stringbuilder.toString();
    }

    private InputStream getInputStream(HttpResponse httpresponse, Request request)
        throws IOException
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        switch (i)
        {
        default:
            if (!isStatusCodeOk(i))
            {
                throw new UnexpectedResponseException(request, httpresponse.getStatusLine());
            } else
            {
                return httpresponse.getEntity().getContent();
            }

        case 404: 
            throw new NotFoundException();
        }
    }

    public static PublicApi getInstance(Context context)
    {
        com/soundcloud/android/api/legacy/PublicApi;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new PublicApi(context.getApplicationContext());
        }
        context = instance;
        com/soundcloud/android/api/legacy/PublicApi;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static boolean isStatusCodeClientError(int i)
    {
        return i >= 400 && i < 500;
    }

    public static boolean isStatusCodeOk(int i)
    {
        return i >= 200 && i < 400;
    }

    private void logRequest(HttpHost httphost, HttpUriRequest httpurirequest, HttpResponse httpresponse)
    {
        httphost = generateRequestResponseLog(httphost, httpurirequest, httpresponse);
        ErrorUtils.log(4, TAG, httphost);
    }

    private void recordUnauthorisedRequestIfRequired(HttpResponse httpresponse)
    {
        if (responseIsUnauthorised(httpresponse) && accountOperations.hasValidToken())
        {
            unauthorisedRequestRegistry.updateObservedUnauthorisedRequestTimestamp();
        }
    }

    private Token requestToken(Request request)
        throws IOException
    {
        HttpResponse httpresponse;
        int i;
        httpresponse = safeExecute(env.getSecureResourceHost(), request.buildRequest(org/apache/http/client/methods/HttpPost));
        i = httpresponse.getStatusLine().getStatusCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        request = new Token(Http.getJSON(httpresponse));
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        listener.onTokenRefreshed(request);
        return request;
        try
        {
            request = Http.getJSON(httpresponse).getString("error");
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            request = request.getMessage();
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            request = request.getMessage();
        }
        if (i == 401)
        {
            request = new InvalidTokenException(i, request);
        } else
        {
            request = new ApiResponseException(httpresponse, request);
        }
        throw request;
        return request;
    }

    private boolean responseIsUnauthorised(HttpResponse httpresponse)
    {
        return httpresponse != null && httpresponse.getStatusLine().getStatusCode() == 401;
    }

    public static void setBackgroundMode(boolean flag)
    {
        if (flag)
        {
            setDefaultParameter("_behavior[non_interactive]", "1");
            return;
        } else
        {
            clearDefaultParameters();
            return;
        }
    }

    public static void setDefaultParameter(String s, String s1)
    {
        ((Request)defaultParams.get()).set(s, s1);
    }

    private static SSLSocketFactory unsafeSocketFactory()
    {
        _cls4 _lcls4;
        try
        {
            _lcls4 = new _cls4(null, null, null, null, null, SSLContext.getInstance("TLS"));
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            throw new RuntimeException(generalsecurityexception);
        }
        return _lcls4;
    }

    protected HttpUriRequest addAcceptHeader(HttpUriRequest httpurirequest)
    {
        if (!httpurirequest.containsHeader("Accept"))
        {
            httpurirequest.addHeader("Accept", getDefaultContentType());
        }
        return httpurirequest;
    }

    protected HttpUriRequest addEncodingHeader(HttpUriRequest httpurirequest)
    {
        if (getDefaultAcceptEncoding() != null)
        {
            httpurirequest.addHeader("Accept-Encoding", getDefaultAcceptEncoding());
        }
        return httpurirequest;
    }

    protected HttpUriRequest addHeaders(HttpUriRequest httpurirequest)
    {
        httpurirequest = addEncodingHeader(httpurirequest);
        if (!httpurirequest.containsHeader("Authorization") && getToken().valid())
        {
            httpurirequest.addHeader("Authorization", oAuth.getAuthorizationHeaderValue());
        }
        return addAcceptHeader(httpurirequest);
    }

    public transient Token clientCredentials(String as[])
        throws IOException
    {
        int i = 0;
        Object obj = Request.to("/oauth2/token", new Object[0]);
        addRequestParams(((Request) (obj)), oAuth.getTokenRequestParamsFromClientCredentials(as));
        obj = requestToken(((Request) (obj)));
        if (as != null)
        {
            for (int j = as.length; i < j; i++)
            {
                String s = as[i];
                if (!((Token) (obj)).hasScope(s))
                {
                    throw new InvalidTokenException(-1, (new StringBuilder("Could not obtain requested scope '")).append(s).append("' (got: '").append(((Token) (obj)).getScope()).append("')").toString());
                }
            }

        }
        return ((Token) (obj));
    }

    public PublicApiResource create(Request request)
        throws IOException
    {
        request = getInputStream(post(request), request);
        PublicApiResource publicapiresource = (PublicApiResource)getMapper().readValue(request, com/soundcloud/android/api/legacy/model/PublicApiResource);
        IOUtils.close(request);
        return publicapiresource;
        Exception exception;
        exception;
        IOUtils.close(request);
        throw exception;
    }

    public HttpResponse delete(Request request)
        throws IOException
    {
        return execute(request, org/apache/http/client/methods/HttpDelete);
    }

    protected HttpHost determineTarget(HttpUriRequest httpurirequest)
    {
        httpurirequest = httpurirequest.getURI();
        if (httpurirequest.isAbsolute())
        {
            return new HttpHost(httpurirequest.getHost(), httpurirequest.getPort(), httpurirequest.getScheme());
        } else
        {
            return null;
        }
    }

    protected HttpResponse execute(Request request, Class class1)
        throws IOException
    {
        Object obj = (Request)defaultParams.get();
        Request request1 = request;
        if (obj != null)
        {
            request1 = request;
            if (!((Request) (obj)).getParams().isEmpty())
            {
                request1 = new Request(request);
                for (request = ((Request) (obj)).iterator(); request.hasNext(); request1.add(((NameValuePair) (obj)).getName(), ((NameValuePair) (obj)).getValue()))
                {
                    obj = (NameValuePair)request.next();
                }

            }
        }
        logRequest(class1, request1);
        request = request1;
        if (!request1.getParams().containsKey("client_id"))
        {
            request = (new Request(request1)).add("client_id", oAuth.getClientId());
        }
        return execute(((HttpUriRequest) (request.buildRequest(class1))));
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException
    {
        return safeExecute(env.getSecureResourceHost(), addHeaders(httpurirequest));
    }

    public HttpResponse get(Request request)
        throws IOException
    {
        return execute(request, org/apache/http/client/methods/HttpGet);
    }

    public String getDefaultAcceptEncoding()
    {
        return defaultAcceptEncoding;
    }

    public String getDefaultContentType()
    {
        if (defaultContentType == null)
        {
            return "application/json";
        } else
        {
            return defaultContentType;
        }
    }

    public Env getEnv()
    {
        return env;
    }

    public HttpClient getHttpClient()
    {
        if (httpClient == null)
        {
            HttpParams httpparams = getParams();
            HttpClientParams.setRedirecting(httpparams, false);
            HttpProtocolParams.setUserAgent(httpparams, getUserAgent());
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", getSSLSocketFactory(), 443));
            httpClient = new _cls5(new ThreadSafeClientConnManager(httpparams, schemeregistry), httpparams);
        }
        return httpClient;
    }

    public ObjectMapper getMapper()
    {
        return objectMapper;
    }

    protected HttpParams getParams()
    {
        BasicHttpParams basichttpparams;
        String s;
        String s1;
        basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        ConnManagerParams.setMaxTotalConnections(basichttpparams, 10);
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
        basichttpparams.setBooleanParameter("http.protocol.expect-continue", false);
        basichttpparams.setParameter("http.conn-manager.max-per-route", new _cls6());
        s = System.getProperty("http.proxyHost");
        s1 = System.getProperty("http.proxyPort");
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = 80;
        int j = Integer.parseInt(s1);
        i = j;
_L4:
        basichttpparams.setParameter("http.route.default-proxy", new HttpHost(s, i));
_L2:
        return basichttpparams;
        NumberFormatException numberformatexception;
        numberformatexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected RequestDirector getRequestDirector(HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, HttpRequestRetryHandler httprequestretryhandler, 
            RedirectHandler redirecthandler, AuthenticationHandler authenticationhandler, AuthenticationHandler authenticationhandler1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        return new DefaultRequestDirector(httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, redirecthandler, authenticationhandler, authenticationhandler1, usertokenhandler, httpparams);
    }

    protected SSLSocketFactory getSSLSocketFactory()
    {
        return SSLSocketFactory.getSocketFactory();
    }

    protected SocketFactory getSocketFactory()
    {
        return PlainSocketFactory.getSocketFactory();
    }

    public Token getToken()
    {
        return accountOperations.getSoundCloudToken();
    }

    public String getUserAgent()
    {
        if (userAgent == null)
        {
            return "SoundCloud Java Wrapper (1.3.1)";
        } else
        {
            return userAgent;
        }
    }

    public Token invalidateToken()
    {
        Token token1 = accountOperations.getSoundCloudToken();
        Token token;
        if (listener == null)
        {
            token = null;
        } else
        {
            token = listener.onTokenInvalid(token1);
        }
        token1.invalidate();
        if (token != null)
        {
            return token;
        } else
        {
            return null;
        }
    }

    protected void logRequest(Class class1, Request request)
    {
        if (debugRequests)
        {
            System.err.println((new StringBuilder()).append(class1.getSimpleName()).append(" ").append(request).toString());
        }
    }

    public Token login(String s, String s1)
        throws IOException
    {
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException("username or password is null");
        } else
        {
            Request request = Request.to("/oauth2/token", new Object[0]);
            addRequestParams(request, oAuth.getTokenRequestParamsFromUserCredentials(s, s1));
            return requestToken(request);
        }
    }

    public HttpResponse post(Request request)
        throws IOException
    {
        return execute(request, org/apache/http/client/methods/HttpPost);
    }

    public HttpResponse put(Request request)
        throws IOException
    {
        return execute(request, org/apache/http/client/methods/HttpPut);
    }

    public PublicApiResource read(Request request)
        throws IOException
    {
        request = getInputStream(get(request), request);
        PublicApiResource publicapiresource = (PublicApiResource)getMapper().readValue(request, com/soundcloud/android/api/legacy/model/PublicApiResource);
        IOUtils.close(request);
        return publicapiresource;
        Exception exception;
        exception;
        IOUtils.close(request);
        throw exception;
    }

    public com.soundcloud.android.api.legacy.model.PublicApiResource.ResourceHolder readCollection(Request request)
        throws IOException
    {
        request = getInputStream(get(request), request);
        com.soundcloud.android.api.legacy.model.PublicApiResource.ResourceHolder resourceholder = (com.soundcloud.android.api.legacy.model.PublicApiResource.ResourceHolder)getMapper().readValue(request, com/soundcloud/android/api/legacy/model/PublicApiResource$ResourceHolder);
        IOUtils.close(request);
        return resourceholder;
        Exception exception;
        exception;
        IOUtils.close(request);
        throw exception;
    }

    public List readFullCollection(Request request, Class class1)
        throws IOException
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = null;
_L2:
        CollectionHolder collectionholder;
        if (obj == null)
        {
            obj = request;
        } else
        {
            obj = Request.to(((CollectionHolder) (obj)).next_href, new Object[0]);
        }
        obj = ((Request) (obj)).with(new Object[] {
            "linked_partitioning", "1"
        });
        obj = getInputStream(get(((Request) (obj))), ((Request) (obj)));
        collectionholder = (CollectionHolder)getMapper().readValue(((InputStream) (obj)), class1);
        IOUtils.close(((java.io.Closeable) (obj)));
        if (collectionholder == null)
        {
            throw new IOException("invalid data");
        }
        break MISSING_BLOCK_LABEL_104;
        request;
        IOUtils.close(((java.io.Closeable) (obj)));
        throw request;
        if (collectionholder.collection != null)
        {
            arraylist.addAll(collectionholder.collection);
        }
        obj = collectionholder;
        if (TextUtils.isEmpty(collectionholder.next_href))
        {
            return arraylist;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List readList(Request request)
        throws IOException
    {
        InputStream inputstream;
        Object obj = null;
        inputstream = getInputStream(get(request), request);
        request = obj;
        JsonParser jsonparser = getMapper().getFactory().createParser(inputstream);
        request = jsonparser;
        JsonToken jsontoken = jsonparser.getCurrentToken();
        Object obj1;
        obj1 = jsontoken;
        if (jsontoken != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        request = jsonparser;
        jsontoken = jsonparser.nextToken();
        obj1 = jsontoken;
        if (jsontoken != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        request = jsonparser;
        throw JsonMappingException.from(jsonparser, "No content to map due to end-of-input");
        obj1;
        IOUtils.close(request);
        IOUtils.close(inputstream);
        throw obj1;
        request = jsonparser;
        if (obj1 != JsonToken.START_ARRAY) goto _L2; else goto _L1
_L1:
        request = jsonparser;
        obj1 = (List)getMapper().readValue(jsonparser, getMapper().getTypeFactory().constructCollectionType(java/util/List, com/soundcloud/android/api/legacy/model/PublicApiResource));
        request = ((Request) (obj1));
_L4:
        obj1 = request;
        if (request != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        request = jsonparser;
        obj1 = Collections.emptyList();
        IOUtils.close(jsonparser);
        IOUtils.close(inputstream);
        return ((List) (obj1));
_L2:
        request = jsonparser;
        if (obj1 != JsonToken.START_OBJECT)
        {
            break; /* Loop/switch isn't completed */
        }
        request = jsonparser;
        obj1 = ((com.soundcloud.android.api.legacy.model.PublicApiResource.ResourceHolder)getMapper().readValue(jsonparser, com/soundcloud/android/api/legacy/model/PublicApiResource$ResourceHolder)).collection;
        request = ((Request) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
        request = jsonparser;
        throw JsonMappingException.from(jsonparser, "Invalid content");
    }

    public List readListFromIds(Request request, List list)
        throws IOException
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i += 200)
        {
            List list1 = list.subList(i, Math.min(i + 200, list.size()));
            arraylist.addAll(readList((new Request(request)).add("linked_partitioning", "1").add("limit", Integer.valueOf(200)).add("ids", TextUtils.join(",", list1))));
        }

        return arraylist;
    }

    public Token refreshToken()
        throws IOException
    {
        Token token = accountOperations.getSoundCloudToken();
        if (!token.hasRefreshToken())
        {
            throw new IllegalStateException("no refresh token available");
        } else
        {
            Request request = Request.to("/oauth2/token", new Object[0]);
            addRequestParams(request, oAuth.getTokenRequestParamsForRefreshToken(token.getRefreshToken()));
            return requestToken(request);
        }
    }

    public long resolve(String s)
        throws IOException
    {
        s = get(Request.to("/resolve", new Object[0]).with(new Object[] {
            "url", s
        }));
        if (s.getStatusLine().getStatusCode() == 302)
        {
            Object obj = s.getFirstHeader("Location");
            if (obj != null && ((Header) (obj)).getValue() != null)
            {
                obj = URI.create(((Header) (obj)).getValue()).getPath();
                if (obj != null && ((String) (obj)).contains("/"))
                {
                    int i;
                    try
                    {
                        i = Integer.parseInt(((String) (obj)).substring(((String) (obj)).lastIndexOf('/') + 1));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new ResolverException(((Throwable) (obj)), s);
                    }
                    return (long)i;
                } else
                {
                    throw new ResolverException((new StringBuilder("Invalid string:")).append(((String) (obj))).toString(), s);
                }
            } else
            {
                throw new ResolverException("No location header", s);
            }
        } else
        {
            throw new ResolverException("Invalid status code", s);
        }
    }

    public HttpResponse safeExecute(HttpHost httphost, HttpUriRequest httpurirequest)
        throws IOException
    {
        HttpResponse httpresponse = null;
        HttpResponse httpresponse1 = safeExecute2TheSequel(httphost, httpurirequest);
        httpresponse = httpresponse1;
        recordUnauthorisedRequestIfRequired(httpresponse1);
        logRequest(httphost, httpurirequest, httpresponse1);
        return httpresponse1;
        Exception exception;
        exception;
        logRequest(httphost, httpurirequest, httpresponse);
        throw exception;
    }

    public HttpResponse safeExecute2TheSequel(HttpHost httphost, HttpUriRequest httpurirequest)
        throws IOException
    {
        HttpHost httphost1;
        httphost1 = httphost;
        if (httphost == null)
        {
            HttpHost httphost2 = determineTarget(httpurirequest);
            if (httphost2 == null)
            {
                httphost = "null";
            } else
            {
                httphost = String.format("%s://%s", new Object[] {
                    httphost2.getSchemeName(), httphost2.toHostString()
                });
            }
            ErrorUtils.log(4, TAG, String.format("automatically determine target to be %s", new Object[] {
                httphost
            }));
            httphost1 = httphost2;
            if (httphost2 == null)
            {
                throw new NullPointerException("Api wrapper was passed a 'null' target, and could not determine a default");
            }
        }
        httphost = getHttpClient().execute(httphost1, httpurirequest);
        return httphost;
        httphost;
        if (!httpurirequest.isAborted() && httpurirequest.getParams().isParameterFalse("npe-retried"))
        {
            httpurirequest.getParams().setBooleanParameter("npe-retried", true);
            return safeExecute(httphost1, httpurirequest);
        } else
        {
            httpurirequest.abort();
            throw new BrokenHttpClientException(httphost);
        }
        httphost;
_L2:
        httpurirequest.abort();
        throw new BrokenHttpClientException(httphost);
        httphost;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void setDefaultAcceptEncoding(String s)
    {
        defaultAcceptEncoding = s;
    }

    public void setProxy(URI uri)
    {
        Object obj;
        if (uri != null)
        {
            obj = getHttpClient().getConnectionManager().getSchemeRegistry().getScheme(uri.getScheme());
            obj = new HttpHost(uri.getHost(), ((Scheme) (obj)).resolvePort(uri.getPort()), ((Scheme) (obj)).getName());
        } else
        {
            obj = null;
        }
        getHttpClient().getParams().setParameter("http.route.default-proxy", obj);
        if (applicationProperties.shouldEnableNetworkProxy())
        {
            obj = getHttpClient().getConnectionManager().getSchemeRegistry();
            if (uri != null)
            {
                uri = unsafeSocketFactory();
            } else
            {
                uri = getSSLSocketFactory();
            }
            ((SchemeRegistry) (obj)).register(new Scheme("https", uri, 443));
        }
    }

    public void setTokenListener(TokenListener tokenlistener)
    {
        this;
        JVM INSTR monitorenter ;
        listener = tokenlistener;
        this;
        JVM INSTR monitorexit ;
        return;
        tokenlistener;
        throw tokenlistener;
    }

    public PublicApiResource update(Request request)
        throws IOException
    {
        request = getInputStream(put(request), request);
        PublicApiResource publicapiresource = (PublicApiResource)getMapper().readValue(request, com/soundcloud/android/api/legacy/model/PublicApiResource);
        IOUtils.close(request);
        return publicapiresource;
        Exception exception;
        exception;
        IOUtils.close(request);
        throw exception;
    }



    private class _cls3 extends BroadcastReceiver
    {

        final PublicApi this$0;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getStringExtra("proxy");
            intent = PublicApi.TAG;
            intent = PublicApi.this;
            if (context == null)
            {
                context = null;
            } else
            {
                context = URI.create(context);
            }
            intent.setProxy(context);
        }

        _cls3()
        {
            this$0 = PublicApi.this;
            super();
        }
    }


    private class _cls4 extends SSLSocketFactory
    {

        final SSLContext val$context;

        public final Socket createSocket()
            throws IOException
        {
            return context.getSocketFactory().createSocket();
        }

        public final Socket createSocket(Socket socket, String s, int i, boolean flag)
            throws IOException
        {
            return context.getSocketFactory().createSocket(socket, s, i, flag);
        }

        _cls4(KeyStore keystore, String s1, KeyStore keystore1, SecureRandom securerandom, HostNameResolver hostnameresolver, SSLContext sslcontext)
            throws KeyManagementException
        {
            context = sslcontext;
            super(final_s, keystore, s1, keystore1, securerandom, hostnameresolver);
            class _cls1
                implements X509TrustManager
            {

                final _cls4 this$0;

                public void checkClientTrusted(X509Certificate ax509certificate[], String s)
                    throws CertificateException
                {
                    s = PublicApi.TAG;
                    (new StringBuilder("trusting ")).append(Arrays.asList(ax509certificate));
                }

                public void checkServerTrusted(X509Certificate ax509certificate[], String s)
                    throws CertificateException
                {
                    s = PublicApi.TAG;
                    (new StringBuilder("trusting ")).append(Arrays.asList(ax509certificate));
                }

                public X509Certificate[] getAcceptedIssuers()
                {
                    return new X509Certificate[0];
                }

                _cls1()
                {
                    this$0 = _cls4.this;
                    super();
                }
            }

            context.init(null, new TrustManager[] {
                new _cls1()
            }, null);
        }
    }


    private class _cls5 extends DefaultHttpClient
    {

        final PublicApi this$0;

        protected RequestDirector createClientRequestDirector(HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, HttpRequestRetryHandler httprequestretryhandler, 
                RedirectHandler redirecthandler, AuthenticationHandler authenticationhandler, AuthenticationHandler authenticationhandler1, UserTokenHandler usertokenhandler, HttpParams httpparams)
        {
            return getRequestDirector(httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, redirecthandler, authenticationhandler, authenticationhandler1, usertokenhandler, httpparams);
        }

        protected CookieStore createCookieStore()
        {
            return PublicApi.NO_OP_COOKIE_STORE;
        }

        protected HttpContext createHttpContext()
        {
            HttpContext httpcontext = super.createHttpContext();
            httpcontext.setAttribute("http.auth.scheme-pref", Arrays.asList(new String[] {
                "oauth", "digest", "basic"
            }));
            return httpcontext;
        }

        protected BasicHttpProcessor createHttpProcessor()
        {
            BasicHttpProcessor basichttpprocessor = super.createHttpProcessor();
            basichttpprocessor.addInterceptor(new OAuth2HttpRequestInterceptor());
            return basichttpprocessor;
        }

        _cls5(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
        {
            this$0 = PublicApi.this;
            super(clientconnectionmanager, httpparams);
            class _cls1
                implements ConnectionKeepAliveStrategy
            {

                final _cls5 this$1;

                public long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
                {
                    return 20000L;
                }

                _cls1()
                {
                    this$1 = _cls5.this;
                    super();
                }
            }

            setKeepAliveStrategy(new _cls1());
            getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, -1, "SoundCloud", "oauth"), OAuth2Scheme.EmptyCredentials.INSTANCE);
            getAuthSchemes().register("oauth", new OAuth2Scheme.Factory(PublicApi.this));
            class _cls2
                implements HttpResponseInterceptor
            {

                final _cls5 this$1;

                public void process(HttpResponse httpresponse, HttpContext httpcontext)
                    throws HttpException, IOException
                {
                    if (httpresponse != null && httpresponse.getEntity() != null) goto _L2; else goto _L1
_L1:
                    return;
_L2:
                    httpcontext = httpresponse.getEntity();
                    Header header = httpcontext.getContentEncoding();
                    if (header != null)
                    {
                        HeaderElement aheaderelement[] = header.getElements();
                        int j = aheaderelement.length;
                        int i = 0;
                        while (i < j) 
                        {
                            if (aheaderelement[i].getName().equalsIgnoreCase("gzip"))
                            {
                                httpresponse.setEntity(new GzipDecompressingEntity(httpcontext));
                                return;
                            }
                            i++;
                        }
                    }
                    if (true) goto _L1; else goto _L3
_L3:
                }

                _cls2()
                {
                    this$1 = _cls5.this;
                    super();
                }
            }

            addResponseInterceptor(new _cls2());
        }
    }


    private class _cls6
        implements ConnPerRoute
    {

        final PublicApi this$0;

        public int getMaxForRoute(HttpRoute httproute)
        {
            return !env.isApiHost(httproute.getTargetHost()) ? 2 : 10;
        }

        _cls6()
        {
            this$0 = PublicApi.this;
            super();
        }
    }


    private class _cls1 extends ThreadLocal
    {

        protected final Request initialValue()
        {
            return new Request();
        }

        protected final volatile Object initialValue()
        {
            return initialValue();
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements CookieStore
    {

        public final void addCookie(Cookie cookie)
        {
        }

        public final void clear()
        {
        }

        public final boolean clearExpired(Date date)
        {
            return false;
        }

        public final List getCookies()
        {
            return Collections.emptyList();
        }

        _cls2()
        {
        }
    }

}
