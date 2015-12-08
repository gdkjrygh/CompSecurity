// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;

import java.util.Properties;

// Referenced classes of package twitter4j.conf:
//            PropertyConfiguration, ConfigurationBase, Configuration

public final class ConfigurationBuilder
{

    private ConfigurationBase configurationBean;

    public ConfigurationBuilder()
    {
        configurationBean = new PropertyConfiguration();
    }

    private void checkNotBuilt()
    {
        if (configurationBean == null)
        {
            throw new IllegalStateException("Cannot use this builder any longer, build() has already been called");
        } else
        {
            return;
        }
    }

    public final Configuration build()
    {
        checkNotBuilt();
        configurationBean.cacheInstance();
        ConfigurationBase configurationbase = configurationBean;
        configurationBean = null;
        return configurationbase;
        Exception exception;
        exception;
        configurationBean = null;
        throw exception;
    }

    public final ConfigurationBuilder setApplicationOnlyAuthEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setApplicationOnlyAuthEnabled(flag);
        return this;
    }

    public final ConfigurationBuilder setAsyncNumThreads(int i)
    {
        checkNotBuilt();
        configurationBean.setAsyncNumThreads(i);
        return this;
    }

    public final ConfigurationBuilder setClientURL(String s)
    {
        checkNotBuilt();
        configurationBean.setClientURL(s);
        return this;
    }

    public final ConfigurationBuilder setClientVersion(String s)
    {
        checkNotBuilt();
        configurationBean.setClientVersion(s);
        return this;
    }

    public final ConfigurationBuilder setContributingTo(long l)
    {
        checkNotBuilt();
        configurationBean.setContributingTo(l);
        return this;
    }

    public final ConfigurationBuilder setDebugEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setDebug(flag);
        return this;
    }

    public final ConfigurationBuilder setDispatcherImpl(String s)
    {
        checkNotBuilt();
        configurationBean.setDispatcherImpl(s);
        return this;
    }

    public final ConfigurationBuilder setGZIPEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setGZIPEnabled(flag);
        return this;
    }

    public final ConfigurationBuilder setHttpConnectionTimeout(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpConnectionTimeout(i);
        return this;
    }

    public final ConfigurationBuilder setHttpDefaultMaxPerRoute(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpDefaultMaxPerRoute(i);
        return this;
    }

    public final ConfigurationBuilder setHttpMaxTotalConnections(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpMaxTotalConnections(i);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyHost(String s)
    {
        checkNotBuilt();
        configurationBean.setHttpProxyHost(s);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyPassword(String s)
    {
        checkNotBuilt();
        configurationBean.setHttpProxyPassword(s);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyPort(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpProxyPort(i);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyUser(String s)
    {
        checkNotBuilt();
        configurationBean.setHttpProxyUser(s);
        return this;
    }

    public final ConfigurationBuilder setHttpReadTimeout(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpReadTimeout(i);
        return this;
    }

    public final ConfigurationBuilder setHttpRetryCount(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpRetryCount(i);
        return this;
    }

    public final ConfigurationBuilder setHttpRetryIntervalSeconds(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpRetryIntervalSeconds(i);
        return this;
    }

    public final ConfigurationBuilder setHttpStreamingReadTimeout(int i)
    {
        checkNotBuilt();
        configurationBean.setHttpStreamingReadTimeout(i);
        return this;
    }

    public final ConfigurationBuilder setIncludeEntitiesEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setIncludeEntitiesEnbled(flag);
        return this;
    }

    public final ConfigurationBuilder setIncludeMyRetweetEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setIncludeMyRetweetEnabled(flag);
        return this;
    }

    public final ConfigurationBuilder setIncludeRTsEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setIncludeRTsEnbled(flag);
        return this;
    }

    public final ConfigurationBuilder setJSONStoreEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setJSONStoreEnabled(flag);
        return this;
    }

    public final ConfigurationBuilder setMBeanEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setMBeanEnabled(flag);
        return this;
    }

    public final ConfigurationBuilder setMediaProvider(String s)
    {
        checkNotBuilt();
        configurationBean.setMediaProvider(s);
        return this;
    }

    public final ConfigurationBuilder setMediaProviderAPIKey(String s)
    {
        checkNotBuilt();
        configurationBean.setMediaProviderAPIKey(s);
        return this;
    }

    public final ConfigurationBuilder setMediaProviderParameters(Properties properties)
    {
        checkNotBuilt();
        configurationBean.setMediaProviderParameters(properties);
        return this;
    }

    public final ConfigurationBuilder setOAuth2AccessToken(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuth2AccessToken(s);
        return this;
    }

    public final ConfigurationBuilder setOAuth2InvalidateTokenURL(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuth2InvalidateTokenURL(s);
        return this;
    }

    public final ConfigurationBuilder setOAuth2TokenType(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuth2TokenType(s);
        return this;
    }

    public final ConfigurationBuilder setOAuth2TokenURL(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuth2TokenURL(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthAccessToken(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthAccessToken(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthAccessTokenSecret(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthAccessTokenSecret(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthAccessTokenURL(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthAccessTokenURL(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthAuthenticationURL(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthAuthenticationURL(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthAuthorizationURL(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthAuthorizationURL(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthConsumerKey(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthConsumerKey(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthConsumerSecret(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthConsumerSecret(s);
        return this;
    }

    public final ConfigurationBuilder setOAuthRequestTokenURL(String s)
    {
        checkNotBuilt();
        configurationBean.setOAuthRequestTokenURL(s);
        return this;
    }

    public final ConfigurationBuilder setPassword(String s)
    {
        checkNotBuilt();
        configurationBean.setPassword(s);
        return this;
    }

    public final ConfigurationBuilder setPrettyDebugEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setPrettyDebugEnabled(flag);
        return this;
    }

    public final ConfigurationBuilder setRestBaseURL(String s)
    {
        checkNotBuilt();
        configurationBean.setRestBaseURL(s);
        return this;
    }

    public final ConfigurationBuilder setSiteStreamBaseURL(String s)
    {
        checkNotBuilt();
        configurationBean.setSiteStreamBaseURL(s);
        return this;
    }

    public final ConfigurationBuilder setStreamBaseURL(String s)
    {
        checkNotBuilt();
        configurationBean.setStreamBaseURL(s);
        return this;
    }

    public final ConfigurationBuilder setTrimUserEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setTrimUserEnabled(flag);
        return this;
    }

    public final ConfigurationBuilder setUseSSL(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setUseSSL(flag);
        return this;
    }

    public final ConfigurationBuilder setUser(String s)
    {
        checkNotBuilt();
        configurationBean.setUser(s);
        return this;
    }

    public final ConfigurationBuilder setUserStreamBaseURL(String s)
    {
        checkNotBuilt();
        configurationBean.setUserStreamBaseURL(s);
        return this;
    }

    public final ConfigurationBuilder setUserStreamRepliesAllEnabled(boolean flag)
    {
        checkNotBuilt();
        configurationBean.setUserStreamRepliesAllEnabled(flag);
        return this;
    }
}
