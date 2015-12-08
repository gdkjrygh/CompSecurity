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
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
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
//            HttpClientBase, HttpResponseCode, HttpClient, HttpRequest, 
//            RequestMethod, HttpClientConfiguration, HttpParameter, HttpResponseImpl, 
//            HttpResponse

public class HttpClientImpl extends HttpClientBase
    implements Serializable, HttpResponseCode
{

    private static final Map instanceMap = new HashMap(1);
    private static final Logger logger = Logger.getLogger(twitter4j/internal/http/HttpClientImpl);
    private static final long serialVersionUID = 0x859c02532b19cd01L;

    public HttpClientImpl()
    {
        super(ConfigurationContext.getInstance());
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
                    logger.debug("Authorization: ", z_T4JInternalStringUtil.maskString(s));
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
    {
        return request(new HttpRequest(RequestMethod.GET, s, null, null, null));
    }

    protected HttpURLConnection getConnection(String s)
    {
        if (isProxyConfigured())
        {
            if (CONF.getHttpProxyUser() != null && !CONF.getHttpProxyUser().equals(""))
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug((new StringBuilder("Proxy AuthUser: ")).append(CONF.getHttpProxyUser()).toString());
                    logger.debug((new StringBuilder("Proxy AuthPassword: ")).append(z_T4JInternalStringUtil.maskString(CONF.getHttpProxyPassword())).toString());
                }
                Authenticator.setDefault(new _cls1());
            }
            Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress.createUnresolved(CONF.getHttpProxyHost(), CONF.getHttpProxyPort()));
            if (logger.isDebugEnabled())
            {
                logger.debug((new StringBuilder("Opening proxied connection(")).append(CONF.getHttpProxyHost()).append(":").append(CONF.getHttpProxyPort()).append(")").toString());
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

    public HttpResponse post(String s, HttpParameter ahttpparameter[])
    {
        return request(new HttpRequest(RequestMethod.POST, s, ahttpparameter, null, null));
    }

    public HttpResponse request(HttpRequest httprequest)
    {
        Object obj;
        int j;
        int l;
        l = CONF.getHttpRetryCount();
        obj = null;
        j = 0;
_L30:
        Object obj1 = obj;
        if (j >= l + 1) goto _L2; else goto _L1
_L1:
        int k = -1;
        Object obj4;
        obj4 = getConnection(httprequest.getURL());
        ((HttpURLConnection) (obj4)).setDoInput(true);
        setHeaders(httprequest, ((HttpURLConnection) (obj4)));
        ((HttpURLConnection) (obj4)).setRequestMethod(httprequest.getMethod().name());
        if (httprequest.getMethod() != RequestMethod.POST) goto _L4; else goto _L3
_L3:
        if (!HttpParameter.containsFile(httprequest.getParameters())) goto _L6; else goto _L5
_L5:
        Object obj2;
        Object obj5;
        obj1 = (new StringBuilder("----Twitter4J-upload")).append(System.currentTimeMillis()).toString();
        ((HttpURLConnection) (obj4)).setRequestProperty("Content-Type", (new StringBuilder("multipart/form-data; boundary=")).append(((String) (obj1))).toString());
        obj5 = (new StringBuilder("--")).append(((String) (obj1))).toString();
        ((HttpURLConnection) (obj4)).setDoOutput(true);
        obj2 = ((HttpURLConnection) (obj4)).getOutputStream();
        obj1 = obj2;
        Object obj6 = new DataOutputStream(((OutputStream) (obj2)));
        obj1 = obj2;
        HttpParameter ahttpparameter[] = httprequest.getParameters();
        obj1 = obj2;
        int i1 = ahttpparameter.length;
        int i = 0;
_L35:
        if (i >= i1) goto _L8; else goto _L7
_L7:
        Object obj3;
        obj3 = ahttpparameter[i];
        obj1 = obj2;
        if (!((HttpParameter) (obj3)).isFile()) goto _L10; else goto _L9
_L9:
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append(((String) (obj5))).append("\r\n").toString());
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), (new StringBuilder("Content-Disposition: form-data; name=\"")).append(((HttpParameter) (obj3)).getName()).append("\"; filename=\"").append(((HttpParameter) (obj3)).getFile().getName()).append("\"\r\n").toString());
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), (new StringBuilder("Content-Type: ")).append(((HttpParameter) (obj3)).getContentType()).append("\r\n\r\n").toString());
        obj1 = obj2;
        if (!((HttpParameter) (obj3)).hasFileBody()) goto _L12; else goto _L11
_L11:
        obj1 = obj2;
        obj3 = ((HttpParameter) (obj3)).getFileBody();
_L15:
        obj1 = obj2;
        obj3 = new BufferedInputStream(((java.io.InputStream) (obj3)));
        obj1 = obj2;
        byte abyte1[] = new byte[1024];
_L14:
        obj1 = obj2;
        int j1 = ((BufferedInputStream) (obj3)).read(abyte1);
        if (j1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
        ((DataOutputStream) (obj6)).write(abyte1, 0, j1);
        if (true) goto _L14; else goto _L13
        obj3;
        i = -1;
        obj2 = obj1;
        obj1 = obj3;
_L25:
        try
        {
            ((OutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        throw obj1;
        obj2;
        obj1 = obj;
        obj = obj2;
        break MISSING_BLOCK_LABEL_444;
_L12:
        obj1 = obj2;
        obj3 = new FileInputStream(((HttpParameter) (obj3)).getFile());
          goto _L15
_L13:
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), "\r\n");
        obj1 = obj2;
        ((BufferedInputStream) (obj3)).close();
          goto _L16
_L10:
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append(((String) (obj5))).append("\r\n").toString());
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), (new StringBuilder("Content-Disposition: form-data; name=\"")).append(((HttpParameter) (obj3)).getName()).append("\"\r\n").toString());
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), "Content-Type: text/plain; charset=UTF-8\r\n\r\n");
        obj1 = obj2;
        logger.debug(((HttpParameter) (obj3)).getValue());
        obj1 = obj2;
        ((DataOutputStream) (obj6)).write(((HttpParameter) (obj3)).getValue().getBytes("UTF-8"));
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), "\r\n");
          goto _L16
_L8:
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), (new StringBuilder()).append(((String) (obj5))).append("--\r\n").toString());
        obj1 = obj2;
        write(((DataOutputStream) (obj6)), "\r\n");
_L26:
        obj1 = obj2;
        ((OutputStream) (obj2)).flush();
        obj1 = obj2;
        ((OutputStream) (obj2)).close();
_L34:
        obj1 = new HttpResponseImpl(((HttpURLConnection) (obj4)), CONF);
        i = k;
        k = ((HttpURLConnection) (obj4)).getResponseCode();
        i = k;
        if (!logger.isDebugEnabled()) goto _L18; else goto _L17
_L17:
        i = k;
        logger.debug("Response: ");
        i = k;
        obj = ((HttpURLConnection) (obj4)).getHeaderFields();
        i = k;
        obj3 = ((Map) (obj)).keySet().iterator();
_L21:
        i = k;
        if (!((Iterator) (obj3)).hasNext()) goto _L18; else goto _L19
_L19:
        i = k;
        obj4 = (String)((Iterator) (obj3)).next();
        i = k;
        obj5 = ((List)((Map) (obj)).get(obj4)).iterator();
_L24:
        i = k;
        if (!((Iterator) (obj5)).hasNext()) goto _L21; else goto _L20
_L20:
        i = k;
        obj6 = (String)((Iterator) (obj5)).next();
        if (obj4 == null) goto _L23; else goto _L22
_L22:
        i = k;
        logger.debug((new StringBuilder()).append(((String) (obj4))).append(": ").append(((String) (obj6))).toString());
          goto _L24
        exception;
        obj = obj1;
        obj1 = exception;
          goto _L25
_L6:
        ((HttpURLConnection) (obj4)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        obj1 = HttpParameter.encodeParameters(httprequest.getParameters());
        logger.debug("Post Params: ", ((String) (obj1)));
        abyte0 = ((String) (obj1)).getBytes("UTF-8");
        ((HttpURLConnection) (obj4)).setRequestProperty("Content-Length", Integer.toString(abyte0.length));
        ((HttpURLConnection) (obj4)).setDoOutput(true);
        obj2 = ((HttpURLConnection) (obj4)).getOutputStream();
        obj1 = obj2;
        ((OutputStream) (obj2)).write(abyte0);
          goto _L26
_L23:
        i = k;
        logger.debug(((String) (obj6)));
          goto _L24
_L36:
        if (k == 420 || k == 400 || k < 500) goto _L28; else goto _L27
_L27:
        i = k;
        if (j != CONF.getHttpRetryCount()) goto _L29; else goto _L28
_L28:
        i = k;
        throw new TwitterException(((HttpResponse) (obj1)).asString(), ((HttpResponse) (obj1)));
_L37:
        ((OutputStream) (obj2)).close();
_L2:
        return ((HttpResponse) (obj1));
        httprequest;
        return ((HttpResponse) (obj1));
_L29:
        ((OutputStream) (obj2)).close();
        obj = obj1;
_L31:
        if (!logger.isDebugEnabled() || obj == null)
        {
            break MISSING_BLOCK_LABEL_1100;
        }
        ((HttpResponse) (obj)).asString();
        logger.debug((new StringBuilder("Sleeping ")).append(CONF.getHttpRetryIntervalSeconds()).append(" seconds until the next retry.").toString());
        Thread.sleep(CONF.getHttpRetryIntervalSeconds() * 1000);
_L32:
        j++;
          goto _L30
        obj;
        obj = obj1;
          goto _L31
        obj1;
          goto _L32
        obj;
        i = k;
          goto _L33
        obj1;
        obj2 = null;
        i = -1;
          goto _L25
        obj1;
        i = -1;
          goto _L25
_L4:
        obj2 = null;
          goto _L34
_L33:
        Exception exception;
        byte abyte0[];
        if (j == CONF.getHttpRetryCount())
        {
            throw new TwitterException(((IOException) (obj)).getMessage(), ((Exception) (obj)), i);
        }
        obj = obj1;
          goto _L31
_L16:
        i++;
          goto _L35
_L18:
        if (k >= 200 && (k == 302 || 300 > k)) goto _L37; else goto _L36
    }

    static 
    {
        if (ConfigurationContext.getInstance().isDalvik())
        {
            System.setProperty("http.keepAlive", "false");
        }
    }

    private class _cls1 extends Authenticator
    {

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

        _cls1()
        {
            this$0 = HttpClientImpl.this;
            super();
        }
    }

}
