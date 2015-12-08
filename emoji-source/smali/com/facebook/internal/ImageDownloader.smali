.class public Lcom/facebook/internal/ImageDownloader;
.super Ljava/lang/Object;
.source "ImageDownloader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;,
        Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;,
        Lcom/facebook/internal/ImageDownloader$DownloaderContext;,
        Lcom/facebook/internal/ImageDownloader$RequestKey;
    }
.end annotation


# static fields
.field private static final CACHE_READ_QUEUE_MAX_CONCURRENT:I = 0x2

.field private static final DOWNLOAD_QUEUE_MAX_CONCURRENT:I = 0x8

.field private static cacheReadQueue:Lcom/facebook/internal/WorkQueue;

.field private static downloadQueue:Lcom/facebook/internal/WorkQueue;

.field private static handler:Landroid/os/Handler;

.field private static final pendingRequests:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/internal/ImageDownloader$RequestKey;",
            "Lcom/facebook/internal/ImageDownloader$DownloaderContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 41
    new-instance v0, Lcom/facebook/internal/WorkQueue;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lcom/facebook/internal/WorkQueue;-><init>(I)V

    sput-object v0, Lcom/facebook/internal/ImageDownloader;->downloadQueue:Lcom/facebook/internal/WorkQueue;

    .line 42
    new-instance v0, Lcom/facebook/internal/WorkQueue;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/facebook/internal/WorkQueue;-><init>(I)V

    sput-object v0, Lcom/facebook/internal/ImageDownloader;->cacheReadQueue:Lcom/facebook/internal/WorkQueue;

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 351
    return-void
.end method

.method static synthetic access$100(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;Z)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/ImageDownloader$RequestKey;
    .param p1, "x1"    # Landroid/content/Context;
    .param p2, "x2"    # Z

    .prologue
    .line 37
    invoke-static {p0, p1, p2}, Lcom/facebook/internal/ImageDownloader;->readFromCache(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;Z)V

    return-void
.end method

.method static synthetic access$200(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/ImageDownloader$RequestKey;
    .param p1, "x1"    # Landroid/content/Context;

    .prologue
    .line 37
    invoke-static {p0, p1}, Lcom/facebook/internal/ImageDownloader;->download(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;)V

    return-void
.end method

.method public static cancelRequest(Lcom/facebook/internal/ImageRequest;)Z
    .locals 5
    .param p0, "request"    # Lcom/facebook/internal/ImageRequest;

    .prologue
    .line 75
    const/4 v0, 0x0

    .line 76
    .local v0, "cancelled":Z
    new-instance v2, Lcom/facebook/internal/ImageDownloader$RequestKey;

    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getImageUri()Ljava/net/URI;

    move-result-object v3

    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getCallerTag()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/facebook/internal/ImageDownloader$RequestKey;-><init>(Ljava/net/URI;Ljava/lang/Object;)V

    .line 77
    .local v2, "key":Lcom/facebook/internal/ImageDownloader$RequestKey;
    sget-object v4, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    monitor-enter v4

    .line 78
    :try_start_0
    sget-object v3, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    .line 79
    .local v1, "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    if-eqz v1, :cond_0

    .line 83
    const/4 v0, 0x1

    .line 85
    iget-object v3, v1, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->workItem:Lcom/facebook/internal/WorkQueue$WorkItem;

    invoke-interface {v3}, Lcom/facebook/internal/WorkQueue$WorkItem;->cancel()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 86
    sget-object v3, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    :cond_0
    :goto_0
    monitor-exit v4

    .line 95
    return v0

    .line 90
    :cond_1
    const/4 v3, 0x1

    iput-boolean v3, v1, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->isCancelled:Z

    goto :goto_0

    .line 93
    .end local v1    # "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public static clearCache(Landroid/content/Context;)V
    .locals 0
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 109
    invoke-static {p0}, Lcom/facebook/internal/ImageResponseCache;->clearCache(Landroid/content/Context;)V

    .line 110
    invoke-static {p0}, Lcom/facebook/internal/UrlRedirectCache;->clearCache(Landroid/content/Context;)V

    .line 111
    return-void
.end method

.method private static download(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;)V
    .locals 19
    .param p0, "key"    # Lcom/facebook/internal/ImageDownloader$RequestKey;
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 208
    const/4 v5, 0x0

    .line 209
    .local v5, "connection":Ljava/net/HttpURLConnection;
    const/4 v14, 0x0

    .line 210
    .local v14, "stream":Ljava/io/InputStream;
    const/4 v8, 0x0

    .line 211
    .local v8, "error":Ljava/lang/Exception;
    const/4 v2, 0x0

    .line 212
    .local v2, "bitmap":Landroid/graphics/Bitmap;
    const/4 v10, 0x1

    .line 215
    .local v10, "issueResponse":Z
    :try_start_0
    new-instance v15, Ljava/net/URL;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/internal/ImageDownloader$RequestKey;->uri:Ljava/net/URI;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 216
    .local v15, "url":Ljava/net/URL;
    invoke-virtual {v15}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v16

    move-object/from16 v0, v16

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v5, v0

    .line 217
    const/16 v16, 0x0

    move/from16 v0, v16

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 219
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v16

    sparse-switch v16, :sswitch_data_0

    .line 249
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v14

    .line 250
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .local v9, "errorMessageBuilder":Ljava/lang/StringBuilder;
    if-eqz v14, :cond_3

    .line 252
    new-instance v11, Ljava/io/InputStreamReader;

    invoke-direct {v11, v14}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 253
    .local v11, "reader":Ljava/io/InputStreamReader;
    const/16 v16, 0x80

    move/from16 v0, v16

    new-array v3, v0, [C

    .line 255
    .local v3, "buffer":[C
    :goto_0
    const/16 v16, 0x0

    array-length v0, v3

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v11, v3, v0, v1}, Ljava/io/InputStreamReader;->read([CII)I

    move-result v4

    .local v4, "bufferLength":I
    if-lez v4, :cond_2

    .line 256
    const/16 v16, 0x0

    move/from16 v0, v16

    invoke-virtual {v9, v3, v0, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 266
    .end local v3    # "buffer":[C
    .end local v4    # "bufferLength":I
    .end local v8    # "error":Ljava/lang/Exception;
    .end local v9    # "errorMessageBuilder":Ljava/lang/StringBuilder;
    .end local v11    # "reader":Ljava/io/InputStreamReader;
    .end local v15    # "url":Ljava/net/URL;
    :catch_0
    move-exception v7

    .line 267
    .local v7, "e":Ljava/io/IOException;
    move-object v8, v7

    .line 271
    .restart local v8    # "error":Ljava/lang/Exception;
    invoke-static {v14}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 272
    invoke-static {v5}, Lcom/facebook/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V

    .line 275
    .end local v7    # "e":Ljava/io/IOException;
    :goto_1
    if-eqz v10, :cond_0

    .line 276
    const/16 v16, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-static {v0, v8, v2, v1}, Lcom/facebook/internal/ImageDownloader;->issueResponse(Lcom/facebook/internal/ImageDownloader$RequestKey;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V

    .line 278
    :cond_0
    return-void

    .line 223
    .restart local v15    # "url":Ljava/net/URL;
    :sswitch_0
    const/4 v10, 0x0

    .line 225
    :try_start_1
    const-string v16, "location"

    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 226
    .local v12, "redirectLocation":Ljava/lang/String;
    invoke-static {v12}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v16

    if-nez v16, :cond_1

    .line 227
    new-instance v13, Ljava/net/URI;

    invoke-direct {v13, v12}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 228
    .local v13, "redirectUri":Ljava/net/URI;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/internal/ImageDownloader$RequestKey;->uri:Ljava/net/URI;

    move-object/from16 v16, v0

    move-object/from16 v0, p1

    move-object/from16 v1, v16

    invoke-static {v0, v1, v13}, Lcom/facebook/internal/UrlRedirectCache;->cacheUriRedirect(Landroid/content/Context;Ljava/net/URI;Ljava/net/URI;)V

    .line 232
    invoke-static/range {p0 .. p0}, Lcom/facebook/internal/ImageDownloader;->removePendingRequest(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    move-result-object v6

    .line 233
    .local v6, "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    if-eqz v6, :cond_1

    iget-boolean v0, v6, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->isCancelled:Z

    move/from16 v16, v0

    if-nez v16, :cond_1

    .line 234
    iget-object v0, v6, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->request:Lcom/facebook/internal/ImageRequest;

    move-object/from16 v16, v0

    new-instance v17, Lcom/facebook/internal/ImageDownloader$RequestKey;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/internal/ImageDownloader$RequestKey;->tag:Ljava/lang/Object;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v0, v13, v1}, Lcom/facebook/internal/ImageDownloader$RequestKey;-><init>(Ljava/net/URI;Ljava/lang/Object;)V

    const/16 v18, 0x0

    invoke-static/range {v16 .. v18}, Lcom/facebook/internal/ImageDownloader;->enqueueCacheRead(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 271
    .end local v6    # "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    .end local v12    # "redirectLocation":Ljava/lang/String;
    .end local v13    # "redirectUri":Ljava/net/URI;
    :cond_1
    :goto_2
    invoke-static {v14}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 272
    invoke-static {v5}, Lcom/facebook/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V

    goto :goto_1

    .line 244
    :sswitch_1
    :try_start_2
    move-object/from16 v0, p1

    invoke-static {v0, v5}, Lcom/facebook/internal/ImageResponseCache;->interceptAndCacheImageStream(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v14

    .line 245
    invoke-static {v14}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 246
    goto :goto_2

    .line 258
    .restart local v3    # "buffer":[C
    .restart local v4    # "bufferLength":I
    .restart local v9    # "errorMessageBuilder":Ljava/lang/StringBuilder;
    .restart local v11    # "reader":Ljava/io/InputStreamReader;
    :cond_2
    invoke-static {v11}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 263
    .end local v3    # "buffer":[C
    .end local v4    # "bufferLength":I
    .end local v11    # "reader":Ljava/io/InputStreamReader;
    :goto_3
    new-instance v8, Lcom/facebook/FacebookException;

    .end local v8    # "error":Ljava/lang/Exception;
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-direct {v8, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .restart local v8    # "error":Ljava/lang/Exception;
    goto :goto_2

    .line 260
    :cond_3
    sget v16, Lcom/facebook/android/R$string;->com_facebook_image_download_unknown_error:I

    .line 261
    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 260
    move-object/from16 v0, v16

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 268
    .end local v8    # "error":Ljava/lang/Exception;
    .end local v9    # "errorMessageBuilder":Ljava/lang/StringBuilder;
    .end local v15    # "url":Ljava/net/URL;
    :catch_1
    move-exception v7

    .line 269
    .local v7, "e":Ljava/net/URISyntaxException;
    move-object v8, v7

    .line 271
    .restart local v8    # "error":Ljava/lang/Exception;
    invoke-static {v14}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 272
    invoke-static {v5}, Lcom/facebook/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V

    goto/16 :goto_1

    .line 271
    .end local v7    # "e":Ljava/net/URISyntaxException;
    .end local v8    # "error":Ljava/lang/Exception;
    :catchall_0
    move-exception v16

    invoke-static {v14}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 272
    invoke-static {v5}, Lcom/facebook/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V

    throw v16

    .line 219
    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_1
        0x12d -> :sswitch_0
        0x12e -> :sswitch_0
    .end sparse-switch
.end method

.method public static downloadAsync(Lcom/facebook/internal/ImageRequest;)V
    .locals 4
    .param p0, "request"    # Lcom/facebook/internal/ImageRequest;

    .prologue
    .line 52
    if-nez p0, :cond_0

    .line 72
    :goto_0
    return-void

    .line 61
    :cond_0
    new-instance v1, Lcom/facebook/internal/ImageDownloader$RequestKey;

    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getImageUri()Ljava/net/URI;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getCallerTag()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/internal/ImageDownloader$RequestKey;-><init>(Ljava/net/URI;Ljava/lang/Object;)V

    .line 62
    .local v1, "key":Lcom/facebook/internal/ImageDownloader$RequestKey;
    sget-object v3, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    monitor-enter v3

    .line 63
    :try_start_0
    sget-object v2, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    .line 64
    .local v0, "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    if-eqz v0, :cond_1

    .line 65
    iput-object p0, v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->request:Lcom/facebook/internal/ImageRequest;

    .line 66
    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->isCancelled:Z

    .line 67
    iget-object v2, v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->workItem:Lcom/facebook/internal/WorkQueue$WorkItem;

    invoke-interface {v2}, Lcom/facebook/internal/WorkQueue$WorkItem;->moveToFront()V

    .line 71
    :goto_1
    monitor-exit v3

    goto :goto_0

    .end local v0    # "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    .line 69
    .restart local v0    # "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->isCachedRedirectAllowed()Z

    move-result v2

    invoke-static {p0, v1, v2}, Lcom/facebook/internal/ImageDownloader;->enqueueCacheRead(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method private static enqueueCacheRead(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V
    .locals 3
    .param p0, "request"    # Lcom/facebook/internal/ImageRequest;
    .param p1, "key"    # Lcom/facebook/internal/ImageDownloader$RequestKey;
    .param p2, "allowCachedRedirects"    # Z

    .prologue
    .line 114
    sget-object v0, Lcom/facebook/internal/ImageDownloader;->cacheReadQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v1, Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;

    .line 118
    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p1, p2}, Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;-><init>(Landroid/content/Context;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V

    .line 114
    invoke-static {p0, p1, v0, v1}, Lcom/facebook/internal/ImageDownloader;->enqueueRequest(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Lcom/facebook/internal/WorkQueue;Ljava/lang/Runnable;)V

    .line 119
    return-void
.end method

.method private static enqueueDownload(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;)V
    .locals 3
    .param p0, "request"    # Lcom/facebook/internal/ImageRequest;
    .param p1, "key"    # Lcom/facebook/internal/ImageDownloader$RequestKey;

    .prologue
    .line 122
    sget-object v0, Lcom/facebook/internal/ImageDownloader;->downloadQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v1, Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;

    .line 126
    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;-><init>(Landroid/content/Context;Lcom/facebook/internal/ImageDownloader$RequestKey;)V

    .line 122
    invoke-static {p0, p1, v0, v1}, Lcom/facebook/internal/ImageDownloader;->enqueueRequest(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Lcom/facebook/internal/WorkQueue;Ljava/lang/Runnable;)V

    .line 127
    return-void
.end method

.method private static enqueueRequest(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Lcom/facebook/internal/WorkQueue;Ljava/lang/Runnable;)V
    .locals 3
    .param p0, "request"    # Lcom/facebook/internal/ImageRequest;
    .param p1, "key"    # Lcom/facebook/internal/ImageDownloader$RequestKey;
    .param p2, "workQueue"    # Lcom/facebook/internal/WorkQueue;
    .param p3, "workItem"    # Ljava/lang/Runnable;

    .prologue
    .line 134
    sget-object v2, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    monitor-enter v2

    .line 135
    :try_start_0
    new-instance v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/ImageDownloader$DownloaderContext;-><init>(Lcom/facebook/internal/ImageDownloader$1;)V

    .line 136
    .local v0, "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    iput-object p0, v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->request:Lcom/facebook/internal/ImageRequest;

    .line 137
    sget-object v1, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    invoke-virtual {p2, p3}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->workItem:Lcom/facebook/internal/WorkQueue$WorkItem;

    .line 147
    monitor-exit v2

    .line 148
    return-void

    .line 147
    .end local v0    # "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static declared-synchronized getHandler()Landroid/os/Handler;
    .locals 3

    .prologue
    .line 281
    const-class v1, Lcom/facebook/internal/ImageDownloader;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/internal/ImageDownloader;->handler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 282
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/facebook/internal/ImageDownloader;->handler:Landroid/os/Handler;

    .line 284
    :cond_0
    sget-object v0, Lcom/facebook/internal/ImageDownloader;->handler:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 281
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static issueResponse(Lcom/facebook/internal/ImageDownloader$RequestKey;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V
    .locals 8
    .param p0, "key"    # Lcom/facebook/internal/ImageDownloader$RequestKey;
    .param p1, "error"    # Ljava/lang/Exception;
    .param p2, "bitmap"    # Landroid/graphics/Bitmap;
    .param p3, "isCachedRedirect"    # Z

    .prologue
    .line 157
    invoke-static {p0}, Lcom/facebook/internal/ImageDownloader;->removePendingRequest(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    move-result-object v6

    .line 158
    .local v6, "completedRequestContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    if-eqz v6, :cond_0

    iget-boolean v0, v6, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->isCancelled:Z

    if-nez v0, :cond_0

    .line 159
    iget-object v1, v6, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->request:Lcom/facebook/internal/ImageRequest;

    .line 160
    .local v1, "request":Lcom/facebook/internal/ImageRequest;
    invoke-virtual {v1}, Lcom/facebook/internal/ImageRequest;->getCallback()Lcom/facebook/internal/ImageRequest$Callback;

    move-result-object v5

    .line 161
    .local v5, "callback":Lcom/facebook/internal/ImageRequest$Callback;
    if-eqz v5, :cond_0

    .line 162
    invoke-static {}, Lcom/facebook/internal/ImageDownloader;->getHandler()Landroid/os/Handler;

    move-result-object v7

    new-instance v0, Lcom/facebook/internal/ImageDownloader$1;

    move-object v2, p1

    move v3, p3

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/internal/ImageDownloader$1;-><init>(Lcom/facebook/internal/ImageRequest;Ljava/lang/Exception;ZLandroid/graphics/Bitmap;Lcom/facebook/internal/ImageRequest$Callback;)V

    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 175
    .end local v1    # "request":Lcom/facebook/internal/ImageRequest;
    .end local v5    # "callback":Lcom/facebook/internal/ImageRequest$Callback;
    :cond_0
    return-void
.end method

.method public static prioritizeRequest(Lcom/facebook/internal/ImageRequest;)V
    .locals 4
    .param p0, "request"    # Lcom/facebook/internal/ImageRequest;

    .prologue
    .line 99
    new-instance v1, Lcom/facebook/internal/ImageDownloader$RequestKey;

    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getImageUri()Ljava/net/URI;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/internal/ImageRequest;->getCallerTag()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/internal/ImageDownloader$RequestKey;-><init>(Ljava/net/URI;Ljava/lang/Object;)V

    .line 100
    .local v1, "key":Lcom/facebook/internal/ImageDownloader$RequestKey;
    sget-object v3, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    monitor-enter v3

    .line 101
    :try_start_0
    sget-object v2, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    .line 102
    .local v0, "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    if-eqz v0, :cond_0

    .line 103
    iget-object v2, v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->workItem:Lcom/facebook/internal/WorkQueue$WorkItem;

    invoke-interface {v2}, Lcom/facebook/internal/WorkQueue$WorkItem;->moveToFront()V

    .line 105
    :cond_0
    monitor-exit v3

    .line 106
    return-void

    .line 105
    .end local v0    # "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private static readFromCache(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;Z)V
    .locals 6
    .param p0, "key"    # Lcom/facebook/internal/ImageDownloader$RequestKey;
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "allowCachedRedirects"    # Z

    .prologue
    .line 178
    const/4 v1, 0x0

    .line 179
    .local v1, "cachedStream":Ljava/io/InputStream;
    const/4 v3, 0x0

    .line 180
    .local v3, "isCachedRedirect":Z
    if-eqz p2, :cond_0

    .line 181
    iget-object v5, p0, Lcom/facebook/internal/ImageDownloader$RequestKey;->uri:Ljava/net/URI;

    invoke-static {p1, v5}, Lcom/facebook/internal/UrlRedirectCache;->getRedirectedUri(Landroid/content/Context;Ljava/net/URI;)Ljava/net/URI;

    move-result-object v4

    .line 182
    .local v4, "redirectUri":Ljava/net/URI;
    if-eqz v4, :cond_0

    .line 183
    invoke-static {v4, p1}, Lcom/facebook/internal/ImageResponseCache;->getCachedImageStream(Ljava/net/URI;Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object v1

    .line 184
    if-eqz v1, :cond_3

    const/4 v3, 0x1

    .line 188
    .end local v4    # "redirectUri":Ljava/net/URI;
    :cond_0
    :goto_0
    if-nez v3, :cond_1

    .line 189
    iget-object v5, p0, Lcom/facebook/internal/ImageDownloader$RequestKey;->uri:Ljava/net/URI;

    invoke-static {v5, p1}, Lcom/facebook/internal/ImageResponseCache;->getCachedImageStream(Ljava/net/URI;Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object v1

    .line 192
    :cond_1
    if-eqz v1, :cond_4

    .line 194
    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 195
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 196
    const/4 v5, 0x0

    invoke-static {p0, v5, v0, v3}, Lcom/facebook/internal/ImageDownloader;->issueResponse(Lcom/facebook/internal/ImageDownloader$RequestKey;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V

    .line 205
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    :cond_2
    :goto_1
    return-void

    .line 184
    .restart local v4    # "redirectUri":Ljava/net/URI;
    :cond_3
    const/4 v3, 0x0

    goto :goto_0

    .line 200
    .end local v4    # "redirectUri":Ljava/net/URI;
    :cond_4
    invoke-static {p0}, Lcom/facebook/internal/ImageDownloader;->removePendingRequest(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    move-result-object v2

    .line 201
    .local v2, "downloaderContext":Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    if-eqz v2, :cond_2

    iget-boolean v5, v2, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->isCancelled:Z

    if-nez v5, :cond_2

    .line 202
    iget-object v5, v2, Lcom/facebook/internal/ImageDownloader$DownloaderContext;->request:Lcom/facebook/internal/ImageRequest;

    invoke-static {v5, p0}, Lcom/facebook/internal/ImageDownloader;->enqueueDownload(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;)V

    goto :goto_1
.end method

.method private static removePendingRequest(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    .locals 2
    .param p0, "key"    # Lcom/facebook/internal/ImageDownloader$RequestKey;

    .prologue
    .line 288
    sget-object v1, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    monitor-enter v1

    .line 289
    :try_start_0
    sget-object v0, Lcom/facebook/internal/ImageDownloader;->pendingRequests:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/internal/ImageDownloader$DownloaderContext;

    monitor-exit v1

    return-object v0

    .line 290
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
