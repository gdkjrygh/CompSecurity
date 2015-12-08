.class final Lkik/android/chat/fragment/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/CameraFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 0

    .prologue
    .line 474
    iput-object p1, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 10
    .annotation build Landroid/annotation/TargetApi;
        value = 0xc
    .end annotation

    .prologue
    const/4 v9, 0x0

    .line 480
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->d(Lkik/android/chat/fragment/CameraFragment;)Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->f(Lkik/android/chat/fragment/CameraFragment;)V

    .line 488
    :cond_0
    if-eqz p1, :cond_4

    .line 489
    const/4 v0, 0x0

    move v8, v0

    move-object v7, v9

    :goto_0
    sget-object v0, Lkik/android/util/u;->a:[I

    array-length v0, v0

    if-ge v8, v0, :cond_2

    .line 490
    sget-object v0, Lkik/android/util/u;->a:[I

    aget v0, v0, v8

    invoke-static {p1, v0}, Lkik/android/util/u;->a([BI)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 492
    if-eqz v0, :cond_6

    .line 493
    iget-object v1, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget-object v4, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/CameraFragment;->g(Lkik/android/chat/fragment/CameraFragment;)Z

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/CameraFragment;->a(Lkik/android/chat/fragment/CameraFragment;IIZ)Lkik/android/i/d;

    move-result-object v1

    .line 497
    invoke-virtual {v1}, Lkik/android/i/d;->a()Landroid/graphics/Point;

    move-result-object v4

    .line 500
    iget-object v2, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/CameraFragment;->h(Lkik/android/chat/fragment/CameraFragment;)I

    move-result v2

    .line 502
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 503
    int-to-float v2, v2

    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 506
    iget-object v2, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/CameraFragment;->i(Lkik/android/chat/fragment/CameraFragment;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 507
    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v5, v2, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 508
    iget v2, v4, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 512
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Lkik/android/i/d;->b()Landroid/graphics/Point;

    move-result-object v2

    .line 513
    iget v1, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    iget v3, v4, Landroid/graphics/Point;->x:I

    iget v4, v4, Landroid/graphics/Point;->y:I

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 525
    :cond_2
    :goto_1
    if-nez v9, :cond_5

    .line 526
    if-eqz v7, :cond_3

    .line 527
    invoke-static {v7}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 529
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->j(Lkik/android/chat/fragment/CameraFragment;)V

    .line 530
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->k(Lkik/android/chat/fragment/CameraFragment;)V

    .line 540
    :goto_2
    return-void

    .line 515
    :catch_0
    move-exception v0

    .line 517
    :goto_3
    add-int/lit8 v1, v8, 0x1

    move v8, v1

    move-object v7, v0

    goto :goto_0

    .line 523
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Null data returned from onPictureTaken"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    move-object v7, v9

    goto :goto_1

    .line 534
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0, v9}, Lkik/android/chat/fragment/CameraFragment;->a(Lkik/android/chat/fragment/CameraFragment;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 535
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/CameraFragment;->_previewImage:Lkik/android/widget/AspectRatioImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/CameraFragment;->l(Lkik/android/chat/fragment/CameraFragment;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/widget/AspectRatioImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 536
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->k(Lkik/android/chat/fragment/CameraFragment;)V

    .line 538
    iget-object v0, p0, Lkik/android/chat/fragment/u;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->m(Lkik/android/chat/fragment/CameraFragment;)V

    goto :goto_2

    :cond_6
    move-object v0, v7

    goto :goto_3
.end method
