.class public Ljp/co/cyberagent/android/gpuimage/GPUImageSketchFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 31
    const/4 v0, 0x0

    invoke-static {v1, v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSketchFilter;->createFilters(IIZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 32
    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 1

    .prologue
    .line 35
    invoke-static {p1, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSketchFilter;->createFilters(IIZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 36
    return-void
.end method

.method private static blurSize(II)F
    .locals 3

    .prologue
    const/4 v2, -0x1

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v0, 0x3f800000    # 1.0f

    .line 62
    if-eq p0, v2, :cond_0

    if-ne p1, v2, :cond_1

    :cond_0
    move v0, v1

    .line 71
    :goto_0
    return v0

    .line 66
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 67
    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/high16 v2, 0x44200000    # 640.0f

    div-float/2addr v1, v2

    .line 68
    cmpg-float v2, v1, v0

    if-gez v2, :cond_2

    .line 70
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "width*height="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

.method private static createFilters(IIZ)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ)",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation

    .prologue
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageGrayscaleFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGrayscaleFilter;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageColorInvertFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorInvertFilter;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-static {p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSketchFilter;->blurSize(II)F

    move-result v1

    .line 45
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;

    invoke-direct {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;

    invoke-direct {v1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;-><init>(Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    return-object v0
.end method


# virtual methods
.method public setPencilSize(F)V
    .locals 2

    .prologue
    .line 51
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSketchFilter;->getFilters()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;->setBlurSize(F)V

    .line 52
    return-void
.end method
