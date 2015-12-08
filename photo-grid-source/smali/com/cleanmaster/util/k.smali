.class public Lcom/cleanmaster/util/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/cleanmaster/util/k;


# instance fields
.field private a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/cleanmaster/util/k;
    .locals 2

    .prologue
    .line 18
    sget-object v0, Lcom/cleanmaster/util/k;->b:Lcom/cleanmaster/util/k;

    if-nez v0, :cond_1

    .line 19
    const-class v1, Lcom/cleanmaster/util/k;

    monitor-enter v1

    .line 20
    :try_start_0
    sget-object v0, Lcom/cleanmaster/util/k;->b:Lcom/cleanmaster/util/k;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/cleanmaster/util/k;

    invoke-direct {v0}, Lcom/cleanmaster/util/k;-><init>()V

    sput-object v0, Lcom/cleanmaster/util/k;->b:Lcom/cleanmaster/util/k;

    .line 23
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :cond_1
    sget-object v0, Lcom/cleanmaster/util/k;->b:Lcom/cleanmaster/util/k;

    return-object v0

    .line 23
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 1

    .prologue
    .line 38
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 1

    .prologue
    .line 29
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    .line 32
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    .line 33
    iget-object v0, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    :cond_1
    monitor-exit p0

    return-void

    .line 29
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 45
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    .line 47
    if-eqz v0, :cond_0

    .line 48
    iget-object v1, p0, Lcom/cleanmaster/util/k;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_0
    monitor-exit p0

    return-void

    .line 45
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
