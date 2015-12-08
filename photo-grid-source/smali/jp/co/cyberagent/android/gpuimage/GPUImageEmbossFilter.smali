.class public Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImage3x3ConvolutionFilter;
.source "SourceFile"


# instance fields
.field private mIntensity:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;-><init>(F)V

    .line 29
    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3ConvolutionFilter;-><init>()V

    .line 33
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;->mIntensity:F

    .line 34
    return-void
.end method


# virtual methods
.method public getIntensity()F
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;->mIntensity:F

    return v0
.end method

.method public onInit()V
    .locals 1

    .prologue
    .line 38
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3ConvolutionFilter;->onInit()V

    .line 39
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;->mIntensity:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;->setIntensity(F)V

    .line 40
    return-void
.end method

.method public setIntensity(F)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 43
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;->mIntensity:F

    .line 44
    const/16 v0, 0x9

    new-array v0, v0, [F

    const/4 v1, 0x0

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v2, p1

    aput v2, v0, v1

    const/4 v1, 0x1

    neg-float v2, p1

    aput v2, v0, v1

    const/4 v1, 0x2

    aput v3, v0, v1

    const/4 v1, 0x3

    neg-float v2, p1

    aput v2, v0, v1

    const/4 v1, 0x4

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    const/4 v1, 0x5

    aput p1, v0, v1

    const/4 v1, 0x6

    aput v3, v0, v1

    const/4 v1, 0x7

    aput p1, v0, v1

    const/16 v1, 0x8

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p1

    aput v2, v0, v1

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageEmbossFilter;->setConvolutionKernel([F)V

    .line 49
    return-void
.end method
