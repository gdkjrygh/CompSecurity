// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import twitter4j.TwitterException;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j.internal.http:
//            HttpClientBase, HttpClient, HttpResponseCode, HttpClientConfiguration, 
//            HttpRequest, RequestMethod, HttpParameter, HttpResponseImpl, 
//            HttpResponse

public class HttpClientImpl extends HttpClientBase
    implements HttpClient, HttpResponseCode, Serializable
{

    static Class class$twitter4j$internal$http$HttpClientImpl;
    private static final Map instanceMap;
    private static boolean isJDK14orEarlier = false;
    private static final Logger logger;
    private static final long serialVersionUID = 0x859c02532b19cd01L;

    public HttpClientImpl()
    {
        super(ConfigurationContext.getInstance());
    }

    public HttpClientImpl(HttpClientConfiguration httpclientconfiguration)
    {
        super(httpclientconfiguration);
        if (isProxyConfigured() && isJDK14orEarlier)
        {
            logger.warn("HTTP Proxy is not supported on JDK1.4 or earlier. Try twitter4j-httpclient-supoprt artifact");
        }
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
    }

    public static String encode(String s)
    {
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError("will never happen");
        }
        return s;
    }

    private HttpURLConnection getConnection(String s)
        throws IOException
    {
        if (isProxyConfigured() && !isJDK14orEarlier)
        {
            if (CONF.getHttpProxyUser() != null && !CONF.getHttpProxyUser().equals(""))
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug("Proxy AuthUser: " + CONF.getHttpProxyUser());
                    logger.debug("Proxy AuthPassword: " + z_T4JInternalStringUtil.maskString(CONF.getHttpProxyPassword()));
                }
                Authenticator.setDefault(new Authenticator() {

                    private final HttpClientImpl this$0;

                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        if (getRequestorType().equals(java.net.Authenticator.RequestorType.PROXY))
                        {
                            return new PasswordAuthentication(CONF.getHttpProxyUser(), CONF.getHttpProxyPassword().toCharArray());
                        } else
                        {
                            return null;
                        }
                    }

            
            {
                this$0 = HttpClientImpl.this;
                super();
            }
                });
            }
            Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress.createUnresolved(CONF.getHttpProxyHost(), CONF.getHttpProxyPort()));
            if (logger.isDebugEnabled())
            {
                logger.debug("Opening proxied connection(" + CONF.getHttpProxyHost() + ":" + CONF.getHttpProxyPort() + ")");
            }
            s = (HttpURLConnection)(new URL(s)).openConnection(proxy);
        } else
        {
            s = (HttpURLConnection)(new URL(s)).openConnection();
        }
        if (CONF.getHttpConnectionTimeout() > 0 && !isJDK14orEarlier)
        {
            s.setConnectTimeout(CONF.getHttpConnectionTimeout());
        }
        if (CONF.getHttpReadTimeout() > 0 && !isJDK14orEarlier)
        {
            s.setReadTimeout(CONF.getHttpReadTimeout());
        }
        s.setInstanceFollowRedirects(false);
        return s;
    }

    public static HttpClient getInstance(HttpClientConfiguration httpclientconfiguration)
    {
        HttpClient httpclient = (HttpClient)instanceMap.get(httpclientconfiguration);
        Object obj = httpclient;
        if (httpclient == null)
        {
            obj = new HttpClientImpl(httpclientconfiguration);
            instanceMap.put(httpclientconfiguration, obj);
        }
        return ((HttpClient) (obj));
    }

    private void setHeaders(HttpRequest httprequest, HttpURLConnection httpurlconnection)
    {
        if (logger.isDebugEnabled())
        {
            logger.debug("Request: ");
            logger.debug(httprequest.getMethod().name() + " ", httprequest.getURL());
        }
        if (httprequest.getAuthorization() != null)
        {
            String s = httprequest.getAuthorization().getAuthorizationHeader(httprequest);
            if (s != null)
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug("Authorization: ", z_T4JInternalStringUtil.maskString(s));
                }
                httpurlconnection.addRequestProperty("Authorization", s);
            }
        }
        if (httprequest.getRequestHeaders() != null)
        {
            String s1;
            for (Iterator iterator = httprequest.getRequestHeaders().keySet().iterator(); iterator.hasNext(); logger.debug(s1 + ": " + (String)httprequest.getRequestHeaders().get(s1)))
            {
                s1 = (String)iterator.next();
                httpurlconnection.addRequestProperty(s1, (String)httprequest.getRequestHeaders().get(s1));
            }

        }
    }

    public HttpResponse get(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.GET, s, null, null, null));
    }

    public HttpResponse post(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, ahttpparameter, null, null));
    }

    public HttpResponse request(HttpRequest httprequest)
        throws TwitterException
    {
        Object obj2;
        int j;
        int l;
        l = CONF.getHttpRetryCount();
        j = 0;
        obj2 = null;
_L31:
        if (j >= l + 1) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj3;
        int i;
        i = -1;
        obj1 = null;
        obj3 = null;
        obj = obj3;
        Object obj4 = getConnection(httprequest.getURL());
        obj = obj3;
        ((HttpURLConnection) (obj4)).setDoInput(true);
        obj = obj3;
        setHeaders(httprequest, ((HttpURLConnection) (obj4)));
        obj = obj3;
        ((HttpURLConnection) (obj4)).setRequestMethod(httprequest.getMethod().name());
        obj = obj3;
        if (httprequest.getMethod() != RequestMethod.POST) goto _L4; else goto _L3
_L3:
        obj = obj3;
        if (!HttpParameter.containsFile(httprequest.getParameters())) goto _L6; else goto _L5
_L5:
        obj = obj3;
        obj1 = "----Twitter4J-upload" + System.currentTimeMillis();
        obj = obj3;
        ((HttpURLConnection) (obj4)).setRequestProperty("Content-Type", "multipart/form-data; boundary=" + obj1);
        obj = obj3;
        Object obj5 = "--" + obj1;
        obj = obj3;
        ((HttpURLConnection) (obj4)).setDoOutput(true);
        obj = obj3;
        obj1 = ((HttpURLConnection) (obj4)).getOutputStream();
        obj = obj1;
        Object obj6 = new DataOutputStream(((OutputStream) (obj1)));
        obj = obj1;
        HttpParameter ahttpparameter[] = httprequest.getParameters();
        obj = obj1;
        int i1 = ahttpparameter.length;
        int k = 0;
_L34:
        if (k >= i1) goto _L8; else goto _L7
_L7:
        obj3 = ahttpparameter[k];
        obj = obj1;
        if (!((HttpParameter) (obj3)).isFile()) goto _L10; else goto _L9
_L9:
        obj = obj1;
        write(((DataOutputStream) (obj6)), obj5 + "\r\n");
        obj = obj1;
        write(((DataOutputStream) (obj6)), "Content-Disposition: form-data; name=\"" + ((HttpParameter) (obj3)).getName() + "\"; filename=\"" + ((HttpParameter) (obj3)).getFile().getName() + "\"\r\n");
        obj = obj1;
        write(((DataOutputStream) (obj6)), "Content-Type: " + ((HttpParameter) (obj3)).getContentType() + "\r\n\r\n");
        obj = obj1;
        if (!((HttpParameter) (obj3)).hasFileBody()) goto _L12; else goto _L11
_L11:
        obj = obj1;
        obj3 = ((HttpParameter) (obj3)).getFileBody();
_L16:
        obj = obj1;
        obj3 = new BufferedInputStream(((java.io.InputStream) (obj3)));
_L14:
        obj = obj1;
        int j1 = ((BufferedInputStream) (obj3)).read();
        if (j1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((DataOutputStream) (obj6)).write(j1);
        if (true) goto _L14; else goto _L13
        obj1;
        obj3 = obj2;
        obj2 = obj;
_L26:
        obj = obj3;
        k = i;
        ((OutputStream) (obj2)).close();
_L32:
        obj = obj3;
        k = i;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        if (j == CONF.getHttpRetryCount())
        {
            throw new TwitterException(((IOException) (obj1)).getMessage(), ((Exception) (obj1)), k);
        }
          goto _L15
_L12:
        obj = obj1;
        obj3 = new FileInputStream(((HttpParameter) (obj3)).getFile());
          goto _L16
_L13:
        obj = obj1;
        write(((DataOutputStream) (obj6)), "\r\n");
        obj = obj1;
        ((BufferedInputStream) (obj3)).close();
          goto _L17
_L10:
        obj = obj1;
        write(((DataOutputStream) (obj6)), obj5 + "\r\n");
        obj = obj1;
        write(((DataOutputStream) (obj6)), "Content-Disposition: form-data; name=\"" + ((HttpParameter) (obj3)).getName() + "\"\r\n");
        obj = obj1;
        write(((DataOutputStream) (obj6)), "Content-Type: text/plain; charset=UTF-8\r\n\r\n");
        obj = obj1;
        logger.debug(((HttpParameter) (obj3)).getValue());
        obj = obj1;
        ((DataOutputStream) (obj6)).write(((HttpParameter) (obj3)).getValue().getBytes("UTF-8"));
        obj = obj1;
        write(((DataOutputStream) (obj6)), "\r\n");
          goto _L17
_L8:
        obj = obj1;
        write(((DataOutputStream) (obj6)), obj5 + "--\r\n");
        obj = obj1;
        write(((DataOutputStream) (obj6)), "\r\n");
_L27:
        obj = obj1;
        ((OutputStream) (obj1)).flush();
        obj = obj1;
        ((OutputStream) (obj1)).close();
_L4:
        obj = obj1;
        obj3 = new HttpResponseImpl(((HttpURLConnection) (obj4)), CONF);
        k = ((HttpURLConnection) (obj4)).getResponseCode();
        i = k;
        if (!logger.isDebugEnabled()) goto _L19; else goto _L18
_L18:
        i = k;
        logger.debug("Response: ");
        i = k;
        obj = ((HttpURLConnection) (obj4)).getHeaderFields();
        i = k;
        obj2 = ((Map) (obj)).keySet().iterator();
_L22:
        i = k;
        if (!((Iterator) (obj2)).hasNext()) goto _L19; else goto _L20
_L20:
        i = k;
        obj4 = (String)((Iterator) (obj2)).next();
        i = k;
        obj5 = ((List)((Map) (obj)).get(obj4)).iterator();
_L25:
        i = k;
        if (!((Iterator) (obj5)).hasNext()) goto _L22; else goto _L21
_L21:
        i = k;
        obj6 = (String)((Iterator) (obj5)).next();
        if (obj4 == null) goto _L24; else goto _L23
_L23:
        i = k;
        logger.debug(obj4 + ": " + obj6);
          goto _L25
        obj;
        obj2 = obj1;
        obj1 = obj;
          goto _L26
_L6:
        obj = obj3;
        ((HttpURLConnection) (obj4)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        obj = obj3;
        obj1 = HttpParameter.encodeParameters(httprequest.getParameters());
        obj = obj3;
        logger.debug("Post Params: ", ((String) (obj1)));
        obj = obj3;
        byte abyte0[] = ((String) (obj1)).getBytes("UTF-8");
        obj = obj3;
        ((HttpURLConnection) (obj4)).setRequestProperty("Content-Length", Integer.toString(abyte0.length));
        obj = obj3;
        ((HttpURLConnection) (obj4)).setDoOutput(true);
        obj = obj3;
        obj1 = ((HttpURLConnection) (obj4)).getOutputStream();
        obj = obj1;
        ((OutputStream) (obj1)).write(abyte0);
          goto _L27
_L24:
        i = k;
        logger.debug(((String) (obj6)));
          goto _L25
_L35:
        if (k == 420 || k == 400 || k < 500) goto _L29; else goto _L28
_L28:
        i = k;
        if (j != CONF.getHttpRetryCount()) goto _L30; else goto _L29
_L29:
        i = k;
        throw new TwitterException(((HttpResponse) (obj3)).asString(), ((HttpResponse) (obj3)));
_L36:
        obj = obj3;
        ((OutputStream) (obj1)).close();
        return ((HttpResponse) (obj3));
_L30:
        obj = obj3;
        ((OutputStream) (obj1)).close();
        obj = obj3;
_L15:
        if (!logger.isDebugEnabled() || obj == null)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        ((HttpResponse) (obj)).asString();
        logger.debug("Sleeping " + CONF.getHttpRetryIntervalSeconds() + " seconds until the next retry.");
        Thread.sleep(CONF.getHttpRetryIntervalSeconds() * 1000);
_L33:
        j++;
        obj2 = obj;
          goto _L31
        httprequest;
        return ((HttpResponse) (obj3));
        Exception exception;
        exception;
        exception = ((Exception) (obj3));
          goto _L15
        exception;
          goto _L32
        InterruptedException interruptedexception;
        interruptedexception;
          goto _L33
_L2:
        return ((HttpResponse) (obj2));
_L17:
        k++;
          goto _L34
_L19:
        if (k >= 200 && (k == 302 || 300 > k)) goto _L36; else goto _L35
    }

    static 
    {
        boolean flag;
        Object obj;
        if (class$twitter4j$internal$http$HttpClientImpl == null)
        {
            obj = _mthclass$("twitter4j.internal.http.HttpClientImpl");
            class$twitter4j$internal$http$HttpClientImpl = ((Class) (obj));
        } else
        {
            obj = class$twitter4j$internal$http$HttpClientImpl;
        }
        logger = Logger.getLogger(((Class) (obj)));
        isJDK14orEarlier = false;
        obj = System.getProperty("java.specification.version");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (1.5D > Double.parseDouble(((String) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isJDK14orEarlier = flag;
        if (ConfigurationContext.getInstance().isDalvik())
        {
            isJDK14orEarlier = false;
            System.setProperty("http.keepAlive", "false");
        }
_L2:
        instanceMap = new HashMap(1);
        return;
        SecurityException securityexception;
        securityexception;
        isJDK14orEarlier = true;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
