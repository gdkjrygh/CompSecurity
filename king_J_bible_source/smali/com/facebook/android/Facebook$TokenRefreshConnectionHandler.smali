.class Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;
.super Landroid/os/Handler;
.source "Facebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/android/Facebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TokenRefreshConnectionHandler"
.end annotation


# instance fields
.field connectionWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;",
            ">;"
        }
    .end annotation
.end field

.field facebookWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/facebook/android/Facebook;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;)V
    .locals 1
    .param p1, "facebook"    # Lcom/facebook/android/Facebook;
    .param p2, "connection"    # Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;

    .prologue
    .line 569
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 570
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;->facebookWeakReference:Ljava/lang/ref/WeakReference;

    .line 571
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;->connectionWeakReference:Ljava/lang/ref/WeakReference;

    .line 572
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 577
    iget-object v9, p0, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;->facebookWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v9}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/android/Facebook;

    .line 578
    .local v3, "facebook":Lcom/facebook/android/Facebook;
    iget-object v9, p0, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;->connectionWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v9}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;

    .line 579
    .local v0, "connection":Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;
    if-eqz v3, :cond_0

    if-nez v0, :cond_1

    .line 622
    :cond_0
    :goto_0
    return-void

    .line 583
    :cond_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "access_token"

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 586
    .local v8, "token":Ljava/lang/String;
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "expires_in"

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v10

    const-wide/16 v12, 0x3e8

    mul-long v4, v10, v12

    .line 588
    .local v4, "expiresAtMsecFromEpoch":J
    if-eqz v8, :cond_4

    .line 589
    invoke-virtual {v3, v8}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V

    .line 590
    invoke-virtual {v3, v4, v5}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V

    .line 592
    # getter for: Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    invoke-static {v3}, Lcom/facebook/android/Facebook;->access$1(Lcom/facebook/android/Facebook;)Lcom/facebook/Session;

    move-result-object v6

    .line 593
    .local v6, "refreshSession":Lcom/facebook/Session;
    if-eqz v6, :cond_2

    .line 596
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    invoke-static {v6, v9}, Lcom/facebook/LegacyHelper;->extendTokenCompleted(Lcom/facebook/Session;Landroid/os/Bundle;)V

    .line 599
    :cond_2
    iget-object v9, v0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    if-eqz v9, :cond_3

    .line 603
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/os/Bundle;

    .line 604
    .local v7, "resultBundle":Landroid/os/Bundle;
    const-string v9, "expires_in"

    invoke-virtual {v7, v9, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 606
    iget-object v9, v0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    invoke-interface {v9, v7}, Lcom/facebook/android/Facebook$ServiceListener;->onComplete(Landroid/os/Bundle;)V

    .line 621
    .end local v6    # "refreshSession":Lcom/facebook/Session;
    .end local v7    # "resultBundle":Landroid/os/Bundle;
    :cond_3
    :goto_1
    iget-object v9, v0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->applicationsContext:Landroid/content/Context;

    invoke-virtual {v9, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_0

    .line 608
    :cond_4
    iget-object v9, v0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    if-eqz v9, :cond_3

    .line 610
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "error"

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 611
    .local v1, "error":Ljava/lang/String;
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "error_code"

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 612
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "error_code"

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 613
    .local v2, "errorCode":I
    iget-object v9, v0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    new-instance v10, Lcom/facebook/android/FacebookError;

    const/4 v11, 0x0

    invoke-direct {v10, v1, v11, v2}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v9, v10}, Lcom/facebook/android/Facebook$ServiceListener;->onFacebookError(Lcom/facebook/android/FacebookError;)V

    goto :goto_1

    .line 615
    .end local v2    # "errorCode":I
    :cond_5
    iget-object v9, v0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    new-instance v10, Ljava/lang/Error;

    if-eqz v1, :cond_6

    .end local v1    # "error":Ljava/lang/String;
    :goto_2
    invoke-direct {v10, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    invoke-interface {v9, v10}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V

    goto :goto_1

    .restart local v1    # "error":Ljava/lang/String;
    :cond_6
    const-string v1, "Unknown service error"

    goto :goto_2
.end method
