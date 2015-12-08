.class Lorg/chromium/media/MediaDrmBridge$PostRequestTask;
.super Landroid/os/AsyncTask;
.source "MediaDrmBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/MediaDrmBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PostRequestTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "PostRequestTask"


# instance fields
.field private mDrmRequest:[B

.field private mResponseBody:[B

.field final synthetic this$0:Lorg/chromium/media/MediaDrmBridge;


# direct methods
.method public constructor <init>(Lorg/chromium/media/MediaDrmBridge;[B)V
    .locals 0
    .param p2, "drmRequest"    # [B

    .prologue
    .line 838
    iput-object p1, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->this$0:Lorg/chromium/media/MediaDrmBridge;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 839
    iput-object p2, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->mDrmRequest:[B

    .line 840
    return-void
.end method

.method private postRequest(Ljava/lang/String;[B)[B
    .locals 9
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "drmRequest"    # [B

    .prologue
    const/4 v4, 0x0

    .line 852
    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 853
    .local v1, "httpClient":Lorg/apache/http/client/HttpClient;
    new-instance v2, Lorg/apache/http/client/methods/HttpPost;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&signedRequest="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, p2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 855
    .local v2, "httpPost":Lorg/apache/http/client/methods/HttpPost;
    const-string v6, "PostRequestTask"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PostRequest:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpPost;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 858
    :try_start_0
    const-string v6, "Accept"

    const-string v7, "*/*"

    invoke-virtual {v2, v6, v7}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    const-string v6, "User-Agent"

    const-string v7, "Widevine CDM v1.0"

    invoke-virtual {v2, v6, v7}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 860
    const-string v6, "Content-Type"

    const-string v7, "application/json"

    invoke-virtual {v2, v6, v7}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 863
    invoke-interface {v1, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 866
    .local v3, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v5

    .line 867
    .local v5, "responseCode":I
    const/16 v6, 0xc8

    if-ne v5, v6, :cond_0

    .line 868
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v6

    invoke-static {v6}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B

    move-result-object v4

    .line 879
    .end local v3    # "response":Lorg/apache/http/HttpResponse;
    .end local v5    # "responseCode":I
    :goto_0
    return-object v4

    .line 870
    .restart local v3    # "response":Lorg/apache/http/HttpResponse;
    .restart local v5    # "responseCode":I
    :cond_0
    const-string v6, "PostRequestTask"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Server returned HTTP error code "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 874
    .end local v3    # "response":Lorg/apache/http/HttpResponse;
    .end local v5    # "responseCode":I
    :catch_0
    move-exception v0

    .line 875
    .local v0, "e":Lorg/apache/http/client/ClientProtocolException;
    invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    goto :goto_0

    .line 876
    .end local v0    # "e":Lorg/apache/http/client/ClientProtocolException;
    :catch_1
    move-exception v0

    .line 877
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 832
    check-cast p1, [Ljava/lang/String;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Void;
    .locals 3
    .param p1, "urls"    # [Ljava/lang/String;

    .prologue
    .line 844
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iget-object v1, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->mDrmRequest:[B

    invoke-direct {p0, v0, v1}, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->postRequest(Ljava/lang/String;[B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->mResponseBody:[B

    .line 845
    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->mResponseBody:[B

    if-eqz v0, :cond_0

    .line 846
    const-string v0, "PostRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response length="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->mResponseBody:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 848
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 832
    check-cast p1, Ljava/lang/Void;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 2
    .param p1, "v"    # Ljava/lang/Void;

    .prologue
    .line 884
    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->this$0:Lorg/chromium/media/MediaDrmBridge;

    iget-object v1, p0, Lorg/chromium/media/MediaDrmBridge$PostRequestTask;->mResponseBody:[B

    # invokes: Lorg/chromium/media/MediaDrmBridge;->onProvisionResponse([B)V
    invoke-static {v0, v1}, Lorg/chromium/media/MediaDrmBridge;->access$2000(Lorg/chromium/media/MediaDrmBridge;[B)V

    .line 885
    return-void
.end method
