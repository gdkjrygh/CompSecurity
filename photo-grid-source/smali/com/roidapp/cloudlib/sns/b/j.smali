.class public Lcom/roidapp/cloudlib/sns/b/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/sns/b/j;


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/j;->b:Ljava/util/Map;

    .line 29
    return-void
.end method

.method static a()Lcom/roidapp/cloudlib/sns/b/j;
    .locals 2

    .prologue
    .line 16
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/j;->a:Lcom/roidapp/cloudlib/sns/b/j;

    if-nez v0, :cond_1

    .line 17
    const-class v1, Lcom/roidapp/cloudlib/sns/b/j;

    monitor-enter v1

    .line 18
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/j;->a:Lcom/roidapp/cloudlib/sns/b/j;

    if-nez v0, :cond_0

    .line 19
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/j;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/b/j;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/j;->a:Lcom/roidapp/cloudlib/sns/b/j;

    .line 20
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/j;->a:Lcom/roidapp/cloudlib/sns/b/j;

    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/j;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/j;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    return-void
.end method

.method final b()V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/j;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 33
    return-void
.end method
