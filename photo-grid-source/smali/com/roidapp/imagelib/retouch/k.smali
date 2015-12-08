.class final Lcom/roidapp/imagelib/retouch/k;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

.field private b:Z

.field private c:Landroid/graphics/Bitmap;


# direct methods
.method private constructor <init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V
    .locals 0

    .prologue
    .line 528
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;B)V
    .locals 0

    .prologue
    .line 528
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/retouch/k;-><init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V

    return-void
.end method

.method private varargs a([Ljava/lang/Object;)Ljava/lang/Void;
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 547
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 548
    const/4 v1, 0x0

    :try_start_0
    aget-object v2, p1, v1

    check-cast v2, Landroid/graphics/Bitmap;

    .line 549
    const/4 v1, 0x1

    aget-object v1, p1, v1

    move-object v0, v1

    check-cast v0, Landroid/graphics/Rect;

    move-object v5, v0

    .line 550
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 551
    const v3, -0xff0100

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 552
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 553
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v3

    .line 554
    if-gtz v3, :cond_0

    .line 555
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 574
    :goto_0
    return-object v9

    .line 557
    :cond_0
    :try_start_1
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 567
    :try_start_2
    new-instance v4, Landroid/graphics/Canvas;

    iget-object v6, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    invoke-direct {v4, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 568
    div-int/lit8 v6, v3, 0x2

    int-to-float v6, v6

    div-int/lit8 v7, v3, 0x2

    int-to-float v7, v7

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v4, v6, v7, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 569
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/k;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->d(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/Inpaint;

    move-result-object v1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v5, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    .line 571
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->d(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/Inpaint;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    const/4 v4, 0x4

    new-array v4, v4, [I

    const/4 v6, 0x0

    iget v7, v5, Landroid/graphics/Rect;->left:I

    aput v7, v4, v6

    const/4 v6, 0x1

    iget v7, v5, Landroid/graphics/Rect;->right:I

    aput v7, v4, v6

    const/4 v6, 0x2

    iget v7, v5, Landroid/graphics/Rect;->top:I

    aput v7, v4, v6

    const/4 v6, 0x3

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    aput v5, v4, v6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v7

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/imagelib/retouch/Inpaint;->Inpaint(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;[IIII)V

    .line 573
    :cond_1
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 559
    :catch_0
    move-exception v1

    :try_start_3
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 560
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    .line 561
    monitor-exit v8

    goto :goto_0

    .line 563
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 564
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    .line 565
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 534
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/k;->b:Z

    return v0
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 528
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/retouch/k;->a([Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected final onCancelled()V
    .locals 1

    .prologue
    .line 593
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/retouch/k;->b:Z

    .line 594
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 528
    .line 1579
    iput-boolean v1, p0, Lcom/roidapp/imagelib/retouch/k;->b:Z

    .line 1580
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1581
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/t;->b()V

    .line 1583
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1584
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1585
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->c:Landroid/graphics/Bitmap;

    .line 1587
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->invalidate()V

    .line 1588
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/retouch/k;->cancel(Z)Z

    .line 528
    return-void
.end method

.method protected final onPreExecute()V
    .locals 1

    .prologue
    .line 539
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 540
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/k;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/t;->a()V

    .line 542
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/retouch/k;->b:Z

    .line 543
    return-void
.end method
