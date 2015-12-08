// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import b.a.a.a.a;
import b.a.a.a.b;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.exception.DropboxIOException;
import com.dropbox.client2.exception.DropboxParseException;
import com.dropbox.client2.exception.DropboxProxyChangeException;
import com.dropbox.client2.exception.DropboxSSLException;
import com.dropbox.client2.exception.DropboxServerException;
import com.dropbox.client2.exception.DropboxUnlinkedException;
import com.dropbox.client2.session.Session;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class RESTUtility
{

    private static final DateFormat dateFormat;

    private RESTUtility()
    {
    }

    public static String buildURL(String s, int i, String s1, String as[])
    {
        String s2 = s1;
        if (!s1.startsWith("/"))
        {
            s2 = (new StringBuilder("/")).append(s1).toString();
        }
        try
        {
            s2 = URLEncoder.encode((new StringBuilder("/")).append(i).append(s2).toString(), "UTF-8").replace("%2F", "/");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s1 = s2;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s1 = s2;
        if (as.length > 0)
        {
            s1 = (new StringBuilder()).append(s2).append("?").append(urlencode(as)).toString();
        }
        s1 = s1.replace("+", "%20").replace("*", "%2A");
        return (new StringBuilder("https://")).append(s).append(":443").append(s1).toString();
    }

    public static HttpResponse execute(Session session, HttpUriRequest httpurirequest)
    {
        return execute(session, httpurirequest, -1);
    }

    public static HttpResponse execute(Session session, HttpUriRequest httpurirequest, int i)
    {
        HttpResponse httpresponse;
        HttpClient httpclient;
        boolean flag;
        httpclient = updatedHttpClient(session);
        session.setRequestTimeout(httpurirequest);
        if (i >= 0)
        {
            HttpConnectionParams.setSoTimeout(httpurirequest.getParams(), i);
        }
        flag = isRequestRepeatable(httpurirequest);
        httpresponse = null;
        i = 0;
_L4:
        HttpResponse httpresponse1 = httpresponse;
        if (i >= 5) goto _L2; else goto _L1
_L1:
        httpresponse1 = httpclient.execute(httpurirequest);
        httpresponse = httpresponse1;
_L5:
        httpresponse1 = httpresponse;
        if (httpresponse != null) goto _L2; else goto _L3
_L3:
        try
        {
            updateClientProxy(httpclient, session);
        }
        // Misplaced declaration of an exception variable
        catch (Session session)
        {
            throw new DropboxSSLException(session);
        }
        // Misplaced declaration of an exception variable
        catch (Session session)
        {
            throw new DropboxIOException(session);
        }
        // Misplaced declaration of an exception variable
        catch (Session session)
        {
            throw new DropboxException(session);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        throw new DropboxProxyChangeException();
        i++;
          goto _L4
_L2:
        if (httpresponse1 != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        throw new DropboxIOException("Apache HTTPClient encountered an error. No response, try again.");
        i = httpresponse1.getStatusLine().getStatusCode();
        if (i == 200 || i == 206)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        parseAsJSON(httpresponse1);
        return httpresponse1;
        NullPointerException nullpointerexception;
        nullpointerexception;
          goto _L5
    }

    private static boolean isRequestRepeatable(HttpRequest httprequest)
    {
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            httprequest = ((HttpEntityEnclosingRequest)httprequest).getEntity();
            if (httprequest != null && !httprequest.isRepeatable())
            {
                return false;
            }
        }
        return true;
    }

    public static Object parseAsJSON(HttpResponse httpresponse)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj4 = null;
        obj2 = null;
        obj = null;
        obj3 = null;
        obj1 = obj;
        HttpEntity httpentity = httpresponse.getEntity();
        if (httpentity == null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        obj = new BufferedReader(new InputStreamReader(httpentity.getContent()), 16384);
        obj1 = obj;
        ((BufferedReader) (obj)).mark(16384);
        obj1 = obj;
        obj2 = (new a()).a(((java.io.Reader) (obj)));
        obj1 = obj2;
_L6:
        int i;
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        i = httpresponse.getStatusLine().getStatusCode();
        if (i != 200)
        {
            if (i == 401)
            {
                throw new DropboxUnlinkedException();
            } else
            {
                throw new DropboxServerException(httpresponse, obj1);
            }
        } else
        {
            return obj1;
        }
        httpresponse;
        obj = null;
_L5:
        obj1 = obj;
        throw new DropboxIOException(httpresponse);
        httpresponse;
_L7:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw httpresponse;
        obj;
        obj = obj4;
_L4:
        obj1 = obj;
        if (!DropboxServerException.isValidWithNullBody(httpresponse))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj1 = obj;
        throw new DropboxServerException(httpresponse);
        obj1 = obj;
        throw new DropboxParseException(((BufferedReader) (obj)));
_L3:
        throw new DropboxException(httpresponse);
        httpresponse;
        obj1 = obj;
          goto _L3
        obj1;
          goto _L4
        httpresponse;
          goto _L5
_L2:
        obj = null;
        obj1 = obj3;
          goto _L6
        httpresponse;
          goto _L7
        httpresponse;
        obj1 = obj2;
          goto _L3
    }

    public static Map parseAsQueryString(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getEntity();
        if (httpresponse == null)
        {
            throw new DropboxParseException("Bad response from Dropbox.");
        }
        HashMap hashmap;
        try
        {
            httpresponse = (new Scanner(httpresponse.getContent())).useDelimiter("&");
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new DropboxIOException(httpresponse);
        }
        hashmap = new HashMap();
        String as[];
        for (; httpresponse.hasNext(); hashmap.put(as[0], as[1]))
        {
            as = httpresponse.next().split("=");
            if (as.length != 2)
            {
                throw new DropboxParseException("Bad query string from Dropbox.");
            }
        }

        return hashmap;
    }

    public static Date parseDate(String s)
    {
        try
        {
            s = dateFormat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static Object request(RequestMethod requestmethod, String s, String s1, int i, String as[], Session session)
    {
        return parseAsJSON(streamRequest(requestmethod, s, s1, i, as, session).response);
    }

    public static DropboxAPI.RequestAndResponse streamRequest(RequestMethod requestmethod, String s, String s1, int i, String as[], Session session)
    {
        if (requestmethod != RequestMethod.GET) goto _L2; else goto _L1
_L1:
        requestmethod = new HttpGet(buildURL(s, i, s1, as));
_L4:
        session.sign(requestmethod);
        return new DropboxAPI.RequestAndResponse(requestmethod, execute(session, requestmethod));
_L2:
        requestmethod = new HttpPost(buildURL(s, i, s1, null));
        if (as != null && as.length >= 2)
        {
            if (as.length % 2 != 0)
            {
                throw new IllegalArgumentException("Params must have an even number of elements.");
            }
            s = new ArrayList();
            for (i = 0; i < as.length; i += 2)
            {
                if (as[i + 1] != null)
                {
                    s.add(new BasicNameValuePair(as[i], as[i + 1]));
                }
            }

            try
            {
                requestmethod.setEntity(new UrlEncodedFormEntity(s, "UTF-8"));
            }
            // Misplaced declaration of an exception variable
            catch (RequestMethod requestmethod)
            {
                throw new DropboxException(requestmethod);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void updateClientProxy(HttpClient httpclient, Session session)
    {
        session = session.getProxyInfo();
        if (session != null && ((com.dropbox.client2.session.Session.ProxyInfo) (session)).host != null && !((com.dropbox.client2.session.Session.ProxyInfo) (session)).host.equals(""))
        {
            if (((com.dropbox.client2.session.Session.ProxyInfo) (session)).port < 0)
            {
                session = new HttpHost(((com.dropbox.client2.session.Session.ProxyInfo) (session)).host);
            } else
            {
                session = new HttpHost(((com.dropbox.client2.session.Session.ProxyInfo) (session)).host, ((com.dropbox.client2.session.Session.ProxyInfo) (session)).port);
            }
            httpclient.getParams().setParameter("http.route.default-proxy", session);
            return;
        } else
        {
            httpclient.getParams().removeParameter("http.route.default-proxy");
            return;
        }
    }

    private static HttpClient updatedHttpClient(Session session)
    {
        com/dropbox/client2/RESTUtility;
        JVM INSTR monitorenter ;
        HttpClient httpclient;
        httpclient = session.getHttpClient();
        updateClientProxy(httpclient, session);
        com/dropbox/client2/RESTUtility;
        JVM INSTR monitorexit ;
        return httpclient;
        session;
        throw session;
    }

    private static String urlencode(String as[])
    {
        String s;
        boolean flag;
        int i;
        if (as.length % 2 != 0)
        {
            throw new IllegalArgumentException("Params must have an even number of elements.");
        }
        s = "";
        flag = true;
        i = 0;
_L3:
        String s1 = s;
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        boolean flag1;
        flag1 = flag;
        s1 = s;
        if (as[i + 1] == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        flag = false;
_L1:
        s1 = (new StringBuilder()).append(s).append(URLEncoder.encode(as[i], "UTF-8")).append("=").append(URLEncoder.encode(as[i + 1], "UTF-8")).toString();
        flag1 = flag;
        break MISSING_BLOCK_LABEL_137;
        s = (new StringBuilder()).append(s).append("&").toString();
          goto _L1
        as;
        s1 = null;
        return s1;
        i += 2;
        flag = flag1;
        s = s1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    static 
    {
        dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy kk:mm:ss ZZZZZ", Locale.US);
    }

    private class RequestMethod extends Enum
    {

        private static final RequestMethod $VALUES[];
        public static final RequestMethod GET;
        public static final RequestMethod POST;

        public static RequestMethod valueOf(String s)
        {
            return (RequestMethod)Enum.valueOf(com/dropbox/client2/RESTUtility$RequestMethod, s);
        }

        public static RequestMethod[] values()
        {
            return (RequestMethod[])$VALUES.clone();
        }

        static 
        {
            GET = new RequestMethod("GET", 0);
            POST = new RequestMethod("POST", 1);
            $VALUES = (new RequestMethod[] {
                GET, POST
            });
        }

        private RequestMethod(String s, int i)
        {
            super(s, i);
        }
    }

}
