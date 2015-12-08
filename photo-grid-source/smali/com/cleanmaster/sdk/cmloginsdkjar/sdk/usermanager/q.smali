.class final Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;


# instance fields
.field final synthetic a:[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

.field final synthetic b:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V
    .locals 0

    .prologue
    .line 285
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/q;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/q;->a:[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V
    .locals 2

    .prologue
    .line 288
    const/16 v0, 0xc8

    .line 289
    invoke-virtual {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 291
    :try_start_0
    invoke-virtual {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    .line 302
    :cond_0
    :goto_0
    const/16 v1, 0x190

    if-le v0, v1, :cond_1

    .line 303
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>()V

    .line 304
    invoke-virtual {v1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 305
    throw v1

    .line 293
    :catch_0
    move-exception v0

    const/16 v0, 0xfc8

    .line 298
    goto :goto_0

    .line 295
    :catch_1
    move-exception v0

    const/16 v0, 0xfc9

    .line 298
    goto :goto_0

    .line 297
    :catch_2
    move-exception v0

    const/16 v0, 0xfc7

    goto :goto_0

    .line 307
    :cond_1
    invoke-virtual {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->getError()Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 308
    invoke-virtual {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->getError()Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->getException()Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    move-result-object v0

    .line 309
    if-eqz v0, :cond_2

    .line 310
    throw v0

    .line 314
    :cond_2
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/q;->a:[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 315
    return-void
.end method
