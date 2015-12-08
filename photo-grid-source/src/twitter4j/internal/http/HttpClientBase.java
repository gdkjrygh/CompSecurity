// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.DataOutputStream;
import java.io.Serializable;
import twitter4j.internal.logging.Logger;

// Referenced classes of package twitter4j.internal.http:
//            HttpClient, HttpClientConfiguration

public abstract class HttpClientBase
    implements Serializable, HttpClient
{

    private static final Logger logger = Logger.getLogger(twitter4j/internal/http/HttpClientBase);
    private static final long serialVersionUID = 0x60615468668a4591L;
    protected final HttpClientConfiguration CONF;

    public HttpClientBase(HttpClientConfiguration httpclientconfiguration)
    {
        CONF = httpclientconfiguration;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof HttpClientBase))
            {
                return false;
            }
            obj = (HttpClientBase)obj;
            if (!CONF.equals(((HttpClientBase) (obj)).CONF))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return CONF.hashCode();
    }

    protected boolean isProxyConfigured()
    {
        return CONF.getHttpProxyHost() != null && !CONF.getHttpProxyHost().equals("");
    }

    public void shutdown()
    {
    }

    public String toString()
    {
        return (new StringBuilder("HttpClientBase{CONF=")).append(CONF).append('}').toString();
    }

    public void write(DataOutputStream dataoutputstream, String s)
    {
        dataoutputstream.writeBytes(s);
        logger.debug(s);
    }

}
