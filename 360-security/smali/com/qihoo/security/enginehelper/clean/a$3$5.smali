.class Lcom/qihoo/security/enginehelper/clean/a$3$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a$3;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/enginehelper/clean/a$3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a$3;I)V
    .locals 0

    .prologue
    .line 499
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iput p2, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 503
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v1, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 505
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->a:I

    packed-switch v0, :pswitch_data_0

    .line 525
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v1, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 528
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 529
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->n(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    if-eq v0, v3, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 530
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 542
    :cond_2
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 544
    return-void

    .line 508
    :pswitch_0
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 510
    if-eqz v0, :cond_0

    .line 511
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$b;->c()V

    goto :goto_0

    .line 525
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 517
    :pswitch_1
    :try_start_3
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 518
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$a;

    .line 519
    if-eqz v0, :cond_0

    .line 520
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$a;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 532
    :cond_3
    :try_start_4
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->n(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0x1f

    if-ne v0, v2, :cond_4

    .line 533
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->c(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 534
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->g(Lcom/qihoo/security/enginehelper/clean/a;)V

    goto :goto_1

    .line 542
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 535
    :cond_4
    :try_start_5
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0x15

    if-ne v0, v2, :cond_5

    .line 536
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 537
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->d(Lcom/qihoo/security/enginehelper/clean/a;)V

    goto :goto_1

    .line 538
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->i(Lcom/qihoo/security/enginehelper/clean/a;)I

    move-result v0

    const/16 v2, 0x16

    if-ne v0, v2, :cond_2

    .line 539
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$5;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_1

    .line 505
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
