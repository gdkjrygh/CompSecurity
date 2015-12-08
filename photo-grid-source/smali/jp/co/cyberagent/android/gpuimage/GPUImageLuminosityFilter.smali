.class public Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final LIGHTNESS_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp vec4 luminosity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb , luminosity.rgb*textureColor.a, luminosity.a), textureColor.w);\n }"


# instance fields
.field private mLuminosity:I

.field private mLuminosityLocation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>(I)V

    .line 28
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .prologue
    .line 31
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp vec4 luminosity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb , luminosity.rgb*textureColor.a, luminosity.a), textureColor.w);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosity:I

    .line 33
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 37
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 38
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->getProgram()I

    move-result v0

    const-string v1, "luminosity"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosityLocation:I

    .line 39
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 43
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 44
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosity:I

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 45
    return-void
.end method

.method public setLuminosity(I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    const/high16 v4, 0x42c80000    # 100.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 48
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosity:I

    .line 49
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    .line 50
    if-ltz p1, :cond_0

    .line 51
    aput v3, v0, v1

    .line 52
    aput v3, v0, v5

    .line 53
    const/4 v1, 0x2

    aput v3, v0, v1

    .line 54
    const/4 v1, 0x3

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosity:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    aput v2, v0, v1

    .line 55
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosityLocation:I

    invoke-virtual {p0, v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setFloatVec4(I[F)V

    .line 63
    :goto_0
    return-void

    .line 57
    :cond_0
    aput v2, v0, v1

    .line 58
    aput v2, v0, v5

    .line 59
    const/4 v1, 0x2

    aput v2, v0, v1

    .line 60
    const/4 v1, 0x3

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosity:I

    neg-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    aput v2, v0, v1

    .line 61
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->mLuminosityLocation:I

    invoke-virtual {p0, v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setFloatVec4(I[F)V

    goto :goto_0

    .line 49
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method
