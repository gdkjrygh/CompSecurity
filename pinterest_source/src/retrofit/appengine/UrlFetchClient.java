// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.appengine;

import com.google.appengine.api.urlfetch.HTTPHeader;
import com.google.appengine.api.urlfetch.HTTPMethod;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit.client.Client;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedOutput;

public class UrlFetchClient
    implements Client
{

    private final URLFetchService urlFetchService;

    public UrlFetchClient()
    {
        this(URLFetchServiceFactory.getURLFetchService());
    }

    public UrlFetchClient(URLFetchService urlfetchservice)
    {
        urlFetchService = urlfetchservice;
    }

    static HTTPRequest createRequest(Request request)
    {
        Object obj = getHttpMethod(request.getMethod());
        obj = new HTTPRequest(new URL(request.getUrl()), ((HTTPMethod) (obj)));
        Header header;
        for (Iterator iterator = request.getHeaders().iterator(); iterator.hasNext(); ((HTTPRequest) (obj)).addHeader(new HTTPHeader(header.getName(), header.getValue())))
        {
            header = (Header)iterator.next();
        }

        request = request.getBody();
        if (request != null)
        {
            Object obj1 = request.mimeType();
            if (obj1 != null)
            {
                ((HTTPRequest) (obj)).addHeader(new HTTPHeader("Content-Type", ((String) (obj1))));
            }
            obj1 = new ByteArrayOutputStream();
            request.writeTo(((java.io.OutputStream) (obj1)));
            ((HTTPRequest) (obj)).setPayload(((ByteArrayOutputStream) (obj1)).toByteArray());
        }
        return ((HTTPRequest) (obj));
    }

    private static HTTPMethod getHttpMethod(String s)
    {
        if ("GET".equals(s))
        {
            return HTTPMethod.GET;
        }
        if ("POST".equals(s))
        {
            return HTTPMethod.POST;
        }
        if ("PATCH".equals(s))
        {
            return HTTPMethod.PATCH;
        }
        if ("PUT".equals(s))
        {
            return HTTPMethod.PUT;
        }
        if ("DELETE".equals(s))
        {
            return HTTPMethod.DELETE;
        }
        if ("HEAD".equals(s))
        {
            return HTTPMethod.HEAD;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Illegal HTTP method: ")).append(s).toString());
        }
    }

    static Response parseResponse(HTTPResponse httpresponse, HTTPRequest httprequest)
    {
        Object obj = httpresponse.getFinalUrl();
        String s;
        ArrayList arraylist;
        int i;
        if (obj != null)
        {
            httprequest = ((HTTPRequest) (obj));
        } else
        {
            httprequest = httprequest.getURL();
        }
        s = httprequest.toString();
        i = httpresponse.getResponseCode();
        obj = httpresponse.getHeaders();
        arraylist = new ArrayList(((List) (obj)).size());
        httprequest = "application/octet-stream";
        String s1;
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); arraylist.add(new Header(s1, ((String) (obj)))))
        {
            obj = (HTTPHeader)iterator.next();
            s1 = ((HTTPHeader) (obj)).getName();
            obj = ((HTTPHeader) (obj)).getValue();
            if ("Content-Type".equalsIgnoreCase(s1))
            {
                httprequest = ((HTTPRequest) (obj));
            }
        }

        httpresponse = httpresponse.getContent();
        if (httpresponse != null)
        {
            httpresponse = new TypedByteArray(httprequest, httpresponse);
        } else
        {
            httpresponse = null;
        }
        return new Response(s, i, "", arraylist, httpresponse);
    }

    protected HTTPResponse execute(URLFetchService urlfetchservice, HTTPRequest httprequest)
    {
        return urlfetchservice.fetch(httprequest);
    }

    public Response execute(Request request)
    {
        request = createRequest(request);
        return parseResponse(execute(urlFetchService, ((HTTPRequest) (request))), request);
    }
}
