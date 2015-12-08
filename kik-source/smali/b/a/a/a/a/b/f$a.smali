.class final Lb/a/a/a/a/b/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private final b:Ljava/util/concurrent/LinkedBlockingQueue;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/a/a/a/a/b/f$a;->a:Z

    .line 106
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lb/a/a/a/a/b/f$a;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lb/a/a/a/a/b/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/IBinder;
    .locals 4

    .prologue
    .line 123
    iget-boolean v0, p0, Lb/a/a/a/a/b/f$a;->a:Z

    if-eqz v0, :cond_0

    .line 124
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "getBinder already called"

    invoke-interface {v0, v1, v2}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/a/a/a/b/f$a;->a:Z

    .line 132
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/b/f$a;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    const-wide/16 v2, 0xc8

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .prologue
    .line 111
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/b/f$a;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lb/a/a/a/a/b/f$a;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 120
    return-void
.end method
