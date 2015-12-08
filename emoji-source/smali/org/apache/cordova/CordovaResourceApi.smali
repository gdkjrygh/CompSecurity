.class public Lorg/apache/cordova/CordovaResourceApi;
.super Ljava/lang/Object;
.source "CordovaResourceApi.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
    }
.end annotation


# static fields
.field private static final LOCAL_FILE_PROJECTION:[Ljava/lang/String;

.field private static final LOG_TAG:Ljava/lang/String; = "CordovaResourceApi"

.field public static final URI_TYPE_ASSET:I = 0x1

.field public static final URI_TYPE_CONTENT:I = 0x2

.field public static final URI_TYPE_DATA:I = 0x4

.field public static final URI_TYPE_FILE:I = 0x0

.field public static final URI_TYPE_HTTP:I = 0x5

.field public static final URI_TYPE_HTTPS:I = 0x6

.field public static final URI_TYPE_RESOURCE:I = 0x3

.field public static final URI_TYPE_UNKNOWN:I = -0x1

.field private static httpClient:Lcom/squareup/okhttp/OkHttpClient;

.field static jsThread:Ljava/lang/Thread;


# instance fields
.field private final assetManager:Landroid/content/res/AssetManager;

.field private final contentResolver:Landroid/content/ContentResolver;

.field private final pluginManager:Lorg/apache/cordova/PluginManager;

.field private threadCheckingEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 82
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_data"

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/cordova/CordovaResourceApi;->LOCAL_FILE_PROJECTION:[Ljava/lang/String;

    .line 85
    new-instance v0, Lcom/squareup/okhttp/OkHttpClient;

    invoke-direct {v0}, Lcom/squareup/okhttp/OkHttpClient;-><init>()V

    sput-object v0, Lorg/apache/cordova/CordovaResourceApi;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/apache/cordova/PluginManager;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "pluginManager"    # Lorg/apache/cordova/PluginManager;

    .prologue
    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaResourceApi;->threadCheckingEnabled:Z

    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/CordovaResourceApi;->contentResolver:Landroid/content/ContentResolver;

    .line 97
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/CordovaResourceApi;->assetManager:Landroid/content/res/AssetManager;

    .line 98
    iput-object p2, p0, Lorg/apache/cordova/CordovaResourceApi;->pluginManager:Lorg/apache/cordova/PluginManager;

    .line 99
    return-void
.end method

.method private assertBackgroundThread()V
    .locals 3

    .prologue
    .line 379
    iget-boolean v1, p0, Lorg/apache/cordova/CordovaResourceApi;->threadCheckingEnabled:Z

    if-eqz v1, :cond_1

    .line 380
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 381
    .local v0, "curThread":Ljava/lang/Thread;
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 382
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Do not perform IO operations on the UI thread. Use CordovaInterface.getThreadPool() instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 384
    :cond_0
    sget-object v1, Lorg/apache/cordova/CordovaResourceApi;->jsThread:Ljava/lang/Thread;

    if-ne v0, v1, :cond_1

    .line 385
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Tried to perform an IO operation on the WebCore thread. Use CordovaInterface.getThreadPool() instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 388
    .end local v0    # "curThread":Ljava/lang/Thread;
    :cond_1
    return-void
.end method

.method private static assertNonRelative(Landroid/net/Uri;)V
    .locals 2
    .param p0, "uri"    # Landroid/net/Uri;

    .prologue
    .line 427
    invoke-virtual {p0}, Landroid/net/Uri;->isAbsolute()Z

    move-result v0

    if-nez v0, :cond_0

    .line 428
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Relative URIs are not supported."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 430
    :cond_0
    return-void
.end method

.method private getDataUriMimeType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 7
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 391
    invoke-virtual {p1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v2

    .line 392
    .local v2, "uriAsString":Ljava/lang/String;
    const/16 v4, 0x2c

    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 393
    .local v0, "commaPos":I
    const/4 v4, -0x1

    if-ne v0, v4, :cond_1

    .line 400
    :cond_0
    :goto_0
    return-object v3

    .line 396
    :cond_1
    invoke-virtual {v2, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v5, ";"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 397
    .local v1, "mimeParts":[Ljava/lang/String;
    array-length v4, v1

    if-lez v4, :cond_0

    .line 398
    aget-object v3, v1, v6

    goto :goto_0
.end method

.method private getMimeTypeFromPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 206
    move-object v0, p1

    .line 207
    .local v0, "extension":Ljava/lang/String;
    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    .line 208
    .local v1, "lastDot":I
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 209
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 212
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 213
    const-string v2, "3ga"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 214
    const-string v2, "audio/3gpp"

    .line 219
    :goto_0
    return-object v2

    .line 215
    :cond_1
    const-string v2, "js"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 217
    const-string v2, "text/javascript"

    goto :goto_0

    .line 219
    :cond_2
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method public static getUriType(Landroid/net/Uri;)I
    .locals 3
    .param p0, "uri"    # Landroid/net/Uri;

    .prologue
    .line 111
    invoke-static {p0}, Lorg/apache/cordova/CordovaResourceApi;->assertNonRelative(Landroid/net/Uri;)V

    .line 112
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 113
    .local v0, "scheme":Ljava/lang/String;
    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 114
    const/4 v1, 0x2

    .line 134
    :goto_0
    return v1

    .line 116
    :cond_0
    const-string v1, "android.resource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 117
    const/4 v1, 0x3

    goto :goto_0

    .line 119
    :cond_1
    const-string v1, "file"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 120
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/android_asset/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 121
    const/4 v1, 0x1

    goto :goto_0

    .line 123
    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    .line 125
    :cond_3
    const-string v1, "data"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 126
    const/4 v1, 0x4

    goto :goto_0

    .line 128
    :cond_4
    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 129
    const/4 v1, 0x5

    goto :goto_0

    .line 131
    :cond_5
    const-string v1, "https"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 132
    const/4 v1, 0x6

    goto :goto_0

    .line 134
    :cond_6
    const/4 v1, -0x1

    goto :goto_0
.end method

.method private readDataUri(Landroid/net/Uri;)Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
    .locals 14
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 404
    invoke-virtual {p1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v13

    .line 405
    .local v13, "uriAsString":Ljava/lang/String;
    const/16 v0, 0x2c

    invoke-virtual {v13, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    .line 406
    .local v8, "commaPos":I
    const/4 v0, -0x1

    if-ne v8, v0, :cond_0

    .line 423
    :goto_0
    return-object v6

    .line 409
    :cond_0
    invoke-virtual {v13, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 410
    .local v12, "mimeParts":[Ljava/lang/String;
    const/4 v3, 0x0

    .line 411
    .local v3, "contentType":Ljava/lang/String;
    const/4 v7, 0x0

    .line 412
    .local v7, "base64":Z
    array-length v0, v12

    if-lez v0, :cond_1

    .line 413
    aget-object v3, v12, v4

    .line 415
    :cond_1
    const/4 v11, 0x1

    .local v11, "i":I
    :goto_1
    array-length v0, v12

    if-ge v11, v0, :cond_3

    .line 416
    const-string v0, "base64"

    aget-object v1, v12, v11

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 417
    const/4 v7, 0x1

    .line 415
    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 420
    :cond_3
    add-int/lit8 v0, v8, 0x1

    invoke-virtual {v13, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    .line 421
    .local v10, "dataPartAsString":Ljava/lang/String;
    if-eqz v7, :cond_4

    invoke-static {v10, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v9

    .line 422
    .local v9, "data":[B
    :goto_2
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 423
    .local v2, "inputStream":Ljava/io/InputStream;
    new-instance v0, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    array-length v1, v9

    int-to-long v4, v1

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;-><init>(Landroid/net/Uri;Ljava/io/InputStream;Ljava/lang/String;JLandroid/content/res/AssetFileDescriptor;)V

    move-object v6, v0

    goto :goto_0

    .line 421
    .end local v2    # "inputStream":Ljava/io/InputStream;
    .end local v9    # "data":[B
    :cond_4
    const-string v0, "UTF-8"

    invoke-static {v10, v0}, Lorg/apache/http/util/EncodingUtils;->getBytes(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v9

    goto :goto_2
.end method


# virtual methods
.method public copyResource(Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 2
    .param p1, "sourceUri"    # Landroid/net/Uri;
    .param p2, "dstUri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 375
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaResourceApi;->openForRead(Landroid/net/Uri;)Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    move-result-object v0

    invoke-virtual {p0, p2}, Lorg/apache/cordova/CordovaResourceApi;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/apache/cordova/CordovaResourceApi;->copyResource(Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;Ljava/io/OutputStream;)V

    .line 376
    return-void
.end method

.method public copyResource(Landroid/net/Uri;Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "sourceUri"    # Landroid/net/Uri;
    .param p2, "outputStream"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 370
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaResourceApi;->openForRead(Landroid/net/Uri;)Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lorg/apache/cordova/CordovaResourceApi;->copyResource(Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;Ljava/io/OutputStream;)V

    .line 371
    return-void
.end method

.method public copyResource(Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;Ljava/io/OutputStream;)V
    .locals 14
    .param p1, "input"    # Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
    .param p2, "outputStream"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 336
    invoke-direct {p0}, Lorg/apache/cordova/CordovaResourceApi;->assertBackgroundThread()V

    .line 338
    :try_start_0
    iget-object v11, p1, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->inputStream:Ljava/io/InputStream;

    .line 339
    .local v11, "inputStream":Ljava/io/InputStream;
    instance-of v12, v11, Ljava/io/FileInputStream;

    if-eqz v12, :cond_3

    move-object/from16 v0, p2

    instance-of v12, v0, Ljava/io/FileOutputStream;

    if-eqz v12, :cond_3

    .line 340
    iget-object v12, p1, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->inputStream:Ljava/io/InputStream;

    check-cast v12, Ljava/io/FileInputStream;

    invoke-virtual {v12}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v3

    .line 341
    .local v3, "inChannel":Ljava/nio/channels/FileChannel;
    move-object/from16 v0, p2

    check-cast v0, Ljava/io/FileOutputStream;

    move-object v12, v0

    invoke-virtual {v12}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    .line 342
    .local v2, "outChannel":Ljava/nio/channels/FileChannel;
    const-wide/16 v4, 0x0

    .line 343
    .local v4, "offset":J
    iget-wide v6, p1, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->length:J

    .line 344
    .local v6, "length":J
    iget-object v12, p1, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->assetFd:Landroid/content/res/AssetFileDescriptor;

    if-eqz v12, :cond_0

    .line 345
    iget-object v12, p1, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->assetFd:Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v12}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v4

    .line 347
    :cond_0
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->transferFrom(Ljava/nio/channels/ReadableByteChannel;JJ)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 362
    .end local v2    # "outChannel":Ljava/nio/channels/FileChannel;
    .end local v3    # "inChannel":Ljava/nio/channels/FileChannel;
    .end local v4    # "offset":J
    .end local v6    # "length":J
    :cond_1
    iget-object v12, p1, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->inputStream:Ljava/io/InputStream;

    invoke-virtual {v12}, Ljava/io/InputStream;->close()V

    .line 363
    if-eqz p2, :cond_2

    .line 364
    invoke-virtual/range {p2 .. p2}, Ljava/io/OutputStream;->close()V

    .line 367
    :cond_2
    return-void

    .line 349
    :cond_3
    const/16 v8, 0x2000

    .line 350
    .local v8, "BUFFER_SIZE":I
    const/16 v12, 0x2000

    :try_start_1
    new-array v9, v12, [B

    .line 353
    .local v9, "buffer":[B
    :goto_0
    const/4 v12, 0x0

    const/16 v13, 0x2000

    invoke-virtual {v11, v9, v12, v13}, Ljava/io/InputStream;->read([BII)I

    move-result v10

    .line 355
    .local v10, "bytesRead":I
    if-lez v10, :cond_1

    .line 358
    const/4 v12, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v9, v12, v10}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 362
    .end local v8    # "BUFFER_SIZE":I
    .end local v9    # "buffer":[B
    .end local v10    # "bytesRead":I
    .end local v11    # "inputStream":Ljava/io/InputStream;
    :catchall_0
    move-exception v12

    iget-object v13, p1, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->inputStream:Ljava/io/InputStream;

    invoke-virtual {v13}, Ljava/io/InputStream;->close()V

    .line 363
    if-eqz p2, :cond_4

    .line 364
    invoke-virtual/range {p2 .. p2}, Ljava/io/OutputStream;->close()V

    :cond_4
    throw v12
.end method

.method public createHttpConnection(Landroid/net/Uri;)Ljava/net/HttpURLConnection;
    .locals 3
    .param p1, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 329
    invoke-direct {p0}, Lorg/apache/cordova/CordovaResourceApi;->assertBackgroundThread()V

    .line 330
    sget-object v0, Lorg/apache/cordova/CordovaResourceApi;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    new-instance v1, Ljava/net/URL;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/OkHttpClient;->open(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method public getMimeType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 4
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    .line 178
    invoke-static {p1}, Lorg/apache/cordova/CordovaResourceApi;->getUriType(Landroid/net/Uri;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 200
    :goto_0
    const/4 v1, 0x0

    :goto_1
    return-object v1

    .line 181
    :pswitch_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lorg/apache/cordova/CordovaResourceApi;->getMimeTypeFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 184
    :pswitch_1
    iget-object v1, p0, Lorg/apache/cordova/CordovaResourceApi;->contentResolver:Landroid/content/ContentResolver;

    invoke-virtual {v1, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 186
    :pswitch_2
    invoke-direct {p0, p1}, Lorg/apache/cordova/CordovaResourceApi;->getDataUriMimeType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 191
    :pswitch_3
    :try_start_0
    sget-object v1, Lorg/apache/cordova/CordovaResourceApi;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    new-instance v2, Ljava/net/URL;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/OkHttpClient;->open(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 192
    .local v0, "conn":Ljava/net/HttpURLConnection;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 193
    const-string v1, "HEAD"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 194
    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_1

    .line 195
    .end local v0    # "conn":Ljava/net/HttpURLConnection;
    :catch_0
    move-exception v1

    goto :goto_0

    .line 178
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public isThreadCheckingEnabled()Z
    .locals 1

    .prologue
    .line 106
    iget-boolean v0, p0, Lorg/apache/cordova/CordovaResourceApi;->threadCheckingEnabled:Z

    return v0
.end method

.method public mapUriToFile(Landroid/net/Uri;)Ljava/io/File;
    .locals 9
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    const/4 v3, 0x0

    .line 152
    invoke-direct {p0}, Lorg/apache/cordova/CordovaResourceApi;->assertBackgroundThread()V

    .line 153
    invoke-static {p1}, Lorg/apache/cordova/CordovaResourceApi;->getUriType(Landroid/net/Uri;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 174
    :cond_0
    :goto_0
    :pswitch_0
    return-object v3

    .line 155
    :pswitch_1
    new-instance v3, Ljava/io/File;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 157
    :pswitch_2
    iget-object v0, p0, Lorg/apache/cordova/CordovaResourceApi;->contentResolver:Landroid/content/ContentResolver;

    sget-object v2, Lorg/apache/cordova/CordovaResourceApi;->LOCAL_FILE_PROJECTION:[Ljava/lang/String;

    move-object v1, p1

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 158
    .local v7, "cursor":Landroid/database/Cursor;
    if-eqz v7, :cond_0

    .line 160
    :try_start_0
    sget-object v0, Lorg/apache/cordova/CordovaResourceApi;->LOCAL_FILE_PROJECTION:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 161
    .local v6, "columnIndex":I
    const/4 v0, -0x1

    if-eq v6, v0, :cond_1

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 162
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 163
    invoke-interface {v7, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 164
    .local v8, "realPath":Ljava/lang/String;
    if-eqz v8, :cond_1

    .line 165
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .end local v8    # "realPath":Ljava/lang/String;
    :cond_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .end local v6    # "columnIndex":I
    :catchall_0
    move-exception v0

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    throw v0

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public openForRead(Landroid/net/Uri;)Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 231
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/apache/cordova/CordovaResourceApi;->openForRead(Landroid/net/Uri;Z)Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    move-result-object v0

    return-object v0
.end method

.method public openForRead(Landroid/net/Uri;Z)Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
    .locals 20
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "skipThreadCheck"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 243
    if-nez p2, :cond_0

    .line 244
    invoke-direct/range {p0 .. p0}, Lorg/apache/cordova/CordovaResourceApi;->assertBackgroundThread()V

    .line 246
    :cond_0
    invoke-static/range {p1 .. p1}, Lorg/apache/cordova/CordovaResourceApi;->getUriType(Landroid/net/Uri;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 294
    :cond_1
    new-instance v2, Ljava/io/FileNotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "URI not supported by CordovaResourceApi: "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 248
    :pswitch_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 249
    .local v4, "inputStream":Ljava/io/FileInputStream;
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lorg/apache/cordova/CordovaResourceApi;->getMimeTypeFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 250
    .local v5, "mimeType":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v6

    .line 251
    .local v6, "length":J
    new-instance v2, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    const/4 v8, 0x0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v8}, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;-><init>(Landroid/net/Uri;Ljava/io/InputStream;Ljava/lang/String;JLandroid/content/res/AssetFileDescriptor;)V

    .line 291
    .end local v4    # "inputStream":Ljava/io/FileInputStream;
    .end local v5    # "mimeType":Ljava/lang/String;
    .end local v6    # "length":J
    :goto_0
    return-object v2

    .line 254
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xf

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 255
    .local v9, "assetPath":Ljava/lang/String;
    const/4 v8, 0x0

    .line 257
    .local v8, "assetFd":Landroid/content/res/AssetFileDescriptor;
    const-wide/16 v6, -0x1

    .line 259
    .restart local v6    # "length":J
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/apache/cordova/CordovaResourceApi;->assetManager:Landroid/content/res/AssetManager;

    invoke-virtual {v2, v9}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v8

    .line 260
    invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object v4

    .line 261
    .local v4, "inputStream":Ljava/io/InputStream;
    invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getLength()J
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v6

    .line 266
    :goto_1
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lorg/apache/cordova/CordovaResourceApi;->getMimeTypeFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 267
    .restart local v5    # "mimeType":Ljava/lang/String;
    new-instance v2, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v8}, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;-><init>(Landroid/net/Uri;Ljava/io/InputStream;Ljava/lang/String;JLandroid/content/res/AssetFileDescriptor;)V

    goto :goto_0

    .line 262
    .end local v4    # "inputStream":Ljava/io/InputStream;
    .end local v5    # "mimeType":Ljava/lang/String;
    :catch_0
    move-exception v18

    .line 264
    .local v18, "e":Ljava/io/FileNotFoundException;
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/apache/cordova/CordovaResourceApi;->assetManager:Landroid/content/res/AssetManager;

    invoke-virtual {v2, v9}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4

    .restart local v4    # "inputStream":Ljava/io/InputStream;
    goto :goto_1

    .line 271
    .end local v4    # "inputStream":Ljava/io/InputStream;
    .end local v6    # "length":J
    .end local v8    # "assetFd":Landroid/content/res/AssetFileDescriptor;
    .end local v9    # "assetPath":Ljava/lang/String;
    .end local v18    # "e":Ljava/io/FileNotFoundException;
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/apache/cordova/CordovaResourceApi;->contentResolver:Landroid/content/ContentResolver;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    .line 272
    .restart local v5    # "mimeType":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/apache/cordova/CordovaResourceApi;->contentResolver:Landroid/content/ContentResolver;

    const-string v3, "r"

    move-object/from16 v0, p1

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v8

    .line 273
    .restart local v8    # "assetFd":Landroid/content/res/AssetFileDescriptor;
    invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object v4

    .line 274
    .restart local v4    # "inputStream":Ljava/io/InputStream;
    invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v6

    .line 275
    .restart local v6    # "length":J
    new-instance v2, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v8}, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;-><init>(Landroid/net/Uri;Ljava/io/InputStream;Ljava/lang/String;JLandroid/content/res/AssetFileDescriptor;)V

    goto :goto_0

    .line 278
    .end local v4    # "inputStream":Ljava/io/InputStream;
    .end local v5    # "mimeType":Ljava/lang/String;
    .end local v6    # "length":J
    .end local v8    # "assetFd":Landroid/content/res/AssetFileDescriptor;
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lorg/apache/cordova/CordovaResourceApi;->readDataUri(Landroid/net/Uri;)Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    move-result-object v19

    .line 279
    .local v19, "ret":Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
    if-eqz v19, :cond_1

    move-object/from16 v2, v19

    .line 282
    goto :goto_0

    .line 286
    .end local v19    # "ret":Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
    :pswitch_4
    sget-object v2, Lorg/apache/cordova/CordovaResourceApi;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    new-instance v3, Ljava/net/URL;

    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v3, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/OkHttpClient;->open(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v17

    .line 287
    .local v17, "conn":Ljava/net/HttpURLConnection;
    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 288
    const-string v2, "Content-Type"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 289
    .restart local v5    # "mimeType":Ljava/lang/String;
    invoke-virtual/range {v17 .. v17}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v6

    .line 290
    .local v6, "length":I
    invoke-virtual/range {v17 .. v17}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    .line 291
    .restart local v4    # "inputStream":Ljava/io/InputStream;
    new-instance v10, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;

    int-to-long v14, v6

    const/16 v16, 0x0

    move-object/from16 v11, p1

    move-object v12, v4

    move-object v13, v5

    invoke-direct/range {v10 .. v16}, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;-><init>(Landroid/net/Uri;Ljava/io/InputStream;Ljava/lang/String;JLandroid/content/res/AssetFileDescriptor;)V

    move-object v2, v10

    goto/16 :goto_0

    .line 246
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 298
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/apache/cordova/CordovaResourceApi;->openOutputStream(Landroid/net/Uri;Z)Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public openOutputStream(Landroid/net/Uri;Z)Ljava/io/OutputStream;
    .locals 6
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "append"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 309
    invoke-direct {p0}, Lorg/apache/cordova/CordovaResourceApi;->assertBackgroundThread()V

    .line 310
    invoke-static {p1}, Lorg/apache/cordova/CordovaResourceApi;->getUriType(Landroid/net/Uri;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 325
    :pswitch_0
    new-instance v3, Ljava/io/FileNotFoundException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "URI not supported by CordovaResourceApi: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 312
    :pswitch_1
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 313
    .local v1, "localFile":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 314
    .local v2, "parent":Ljava/io/File;
    if-eqz v2, :cond_0

    .line 315
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 317
    :cond_0
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 322
    .end local v1    # "localFile":Ljava/io/File;
    .end local v2    # "parent":Ljava/io/File;
    :goto_0
    return-object v3

    .line 321
    :pswitch_2
    iget-object v4, p0, Lorg/apache/cordova/CordovaResourceApi;->contentResolver:Landroid/content/ContentResolver;

    if-eqz p2, :cond_1

    const-string v3, "wa"

    :goto_1
    invoke-virtual {v4, p1, v3}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    .line 322
    .local v0, "assetFd":Landroid/content/res/AssetFileDescriptor;
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->createOutputStream()Ljava/io/FileOutputStream;

    move-result-object v3

    goto :goto_0

    .line 321
    .end local v0    # "assetFd":Landroid/content/res/AssetFileDescriptor;
    :cond_1
    const-string v3, "w"

    goto :goto_1

    .line 310
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public remapPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 144
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/cordova/CordovaResourceApi;->remapUri(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public remapUri(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 2
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    .line 138
    invoke-static {p1}, Lorg/apache/cordova/CordovaResourceApi;->assertNonRelative(Landroid/net/Uri;)V

    .line 139
    iget-object v1, p0, Lorg/apache/cordova/CordovaResourceApi;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v1, p1}, Lorg/apache/cordova/PluginManager;->remapUri(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    .line 140
    .local v0, "pluginUri":Landroid/net/Uri;
    if-eqz v0, :cond_0

    .end local v0    # "pluginUri":Landroid/net/Uri;
    :goto_0
    return-object v0

    .restart local v0    # "pluginUri":Landroid/net/Uri;
    :cond_0
    move-object v0, p1

    goto :goto_0
.end method

.method public setThreadCheckingEnabled(Z)V
    .locals 0
    .param p1, "value"    # Z

    .prologue
    .line 102
    iput-boolean p1, p0, Lorg/apache/cordova/CordovaResourceApi;->threadCheckingEnabled:Z

    .line 103
    return-void
.end method
