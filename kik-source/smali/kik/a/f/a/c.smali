.class public final Lkik/a/f/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lorg/c/b;


# instance fields
.field a:Ljava/util/concurrent/ExecutorService;

.field b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-string v0, "KikChallengeExecutor"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/a/c;->c:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/a/c;->a:Ljava/util/concurrent/ExecutorService;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    return-void
.end method

.method public static a(Lkik/a/f/n;)Lkik/a/f/a/g;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 27
    const-string v0, "stc"

    invoke-virtual {p0, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Expected challenge"

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_0
    const-string v0, "id"

    invoke-virtual {p0, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 34
    invoke-virtual {p0}, Lkik/a/f/n;->getDepth()I

    move-result v3

    move-object v0, v1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkik/a/f/n;->a()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 35
    const-string v4, "stp"

    invoke-virtual {p0, v4}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 36
    const-string v4, "type"

    invoke-virtual {p0, v1, v4}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 37
    const-string v5, "wi"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 38
    new-instance v0, Lkik/a/f/a/h;

    invoke-direct {v0, v2}, Lkik/a/f/a/h;-><init>(Ljava/lang/String;)V

    .line 43
    :cond_2
    :goto_1
    if-eqz v0, :cond_1

    .line 44
    invoke-virtual {v0, p0}, Lkik/a/f/a/g;->a(Lkik/a/f/n;)V

    goto :goto_0

    .line 40
    :cond_3
    const-string v5, "hc"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 41
    new-instance v0, Lkik/a/f/a/e;

    invoke-direct {v0, v2}, Lkik/a/f/a/e;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 49
    :cond_4
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 87
    iget-object v1, p0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    monitor-enter v1

    .line 88
    :try_start_0
    iget-object v0, p0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/a/g;

    .line 89
    invoke-virtual {v0}, Lkik/a/f/a/g;->b()V

    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 91
    :cond_0
    :try_start_1
    iget-object v0, p0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 92
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final a(Lkik/a/f/a/g;Ljava/lang/Runnable;)V
    .locals 3

    .prologue
    .line 54
    iget-object v1, p0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    monitor-enter v1

    .line 55
    :try_start_0
    iget-object v0, p0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lkik/a/f/a/g;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/a/g;

    .line 56
    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Lkik/a/f/a/g;->b()V

    .line 59
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    iget-object v0, p0, Lkik/a/f/a/c;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lkik/a/f/a/d;

    invoke-direct {v1, p0, p1, p2}, Lkik/a/f/a/d;-><init>(Lkik/a/f/a/c;Lkik/a/f/a/g;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 83
    return-void

    .line 59
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
