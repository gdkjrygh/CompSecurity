.class Lcom/qihoo/security/clearengine/b/a$2;
.super Lcom/qihoo/security/clearengine/a/c$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/b/a;

.field private b:I

.field private c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    .line 344
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/a/c$a;-><init>()V

    .line 346
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 354
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->b:I

    .line 355
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->c(Lcom/qihoo/security/clearengine/b/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 357
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/clearengine/surface/a;->a()V

    .line 360
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 427
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 428
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;Z)V

    .line 427
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 431
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->g(Lcom/qihoo/security/clearengine/b/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 447
    :cond_0
    :goto_0
    return-void

    .line 427
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 435
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->i(Lcom/qihoo/security/clearengine/b/a;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 440
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->h(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 441
    :try_start_3
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->c(Lcom/qihoo/security/clearengine/b/a;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/d/a;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 440
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 444
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 445
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v2}, Lcom/qihoo/security/clearengine/b/a;->j(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/sdk/b;

    move-result-object v2

    invoke-interface {v1, p1, v0, v2}, Lcom/qihoo/security/clearengine/surface/a;->a(ILjava/util/Map;Lcom/qihoo/security/clearengine/sdk/b;)V

    goto :goto_0

    .line 436
    :catch_0
    move-exception v0

    .line 437
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 440
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public a(IILjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 369
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 370
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->e(Lcom/qihoo/security/clearengine/b/a;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 371
    monitor-exit v1

    .line 391
    :cond_0
    :goto_0
    return-void

    .line 369
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 377
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->f(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 378
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->g(Lcom/qihoo/security/clearengine/b/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 379
    monitor-exit v1

    goto :goto_0

    .line 377
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 369
    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 377
    :cond_2
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 382
    mul-int/lit8 v0, p1, 0x64

    div-int/2addr v0, p2

    iput v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->b:I

    .line 383
    iput-object p3, p0, Lcom/qihoo/security/clearengine/b/a$2;->c:Ljava/lang/String;

    .line 385
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->h(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 386
    :try_start_4
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->c(Lcom/qihoo/security/clearengine/b/a;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/d/a;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 385
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 388
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 389
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/clearengine/b/a$2;->b:I

    invoke-interface {v1, v2, p3, v0}, Lcom/qihoo/security/clearengine/surface/a;->a(ILjava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 385
    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method public a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 398
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 399
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->e(Lcom/qihoo/security/clearengine/b/a;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 400
    monitor-exit v1

    .line 419
    :cond_0
    :goto_0
    return-void

    .line 398
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 403
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0, p1}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 405
    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v1, 0x23

    if-ne v0, v1, :cond_2

    .line 406
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v1, "overlapPath"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 410
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 413
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->h(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 414
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->c(Lcom/qihoo/security/clearengine/b/a;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/d/a;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 413
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 416
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 417
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$2;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/clearengine/b/a$2;->b:I

    iget-object v3, p0, Lcom/qihoo/security/clearengine/b/a$2;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v3, v0}, Lcom/qihoo/security/clearengine/surface/a;->a(ILjava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 398
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 413
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method
