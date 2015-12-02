.class public Lcom/qihoo/security/service/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo/security/service/d;


# instance fields
.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Thread;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Lcom/qihoo/security/service/d$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/d$1;-><init>(Lcom/qihoo/security/service/d;)V

    iput-object v0, p0, Lcom/qihoo/security/service/d;->d:Ljava/lang/Runnable;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/service/d;->b:Ljava/util/List;

    .line 39
    return-void
.end method

.method private static final declared-synchronized a()Lcom/qihoo/security/service/d;
    .locals 2

    .prologue
    .line 30
    const-class v1, Lcom/qihoo/security/service/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/service/d;->a:Lcom/qihoo/security/service/d;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lcom/qihoo/security/service/d;

    invoke-direct {v0}, Lcom/qihoo/security/service/d;-><init>()V

    sput-object v0, Lcom/qihoo/security/service/d;->a:Lcom/qihoo/security/service/d;

    .line 34
    :cond_0
    sget-object v0, Lcom/qihoo/security/service/d;->a:Lcom/qihoo/security/service/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 30
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/service/d;)Ljava/util/List;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/qihoo/security/service/d;->b:Ljava/util/List;

    return-object v0
.end method

.method public static declared-synchronized a(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    .prologue
    .line 42
    const-class v1, Lcom/qihoo/security/service/d;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/qihoo/security/service/d;->a()Lcom/qihoo/security/service/d;

    move-result-object v0

    .line 43
    iget-object v0, v0, Lcom/qihoo/security/service/d;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    monitor-exit v1

    return-void

    .line 42
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/qihoo/security/service/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/service/d;->c:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/qihoo/security/service/d;->c:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/qihoo/security/service/d;->d:Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/qihoo/security/service/d;->c:Ljava/lang/Thread;

    .line 69
    iget-object v0, p0, Lcom/qihoo/security/service/d;->c:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 75
    :cond_1
    return-void
.end method

.method public static declared-synchronized b(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 3

    .prologue
    .line 50
    const-class v1, Lcom/qihoo/security/service/d;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/qihoo/security/service/d;->a()Lcom/qihoo/security/service/d;

    move-result-object v0

    .line 51
    iget-object v2, v0, Lcom/qihoo/security/service/d;->b:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 56
    invoke-direct {v0}, Lcom/qihoo/security/service/d;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    monitor-exit v1

    return-void

    .line 50
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
