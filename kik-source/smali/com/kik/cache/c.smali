.class public final Lcom/kik/cache/c;
.super Lcom/kik/cache/d;
.source "SourceFile"


# instance fields
.field private a:Z

.field private final b:Lcom/kik/cache/b;

.field private final c:Lcom/kik/sdkutils/b/b;

.field private final d:Lcom/kik/cache/d;


# direct methods
.method public constructor <init>(Lcom/kik/cache/d;Lcom/kik/sdkutils/b/a;Lcom/kik/sdkutils/b/b;J)V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/kik/cache/d;-><init>(Lcom/kik/cache/d;Lcom/kik/sdkutils/b/a;)V

    .line 17
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cache/c;->a:Z

    .line 25
    new-instance v0, Lcom/kik/cache/b;

    invoke-direct {v0, p4, p5}, Lcom/kik/cache/b;-><init>(J)V

    iput-object v0, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    .line 26
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-gtz v0, :cond_0

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cache/c;->a:Z

    .line 29
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cache/c;->d:Lcom/kik/cache/d;

    .line 30
    iput-object p3, p0, Lcom/kik/cache/c;->c:Lcom/kik/sdkutils/b/b;

    .line 31
    return-void
.end method

.method private b(Ljava/lang/Object;Lcom/kik/cache/h;)Lcom/kik/cache/g;
    .locals 10

    .prologue
    .line 67
    invoke-virtual {p2}, Lcom/kik/cache/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/g;

    .line 70
    iget-object v3, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    monitor-enter v3

    .line 71
    :try_start_0
    iget-object v1, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    invoke-virtual {v1, p1}, Lcom/kik/cache/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cache/h;

    .line 73
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/kik/cache/h;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/SoftReference;

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/kik/cache/h;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {p2}, Lcom/kik/cache/h;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 74
    :cond_0
    iget-object v1, p0, Lcom/kik/cache/c;->c:Lcom/kik/sdkutils/b/b;

    invoke-virtual {p2}, Lcom/kik/cache/h;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/kik/sdkutils/b/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cache/g;

    .line 75
    if-eqz v1, :cond_1

    .line 77
    iget-object v2, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    new-instance v4, Lcom/kik/cache/h;

    new-instance v5, Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Lcom/kik/cache/g;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/Long;

    invoke-virtual {p2}, Lcom/kik/cache/h;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-direct {v6, v8, v9}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v4, v5, v6}, Lcom/kik/cache/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v4}, Lcom/kik/cache/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 80
    :cond_1
    monitor-exit v3

    .line 86
    return-object v0

    .line 80
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a(Ljava/lang/Object;)Lcom/kik/g/p;
    .locals 8

    .prologue
    .line 36
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 37
    iget-object v3, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    monitor-enter v3

    .line 38
    :try_start_0
    iget-object v0, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    invoke-virtual {v0, p1}, Lcom/kik/cache/b;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    iget-object v0, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    invoke-virtual {v0, p1}, Lcom/kik/cache/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/h;

    .line 40
    if-eqz v0, :cond_1

    .line 42
    invoke-virtual {v0}, Lcom/kik/cache/h;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 43
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_0

    .line 44
    new-instance v2, Lcom/kik/cache/h;

    new-instance v4, Lcom/kik/cache/g;

    invoke-direct {v4, v1}, Lcom/kik/cache/g;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v1, Ljava/lang/Long;

    invoke-virtual {v0}, Lcom/kik/cache/h;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {v1, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v4, v1}, Lcom/kik/cache/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    .line 60
    :goto_0
    monitor-exit v3

    .line 61
    return-object v0

    .line 47
    :cond_0
    iget-object v0, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    invoke-virtual {v0, p1}, Lcom/kik/cache/b;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Not Found"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    move-object v0, v2

    goto :goto_0

    .line 52
    :cond_1
    iget-object v0, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    invoke-virtual {v0, p1}, Lcom/kik/cache/b;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Not Found"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    move-object v0, v2

    .line 55
    goto :goto_0

    .line 57
    :cond_2
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Not Found"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    move-object v0, v2

    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic a(Ljava/lang/Object;Lcom/kik/cache/h;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0, p1, p2}, Lcom/kik/cache/c;->b(Ljava/lang/Object;Lcom/kik/cache/h;)Lcom/kik/cache/g;

    move-result-object v0

    return-object v0
.end method

.method protected final a()Ljava/util/Set;
    .locals 3

    .prologue
    .line 136
    iget-object v1, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    monitor-enter v1

    .line 138
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v2, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    invoke-virtual {v2}, Lcom/kik/cache/b;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    monitor-exit v1

    return-object v0

    .line 140
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 113
    iget-object v1, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    monitor-enter v1

    .line 114
    :try_start_0
    iget-object v0, p0, Lcom/kik/cache/c;->b:Lcom/kik/cache/b;

    invoke-virtual {v0, p1}, Lcom/kik/cache/b;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
