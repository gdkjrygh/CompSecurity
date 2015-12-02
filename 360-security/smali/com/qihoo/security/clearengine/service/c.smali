.class public Lcom/qihoo/security/clearengine/service/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/clearengine/a/c;


# instance fields
.field private a:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList",
            "<",
            "Lcom/qihoo/security/clearengine/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    .line 17
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/c;->b:Ljava/lang/Object;

    .line 18
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 34
    iget-object v2, p0, Lcom/qihoo/security/clearengine/service/c;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    .line 37
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 43
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 34
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    return-void

    .line 38
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/a/c;

    invoke-interface {v0}, Lcom/qihoo/security/clearengine/a/c;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public a(I)V
    .locals 4

    .prologue
    .line 79
    iget-object v2, p0, Lcom/qihoo/security/clearengine/service/c;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 80
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    .line 82
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 88
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 79
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-void

    .line 83
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/a/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/clearengine/a/c;->a(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 85
    :catch_0
    move-exception v0

    .line 86
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public a(IILjava/lang/String;)V
    .locals 4

    .prologue
    .line 49
    iget-object v2, p0, Lcom/qihoo/security/clearengine/service/c;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 50
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    .line 52
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 58
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 49
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    return-void

    .line 53
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/a/c;

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo/security/clearengine/a/c;->a(IILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 55
    :catch_0
    move-exception v0

    .line 56
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 49
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public a(Lcom/qihoo/security/clearengine/a/c;)V
    .locals 1

    .prologue
    .line 21
    if-eqz p1, :cond_0

    .line 22
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    .line 24
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 4

    .prologue
    .line 64
    iget-object v2, p0, Lcom/qihoo/security/clearengine/service/c;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 65
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    .line 67
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 73
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 64
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    return-void

    .line 68
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/a/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/clearengine/a/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 64
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/qihoo/security/clearengine/a/c;)V
    .locals 1

    .prologue
    .line 27
    if-eqz p1, :cond_0

    .line 28
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 30
    :cond_0
    return-void
.end method
