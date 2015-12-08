.class public Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final MONOCHROME_FRAGMENT_SHADER:Ljava/lang/String; = " precision lowp float;\n  \n  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform float intensity;\n  uniform vec3 filterColor;\n  \n  const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n  \n  void main()\n  {\n \t//desat, then apply overlay blend\n \tlowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n \tfloat luminance = dot(textureColor.rgb, luminanceWeighting);\n \t\n \tlowp vec4 desat = vec4(vec3(luminance), 1.0);\n \t\n \t//overlay\n \tlowp vec4 outputColor = vec4(\n                                  (desat.r < 0.5 ? (2.0 * desat.r * filterColor.r) : (1.0 - 2.0 * (1.0 - desat.r) * (1.0 - filterColor.r))),\n                                  (desat.g < 0.5 ? (2.0 * desat.g * filterColor.g) : (1.0 - 2.0 * (1.0 - desat.g) * (1.0 - filterColor.g))),\n                                  (desat.b < 0.5 ? (2.0 * desat.b * filterColor.b) : (1.0 - 2.0 * (1.0 - desat.b) * (1.0 - filterColor.b))),\n                                  1.0\n                                  );\n \t\n \t//which is better, or are they equal?\n \tgl_FragColor = vec4( mix(textureColor.rgb, outputColor.rgb, intensity), textureColor.a);\n  }"


# instance fields
.field private mColor:[F

.field private mFilterColorLocation:I

.field private mIntensity:F

.field private mIntensityLocation:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 64
    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x4

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;-><init>(F[F)V

    .line 65
    return-void

    .line 64
    :array_0
    .array-data 4
        0x3f19999a    # 0.6f
        0x3ee66666    # 0.45f
        0x3e99999a    # 0.3f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(F[F)V
    .locals 2

    .prologue
    .line 68
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, " precision lowp float;\n  \n  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform float intensity;\n  uniform vec3 filterColor;\n  \n  const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n  \n  void main()\n  {\n \t//desat, then apply overlay blend\n \tlowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n \tfloat luminance = dot(textureColor.rgb, luminanceWeighting);\n \t\n \tlowp vec4 desat = vec4(vec3(luminance), 1.0);\n \t\n \t//overlay\n \tlowp vec4 outputColor = vec4(\n                                  (desat.r < 0.5 ? (2.0 * desat.r * filterColor.r) : (1.0 - 2.0 * (1.0 - desat.r) * (1.0 - filterColor.r))),\n                                  (desat.g < 0.5 ? (2.0 * desat.g * filterColor.g) : (1.0 - 2.0 * (1.0 - desat.g) * (1.0 - filterColor.g))),\n                                  (desat.b < 0.5 ? (2.0 * desat.b * filterColor.b) : (1.0 - 2.0 * (1.0 - desat.b) * (1.0 - filterColor.b))),\n                                  1.0\n                                  );\n \t\n \t//which is better, or are they equal?\n \tgl_FragColor = vec4( mix(textureColor.rgb, outputColor.rgb, intensity), textureColor.a);\n  }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mIntensity:F

    .line 70
    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mColor:[F

    .line 71
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 75
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 76
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->getProgram()I

    move-result v0

    const-string v1, "intensity"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mIntensityLocation:I

    .line 77
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->getProgram()I

    move-result v0

    const-string v1, "filterColor"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mFilterColorLocation:I

    .line 78
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 82
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 83
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->setIntensity(F)V

    .line 84
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->setColor([F)V

    .line 85
    return-void

    .line 84
    :array_0
    .array-data 4
        0x3f19999a    # 0.6f
        0x3ee66666    # 0.45f
        0x3e99999a    # 0.3f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public setColor([F)V
    .locals 4

    .prologue
    .line 93
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mColor:[F

    .line 94
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mColor:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mColor:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mColor:[F

    const/4 v3, 0x2

    aget v2, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->setColorRed(FFF)V

    .line 96
    return-void
.end method

.method public setColorRed(FFF)V
    .locals 3

    .prologue
    .line 99
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mFilterColorLocation:I

    const/4 v1, 0x3

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 v2, 0x1

    aput p2, v1, v2

    const/4 v2, 0x2

    aput p3, v1, v2

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->setFloatVec3(I[F)V

    .line 100
    return-void
.end method

.method public setIntensity(F)V
    .locals 2

    .prologue
    .line 88
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mIntensity:F

    .line 89
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mIntensityLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->mIntensity:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageMonochromeFilter;->setFloat(IF)V

    .line 90
    return-void
.end method
