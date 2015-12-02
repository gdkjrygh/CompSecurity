.class public Lcom/qihoo/a/a/a/g;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/net/LocalServerSocket;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/qihoo/a/a/a/g;->a:Ljava/lang/String;

    .line 12
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 15
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/a/a/a/g;->b:Landroid/net/LocalServerSocket;

    if-nez v0, :cond_0

    .line 16
    new-instance v0, Landroid/net/LocalServerSocket;

    iget-object v1, p0, Lcom/qihoo/a/a/a/g;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/net/LocalServerSocket;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/a/a/a/g;->b:Landroid/net/LocalServerSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    return-void

    .line 18
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "tryLock but has locked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(I)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 23
    monitor-enter p0

    .line 24
    :try_start_0
    div-int/lit8 v1, p1, 0x64
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    .line 25
    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-gtz v1, :cond_0

    .line 38
    :goto_1
    monitor-exit p0

    return v0

    .line 28
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/qihoo/a/a/a/g;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    const/4 v0, 0x1

    goto :goto_1

    .line 30
    :catch_0
    move-exception v1

    .line 33
    const-wide/16 v4, 0x64

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v4, v5, v1}, Ljava/lang/Thread;->sleep(JI)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v1, v2

    .line 34
    goto :goto_0

    :catch_1
    move-exception v1

    move v1, v2

    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 1

    .prologue
    .line 58
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/a/a/a/g;->b:Landroid/net/LocalServerSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 60
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/a/a/a/g;->b:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/qihoo/a/a/a/g;->b:Landroid/net/LocalServerSocket;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    :cond_0
    monitor-exit p0

    return-void

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 61
    :catch_0
    move-exception v0

    goto :goto_0
.end method
