.class public Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 8
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 9
    invoke-virtual {p0, v1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;->createFilters(II)V

    .line 10
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 13
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 14
    invoke-virtual {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;->createFilters(II)V

    .line 15
    return-void
.end method


# virtual methods
.method public blurSize(II)F
    .locals 3

    .prologue
    const/4 v2, -0x1

    const/high16 v1, 0x40800000    # 4.0f

    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    if-eq p1, v2, :cond_0

    if-ne p2, v2, :cond_1

    :cond_0
    move v0, v1

    .line 48
    :goto_0
    return v0

    .line 43
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 44
    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/high16 v2, 0x44200000    # 640.0f

    div-float/2addr v1, v2

    .line 45
    cmpg-float v2, v1, v0

    if-gez v2, :cond_2

    .line 47
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "width*height="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", blurSize = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public createFilters(II)V
    .locals 2

    .prologue
    .line 19
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageGrayscaleFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGrayscaleFilter;-><init>()V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;->addFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 20
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorInvertFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorInvertFilter;-><init>()V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;->addFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 21
    invoke-virtual {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;->blurSize(II)F

    move-result v0

    .line 22
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;

    invoke-direct {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;-><init>(F)V

    invoke-virtual {p0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;->addFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 23
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;-><init>()V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;->addFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 25
    return-void
.end method

.method public setPencilSize(F)V
    .locals 0

    .prologue
    .line 29
    return-void
.end method
