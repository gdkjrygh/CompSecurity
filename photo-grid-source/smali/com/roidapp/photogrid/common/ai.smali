.class public Lcom/roidapp/photogrid/common/ai;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/photogrid/common/ai;


# instance fields
.field private b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ai;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/common/ai;
    .locals 3

    .prologue
    .line 21
    sget-object v0, Lcom/roidapp/photogrid/common/ai;->a:Lcom/roidapp/photogrid/common/ai;

    if-nez v0, :cond_1

    .line 22
    const-class v1, Lcom/roidapp/photogrid/common/ai;

    monitor-enter v1

    .line 23
    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/common/ai;->a:Lcom/roidapp/photogrid/common/ai;

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lcom/roidapp/photogrid/common/ai;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/ai;-><init>()V

    .line 25
    sput-object v0, Lcom/roidapp/photogrid/common/ai;->a:Lcom/roidapp/photogrid/common/ai;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    iput-object v2, v0, Lcom/roidapp/photogrid/common/ai;->b:Ljava/util/concurrent/ExecutorService;

    .line 27
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :cond_1
    sget-object v0, Lcom/roidapp/photogrid/common/ai;->a:Lcom/roidapp/photogrid/common/ai;

    return-object v0

    .line 27
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static c()V
    .locals 4

    .prologue
    .line 45
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/common/a;->b:Z

    if-nez v0, :cond_0

    .line 46
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    const-string v1, "com.google.ad"

    const-string v2, "209101"

    const/16 v3, 0xbba

    invoke-virtual {v0, v1, v2, v3}, Lcom/picksinit/b;->doRecommendAdViewReport(Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    :cond_0
    return-void
.end method

.method public static d()V
    .locals 4

    .prologue
    .line 51
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/common/a;->b:Z

    if-nez v0, :cond_0

    .line 52
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    const-string v1, "com.google.ad"

    const-string v2, "209101"

    const/16 v3, 0xbba

    invoke-virtual {v0, v1, v2, v3}, Lcom/picksinit/b;->doRecommendAdClickReport(Ljava/lang/String;Ljava/lang/String;I)V

    .line 54
    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ai;->b:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
