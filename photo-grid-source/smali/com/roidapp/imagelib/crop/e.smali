.class final Lcom/roidapp/imagelib/crop/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/d;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/d;)V
    .locals 0

    .prologue
    .line 514
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/e;->a:Lcom/roidapp/imagelib/crop/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .prologue
    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 522
    iget-object v8, p0, Lcom/roidapp/imagelib/crop/e;->a:Lcom/roidapp/imagelib/crop/d;

    .line 1407
    new-instance v0, Lcom/roidapp/imagelib/crop/h;

    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/crop/h;-><init>(Landroid/view/View;)V

    .line 1409
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->a(Lcom/roidapp/imagelib/crop/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 1410
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->a(Lcom/roidapp/imagelib/crop/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 1412
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v7, v7, v5, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1416
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1419
    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->d(Lcom/roidapp/imagelib/crop/a;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1420
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->e(Lcom/roidapp/imagelib/crop/a;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1422
    int-to-float v1, v5

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->f(Lcom/roidapp/imagelib/crop/a;)F

    move-result v4

    div-float/2addr v1, v4

    float-to-int v1, v1

    .line 1423
    if-le v1, v3, :cond_c

    .line 1426
    int-to-float v1, v3

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->f(Lcom/roidapp/imagelib/crop/a;)F

    move-result v4

    mul-float/2addr v1, v4

    float-to-int v4, v1

    move v1, v3

    .line 1469
    :cond_0
    :goto_0
    sub-int/2addr v5, v4

    div-int/lit8 v5, v5, 0x2

    .line 1470
    sub-int/2addr v3, v1

    div-int/lit8 v9, v3, 0x2

    .line 1472
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v10, v5

    int-to-float v11, v9

    add-int/2addr v4, v5

    int-to-float v4, v4

    add-int/2addr v1, v9

    int-to-float v1, v1

    invoke-direct {v3, v10, v11, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1473
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    new-instance v4, Landroid/graphics/Rect;

    iget v5, v3, Landroid/graphics/RectF;->left:F

    float-to-int v5, v5

    iget v9, v3, Landroid/graphics/RectF;->top:F

    float-to-int v9, v9

    iget v10, v3, Landroid/graphics/RectF;->right:F

    float-to-int v10, v10

    iget v11, v3, Landroid/graphics/RectF;->bottom:F

    float-to-int v11, v11

    invoke-direct {v4, v5, v9, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-static {v1, v4}, Lcom/roidapp/imagelib/crop/a;->a(Lcom/roidapp/imagelib/crop/a;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 1474
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->d(Lcom/roidapp/imagelib/crop/a;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1475
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->b:Landroid/graphics/Matrix;

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->i(Lcom/roidapp/imagelib/crop/a;)Z

    move-result v4

    iget-object v5, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v5}, Lcom/roidapp/imagelib/crop/a;->j(Lcom/roidapp/imagelib/crop/a;)Z

    move-result v5

    if-nez v5, :cond_5

    move v5, v6

    :goto_1
    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/crop/h;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZ)V

    .line 1480
    :goto_2
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v1

    .line 2324
    iget-object v2, v1, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2325
    invoke-virtual {v1}, Lcom/roidapp/imagelib/crop/CropImageView;->invalidate()V

    .line 524
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/e;->a:Lcom/roidapp/imagelib/crop/d;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->invalidate()V

    .line 525
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/e;->a:Lcom/roidapp/imagelib/crop/d;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v6, :cond_1

    .line 526
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/e;->a:Lcom/roidapp/imagelib/crop/d;

    iget-object v1, v0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/e;->a:Lcom/roidapp/imagelib/crop/d;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    iput-object v0, v1, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    .line 527
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/e;->a:Lcom/roidapp/imagelib/crop/d;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    .line 3046
    iput-boolean v6, v0, Lcom/roidapp/imagelib/crop/h;->b:Z

    .line 536
    :cond_1
    return-void

    .line 1430
    :cond_2
    int-to-float v1, v3

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->f(Lcom/roidapp/imagelib/crop/a;)F

    move-result v4

    mul-float/2addr v1, v4

    float-to-int v4, v1

    .line 1431
    if-le v4, v5, :cond_b

    .line 1434
    int-to-float v1, v5

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->f(Lcom/roidapp/imagelib/crop/a;)F

    move-result v4

    div-float/2addr v1, v4

    float-to-int v1, v1

    move v4, v5

    goto/16 :goto_0

    .line 1438
    :cond_3
    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v4

    if-eqz v4, :cond_a

    .line 1439
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v1

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v4

    if-le v1, v4, :cond_4

    .line 1441
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v1

    mul-int/2addr v1, v5

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v4

    div-int/2addr v1, v4

    .line 1443
    if-le v1, v3, :cond_9

    .line 1446
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v1

    mul-int/2addr v1, v3

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v4

    div-int/2addr v1, v4

    move v4, v1

    move v1, v3

    .line 1461
    :goto_3
    iget-object v9, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v9}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v9

    if-nez v9, :cond_0

    iget-object v9, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v9}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v9

    if-nez v9, :cond_0

    .line 1463
    mul-int/lit8 v1, v4, 0x4

    div-int/lit8 v1, v1, 0x5

    move v4, v1

    .line 1464
    goto/16 :goto_0

    .line 1451
    :cond_4
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v1

    mul-int/2addr v1, v3

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v4

    div-int/2addr v1, v4

    .line 1453
    if-le v1, v5, :cond_8

    .line 1456
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v1

    mul-int/2addr v1, v5

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v4

    div-int/2addr v1, v4

    move v4, v5

    goto :goto_3

    :cond_5
    move v5, v7

    .line 1475
    goto/16 :goto_1

    .line 1477
    :cond_6
    iget-object v1, v8, Lcom/roidapp/imagelib/crop/d;->b:Landroid/graphics/Matrix;

    iget-object v4, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/crop/a;->i(Lcom/roidapp/imagelib/crop/a;)Z

    move-result v4

    iget-object v5, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v5}, Lcom/roidapp/imagelib/crop/a;->g(Lcom/roidapp/imagelib/crop/a;)I

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v8, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v5}, Lcom/roidapp/imagelib/crop/a;->h(Lcom/roidapp/imagelib/crop/a;)I

    move-result v5

    if-eqz v5, :cond_7

    move v5, v6

    :goto_4
    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/crop/h;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZ)V

    goto/16 :goto_2

    :cond_7
    move v5, v7

    goto :goto_4

    :cond_8
    move v4, v1

    move v1, v3

    goto :goto_3

    :cond_9
    move v4, v5

    goto :goto_3

    :cond_a
    move v4, v1

    goto :goto_3

    :cond_b
    move v1, v3

    goto/16 :goto_0

    :cond_c
    move v4, v5

    goto/16 :goto_0
.end method
