.class public abstract Lb/a/a/a/a/d/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/d/n;


# instance fields
.field protected final c:Landroid/content/Context;

.field protected final d:Lb/a/a/a/a/d/d;

.field final e:Ljava/util/concurrent/ScheduledExecutorService;

.field final f:Ljava/util/concurrent/atomic/AtomicReference;

.field volatile g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lb/a/a/a/a/d/d;)V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lb/a/a/a/a/d/b;->g:I

    .line 50
    iput-object p1, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lb/a/a/a/a/d/b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 52
    iput-object p3, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    .line 53
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lb/a/a/a/a/d/b;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 54
    return-void
.end method

.method private a(JJ)V
    .locals 9

    .prologue
    .line 113
    iget-object v0, p0, Lb/a/a/a/a/d/b;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 114
    :goto_0
    if-eqz v0, :cond_0

    .line 115
    new-instance v1, Lb/a/a/a/a/d/s;

    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    invoke-direct {v1, v0, p0}, Lb/a/a/a/a/d/s;-><init>(Landroid/content/Context;Lb/a/a/a/a/d/o;)V

    .line 116
    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Scheduling time based file roll over every "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " seconds"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 119
    :try_start_0
    iget-object v7, p0, Lb/a/a/a/a/d/b;->f:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v0, p0, Lb/a/a/a/a/d/b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v2, p1

    move-wide v4, p3

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    :cond_0
    :goto_1
    return-void

    .line 113
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 122
    :catch_0
    move-exception v0

    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    const-string v1, "Failed to schedule time based file roll over"

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method protected final a(I)V
    .locals 4

    .prologue
    .line 108
    iput p1, p0, Lb/a/a/a/a/d/b;->g:I

    .line 109
    const-wide/16 v0, 0x0

    iget v2, p0, Lb/a/a/a/a/d/b;->g:I

    int-to-long v2, v2

    invoke-direct {p0, v0, v1, v2, v3}, Lb/a/a/a/a/d/b;->a(JJ)V

    .line 110
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 88
    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 90
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    invoke-virtual {v0, p1}, Lb/a/a/a/a/d/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :goto_0
    iget v0, p0, Lb/a/a/a/a/d/b;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_0

    iget v0, p0, Lb/a/a/a/a/d/b;->g:I

    int-to-long v0, v0

    iget v2, p0, Lb/a/a/a/a/d/b;->g:I

    int-to-long v2, v2

    invoke-direct {p0, v0, v1, v2, v3}, Lb/a/a/a/a/d/b;->a(JJ)V

    .line 95
    :cond_0
    return-void

    .line 92
    :catch_0
    move-exception v0

    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    const-string v1, "Failed to write event."

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 94
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b()V
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 67
    invoke-virtual {p0}, Lb/a/a/a/a/d/b;->a()Lb/a/a/a/a/d/p;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    iget-object v0, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    invoke-virtual {v0}, Lb/a/a/a/a/d/d;->e()Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    move v0, v1

    :goto_1
    :try_start_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    iget-object v1, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "attempt to send batch of %d files"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    invoke-interface {v3, v2}, Lb/a/a/a/a/d/p;->a(Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    add-int/2addr v1, v0

    :try_start_1
    iget-object v0, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    invoke-virtual {v0, v2}, Lb/a/a/a/a/d/d;->a(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v1

    :cond_2
    if-eqz v4, :cond_3

    :try_start_2
    iget-object v1, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    invoke-virtual {v1}, Lb/a/a/a/a/d/d;->e()Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    move-object v2, v1

    goto :goto_1

    :catch_0
    move-exception v1

    move-object v9, v1

    move v1, v0

    move-object v0, v9

    :goto_2
    iget-object v2, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to send batch of analytics files to server: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    move v0, v1

    :cond_3
    if-nez v0, :cond_0

    iget-object v0, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    invoke-virtual {v0}, Lb/a/a/a/a/d/d;->g()V

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    invoke-virtual {v0}, Lb/a/a/a/a/d/d;->f()V

    .line 84
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lb/a/a/a/a/d/b;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 76
    iget-object v0, p0, Lb/a/a/a/a/d/b;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 77
    iget-object v0, p0, Lb/a/a/a/a/d/b;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 79
    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 100
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/d/b;->d:Lb/a/a/a/a/d/d;

    invoke-virtual {v0}, Lb/a/a/a/a/d/d;->d()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 104
    :goto_0
    return v0

    .line 102
    :catch_0
    move-exception v0

    iget-object v0, p0, Lb/a/a/a/a/d/b;->c:Landroid/content/Context;

    const-string v1, "Failed to roll file over."

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 104
    const/4 v0, 0x0

    goto :goto_0
.end method
