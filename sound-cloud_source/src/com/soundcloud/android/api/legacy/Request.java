// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;

public class Request
    implements Iterable
{
    public static interface TransferProgressListener
    {

        public abstract void transferred(long l)
            throws IOException;
    }


    public static final String UTF_8 = "UTF-8";
    private HttpEntity entity;
    private Map headers;
    private String ifNoneMatch;
    private TransferProgressListener listener;
    private List params;
    private long range[];
    private String resource;
    private Token token;

    public Request()
    {
        params = new ArrayList();
    }

    public Request(Request request)
    {
        params = new ArrayList();
        resource = request.resource;
        token = request.token;
        listener = request.listener;
        params = new ArrayList(request.params);
        if (request.headers != null)
        {
            headers = new HashMap(request.headers);
        }
        ifNoneMatch = request.ifNoneMatch;
        entity = request.entity;
    }

    public Request(String s)
    {
        String s1;
        params = new ArrayList();
        if (s == null)
        {
            throw new IllegalArgumentException("resource is null");
        }
        s1 = s;
        if (!s.startsWith("http:"))
        {
            s1 = s;
            if (!s.startsWith("https:"))
            {
                s1 = s;
                if (!s.startsWith("/"))
                {
                    s1 = (new StringBuilder("/")).append(s).toString();
                }
            }
        }
        if (!s1.contains("?")) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s = s1.substring(Math.min(s1.length(), s1.indexOf('?') + 1), s1.length()).split("&");
        j = s.length;
        i = 0;
_L10:
        if (i >= j) goto _L4; else goto _L3
_L3:
        String as[] = s[i].split("=", 2);
        if (as == null) goto _L6; else goto _L5
_L5:
        if (as.length != 2) goto _L8; else goto _L7
_L7:
        params.add(new BasicNameValuePair(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8")));
          goto _L6
_L8:
        try
        {
            if (as.length == 1)
            {
                params.add(new BasicNameValuePair(URLDecoder.decode(as[0], "UTF-8"), null));
            }
        }
        catch (UnsupportedEncodingException unsupportedencodingexception) { }
          goto _L6
_L4:
        resource = s1.substring(0, s1.indexOf('?'));
        return;
_L2:
        resource = s1;
        return;
_L6:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public Request(URI uri)
    {
        if (uri.getPath() == null)
        {
            uri = "/";
        } else
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(uri.getPath());
            if (uri.getQuery() == null)
            {
                uri = "";
            } else
            {
                uri = (new StringBuilder("?")).append(uri.getQuery()).toString();
            }
            uri = stringbuilder.append(uri).toString();
        }
        this(((String) (uri)));
    }

    private void addParam(String s, Object obj)
    {
        List list = params;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = String.valueOf(obj);
        }
        list.add(new BasicNameValuePair(s, ((String) (obj))));
    }

    private static String encode(String s, String s1)
    {
        if (s1 == null)
        {
            s1 = "ISO-8859-1";
        }
        try
        {
            return URLEncoder.encode(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
    }

    public static String format(List list, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator1 = list.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            list = (NameValuePair)iterator1.next();
            String s1 = encode(list.getName(), s);
            String s2 = list.getValue();
            if (s2 != null)
            {
                list = encode(s2, s);
            } else
            {
                list = "";
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('&');
            }
            stringbuilder.append(s1);
            if (s2 != null)
            {
                stringbuilder.append('=');
                stringbuilder.append(list);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static transient String formatRange(long al[])
    {
        switch (al.length)
        {
        default:
            throw new IllegalArgumentException("invalid range specified");

        case 0: // '\0'
            return "bytes=0-";

        case 1: // '\001'
            if (al[0] < 0L)
            {
                throw new IllegalArgumentException("negative range");
            } else
            {
                return (new StringBuilder("bytes=")).append(al[0]).append("-").toString();
            }

        case 2: // '\002'
            break;
        }
        if (al[0] < 0L)
        {
            throw new IllegalArgumentException("negative range");
        }
        if (al[0] > al[1])
        {
            throw new IllegalArgumentException((new StringBuilder()).append(al[0]).append(">").append(al[1]).toString());
        } else
        {
            return (new StringBuilder("bytes=")).append(al[0]).append("-").append(al[1]).toString();
        }
    }

    public static transient Request to(String s, Object aobj[])
    {
        String s1 = s;
        if (aobj != null)
        {
            s1 = s;
            if (aobj.length > 0)
            {
                s1 = String.format(Locale.ENGLISH, s, aobj);
            }
        }
        return new Request(s1);
    }

    public Request add(String s, Object obj)
    {
        if (obj instanceof Iterable)
        {
            for (obj = ((Iterable)obj).iterator(); ((Iterator) (obj)).hasNext(); addParam(s, ((Iterator) (obj)).next())) { }
        } else
        if (obj instanceof Object[])
        {
            obj = ((Object) ((Object[])(Object[])obj));
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                addParam(s, obj[i]);
            }

        } else
        {
            addParam(s, obj);
        }
        return this;
    }

    public HttpRequestBase buildRequest(Class class1)
    {
        class1 = (HttpRequestBase)class1.newInstance();
        if (!(class1 instanceof HttpEntityEnclosingRequestBase)) goto _L2; else goto _L1
_L1:
        Object obj = (HttpEntityEnclosingRequestBase)class1;
        if (entity == null) goto _L4; else goto _L3
_L3:
        class1.setHeader(entity.getContentType());
        ((HttpEntityEnclosingRequestBase) (obj)).setEntity(entity);
_L7:
        class1.setURI(URI.create(toUrl()));
_L6:
        if (headers != null)
        {
            java.util.Map.Entry entry;
            for (obj = headers.entrySet().iterator(); ((Iterator) (obj)).hasNext(); class1.addHeader((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            }

        }
          goto _L5
        class1;
_L8:
        throw new RuntimeException(class1);
_L4:
        if (!params.isEmpty())
        {
            class1.setHeader("Content-Type", "application/x-www-form-urlencoded");
            ((HttpEntityEnclosingRequestBase) (obj)).setEntity(new StringEntity(queryString()));
        }
        class1.setURI(URI.create(resource));
          goto _L6
_L2:
        if (range != null)
        {
            class1.addHeader("Range", formatRange(range));
        }
        if (ifNoneMatch != null)
        {
            class1.addHeader("If-None-Match", ifNoneMatch);
        }
          goto _L7
_L5:
        if (token != null)
        {
            class1.addHeader(OAuth.createOAuthHeader(token));
        }
        return class1;
        class1;
          goto _L8
        class1;
          goto _L8
    }

    public Request clear(String s)
    {
        Iterator iterator1 = params.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            if (((NameValuePair)iterator1.next()).getName().equals(s))
            {
                iterator1.remove();
            }
        } while (true);
        return this;
    }

    TransferProgressListener getListener()
    {
        return listener;
    }

    public Map getParams()
    {
        HashMap hashmap = new HashMap();
        NameValuePair namevaluepair;
        for (Iterator iterator1 = params.iterator(); iterator1.hasNext(); hashmap.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)iterator1.next();
        }

        return hashmap;
    }

    Token getToken()
    {
        return token;
    }

    public Iterator iterator()
    {
        return params.iterator();
    }

    public Request newResource(String s)
    {
        Request request = new Request(this);
        request.resource = s;
        return request;
    }

    public String queryString()
    {
        return format(params, "UTF-8");
    }

    public transient Request range(long al[])
    {
        range = al;
        return this;
    }

    public Request set(String s, Object obj)
    {
        return clear(s).add(s, obj);
    }

    public void setHeaders(Map map)
    {
        headers = map;
    }

    public Request setProgressListener(TransferProgressListener transferprogresslistener)
    {
        listener = transferprogresslistener;
        return this;
    }

    public int size()
    {
        return params.size();
    }

    public String toString()
    {
        return (new StringBuilder("Request{resource='")).append(resource).append('\'').append(", params=").append(params).append(", entity=").append(entity).append(", token=").append(token).append(", listener=").append(listener).append('}').toString();
    }

    public String toUrl()
    {
        return toUrl(resource);
    }

    public String toUrl(String s)
    {
        if (params.isEmpty())
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append("?").append(queryString()).toString();
        }
    }

    public Request usingToken(Token token1)
    {
        token = token1;
        return this;
    }

    public transient Request with(Object aobj[])
    {
        if (aobj != null)
        {
            if (aobj.length % 2 != 0)
            {
                throw new IllegalArgumentException("need even number of arguments");
            }
            for (int i = 0; i < aobj.length; i += 2)
            {
                add(aobj[i].toString(), aobj[i + 1]);
            }

        }
        return this;
    }

    public Request withContent(String s, String s1)
    {
        try
        {
            s = new StringEntity(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        s.setContentType(s1);
        s = withEntity(s);
        return s;
    }

    public Request withEntity(HttpEntity httpentity)
    {
        entity = httpentity;
        return this;
    }
}
