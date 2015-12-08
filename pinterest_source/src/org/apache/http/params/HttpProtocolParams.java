// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.params;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HTTP;

// Referenced classes of package org.apache.http.params:
//            CoreProtocolPNames, HttpParams

public final class HttpProtocolParams
    implements CoreProtocolPNames
{

    private HttpProtocolParams()
    {
    }

    public static String getContentCharset(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String s = (String)httpparams.getParameter("http.protocol.content-charset");
        httpparams = s;
        if (s == null)
        {
            httpparams = HTTP.DEF_CONTENT_CHARSET.name();
        }
        return httpparams;
    }

    public static String getHttpElementCharset(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String s = (String)httpparams.getParameter("http.protocol.element-charset");
        httpparams = s;
        if (s == null)
        {
            httpparams = HTTP.DEF_PROTOCOL_CHARSET.name();
        }
        return httpparams;
    }

    public static CodingErrorAction getMalformedInputAction(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        httpparams = ((HttpParams) (httpparams.getParameter("http.malformed.input.action")));
        if (httpparams == null)
        {
            return CodingErrorAction.REPORT;
        } else
        {
            return (CodingErrorAction)httpparams;
        }
    }

    public static CodingErrorAction getUnmappableInputAction(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        httpparams = ((HttpParams) (httpparams.getParameter("http.unmappable.input.action")));
        if (httpparams == null)
        {
            return CodingErrorAction.REPORT;
        } else
        {
            return (CodingErrorAction)httpparams;
        }
    }

    public static String getUserAgent(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            return (String)httpparams.getParameter("http.useragent");
        }
    }

    public static ProtocolVersion getVersion(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        httpparams = ((HttpParams) (httpparams.getParameter("http.protocol.version")));
        if (httpparams == null)
        {
            return HttpVersion.HTTP_1_1;
        } else
        {
            return (ProtocolVersion)httpparams;
        }
    }

    public static void setContentCharset(HttpParams httpparams, String s)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setParameter("http.protocol.content-charset", s);
            return;
        }
    }

    public static void setHttpElementCharset(HttpParams httpparams, String s)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setParameter("http.protocol.element-charset", s);
            return;
        }
    }

    public static void setMalformedInputAction(HttpParams httpparams, CodingErrorAction codingerroraction)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setParameter("http.malformed.input.action", codingerroraction);
            return;
        }
    }

    public static void setUnmappableInputAction(HttpParams httpparams, CodingErrorAction codingerroraction)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may no be null");
        } else
        {
            httpparams.setParameter("http.unmappable.input.action", codingerroraction);
            return;
        }
    }

    public static void setUseExpectContinue(HttpParams httpparams, boolean flag)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setBooleanParameter("http.protocol.expect-continue", flag);
            return;
        }
    }

    public static void setUserAgent(HttpParams httpparams, String s)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setParameter("http.useragent", s);
            return;
        }
    }

    public static void setVersion(HttpParams httpparams, ProtocolVersion protocolversion)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpparams.setParameter("http.protocol.version", protocolversion);
            return;
        }
    }

    public static boolean useExpectContinue(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            return httpparams.getBooleanParameter("http.protocol.expect-continue", false);
        }
    }
}
