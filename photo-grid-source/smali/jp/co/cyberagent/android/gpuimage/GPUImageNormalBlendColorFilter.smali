.class public Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final NORMAL_COLOR_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 screenColor;\n uniform highp float alpha;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb, screenColor.rgb, alpha), textureColor.a);\n }"


# instance fields
.field private mAlpha:F

.field private mAlphaLocation:I

.field private mColorLocation:I

.field private mColorString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 28
    const-string v0, "#000000"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;-><init>(Ljava/lang/String;F)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;F)V
    .locals 2

    .prologue
    .line 30
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 screenColor;\n uniform highp float alpha;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb, screenColor.rgb, alpha), textureColor.a);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mColorString:Ljava/lang/String;

    .line 32
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mAlpha:F

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
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->getProgram()I

    move-result v0

    const-string v1, "screenColor"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mColorLocation:I

    .line 39
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->getProgram()I

    move-result v0

    const-string v1, "alpha"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mAlphaLocation:I

    .line 40
    return-void
.end method

.method public onInitialized()V
    .locals 2

    .prologue
    .line 44
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 45
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mColorString:Ljava/lang/String;

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mAlpha:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->setColor(Ljava/lang/String;F)V

    .line 46
    return-void
.end method

.method public setColor(Ljava/lang/String;F)V
    .locals 5

    .prologue
    const/high16 v3, 0x437f0000    # 255.0f

    .line 49
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mColorString:Ljava/lang/String;

    .line 50
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mAlpha:F

    .line 51
    const-string v0, "#"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 52
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    int-to-float v1, v1

    div-float/2addr v1, v3

    .line 53
    const v2, 0xff00

    and-int/2addr v2, v0

    shr-int/lit8 v2, v2, 0x8

    int-to-float v2, v2

    div-float/2addr v2, v3

    .line 54
    and-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 55
    const/4 v3, 0x4

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v1, v3, v4

    const/4 v1, 0x1

    aput v2, v3, v1

    const/4 v1, 0x2

    aput v0, v3, v1

    const/4 v0, 0x3

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v3, v0

    .line 56
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mColorLocation:I

    invoke-virtual {p0, v0, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->setFloatVec4(I[F)V

    .line 57
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->mAlphaLocation:I

    invoke-virtual {p0, v0, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->setFloat(IF)V

    .line 58
    return-void
.end method
