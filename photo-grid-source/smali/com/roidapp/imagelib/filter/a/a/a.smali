.class public final Lcom/roidapp/imagelib/filter/a/a/a;
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
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/a/a/a;->a:Landroid/content/Context;

    .line 29
    iput-object p3, p0, Lcom/roidapp/imagelib/filter/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    .line 30
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/a/a/a;->c:Lcom/roidapp/imagelib/filter/bi;

    .line 31
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/a/b;)Ljava/util/List;
    .locals 8
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
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/filter/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 39
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/filter/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 41
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v3, v3, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    .line 47
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 49
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v6, p0, Lcom/roidapp/imagelib/filter/a/a/a;->a:Landroid/content/Context;

    const-string v7, "screen"

    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v5

    .line 50
    invoke-static {v5, v2, v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 51
    invoke-virtual {v4, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 52
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a/a/a;->c:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v4}, Lcom/roidapp/imagelib/filter/bi;->b(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 54
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 56
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v5, p0, Lcom/roidapp/imagelib/filter/a/a/a;->a:Landroid/content/Context;

    const-string v6, "acv"

    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v5, v3}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 68
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    return-object v1
.end method
