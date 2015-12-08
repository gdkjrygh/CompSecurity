.class final Lcom/roidapp/photogrid/release/nb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/na;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/na;II)V
    .locals 0

    .prologue
    .line 354
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iput p2, p0, Lcom/roidapp/photogrid/release/nb;->a:I

    iput p3, p0, Lcom/roidapp/photogrid/release/nb;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 359
    .line 361
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v1

    .line 362
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 363
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v2

    iget v6, p0, Lcom/roidapp/photogrid/release/nb;->a:I

    iget v7, p0, Lcom/roidapp/photogrid/release/nb;->b:I

    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 364
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    :cond_0
    const/4 v0, 0x1

    move v1, v2

    .line 378
    :goto_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 379
    if-eqz v0, :cond_2

    .line 381
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/na;->a(Lcom/roidapp/photogrid/release/na;)V

    .line 382
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 383
    const/16 v2, 0x2bf

    iput v2, v0, Landroid/os/Message;->what:I

    .line 384
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v2, v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 385
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/na;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    .line 399
    :goto_2
    return-void

    .line 371
    :cond_1
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v4, v2, 0x5

    add-int/lit8 v4, v4, 0x19

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 362
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 378
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0

    .line 395
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 396
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/na;->a(Lcom/roidapp/photogrid/release/na;)V

    .line 397
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    const/16 v1, 0x8d

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/na;->d(I)V

    goto :goto_2

    .line 387
    :cond_2
    :try_start_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nb;->c:Lcom/roidapp/photogrid/release/na;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 391
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_1
.end method
