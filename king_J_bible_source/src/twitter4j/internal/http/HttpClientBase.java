// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import twitter4j.internal.logging.Logger;

// Referenced classes of package twitter4j.internal.http:
//            HttpClientConfiguration

public class HttpClientBase
    implements Serializable
{

    static Class class$twitter4j$internal$http$HttpClientBase;
    private static final Logger logger;
    protected final HttpClientConfiguration CONF;

    public HttpClientBase(HttpClientConfiguration httpclientconfiguration)
    {
        CONF = httpclientconfiguration;
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
        return "HttpClientBase{CONF=" + CONF + '}';
    }

    public void write(DataOutputStream dataoutputstream, String s)
        throws IOException
    {
        dataoutputstream.writeBytes(s);
        logger.debug(s);
    }

    static 
    {
        Class class1;
        if (class$twitter4j$internal$http$HttpClientBase == null)
        {
            class1 = _mthclass$("twitter4j.internal.http.HttpClientBase");
            class$twitter4j$internal$http$HttpClientBase = class1;
        } else
        {
            class1 = class$twitter4j$internal$http$HttpClientBase;
        }
        logger = Logger.getLogger(class1);
    }
}
