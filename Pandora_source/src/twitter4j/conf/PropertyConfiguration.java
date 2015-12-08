// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import twitter4j.HttpClientConfiguration;

// Referenced classes of package twitter4j.conf:
//            ConfigurationBase, Configuration

public final class PropertyConfiguration extends ConfigurationBase
    implements Serializable
{

    private static final String APPLICATION_ONLY_AUTH_ENABLED = "enableApplicationOnlyAuth";
    private static final String ASYNC_DAEMON_ENABLED = "async.daemonEnabled";
    private static final String ASYNC_DISPATCHER_IMPL = "async.dispatcherImpl";
    private static final String ASYNC_NUM_THREADS = "async.numThreads";
    private static final String CONTRIBUTING_TO = "contributingTo";
    private static final String DEBUG = "debug";
    private static final String HTTP_CONNECTION_TIMEOUT = "http.connectionTimeout";
    private static final String HTTP_GZIP = "http.gzip";
    private static final String HTTP_PRETTY_DEBUG = "http.prettyDebug";
    private static final String HTTP_PROXY_HOST = "http.proxyHost";
    private static final String HTTP_PROXY_HOST_FALLBACK = "http.proxyHost";
    private static final String HTTP_PROXY_PASSWORD = "http.proxyPassword";
    private static final String HTTP_PROXY_PORT = "http.proxyPort";
    private static final String HTTP_PROXY_PORT_FALLBACK = "http.proxyPort";
    private static final String HTTP_PROXY_USER = "http.proxyUser";
    private static final String HTTP_READ_TIMEOUT = "http.readTimeout";
    private static final String HTTP_RETRY_COUNT = "http.retryCount";
    private static final String HTTP_RETRY_INTERVAL_SECS = "http.retryIntervalSecs";
    private static final String HTTP_STREAMING_READ_TIMEOUT = "http.streamingReadTimeout";
    private static final String INCLUDE_ENTITIES = "includeEntities";
    private static final String INCLUDE_MY_RETWEET = "includeMyRetweet";
    private static final String JSON_STORE_ENABLED = "jsonStoreEnabled";
    private static final String LOGGER_FACTORY = "loggerFactory";
    private static final String MBEAN_ENABLED = "mbeanEnabled";
    private static final String MEDIA_PROVIDER = "media.provider";
    private static final String MEDIA_PROVIDER_API_KEY = "media.providerAPIKey";
    private static final String MEDIA_PROVIDER_PARAMETERS = "media.providerParameters";
    private static final String OAUTH2_ACCESS_TOKEN = "oauth2.accessToken";
    private static final String OAUTH2_INVALIDATE_TOKEN_URL = "oauth2.invalidateTokenURL";
    private static final String OAUTH2_SCOPE = "oauth2.scope";
    private static final String OAUTH2_TOKEN_TYPE = "oauth2.tokenType";
    private static final String OAUTH2_TOKEN_URL = "oauth2.tokenURL";
    private static final String OAUTH_ACCESS_TOKEN = "oauth.accessToken";
    private static final String OAUTH_ACCESS_TOKEN_SECRET = "oauth.accessTokenSecret";
    private static final String OAUTH_ACCESS_TOKEN_URL = "oauth.accessTokenURL";
    private static final String OAUTH_AUTHENTICATION_URL = "oauth.authenticationURL";
    private static final String OAUTH_AUTHORIZATION_URL = "oauth.authorizationURL";
    private static final String OAUTH_CONSUMER_KEY = "oauth.consumerKey";
    private static final String OAUTH_CONSUMER_SECRET = "oauth.consumerSecret";
    private static final String OAUTH_REQUEST_TOKEN_URL = "oauth.requestTokenURL";
    private static final String PASSWORD = "password";
    private static final String REST_BASE_URL = "restBaseURL";
    private static final String SITE_STREAM_BASE_URL = "siteStreamBaseURL";
    private static final String STREAM_BASE_URL = "streamBaseURL";
    private static final String STREAM_STALL_WARNINGS_ENABLED = "stream.enableStallWarnings";
    private static final String STREAM_USER_REPLIES_ALL = "stream.user.repliesAll";
    private static final String STREAM_USER_WITH_FOLLOWINGS = "stream.user.withFollowings";
    private static final String USER = "user";
    private static final String USER_STREAM_BASE_URL = "userStreamBaseURL";
    private static final long serialVersionUID = 0x9b3601e9372c393cL;
    private String OAuth2Scope;

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
        loadProperties(((Properties) (obj)), (new StringBuilder()).append(".").append(File.separatorChar).append("twitter4j.properties").toString());
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
        if (!s.exists() || !s.isFile())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s = new FileInputStream(s);
        properties.load(s);
        normalize(properties);
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Properties properties)
            {
                return true;
            }
        }
        return true;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Properties properties) { }
        }
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
            catch (Properties properties) { }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        properties;
        s = null;
_L2:
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
        if (true) goto _L2; else goto _L1
_L1:
        properties;
        if (true) goto _L4; else goto _L3
_L3:
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
            break MISSING_BLOCK_LABEL_138;
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
            if (notNull(properties, s, "oauth2.scope"))
            {
                setOAuth2Scope(getString(properties, s, "oauth2.scope"));
            }
            if (notNull(properties, s, "async.numThreads"))
            {
                setAsyncNumThreads(getIntProperty(properties, s, "async.numThreads"));
            }
            if (notNull(properties, s, "async.daemonEnabled"))
            {
                setDaemonEnabled(getBoolean(properties, s, "async.daemonEnabled"));
            }
            if (notNull(properties, s, "contributingTo"))
            {
                setContributingTo(getLongProperty(properties, s, "contributingTo"));
            }
            if (notNull(properties, s, "async.dispatcherImpl"))
            {
                setDispatcherImpl(getString(properties, s, "async.dispatcherImpl"));
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
            if (notNull(properties, s, "includeMyRetweet"))
            {
                setIncludeMyRetweetEnabled(getBoolean(properties, s, "includeMyRetweet"));
            }
            if (notNull(properties, s, "includeEntities"))
            {
                setIncludeEntitiesEnabled(getBoolean(properties, s, "includeEntities"));
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
            if (notNull(properties, s, "stream.user.withFollowings"))
            {
                setUserStreamWithFollowingsEnabled(getBoolean(properties, s, "stream.user.withFollowings"));
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
                properties = getString(properties, s, "media.providerParameters").split("&");
                s = new Properties();
                j = properties.length;
                for (i = 0; i < j; i++)
                {
                    as = properties[i].split("=");
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
        String as[] = s.split("/");
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

    public volatile void dumpConfiguration()
    {
        super.dumpConfiguration();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    boolean getBoolean(Properties properties, String s, String s1)
    {
        return Boolean.valueOf(properties.getProperty((new StringBuilder()).append(s).append(s1).toString())).booleanValue();
    }

    public volatile String getDispatcherImpl()
    {
        return super.getDispatcherImpl();
    }

    public volatile HttpClientConfiguration getHttpClientConfiguration()
    {
        return super.getHttpClientConfiguration();
    }

    public volatile int getHttpStreamingReadTimeout()
    {
        return super.getHttpStreamingReadTimeout();
    }

    int getIntProperty(Properties properties, String s, String s1)
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

    public volatile String getLoggerFactory()
    {
        return super.getLoggerFactory();
    }

    long getLongProperty(Properties properties, String s, String s1)
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

    public volatile String getMediaProvider()
    {
        return super.getMediaProvider();
    }

    public volatile String getMediaProviderAPIKey()
    {
        return super.getMediaProviderAPIKey();
    }

    public volatile Properties getMediaProviderParameters()
    {
        return super.getMediaProviderParameters();
    }

    public volatile String getOAuth2AccessToken()
    {
        return super.getOAuth2AccessToken();
    }

    public volatile String getOAuth2InvalidateTokenURL()
    {
        return super.getOAuth2InvalidateTokenURL();
    }

    public volatile String getOAuth2Scope()
    {
        return super.getOAuth2Scope();
    }

    public volatile String getOAuth2TokenType()
    {
        return super.getOAuth2TokenType();
    }

    public volatile String getOAuth2TokenURL()
    {
        return super.getOAuth2TokenURL();
    }

    public volatile String getOAuthAccessToken()
    {
        return super.getOAuthAccessToken();
    }

    public volatile String getOAuthAccessTokenSecret()
    {
        return super.getOAuthAccessTokenSecret();
    }

    public volatile String getOAuthAccessTokenURL()
    {
        return super.getOAuthAccessTokenURL();
    }

    public volatile String getOAuthAuthenticationURL()
    {
        return super.getOAuthAuthenticationURL();
    }

    public volatile String getOAuthAuthorizationURL()
    {
        return super.getOAuthAuthorizationURL();
    }

    public volatile String getOAuthRequestTokenURL()
    {
        return super.getOAuthRequestTokenURL();
    }

    public volatile String getRestBaseURL()
    {
        return super.getRestBaseURL();
    }

    public volatile String getSiteStreamBaseURL()
    {
        return super.getSiteStreamBaseURL();
    }

    public volatile String getStreamBaseURL()
    {
        return super.getStreamBaseURL();
    }

    String getString(Properties properties, String s, String s1)
    {
        return properties.getProperty((new StringBuilder()).append(s).append(s1).toString());
    }

    public volatile String getUploadBaseURL()
    {
        return super.getUploadBaseURL();
    }

    public volatile String getUserStreamBaseURL()
    {
        return super.getUserStreamBaseURL();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isApplicationOnlyAuthEnabled()
    {
        return super.isApplicationOnlyAuthEnabled();
    }

    public volatile boolean isDaemonEnabled()
    {
        return super.isDaemonEnabled();
    }

    public volatile boolean isIncludeEntitiesEnabled()
    {
        return super.isIncludeEntitiesEnabled();
    }

    public volatile boolean isIncludeMyRetweetEnabled()
    {
        return super.isIncludeMyRetweetEnabled();
    }

    public volatile boolean isJSONStoreEnabled()
    {
        return super.isJSONStoreEnabled();
    }

    public volatile boolean isMBeanEnabled()
    {
        return super.isMBeanEnabled();
    }

    public volatile boolean isStallWarningsEnabled()
    {
        return super.isStallWarningsEnabled();
    }

    public volatile boolean isTrimUserEnabled()
    {
        return super.isTrimUserEnabled();
    }

    public volatile boolean isUserStreamRepliesAllEnabled()
    {
        return super.isUserStreamRepliesAllEnabled();
    }

    public volatile boolean isUserStreamWithFollowingsEnabled()
    {
        return super.isUserStreamWithFollowingsEnabled();
    }

    protected Object readResolve()
        throws ObjectStreamException
    {
        return super.readResolve();
    }

    public volatile void setIncludeMyRetweetEnabled(boolean flag)
    {
        super.setIncludeMyRetweetEnabled(flag);
    }

    public volatile void setTrimUserEnabled(boolean flag)
    {
        super.setTrimUserEnabled(flag);
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
