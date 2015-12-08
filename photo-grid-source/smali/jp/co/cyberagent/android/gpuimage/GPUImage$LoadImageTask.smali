.class abstract Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

.field private mOutputHeight:I

.field private mOutputWidth:I

.field private final mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;


# direct methods
.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V
    .locals 0

    .prologue
    .line 758
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 759
    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    .line 760
    iput-object p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    .line 761
    return-void
.end method

.method private checkSize(ZZ)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 881
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;
    invoke-static {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$600(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    move-result-object v2

    sget-object v3, Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;->CENTER_CROP:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    if-ne v2, v3, :cond_2

    .line 882
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 884
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 882
    goto :goto_0

    .line 884
    :cond_2
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method private getScaleSize(II)[I
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 864
    int-to-float v0, p1

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputWidth:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 865
    int-to-float v1, p2

    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputHeight:I

    int-to-float v4, v4

    div-float/2addr v1, v4

    .line 867
    iget-object v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;
    invoke-static {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$600(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    move-result-object v4

    sget-object v5, Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;->CENTER_CROP:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    if-ne v4, v5, :cond_1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    move v0, v2

    .line 870
    :goto_0
    if-eqz v0, :cond_3

    .line 871
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputHeight:I

    int-to-float v0, v0

    .line 872
    int-to-float v1, p2

    div-float v1, v0, v1

    int-to-float v4, p1

    mul-float/2addr v1, v4

    .line 877
    :goto_1
    const/4 v4, 0x2

    new-array v4, v4, [I

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    aput v1, v4, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    aput v0, v4, v2

    return-object v4

    :cond_0
    move v0, v3

    .line 867
    goto :goto_0

    :cond_1
    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v3

    goto :goto_0

    .line 874
    :cond_3
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputWidth:I

    int-to-float v1, v0

    .line 875
    int-to-float v0, p1

    div-float v0, v1, v0

    int-to-float v4, p2

    mul-float/2addr v0, v4

    goto :goto_1
.end method

.method private loadResizedImage()Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    .line 801
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 802
    iput-boolean v1, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 803
    invoke-virtual {p0, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->decode(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move v0, v1

    .line 805
    :goto_0
    iget v2, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/2addr v2, v0

    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputWidth:I

    if-le v2, v4, :cond_0

    move v2, v1

    :goto_1
    iget v4, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v4, v0

    iget v6, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputHeight:I

    if-le v4, v6, :cond_1

    move v4, v1

    :goto_2
    invoke-direct {p0, v2, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->checkSize(ZZ)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 806
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    .line 805
    goto :goto_1

    :cond_1
    move v4, v3

    goto :goto_2

    .line 809
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 810
    if-gtz v0, :cond_3

    move v0, v1

    .line 813
    :cond_3
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 814
    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 815
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 816
    iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 817
    const v0, 0x8000

    new-array v0, v0, [B

    iput-object v0, v2, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 818
    invoke-virtual {p0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->decode(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 819
    if-nez v0, :cond_4

    .line 820
    const/4 v0, 0x0

    .line 824
    :goto_3
    return-object v0

    .line 822
    :cond_4
    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->rotateImage(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_3
.end method

.method private rotateImage(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    .line 889
    if-nez p1, :cond_1

    .line 890
    const/4 p1, 0x0

    .line 905
    :cond_0
    :goto_0
    return-object p1

    .line 894
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->getImageOrientation()I

    move-result v0

    .line 895
    if-eqz v0, :cond_0

    .line 896
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 897
    int-to-float v0, v0

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 898
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 900
    :try_start_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-object p1, v0

    goto :goto_0

    .line 903
    :catch_0
    move-exception v0

    :goto_1
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v1

    move-object p1, v0

    move-object v0, v1

    goto :goto_1
.end method

.method private scaleBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 829
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 830
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 831
    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->getScaleSize(II)[I

    move-result-object v1

    .line 832
    aget v0, v1, v5

    aget v2, v1, v6

    invoke-static {p1, v0, v2, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 833
    if-eq v0, p1, :cond_0

    .line 834
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    move-object p1, v0

    .line 836
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 839
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$600(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    move-result-object v0

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;->CENTER_CROP:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    if-ne v0, v2, :cond_1

    .line 841
    aget v0, v1, v5

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputWidth:I

    sub-int/2addr v0, v2

    .line 842
    aget v2, v1, v6

    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputHeight:I

    sub-int/2addr v2, v3

    .line 843
    div-int/lit8 v3, v0, 0x2

    div-int/lit8 v4, v2, 0x2

    aget v5, v1, v5

    sub-int v0, v5, v0

    aget v1, v1, v6

    sub-int/2addr v1, v2

    invoke-static {p1, v3, v4, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 845
    if-eq v0, p1, :cond_1

    .line 846
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    move-object p1, v0

    .line 851
    :cond_1
    return-object p1
.end method


# virtual methods
.method protected abstract decode(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
.end method

.method protected abstract getImageOrientation()I
.end method

.method public run()V
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 765
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->getFrameWidth()I

    move-result v0

    if-nez v0, :cond_0

    .line 767
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 768
    :try_start_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 769
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 774
    :cond_0
    :goto_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # invokes: Ljp/co/cyberagent/android/gpuimage/GPUImage;->getOutputWidth()I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImage;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputWidth:I

    .line 775
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # invokes: Ljp/co/cyberagent/android/gpuimage/GPUImage;->getOutputHeight()I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$500(Ljp/co/cyberagent/android/gpuimage/GPUImage;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mOutputHeight:I

    .line 777
    :try_start_2
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->loadResizedImage()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 778
    if-nez v0, :cond_2

    .line 779
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    if-eqz v0, :cond_1

    .line 780
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The image should not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-interface {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;->onImageLoadDone(Ljava/lang/Throwable;II)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    .line 796
    :cond_1
    :goto_1
    return-void

    .line 769
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 771
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 785
    :cond_2
    :try_start_5
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Landroid/graphics/Bitmap;)V

    .line 787
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    if-eqz v1, :cond_1

    .line 788
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-interface {v1, v2, v3, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;->onImageLoadDone(Ljava/lang/Throwable;II)V
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    .line 790
    :catch_1
    move-exception v0

    .line 791
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 792
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    if-eqz v1, :cond_1

    .line 793
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    invoke-interface {v1, v0, v4, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;->onImageLoadDone(Ljava/lang/Throwable;II)V

    goto :goto_1
.end method
