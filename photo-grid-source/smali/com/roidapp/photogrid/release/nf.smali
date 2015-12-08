.class final Lcom/roidapp/photogrid/release/nf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/ne;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ne;II)V
    .locals 0

    .prologue
    .line 506
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iput p2, p0, Lcom/roidapp/photogrid/release/nf;->a:I

    iput p3, p0, Lcom/roidapp/photogrid/release/nf;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 511
    .line 513
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v1

    .line 514
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 515
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v2

    iget v6, p0, Lcom/roidapp/photogrid/release/nf;->a:I

    iget v7, p0, Lcom/roidapp/photogrid/release/nf;->b:I

    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 516
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 518
    :cond_0
    const/4 v0, 0x1

    move v1, v2

    .line 527
    :goto_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 528
    if-eqz v0, :cond_3

    .line 530
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ne;->b(Lcom/roidapp/photogrid/release/ne;)V

    .line 531
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 532
    const/16 v2, 0x2bf

    iput v2, v0, Landroid/os/Message;->what:I

    .line 533
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v2, v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 534
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ne;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    .line 548
    :goto_2
    return-void

    .line 522
    :cond_1
    :try_start_3
    iget-object v4, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v5, v2, 0x5

    add-int/lit8 v5, v5, 0x19

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 523
    iget-object v4, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/ne;->a(Lcom/roidapp/photogrid/release/ne;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 524
    iget-object v4, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    invoke-static {v4, v2, v0}, Lcom/roidapp/photogrid/release/ne;->a(Lcom/roidapp/photogrid/release/ne;ILandroid/graphics/Bitmap;)V

    .line 514
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 527
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0

    .line 544
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 545
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ne;->b(Lcom/roidapp/photogrid/release/ne;)V

    .line 546
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    const/16 v1, 0x8d

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    goto :goto_2

    .line 536
    :cond_3
    :try_start_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ne;->a(Lcom/roidapp/photogrid/release/ne;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 537
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 539
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nf;->c:Lcom/roidapp/photogrid/release/ne;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_1
.end method
