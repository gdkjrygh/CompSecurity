.class public final Ltwitter4j/conf/PropertyConfiguration;
.super Ltwitter4j/conf/ConfigurationBase;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final APPLICATION_ONLY_AUTH_ENABLED:Ljava/lang/String; = "enableApplicationOnlyAuth"

.field public static final ASYNC_DISPATCHER_IMPL:Ljava/lang/String; = "async.dispatcherImpl"

.field public static final ASYNC_NUM_THREADS:Ljava/lang/String; = "async.numThreads"

.field public static final CLIENT_URL:Ljava/lang/String; = "clientURL"

.field public static final CLIENT_VERSION:Ljava/lang/String; = "clientVersion"

.field public static final CONTRIBUTING_TO:Ljava/lang/String; = "contributingTo"

.field public static final DEBUG:Ljava/lang/String; = "debug"

.field public static final HTTP_CONNECTION_TIMEOUT:Ljava/lang/String; = "http.connectionTimeout"

.field public static final HTTP_DEFAULT_MAX_PER_ROUTE:Ljava/lang/String; = "http.defaultMaxPerRoute"

.field public static final HTTP_GZIP:Ljava/lang/String; = "http.gzip"

.field public static final HTTP_MAX_TOTAL_CONNECTIONS:Ljava/lang/String; = "http.maxTotalConnections"

.field public static final HTTP_PRETTY_DEBUG:Ljava/lang/String; = "http.prettyDebug"

.field public static final HTTP_PROXY_HOST:Ljava/lang/String; = "http.proxyHost"

.field public static final HTTP_PROXY_HOST_FALLBACK:Ljava/lang/String; = "http.proxyHost"

.field public static final HTTP_PROXY_PASSWORD:Ljava/lang/String; = "http.proxyPassword"

.field public static final HTTP_PROXY_PORT:Ljava/lang/String; = "http.proxyPort"

.field public static final HTTP_PROXY_PORT_FALLBACK:Ljava/lang/String; = "http.proxyPort"

.field public static final HTTP_PROXY_USER:Ljava/lang/String; = "http.proxyUser"

.field public static final HTTP_READ_TIMEOUT:Ljava/lang/String; = "http.readTimeout"

.field public static final HTTP_RETRY_COUNT:Ljava/lang/String; = "http.retryCount"

.field public static final HTTP_RETRY_INTERVAL_SECS:Ljava/lang/String; = "http.retryIntervalSecs"

.field public static final HTTP_STREAMING_READ_TIMEOUT:Ljava/lang/String; = "http.streamingReadTimeout"

.field public static final HTTP_USER_AGENT:Ljava/lang/String; = "http.userAgent"

.field public static final HTTP_USE_SSL:Ljava/lang/String; = "http.useSSL"

.field public static final INCLUDE_ENTITIES:Ljava/lang/String; = "includeEntities"

.field public static final INCLUDE_MY_RETWEET:Ljava/lang/String; = "includeMyRetweet"

.field public static final INCLUDE_RTS:Ljava/lang/String; = "includeRTs"

.field public static final JSON_STORE_ENABLED:Ljava/lang/String; = "jsonStoreEnabled"

.field public static final LOGGER_FACTORY:Ljava/lang/String; = "loggerFactory"

.field public static final MBEAN_ENABLED:Ljava/lang/String; = "mbeanEnabled"

.field public static final MEDIA_PROVIDER:Ljava/lang/String; = "media.provider"

.field public static final MEDIA_PROVIDER_API_KEY:Ljava/lang/String; = "media.providerAPIKey"

.field public static final MEDIA_PROVIDER_PARAMETERS:Ljava/lang/String; = "media.providerParameters"

.field public static final OAUTH2_ACCESS_TOKEN:Ljava/lang/String; = "oauth2.accessToken"

.field public static final OAUTH2_INVALIDATE_TOKEN_URL:Ljava/lang/String; = "oauth2.invalidateTokenURL"

.field public static final OAUTH2_TOKEN_TYPE:Ljava/lang/String; = "oauth2.tokenType"

.field public static final OAUTH2_TOKEN_URL:Ljava/lang/String; = "oauth2.tokenURL"

.field public static final OAUTH_ACCESS_TOKEN:Ljava/lang/String; = "oauth.accessToken"

.field public static final OAUTH_ACCESS_TOKEN_SECRET:Ljava/lang/String; = "oauth.accessTokenSecret"

.field public static final OAUTH_ACCESS_TOKEN_URL:Ljava/lang/String; = "oauth.accessTokenURL"

.field public static final OAUTH_AUTHENTICATION_URL:Ljava/lang/String; = "oauth.authenticationURL"

.field public static final OAUTH_AUTHORIZATION_URL:Ljava/lang/String; = "oauth.authorizationURL"

.field public static final OAUTH_CONSUMER_KEY:Ljava/lang/String; = "oauth.consumerKey"

.field public static final OAUTH_CONSUMER_SECRET:Ljava/lang/String; = "oauth.consumerSecret"

.field public static final OAUTH_REQUEST_TOKEN_URL:Ljava/lang/String; = "oauth.requestTokenURL"

.field public static final PASSWORD:Ljava/lang/String; = "password"

.field public static final REST_BASE_URL:Ljava/lang/String; = "restBaseURL"

.field public static final SITE_STREAM_BASE_URL:Ljava/lang/String; = "siteStreamBaseURL"

.field public static final STREAM_BASE_URL:Ljava/lang/String; = "streamBaseURL"

.field public static final STREAM_STALL_WARNINGS_ENABLED:Ljava/lang/String; = "stream.enableStallWarnings"

.field public static final STREAM_USER_REPLIES_ALL:Ljava/lang/String; = "stream.user.repliesAll"

.field public static final USER:Ljava/lang/String; = "user"

.field public static final USER_STREAM_BASE_URL:Ljava/lang/String; = "userStreamBaseURL"

.field private static final serialVersionUID:J = 0x59a2240419f3c755L


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 152
    const-string v0, "/"

    invoke-direct {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;-><init>(Ljava/lang/String;)V

    .line 153
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .prologue
    .line 99
    invoke-direct {p0}, Ltwitter4j/conf/ConfigurationBase;-><init>()V

    .line 100
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 101
    invoke-direct {p0, v0, p1}, Ltwitter4j/conf/PropertyConfiguration;->loadProperties(Ljava/util/Properties;Ljava/io/InputStream;)Z

    .line 102
    const-string v1, "/"

    invoke-direct {p0, v0, v1}, Ltwitter4j/conf/PropertyConfiguration;->setFieldsWithTreePath(Ljava/util/Properties;Ljava/lang/String;)V

    .line 103
    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 115
    invoke-direct {p0}, Ltwitter4j/conf/ConfigurationBase;-><init>()V

    .line 119
    :try_start_0
    invoke-static {}, Ljava/lang/System;->getProperties()Ljava/util/Properties;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Properties;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Properties;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 121
    :try_start_1
    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    move-result-object v3

    .line 122
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 123
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 126
    :cond_0
    :try_start_2
    invoke-direct {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->normalize(Ljava/util/Properties;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 133
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-char v2, Ljava/io/File;->separatorChar:C

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "twitter4j.properties"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ltwitter4j/conf/PropertyConfiguration;->loadProperties(Ljava/util/Properties;Ljava/lang/String;)Z

    .line 135
    const-class v1, Ltwitter4j/conf/Configuration;

    const-string v2, "/twitter4j.properties"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ltwitter4j/conf/PropertyConfiguration;->loadProperties(Ljava/util/Properties;Ljava/io/InputStream;)Z

    .line 137
    const-class v1, Ltwitter4j/conf/Configuration;

    const-string v2, "/WEB-INF/twitter4j.properties"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ltwitter4j/conf/PropertyConfiguration;->loadProperties(Ljava/util/Properties;Ljava/io/InputStream;)Z

    .line 140
    :try_start_3
    new-instance v1, Ljava/io/FileInputStream;

    const-string v2, "WEB-INF/twitter4j.properties"

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Ltwitter4j/conf/PropertyConfiguration;->loadProperties(Ljava/util/Properties;Ljava/io/InputStream;)Z
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    .line 145
    :goto_2
    invoke-direct {p0, v0, p1}, Ltwitter4j/conf/PropertyConfiguration;->setFieldsWithTreePath(Ljava/util/Properties;Ljava/lang/String;)V

    .line 146
    return-void

    .line 129
    :catch_1
    move-exception v0

    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_2

    .line 143
    :catch_3
    move-exception v1

    goto :goto_2
.end method

.method public constructor <init>(Ljava/util/Properties;)V
    .locals 1

    .prologue
    .line 106
    const-string v0, "/"

    invoke-direct {p0, p1, v0}, Ltwitter4j/conf/PropertyConfiguration;-><init>(Ljava/util/Properties;Ljava/lang/String;)V

    .line 107
    return-void
.end method

.method public constructor <init>(Ljava/util/Properties;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 110
    invoke-direct {p0}, Ltwitter4j/conf/ConfigurationBase;-><init>()V

    .line 111
    invoke-direct {p0, p1, p2}, Ltwitter4j/conf/PropertyConfiguration;->setFieldsWithTreePath(Ljava/util/Properties;Ljava/lang/String;)V

    .line 112
    return-void
.end method

.method private loadProperties(Ljava/util/Properties;Ljava/io/InputStream;)Z
    .locals 1

    .prologue
    .line 184
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 185
    invoke-direct {p0, p1}, Ltwitter4j/conf/PropertyConfiguration;->normalize(Ljava/util/Properties;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    const/4 v0, 0x1

    .line 189
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private loadProperties(Ljava/util/Properties;Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 160
    const/4 v1, 0x0

    .line 162
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 163
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 166
    invoke-direct {p0, p1}, Ltwitter4j/conf/PropertyConfiguration;->normalize(Ljava/util/Properties;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 177
    :goto_0
    const/4 v0, 0x1

    .line 179
    :goto_1
    return v0

    :catch_0
    move-exception v0

    move-object v0, v1

    .line 172
    :goto_2
    if-eqz v0, :cond_0

    .line 173
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 179
    :cond_0
    :goto_3
    const/4 v0, 0x0

    goto :goto_1

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    :goto_4
    if-eqz v1, :cond_1

    .line 173
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 177
    :cond_1
    :goto_5
    throw v0

    :catch_1
    move-exception v0

    goto :goto_0

    .line 178
    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_5

    .line 171
    :catchall_1
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_4

    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method private normalize(Ljava/util/Properties;)V
    .locals 6

    .prologue
    .line 193
    invoke-virtual {p1}, Ljava/util/Properties;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 194
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 196
    check-cast v0, Ljava/lang/String;

    .line 197
    const/4 v3, -0x1

    const-string v4, "twitter4j."

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-eq v3, v4, :cond_0

    .line 198
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 201
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 202
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 203
    const-string v3, "twitter4j."

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 204
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    add-int/lit8 v3, v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 205
    invoke-virtual {p1, v0, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_1

    .line 207
    :cond_2
    return-void
.end method

.method private notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private setFieldsWithPrefix(Ljava/util/Properties;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 235
    const-string v0, "debug"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    const-string v0, "debug"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setDebug(Z)V

    .line 239
    :cond_0
    const-string v0, "user"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    const-string v0, "user"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setUser(Ljava/lang/String;)V

    .line 242
    :cond_1
    const-string v0, "password"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 243
    const-string v0, "password"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setPassword(Ljava/lang/String;)V

    .line 245
    :cond_2
    const-string v0, "http.useSSL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 246
    const-string v0, "http.useSSL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setUseSSL(Z)V

    .line 248
    :cond_3
    const-string v0, "http.prettyDebug"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 249
    const-string v0, "http.prettyDebug"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setPrettyDebugEnabled(Z)V

    .line 251
    :cond_4
    const-string v0, "http.gzip"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 252
    const-string v0, "http.gzip"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setGZIPEnabled(Z)V

    .line 254
    :cond_5
    const-string v0, "http.proxyHost"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 255
    const-string v0, "http.proxyHost"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpProxyHost(Ljava/lang/String;)V

    .line 259
    :cond_6
    :goto_0
    const-string v0, "http.proxyUser"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 260
    const-string v0, "http.proxyUser"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpProxyUser(Ljava/lang/String;)V

    .line 262
    :cond_7
    const-string v0, "http.proxyPassword"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 263
    const-string v0, "http.proxyPassword"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpProxyPassword(Ljava/lang/String;)V

    .line 265
    :cond_8
    const-string v0, "http.proxyPort"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 266
    const-string v0, "http.proxyPort"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpProxyPort(I)V

    .line 270
    :cond_9
    :goto_1
    const-string v0, "http.connectionTimeout"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 271
    const-string v0, "http.connectionTimeout"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpConnectionTimeout(I)V

    .line 273
    :cond_a
    const-string v0, "http.readTimeout"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 274
    const-string v0, "http.readTimeout"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpReadTimeout(I)V

    .line 276
    :cond_b
    const-string v0, "http.streamingReadTimeout"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 277
    const-string v0, "http.streamingReadTimeout"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpStreamingReadTimeout(I)V

    .line 279
    :cond_c
    const-string v0, "http.retryCount"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 280
    const-string v0, "http.retryCount"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpRetryCount(I)V

    .line 282
    :cond_d
    const-string v0, "http.retryIntervalSecs"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 283
    const-string v0, "http.retryIntervalSecs"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpRetryIntervalSeconds(I)V

    .line 285
    :cond_e
    const-string v0, "http.maxTotalConnections"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 286
    const-string v0, "http.maxTotalConnections"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpMaxTotalConnections(I)V

    .line 288
    :cond_f
    const-string v0, "http.defaultMaxPerRoute"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 289
    const-string v0, "http.defaultMaxPerRoute"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpDefaultMaxPerRoute(I)V

    .line 291
    :cond_10
    const-string v0, "oauth.consumerKey"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 292
    const-string v0, "oauth.consumerKey"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthConsumerKey(Ljava/lang/String;)V

    .line 294
    :cond_11
    const-string v0, "oauth.consumerSecret"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 295
    const-string v0, "oauth.consumerSecret"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthConsumerSecret(Ljava/lang/String;)V

    .line 297
    :cond_12
    const-string v0, "oauth.accessToken"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 298
    const-string v0, "oauth.accessToken"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthAccessToken(Ljava/lang/String;)V

    .line 300
    :cond_13
    const-string v0, "oauth.accessTokenSecret"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 301
    const-string v0, "oauth.accessTokenSecret"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthAccessTokenSecret(Ljava/lang/String;)V

    .line 303
    :cond_14
    const-string v0, "oauth2.tokenType"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 304
    const-string v0, "oauth2.tokenType"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuth2TokenType(Ljava/lang/String;)V

    .line 306
    :cond_15
    const-string v0, "oauth2.accessToken"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 307
    const-string v0, "oauth2.accessToken"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuth2AccessToken(Ljava/lang/String;)V

    .line 309
    :cond_16
    const-string v0, "async.numThreads"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 310
    const-string v0, "async.numThreads"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setAsyncNumThreads(I)V

    .line 312
    :cond_17
    const-string v0, "contributingTo"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 313
    const-string v0, "contributingTo"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getLongProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ltwitter4j/conf/PropertyConfiguration;->setContributingTo(J)V

    .line 315
    :cond_18
    const-string v0, "async.dispatcherImpl"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 316
    const-string v0, "async.dispatcherImpl"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setDispatcherImpl(Ljava/lang/String;)V

    .line 318
    :cond_19
    const-string v0, "clientVersion"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 319
    const-string v0, "clientVersion"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setClientVersion(Ljava/lang/String;)V

    .line 321
    :cond_1a
    const-string v0, "clientURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 322
    const-string v0, "clientURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setClientURL(Ljava/lang/String;)V

    .line 324
    :cond_1b
    const-string v0, "http.userAgent"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 325
    const-string v0, "http.userAgent"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setUserAgent(Ljava/lang/String;)V

    .line 328
    :cond_1c
    const-string v0, "oauth.requestTokenURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 329
    const-string v0, "oauth.requestTokenURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthRequestTokenURL(Ljava/lang/String;)V

    .line 332
    :cond_1d
    const-string v0, "oauth.authorizationURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 333
    const-string v0, "oauth.authorizationURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthAuthorizationURL(Ljava/lang/String;)V

    .line 336
    :cond_1e
    const-string v0, "oauth.accessTokenURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 337
    const-string v0, "oauth.accessTokenURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthAccessTokenURL(Ljava/lang/String;)V

    .line 340
    :cond_1f
    const-string v0, "oauth.authenticationURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 341
    const-string v0, "oauth.authenticationURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuthAuthenticationURL(Ljava/lang/String;)V

    .line 344
    :cond_20
    const-string v0, "oauth2.tokenURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 345
    const-string v0, "oauth2.tokenURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuth2TokenURL(Ljava/lang/String;)V

    .line 348
    :cond_21
    const-string v0, "oauth2.invalidateTokenURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 349
    const-string v0, "oauth2.invalidateTokenURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setOAuth2InvalidateTokenURL(Ljava/lang/String;)V

    .line 352
    :cond_22
    const-string v0, "restBaseURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 353
    const-string v0, "restBaseURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setRestBaseURL(Ljava/lang/String;)V

    .line 356
    :cond_23
    const-string v0, "streamBaseURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 357
    const-string v0, "streamBaseURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setStreamBaseURL(Ljava/lang/String;)V

    .line 359
    :cond_24
    const-string v0, "userStreamBaseURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 360
    const-string v0, "userStreamBaseURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setUserStreamBaseURL(Ljava/lang/String;)V

    .line 362
    :cond_25
    const-string v0, "siteStreamBaseURL"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 363
    const-string v0, "siteStreamBaseURL"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setSiteStreamBaseURL(Ljava/lang/String;)V

    .line 365
    :cond_26
    const-string v0, "includeRTs"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 366
    const-string v0, "includeRTs"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setIncludeRTsEnbled(Z)V

    .line 368
    :cond_27
    const-string v0, "includeEntities"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 369
    const-string v0, "includeEntities"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setIncludeEntitiesEnbled(Z)V

    .line 371
    :cond_28
    const-string v0, "includeMyRetweet"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_29

    .line 372
    const-string v0, "includeMyRetweet"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setIncludeMyRetweetEnabled(Z)V

    .line 374
    :cond_29
    const-string v0, "loggerFactory"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 375
    const-string v0, "loggerFactory"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setLoggerFactory(Ljava/lang/String;)V

    .line 377
    :cond_2a
    const-string v0, "jsonStoreEnabled"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 378
    const-string v0, "jsonStoreEnabled"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setJSONStoreEnabled(Z)V

    .line 380
    :cond_2b
    const-string v0, "mbeanEnabled"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 381
    const-string v0, "mbeanEnabled"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setMBeanEnabled(Z)V

    .line 383
    :cond_2c
    const-string v0, "stream.user.repliesAll"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 384
    const-string v0, "stream.user.repliesAll"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setUserStreamRepliesAllEnabled(Z)V

    .line 386
    :cond_2d
    const-string v0, "stream.enableStallWarnings"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 387
    const-string v0, "stream.enableStallWarnings"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setStallWarningsEnabled(Z)V

    .line 389
    :cond_2e
    const-string v0, "enableApplicationOnlyAuth"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 390
    const-string v0, "enableApplicationOnlyAuth"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setApplicationOnlyAuthEnabled(Z)V

    .line 392
    :cond_2f
    const-string v0, "media.provider"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 393
    const-string v0, "media.provider"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setMediaProvider(Ljava/lang/String;)V

    .line 395
    :cond_30
    const-string v0, "media.providerAPIKey"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 396
    const-string v0, "media.providerAPIKey"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setMediaProviderAPIKey(Ljava/lang/String;)V

    .line 398
    :cond_31
    const-string v0, "media.providerParameters"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 399
    const-string v0, "media.providerParameters"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "&"

    invoke-static {v0, v2}, Ltwitter4j/internal/util/z_T4JInternalStringUtil;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 400
    new-instance v3, Ljava/util/Properties;

    invoke-direct {v3}, Ljava/util/Properties;-><init>()V

    .line 401
    array-length v4, v2

    move v0, v1

    :goto_2
    if-ge v0, v4, :cond_34

    aget-object v5, v2, v0

    .line 402
    const-string v6, "="

    invoke-static {v5, v6}, Ltwitter4j/internal/util/z_T4JInternalStringUtil;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 403
    aget-object v6, v5, v1

    const/4 v7, 0x1

    aget-object v5, v5, v7

    invoke-virtual {v3, v6, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 401
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 256
    :cond_32
    const-string v0, "http.proxyHost"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 257
    const-string v0, "http.proxyHost"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpProxyHost(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 267
    :cond_33
    const-string v0, "http.proxyPort"

    invoke-direct {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->notNull(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 268
    const-string v0, "http.proxyPort"

    invoke-virtual {p0, p1, p2, v0}, Ltwitter4j/conf/PropertyConfiguration;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/conf/PropertyConfiguration;->setHttpProxyPort(I)V

    goto/16 :goto_1

    .line 405
    :cond_34
    invoke-virtual {p0, v3}, Ltwitter4j/conf/PropertyConfiguration;->setMediaProviderParameters(Ljava/util/Properties;)V

    .line 407
    :cond_35
    invoke-virtual {p0}, Ltwitter4j/conf/PropertyConfiguration;->cacheInstance()V

    .line 408
    return-void
.end method

.method private setFieldsWithTreePath(Ljava/util/Properties;Ljava/lang/String;)V
    .locals 7

    .prologue
    .line 219
    const-string v0, ""

    invoke-direct {p0, p1, v0}, Ltwitter4j/conf/PropertyConfiguration;->setFieldsWithPrefix(Ljava/util/Properties;Ljava/lang/String;)V

    .line 220
    const-string v0, "/"

    invoke-static {p2, v0}, Ltwitter4j/internal/util/z_T4JInternalStringUtil;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 221
    const/4 v1, 0x0

    .line 222
    array-length v3, v2

    const/4 v0, 0x0

    move v6, v0

    move-object v0, v1

    move v1, v6

    :goto_0
    if-ge v1, v3, :cond_2

    aget-object v4, v2, v1

    .line 223
    const-string v5, ""

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 224
    if-nez v0, :cond_1

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "."

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 229
    :goto_1
    invoke-direct {p0, p1, v0}, Ltwitter4j/conf/PropertyConfiguration;->setFieldsWithPrefix(Ljava/util/Properties;Ljava/lang/String;)V

    .line 222
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 227
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "."

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 232
    :cond_2
    return-void
.end method


# virtual methods
.method public final bridge synthetic dumpConfiguration()V
    .locals 0

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->dumpConfiguration()V

    return-void
.end method

.method public final bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0, p1}, Ltwitter4j/conf/ConfigurationBase;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected final getBoolean(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 411
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 412
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic getDispatcherImpl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getDispatcherImpl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getHttpStreamingReadTimeout()I
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getHttpStreamingReadTimeout()I

    move-result v0

    return v0
.end method

.method protected final getIntProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 416
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 418
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 420
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final bridge synthetic getLoggerFactory()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getLoggerFactory()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final getLongProperty(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 425
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 427
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 429
    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public final bridge synthetic getMediaProvider()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getMediaProvider()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getMediaProviderAPIKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getMediaProviderAPIKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getMediaProviderParameters()Ljava/util/Properties;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getMediaProviderParameters()Ljava/util/Properties;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuth2AccessToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuth2AccessToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuth2InvalidateTokenURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuth2InvalidateTokenURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuth2TokenType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuth2TokenType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuth2TokenURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuth2TokenURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuthAccessToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuthAccessToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuthAccessTokenSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuthAccessTokenSecret()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuthAccessTokenURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuthAccessTokenURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuthAuthenticationURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuthAuthenticationURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuthAuthorizationURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuthAuthorizationURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOAuthRequestTokenURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getOAuthRequestTokenURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getRequestHeaders()Ljava/util/Map;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getRequestHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getRestBaseURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getRestBaseURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getSiteStreamBaseURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getSiteStreamBaseURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getStreamBaseURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getStreamBaseURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final getString(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 434
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getUserStreamBaseURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->getUserStreamBaseURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic hashCode()I
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->hashCode()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic isApplicationOnlyAuthEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isApplicationOnlyAuthEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isGAE()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isGAE()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isGZIPEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isGZIPEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isIncludeEntitiesEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isIncludeEntitiesEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isIncludeMyRetweetEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isIncludeMyRetweetEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isIncludeRTsEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isIncludeRTsEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isJSONStoreEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isJSONStoreEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isMBeanEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isMBeanEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isPrettyDebugEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isPrettyDebugEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isStallWarningsEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isStallWarningsEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isTrimUserEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isTrimUserEnabled()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic isUserStreamRepliesAllEnabled()Z
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->isUserStreamRepliesAllEnabled()Z

    move-result v0

    return v0
.end method

.method protected final readResolve()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 439
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->readResolve()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic setIncludeMyRetweetEnabled(Z)V
    .locals 0

    .prologue
    .line 30
    invoke-super {p0, p1}, Ltwitter4j/conf/ConfigurationBase;->setIncludeMyRetweetEnabled(Z)V

    return-void
.end method

.method public final bridge synthetic setTrimUserEnabled(Z)V
    .locals 0

    .prologue
    .line 30
    invoke-super {p0, p1}, Ltwitter4j/conf/ConfigurationBase;->setTrimUserEnabled(Z)V

    return-void
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Ltwitter4j/conf/ConfigurationBase;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
