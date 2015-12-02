.class Lcom/qihoo/security/clearengine/b/a$3;
.super Lcom/qihoo/security/clearengine/a/b$a;
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


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    .line 450
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/a/b$a;-><init>()V

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
    .line 457
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 458
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/clearengine/surface/a;->b()V

    .line 460
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
    .line 492
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 493
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;Z)V

    .line 492
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 496
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qihoo/security/clearengine/surface/a;->a(I)V

    .line 498
    :cond_0
    return-void

    .line 492
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(IILcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 468
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 469
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->e(Lcom/qihoo/security/clearengine/b/a;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 470
    monitor-exit v1

    .line 485
    :cond_0
    :goto_0
    return-void

    .line 468
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 475
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0, p3}, Lcom/qihoo/security/clearengine/b/a;->c(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 477
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->h(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 478
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->c(Lcom/qihoo/security/clearengine/b/a;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/d/a;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    .line 477
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 481
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$3;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v0

    iget v1, p3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-static {v1}, Lcom/qihoo/security/clearengine/TrashType;->getTrashType(I)Lcom/qihoo/security/clearengine/TrashType;

    move-result-object v3

    move v1, p1

    move v2, p2

    move-object v4, p3

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/clearengine/surface/a;->a(IILcom/qihoo/security/clearengine/TrashType;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Ljava/util/Map;)V

    goto :goto_0

    .line 468
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 477
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method
