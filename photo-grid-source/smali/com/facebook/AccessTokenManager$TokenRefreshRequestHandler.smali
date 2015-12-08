.class Lcom/facebook/AccessTokenManager$TokenRefreshRequestHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private accessToken:Lcom/facebook/AccessToken;

.field private tokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;


# direct methods
.method constructor <init>(Lcom/facebook/AccessToken;Lcom/facebook/AccessTokenManager$TokenRefreshRequest;)V
    .locals 1

    .prologue
    .line 225
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 226
    iput-object p1, p0, Lcom/facebook/AccessTokenManager$TokenRefreshRequestHandler;->accessToken:Lcom/facebook/AccessToken;

    .line 227
    iput-object p2, p0, Lcom/facebook/AccessTokenManager$TokenRefreshRequestHandler;->tokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    .line 228
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 232
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 233
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/AccessTokenManager$TokenRefreshRequestHandler;->accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v0, v1}, Lcom/facebook/AccessToken;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "access_token"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/facebook/AccessTokenManager$TokenRefreshRequestHandler;->accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/AccessToken;->createFromRefresh(Lcom/facebook/AccessToken;Landroid/os/Bundle;)Lcom/facebook/AccessToken;

    move-result-object v0

    .line 236
    invoke-static {v0}, Lcom/facebook/AccessToken;->setCurrentAccessToken(Lcom/facebook/AccessToken;)V

    .line 241
    :cond_0
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/AccessTokenManager$TokenRefreshRequestHandler;->tokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 242
    iget-object v0, p0, Lcom/facebook/AccessTokenManager$TokenRefreshRequestHandler;->tokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    # invokes: Lcom/facebook/AccessTokenManager$TokenRefreshRequest;->cleanup()V
    invoke-static {v0}, Lcom/facebook/AccessTokenManager$TokenRefreshRequest;->access$200(Lcom/facebook/AccessTokenManager$TokenRefreshRequest;)V

    .line 243
    return-void
.end method
