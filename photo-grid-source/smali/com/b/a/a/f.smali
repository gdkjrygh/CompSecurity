.class final Lcom/b/a/a/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/b/a/a/b;


# direct methods
.method constructor <init>(Lcom/b/a/a/b;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .prologue
    .line 130
    :try_start_0
    iget-object v0, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    invoke-static {v0}, Lcom/b/a/a/b;->a(Lcom/b/a/a/b;)Lcom/b/a/a/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/a/ac;->a()Lcom/b/a/a/aa;

    move-result-object v6

    .line 131
    iget-object v0, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    invoke-static {v0}, Lcom/b/a/a/b;->b(Lcom/b/a/a/b;)Lcom/b/a/a/h;

    move-result-object v0

    .line 1037
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 1038
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AnswersFilesManagerProvider cannot be called on the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :catch_0
    move-exception v0

    .line 137
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to enable events"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    :goto_0
    return-void

    .line 1041
    :cond_0
    :try_start_1
    new-instance v1, Lcom/b/a/a/ab;

    invoke-direct {v1}, Lcom/b/a/a/ab;-><init>()V

    .line 1042
    new-instance v2, La/a/a/a/a/b/ah;

    invoke-direct {v2}, La/a/a/a/a/b/ah;-><init>()V

    .line 1043
    iget-object v3, v0, Lcom/b/a/a/h;->b:La/a/a/a/a/f/a;

    invoke-interface {v3}, La/a/a/a/a/f/a;->a()Ljava/io/File;

    move-result-object v3

    .line 1044
    new-instance v5, La/a/a/a/a/d/m;

    iget-object v4, v0, Lcom/b/a/a/h;->a:Landroid/content/Context;

    const-string v7, "session_analytics.tap"

    const-string v8, "session_analytics_to_send"

    invoke-direct {v5, v4, v3, v7, v8}, La/a/a/a/a/d/m;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    new-instance v4, Lcom/b/a/a/t;

    iget-object v0, v0, Lcom/b/a/a/h;->a:Landroid/content/Context;

    invoke-direct {v4, v0, v1, v2, v5}, Lcom/b/a/a/t;-><init>(Landroid/content/Context;Lcom/b/a/a/ab;La/a/a/a/a/b/q;La/a/a/a/a/d/h;)V

    .line 133
    iget-object v0, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    invoke-virtual {v4, v0}, Lcom/b/a/a/t;->a(La/a/a/a/a/d/i;)V

    .line 134
    iget-object v7, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    new-instance v0, Lcom/b/a/a/m;

    iget-object v1, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    invoke-static {v1}, Lcom/b/a/a/b;->c(Lcom/b/a/a/b;)La/a/a/a/p;

    move-result-object v1

    iget-object v2, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    invoke-static {v2}, Lcom/b/a/a/b;->d(Lcom/b/a/a/b;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    iget-object v3, v3, Lcom/b/a/a/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, p0, Lcom/b/a/a/f;->a:Lcom/b/a/a/b;

    invoke-static {v5}, Lcom/b/a/a/b;->e(Lcom/b/a/a/b;)La/a/a/a/a/e/m;

    move-result-object v5

    invoke-direct/range {v0 .. v6}, Lcom/b/a/a/m;-><init>(La/a/a/a/p;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/b/a/a/t;La/a/a/a/a/e/m;Lcom/b/a/a/aa;)V

    iput-object v0, v7, Lcom/b/a/a/b;->b:Lcom/b/a/a/w;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
