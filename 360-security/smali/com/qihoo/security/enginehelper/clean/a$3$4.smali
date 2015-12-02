.class Lcom/qihoo/security/enginehelper/clean/a$3$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a$3;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/a$3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a$3;)V
    .locals 0

    .prologue
    .line 462
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 466
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v1, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 468
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 469
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$a;

    .line 470
    if-eqz v0, :cond_0

    .line 471
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$a;->c()V

    .line 472
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$a;->b()V

    .line 475
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 476
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v1, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 477
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 478
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->n(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    if-eq v0, v3, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 479
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 491
    :cond_2
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 492
    return-void

    .line 475
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 481
    :cond_3
    :try_start_3
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->n(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0x1f

    if-ne v0, v2, :cond_4

    .line 482
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->c(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 483
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->g(Lcom/qihoo/security/enginehelper/clean/a;)V

    goto :goto_0

    .line 491
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 484
    :cond_4
    :try_start_4
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0x15

    if-ne v0, v2, :cond_5

    .line 485
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 486
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->d(Lcom/qihoo/security/enginehelper/clean/a;)V

    goto :goto_0

    .line 487
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0x16

    if-ne v0, v2, :cond_2

    .line 488
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$4;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0
.end method
