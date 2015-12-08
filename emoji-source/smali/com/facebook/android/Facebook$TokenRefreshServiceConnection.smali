.class Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;
.super Ljava/lang/Object;
.source "Facebook.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/android/Facebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TokenRefreshServiceConnection"
.end annotation


# instance fields
.field final applicationsContext:Landroid/content/Context;

.field final messageReceiver:Landroid/os/Messenger;

.field messageSender:Landroid/os/Messenger;

.field final serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

.field final synthetic this$0:Lcom/facebook/android/Facebook;


# direct methods
.method public constructor <init>(Lcom/facebook/android/Facebook;Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)V
    .locals 3
    .param p2, "applicationsContext"    # Landroid/content/Context;
    .param p3, "serviceListener"    # Lcom/facebook/android/Facebook$ServiceListener;

    .prologue
    .line 520
    iput-object p1, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->this$0:Lcom/facebook/android/Facebook;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 512
    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;

    iget-object v2, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->this$0:Lcom/facebook/android/Facebook;

    invoke-direct {v1, v2, p0}, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;-><init>(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageReceiver:Landroid/os/Messenger;

    .line 518
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;

    .line 521
    iput-object p2, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->applicationsContext:Landroid/content/Context;

    .line 522
    iput-object p3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    .line 523
    return-void
.end method

.method private refreshToken()V
    .locals 6

    .prologue
    .line 544
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 545
    .local v2, "requestData":Landroid/os/Bundle;
    const-string v3, "access_token"

    iget-object v4, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->this$0:Lcom/facebook/android/Facebook;

    # getter for: Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/android/Facebook;->access$100(Lcom/facebook/android/Facebook;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 548
    .local v1, "request":Landroid/os/Message;
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 549
    iget-object v3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageReceiver:Landroid/os/Messenger;

    iput-object v3, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 552
    :try_start_0
    iget-object v3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;

    invoke-virtual {v3, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 556
    :goto_0
    return-void

    .line 553
    :catch_0
    move-exception v0

    .line 554
    .local v0, "e":Landroid/os/RemoteException;
    iget-object v3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    new-instance v4, Ljava/lang/Error;

    const-string v5, "Service connection error"

    invoke-direct {v4, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v4}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V

    goto :goto_0
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1
    .param p1, "className"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    .line 527
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;

    .line 528
    invoke-direct {p0}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->refreshToken()V

    .line 529
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3
    .param p1, "arg"    # Landroid/content/ComponentName;

    .prologue
    .line 533
    iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    new-instance v1, Ljava/lang/Error;

    const-string v2, "Service disconnected"

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V

    .line 537
    :try_start_0
    iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->applicationsContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 541
    :goto_0
    return-void

    .line 538
    :catch_0
    move-exception v0

    goto :goto_0
.end method
