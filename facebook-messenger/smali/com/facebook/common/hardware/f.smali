.class public Lcom/facebook/common/hardware/f;
.super Ljava/lang/Object;
.source "CellRadioWakeupManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/telephony/TelephonyManager;

.field private final c:Ljava/util/concurrent/ExecutorService;

.field private final d:Landroid/telephony/PhoneStateListener;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/common/hardware/h;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/common/hardware/f;

    sput-object v0, Lcom/facebook/common/hardware/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lcom/facebook/common/hardware/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/common/hardware/i;-><init>(Lcom/facebook/common/hardware/f;Lcom/facebook/common/hardware/g;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/f;->d:Landroid/telephony/PhoneStateListener;

    .line 47
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/hardware/f;->e:Ljava/util/Map;

    .line 52
    iput-object p1, p0, Lcom/facebook/common/hardware/f;->b:Landroid/telephony/TelephonyManager;

    .line 53
    iput-object p2, p0, Lcom/facebook/common/hardware/f;->c:Ljava/util/concurrent/ExecutorService;

    .line 54
    return-void
.end method

.method private declared-synchronized a()V
    .locals 4

    .prologue
    .line 105
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/hardware/f;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/h;

    .line 106
    iget-object v2, p0, Lcom/facebook/common/hardware/f;->c:Ljava/util/concurrent/ExecutorService;

    iget-object v3, p0, Lcom/facebook/common/hardware/f;->e:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 105
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 108
    :cond_0
    monitor-exit p0

    return-void
.end method

.method static synthetic a(Lcom/facebook/common/hardware/f;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/common/hardware/f;->a()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/facebook/common/hardware/h;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 89
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    iget-object v1, p0, Lcom/facebook/common/hardware/f;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_0

    .line 98
    :goto_0
    monitor-exit p0

    return v0

    .line 93
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/hardware/f;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    iget-object v0, p0, Lcom/facebook/common/hardware/f;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    sget-object v0, Lcom/facebook/common/hardware/f;->a:Ljava/lang/Class;

    const-string v1, "Turning off listener for cell data activity"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/facebook/common/hardware/f;->b:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/facebook/common/hardware/f;->d:Landroid/telephony/PhoneStateListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
