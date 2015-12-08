.class final Lcom/kik/c/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/c/b;


# direct methods
.method private constructor <init>(Lcom/kik/c/b;)V
    .locals 0

    .prologue
    .line 313
    iput-object p1, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/c/b;B)V
    .locals 0

    .prologue
    .line 313
    invoke-direct {p0, p1}, Lcom/kik/c/b$a;-><init>(Lcom/kik/c/b;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 321
    iget-object v0, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-static {v0}, Lcom/kik/c/b;->a(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    monitor-enter v2

    .line 322
    :try_start_0
    iget-object v0, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-static {v0}, Lcom/kik/c/b;->b(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-static {v0}, Lcom/kik/c/b;->b(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 324
    iget-object v0, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-static {v0}, Lcom/kik/c/b;->c(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledFuture;

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-static {v0}, Lcom/kik/c/b;->d(Lcom/kik/c/b;)Ljava/io/File;

    .line 328
    iget-object v0, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-static {v0}, Lcom/kik/c/b;->e(Lcom/kik/c/b;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 329
    monitor-exit v2

    .line 330
    if-nez v3, :cond_2

    .line 350
    :cond_1
    return-void

    .line 329
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 334
    :cond_2
    new-instance v0, Lcom/kik/c/b$b;

    iget-object v2, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-direct {v0, v2, v1}, Lcom/kik/c/b$b;-><init>(Lcom/kik/c/b;B)V

    invoke-static {v3, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 337
    array-length v0, v3

    const/16 v2, 0x14

    if-le v0, v2, :cond_4

    move v0, v1

    .line 338
    :goto_0
    array-length v2, v3

    add-int/lit8 v2, v2, -0x14

    if-ge v0, v2, :cond_4

    .line 339
    aget-object v2, v3, v0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v2

    if-nez v2, :cond_3

    .line 341
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v2

    const-string v4, "Failed to delete file {}"

    aget-object v5, v3, v0

    invoke-interface {v2, v4, v5}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 338
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 346
    :cond_4
    array-length v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    array-length v2, v3

    move v0, v1

    :goto_1
    if-ge v0, v2, :cond_1

    aget-object v4, v3, v0

    .line 348
    iget-object v5, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-static {v5}, Lcom/kik/c/b;->a(Lcom/kik/c/b;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v5

    new-instance v6, Lcom/kik/c/b$c;

    iget-object v7, p0, Lcom/kik/c/b$a;->a:Lcom/kik/c/b;

    invoke-direct {v6, v7, v4, v1}, Lcom/kik/c/b$c;-><init>(Lcom/kik/c/b;Ljava/io/File;B)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 347
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method
