.class public Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;
.source "SourceFile"


# static fields
.field public static final CHROMA_KEY_BLEND_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n highp float lum(lowp vec3 c) {\n     return dot(c, vec3(0.3, 0.59, 0.11));\n }\n \n lowp vec3 clipcolor(lowp vec3 c) {\n     highp float l = lum(c);\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     \n     if (n < 0.0) {\n         c.r = l + ((c.r - l) * l) / (l - n);\n         c.g = l + ((c.g - l) * l) / (l - n);\n         c.b = l + ((c.b - l) * l) / (l - n);\n     }\n     if (x > 1.0) {\n         c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n         c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n         c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n     }\n     \n     return c;\n }\n\n lowp vec3 setlum(lowp vec3 c, highp float l) {\n     highp float d = l - lum(c);\n     c = c + vec3(d);\n     return clipcolor(c);\n }\n \n void main()\n {\n   highp vec4 baseColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 overlayColor = texture2D(inputImageTexture2, textureCoordinate2);\n\n     gl_FragColor = vec4(baseColor.rgb * (1.0 - overlayColor.a) + setlum(overlayColor.rgb, lum(baseColor.rgb)) * overlayColor.a, baseColor.a);\n }"


# instance fields
.field private mColorToReplace:[F

.field private mColorToReplaceLocation:I

.field private mSmoothing:F

.field private mSmoothingLocation:I

.field private mThresholdSensitivity:F

.field private mThresholdSensitivityLocation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 76
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n highp float lum(lowp vec3 c) {\n     return dot(c, vec3(0.3, 0.59, 0.11));\n }\n \n lowp vec3 clipcolor(lowp vec3 c) {\n     highp float l = lum(c);\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     \n     if (n < 0.0) {\n         c.r = l + ((c.r - l) * l) / (l - n);\n         c.g = l + ((c.g - l) * l) / (l - n);\n         c.b = l + ((c.b - l) * l) / (l - n);\n     }\n     if (x > 1.0) {\n         c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n         c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n         c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n     }\n     \n     return c;\n }\n\n lowp vec3 setlum(lowp vec3 c, highp float l) {\n     highp float d = l - lum(c);\n     c = c + vec3(d);\n     return clipcolor(c);\n }\n \n void main()\n {\n   highp vec4 baseColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 overlayColor = texture2D(inputImageTexture2, textureCoordinate2);\n\n     gl_FragColor = vec4(baseColor.rgb * (1.0 - overlayColor.a) + setlum(overlayColor.rgb, lum(baseColor.rgb)) * overlayColor.a, baseColor.a);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;-><init>(Ljava/lang/String;)V

    .line 71
    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mSmoothing:F

    .line 72
    const v0, 0x3e99999a    # 0.3f

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mThresholdSensitivity:F

    .line 73
    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplace:[F

    .line 78
    return-void

    .line 73
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 82
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->onInit()V

    .line 83
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->getProgram()I

    move-result v0

    const-string v1, "thresholdSensitivity"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mThresholdSensitivityLocation:I

    .line 84
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->getProgram()I

    move-result v0

    const-string v1, "smoothing"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mSmoothingLocation:I

    .line 85
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->getProgram()I

    move-result v0

    const-string v1, "colorToReplace"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplaceLocation:I

    .line 86
    return-void
.end method

.method public onInitialized()V
    .locals 4

    .prologue
    .line 90
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->onInitialized()V

    .line 91
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mSmoothing:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->setSmoothing(F)V

    .line 92
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mThresholdSensitivity:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->setThresholdSensitivity(F)V

    .line 93
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplace:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplace:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplace:[F

    const/4 v3, 0x2

    aget v2, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->setColorToReplace(FFF)V

    .line 94
    return-void
.end method

.method public setColorToReplace(FFF)V
    .locals 2

    .prologue
    .line 122
    const/4 v0, 0x3

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 v1, 0x1

    aput p2, v0, v1

    const/4 v1, 0x2

    aput p3, v0, v1

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplace:[F

    .line 123
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplaceLocation:I

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mColorToReplace:[F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->setFloatVec3(I[F)V

    .line 124
    return-void
.end method

.method public setSmoothing(F)V
    .locals 2

    .prologue
    .line 101
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mSmoothing:F

    .line 102
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mSmoothingLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mSmoothing:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->setFloat(IF)V

    .line 103
    return-void
.end method

.method public setThresholdSensitivity(F)V
    .locals 2

    .prologue
    .line 110
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mThresholdSensitivity:F

    .line 111
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mThresholdSensitivityLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->mThresholdSensitivity:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageChromaKeyBlendFilter;->setFloat(IF)V

    .line 112
    return-void
.end method
