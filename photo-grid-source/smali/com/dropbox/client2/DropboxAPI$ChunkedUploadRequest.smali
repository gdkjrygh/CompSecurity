.class public final Lcom/dropbox/client2/DropboxAPI$ChunkedUploadRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final request:Lorg/apache/http/client/methods/HttpUriRequest;

.field private final session:Lcom/dropbox/client2/session/Session;


# direct methods
.method protected constructor <init>(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/dropbox/client2/session/Session;)V
    .locals 0

    .prologue
    .line 1195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1196
    iput-object p1, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadRequest;->request:Lorg/apache/http/client/methods/HttpUriRequest;

    .line 1197
    iput-object p2, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadRequest;->session:Lcom/dropbox/client2/session/Session;

    .line 1198
    return-void
.end method


# virtual methods
.method public final abort()V
    .locals 1

    .prologue
    .line 1205
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadRequest;->request:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V

    .line 1206
    return-void
.end method

.method public final upload()Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;
    .locals 4

    .prologue
    .line 1226
    :try_start_0
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadRequest;->session:Lcom/dropbox/client2/session/Session;

    iget-object v1, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadRequest;->request:Lorg/apache/http/client/methods/HttpUriRequest;

    const v2, 0x2bf20

    invoke-static {v0, v1, v2}, Lcom/dropbox/client2/RESTUtility;->execute(Lcom/dropbox/client2/session/Session;Lorg/apache/http/client/methods/HttpUriRequest;I)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Lcom/dropbox/client2/exception/DropboxIOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1235
    invoke-static {v0}, Lcom/dropbox/client2/RESTUtility;->parseAsJSON(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 1236
    new-instance v1, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;

    invoke-direct {v1, v0}, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;-><init>(Ljava/util/Map;)V

    return-object v1

    .line 1227
    :catch_0
    move-exception v0

    .line 1228
    iget-object v1, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadRequest;->request:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v1}, Lorg/apache/http/client/methods/HttpUriRequest;->isAborted()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1229
    new-instance v0, Lcom/dropbox/client2/exception/DropboxPartialFileException;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v2, v3}, Lcom/dropbox/client2/exception/DropboxPartialFileException;-><init>(J)V

    throw v0

    .line 1231
    :cond_0
    throw v0
.end method
