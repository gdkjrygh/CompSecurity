.class final Lcom/roidapp/photogrid/release/mr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/mq;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/mq;)V
    .locals 0

    .prologue
    .line 447
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 450
    .line 453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/mq;->a(Lcom/roidapp/photogrid/release/mq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 454
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 486
    :goto_0
    return-void

    :cond_0
    move v1, v2

    .line 457
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/mq;->a(Lcom/roidapp/photogrid/release/mq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/mq;->a(Lcom/roidapp/photogrid/release/mq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/hv;

    .line 459
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/hv;->a()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 460
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    move v2, v4

    .line 477
    :goto_2
    if-eqz v2, :cond_5

    .line 478
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 479
    const/16 v2, 0x2bf

    iput v2, v0, Landroid/os/Message;->what:I

    .line 480
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v2, v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 481
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/mq;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 465
    :cond_2
    iget-object v5, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v5

    if-ge v1, v5, :cond_4

    .line 466
    iget-object v5, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-static {v5}, Lcom/roidapp/photogrid/filter/b;->a(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v5

    iget-object v6, v0, Lcom/roidapp/photogrid/release/hv;->e:Lcom/roidapp/photogrid/release/ig;

    invoke-static {v5, v3, v6}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 467
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-eqz v5, :cond_4

    :cond_3
    move v2, v4

    .line 470
    goto :goto_2

    .line 474
    :cond_4
    iput-object v3, v0, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    .line 475
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v3, v1, 0x4

    add-int/lit8 v3, v3, 0x24

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 457
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 483
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mr;->a:Lcom/roidapp/photogrid/release/mq;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_6
    move v1, v2

    goto :goto_2
.end method
