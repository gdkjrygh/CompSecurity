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
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j.conf:
//            ConfigurationBase

public final class PropertyConfiguration extends ConfigurationBase
    implements Serializable
{

    public static final String ASYNC_DISPATCHER_IMPL = "async.dispatcherImpl";
    public static final String ASYNC_NUM_THREADS = "async.numThreads";
    public static final String CLIENT_URL = "clientURL";
    public static final String CLIENT_VERSION = "clientVersion";
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
    public static final String INCLUDE_RTS = "includeRTs";
    public static final String JSON_STORE_ENABLED = "jsonStoreEnabled";
    public static final String MBEAN_ENABLED = "mbeanEnabled";
    public static final String MEDIA_PROVIDER = "media.provider";
    public static final String MEDIA_PROVIDER_API_KEY = "media.providerAPIKey";
    public static final String MEDIA_PROVIDER_PARAMETERS = "media.providerParameters";
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
    public static final String SEARCH_BASE_URL = "searchBaseURL";
    public static final String SITE_STREAM_BASE_URL = "siteStreamBaseURL";
    public static final String STREAM_BASE_URL = "streamBaseURL";
    public static final String STREAM_USER_REPLIES_ALL = "stream.user.repliesAll";
    public static final String UPLOAD_BASE_URL = "uploadBaseURL";
    public static final String USER = "user";
    public static final String USER_STREAM_BASE_URL = "userStreamBaseURL";
    static Class class$twitter4j$conf$Configuration;
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
        Properties properties;
        Class class1;
        try
        {
            properties = (Properties)System.getProperties().clone();
            normalize(properties);
        }
        catch (SecurityException securityexception)
        {
            securityexception = new Properties();
        }
        loadProperties(properties, "." + File.separatorChar + "twitter4j.properties");
        if (class$twitter4j$conf$Configuration == null)
        {
            class1 = _mthclass$("twitter4j.conf.Configuration");
            class$twitter4j$conf$Configuration = class1;
        } else
        {
            class1 = class$twitter4j$conf$Configuration;
        }
        loadProperties(properties, class1.getResourceAsStream("/twitter4j.properties"));
        if (class$twitter4j$conf$Configuration == null)
        {
            class1 = _mthclass$("twitter4j.conf.Configuration");
            class$twitter4j$conf$Configuration = class1;
        } else
        {
            class1 = class$twitter4j$conf$Configuration;
        }
        loadProperties(properties, class1.getResourceAsStream("/WEB-INF/twitter4j.properties"));
        try
        {
            loadProperties(properties, new FileInputStream("WEB-INF/twitter4j.properties"));
        }
        catch (SecurityException securityexception1) { }
        catch (FileNotFoundException filenotfoundexception) { }
        setFieldsWithTreePath(properties, s);
    }

    public PropertyConfiguration(Properties properties)
    {
        this(properties, "/");
    }

    public PropertyConfiguration(Properties properties, String s)
    {
        setFieldsWithTreePath(properties, s);
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
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        s = new File(s);
        if (!s.exists() || !s.isFile())
        {
            break MISSING_BLOCK_LABEL_57;
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
            catch (Properties properties) { }
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
        s = obj1;
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
            break MISSING_BLOCK_LABEL_69;
        }
        properties;
        s = obj;
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
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); properties.setProperty(s.substring(0, i) + s.substring(i + 10), s2))
        {
            s = (String)((Iterator) (obj)).next();
            s2 = properties.getProperty(s);
            i = s.indexOf("twitter4j.");
        }

    }

    private boolean notNull(Properties properties, String s, String s1)
    {
        return properties.getProperty(s + s1) != null;
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
            if (notNull(properties, s, "async.numThreads"))
            {
                setAsyncNumThreads(getIntProperty(properties, s, "async.numThreads"));
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
            if (notNull(properties, s, "restBaseURL"))
            {
                setRestBaseURL(getString(properties, s, "restBaseURL"));
            }
            if (notNull(properties, s, "searchBaseURL"))
            {
                setSearchBaseURL(getString(properties, s, "searchBaseURL"));
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
            if (notNull(properties, s, "uploadBaseURL"))
            {
                setUploadBaseURL(getString(properties, s, "uploadBaseURL"));
            }
            if (notNull(properties, s, "includeRTs"))
            {
                setIncludeRTsEnbled(getBoolean(properties, s, "includeRTs"));
            }
            if (notNull(properties, s, "includeEntities"))
            {
                setIncludeEntitiesEnbled(getBoolean(properties, s, "includeEntities"));
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
        s = null;
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s2 = as[i];
            String s1 = s;
            if (!"".equals(s2))
            {
                if (s == null)
                {
                    s = s2 + ".";
                } else
                {
                    s = s + s2 + ".";
                }
                setFieldsWithPrefix(properties, s);
                s1 = s;
            }
            i++;
            s = s1;
        }
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    protected boolean getBoolean(Properties properties, String s, String s1)
    {
        return Boolean.valueOf(properties.getProperty(s + s1)).booleanValue();
    }

    public String getDispatcherImpl()
    {
        return super.getDispatcherImpl();
    }

    public int getHttpStreamingReadTimeout()
    {
        return super.getHttpStreamingReadTimeout();
    }

    protected int getIntProperty(Properties properties, String s, String s1)
    {
        properties = properties.getProperty(s + s1);
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

    public String getMediaProvider()
    {
        return super.getMediaProvider();
    }

    public String getMediaProviderAPIKey()
    {
        return super.getMediaProviderAPIKey();
    }

    public Properties getMediaProviderParameters()
    {
        return super.getMediaProviderParameters();
    }

    public String getOAuthAccessToken()
    {
        return super.getOAuthAccessToken();
    }

    public String getOAuthAccessTokenSecret()
    {
        return super.getOAuthAccessTokenSecret();
    }

    public String getOAuthAccessTokenURL()
    {
        return super.getOAuthAccessTokenURL();
    }

    public String getOAuthAuthenticationURL()
    {
        return super.getOAuthAuthenticationURL();
    }

    public String getOAuthAuthorizationURL()
    {
        return super.getOAuthAuthorizationURL();
    }

    public String getOAuthRequestTokenURL()
    {
        return super.getOAuthRequestTokenURL();
    }

    public Map getRequestHeaders()
    {
        return super.getRequestHeaders();
    }

    public String getRestBaseURL()
    {
        return super.getRestBaseURL();
    }

    public String getSearchBaseURL()
    {
        return super.getSearchBaseURL();
    }

    public String getSiteStreamBaseURL()
    {
        return super.getSiteStreamBaseURL();
    }

    public String getStreamBaseURL()
    {
        return super.getStreamBaseURL();
    }

    protected String getString(Properties properties, String s, String s1)
    {
        return properties.getProperty(s + s1);
    }

    public String getUploadBaseURL()
    {
        return super.getUploadBaseURL();
    }

    public String getUserStreamBaseURL()
    {
        return super.getUserStreamBaseURL();
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public boolean isGAE()
    {
        return super.isGAE();
    }

    public boolean isGZIPEnabled()
    {
        return super.isGZIPEnabled();
    }

    public boolean isIncludeEntitiesEnabled()
    {
        return super.isIncludeEntitiesEnabled();
    }

    public boolean isIncludeRTsEnabled()
    {
        return super.isIncludeRTsEnabled();
    }

    public boolean isJSONStoreEnabled()
    {
        return super.isJSONStoreEnabled();
    }

    public boolean isMBeanEnabled()
    {
        return super.isMBeanEnabled();
    }

    public boolean isPrettyDebugEnabled()
    {
        return super.isPrettyDebugEnabled();
    }

    public boolean isUserStreamRepliesAllEnabled()
    {
        return super.isUserStreamRepliesAllEnabled();
    }

    protected Object readResolve()
        throws ObjectStreamException
    {
        return super.readResolve();
    }

    public String toString()
    {
        return super.toString();
    }
}
