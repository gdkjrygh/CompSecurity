// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import twitter4j.Version;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j.conf:
//            Configuration

class ConfigurationBase
    implements Serializable, Configuration
{

    public static final String DALVIK = "twitter4j.dalvik";
    private static final String DEFAULT_OAUTH2_INVALIDATE_TOKEN_URL = "https://api.twitter.com/oauth2/invalidate_token";
    private static final String DEFAULT_OAUTH2_TOKEN_URL = "https://api.twitter.com/oauth2/token";
    private static final String DEFAULT_OAUTH_ACCESS_TOKEN_URL = "http://api.twitter.com/oauth/access_token";
    private static final String DEFAULT_OAUTH_AUTHENTICATION_URL = "http://api.twitter.com/oauth/authenticate";
    private static final String DEFAULT_OAUTH_AUTHORIZATION_URL = "http://api.twitter.com/oauth/authorize";
    private static final String DEFAULT_OAUTH_REQUEST_TOKEN_URL = "http://api.twitter.com/oauth/request_token";
    private static final String DEFAULT_REST_BASE_URL = "http://api.twitter.com/1.1/";
    private static final String DEFAULT_SITE_STREAM_BASE_URL = "https://sitestream.twitter.com/1.1/";
    private static final String DEFAULT_STREAM_BASE_URL = "https://stream.twitter.com/1.1/";
    private static final String DEFAULT_USER_STREAM_BASE_URL = "https://userstream.twitter.com/1.1/";
    public static final String GAE = "twitter4j.gae";
    static String dalvikDetected;
    static String gaeDetected;
    private static final List instances = new ArrayList();
    private static final long serialVersionUID = 0xa442cb880cac80f8L;
    private boolean IS_DALVIK;
    private boolean IS_GAE;
    private boolean applicationOnlyAuthEnabled;
    private int asyncNumThreads;
    private String clientURL;
    private String clientVersion;
    private long contributingTo;
    private boolean debug;
    private int defaultMaxPerRoute;
    private String dispatcherImpl;
    private boolean gzipEnabled;
    private int httpConnectionTimeout;
    private String httpProxyHost;
    private String httpProxyPassword;
    private int httpProxyPort;
    private String httpProxyUser;
    private int httpReadTimeout;
    private int httpRetryCount;
    private int httpRetryIntervalSeconds;
    private int httpStreamingReadTimeout;
    private boolean includeEntitiesEnabled;
    private boolean includeMyRetweetEnabled;
    private boolean includeRTsEnabled;
    private boolean jsonStoreEnabled;
    private String loggerFactory;
    private int maxTotalConnections;
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
    private boolean prettyDebug;
    Map requestHeaders;
    private String restBaseURL;
    private String siteStreamBaseURL;
    private boolean stallWarningsEnabled;
    private String streamBaseURL;
    private boolean trimUserEnabled;
    private boolean useSSL;
    private String user;
    private String userAgent;
    private String userStreamBaseURL;
    private boolean userStreamRepliesAllEnabled;

    protected ConfigurationBase()
    {
        includeRTsEnabled = true;
        includeEntitiesEnabled = true;
        includeMyRetweetEnabled = true;
        trimUserEnabled = false;
        applicationOnlyAuthEnabled = false;
        setDebug(false);
        setUser(null);
        setPassword(null);
        setUseSSL(true);
        setPrettyDebugEnabled(false);
        setGZIPEnabled(true);
        setHttpProxyHost(null);
        setHttpProxyUser(null);
        setHttpProxyPassword(null);
        setHttpProxyPort(-1);
        setHttpConnectionTimeout(20000);
        setHttpReadTimeout(0x1d4c0);
        setHttpStreamingReadTimeout(40000);
        setHttpRetryCount(0);
        setHttpRetryIntervalSeconds(5);
        setHttpMaxTotalConnections(20);
        setHttpDefaultMaxPerRoute(2);
        setOAuthConsumerKey(null);
        setOAuthConsumerSecret(null);
        setOAuthAccessToken(null);
        setOAuthAccessTokenSecret(null);
        setAsyncNumThreads(1);
        setContributingTo(-1L);
        setClientVersion(Version.getVersion());
        setClientURL((new StringBuilder("http://twitter4j.org/en/twitter4j-")).append(Version.getVersion()).append(".xml").toString());
        setUserAgent((new StringBuilder("twitter4j http://twitter4j.org/ /")).append(Version.getVersion()).toString());
        setJSONStoreEnabled(false);
        setMBeanEnabled(false);
        setOAuthRequestTokenURL("http://api.twitter.com/oauth/request_token");
        setOAuthAuthorizationURL("http://api.twitter.com/oauth/authorize");
        setOAuthAccessTokenURL("http://api.twitter.com/oauth/access_token");
        setOAuthAuthenticationURL("http://api.twitter.com/oauth/authenticate");
        setOAuth2TokenURL("https://api.twitter.com/oauth2/token");
        setOAuth2InvalidateTokenURL("https://api.twitter.com/oauth2/invalidate_token");
        setRestBaseURL("http://api.twitter.com/1.1/");
        setStreamBaseURL("https://stream.twitter.com/1.1/");
        setUserStreamBaseURL("https://userstream.twitter.com/1.1/");
        setSiteStreamBaseURL("https://sitestream.twitter.com/1.1/");
        setDispatcherImpl("twitter4j.internal.async.DispatcherImpl");
        setLoggerFactory(null);
        setUserStreamRepliesAllEnabled(false);
        setStallWarningsEnabled(true);
        String s;
        try
        {
            s = System.getProperty("twitter4j.dalvik", dalvikDetected);
        }
        catch (SecurityException securityexception)
        {
            securityexception = dalvikDetected;
        }
        IS_DALVIK = Boolean.valueOf(s).booleanValue();
        try
        {
            s = System.getProperty("twitter4j.gae", gaeDetected);
        }
        catch (SecurityException securityexception1)
        {
            securityexception1 = gaeDetected;
        }
        IS_GAE = Boolean.valueOf(s).booleanValue();
        setMediaProvider("TWITTER");
        setMediaProviderAPIKey(null);
        setMediaProviderParameters(null);
    }

    private static void cacheInstance(ConfigurationBase configurationbase)
    {
        if (!instances.contains(configurationbase))
        {
            instances.add(configurationbase);
        }
    }

    private void fixRestBaseURL()
    {
        if ("http://api.twitter.com/1.1/".equals(fixURL(false, restBaseURL)))
        {
            restBaseURL = fixURL(useSSL, restBaseURL);
        }
        if ("http://api.twitter.com/oauth/access_token".equals(fixURL(false, oAuthAccessTokenURL)))
        {
            oAuthAccessTokenURL = fixURL(useSSL, oAuthAccessTokenURL);
        }
        if ("http://api.twitter.com/oauth/authenticate".equals(fixURL(false, oAuthAuthenticationURL)))
        {
            oAuthAuthenticationURL = fixURL(useSSL, oAuthAuthenticationURL);
        }
        if ("http://api.twitter.com/oauth/authorize".equals(fixURL(false, oAuthAuthorizationURL)))
        {
            oAuthAuthorizationURL = fixURL(useSSL, oAuthAuthorizationURL);
        }
        if ("http://api.twitter.com/oauth/request_token".equals(fixURL(false, oAuthRequestTokenURL)))
        {
            oAuthRequestTokenURL = fixURL(useSSL, oAuthRequestTokenURL);
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
            return (new StringBuilder("https://")).append(s).toString();
        } else
        {
            return (new StringBuilder("http://")).append(s).toString();
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

    private void initRequestHeaders()
    {
        requestHeaders = new HashMap();
        requestHeaders.put("X-Twitter-Client-Version", getClientVersion());
        requestHeaders.put("X-Twitter-Client-URL", getClientURL());
        requestHeaders.put("X-Twitter-Client", "Twitter4J");
        requestHeaders.put("User-Agent", getUserAgent());
        if (gzipEnabled)
        {
            requestHeaders.put("Accept-Encoding", "gzip");
        }
        if (IS_DALVIK)
        {
            requestHeaders.put("Connection", "close");
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
            break MISSING_BLOCK_LABEL_88;
        }
        s = s1;
        if (field.getName().matches("oAuthConsumerSecret|oAuthAccessTokenSecret|password"))
        {
            s = z_T4JInternalStringUtil.maskString(String.valueOf(obj));
        }
        logger.debug((new StringBuilder()).append(field.getName()).append(": ").append(s).toString());
_L4:
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        if (!includeRTsEnabled)
        {
            logger.warn("includeRTsEnabled is set to false. This configuration may not take effect after May 14th, 2012. https://dev.twitter.com/blog/api-housekeeping");
        }
        if (!includeEntitiesEnabled)
        {
            logger.warn("includeEntitiesEnabled is set to false. This configuration may not take effect after May 14th, 2012. https://dev.twitter.com/blog/api-housekeeping");
        }
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
            if (IS_DALVIK != ((ConfigurationBase) (obj)).IS_DALVIK)
            {
                return false;
            }
            if (IS_GAE != ((ConfigurationBase) (obj)).IS_GAE)
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
            if (debug != ((ConfigurationBase) (obj)).debug)
            {
                return false;
            }
            if (defaultMaxPerRoute != ((ConfigurationBase) (obj)).defaultMaxPerRoute)
            {
                return false;
            }
            if (gzipEnabled != ((ConfigurationBase) (obj)).gzipEnabled)
            {
                return false;
            }
            if (httpConnectionTimeout != ((ConfigurationBase) (obj)).httpConnectionTimeout)
            {
                return false;
            }
            if (httpProxyPort != ((ConfigurationBase) (obj)).httpProxyPort)
            {
                return false;
            }
            if (httpReadTimeout != ((ConfigurationBase) (obj)).httpReadTimeout)
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
            if (trimUserEnabled != ((ConfigurationBase) (obj)).trimUserEnabled)
            {
                return false;
            }
            if (includeRTsEnabled != ((ConfigurationBase) (obj)).includeRTsEnabled)
            {
                return false;
            }
            if (jsonStoreEnabled != ((ConfigurationBase) (obj)).jsonStoreEnabled)
            {
                return false;
            }
            if (maxTotalConnections != ((ConfigurationBase) (obj)).maxTotalConnections)
            {
                return false;
            }
            if (mbeanEnabled != ((ConfigurationBase) (obj)).mbeanEnabled)
            {
                return false;
            }
            if (prettyDebug != ((ConfigurationBase) (obj)).prettyDebug)
            {
                return false;
            }
            if (stallWarningsEnabled != ((ConfigurationBase) (obj)).stallWarningsEnabled)
            {
                return false;
            }
            if (applicationOnlyAuthEnabled != ((ConfigurationBase) (obj)).applicationOnlyAuthEnabled)
            {
                return false;
            }
            if (useSSL != ((ConfigurationBase) (obj)).useSSL)
            {
                return false;
            }
            if (userStreamRepliesAllEnabled != ((ConfigurationBase) (obj)).userStreamRepliesAllEnabled)
            {
                return false;
            }
            if (clientURL == null ? ((ConfigurationBase) (obj)).clientURL != null : !clientURL.equals(((ConfigurationBase) (obj)).clientURL))
            {
                return false;
            }
            if (clientVersion == null ? ((ConfigurationBase) (obj)).clientVersion != null : !clientVersion.equals(((ConfigurationBase) (obj)).clientVersion))
            {
                return false;
            }
            if (dispatcherImpl == null ? ((ConfigurationBase) (obj)).dispatcherImpl != null : !dispatcherImpl.equals(((ConfigurationBase) (obj)).dispatcherImpl))
            {
                return false;
            }
            if (httpProxyHost == null ? ((ConfigurationBase) (obj)).httpProxyHost != null : !httpProxyHost.equals(((ConfigurationBase) (obj)).httpProxyHost))
            {
                return false;
            }
            if (httpProxyPassword == null ? ((ConfigurationBase) (obj)).httpProxyPassword != null : !httpProxyPassword.equals(((ConfigurationBase) (obj)).httpProxyPassword))
            {
                return false;
            }
            if (httpProxyUser == null ? ((ConfigurationBase) (obj)).httpProxyUser != null : !httpProxyUser.equals(((ConfigurationBase) (obj)).httpProxyUser))
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
            if (oAuthAccessToken == null ? ((ConfigurationBase) (obj)).oAuthAccessToken != null : !oAuthAccessToken.equals(((ConfigurationBase) (obj)).oAuthAccessToken))
            {
                return false;
            }
            if (oAuthAccessTokenSecret == null ? ((ConfigurationBase) (obj)).oAuthAccessTokenSecret != null : !oAuthAccessTokenSecret.equals(((ConfigurationBase) (obj)).oAuthAccessTokenSecret))
            {
                return false;
            }
            if (oAuth2TokenType == null ? ((ConfigurationBase) (obj)).oAuth2TokenType != null : !oAuth2TokenType.equals(((ConfigurationBase) (obj)).oAuth2TokenType))
            {
                return false;
            }
            if (oAuth2AccessToken == null ? ((ConfigurationBase) (obj)).oAuth2AccessToken != null : !oAuth2AccessToken.equals(((ConfigurationBase) (obj)).oAuth2AccessToken))
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
            if (oAuth2TokenURL == null ? ((ConfigurationBase) (obj)).oAuth2TokenURL != null : !oAuth2TokenURL.equals(((ConfigurationBase) (obj)).oAuth2TokenURL))
            {
                return false;
            }
            if (oAuth2InvalidateTokenURL == null ? ((ConfigurationBase) (obj)).oAuth2InvalidateTokenURL != null : !oAuth2InvalidateTokenURL.equals(((ConfigurationBase) (obj)).oAuth2InvalidateTokenURL))
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
            if (requestHeaders == null ? ((ConfigurationBase) (obj)).requestHeaders != null : !requestHeaders.equals(((ConfigurationBase) (obj)).requestHeaders))
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
            if (userAgent == null ? ((ConfigurationBase) (obj)).userAgent != null : !userAgent.equals(((ConfigurationBase) (obj)).userAgent))
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

    public final String getClientURL()
    {
        return clientURL;
    }

    public final String getClientVersion()
    {
        return clientVersion;
    }

    public final long getContributingTo()
    {
        return contributingTo;
    }

    public String getDispatcherImpl()
    {
        return dispatcherImpl;
    }

    public final int getHttpConnectionTimeout()
    {
        return httpConnectionTimeout;
    }

    public final int getHttpDefaultMaxPerRoute()
    {
        return defaultMaxPerRoute;
    }

    public final int getHttpMaxTotalConnections()
    {
        return maxTotalConnections;
    }

    public final String getHttpProxyHost()
    {
        return httpProxyHost;
    }

    public final String getHttpProxyPassword()
    {
        return httpProxyPassword;
    }

    public final int getHttpProxyPort()
    {
        return httpProxyPort;
    }

    public final String getHttpProxyUser()
    {
        return httpProxyUser;
    }

    public final int getHttpReadTimeout()
    {
        return httpReadTimeout;
    }

    public final int getHttpRetryCount()
    {
        return httpRetryCount;
    }

    public final int getHttpRetryIntervalSeconds()
    {
        return httpRetryIntervalSeconds;
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

    public Map getRequestHeaders()
    {
        return requestHeaders;
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

    public final String getUserAgent()
    {
        return userAgent;
    }

    public String getUserStreamBaseURL()
    {
        return userStreamBaseURL;
    }

    public int hashCode()
    {
        int l10 = 1;
        int i11 = 0;
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
        int k8;
        int l8;
        int i9;
        int j9;
        int k9;
        int l9;
        int i10;
        int j10;
        int k10;
        int j11;
        int k11;
        int l11;
        int i12;
        int j12;
        int k12;
        int l12;
        int i13;
        int j13;
        int k13;
        if (debug)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (userAgent != null)
        {
            j = userAgent.hashCode();
        } else
        {
            j = 0;
        }
        if (user != null)
        {
            k = user.hashCode();
        } else
        {
            k = 0;
        }
        if (password != null)
        {
            l = password.hashCode();
        } else
        {
            l = 0;
        }
        if (useSSL)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (prettyDebug)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (gzipEnabled)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (httpProxyHost != null)
        {
            l1 = httpProxyHost.hashCode();
        } else
        {
            l1 = 0;
        }
        if (httpProxyUser != null)
        {
            i2 = httpProxyUser.hashCode();
        } else
        {
            i2 = 0;
        }
        if (httpProxyPassword != null)
        {
            j2 = httpProxyPassword.hashCode();
        } else
        {
            j2 = 0;
        }
        j11 = httpProxyPort;
        k11 = httpConnectionTimeout;
        l11 = httpReadTimeout;
        i12 = httpStreamingReadTimeout;
        j12 = httpRetryCount;
        k12 = httpRetryIntervalSeconds;
        l12 = maxTotalConnections;
        i13 = defaultMaxPerRoute;
        if (oAuthConsumerKey != null)
        {
            k2 = oAuthConsumerKey.hashCode();
        } else
        {
            k2 = 0;
        }
        if (oAuthConsumerSecret != null)
        {
            l2 = oAuthConsumerSecret.hashCode();
        } else
        {
            l2 = 0;
        }
        if (oAuthAccessToken != null)
        {
            i3 = oAuthAccessToken.hashCode();
        } else
        {
            i3 = 0;
        }
        if (oAuthAccessTokenSecret != null)
        {
            j3 = oAuthAccessTokenSecret.hashCode();
        } else
        {
            j3 = 0;
        }
        if (oAuth2TokenType != null)
        {
            k3 = oAuth2TokenType.hashCode();
        } else
        {
            k3 = 0;
        }
        if (oAuth2AccessToken != null)
        {
            l3 = oAuth2AccessToken.hashCode();
        } else
        {
            l3 = 0;
        }
        if (oAuthRequestTokenURL != null)
        {
            i4 = oAuthRequestTokenURL.hashCode();
        } else
        {
            i4 = 0;
        }
        if (oAuthAuthorizationURL != null)
        {
            j4 = oAuthAuthorizationURL.hashCode();
        } else
        {
            j4 = 0;
        }
        if (oAuthAccessTokenURL != null)
        {
            k4 = oAuthAccessTokenURL.hashCode();
        } else
        {
            k4 = 0;
        }
        if (oAuthAuthenticationURL != null)
        {
            l4 = oAuthAuthenticationURL.hashCode();
        } else
        {
            l4 = 0;
        }
        if (oAuth2TokenURL != null)
        {
            i5 = oAuth2TokenURL.hashCode();
        } else
        {
            i5 = 0;
        }
        if (oAuth2InvalidateTokenURL != null)
        {
            j5 = oAuth2InvalidateTokenURL.hashCode();
        } else
        {
            j5 = 0;
        }
        if (restBaseURL != null)
        {
            k5 = restBaseURL.hashCode();
        } else
        {
            k5 = 0;
        }
        if (streamBaseURL != null)
        {
            l5 = streamBaseURL.hashCode();
        } else
        {
            l5 = 0;
        }
        if (userStreamBaseURL != null)
        {
            i6 = userStreamBaseURL.hashCode();
        } else
        {
            i6 = 0;
        }
        if (siteStreamBaseURL != null)
        {
            j6 = siteStreamBaseURL.hashCode();
        } else
        {
            j6 = 0;
        }
        if (dispatcherImpl != null)
        {
            k6 = dispatcherImpl.hashCode();
        } else
        {
            k6 = 0;
        }
        if (loggerFactory != null)
        {
            l6 = loggerFactory.hashCode();
        } else
        {
            l6 = 0;
        }
        j13 = asyncNumThreads;
        k13 = (int)(contributingTo ^ contributingTo >>> 32);
        if (includeRTsEnabled)
        {
            i7 = 1;
        } else
        {
            i7 = 0;
        }
        if (includeEntitiesEnabled)
        {
            j7 = 1;
        } else
        {
            j7 = 0;
        }
        if (includeMyRetweetEnabled)
        {
            k7 = 1;
        } else
        {
            k7 = 0;
        }
        if (trimUserEnabled)
        {
            l7 = 1;
        } else
        {
            l7 = 0;
        }
        if (jsonStoreEnabled)
        {
            i8 = 1;
        } else
        {
            i8 = 0;
        }
        if (mbeanEnabled)
        {
            j8 = 1;
        } else
        {
            j8 = 0;
        }
        if (userStreamRepliesAllEnabled)
        {
            k8 = 1;
        } else
        {
            k8 = 0;
        }
        if (stallWarningsEnabled)
        {
            l8 = 1;
        } else
        {
            l8 = 0;
        }
        if (applicationOnlyAuthEnabled)
        {
            i9 = 1;
        } else
        {
            i9 = 0;
        }
        if (mediaProvider != null)
        {
            j9 = mediaProvider.hashCode();
        } else
        {
            j9 = 0;
        }
        if (mediaProviderAPIKey != null)
        {
            k9 = mediaProviderAPIKey.hashCode();
        } else
        {
            k9 = 0;
        }
        if (mediaProviderParameters != null)
        {
            l9 = mediaProviderParameters.hashCode();
        } else
        {
            l9 = 0;
        }
        if (clientVersion != null)
        {
            i10 = clientVersion.hashCode();
        } else
        {
            i10 = 0;
        }
        if (clientURL != null)
        {
            j10 = clientURL.hashCode();
        } else
        {
            j10 = 0;
        }
        if (IS_DALVIK)
        {
            k10 = 1;
        } else
        {
            k10 = 0;
        }
        if (!IS_GAE)
        {
            l10 = 0;
        }
        if (requestHeaders != null)
        {
            i11 = requestHeaders.hashCode();
        }
        return ((k10 + (j10 + (i10 + (l9 + (k9 + (j9 + (i9 + (l8 + (k8 + (j8 + (i8 + (l7 + (k7 + (j7 + (i7 + (((l6 + (k6 + (j6 + (i6 + (l5 + (k5 + (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (((((((((j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j11) * 31 + k11) * 31 + l11) * 31 + i12) * 31 + j12) * 31 + k12) * 31 + l12) * 31 + i13) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j13) * 31 + k13) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l10) * 31 + i11;
    }

    public boolean isApplicationOnlyAuthEnabled()
    {
        return applicationOnlyAuthEnabled;
    }

    public final boolean isDalvik()
    {
        return IS_DALVIK;
    }

    public final boolean isDebugEnabled()
    {
        return debug;
    }

    public boolean isGAE()
    {
        return IS_GAE;
    }

    public boolean isGZIPEnabled()
    {
        return gzipEnabled;
    }

    public boolean isIncludeEntitiesEnabled()
    {
        return includeEntitiesEnabled;
    }

    public boolean isIncludeMyRetweetEnabled()
    {
        return includeMyRetweetEnabled;
    }

    public boolean isIncludeRTsEnabled()
    {
        return includeRTsEnabled;
    }

    public boolean isJSONStoreEnabled()
    {
        return jsonStoreEnabled;
    }

    public boolean isMBeanEnabled()
    {
        return mbeanEnabled;
    }

    public boolean isPrettyDebugEnabled()
    {
        return prettyDebug;
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

    protected Object readResolve()
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

    protected final void setClientURL(String s)
    {
        clientURL = s;
        initRequestHeaders();
    }

    protected final void setClientVersion(String s)
    {
        clientVersion = s;
        initRequestHeaders();
    }

    protected final void setContributingTo(long l)
    {
        contributingTo = l;
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
        gzipEnabled = flag;
        initRequestHeaders();
    }

    protected final void setHttpConnectionTimeout(int i)
    {
        httpConnectionTimeout = i;
    }

    protected final void setHttpDefaultMaxPerRoute(int i)
    {
        defaultMaxPerRoute = i;
    }

    protected final void setHttpMaxTotalConnections(int i)
    {
        maxTotalConnections = i;
    }

    protected final void setHttpProxyHost(String s)
    {
        httpProxyHost = s;
    }

    protected final void setHttpProxyPassword(String s)
    {
        httpProxyPassword = s;
    }

    protected final void setHttpProxyPort(int i)
    {
        httpProxyPort = i;
    }

    protected final void setHttpProxyUser(String s)
    {
        httpProxyUser = s;
    }

    protected final void setHttpReadTimeout(int i)
    {
        httpReadTimeout = i;
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

    protected final void setIncludeEntitiesEnbled(boolean flag)
    {
        includeEntitiesEnabled = flag;
    }

    public void setIncludeMyRetweetEnabled(boolean flag)
    {
        includeMyRetweetEnabled = flag;
    }

    protected final void setIncludeRTsEnbled(boolean flag)
    {
        includeRTsEnabled = flag;
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
        fixRestBaseURL();
    }

    protected final void setOAuth2TokenType(String s)
    {
        oAuth2TokenType = s;
    }

    protected final void setOAuth2TokenURL(String s)
    {
        oAuth2TokenURL = s;
        fixRestBaseURL();
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
        fixRestBaseURL();
    }

    protected final void setOAuthAuthenticationURL(String s)
    {
        oAuthAuthenticationURL = s;
        fixRestBaseURL();
    }

    protected final void setOAuthAuthorizationURL(String s)
    {
        oAuthAuthorizationURL = s;
        fixRestBaseURL();
    }

    protected final void setOAuthConsumerKey(String s)
    {
        oAuthConsumerKey = s;
        fixRestBaseURL();
    }

    protected final void setOAuthConsumerSecret(String s)
    {
        oAuthConsumerSecret = s;
        fixRestBaseURL();
    }

    protected final void setOAuthRequestTokenURL(String s)
    {
        oAuthRequestTokenURL = s;
        fixRestBaseURL();
    }

    protected final void setPassword(String s)
    {
        password = s;
    }

    protected final void setPrettyDebugEnabled(boolean flag)
    {
        prettyDebug = flag;
    }

    protected final void setRestBaseURL(String s)
    {
        restBaseURL = s;
        fixRestBaseURL();
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

    protected final void setUseSSL(boolean flag)
    {
        useSSL = flag;
        fixRestBaseURL();
    }

    protected final void setUser(String s)
    {
        user = s;
    }

    protected final void setUserAgent(String s)
    {
        userAgent = s;
        initRequestHeaders();
    }

    protected final void setUserStreamBaseURL(String s)
    {
        userStreamBaseURL = s;
    }

    protected final void setUserStreamRepliesAllEnabled(boolean flag)
    {
        userStreamRepliesAllEnabled = flag;
    }

    public String toString()
    {
        return (new StringBuilder("ConfigurationBase{debug=")).append(debug).append(", userAgent='").append(userAgent).append('\'').append(", user='").append(user).append('\'').append(", password='").append(password).append('\'').append(", useSSL=").append(useSSL).append(", prettyDebug=").append(prettyDebug).append(", gzipEnabled=").append(gzipEnabled).append(", httpProxyHost='").append(httpProxyHost).append('\'').append(", httpProxyUser='").append(httpProxyUser).append('\'').append(", httpProxyPassword='").append(httpProxyPassword).append('\'').append(", httpProxyPort=").append(httpProxyPort).append(", httpConnectionTimeout=").append(httpConnectionTimeout).append(", httpReadTimeout=").append(httpReadTimeout).append(", httpStreamingReadTimeout=").append(httpStreamingReadTimeout).append(", httpRetryCount=").append(httpRetryCount).append(", httpRetryIntervalSeconds=").append(httpRetryIntervalSeconds).append(", maxTotalConnections=").append(maxTotalConnections).append(", defaultMaxPerRoute=").append(defaultMaxPerRoute).append(", oAuthConsumerKey='").append(oAuthConsumerKey).append('\'').append(", oAuthConsumerSecret='").append(oAuthConsumerSecret).append('\'').append(", oAuthAccessToken='").append(oAuthAccessToken).append('\'').append(", oAuthAccessTokenSecret='").append(oAuthAccessTokenSecret).append('\'').append(", oAuth2TokenType='").append(oAuth2TokenType).append('\'').append(", oAuth2AccessToken='").append(oAuth2AccessToken).append('\'').append(", oAuthRequestTokenURL='").append(oAuthRequestTokenURL).append('\'').append(", oAuthAuthorizationURL='").append(oAuthAuthorizationURL).append('\'').append(", oAuthAccessTokenURL='").append(oAuthAccessTokenURL).append('\'').append(", oAuthAuthenticationURL='").append(oAuthAuthenticationURL).append('\'').append(", oAuth2TokenURL='").append(oAuth2TokenURL).append('\'').append(", oAuth2InvalidateTokenURL='").append(oAuth2InvalidateTokenURL).append('\'').append(", restBaseURL='").append(restBaseURL).append('\'').append(", streamBaseURL='").append(streamBaseURL).append('\'').append(", userStreamBaseURL='").append(userStreamBaseURL).append('\'').append(", siteStreamBaseURL='").append(siteStreamBaseURL).append('\'').append(", dispatcherImpl='").append(dispatcherImpl).append('\'').append(", loggerFactory='").append(loggerFactory).append('\'').append(", asyncNumThreads=").append(asyncNumThreads).append(", contributingTo=").append(contributingTo).append(", includeRTsEnabled=").append(includeRTsEnabled).append(", includeEntitiesEnabled=").append(includeEntitiesEnabled).append(", includeMyRetweetEnabled=").append(includeMyRetweetEnabled).append(", trimUserEnabled=").append(trimUserEnabled).append(", jsonStoreEnabled=").append(jsonStoreEnabled).append(", mbeanEnabled=").append(mbeanEnabled).append(", userStreamRepliesAllEnabled=").append(userStreamRepliesAllEnabled).append(", stallWarningsEnabled=").append(stallWarningsEnabled).append(", applicationOnlyAuthEnabled=").append(applicationOnlyAuthEnabled).append(", mediaProvider='").append(mediaProvider).append('\'').append(", mediaProviderAPIKey='").append(mediaProviderAPIKey).append('\'').append(", mediaProviderParameters=").append(mediaProviderParameters).append(", clientVersion='").append(clientVersion).append('\'').append(", clientURL='").append(clientURL).append('\'').append(", IS_DALVIK=").append(IS_DALVIK).append(", IS_GAE=").append(IS_GAE).append(", requestHeaders=").append(requestHeaders).append('}').toString();
    }

    static 
    {
        try
        {
            Class.forName("dalvik.system.VMRuntime");
            dalvikDetected = "true";
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            dalvikDetected = "false";
        }
        try
        {
            Class.forName("com.google.appengine.api.urlfetch.URLFetchService");
            gaeDetected = "true";
        }
        catch (ClassNotFoundException classnotfoundexception1)
        {
            gaeDetected = "false";
        }
    }
}
