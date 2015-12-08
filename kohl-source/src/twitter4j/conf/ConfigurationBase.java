// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import twitter4j.HttpClientConfiguration;
import twitter4j.Logger;

// Referenced classes of package twitter4j.conf:
//            Configuration

class ConfigurationBase
    implements Configuration, Serializable
{
    class MyHttpClientConfiguration
        implements HttpClientConfiguration, Serializable
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
                obj = (MyHttpClientConfiguration)obj;
                if (gzipEnabled != ((MyHttpClientConfiguration) (obj)).gzipEnabled)
                {
                    return false;
                }
                if (httpConnectionTimeout != ((MyHttpClientConfiguration) (obj)).httpConnectionTimeout)
                {
                    return false;
                }
                if (httpProxyPort != ((MyHttpClientConfiguration) (obj)).httpProxyPort)
                {
                    return false;
                }
                if (httpReadTimeout != ((MyHttpClientConfiguration) (obj)).httpReadTimeout)
                {
                    return false;
                }
                if (prettyDebug != ((MyHttpClientConfiguration) (obj)).prettyDebug)
                {
                    return false;
                }
                if (httpProxyHost == null ? ((MyHttpClientConfiguration) (obj)).httpProxyHost != null : !httpProxyHost.equals(((MyHttpClientConfiguration) (obj)).httpProxyHost))
                {
                    return false;
                }
                if (httpProxyPassword == null ? ((MyHttpClientConfiguration) (obj)).httpProxyPassword != null : !httpProxyPassword.equals(((MyHttpClientConfiguration) (obj)).httpProxyPassword))
                {
                    return false;
                }
                if (httpProxyUser == null ? ((MyHttpClientConfiguration) (obj)).httpProxyUser != null : !httpProxyUser.equals(((MyHttpClientConfiguration) (obj)).httpProxyUser))
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
            return httpRetryCount;
        }

        public int getHttpRetryIntervalSeconds()
        {
            return httpRetryIntervalSeconds;
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
            return ((((((i * 31 + j) * 31 + k) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + l) * 31 + i1;
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

        MyHttpClientConfiguration(String s, String s1, String s2, int i, int j, int k, 
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


    private static final List instances = new ArrayList();
    private static final long serialVersionUID = 0x55b3f2b9f8085720L;
    private boolean applicationOnlyAuthEnabled;
    private int asyncNumThreads;
    private long contributingTo;
    private boolean daemonEnabled;
    private boolean debug;
    private String dispatcherImpl;
    private HttpClientConfiguration httpConf;
    private int httpRetryCount;
    private int httpRetryIntervalSeconds;
    private int httpStreamingReadTimeout;
    private boolean includeEntitiesEnabled;
    private boolean includeMyRetweetEnabled;
    private boolean jsonStoreEnabled;
    private String loggerFactory;
    private boolean mbeanEnabled;
    private String mediaProvider;
    private String mediaProviderAPIKey;
    private Properties mediaProviderParameters;
    private String oAuth2AccessToken;
    private String oAuth2InvalidateTokenURL;
    private String oAuth2TokenType;
    private String oAuth2TokenURL;
    private String oAuthAccessToken;
    private String oAuthAccessTokenSecret;
    private String oAuthAccessTokenURL;
    private String oAuthAuthenticationURL;
    private String oAuthAuthorizationURL;
    private String oAuthConsumerKey;
    private String oAuthConsumerSecret;
    private String oAuthRequestTokenURL;
    private String password;
    private String restBaseURL;
    private String siteStreamBaseURL;
    private boolean stallWarningsEnabled;
    private String streamBaseURL;
    private boolean trimUserEnabled;
    private String user;
    private String userStreamBaseURL;
    private boolean userStreamRepliesAllEnabled;
    private boolean userStreamWithFollowingsEnabled;

    protected ConfigurationBase()
    {
        debug = false;
        user = null;
        password = null;
        httpStreamingReadTimeout = 40000;
        httpRetryCount = 0;
        httpRetryIntervalSeconds = 5;
        oAuthConsumerKey = null;
        oAuthConsumerSecret = null;
        oAuthAccessToken = null;
        oAuthAccessTokenSecret = null;
        oAuthRequestTokenURL = "https://api.twitter.com/oauth/request_token";
        oAuthAuthorizationURL = "https://api.twitter.com/oauth/authorize";
        oAuthAccessTokenURL = "https://api.twitter.com/oauth/access_token";
        oAuthAuthenticationURL = "https://api.twitter.com/oauth/authenticate";
        oAuth2TokenURL = "https://api.twitter.com/oauth2/token";
        oAuth2InvalidateTokenURL = "https://api.twitter.com/oauth2/invalidate_token";
        restBaseURL = "https://api.twitter.com/1.1/";
        streamBaseURL = "https://stream.twitter.com/1.1/";
        userStreamBaseURL = "https://userstream.twitter.com/1.1/";
        siteStreamBaseURL = "https://sitestream.twitter.com/1.1/";
        dispatcherImpl = "twitter4j.DispatcherImpl";
        asyncNumThreads = 1;
        loggerFactory = null;
        contributingTo = -1L;
        includeMyRetweetEnabled = true;
        includeEntitiesEnabled = true;
        trimUserEnabled = false;
        jsonStoreEnabled = false;
        mbeanEnabled = false;
        userStreamRepliesAllEnabled = false;
        userStreamWithFollowingsEnabled = true;
        stallWarningsEnabled = true;
        applicationOnlyAuthEnabled = false;
        mediaProvider = "TWITTER";
        mediaProviderAPIKey = null;
        mediaProviderParameters = null;
        daemonEnabled = true;
        httpConf = new MyHttpClientConfiguration(null, null, null, -1, 20000, 0x1d4c0, false, true);
    }

    private static void cacheInstance(ConfigurationBase configurationbase)
    {
        if (!instances.contains(configurationbase))
        {
            instances.add(configurationbase);
        }
    }

    static String fixURL(boolean flag, String s)
    {
        if (s == null)
        {
            return null;
        }
        int i = s.indexOf("://");
        if (-1 == i)
        {
            throw new IllegalArgumentException("url should contain '://'");
        }
        s = s.substring(i + 3);
        if (flag)
        {
            return (new StringBuilder()).append("https://").append(s).toString();
        } else
        {
            return (new StringBuilder()).append("http://").append(s).toString();
        }
    }

    private static ConfigurationBase getInstance(ConfigurationBase configurationbase)
    {
        int i = instances.indexOf(configurationbase);
        if (i == -1)
        {
            instances.add(configurationbase);
            return configurationbase;
        } else
        {
            return (ConfigurationBase)instances.get(i);
        }
    }

    protected void cacheInstance()
    {
        cacheInstance(this);
    }

    public void dumpConfiguration()
    {
        Logger logger = Logger.getLogger(twitter4j/conf/ConfigurationBase);
        if (!debug) goto _L2; else goto _L1
_L1:
        Field afield[];
        int i;
        int j;
        afield = twitter4j/conf/ConfigurationBase.getDeclaredFields();
        j = afield.length;
        i = 0;
_L3:
        Field field;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        field = afield[i];
        String s1;
        Object obj;
        obj = field.get(this);
        s1 = String.valueOf(obj);
        String s;
        s = s1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = s1;
        if (field.getName().matches("oAuthConsumerSecret|oAuthAccessTokenSecret|password"))
        {
            s = String.valueOf(obj).replaceAll(".", "*");
        }
        logger.debug((new StringBuilder()).append(field.getName()).append(": ").append(s).toString());
_L4:
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        return;
        IllegalAccessException illegalaccessexception;
        illegalaccessexception;
          goto _L4
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ConfigurationBase)obj;
            if (applicationOnlyAuthEnabled != ((ConfigurationBase) (obj)).applicationOnlyAuthEnabled)
            {
                return false;
            }
            if (asyncNumThreads != ((ConfigurationBase) (obj)).asyncNumThreads)
            {
                return false;
            }
            if (contributingTo != ((ConfigurationBase) (obj)).contributingTo)
            {
                return false;
            }
            if (daemonEnabled != ((ConfigurationBase) (obj)).daemonEnabled)
            {
                return false;
            }
            if (debug != ((ConfigurationBase) (obj)).debug)
            {
                return false;
            }
            if (httpRetryCount != ((ConfigurationBase) (obj)).httpRetryCount)
            {
                return false;
            }
            if (httpRetryIntervalSeconds != ((ConfigurationBase) (obj)).httpRetryIntervalSeconds)
            {
                return false;
            }
            if (httpStreamingReadTimeout != ((ConfigurationBase) (obj)).httpStreamingReadTimeout)
            {
                return false;
            }
            if (includeEntitiesEnabled != ((ConfigurationBase) (obj)).includeEntitiesEnabled)
            {
                return false;
            }
            if (includeMyRetweetEnabled != ((ConfigurationBase) (obj)).includeMyRetweetEnabled)
            {
                return false;
            }
            if (jsonStoreEnabled != ((ConfigurationBase) (obj)).jsonStoreEnabled)
            {
                return false;
            }
            if (mbeanEnabled != ((ConfigurationBase) (obj)).mbeanEnabled)
            {
                return false;
            }
            if (stallWarningsEnabled != ((ConfigurationBase) (obj)).stallWarningsEnabled)
            {
                return false;
            }
            if (trimUserEnabled != ((ConfigurationBase) (obj)).trimUserEnabled)
            {
                return false;
            }
            if (userStreamRepliesAllEnabled != ((ConfigurationBase) (obj)).userStreamRepliesAllEnabled)
            {
                return false;
            }
            if (userStreamWithFollowingsEnabled != ((ConfigurationBase) (obj)).userStreamWithFollowingsEnabled)
            {
                return false;
            }
            if (dispatcherImpl == null ? ((ConfigurationBase) (obj)).dispatcherImpl != null : !dispatcherImpl.equals(((ConfigurationBase) (obj)).dispatcherImpl))
            {
                return false;
            }
            if (httpConf == null ? ((ConfigurationBase) (obj)).httpConf != null : !httpConf.equals(((ConfigurationBase) (obj)).httpConf))
            {
                return false;
            }
            if (loggerFactory == null ? ((ConfigurationBase) (obj)).loggerFactory != null : !loggerFactory.equals(((ConfigurationBase) (obj)).loggerFactory))
            {
                return false;
            }
            if (mediaProvider == null ? ((ConfigurationBase) (obj)).mediaProvider != null : !mediaProvider.equals(((ConfigurationBase) (obj)).mediaProvider))
            {
                return false;
            }
            if (mediaProviderAPIKey == null ? ((ConfigurationBase) (obj)).mediaProviderAPIKey != null : !mediaProviderAPIKey.equals(((ConfigurationBase) (obj)).mediaProviderAPIKey))
            {
                return false;
            }
            if (mediaProviderParameters == null ? ((ConfigurationBase) (obj)).mediaProviderParameters != null : !mediaProviderParameters.equals(((ConfigurationBase) (obj)).mediaProviderParameters))
            {
                return false;
            }
            if (oAuth2AccessToken == null ? ((ConfigurationBase) (obj)).oAuth2AccessToken != null : !oAuth2AccessToken.equals(((ConfigurationBase) (obj)).oAuth2AccessToken))
            {
                return false;
            }
            if (oAuth2InvalidateTokenURL == null ? ((ConfigurationBase) (obj)).oAuth2InvalidateTokenURL != null : !oAuth2InvalidateTokenURL.equals(((ConfigurationBase) (obj)).oAuth2InvalidateTokenURL))
            {
                return false;
            }
            if (oAuth2TokenType == null ? ((ConfigurationBase) (obj)).oAuth2TokenType != null : !oAuth2TokenType.equals(((ConfigurationBase) (obj)).oAuth2TokenType))
            {
                return false;
            }
            if (oAuth2TokenURL == null ? ((ConfigurationBase) (obj)).oAuth2TokenURL != null : !oAuth2TokenURL.equals(((ConfigurationBase) (obj)).oAuth2TokenURL))
            {
                return false;
            }
            if (oAuthAccessToken == null ? ((ConfigurationBase) (obj)).oAuthAccessToken != null : !oAuthAccessToken.equals(((ConfigurationBase) (obj)).oAuthAccessToken))
            {
                return false;
            }
            if (oAuthAccessTokenSecret == null ? ((ConfigurationBase) (obj)).oAuthAccessTokenSecret != null : !oAuthAccessTokenSecret.equals(((ConfigurationBase) (obj)).oAuthAccessTokenSecret))
            {
                return false;
            }
            if (oAuthAccessTokenURL == null ? ((ConfigurationBase) (obj)).oAuthAccessTokenURL != null : !oAuthAccessTokenURL.equals(((ConfigurationBase) (obj)).oAuthAccessTokenURL))
            {
                return false;
            }
            if (oAuthAuthenticationURL == null ? ((ConfigurationBase) (obj)).oAuthAuthenticationURL != null : !oAuthAuthenticationURL.equals(((ConfigurationBase) (obj)).oAuthAuthenticationURL))
            {
                return false;
            }
            if (oAuthAuthorizationURL == null ? ((ConfigurationBase) (obj)).oAuthAuthorizationURL != null : !oAuthAuthorizationURL.equals(((ConfigurationBase) (obj)).oAuthAuthorizationURL))
            {
                return false;
            }
            if (oAuthConsumerKey == null ? ((ConfigurationBase) (obj)).oAuthConsumerKey != null : !oAuthConsumerKey.equals(((ConfigurationBase) (obj)).oAuthConsumerKey))
            {
                return false;
            }
            if (oAuthConsumerSecret == null ? ((ConfigurationBase) (obj)).oAuthConsumerSecret != null : !oAuthConsumerSecret.equals(((ConfigurationBase) (obj)).oAuthConsumerSecret))
            {
                return false;
            }
            if (oAuthRequestTokenURL == null ? ((ConfigurationBase) (obj)).oAuthRequestTokenURL != null : !oAuthRequestTokenURL.equals(((ConfigurationBase) (obj)).oAuthRequestTokenURL))
            {
                return false;
            }
            if (password == null ? ((ConfigurationBase) (obj)).password != null : !password.equals(((ConfigurationBase) (obj)).password))
            {
                return false;
            }
            if (restBaseURL == null ? ((ConfigurationBase) (obj)).restBaseURL != null : !restBaseURL.equals(((ConfigurationBase) (obj)).restBaseURL))
            {
                return false;
            }
            if (siteStreamBaseURL == null ? ((ConfigurationBase) (obj)).siteStreamBaseURL != null : !siteStreamBaseURL.equals(((ConfigurationBase) (obj)).siteStreamBaseURL))
            {
                return false;
            }
            if (streamBaseURL == null ? ((ConfigurationBase) (obj)).streamBaseURL != null : !streamBaseURL.equals(((ConfigurationBase) (obj)).streamBaseURL))
            {
                return false;
            }
            if (user == null ? ((ConfigurationBase) (obj)).user != null : !user.equals(((ConfigurationBase) (obj)).user))
            {
                return false;
            }
            if (userStreamBaseURL == null ? ((ConfigurationBase) (obj)).userStreamBaseURL != null : !userStreamBaseURL.equals(((ConfigurationBase) (obj)).userStreamBaseURL))
            {
                return false;
            }
        }
        return true;
    }

    public final int getAsyncNumThreads()
    {
        return asyncNumThreads;
    }

    public final long getContributingTo()
    {
        return contributingTo;
    }

    public String getDispatcherImpl()
    {
        return dispatcherImpl;
    }

    public HttpClientConfiguration getHttpClientConfiguration()
    {
        return httpConf;
    }

    public int getHttpStreamingReadTimeout()
    {
        return httpStreamingReadTimeout;
    }

    public String getLoggerFactory()
    {
        return loggerFactory;
    }

    public String getMediaProvider()
    {
        return mediaProvider;
    }

    public String getMediaProviderAPIKey()
    {
        return mediaProviderAPIKey;
    }

    public Properties getMediaProviderParameters()
    {
        return mediaProviderParameters;
    }

    public String getOAuth2AccessToken()
    {
        return oAuth2AccessToken;
    }

    public String getOAuth2InvalidateTokenURL()
    {
        return oAuth2InvalidateTokenURL;
    }

    public String getOAuth2TokenType()
    {
        return oAuth2TokenType;
    }

    public String getOAuth2TokenURL()
    {
        return oAuth2TokenURL;
    }

    public String getOAuthAccessToken()
    {
        return oAuthAccessToken;
    }

    public String getOAuthAccessTokenSecret()
    {
        return oAuthAccessTokenSecret;
    }

    public String getOAuthAccessTokenURL()
    {
        return oAuthAccessTokenURL;
    }

    public String getOAuthAuthenticationURL()
    {
        return oAuthAuthenticationURL;
    }

    public String getOAuthAuthorizationURL()
    {
        return oAuthAuthorizationURL;
    }

    public final String getOAuthConsumerKey()
    {
        return oAuthConsumerKey;
    }

    public final String getOAuthConsumerSecret()
    {
        return oAuthConsumerSecret;
    }

    public String getOAuthRequestTokenURL()
    {
        return oAuthRequestTokenURL;
    }

    public final String getPassword()
    {
        return password;
    }

    public String getRestBaseURL()
    {
        return restBaseURL;
    }

    public String getSiteStreamBaseURL()
    {
        return siteStreamBaseURL;
    }

    public String getStreamBaseURL()
    {
        return streamBaseURL;
    }

    public final String getUser()
    {
        return user;
    }

    public String getUserStreamBaseURL()
    {
        return userStreamBaseURL;
    }

    public int hashCode()
    {
        int k8 = 1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        int k7;
        int l7;
        int i8;
        int j8;
        int l8;
        int i9;
        int j9;
        int k9;
        int l9;
        if (debug)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (user != null)
        {
            j = user.hashCode();
        } else
        {
            j = 0;
        }
        if (password != null)
        {
            k = password.hashCode();
        } else
        {
            k = 0;
        }
        if (httpConf != null)
        {
            l = httpConf.hashCode();
        } else
        {
            l = 0;
        }
        l8 = httpStreamingReadTimeout;
        i9 = httpRetryCount;
        j9 = httpRetryIntervalSeconds;
        if (oAuthConsumerKey != null)
        {
            i1 = oAuthConsumerKey.hashCode();
        } else
        {
            i1 = 0;
        }
        if (oAuthConsumerSecret != null)
        {
            j1 = oAuthConsumerSecret.hashCode();
        } else
        {
            j1 = 0;
        }
        if (oAuthAccessToken != null)
        {
            k1 = oAuthAccessToken.hashCode();
        } else
        {
            k1 = 0;
        }
        if (oAuthAccessTokenSecret != null)
        {
            l1 = oAuthAccessTokenSecret.hashCode();
        } else
        {
            l1 = 0;
        }
        if (oAuth2TokenType != null)
        {
            i2 = oAuth2TokenType.hashCode();
        } else
        {
            i2 = 0;
        }
        if (oAuth2AccessToken != null)
        {
            j2 = oAuth2AccessToken.hashCode();
        } else
        {
            j2 = 0;
        }
        if (oAuthRequestTokenURL != null)
        {
            k2 = oAuthRequestTokenURL.hashCode();
        } else
        {
            k2 = 0;
        }
        if (oAuthAuthorizationURL != null)
        {
            l2 = oAuthAuthorizationURL.hashCode();
        } else
        {
            l2 = 0;
        }
        if (oAuthAccessTokenURL != null)
        {
            i3 = oAuthAccessTokenURL.hashCode();
        } else
        {
            i3 = 0;
        }
        if (oAuthAuthenticationURL != null)
        {
            j3 = oAuthAuthenticationURL.hashCode();
        } else
        {
            j3 = 0;
        }
        if (oAuth2TokenURL != null)
        {
            k3 = oAuth2TokenURL.hashCode();
        } else
        {
            k3 = 0;
        }
        if (oAuth2InvalidateTokenURL != null)
        {
            l3 = oAuth2InvalidateTokenURL.hashCode();
        } else
        {
            l3 = 0;
        }
        if (restBaseURL != null)
        {
            i4 = restBaseURL.hashCode();
        } else
        {
            i4 = 0;
        }
        if (streamBaseURL != null)
        {
            j4 = streamBaseURL.hashCode();
        } else
        {
            j4 = 0;
        }
        if (userStreamBaseURL != null)
        {
            k4 = userStreamBaseURL.hashCode();
        } else
        {
            k4 = 0;
        }
        if (siteStreamBaseURL != null)
        {
            l4 = siteStreamBaseURL.hashCode();
        } else
        {
            l4 = 0;
        }
        if (dispatcherImpl != null)
        {
            i5 = dispatcherImpl.hashCode();
        } else
        {
            i5 = 0;
        }
        k9 = asyncNumThreads;
        if (loggerFactory != null)
        {
            j5 = loggerFactory.hashCode();
        } else
        {
            j5 = 0;
        }
        l9 = (int)(contributingTo ^ contributingTo >>> 32);
        if (includeMyRetweetEnabled)
        {
            k5 = 1;
        } else
        {
            k5 = 0;
        }
        if (includeEntitiesEnabled)
        {
            l5 = 1;
        } else
        {
            l5 = 0;
        }
        if (trimUserEnabled)
        {
            i6 = 1;
        } else
        {
            i6 = 0;
        }
        if (jsonStoreEnabled)
        {
            j6 = 1;
        } else
        {
            j6 = 0;
        }
        if (mbeanEnabled)
        {
            k6 = 1;
        } else
        {
            k6 = 0;
        }
        if (userStreamRepliesAllEnabled)
        {
            l6 = 1;
        } else
        {
            l6 = 0;
        }
        if (userStreamWithFollowingsEnabled)
        {
            i7 = 1;
        } else
        {
            i7 = 0;
        }
        if (stallWarningsEnabled)
        {
            j7 = 1;
        } else
        {
            j7 = 0;
        }
        if (applicationOnlyAuthEnabled)
        {
            k7 = 1;
        } else
        {
            k7 = 0;
        }
        if (mediaProvider != null)
        {
            l7 = mediaProvider.hashCode();
        } else
        {
            l7 = 0;
        }
        if (mediaProviderAPIKey != null)
        {
            i8 = mediaProviderAPIKey.hashCode();
        } else
        {
            i8 = 0;
        }
        if (mediaProviderParameters != null)
        {
            j8 = mediaProviderParameters.hashCode();
        } else
        {
            j8 = 0;
        }
        if (!daemonEnabled)
        {
            k8 = 0;
        }
        return ((((((((((((((((((((((((((((((((((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + l8) * 31 + i9) * 31 + j9) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + k9) * 31 + j5) * 31 + l9) * 31 + k5) * 31 + l5) * 31 + i6) * 31 + j6) * 31 + k6) * 31 + l6) * 31 + i7) * 31 + j7) * 31 + k7) * 31 + l7) * 31 + i8) * 31 + j8) * 31 + k8;
    }

    public boolean isApplicationOnlyAuthEnabled()
    {
        return applicationOnlyAuthEnabled;
    }

    public boolean isDaemonEnabled()
    {
        return daemonEnabled;
    }

    public final boolean isDebugEnabled()
    {
        return debug;
    }

    public boolean isIncludeEntitiesEnabled()
    {
        return includeEntitiesEnabled;
    }

    public boolean isIncludeMyRetweetEnabled()
    {
        return includeMyRetweetEnabled;
    }

    public boolean isJSONStoreEnabled()
    {
        return jsonStoreEnabled;
    }

    public boolean isMBeanEnabled()
    {
        return mbeanEnabled;
    }

    public boolean isStallWarningsEnabled()
    {
        return stallWarningsEnabled;
    }

    public boolean isTrimUserEnabled()
    {
        return trimUserEnabled;
    }

    public boolean isUserStreamRepliesAllEnabled()
    {
        return userStreamRepliesAllEnabled;
    }

    public boolean isUserStreamWithFollowingsEnabled()
    {
        return userStreamWithFollowingsEnabled;
    }

    protected Object readResolve()
        throws ObjectStreamException
    {
        return getInstance(this);
    }

    protected final void setApplicationOnlyAuthEnabled(boolean flag)
    {
        applicationOnlyAuthEnabled = flag;
    }

    protected final void setAsyncNumThreads(int i)
    {
        asyncNumThreads = i;
    }

    protected final void setContributingTo(long l)
    {
        contributingTo = l;
    }

    protected void setDaemonEnabled(boolean flag)
    {
        daemonEnabled = flag;
    }

    protected final void setDebug(boolean flag)
    {
        debug = flag;
    }

    protected final void setDispatcherImpl(String s)
    {
        dispatcherImpl = s;
    }

    protected final void setGZIPEnabled(boolean flag)
    {
        httpConf = new MyHttpClientConfiguration(httpConf.getHttpProxyHost(), httpConf.getHttpProxyUser(), httpConf.getHttpProxyPassword(), httpConf.getHttpProxyPort(), httpConf.getHttpConnectionTimeout(), httpConf.getHttpReadTimeout(), httpConf.isPrettyDebugEnabled(), flag);
    }

    protected final void setHttpConnectionTimeout(int i)
    {
        httpConf = new MyHttpClientConfiguration(httpConf.getHttpProxyHost(), httpConf.getHttpProxyUser(), httpConf.getHttpProxyPassword(), httpConf.getHttpProxyPort(), i, httpConf.getHttpReadTimeout(), httpConf.isPrettyDebugEnabled(), httpConf.isGZIPEnabled());
    }

    protected final void setHttpProxyHost(String s)
    {
        httpConf = new MyHttpClientConfiguration(s, httpConf.getHttpProxyUser(), httpConf.getHttpProxyPassword(), httpConf.getHttpProxyPort(), httpConf.getHttpConnectionTimeout(), httpConf.getHttpReadTimeout(), httpConf.isPrettyDebugEnabled(), httpConf.isGZIPEnabled());
    }

    protected final void setHttpProxyPassword(String s)
    {
        httpConf = new MyHttpClientConfiguration(httpConf.getHttpProxyHost(), httpConf.getHttpProxyUser(), s, httpConf.getHttpProxyPort(), httpConf.getHttpConnectionTimeout(), httpConf.getHttpReadTimeout(), httpConf.isPrettyDebugEnabled(), httpConf.isGZIPEnabled());
    }

    protected final void setHttpProxyPort(int i)
    {
        httpConf = new MyHttpClientConfiguration(httpConf.getHttpProxyHost(), httpConf.getHttpProxyUser(), httpConf.getHttpProxyPassword(), i, httpConf.getHttpConnectionTimeout(), httpConf.getHttpReadTimeout(), httpConf.isPrettyDebugEnabled(), httpConf.isGZIPEnabled());
    }

    protected final void setHttpProxyUser(String s)
    {
        httpConf = new MyHttpClientConfiguration(httpConf.getHttpProxyHost(), s, httpConf.getHttpProxyPassword(), httpConf.getHttpProxyPort(), httpConf.getHttpConnectionTimeout(), httpConf.getHttpReadTimeout(), httpConf.isPrettyDebugEnabled(), httpConf.isGZIPEnabled());
    }

    protected final void setHttpReadTimeout(int i)
    {
        httpConf = new MyHttpClientConfiguration(httpConf.getHttpProxyHost(), httpConf.getHttpProxyUser(), httpConf.getHttpProxyPassword(), httpConf.getHttpProxyPort(), httpConf.getHttpConnectionTimeout(), i, httpConf.isPrettyDebugEnabled(), httpConf.isGZIPEnabled());
    }

    protected final void setHttpRetryCount(int i)
    {
        httpRetryCount = i;
    }

    protected final void setHttpRetryIntervalSeconds(int i)
    {
        httpRetryIntervalSeconds = i;
    }

    protected final void setHttpStreamingReadTimeout(int i)
    {
        httpStreamingReadTimeout = i;
    }

    protected void setIncludeEntitiesEnabled(boolean flag)
    {
        includeEntitiesEnabled = flag;
    }

    public void setIncludeMyRetweetEnabled(boolean flag)
    {
        includeMyRetweetEnabled = flag;
    }

    protected final void setJSONStoreEnabled(boolean flag)
    {
        jsonStoreEnabled = flag;
    }

    protected final void setLoggerFactory(String s)
    {
        loggerFactory = s;
    }

    protected final void setMBeanEnabled(boolean flag)
    {
        mbeanEnabled = flag;
    }

    protected final void setMediaProvider(String s)
    {
        mediaProvider = s;
    }

    protected final void setMediaProviderAPIKey(String s)
    {
        mediaProviderAPIKey = s;
    }

    protected final void setMediaProviderParameters(Properties properties)
    {
        mediaProviderParameters = properties;
    }

    protected final void setOAuth2AccessToken(String s)
    {
        oAuth2AccessToken = s;
    }

    protected final void setOAuth2InvalidateTokenURL(String s)
    {
        oAuth2InvalidateTokenURL = s;
    }

    protected final void setOAuth2TokenType(String s)
    {
        oAuth2TokenType = s;
    }

    protected final void setOAuth2TokenURL(String s)
    {
        oAuth2TokenURL = s;
    }

    protected final void setOAuthAccessToken(String s)
    {
        oAuthAccessToken = s;
    }

    protected final void setOAuthAccessTokenSecret(String s)
    {
        oAuthAccessTokenSecret = s;
    }

    protected final void setOAuthAccessTokenURL(String s)
    {
        oAuthAccessTokenURL = s;
    }

    protected final void setOAuthAuthenticationURL(String s)
    {
        oAuthAuthenticationURL = s;
    }

    protected final void setOAuthAuthorizationURL(String s)
    {
        oAuthAuthorizationURL = s;
    }

    protected final void setOAuthConsumerKey(String s)
    {
        oAuthConsumerKey = s;
    }

    protected final void setOAuthConsumerSecret(String s)
    {
        oAuthConsumerSecret = s;
    }

    protected final void setOAuthRequestTokenURL(String s)
    {
        oAuthRequestTokenURL = s;
    }

    protected final void setPassword(String s)
    {
        password = s;
    }

    protected final void setPrettyDebugEnabled(boolean flag)
    {
        httpConf = new MyHttpClientConfiguration(httpConf.getHttpProxyHost(), httpConf.getHttpProxyUser(), httpConf.getHttpProxyPassword(), httpConf.getHttpProxyPort(), httpConf.getHttpConnectionTimeout(), httpConf.getHttpReadTimeout(), flag, httpConf.isGZIPEnabled());
    }

    protected final void setRestBaseURL(String s)
    {
        restBaseURL = s;
    }

    protected final void setSiteStreamBaseURL(String s)
    {
        siteStreamBaseURL = s;
    }

    protected final void setStallWarningsEnabled(boolean flag)
    {
        stallWarningsEnabled = flag;
    }

    protected final void setStreamBaseURL(String s)
    {
        streamBaseURL = s;
    }

    public void setTrimUserEnabled(boolean flag)
    {
        trimUserEnabled = flag;
    }

    protected final void setUser(String s)
    {
        user = s;
    }

    protected final void setUserStreamBaseURL(String s)
    {
        userStreamBaseURL = s;
    }

    protected final void setUserStreamRepliesAllEnabled(boolean flag)
    {
        userStreamRepliesAllEnabled = flag;
    }

    protected final void setUserStreamWithFollowingsEnabled(boolean flag)
    {
        userStreamWithFollowingsEnabled = flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ConfigurationBase{debug=").append(debug).append(", user='").append(user).append('\'').append(", password='").append(password).append('\'').append(", httpConf=").append(httpConf).append(", httpStreamingReadTimeout=").append(httpStreamingReadTimeout).append(", httpRetryCount=").append(httpRetryCount).append(", httpRetryIntervalSeconds=").append(httpRetryIntervalSeconds).append(", oAuthConsumerKey='").append(oAuthConsumerKey).append('\'').append(", oAuthConsumerSecret='").append(oAuthConsumerSecret).append('\'').append(", oAuthAccessToken='").append(oAuthAccessToken).append('\'').append(", oAuthAccessTokenSecret='").append(oAuthAccessTokenSecret).append('\'').append(", oAuth2TokenType='").append(oAuth2TokenType).append('\'').append(", oAuth2AccessToken='").append(oAuth2AccessToken).append('\'').append(", oAuthRequestTokenURL='").append(oAuthRequestTokenURL).append('\'').append(", oAuthAuthorizationURL='").append(oAuthAuthorizationURL).append('\'').append(", oAuthAccessTokenURL='").append(oAuthAccessTokenURL).append('\'').append(", oAuthAuthenticationURL='").append(oAuthAuthenticationURL).append('\'').append(", oAuth2TokenURL='").append(oAuth2TokenURL).append('\'').append(", oAuth2InvalidateTokenURL='").append(oAuth2InvalidateTokenURL).append('\'').append(", restBaseURL='").append(restBaseURL).append('\'').append(", streamBaseURL='").append(streamBaseURL).append('\'').append(", userStreamBaseURL='").append(userStreamBaseURL).append('\'').append(", siteStreamBaseURL='").append(siteStreamBaseURL).append('\'').append(", dispatcherImpl='").append(dispatcherImpl).append('\'').append(", asyncNumThreads=").append(asyncNumThreads).append(", loggerFactory='").append(loggerFactory).append('\'').append(", contributingTo=").append(contributingTo).append(", includeMyRetweetEnabled=").append(includeMyRetweetEnabled).append(", includeEntitiesEnabled=").append(includeEntitiesEnabled).append(", trimUserEnabled=").append(trimUserEnabled).append(", jsonStoreEnabled=").append(jsonStoreEnabled).append(", mbeanEnabled=").append(mbeanEnabled).append(", userStreamRepliesAllEnabled=").append(userStreamRepliesAllEnabled).append(", userStreamWithFollowingsEnabled=").append(userStreamWithFollowingsEnabled).append(", stallWarningsEnabled=").append(stallWarningsEnabled).append(", applicationOnlyAuthEnabled=").append(applicationOnlyAuthEnabled).append(", mediaProvider='").append(mediaProvider).append('\'').append(", mediaProviderAPIKey='").append(mediaProviderAPIKey).append('\'').append(", mediaProviderParameters=").append(mediaProviderParameters).append(", daemonEnabled=").append(daemonEnabled).append('}').toString();
    }



}
