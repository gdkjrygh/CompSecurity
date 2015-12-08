.class final Lkik/android/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/a;


# direct methods
.method constructor <init>(Lkik/android/a;Z)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lkik/android/f;->b:Lkik/android/a;

    iput-boolean p2, p0, Lkik/android/f;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    .line 341
    iget-object v0, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->l(Lkik/android/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 342
    :try_start_0
    iget-object v0, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->m(Lkik/android/a;)Ljava/util/Iterator;

    move-result-object v0

    if-nez v0, :cond_0

    .line 343
    monitor-exit v1

    .line 377
    :goto_0
    return-void

    .line 347
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 348
    :goto_1
    iget-object v2, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v2}, Lkik/android/a;->m(Lkik/android/a;)Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0x64

    if-ge v2, v3, :cond_1

    .line 349
    iget-object v2, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v2}, Lkik/android/a;->m(Lkik/android/a;)Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 377
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 352
    :cond_1
    :try_start_1
    iget-object v2, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v2}, Lkik/android/a;->m(Lkik/android/a;)Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    .line 353
    iget-object v2, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v2}, Lkik/android/a;->n(Lkik/android/a;)Ljava/util/Iterator;

    .line 355
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_3

    .line 356
    iget-object v0, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->o(Lkik/android/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 364
    iget-object v0, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->p(Lkik/android/a;)Lkik/android/h;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/h;->a()V

    .line 365
    new-instance v0, Lkik/a/f/f/s;

    iget-object v2, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v2}, Lkik/android/a;->q(Lkik/android/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v3}, Lkik/android/a;->c(Lkik/android/a;)Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lkik/android/f;->a:Z

    iget-boolean v5, p0, Lkik/android/f;->a:Z

    invoke-direct {v0, v2, v3, v4, v5}, Lkik/a/f/f/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 366
    iget-object v2, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v2, v0}, Lkik/android/a;->b(Lkik/android/a;Lkik/a/f/f/s;)V

    .line 368
    :cond_2
    monitor-exit v1

    goto :goto_0

    .line 371
    :cond_3
    new-instance v2, Lkik/a/f/f/s;

    iget-object v3, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v3}, Lkik/android/a;->q(Lkik/android/a;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v4}, Lkik/android/a;->c(Lkik/android/a;)Ljava/lang/String;

    move-result-object v4

    iget-boolean v5, p0, Lkik/android/f;->a:Z

    iget-boolean v6, p0, Lkik/android/f;->a:Z

    invoke-direct {v2, v3, v4, v5, v6}, Lkik/a/f/f/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 372
    invoke-virtual {v2, v0}, Lkik/a/f/f/s;->a(Ljava/util/List;)V

    .line 375
    iget-object v0, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->p(Lkik/android/a;)Lkik/android/h;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/h;->a()V

    .line 376
    iget-object v0, p0, Lkik/android/f;->b:Lkik/android/a;

    invoke-static {v0, v2}, Lkik/android/a;->b(Lkik/android/a;Lkik/a/f/f/s;)V

    .line 377
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0
.end method
