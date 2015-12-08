.class public final Lcom/roidapp/imagelib/filter/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/a/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

.field private c:Lcom/roidapp/imagelib/filter/bi;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/filter/bi;Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/a/a/b;->a:Landroid/content/Context;

    .line 33
    iput-object p3, p0, Lcom/roidapp/imagelib/filter/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    .line 34
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/a/a/b;->c:Lcom/roidapp/imagelib/filter/bi;

    .line 35
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/a/b;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/imagelib/filter/a/b;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 39
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendFilter;-><init>()V

    .line 41
    invoke-virtual {p1, v8}, Lcom/roidapp/imagelib/filter/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 42
    invoke-virtual {p1, v9}, Lcom/roidapp/imagelib/filter/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 44
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v4, v4, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    .line 45
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v6, p0, Lcom/roidapp/imagelib/filter/a/a/b;->a:Landroid/content/Context;

    const-string v7, "normal"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v5

    .line 46
    if-eqz v5, :cond_0

    .line 47
    invoke-static {v5, v3, v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 48
    invoke-virtual {v2, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 49
    sget-object v5, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v2, v5, v8, v9}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 50
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/a/a/b;->c:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v5, v2}, Lcom/roidapp/imagelib/filter/bi;->b(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 53
    :cond_0
    new-instance v5, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 54
    iget-object v6, p0, Lcom/roidapp/imagelib/filter/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v7, p0, Lcom/roidapp/imagelib/filter/a/a/b;->a:Landroid/content/Context;

    const-string v8, "overlay"

    invoke-virtual {v4, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v6

    .line 55
    if-eqz v6, :cond_1

    .line 56
    invoke-static {v6, v3, v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 57
    invoke-virtual {v5, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 58
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a/a/b;->c:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v5}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 61
    :cond_1
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 62
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v6, p0, Lcom/roidapp/imagelib/filter/a/a/b;->a:Landroid/content/Context;

    const-string v7, "acv"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 63
    if-eqz v3, :cond_2

    invoke-virtual {v0, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 64
    :cond_2
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 67
    const-string v6, "hue"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    invoke-virtual {v3, v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 69
    new-instance v6, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 70
    const-string v7, "saturation"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v4

    invoke-virtual {v6, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 72
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    return-object v1
.end method
