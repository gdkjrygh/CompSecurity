.class public Ljp/co/cyberagent/android/gpuimage/GPUImageColourFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 9
    invoke-static {}, Ljp/co/cyberagent/android/gpuimage/GPUImageColourFilter;->createFilters()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 10
    return-void
.end method

.method private static createFilters()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation

    .prologue
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageBrightnessFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageBrightnessFilter;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    return-object v0
.end method


# virtual methods
.method public setBrightness(F)V
    .locals 2

    .prologue
    .line 22
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColourFilter;->getFilters()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageBrightnessFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageBrightnessFilter;->setBrightness(F)V

    .line 23
    return-void
.end method

.method public setContrast(F)V
    .locals 2

    .prologue
    .line 26
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColourFilter;->getFilters()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->setContrast(F)V

    .line 27
    return-void
.end method

.method public setHue(F)V
    .locals 2

    .prologue
    .line 34
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColourFilter;->getFilters()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 35
    return-void
.end method

.method public setSaturation(F)V
    .locals 2

    .prologue
    .line 30
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColourFilter;->getFilters()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 31
    return-void
.end method
