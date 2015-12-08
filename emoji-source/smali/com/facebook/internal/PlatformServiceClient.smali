.class public abstract Lcom/facebook/internal/PlatformServiceClient;
.super Ljava/lang/Object;
.source "PlatformServiceClient.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/PlatformServiceClient$CompletedListener;
    }
.end annotation


# instance fields
.field private final applicationId:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;

.field private listener:Lcom/facebook/internal/PlatformServiceClient$CompletedListener;

.field private final protocolVersion:I

.field private replyMessage:I

.field private requestMessage:I

.field private running:Z

.field private sender:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroid/content/Context;IIILjava/lang/String;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "requestMessage"    # I
    .param p3, "replyMessage"    # I
    .param p4, "protocolVersion"    # I
    .param p5, "applicationId"    # Ljava/lang/String;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 45
    .local v0, "applicationContext":Landroid/content/Context;
    if-eqz v0, :cond_0

    .end local v0    # "applicationContext":Landroid/content/Context;
    :goto_0
    iput-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;

    .line 46
    iput p2, p0, Lcom/facebook/internal/PlatformServiceClient;->requestMessage:I

    .line 47
    iput p3, p0, Lcom/facebook/internal/PlatformServiceClient;->replyMessage:I

    .line 48
    iput-object p5, p0, Lcom/facebook/internal/PlatformServiceClient;->applicationId:Ljava/lang/String;

    .line 49
    iput p4, p0, Lcom/facebook/internal/PlatformServiceClient;->protocolVersion:I

    .line 51
    new-instance v1, Lcom/facebook/internal/PlatformServiceClient$1;

    invoke-direct {v1, p0}, Lcom/facebook/internal/PlatformServiceClient$1;-><init>(Lcom/facebook/internal/PlatformServiceClient;)V

    iput-object v1, p0, Lcom/facebook/internal/PlatformServiceClient;->handler:Landroid/os/Handler;

    .line 57
    return-void

    .restart local v0    # "applicationContext":Landroid/content/Context;
    :cond_0
    move-object v0, p1

    .line 45
    goto :goto_0
.end method

.method private callback(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "result"    # Landroid/os/Bundle;

    .prologue
    .line 141
    iget-boolean v1, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z

    if-nez v1, :cond_1

    .line 150
    :cond_0
    :goto_0
    return-void

    .line 144
    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z

    .line 146
    iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->listener:Lcom/facebook/internal/PlatformServiceClient$CompletedListener;

    .line 147
    .local v0, "callback":Lcom/facebook/internal/PlatformServiceClient$CompletedListener;
    if-eqz v0, :cond_0

    .line 148
    invoke-interface {v0, p1}, Lcom/facebook/internal/PlatformServiceClient$CompletedListener;->completed(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private sendMessage()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 108
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 109
    .local v0, "data":Landroid/os/Bundle;
    const-string v3, "com.facebook.platform.extra.APPLICATION_ID"

    iget-object v4, p0, Lcom/facebook/internal/PlatformServiceClient;->applicationId:Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p0, v0}, Lcom/facebook/internal/PlatformServiceClient;->populateRequestBundle(Landroid/os/Bundle;)V

    .line 113
    iget v3, p0, Lcom/facebook/internal/PlatformServiceClient;->requestMessage:I

    invoke-static {v5, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v2

    .line 114
    .local v2, "request":Landroid/os/Message;
    iget v3, p0, Lcom/facebook/internal/PlatformServiceClient;->protocolVersion:I

    iput v3, v2, Landroid/os/Message;->arg1:I

    .line 115
    invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 116
    new-instance v3, Landroid/os/Messenger;

    iget-object v4, p0, Lcom/facebook/internal/PlatformServiceClient;->handler:Landroid/os/Handler;

    invoke-direct {v3, v4}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v3, v2, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 119
    :try_start_0
    iget-object v3, p0, Lcom/facebook/internal/PlatformServiceClient;->sender:Landroid/os/Messenger;

    invoke-virtual {v3, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :goto_0
    return-void

    .line 120
    :catch_0
    move-exception v1

    .line 121
    .local v1, "e":Landroid/os/RemoteException;
    invoke-direct {p0, v5}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V

    goto :goto_0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z

    .line 90
    return-void
.end method

.method protected getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;

    return-object v0
.end method

.method protected handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "message"    # Landroid/os/Message;

    .prologue
    .line 128
    iget v2, p1, Landroid/os/Message;->what:I

    iget v3, p0, Lcom/facebook/internal/PlatformServiceClient;->replyMessage:I

    if-ne v2, v3, :cond_0

    .line 129
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 130
    .local v1, "extras":Landroid/os/Bundle;
    const-string v2, "com.facebook.platform.status.ERROR_TYPE"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 131
    .local v0, "errorType":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 132
    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V

    .line 136
    :goto_0
    iget-object v2, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;

    invoke-virtual {v2, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 138
    .end local v0    # "errorType":Ljava/lang/String;
    .end local v1    # "extras":Landroid/os/Bundle;
    :cond_0
    return-void

    .line 134
    .restart local v0    # "errorType":Ljava/lang/String;
    .restart local v1    # "extras":Landroid/os/Bundle;
    :cond_1
    invoke-direct {p0, v1}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    .line 93
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->sender:Landroid/os/Messenger;

    .line 94
    invoke-direct {p0}, Lcom/facebook/internal/PlatformServiceClient;->sendMessage()V

    .line 95
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .param p1, "name"    # Landroid/content/ComponentName;

    .prologue
    const/4 v1, 0x0

    .line 98
    iput-object v1, p0, Lcom/facebook/internal/PlatformServiceClient;->sender:Landroid/os/Messenger;

    .line 100
    :try_start_0
    iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :goto_0
    invoke-direct {p0, v1}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V

    .line 105
    return-void

    .line 101
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected abstract populateRequestBundle(Landroid/os/Bundle;)V
.end method

.method public setCompletedListener(Lcom/facebook/internal/PlatformServiceClient$CompletedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/facebook/internal/PlatformServiceClient$CompletedListener;

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/internal/PlatformServiceClient;->listener:Lcom/facebook/internal/PlatformServiceClient$CompletedListener;

    .line 61
    return-void
.end method

.method public start()Z
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 68
    iget-boolean v4, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z

    if-eqz v4, :cond_1

    .line 84
    :cond_0
    :goto_0
    return v2

    .line 73
    :cond_1
    iget-object v4, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;

    iget v5, p0, Lcom/facebook/internal/PlatformServiceClient;->protocolVersion:I

    invoke-static {v4, v5}, Lcom/facebook/internal/NativeProtocol;->getLatestAvailableProtocolVersionForService(Landroid/content/Context;I)I

    move-result v0

    .line 74
    .local v0, "availableVersion":I
    const/4 v4, -0x1

    if-eq v0, v4, :cond_0

    .line 78
    iget-object v4, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;

    invoke-static {v4}, Lcom/facebook/internal/NativeProtocol;->createPlatformServiceIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    .line 79
    .local v1, "intent":Landroid/content/Intent;
    if-eqz v1, :cond_0

    .line 82
    iput-boolean v3, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z

    .line 83
    iget-object v2, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;

    invoke-virtual {v2, v1, p0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move v2, v3

    .line 84
    goto :goto_0
.end method
