// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j.conf:
//            ConfigurationBase, Configuration

public final class PropertyConfiguration extends ConfigurationBase
    implements Serializable
{

    public static final String APPLICATION_ONLY_AUTH_ENABLED = "enableApplicationOnlyAuth";
    public static final String ASYNC_DISPATCHER_IMPL = "async.dispatcherImpl";
    public static final String ASYNC_NUM_THREADS = "async.numThreads";
    public static final String CLIENT_URL = "clientURL";
    public static final String CLIENT_VERSION = "clientVersion";
    public static final String CONTRIBUTING_TO = "contributingTo";
    public static final String DEBUG = "debug";
    public static final String HTTP_CONNECTION_TIMEOUT = "http.connectionTimeout";
    public static final String HTTP_DEFAULT_MAX_PER_ROUTE = "http.defaultMaxPerRoute";
    public static final String HTTP_GZIP = "http.gzip";
    public static final String HTTP_MAX_TOTAL_CONNECTIONS = "http.maxTotalConnections";
    public static final String HTTP_PRETTY_DEBUG = "http.prettyDebug";
    public static final String HTTP_PROXY_HOST = "http.proxyHost";
    public static final String HTTP_PROXY_HOST_FALLBACK = "http.proxyHost";
    public static final String HTTP_PROXY_PASSWORD = "http.proxyPassword";
    public static final String HTTP_PROXY_PORT = "http.proxyPort";
    public static final String HTTP_PROXY_PORT_FALLBACK = "http.proxyPort";
    public static final String HTTP_PROXY_USER = "http.proxyUser";
    public static final String HTTP_READ_TIMEOUT = "http.readTimeout";
    public static final String HTTP_RETRY_COUNT = "http.retryCount";
    public static final String HTTP_RETRY_INTERVAL_SECS = "http.retryIntervalSecs";
    public static final String HTTP_STREAMING_READ_TIMEOUT = "http.streamingReadTimeout";
    public static final String HTTP_USER_AGENT = "http.userAgent";
    public static final String HTTP_USE_SSL = "http.useSSL";
    public static final String INCLUDE_ENTITIES = "includeEntities";
    public static final String INCLUDE_MY_RETWEET = "includeMyRetweet";
    public static final String INCLUDE_RTS = "includeRTs";
    public static final String JSON_STORE_ENABLED = "jsonStoreEnabled";
    public static final String LOGGER_FACTORY = "loggerFactory";
    public static final String MBEAN_ENABLED = "mbeanEnabled";
    public static final String MEDIA_PROVIDER = "media.provider";
    public static final String MEDIA_PROVIDER_API_KEY = "media.providerAPIKey";
    public static final String MEDIA_PROVIDER_PARAMETERS = "media.providerParameters";
    public static final String OAUTH2_ACCESS_TOKEN = "oauth2.accessToken";
    public static final String OAUTH2_INVALIDATE_TOKEN_URL = "oauth2.invalidateTokenURL";
    public static final String OAUTH2_TOKEN_TYPE = "oauth2.tokenType";
    public static final String OAUTH2_TOKEN_URL = "oauth2.tokenURL";
    public static final String OAUTH_ACCESS_TOKEN = "oauth.accessToken";
    public static final String OAUTH_ACCESS_TOKEN_SECRET = "oauth.accessTokenSecret";
    public static final String OAUTH_ACCESS_TOKEN_URL = "oauth.accessTokenURL";
    public static final String OAUTH_AUTHENTICATION_URL = "oauth.authenticationURL";
    public static final String OAUTH_AUTHORIZATION_URL = "oauth.authorizationURL";
    public static final String OAUTH_CONSUMER_KEY = "oauth.consumerKey";
    public static final String OAUTH_CONSUMER_SECRET = "oauth.consumerSecret";
    public static final String OAUTH_REQUEST_TOKEN_URL = "oauth.requestTokenURL";
    public static final String PASSWORD = "password";
    public static final String REST_BASE_URL = "restBaseURL";
    public static final String SITE_STREAM_BASE_URL = "siteStreamBaseURL";
    public static final String STREAM_BASE_URL = "streamBaseURL";
    public static final String STREAM_STALL_WARNINGS_ENABLED = "stream.enableStallWarnings";
    public static final String STREAM_USER_REPLIES_ALL = "stream.user.repliesAll";
    public static final String USER = "user";
    public static final String USER_STREAM_BASE_URL = "userStreamBaseURL";
    private static final long serialVersionUID = 0x59a2240419f3c755L;

    PropertyConfiguration()
    {
        this("/");
    }

    public PropertyConfiguration(InputStream inputstream)
    {
        Properties properties = new Properties();
        loadProperties(properties, inputstream);
        setFieldsWithTreePath(properties, "/");
    }

    PropertyConfiguration(String s)
    {
        Object obj = (Properties)System.getProperties().clone();
        try
        {
            Map map = System.getenv();
            String s1;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((Properties) (obj)).setProperty(s1, (String)map.get(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        catch (SecurityException securityexception1) { }
        try
        {
            normalize(((Properties) (obj)));
        }
        catch (SecurityException securityexception)
        {
            securityexception = new Properties();
        }
        loadProperties(((Properties) (obj)), (new StringBuilder(".")).append(File.separatorChar).append("twitter4j.properties").toString());
        loadProperties(((Properties) (obj)), twitter4j/conf/Configuration.getResourceAsStream("/twitter4j.properties"));
        loadProperties(((Properties) (obj)), twitter4j/conf/Configuration.getResourceAsStream("/WEB-INF/twitter4j.properties"));
        try
        {
            loadProperties(((Properties) (obj)), new FileInputStream("WEB-INF/twitter4j.properties"));
        }
        catch (SecurityException securityexception2) { }
        catch (FileNotFoundException filenotfoundexception) { }
        setFieldsWithTreePath(((Properties) (obj)), s);
        return;
    }

    public PropertyConfiguration(Properties properties)
    {
        this(properties, "/");
    }

    public PropertyConfiguration(Properties properties, String s)
    {
        setFieldsWithTreePath(properties, s);
    }

    private boolean loadProperties(Properties properties, InputStream inputstream)
    {
        try
        {
            properties.load(inputstream);
            normalize(properties);
        }
        // Misplaced declaration of an exception variable
        catch (Properties properties)
        {
            return false;
        }
        return true;
    }

    private boolean loadProperties(Properties properties, String s)
    {
        Object obj = null;
        s = new File(s);
        if (!s.exists() || !s.isFile()) goto _L2; else goto _L1
_L1:
        s = new FileInputStream(s);
        properties.load(s);
        normalize(properties);
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (Properties properties) { }
        return true;
        properties;
        s = null;
_L6:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Properties properties) { }
        }
_L2:
        return false;
        properties;
        s = obj;
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw properties;
        properties;
        if (true) goto _L4; else goto _L3
_L3:
        properties;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void normalize(Properties properties)
    {
        Object obj1 = properties.keySet();
        Object obj = new ArrayList(10);
        obj1 = ((Set) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            String s1 = (String)((Iterator) (obj1)).next();
            if (-1 != s1.indexOf("twitter4j."))
            {
                ((ArrayList) (obj)).add(s1);
            }
        } while (true);
        String s;
        String s2;
        int i;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); properties.setProperty((new StringBuilder()).append(s.substring(0, i)).append(s.substring(i + 10)).toString(), s2))
        {
            s = (String)((Iterator) (obj)).next();
            s2 = properties.getProperty(s);
            i = s.indexOf("twitter4j.");
        }

    }

    private boolean notNull(Properties properties, String s, String s1)
    {
        return properties.getProperty((new StringBuilder()).append(s).append(s1).toString()) != null;
    }

    private void setFieldsWithPrefix(Properties properties, String s)
    {
        if (notNull(properties, s, "debug"))
        {
            setDebug(getBoolean(properties, s, "debug"));
        }
        if (notNull(properties, s, "user"))
        {
            setUser(getString(properties, s, "user"));
        }
        if (notNull(properties, s, "password"))
        {
            setPassword(getString(properties, s, "password"));
        }
        if (notNull(properties, s, "http.useSSL"))
        {
            setUseSSL(getBoolean(properties, s, "http.useSSL"));
        }
        if (notNull(properties, s, "http.prettyDebug"))
        {
            setPrettyDebugEnabled(getBoolean(properties, s, "http.prettyDebug"));
        }
        if (notNull(properties, s, "http.gzip"))
        {
            setGZIPEnabled(getBoolean(properties, s, "http.gzip"));
        }
        String as[];
        int i;
        int j;
        if (notNull(properties, s, "http.proxyHost"))
        {
            setHttpProxyHost(getString(properties, s, "http.proxyHost"));
            break MISSING_BLOCK_LABEL_161;
        } else
        {
            if (notNull(properties, s, "http.proxyHost"))
            {
                setHttpProxyHost(getString(properties, s, "http.proxyHost"));
            }
            continue;
        }
        do
        {
            if (notNull(properties, s, "http.proxyUser"))
            {
                setHttpProxyUser(getString(properties, s, "http.proxyUser"));
            }
            if (notNull(properties, s, "http.proxyPassword"))
            {
                setHttpProxyPassword(getString(properties, s, "http.proxyPassword"));
            }
            if (notNull(properties, s, "http.proxyPort"))
            {
                setHttpProxyPort(getIntProperty(properties, s, "http.proxyPort"));
            } else
            if (notNull(properties, s, "http.proxyPort"))
            {
                setHttpProxyPort(getIntProperty(properties, s, "http.proxyPort"));
            }
            if (notNull(properties, s, "http.connectionTimeout"))
            {
                setHttpConnectionTimeout(getIntProperty(properties, s, "http.connectionTimeout"));
            }
            if (notNull(properties, s, "http.readTimeout"))
            {
                setHttpReadTimeout(getIntProperty(properties, s, "http.readTimeout"));
            }
            if (notNull(properties, s, "http.streamingReadTimeout"))
            {
                setHttpStreamingReadTimeout(getIntProperty(properties, s, "http.streamingReadTimeout"));
            }
            if (notNull(properties, s, "http.retryCount"))
            {
                setHttpRetryCount(getIntProperty(properties, s, "http.retryCount"));
            }
            if (notNull(properties, s, "http.retryIntervalSecs"))
            {
                setHttpRetryIntervalSeconds(getIntProperty(properties, s, "http.retryIntervalSecs"));
            }
            if (notNull(properties, s, "http.maxTotalConnections"))
            {
                setHttpMaxTotalConnections(getIntProperty(properties, s, "http.maxTotalConnections"));
            }
            if (notNull(properties, s, "http.defaultMaxPerRoute"))
            {
                setHttpDefaultMaxPerRoute(getIntProperty(properties, s, "http.defaultMaxPerRoute"));
            }
            if (notNull(properties, s, "oauth.consumerKey"))
            {
                setOAuthConsumerKey(getString(properties, s, "oauth.consumerKey"));
            }
            if (notNull(properties, s, "oauth.consumerSecret"))
            {
                setOAuthConsumerSecret(getString(properties, s, "oauth.consumerSecret"));
            }
            if (notNull(properties, s, "oauth.accessToken"))
            {
                setOAuthAccessToken(getString(properties, s, "oauth.accessToken"));
            }
            if (notNull(properties, s, "oauth.accessTokenSecret"))
            {
                setOAuthAccessTokenSecret(getString(properties, s, "oauth.accessTokenSecret"));
            }
            if (notNull(properties, s, "oauth2.tokenType"))
            {
                setOAuth2TokenType(getString(properties, s, "oauth2.tokenType"));
            }
            if (notNull(properties, s, "oauth2.accessToken"))
            {
                setOAuth2AccessToken(getString(properties, s, "oauth2.accessToken"));
            }
            if (notNull(properties, s, "async.numThreads"))
            {
                setAsyncNumThreads(getIntProperty(properties, s, "async.numThreads"));
            }
            if (notNull(properties, s, "contributingTo"))
            {
                setContributingTo(getLongProperty(properties, s, "contributingTo"));
            }
            if (notNull(properties, s, "async.dispatcherImpl"))
            {
                setDispatcherImpl(getString(properties, s, "async.dispatcherImpl"));
            }
            if (notNull(properties, s, "clientVersion"))
            {
                setClientVersion(getString(properties, s, "clientVersion"));
            }
            if (notNull(properties, s, "clientURL"))
            {
                setClientURL(getString(properties, s, "clientURL"));
            }
            if (notNull(properties, s, "http.userAgent"))
            {
                setUserAgent(getString(properties, s, "http.userAgent"));
            }
            if (notNull(properties, s, "oauth.requestTokenURL"))
            {
                setOAuthRequestTokenURL(getString(properties, s, "oauth.requestTokenURL"));
            }
            if (notNull(properties, s, "oauth.authorizationURL"))
            {
                setOAuthAuthorizationURL(getString(properties, s, "oauth.authorizationURL"));
            }
            if (notNull(properties, s, "oauth.accessTokenURL"))
            {
                setOAuthAccessTokenURL(getString(properties, s, "oauth.accessTokenURL"));
            }
            if (notNull(properties, s, "oauth.authenticationURL"))
            {
                setOAuthAuthenticationURL(getString(properties, s, "oauth.authenticationURL"));
            }
            if (notNull(properties, s, "oauth2.tokenURL"))
            {
                setOAuth2TokenURL(getString(properties, s, "oauth2.tokenURL"));
            }
            if (notNull(properties, s, "oauth2.invalidateTokenURL"))
            {
                setOAuth2InvalidateTokenURL(getString(properties, s, "oauth2.invalidateTokenURL"));
            }
            if (notNull(properties, s, "restBaseURL"))
            {
                setRestBaseURL(getString(properties, s, "restBaseURL"));
            }
            if (notNull(properties, s, "streamBaseURL"))
            {
                setStreamBaseURL(getString(properties, s, "streamBaseURL"));
            }
            if (notNull(properties, s, "userStreamBaseURL"))
            {
                setUserStreamBaseURL(getString(properties, s, "userStreamBaseURL"));
            }
            if (notNull(properties, s, "siteStreamBaseURL"))
            {
                setSiteStreamBaseURL(getString(properties, s, "siteStreamBaseURL"));
            }
            if (notNull(properties, s, "includeRTs"))
            {
                setIncludeRTsEnbled(getBoolean(properties, s, "includeRTs"));
            }
            if (notNull(properties, s, "includeEntities"))
            {
                setIncludeEntitiesEnbled(getBoolean(properties, s, "includeEntities"));
            }
            if (notNull(properties, s, "includeMyRetweet"))
            {
                setIncludeMyRetweetEnabled(getBoolean(properties, s, "includeMyRetweet"));
            }
            if (notNull(properties, s, "loggerFactory"))
            {
                setLoggerFactory(getString(properties, s, "loggerFactory"));
            }
            if (notNull(properties, s, "jsonStoreEnabled"))
            {
                setJSONStoreEnabled(getBoolean(properties, s, "jsonStoreEnabled"));
            }
            if (notNull(properties, s, "mbeanEnabled"))
            {
                setMBeanEnabled(getBoolean(properties, s, "mbeanEnabled"));
            }
            if (notNull(properties, s, "stream.user.repliesAll"))
            {
                setUserStreamRepliesAllEnabled(getBoolean(properties, s, "stream.user.repliesAll"));
            }
            if (notNull(properties, s, "stream.enableStallWarnings"))
            {
                setStallWarningsEnabled(getBoolean(properties, s, "stream.enableStallWarnings"));
            }
            if (notNull(properties, s, "enableApplicationOnlyAuth"))
            {
                setApplicationOnlyAuthEnabled(getBoolean(properties, s, "enableApplicationOnlyAuth"));
            }
            if (notNull(properties, s, "media.provider"))
            {
                setMediaProvider(getString(properties, s, "media.provider"));
            }
            if (notNull(properties, s, "media.providerAPIKey"))
            {
                setMediaProviderAPIKey(getString(properties, s, "media.providerAPIKey"));
            }
            if (notNull(properties, s, "media.providerParameters"))
            {
                properties = z_T4JInternalStringUtil.split(getString(properties, s, "media.providerParameters"), "&");
                s = new Properties();
                j = properties.length;
                for (i = 0; i < j; i++)
                {
                    as = z_T4JInternalStringUtil.split(properties[i], "=");
                    s.setProperty(as[0], as[1]);
                }

                setMediaProviderParameters(s);
            }
            cacheInstance();
            return;
        } while (true);
    }

    private void setFieldsWithTreePath(Properties properties, String s)
    {
        setFieldsWithPrefix(properties, "");
        String as[] = z_T4JInternalStringUtil.split(s, "/");
        int j = as.length;
        s = null;
        int i = 0;
        while (i < j) 
        {
            String s2 = as[i];
            String s1 = s;
            if (!"".equals(s2))
            {
                if (s == null)
                {
                    s = (new StringBuilder()).append(s2).append(".").toString();
                } else
                {
                    s = (new StringBuilder()).append(s).append(s2).append(".").toString();
                }
                setFieldsWithPrefix(properties, s);
                s1 = s;
            }
            i++;
            s = s1;
        }
    }

    public final volatile void dumpConfiguration()
    {
        super.dumpConfiguration();
    }

    public final volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    protected final boolean getBoolean(Properties properties, String s, String s1)
    {
        return Boolean.valueOf(properties.getProperty((new StringBuilder()).append(s).append(s1).toString())).booleanValue();
    }

    public final volatile String getDispatcherImpl()
    {
        return super.getDispatcherImpl();
    }

    public final volatile int getHttpStreamingReadTimeout()
    {
        return super.getHttpStreamingReadTimeout();
    }

    protected final int getIntProperty(Properties properties, String s, String s1)
    {
        properties = properties.getProperty((new StringBuilder()).append(s).append(s1).toString());
        int i;
        try
        {
            i = Integer.parseInt(properties);
        }
        // Misplaced declaration of an exception variable
        catch (Properties properties)
        {
            return -1;
        }
        return i;
    }

    public final volatile String getLoggerFactory()
    {
        return super.getLoggerFactory();
    }

    protected final long getLongProperty(Properties properties, String s, String s1)
    {
        properties = properties.getProperty((new StringBuilder()).append(s).append(s1).toString());
        long l;
        try
        {
            l = Long.parseLong(properties);
        }
        // Misplaced declaration of an exception variable
        catch (Properties properties)
        {
            return -1L;
        }
        return l;
    }

    public final volatile String getMediaProvider()
    {
        return super.getMediaProvider();
    }

    public final volatile String getMediaProviderAPIKey()
    {
        return super.getMediaProviderAPIKey();
    }

    public final volatile Properties getMediaProviderParameters()
    {
        return super.getMediaProviderParameters();
    }

    public final volatile String getOAuth2AccessToken()
    {
        return super.getOAuth2AccessToken();
    }

    public final volatile String getOAuth2InvalidateTokenURL()
    {
        return super.getOAuth2InvalidateTokenURL();
    }

    public final volatile String getOAuth2TokenType()
    {
        return super.getOAuth2TokenType();
    }

    public final volatile String getOAuth2TokenURL()
    {
        return super.getOAuth2TokenURL();
    }

    public final volatile String getOAuthAccessToken()
    {
        return super.getOAuthAccessToken();
    }

    public final volatile String getOAuthAccessTokenSecret()
    {
        return super.getOAuthAccessTokenSecret();
    }

    public final volatile String getOAuthAccessTokenURL()
    {
        return super.getOAuthAccessTokenURL();
    }

    public final volatile String getOAuthAuthenticationURL()
    {
        return super.getOAuthAuthenticationURL();
    }

    public final volatile String getOAuthAuthorizationURL()
    {
        return super.getOAuthAuthorizationURL();
    }

    public final volatile String getOAuthRequestTokenURL()
    {
        return super.getOAuthRequestTokenURL();
    }

    public final volatile Map getRequestHeaders()
    {
        return super.getRequestHeaders();
    }

    public final volatile String getRestBaseURL()
    {
        return super.getRestBaseURL();
    }

    public final volatile String getSiteStreamBaseURL()
    {
        return super.getSiteStreamBaseURL();
    }

    public final volatile String getStreamBaseURL()
    {
        return super.getStreamBaseURL();
    }

    protected final String getString(Properties properties, String s, String s1)
    {
        return properties.getProperty((new StringBuilder()).append(s).append(s1).toString());
    }

    public final volatile String getUserStreamBaseURL()
    {
        return super.getUserStreamBaseURL();
    }

    public final volatile int hashCode()
    {
        return super.hashCode();
    }

    public final volatile boolean isApplicationOnlyAuthEnabled()
    {
        return super.isApplicationOnlyAuthEnabled();
    }

    public final volatile boolean isGAE()
    {
        return super.isGAE();
    }

    public final volatile boolean isGZIPEnabled()
    {
        return super.isGZIPEnabled();
    }

    public final volatile boolean isIncludeEntitiesEnabled()
    {
        return super.isIncludeEntitiesEnabled();
    }

    public final volatile boolean isIncludeMyRetweetEnabled()
    {
        return super.isIncludeMyRetweetEnabled();
    }

    public final volatile boolean isIncludeRTsEnabled()
    {
        return super.isIncludeRTsEnabled();
    }

    public final volatile boolean isJSONStoreEnabled()
    {
        return super.isJSONStoreEnabled();
    }

    public final volatile boolean isMBeanEnabled()
    {
        return super.isMBeanEnabled();
    }

    public final volatile boolean isPrettyDebugEnabled()
    {
        return super.isPrettyDebugEnabled();
    }

    public final volatile boolean isStallWarningsEnabled()
    {
        return super.isStallWarningsEnabled();
    }

    public final volatile boolean isTrimUserEnabled()
    {
        return super.isTrimUserEnabled();
    }

    public final volatile boolean isUserStreamRepliesAllEnabled()
    {
        return super.isUserStreamRepliesAllEnabled();
    }

    protected final Object readResolve()
    {
        return super.readResolve();
    }

    public final volatile void setIncludeMyRetweetEnabled(boolean flag)
    {
        super.setIncludeMyRetweetEnabled(flag);
    }

    public final volatile void setTrimUserEnabled(boolean flag)
    {
        super.setTrimUserEnabled(flag);
    }

    public final volatile String toString()
    {
        return super.toString();
    }
}
