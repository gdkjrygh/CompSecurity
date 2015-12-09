.class public Lorg/apache/cordova/FileTransfer;
.super Lorg/apache/cordova/api/CordovaPlugin;
.source "FileTransfer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/FileTransfer$DoneHandlerInputStream;,
        Lorg/apache/cordova/FileTransfer$RequestContext;
    }
.end annotation


# static fields
.field public static ABORTED_ERR:I = 0x0

.field private static final BOUNDARY:Ljava/lang/String; = "+++++"

.field public static CONNECTION_ERR:I = 0x0

.field private static final DO_NOT_VERIFY:Ljavax/net/ssl/HostnameVerifier;

.field public static FILE_NOT_FOUND_ERR:I = 0x0

.field public static INVALID_URL_ERR:I = 0x0

.field private static final LINE_END:Ljava/lang/String; = "\r\n"

.field private static final LINE_START:Ljava/lang/String; = "--"

.field private static final LOG_TAG:Ljava/lang/String; = "FileTransfer"

.field private static final MAX_BUFFER_SIZE:I = 0x4000

.field private static activeRequests:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/apache/cordova/FileTransfer$RequestContext;",
            ">;"
        }
    .end annotation
.end field

.field private static final trustAllCerts:[Ljavax/net/ssl/TrustManager;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 69
    sput v1, Lorg/apache/cordova/FileTransfer;->FILE_NOT_FOUND_ERR:I

    .line 70
    const/4 v0, 0x2

    sput v0, Lorg/apache/cordova/FileTransfer;->INVALID_URL_ERR:I

    .line 71
    const/4 v0, 0x3

    sput v0, Lorg/apache/cordova/FileTransfer;->CONNECTION_ERR:I

    .line 72
    const/4 v0, 0x4

    sput v0, Lorg/apache/cordova/FileTransfer;->ABORTED_ERR:I

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    .line 486
    new-instance v0, Lorg/apache/cordova/FileTransfer$2;

    invoke-direct {v0}, Lorg/apache/cordova/FileTransfer$2;-><init>()V

    sput-object v0, Lorg/apache/cordova/FileTransfer;->DO_NOT_VERIFY:Ljavax/net/ssl/HostnameVerifier;

    .line 492
    new-array v0, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v1, 0x0

    new-instance v2, Lorg/apache/cordova/FileTransfer$3;

    invoke-direct {v2}, Lorg/apache/cordova/FileTransfer$3;-><init>()V

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/cordova/FileTransfer;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lorg/apache/cordova/api/CordovaPlugin;-><init>()V

    .line 102
    return-void
.end method

.method private abort(Ljava/lang/String;)V
    .locals 6
    .param p1, "objectId"    # Ljava/lang/String;

    .prologue
    .line 805
    sget-object v3, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    monitor-enter v3

    .line 806
    :try_start_0
    sget-object v2, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/FileTransfer$RequestContext;

    .line 807
    .local v0, "context":Lorg/apache/cordova/FileTransfer$RequestContext;
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 808
    if-eqz v0, :cond_0

    .line 810
    sget v2, Lorg/apache/cordova/FileTransfer;->ABORTED_ERR:I

    iget-object v3, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->source:Ljava/lang/String;

    iget-object v4, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->target:Ljava/lang/String;

    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v3, v4, v5}, Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/json/JSONObject;

    move-result-object v1

    .line 811
    .local v1, "error":Lorg/json/JSONObject;
    monitor-enter v0

    .line 812
    :try_start_1
    new-instance v2, Lorg/apache/cordova/api/PluginResult;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v2, v3, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v2}, Lorg/apache/cordova/FileTransfer$RequestContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 813
    const/4 v2, 0x1

    iput-boolean v2, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->aborted:Z

    .line 814
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 816
    iget-object v2, p0, Lorg/apache/cordova/FileTransfer;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/api/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lorg/apache/cordova/FileTransfer$5;

    invoke-direct {v3, p0, v0}, Lorg/apache/cordova/FileTransfer$5;-><init>(Lorg/apache/cordova/FileTransfer;Lorg/apache/cordova/FileTransfer$RequestContext;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 825
    .end local v1    # "error":Lorg/json/JSONObject;
    :cond_0
    return-void

    .line 807
    .end local v0    # "context":Lorg/apache/cordova/FileTransfer$RequestContext;
    :catchall_0
    move-exception v2

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .line 814
    .restart local v0    # "context":Lorg/apache/cordova/FileTransfer$RequestContext;
    .restart local v1    # "error":Lorg/json/JSONObject;
    :catchall_1
    move-exception v2

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v2
.end method

.method static synthetic access$000(Ljavax/net/ssl/HttpsURLConnection;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 1
    .param p0, "x0"    # Ljavax/net/ssl/HttpsURLConnection;

    .prologue
    .line 62
    invoke-static {p0}, Lorg/apache/cordova/FileTransfer;->trustAllHosts(Ljavax/net/ssl/HttpsURLConnection;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lorg/apache/cordova/FileTransfer;->DO_NOT_VERIFY:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method static synthetic access$200(Lorg/apache/cordova/FileTransfer;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/FileTransfer;
    .param p1, "x1"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0, p1}, Lorg/apache/cordova/FileTransfer;->getPathFromUri(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$300(Ljava/io/Closeable;)V
    .locals 0
    .param p0, "x0"    # Ljava/io/Closeable;

    .prologue
    .line 62
    invoke-static {p0}, Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V

    return-void
.end method

.method static synthetic access$400(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    .locals 1
    .param p0, "x0"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 62
    invoke-static {p0}, Lorg/apache/cordova/FileTransfer;->getInputStream(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    .locals 1
    .param p0, "x0"    # I
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Ljava/lang/String;
    .param p3, "x3"    # Ljava/net/HttpURLConnection;

    .prologue
    .line 62
    invoke-static {p0, p1, p2, p3}, Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$600()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic access$700(Lorg/apache/cordova/FileTransfer;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/FileTransfer;
    .param p1, "x1"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0, p1}, Lorg/apache/cordova/FileTransfer;->getFileFromPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private static createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/json/JSONObject;
    .locals 5
    .param p0, "errorCode"    # I
    .param p1, "source"    # Ljava/lang/String;
    .param p2, "target"    # Ljava/lang/String;
    .param p3, "httpStatus"    # Ljava/lang/Integer;

    .prologue
    .line 550
    const/4 v1, 0x0

    .line 552
    .local v1, "error":Lorg/json/JSONObject;
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 553
    .end local v1    # "error":Lorg/json/JSONObject;
    .local v2, "error":Lorg/json/JSONObject;
    :try_start_1
    const-string v3, "code"

    invoke-virtual {v2, v3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 554
    const-string v3, "source"

    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 555
    const-string v3, "target"

    invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 556
    if-eqz p3, :cond_0

    .line 557
    const-string v3, "http_status"

    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    move-object v1, v2

    .line 562
    .end local v2    # "error":Lorg/json/JSONObject;
    .restart local v1    # "error":Lorg/json/JSONObject;
    :goto_0
    return-object v1

    .line 559
    :catch_0
    move-exception v0

    .line 560
    .local v0, "e":Lorg/json/JSONException;
    :goto_1
    const-string v3, "FileTransfer"

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 559
    .end local v0    # "e":Lorg/json/JSONException;
    .end local v1    # "error":Lorg/json/JSONObject;
    .restart local v2    # "error":Lorg/json/JSONObject;
    :catch_1
    move-exception v0

    move-object v1, v2

    .end local v2    # "error":Lorg/json/JSONObject;
    .restart local v1    # "error":Lorg/json/JSONObject;
    goto :goto_1
.end method

.method private static createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    .locals 4
    .param p0, "errorCode"    # I
    .param p1, "source"    # Ljava/lang/String;
    .param p2, "target"    # Ljava/lang/String;
    .param p3, "connection"    # Ljava/net/HttpURLConnection;

    .prologue
    .line 531
    const/4 v1, 0x0

    .line 533
    .local v1, "httpStatus":Ljava/lang/Integer;
    if-eqz p3, :cond_0

    .line 535
    :try_start_0
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 541
    :cond_0
    :goto_0
    invoke-static {p0, p1, p2, v1}, Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/json/JSONObject;

    move-result-object v2

    return-object v2

    .line 536
    :catch_0
    move-exception v0

    .line 537
    .local v0, "e":Ljava/io/IOException;
    const-string v2, "FileTransfer"

    const-string v3, "Error getting HTTP status code from connection."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private download(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)V
    .locals 13
    .param p1, "source"    # Ljava/lang/String;
    .param p2, "target"    # Ljava/lang/String;
    .param p3, "args"    # Lorg/json/JSONArray;
    .param p4, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 590
    const-string v1, "FileTransfer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "download "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " to "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 592
    const/4 v1, 0x2

    move-object/from16 v0, p3

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optBoolean(I)Z

    move-result v6

    .line 593
    .local v6, "trustEveryone":Z
    const/4 v1, 0x3

    move-object/from16 v0, p3

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 597
    .local v9, "objectId":Ljava/lang/String;
    :try_start_0
    new-instance v7, Ljava/net/URL;

    invoke-direct {v7, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 604
    .local v7, "url":Ljava/net/URL;
    invoke-virtual {v7}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 606
    .local v5, "useHttps":Z
    iget-object v1, p0, Lorg/apache/cordova/FileTransfer;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v1, p1}, Lorg/apache/cordova/CordovaWebView;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 607
    const-string v1, "FileTransfer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Source URL is not in white list: \'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 608
    sget v1, Lorg/apache/cordova/FileTransfer;->CONNECTION_ERR:I

    const/16 v2, 0x191

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, p1, p2, v2}, Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/json/JSONObject;

    move-result-object v11

    .line 609
    .local v11, "error":Lorg/json/JSONObject;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, v11}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    move-object/from16 v0, p4

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 750
    .end local v5    # "useHttps":Z
    .end local v7    # "url":Ljava/net/URL;
    .end local v11    # "error":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 598
    :catch_0
    move-exception v10

    .line 599
    .local v10, "e":Ljava/net/MalformedURLException;
    sget v1, Lorg/apache/cordova/FileTransfer;->INVALID_URL_ERR:I

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, p1, p2, v2}, Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/json/JSONObject;

    move-result-object v11

    .line 600
    .restart local v11    # "error":Lorg/json/JSONObject;
    const-string v1, "FileTransfer"

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 601
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, v11}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    move-object/from16 v0, p4

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_0

    .line 614
    .end local v10    # "e":Ljava/net/MalformedURLException;
    .end local v11    # "error":Lorg/json/JSONObject;
    .restart local v5    # "useHttps":Z
    .restart local v7    # "url":Ljava/net/URL;
    :cond_0
    new-instance v3, Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v0, p4

    invoke-direct {v3, p1, p2, v0}, Lorg/apache/cordova/FileTransfer$RequestContext;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/api/CallbackContext;)V

    .line 615
    .local v3, "context":Lorg/apache/cordova/FileTransfer$RequestContext;
    sget-object v2, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    monitor-enter v2

    .line 616
    :try_start_1
    sget-object v1, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    invoke-virtual {v1, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 619
    iget-object v1, p0, Lorg/apache/cordova/FileTransfer;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v12

    new-instance v1, Lorg/apache/cordova/FileTransfer$4;

    move-object v2, p0

    move-object v4, p2

    move-object v8, p1

    invoke-direct/range {v1 .. v9}, Lorg/apache/cordova/FileTransfer$4;-><init>(Lorg/apache/cordova/FileTransfer;Lorg/apache/cordova/FileTransfer$RequestContext;Ljava/lang/String;ZZLjava/net/URL;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v12, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 617
    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private static getArgument(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "args"    # Lorg/json/JSONArray;
    .param p1, "position"    # I
    .param p2, "defaultString"    # Ljava/lang/String;

    .prologue
    .line 573
    move-object v0, p2

    .line 574
    .local v0, "arg":Ljava/lang/String;
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lt v1, p1, :cond_1

    .line 575
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v0

    .line 576
    if-eqz v0, :cond_0

    const-string v1, "null"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 577
    :cond_0
    move-object v0, p2

    .line 580
    :cond_1
    return-object v0
.end method

.method private getFileFromPath(Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p1, "path"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 785
    const-string v1, "file://"

    .line 787
    .local v1, "prefix":Ljava/lang/String;
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 788
    new-instance v0, Ljava/io/File;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 793
    .local v0, "file":Ljava/io/File;
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    .line 794
    new-instance v2, Ljava/io/FileNotFoundException;

    invoke-direct {v2}, Ljava/io/FileNotFoundException;-><init>()V

    throw v2

    .line 790
    .end local v0    # "file":Ljava/io/File;
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .restart local v0    # "file":Ljava/io/File;
    goto :goto_0

    .line 797
    :cond_1
    return-object v0
.end method

.method private static getInputStream(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    .locals 2
    .param p0, "conn"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 479
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 480
    new-instance v0, Lorg/apache/cordova/FileTransfer$DoneHandlerInputStream;

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/cordova/FileTransfer$DoneHandlerInputStream;-><init>(Ljava/io/InputStream;)V

    .line 482
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0
.end method

.method private getPathFromUri(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 4
    .param p1, "path"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x7

    .line 760
    const-string v2, "content:"

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 761
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 762
    .local v1, "uri":Landroid/net/Uri;
    iget-object v2, p0, Lorg/apache/cordova/FileTransfer;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    .line 773
    .end local v1    # "uri":Landroid/net/Uri;
    :goto_0
    return-object v2

    .line 764
    :cond_0
    const-string v2, "file://"

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 765
    const-string v2, "?"

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 766
    .local v0, "question":I
    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    .line 767
    new-instance v2, Ljava/io/FileInputStream;

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 769
    :cond_1
    new-instance v2, Ljava/io/FileInputStream;

    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 773
    .end local v0    # "question":I
    :cond_2
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static safeClose(Ljava/io/Closeable;)V
    .locals 1
    .param p0, "stream"    # Ljava/io/Closeable;

    .prologue
    .line 470
    if-eqz p0, :cond_0

    .line 472
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 476
    :cond_0
    :goto_0
    return-void

    .line 473
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static trustAllHosts(Ljavax/net/ssl/HttpsURLConnection;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 7
    .param p0, "connection"    # Ljavax/net/ssl/HttpsURLConnection;

    .prologue
    .line 516
    invoke-virtual {p0}, Ljavax/net/ssl/HttpsURLConnection;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    .line 519
    .local v2, "oldFactory":Ljavax/net/ssl/SSLSocketFactory;
    :try_start_0
    const-string v4, "TLS"

    invoke-static {v4}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v3

    .line 520
    .local v3, "sc":Ljavax/net/ssl/SSLContext;
    const/4 v4, 0x0

    sget-object v5, Lorg/apache/cordova/FileTransfer;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v3, v4, v5, v6}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 521
    invoke-virtual {v3}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    .line 522
    .local v1, "newFactory":Ljavax/net/ssl/SSLSocketFactory;
    invoke-virtual {p0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 526
    .end local v1    # "newFactory":Ljavax/net/ssl/SSLSocketFactory;
    .end local v3    # "sc":Ljavax/net/ssl/SSLContext;
    :goto_0
    return-object v2

    .line 523
    :catch_0
    move-exception v0

    .line 524
    .local v0, "e":Ljava/lang/Exception;
    const-string v4, "FileTransfer"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private upload(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)V
    .locals 21
    .param p1, "source"    # Ljava/lang/String;
    .param p2, "target"    # Ljava/lang/String;
    .param p3, "args"    # Lorg/json/JSONArray;
    .param p4, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 171
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "upload "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v9, " to "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p2

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    const/4 v3, 0x2

    const-string v4, "file"

    move-object/from16 v0, p3

    invoke-static {v0, v3, v4}, Lorg/apache/cordova/FileTransfer;->getArgument(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 175
    .local v12, "fileKey":Ljava/lang/String;
    const/4 v3, 0x3

    const-string v4, "image.jpg"

    move-object/from16 v0, p3

    invoke-static {v0, v3, v4}, Lorg/apache/cordova/FileTransfer;->getArgument(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 176
    .local v14, "fileName":Ljava/lang/String;
    const/4 v3, 0x4

    const-string v4, "image/jpeg"

    move-object/from16 v0, p3

    invoke-static {v0, v3, v4}, Lorg/apache/cordova/FileTransfer;->getArgument(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 177
    .local v13, "mimeType":Ljava/lang/String;
    const/4 v3, 0x5

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 178
    .local v11, "params":Lorg/json/JSONObject;
    :goto_0
    const/4 v3, 0x6

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optBoolean(I)Z

    move-result v7

    .line 180
    .local v7, "trustEveryone":Z
    const/4 v3, 0x7

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optBoolean(I)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x7

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_0
    const/16 v16, 0x1

    .line 182
    .local v16, "chunkedMode":Z
    :goto_1
    const/16 v3, 0x8

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_3

    const-string v3, "headers"

    invoke-virtual {v11, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    .line 183
    .local v10, "headers":Lorg/json/JSONObject;
    :goto_2
    const/16 v3, 0x9

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 185
    .local v17, "objectId":Ljava/lang/String;
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "fileKey: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "fileName: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "mimeType: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "params: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "trustEveryone: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "chunkedMode: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move/from16 v0, v16

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "headers: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    const-string v3, "FileTransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "objectId: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    :try_start_0
    new-instance v8, Ljava/net/URL;

    move-object/from16 v0, p2

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    .local v8, "url":Ljava/net/URL;
    invoke-virtual {v8}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v4, "https"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 205
    .local v6, "useHttps":Z
    new-instance v5, Lorg/apache/cordova/FileTransfer$RequestContext;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    invoke-direct {v5, v0, v1, v2}, Lorg/apache/cordova/FileTransfer$RequestContext;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/api/CallbackContext;)V

    .line 206
    .local v5, "context":Lorg/apache/cordova/FileTransfer$RequestContext;
    sget-object v4, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    monitor-enter v4

    .line 207
    :try_start_1
    sget-object v3, Lorg/apache/cordova/FileTransfer;->activeRequests:Ljava/util/HashMap;

    move-object/from16 v0, v17

    invoke-virtual {v3, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/apache/cordova/FileTransfer;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/api/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v20

    new-instance v3, Lorg/apache/cordova/FileTransfer$1;

    move-object/from16 v4, p0

    move-object/from16 v9, p2

    move-object/from16 v15, p1

    invoke-direct/range {v3 .. v17}, Lorg/apache/cordova/FileTransfer$1;-><init>(Lorg/apache/cordova/FileTransfer;Lorg/apache/cordova/FileTransfer$RequestContext;ZZLjava/net/URL;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 467
    .end local v5    # "context":Lorg/apache/cordova/FileTransfer$RequestContext;
    .end local v6    # "useHttps":Z
    .end local v8    # "url":Ljava/net/URL;
    :goto_3
    return-void

    .line 177
    .end local v7    # "trustEveryone":Z
    .end local v10    # "headers":Lorg/json/JSONObject;
    .end local v11    # "params":Lorg/json/JSONObject;
    .end local v16    # "chunkedMode":Z
    .end local v17    # "objectId":Ljava/lang/String;
    :cond_1
    const/4 v3, 0x5

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    goto/16 :goto_0

    .line 180
    .restart local v7    # "trustEveryone":Z
    .restart local v11    # "params":Lorg/json/JSONObject;
    :cond_2
    const/16 v16, 0x0

    goto/16 :goto_1

    .line 182
    .restart local v16    # "chunkedMode":Z
    :cond_3
    const/16 v3, 0x8

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    goto/16 :goto_2

    .line 197
    .restart local v10    # "headers":Lorg/json/JSONObject;
    .restart local v17    # "objectId":Ljava/lang/String;
    :catch_0
    move-exception v18

    .line 198
    .local v18, "e":Ljava/net/MalformedURLException;
    sget v3, Lorg/apache/cordova/FileTransfer;->INVALID_URL_ERR:I

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v3, v0, v1, v4}, Lorg/apache/cordova/FileTransfer;->createFileTransferError(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/json/JSONObject;

    move-result-object v19

    .line 199
    .local v19, "error":Lorg/json/JSONObject;
    const-string v3, "FileTransfer"

    invoke-virtual/range {v19 .. v19}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v18

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 200
    new-instance v3, Lorg/apache/cordova/api/PluginResult;

    sget-object v4, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v19

    invoke-direct {v3, v4, v0}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    move-object/from16 v0, p4

    invoke-virtual {v0, v3}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_3

    .line 208
    .end local v18    # "e":Ljava/net/MalformedURLException;
    .end local v19    # "error":Lorg/json/JSONObject;
    .restart local v5    # "context":Lorg/apache/cordova/FileTransfer$RequestContext;
    .restart local v6    # "useHttps":Z
    .restart local v8    # "url":Ljava/net/URL;
    :catchall_0
    move-exception v3

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v3
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
    .locals 8
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 133
    const-string v6, "upload"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "download"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 134
    :cond_0
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 135
    .local v2, "source":Ljava/lang/String;
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 137
    .local v3, "target":Ljava/lang/String;
    const-string v5, "upload"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 139
    :try_start_0
    const-string v5, "UTF-8"

    invoke-static {v2, v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 140
    invoke-direct {p0, v2, v3, p2, p3}, Lorg/apache/cordova/FileTransfer;->upload(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .end local v2    # "source":Ljava/lang/String;
    .end local v3    # "target":Ljava/lang/String;
    :goto_0
    return v4

    .line 141
    .restart local v2    # "source":Ljava/lang/String;
    .restart local v3    # "target":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 142
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v5, Lorg/apache/cordova/api/PluginResult;

    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->MALFORMED_URL_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v7, "UTF-8 error."

    invoke-direct {v5, v6, v7}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_0

    .line 145
    .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
    :cond_1
    invoke-direct {p0, v2, v3, p2, p3}, Lorg/apache/cordova/FileTransfer;->download(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)V

    goto :goto_0

    .line 148
    .end local v2    # "source":Ljava/lang/String;
    .end local v3    # "target":Ljava/lang/String;
    :cond_2
    const-string v6, "abort"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 149
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 150
    .local v1, "objectId":Ljava/lang/String;
    invoke-direct {p0, v1}, Lorg/apache/cordova/FileTransfer;->abort(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p3}, Lorg/apache/cordova/api/CallbackContext;->success()V

    goto :goto_0

    .end local v1    # "objectId":Ljava/lang/String;
    :cond_3
    move v4, v5

    .line 154
    goto :goto_0
.end method
