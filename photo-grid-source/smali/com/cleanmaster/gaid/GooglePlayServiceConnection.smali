.class public Lcom/cleanmaster/gaid/GooglePlayServiceConnection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field CQ:Z

.field private final CR:Ljava/util/concurrent/BlockingQueue;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;->CQ:Z

    .line 15
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;->CR:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method


# virtual methods
.method public getConnectedBinder()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;->CQ:Z

    if-eqz v0, :cond_0

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 40
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;->CQ:Z

    .line 41
    iget-object v0, p0, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;->CR:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    return-object v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .prologue
    .line 22
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;->CR:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .prologue
    .line 34
    return-void
.end method
