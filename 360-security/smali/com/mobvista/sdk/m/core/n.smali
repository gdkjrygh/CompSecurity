.class final Lcom/mobvista/sdk/m/core/n;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field a:Z

.field final synthetic b:Lcom/mobvista/sdk/m/core/l;

.field private final c:Ljava/util/concurrent/LinkedBlockingQueue;


# direct methods
.method private constructor <init>(Lcom/mobvista/sdk/m/core/l;)V
    .locals 2

    .prologue
    .line 70
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/n;->b:Lcom/mobvista/sdk/m/core/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/n;->a:Z

    .line 73
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/n;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method synthetic constructor <init>(Lcom/mobvista/sdk/m/core/l;B)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/n;-><init>(Lcom/mobvista/sdk/m/core/l;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 87
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/n;->a:Z

    if-eqz v0, :cond_0

    .line 88
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 89
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/n;->a:Z

    .line 90
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/n;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    return-object v0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .prologue
    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/n;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .prologue
    .line 84
    return-void
.end method
