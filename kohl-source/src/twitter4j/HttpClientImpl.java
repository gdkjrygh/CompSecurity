// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j:
//            HttpClientBase, HttpResponseCode, Logger, HttpClient, 
//            HttpRequest, RequestMethod, TwitterException, HttpClientConfiguration, 
//            HttpParameter, HttpResponseImpl, HttpResponse

class HttpClientImpl extends HttpClientBase
    implements HttpResponseCode, Serializable
{

    private static final Map instanceMap = new HashMap(1);
    private static final Logger logger = Logger.getLogger(twitter4j/HttpClientImpl);
    private static final long serialVersionUID = 0xfa667aa3c9ca831aL;

    public HttpClientImpl()
    {
        super(ConfigurationContext.getInstance().getHttpClientConfiguration());
    }

    public HttpClientImpl(HttpClientConfiguration httpclientconfiguration)
    {
        super(httpclientconfiguration);
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
            logger.debug((new StringBuilder()).append(httprequest.getMethod().name()).append(" ").toString(), httprequest.getURL());
        }
        if (httprequest.getAuthorization() != null)
        {
            String s = httprequest.getAuthorization().getAuthorizationHeader(httprequest);
            if (s != null)
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug("Authorization: ", s.replaceAll(".", "*"));
                }
                httpurlconnection.addRequestProperty("Authorization", s);
            }
        }
        if (httprequest.getRequestHeaders() != null)
        {
            String s1;
            for (Iterator iterator = httprequest.getRequestHeaders().keySet().iterator(); iterator.hasNext(); logger.debug((new StringBuilder()).append(s1).append(": ").append((String)httprequest.getRequestHeaders().get(s1)).toString()))
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

    HttpURLConnection getConnection(String s)
        throws IOException
    {
        if (isProxyConfigured())
        {
            if (CONF.getHttpProxyUser() != null && !CONF.getHttpProxyUser().equals(""))
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug((new StringBuilder()).append("Proxy AuthUser: ").append(CONF.getHttpProxyUser()).toString());
                    logger.debug((new StringBuilder()).append("Proxy AuthPassword: ").append(CONF.getHttpProxyPassword().replaceAll(".", "*")).toString());
                }
                Authenticator.setDefault(new Authenticator() {

                    final HttpClientImpl this$0;

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
                logger.debug((new StringBuilder()).append("Opening proxied connection(").append(CONF.getHttpProxyHost()).append(":").append(CONF.getHttpProxyPort()).append(")").toString());
            }
            s = (HttpURLConnection)(new URL(s)).openConnection(proxy);
        } else
        {
            s = (HttpURLConnection)(new URL(s)).openConnection();
        }
        if (CONF.getHttpConnectionTimeout() > 0)
        {
            s.setConnectTimeout(CONF.getHttpConnectionTimeout());
        }
        if (CONF.getHttpReadTimeout() > 0)
        {
            s.setReadTimeout(CONF.getHttpReadTimeout());
        }
        s.setInstanceFollowRedirects(false);
        return s;
    }

    public HttpResponse handleRequest(HttpRequest httprequest)
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
        obj1 = (new StringBuilder()).append("----Twitter4J-upload").append(System.currentTimeMillis()).toString();
        obj = obj3;
        ((HttpURLConnection) (obj4)).setRequestProperty("Content-Type", (new StringBuilder()).append("multipart/form-data; boundary=").append(((String) (obj1))).toString());
        obj = obj3;
        Object obj5 = (new StringBuilder()).append("--").append(((String) (obj1))).toString();
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
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append(((String) (obj5))).append("\r\n").toString());
        obj = obj1;
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append("Content-Disposition: form-data; name=\"").append(((HttpParameter) (obj3)).getName()).append("\"; filename=\"").append(((HttpParameter) (obj3)).getFile().getName()).append("\"\r\n").toString());
        obj = obj1;
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append("Content-Type: ").append(((HttpParameter) (obj3)).getContentType()).append("\r\n\r\n").toString());
        obj = obj1;
        if (!((HttpParameter) (obj3)).hasFileBody()) goto _L12; else goto _L11
_L11:
        obj = obj1;
        obj3 = ((HttpParameter) (obj3)).getFileBody();
_L16:
        obj = obj1;
        obj3 = new BufferedInputStream(((java.io.InputStream) (obj3)));
        obj = obj1;
        byte abyte1[] = new byte[1024];
_L14:
        obj = obj1;
        int j1 = ((BufferedInputStream) (obj3)).read(abyte1);
        if (j1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((DataOutputStream) (obj6)).write(abyte1, 0, j1);
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
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append(((String) (obj5))).append("\r\n").toString());
        obj = obj1;
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append("Content-Disposition: form-data; name=\"").append(((HttpParameter) (obj3)).getName()).append("\"\r\n").toString());
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
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append(((String) (obj5))).append("--\r\n").toString());
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
        logger.debug((new StringBuilder()).append(((String) (obj4))).append(": ").append(((String) (obj6))).toString());
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
            break MISSING_BLOCK_LABEL_1151;
        }
        ((HttpResponse) (obj)).asString();
        logger.debug((new StringBuilder()).append("Sleeping ").append(CONF.getHttpRetryIntervalSeconds()).append(" seconds until the next retry.").toString());
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

    public HttpResponse post(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, ahttpparameter, null, null));
    }

    static 
    {
        try
        {
            Class.forName("dalvik.system.VMRuntime");
            System.setProperty("http.keepAlive", "false");
        }
        catch (ClassNotFoundException classnotfoundexception) { }
    }
}
