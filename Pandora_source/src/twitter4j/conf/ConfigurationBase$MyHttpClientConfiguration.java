// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;

import java.io.Serializable;
import twitter4j.HttpClientConfiguration;

// Referenced classes of package twitter4j.conf:
//            ConfigurationBase

class gzipEnabled
    implements Serializable, HttpClientConfiguration
{

    private static final long serialVersionUID = 0x722bb3271b80bc82L;
    private boolean gzipEnabled;
    private int httpConnectionTimeout;
    private String httpProxyHost;
    private String httpProxyPassword;
    private int httpProxyPort;
    private String httpProxyUser;
    private int httpReadTimeout;
    private boolean prettyDebug;
    final ConfigurationBase this$0;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (gzipEnabled)obj;
            if (gzipEnabled != ((gzipEnabled) (obj)).gzipEnabled)
            {
                return false;
            }
            if (httpConnectionTimeout != ((httpConnectionTimeout) (obj)).httpConnectionTimeout)
            {
                return false;
            }
            if (httpProxyPort != ((httpProxyPort) (obj)).httpProxyPort)
            {
                return false;
            }
            if (httpReadTimeout != ((httpReadTimeout) (obj)).httpReadTimeout)
            {
                return false;
            }
            if (prettyDebug != ((prettyDebug) (obj)).prettyDebug)
            {
                return false;
            }
            if (httpProxyHost == null ? ((httpProxyHost) (obj)).httpProxyHost != null : !httpProxyHost.equals(((httpProxyHost) (obj)).httpProxyHost))
            {
                return false;
            }
            if (httpProxyPassword == null ? ((httpProxyPassword) (obj)).httpProxyPassword != null : !httpProxyPassword.equals(((httpProxyPassword) (obj)).httpProxyPassword))
            {
                return false;
            }
            if (httpProxyUser == null ? ((httpProxyUser) (obj)).httpProxyUser != null : !httpProxyUser.equals(((httpProxyUser) (obj)).httpProxyUser))
            {
                return false;
            }
        }
        return true;
    }

    public int getHttpConnectionTimeout()
    {
        return httpConnectionTimeout;
    }

    public String getHttpProxyHost()
    {
        return httpProxyHost;
    }

    public String getHttpProxyPassword()
    {
        return httpProxyPassword;
    }

    public int getHttpProxyPort()
    {
        return httpProxyPort;
    }

    public String getHttpProxyUser()
    {
        return httpProxyUser;
    }

    public int getHttpReadTimeout()
    {
        return httpReadTimeout;
    }

    public int getHttpRetryCount()
    {
        return ConfigurationBase.access$000(ConfigurationBase.this);
    }

    public int getHttpRetryIntervalSeconds()
    {
        return ConfigurationBase.access$100(ConfigurationBase.this);
    }

    public int hashCode()
    {
        int i1 = 1;
        int i;
        int j;
        int k;
        int l;
        int j1;
        int k1;
        int l1;
        if (httpProxyHost != null)
        {
            i = httpProxyHost.hashCode();
        } else
        {
            i = 0;
        }
        if (httpProxyUser != null)
        {
            j = httpProxyUser.hashCode();
        } else
        {
            j = 0;
        }
        if (httpProxyPassword != null)
        {
            k = httpProxyPassword.hashCode();
        } else
        {
            k = 0;
        }
        j1 = httpProxyPort;
        k1 = httpConnectionTimeout;
        l1 = httpReadTimeout;
        if (prettyDebug)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (!gzipEnabled)
        {
            i1 = 0;
        }
        return (l + ((((k + (j + i * 31) * 31) * 31 + j1) * 31 + k1) * 31 + l1) * 31) * 31 + i1;
    }

    public boolean isGZIPEnabled()
    {
        return gzipEnabled;
    }

    public boolean isPrettyDebugEnabled()
    {
        return prettyDebug;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MyHttpClientConfiguration{httpProxyHost='").append(httpProxyHost).append('\'').append(", httpProxyUser='").append(httpProxyUser).append('\'').append(", httpProxyPassword='").append(httpProxyPassword).append('\'').append(", httpProxyPort=").append(httpProxyPort).append(", httpConnectionTimeout=").append(httpConnectionTimeout).append(", httpReadTimeout=").append(httpReadTimeout).append(", prettyDebug=").append(prettyDebug).append(", gzipEnabled=").append(gzipEnabled).append('}').toString();
    }

    (String s, String s1, String s2, int i, int j, int k, 
            boolean flag, boolean flag1)
    {
        this$0 = ConfigurationBase.this;
        super();
        httpProxyHost = null;
        httpProxyUser = null;
        httpProxyPassword = null;
        httpProxyPort = -1;
        httpConnectionTimeout = 20000;
        httpReadTimeout = 0x1d4c0;
        prettyDebug = false;
        gzipEnabled = true;
        httpProxyHost = s;
        httpProxyUser = s1;
        httpProxyPassword = s2;
        httpProxyPort = i;
        httpConnectionTimeout = j;
        httpReadTimeout = k;
        prettyDebug = flag;
        gzipEnabled = flag1;
    }
}
