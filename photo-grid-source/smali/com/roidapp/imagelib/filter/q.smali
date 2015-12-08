.class final Lcom/roidapp/imagelib/filter/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/c/e;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/n;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/n;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Lcom/roidapp/imagelib/c/h;)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 79
    if-nez p1, :cond_0

    move-object v0, v7

    .line 101
    :goto_0
    return-object v0

    .line 81
    :cond_0
    iget-object v0, p2, Lcom/roidapp/imagelib/c/h;->b:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 82
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 83
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 84
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    .line 1107
    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/n;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, v7

    .line 85
    :goto_1
    if-nez v0, :cond_3

    move-object v0, v7

    goto :goto_0

    .line 1108
    :cond_1
    new-instance v0, Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/n;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    .line 1109
    instance-of v1, v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v1, :cond_2

    move-object v1, v6

    .line 1110
    check-cast v1, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    new-instance v4, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v4}, Lcom/roidapp/imagelib/b/b;-><init>()V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    goto :goto_1

    .line 1112
    :cond_2
    invoke-interface {v6}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    new-instance v4, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v4}, Lcom/roidapp/imagelib/b/b;-><init>()V

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    goto :goto_1

    .line 86
    :cond_3
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/n;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    if-nez v1, :cond_4

    .line 88
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    new-instance v4, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-direct {v4, v2, v3}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;-><init>(II)V

    iput-object v4, v1, Lcom/roidapp/imagelib/filter/n;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/n;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v1, p1, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageThumbnailBitmap(Landroid/graphics/Bitmap;Z)V

    .line 97
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/n;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v2, v2, Lcom/roidapp/imagelib/filter/n;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 99
    :cond_4
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    invoke-interface {v6}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/filter/n;->a(I)V

    .line 100
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/n;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 101
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/q;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/n;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 90
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    const-string v1, "width:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " height:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    const-string v2, "ImageFilterView/bitmapHandler/handle/"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    move-object v0, v7

    .line 94
    goto/16 :goto_0
.end method
