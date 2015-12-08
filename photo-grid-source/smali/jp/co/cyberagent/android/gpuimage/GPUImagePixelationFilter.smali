.class public Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final PIXELATION_FRAGMENT_SHADER:Ljava/lang/String; = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor;\nuniform float imageHeightFactor;\nuniform sampler2D inputImageTexture;\nuniform float pixel;\nvoid main()\n{\n  vec2 uv  = textureCoordinate.xy;\n  float dx = pixel * imageWidthFactor;\n  float dy = pixel * imageHeightFactor;\n  vec2 coord = vec2(dx * floor(uv.x / dx), dy * floor(uv.y / dy));\n  vec3 tc = texture2D(inputImageTexture, coord).xyz;\n  gl_FragColor = vec4(tc, 1.0);\n}"


# instance fields
.field private mImageHeightFactorLocation:I

.field private mImageWidthFactorLocation:I

.field private mPixel:F

.field private mPixelLocation:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 50
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor;\nuniform float imageHeightFactor;\nuniform sampler2D inputImageTexture;\nuniform float pixel;\nvoid main()\n{\n  vec2 uv  = textureCoordinate.xy;\n  float dx = pixel * imageWidthFactor;\n  float dy = pixel * imageHeightFactor;\n  vec2 coord = vec2(dx * floor(uv.x / dx), dy * floor(uv.y / dy));\n  vec3 tc = texture2D(inputImageTexture, coord).xyz;\n  gl_FragColor = vec4(tc, 1.0);\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mPixel:F

    .line 52
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 56
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 57
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->getProgram()I

    move-result v0

    const-string v1, "imageWidthFactor"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mImageWidthFactorLocation:I

    .line 58
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->getProgram()I

    move-result v0

    const-string v1, "imageHeightFactor"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mImageHeightFactorLocation:I

    .line 59
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->getProgram()I

    move-result v0

    const-string v1, "pixel"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mPixelLocation:I

    .line 60
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mPixel:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->setPixel(F)V

    .line 61
    return-void
.end method

.method public onOutputSizeChanged(II)V
    .locals 3

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 65
    invoke-super {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onOutputSizeChanged(II)V

    .line 66
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mImageWidthFactorLocation:I

    int-to-float v1, p1

    div-float v1, v2, v1

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->setFloat(IF)V

    .line 67
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mImageHeightFactorLocation:I

    int-to-float v1, p2

    div-float v1, v2, v1

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->setFloat(IF)V

    .line 68
    return-void
.end method

.method public setPixel(F)V
    .locals 2

    .prologue
    .line 71
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mPixel:F

    .line 72
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mPixelLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->mPixel:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImagePixelationFilter;->setFloat(IF)V

    .line 73
    return-void
.end method
