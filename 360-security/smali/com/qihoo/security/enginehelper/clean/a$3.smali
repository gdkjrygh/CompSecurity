.class Lcom/qihoo/security/enginehelper/clean/a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/clearengine/surface/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/enginehelper/clean/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/a;

.field private b:I

.field private c:I


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a$3;)I
    .locals 1

    .prologue
    .line 271
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->c:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 287
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    .line 288
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 289
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "scan trash start"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 291
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 292
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 294
    if-eqz v0, :cond_1

    .line 295
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$b;->a()V

    .line 298
    :cond_1
    monitor-exit v1

    .line 299
    return-void

    .line 298
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 456
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->c:I

    if-ge v0, p1, :cond_0

    .line 457
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->c:I

    .line 459
    :cond_0
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 460
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "clean trash finished"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 462
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->o(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$3$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/enginehelper/clean/a$3$4;-><init>(Lcom/qihoo/security/enginehelper/clean/a$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 495
    return-void
.end method

.method public a(IILcom/qihoo/security/clearengine/TrashType;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 430
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->c:I

    if-ge v0, p1, :cond_0

    .line 431
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->c:I

    .line 433
    :cond_0
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 434
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "clean trash progress:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 436
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->o(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$3$3;

    invoke-direct {v1, p0, p5}, Lcom/qihoo/security/enginehelper/clean/a$3$3;-><init>(Lcom/qihoo/security/enginehelper/clean/a$3;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 452
    return-void
.end method

.method public a(ILjava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 303
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v1, 0x16

    if-ne v0, v1, :cond_0

    .line 320
    :goto_0
    return-void

    .line 306
    :cond_0
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    if-ge v0, p1, :cond_1

    .line 307
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    .line 309
    :cond_1
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 310
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "scan trash progress:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 313
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 315
    if-eqz v0, :cond_3

    .line 316
    iget v2, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    invoke-interface {v0, v2, p3}, Lcom/qihoo/security/enginehelper/clean/a$b;->a(ILjava/util/Map;)V

    .line 319
    :cond_3
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(ILjava/util/Map;Lcom/qihoo/security/clearengine/sdk/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;",
            "Lcom/qihoo/security/clearengine/sdk/b;",
            ")V"
        }
    .end annotation

    .prologue
    .line 324
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    if-ge v0, p1, :cond_0

    .line 325
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    .line 327
    :cond_0
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 328
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "scan trash finished"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 330
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 331
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 332
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 333
    if-eqz v0, :cond_2

    .line 334
    iget v2, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->b:I

    invoke-interface {v0, v2, p2}, Lcom/qihoo/security/enginehelper/clean/a$b;->b(ILjava/util/Map;)V

    .line 337
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0x16

    if-ne v0, v2, :cond_3

    .line 338
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a()V

    .line 340
    :cond_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->e(Lcom/qihoo/security/enginehelper/clean/a;)[B

    move-result-object v1

    monitor-enter v1

    .line 342
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->j(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0xd

    if-ne v0, v2, :cond_4

    .line 343
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/16 v2, 0xe

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 344
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->f(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 346
    :cond_4
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 347
    return-void

    .line 340
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 346
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 351
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "get trash data finished"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->k(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->FULL:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    if-ne v0, v1, :cond_1

    .line 355
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/e;

    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v2}, Lcom/qihoo/security/enginehelper/clean/a;->l(Lcom/qihoo/security/enginehelper/clean/a;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/opti/trashclear/ui/e;)Lcom/qihoo/security/opti/trashclear/ui/e;

    .line 356
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->m(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(Ljava/util/Map;)V

    .line 359
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->o(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$3$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/enginehelper/clean/a$3$1;-><init>(Lcom/qihoo/security/enginehelper/clean/a$3;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 393
    return-void
.end method

.method public a(Z)V
    .locals 3

    .prologue
    .line 277
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "init engine finished flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    :cond_0
    if-eqz p1, :cond_1

    .line 281
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/16 v1, 0x65

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->d(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 283
    :cond_1
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 404
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->c:I

    .line 405
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "clean trash start"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 409
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->o(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$3$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/enginehelper/clean/a$3$2;-><init>(Lcom/qihoo/security/enginehelper/clean/a$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 425
    return-void
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 499
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->o(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$3$5;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/enginehelper/clean/a$3$5;-><init>(Lcom/qihoo/security/enginehelper/clean/a$3;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 547
    return-void
.end method
