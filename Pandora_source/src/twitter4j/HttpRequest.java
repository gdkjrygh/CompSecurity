// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import twitter4j.auth.Authorization;

// Referenced classes of package twitter4j:
//            HttpParameter, RequestMethod

public final class HttpRequest
    implements Serializable
{

    private static final HttpParameter NULL_PARAMETERS[] = new HttpParameter[0];
    private static final long serialVersionUID = 0x2eb4a519dbc50ddcL;
    private final Authorization authorization;
    private final RequestMethod method;
    private final HttpParameter parameters[];
    private final Map requestHeaders;
    private final String url;

    public HttpRequest(RequestMethod requestmethod, String s, HttpParameter ahttpparameter[], Authorization authorization1, Map map)
    {
        method = requestmethod;
        if (requestmethod != RequestMethod.POST && ahttpparameter != null && ahttpparameter.length != 0)
        {
            url = (new StringBuilder()).append(s).append("?").append(HttpParameter.encodeParameters(ahttpparameter)).toString();
            parameters = NULL_PARAMETERS;
        } else
        {
            url = s;
            parameters = ahttpparameter;
        }
        authorization = authorization1;
        requestHeaders = map;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (HttpRequest)obj;
            if (authorization == null ? ((HttpRequest) (obj)).authorization != null : !authorization.equals(((HttpRequest) (obj)).authorization))
            {
                return false;
            }
            if (!Arrays.equals(parameters, ((HttpRequest) (obj)).parameters))
            {
                return false;
            }
            if (requestHeaders == null ? ((HttpRequest) (obj)).requestHeaders != null : !requestHeaders.equals(((HttpRequest) (obj)).requestHeaders))
            {
                return false;
            }
            if (method == null ? ((HttpRequest) (obj)).method != null : !method.equals(((HttpRequest) (obj)).method))
            {
                return false;
            }
            if (url == null ? ((HttpRequest) (obj)).url != null : !url.equals(((HttpRequest) (obj)).url))
            {
                return false;
            }
        }
        return true;
    }

    public Authorization getAuthorization()
    {
        return authorization;
    }

    public RequestMethod getMethod()
    {
        return method;
    }

    public HttpParameter[] getParameters()
    {
        return parameters;
    }

    public Map getRequestHeaders()
    {
        return requestHeaders;
    }

    public String getURL()
    {
        return url;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (method != null)
        {
            i = method.hashCode();
        } else
        {
            i = 0;
        }
        if (url != null)
        {
            j = url.hashCode();
        } else
        {
            j = 0;
        }
        if (parameters != null)
        {
            k = Arrays.hashCode(parameters);
        } else
        {
            k = 0;
        }
        if (authorization != null)
        {
            l = authorization.hashCode();
        } else
        {
            l = 0;
        }
        if (requestHeaders != null)
        {
            i1 = requestHeaders.hashCode();
        }
        return (l + (k + (j + i * 31) * 31) * 31) * 31 + i1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("HttpRequest{requestMethod=").append(method).append(", url='").append(url).append('\'').append(", postParams=");
        java.util.List list;
        if (parameters == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(parameters);
        }
        return stringbuilder.append(list).append(", authentication=").append(authorization).append(", requestHeaders=").append(requestHeaders).append('}').toString();
    }

}
