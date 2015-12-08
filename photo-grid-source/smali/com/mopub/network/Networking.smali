.class public Lcom/mopub/network/Networking;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/mopub/network/MoPubRequestQueue;

.field private static volatile b:Ljava/lang/String;

.field private static volatile c:Lcom/mopub/network/MaxWidthImageLoader;

.field public static sUseHttps:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mopub/network/Networking;->sUseHttps:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized clearForTesting()V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 153
    const-class v1, Lcom/mopub/network/Networking;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lcom/mopub/network/Networking;->a:Lcom/mopub/network/MoPubRequestQueue;

    .line 154
    const/4 v0, 0x0

    sput-object v0, Lcom/mopub/network/Networking;->c:Lcom/mopub/network/MaxWidthImageLoader;

    .line 155
    const/4 v0, 0x0

    sput-object v0, Lcom/mopub/network/Networking;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    monitor-exit v1

    return-void

    .line 153
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static getImageLoader(Landroid/content/Context;)Lcom/mopub/volley/toolbox/ImageLoader;
    .locals 5

    .prologue
    .line 81
    sget-object v0, Lcom/mopub/network/Networking;->c:Lcom/mopub/network/MaxWidthImageLoader;

    .line 83
    if-nez v0, :cond_1

    .line 84
    const-class v1, Lcom/mopub/network/Networking;

    monitor-enter v1

    .line 85
    :try_start_0
    sget-object v0, Lcom/mopub/network/Networking;->c:Lcom/mopub/network/MaxWidthImageLoader;

    .line 86
    if-nez v0, :cond_0

    .line 87
    invoke-static {p0}, Lcom/mopub/network/Networking;->getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v2

    .line 88
    invoke-static {p0}, Lcom/mopub/common/util/DeviceUtils;->memoryCacheSizeBytes(Landroid/content/Context;)I

    move-result v0

    .line 89
    new-instance v3, Lcom/mopub/network/e;

    invoke-direct {v3, v0}, Lcom/mopub/network/e;-><init>(I)V

    .line 99
    new-instance v0, Lcom/mopub/network/MaxWidthImageLoader;

    new-instance v4, Lcom/mopub/network/f;

    invoke-direct {v4, v3}, Lcom/mopub/network/f;-><init>(Landroid/support/v4/util/LruCache;)V

    invoke-direct {v0, v2, p0, v4}, Lcom/mopub/network/MaxWidthImageLoader;-><init>(Lcom/mopub/volley/RequestQueue;Landroid/content/Context;Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;)V

    .line 110
    sput-object v0, Lcom/mopub/network/Networking;->c:Lcom/mopub/network/MaxWidthImageLoader;

    .line 112
    :cond_0
    monitor-exit v1

    .line 114
    :cond_1
    return-object v0

    .line 112
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static getRequestQueue()Lcom/mopub/network/MoPubRequestQueue;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/mopub/network/Networking;->a:Lcom/mopub/network/MoPubRequestQueue;

    return-object v0
.end method

.method public static getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;
    .locals 6

    .prologue
    .line 50
    sget-object v0, Lcom/mopub/network/Networking;->a:Lcom/mopub/network/MoPubRequestQueue;

    .line 52
    if-nez v0, :cond_1

    .line 53
    const-class v1, Lcom/mopub/network/Networking;

    monitor-enter v1

    .line 54
    :try_start_0
    sget-object v0, Lcom/mopub/network/Networking;->a:Lcom/mopub/network/MoPubRequestQueue;

    .line 55
    if-nez v0, :cond_0

    .line 58
    invoke-static {p0}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object v0

    .line 59
    new-instance v2, Lcom/mopub/network/PlayServicesUrlRewriter;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p0}, Lcom/mopub/network/PlayServicesUrlRewriter;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 60
    const/16 v0, 0x2710

    invoke-static {v0}, Lcom/mopub/network/CustomSSLSocketFactory;->getDefault(I)Lcom/mopub/network/CustomSSLSocketFactory;

    move-result-object v0

    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/mopub/network/Networking;->getUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 63
    new-instance v4, Lcom/mopub/network/RequestQueueHttpStack;

    invoke-direct {v4, v3, v2, v0}, Lcom/mopub/network/RequestQueueHttpStack;-><init>(Ljava/lang/String;Lcom/mopub/volley/toolbox/HurlStack$UrlRewriter;Ljavax/net/ssl/SSLSocketFactory;)V

    .line 65
    new-instance v2, Lcom/mopub/volley/toolbox/BasicNetwork;

    invoke-direct {v2, v4}, Lcom/mopub/volley/toolbox/BasicNetwork;-><init>(Lcom/mopub/volley/toolbox/HttpStack;)V

    .line 66
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mopub-volley-cache"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 68
    new-instance v3, Lcom/mopub/volley/toolbox/DiskBasedCache;

    const-wide/32 v4, 0xa00000

    invoke-static {v0, v4, v5}, Lcom/mopub/common/util/DeviceUtils;->diskCacheSizeBytes(Ljava/io/File;J)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-direct {v3, v0, v4}, Lcom/mopub/volley/toolbox/DiskBasedCache;-><init>(Ljava/io/File;I)V

    .line 69
    new-instance v0, Lcom/mopub/network/MoPubRequestQueue;

    invoke-direct {v0, v3, v2}, Lcom/mopub/network/MoPubRequestQueue;-><init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;)V

    .line 70
    sput-object v0, Lcom/mopub/network/Networking;->a:Lcom/mopub/network/MoPubRequestQueue;

    .line 71
    invoke-virtual {v0}, Lcom/mopub/network/MoPubRequestQueue;->start()V

    .line 73
    :cond_0
    monitor-exit v1

    .line 76
    :cond_1
    return-object v0

    .line 73
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static getUserAgent(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 124
    invoke-static {p0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 126
    sget-object v0, Lcom/mopub/network/Networking;->b:Ljava/lang/String;

    .line 127
    if-nez v0, :cond_1

    .line 128
    const-class v1, Lcom/mopub/network/Networking;

    monitor-enter v1

    .line 129
    :try_start_0
    sget-object v0, Lcom/mopub/network/Networking;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    if-nez v0, :cond_0

    .line 133
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v0, v2, :cond_2

    .line 134
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 143
    :goto_0
    :try_start_2
    sput-object v0, Lcom/mopub/network/Networking;->b:Ljava/lang/String;

    .line 145
    :cond_0
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    :cond_1
    return-object v0

    .line 138
    :cond_2
    :try_start_3
    const-string v0, "http.agent"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 141
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0

    .line 145
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public static declared-synchronized setImageLoaderForTesting(Lcom/mopub/network/MaxWidthImageLoader;)V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 165
    const-class v0, Lcom/mopub/network/Networking;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/mopub/network/Networking;->c:Lcom/mopub/network/MaxWidthImageLoader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    monitor-exit v0

    return-void

    .line 165
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized setRequestQueueForTesting(Lcom/mopub/network/MoPubRequestQueue;)V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 160
    const-class v0, Lcom/mopub/network/Networking;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/mopub/network/Networking;->a:Lcom/mopub/network/MoPubRequestQueue;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    monitor-exit v0

    return-void

    .line 160
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized setUserAgentForTesting(Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 170
    const-class v0, Lcom/mopub/network/Networking;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/mopub/network/Networking;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    monitor-exit v0

    return-void

    .line 170
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static useHttps(Z)V
    .locals 0

    .prologue
    .line 177
    sput-boolean p0, Lcom/mopub/network/Networking;->sUseHttps:Z

    .line 178
    return-void
.end method

.method public static useHttps()Z
    .locals 1

    .prologue
    .line 181
    sget-boolean v0, Lcom/mopub/network/Networking;->sUseHttps:Z

    return v0
.end method
