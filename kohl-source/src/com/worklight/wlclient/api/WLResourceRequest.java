// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.wlclient.RequestMethod;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLClient, WLHttpResponseListener, WLResponseListener

public class WLResourceRequest
{

    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
    private static final int DEFAULT_TIMEOUT = 30000;
    public static final String DELETE = "DELETE";
    private static final String FORM_PARAMETERS_CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String GET = "GET";
    public static final String HEAD = "HEAD";
    private static final String JSON_CONTENT_TYPE = "application/json";
    public static final String OPTIONS = "OPTIONS";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    private static final String STRING_CONTENT_TYPE = "text/plain";
    public static final String TRACE = "TRACE";
    private static final Logger logger = Logger.getInstance("wl.resource_request");
    private RequestMethod method;
    private HashMap queryParameters;
    private HttpRequestBase request;
    private int timeout;
    private URL url;

    public WLResourceRequest(URI uri, String s)
    {
        this(uri, s, 30000);
    }

    public WLResourceRequest(URI uri, String s, int i)
    {
        makeAbsoluteUrl(extractQueryParamsFromUrl(uri));
        setMethod(s);
        timeout = i;
        request = createHttpRequest();
    }

    private void addQueryParamsToUrl()
    {
        if (queryParameters.isEmpty())
        {
            return;
        }
        Object obj = new ArrayList();
        String s;
        for (Iterator iterator = queryParameters.keySet().iterator(); iterator.hasNext(); ((List) (obj)).add(new BasicNameValuePair(s, ((String)queryParameters.get(s)).toString())))
        {
            s = (String)iterator.next();
        }

        obj = (new StringBuilder()).append("?").append(URLEncodedUtils.format(((List) (obj)), "UTF8")).toString();
        try
        {
            url = new URL((new StringBuilder()).append(url.toString()).append(((String) (obj))).toString());
            return;
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new Error(malformedurlexception);
        }
    }

    private void applyTimeout()
    {
        HttpConnectionParams.setSoTimeout(request.getParams(), timeout);
        HttpConnectionParams.setConnectionTimeout(request.getParams(), timeout);
    }

    private UrlEncodedFormEntity createEntityFromParameters(HashMap hashmap)
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)hashmap.get(s))))
        {
            s = (String)iterator.next();
        }

        try
        {
            hashmap = new UrlEncodedFormEntity(arraylist, "UTF8");
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return null;
        }
        return hashmap;
    }

    private HttpRequestBase createHttpRequest()
    {
        return method.createHttpRequest();
    }

    private URI extractQueryParamsFromUrl(URI uri)
    {
        Object obj = URLEncodedUtils.parse(uri, "UTF8");
        queryParameters = new HashMap();
        if (obj != null)
        {
            NameValuePair namevaluepair;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); queryParameters.put(namevaluepair.getName(), namevaluepair.getValue()))
            {
                namevaluepair = (NameValuePair)((Iterator) (obj)).next();
            }

        }
        obj = uri.toString();
        int i = ((String) (obj)).indexOf('?');
        if (i > 0)
        {
            obj = ((String) (obj)).substring(0, i);
            try
            {
                obj = new URI(((String) (obj)));
            }
            catch (URISyntaxException urisyntaxexception)
            {
                throw new IllegalStateException((new StringBuilder()).append("'").append(uri).append("' is not a valid relative or absolute URL.").toString());
            }
            return ((URI) (obj));
        } else
        {
            return uri;
        }
    }

    private void makeAbsoluteUrl(URI uri)
    {
        String s1;
        if (uri.getScheme() != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        s1 = WLConfig.getInstance().getRootURL();
        String s = s1;
        try
        {
            if (uri.toString().charAt(0) != '/')
            {
                s = (new StringBuilder()).append(s1).append("/").toString();
            }
            url = new URL((new StringBuilder()).append(s).append(uri.toString()).toString());
            return;
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("'").append(uri).append("' is not a valid relative or absolute URL.").toString());
        }
        url = uri.toURL();
        return;
    }

    private void sendRequest(HttpEntity httpentity, WLHttpResponseListener wlhttpresponselistener)
    {
        addQueryParamsToUrl();
        setRequestURL();
        if (httpentity != null)
        {
            if (request instanceof HttpEntityEnclosingRequest)
            {
                ((HttpEntityEnclosingRequest)request).setEntity(httpentity);
            } else
            {
                logger.warn((new StringBuilder()).append("Unable add body to a ").append(method.toString()).append(" request. Sending request without body.").toString());
            }
        }
        applyTimeout();
        WLClient.getInstance().sendRequest(request, wlhttpresponselistener);
    }

    private void setContentType(String s)
    {
        if (getFirstHeader("Content-Type") == null)
        {
            addHeader(new BasicHeader("Content-Type", s));
        }
    }

    private void setMethod(String s)
    {
        RequestMethod requestmethod = RequestMethod.fromSring(s);
        if (requestmethod == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("'").append(s).append("' is not a valid HTTP method verb.").toString());
        } else
        {
            method = requestmethod;
            return;
        }
    }

    private void setRequestURL()
    {
        try
        {
            request.setURI(url.toURI());
            return;
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new Error(urisyntaxexception);
        }
    }

    public void addHeader(Header header)
    {
        request.addHeader(header);
    }

    public Header[] getAllHeaders()
    {
        return (Header[])request.getAllHeaders().clone();
    }

    public Header getFirstHeader(String s)
    {
        return request.getFirstHeader(s);
    }

    public String[] getHeaderNames()
    {
        ArrayList arraylist = new ArrayList();
        Header aheader[] = request.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aheader[i].getName());
        }

        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public Header[] getHeaders(String s)
    {
        return (Header[])request.getHeaders(s).clone();
    }

    public String getMethod()
    {
        return method.toString();
    }

    public Map getQueryParameters()
    {
        return Collections.unmodifiableMap(queryParameters);
    }

    public int getTimeout()
    {
        return timeout;
    }

    public URL getUrl()
    {
        return url;
    }

    public void removeHeaders(String s)
    {
        request.removeHeaders(s);
    }

    public void send(WLHttpResponseListener wlhttpresponselistener)
    {
        sendRequest(null, wlhttpresponselistener);
    }

    public void send(WLResponseListener wlresponselistener)
    {
        send(((WLHttpResponseListener) (new WLClient.WLResponseListenerWrapper(wlresponselistener))));
    }

    public void send(String s, WLHttpResponseListener wlhttpresponselistener)
    {
        setContentType("text/plain");
        try
        {
            sendRequest(new StringEntity(s, "UTF8"), wlhttpresponselistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void send(String s, WLResponseListener wlresponselistener)
    {
        send(s, ((WLHttpResponseListener) (new WLClient.WLResponseListenerWrapper(wlresponselistener))));
    }

    public void send(HashMap hashmap, WLHttpResponseListener wlhttpresponselistener)
    {
        setContentType("application/x-www-form-urlencoded");
        sendRequest(createEntityFromParameters(hashmap), wlhttpresponselistener);
    }

    public void send(HashMap hashmap, WLResponseListener wlresponselistener)
    {
        send(hashmap, ((WLHttpResponseListener) (new WLClient.WLResponseListenerWrapper(wlresponselistener))));
    }

    public void send(JSONObject jsonobject, WLHttpResponseListener wlhttpresponselistener)
    {
        setContentType("application/json");
        send(jsonobject.toString(), wlhttpresponselistener);
    }

    public void send(JSONObject jsonobject, WLResponseListener wlresponselistener)
    {
        setContentType("application/json");
        send(jsonobject.toString(), wlresponselistener);
    }

    public void send(byte abyte0[], WLHttpResponseListener wlhttpresponselistener)
    {
        sendRequest(new ByteArrayEntity(abyte0), wlhttpresponselistener);
    }

    public void send(byte abyte0[], WLResponseListener wlresponselistener)
    {
        send(abyte0, ((WLHttpResponseListener) (new WLClient.WLResponseListenerWrapper(wlresponselistener))));
    }

    public void setHeader(Header header)
    {
        request.setHeader(header);
    }

    public void setHeaders(Header aheader[])
    {
        request.setHeaders(aheader);
    }

    public void setQueryParameter(String s, String s1)
    {
        queryParameters.put(s, s1);
    }

    public void setQueryParameters(HashMap hashmap)
    {
        queryParameters = hashmap;
    }

    public void setTimeout(int i)
    {
        timeout = i;
    }

}
