// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;

import java.io.Serializable;
import java.util.Properties;
import twitter4j.HttpClientConfiguration;
import twitter4j.auth.AuthorizationConfiguration;

public interface Configuration
    extends Serializable, AuthorizationConfiguration
{

    public abstract int getAsyncNumThreads();

    public abstract long getContributingTo();

    public abstract String getDispatcherImpl();

    public abstract HttpClientConfiguration getHttpClientConfiguration();

    public abstract int getHttpStreamingReadTimeout();

    public abstract String getLoggerFactory();

    public abstract String getMediaProvider();

    public abstract String getMediaProviderAPIKey();

    public abstract Properties getMediaProviderParameters();

    public abstract String getOAuth2AccessToken();

    public abstract String getOAuth2InvalidateTokenURL();

    public abstract String getOAuth2Scope();

    public abstract String getOAuth2TokenType();

    public abstract String getOAuth2TokenURL();

    public abstract String getOAuthAccessToken();

    public abstract String getOAuthAccessTokenSecret();

    public abstract String getOAuthAccessTokenURL();

    public abstract String getOAuthAuthenticationURL();

    public abstract String getOAuthAuthorizationURL();

    public abstract String getOAuthConsumerKey();

    public abstract String getOAuthConsumerSecret();

    public abstract String getOAuthRequestTokenURL();

    public abstract String getPassword();

    public abstract String getRestBaseURL();

    public abstract String getSiteStreamBaseURL();

    public abstract String getStreamBaseURL();

    public abstract String getUploadBaseURL();

    public abstract String getUser();

    public abstract String getUserStreamBaseURL();

    public abstract boolean isApplicationOnlyAuthEnabled();

    public abstract boolean isDaemonEnabled();

    public abstract boolean isDebugEnabled();

    public abstract boolean isIncludeEntitiesEnabled();

    public abstract boolean isIncludeMyRetweetEnabled();

    public abstract boolean isJSONStoreEnabled();

    public abstract boolean isMBeanEnabled();

    public abstract boolean isStallWarningsEnabled();

    public abstract boolean isTrimUserEnabled();

    public abstract boolean isUserStreamRepliesAllEnabled();

    public abstract boolean isUserStreamWithFollowingsEnabled();
}
