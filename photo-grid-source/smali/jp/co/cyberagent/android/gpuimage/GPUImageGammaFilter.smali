.class public Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final GAMMA_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }"


# instance fields
.field private mGamma:F

.field private mGammaLocation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    const v0, 0x3f99999a    # 1.2f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;-><init>(F)V

    .line 43
    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    .prologue
    .line 46
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->mGamma:F

    .line 48
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 52
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 53
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->getProgram()I

    move-result v0

    const-string v1, "gamma"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->mGammaLocation:I

    .line 54
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 58
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 59
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->mGamma:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->setGamma(F)V

    .line 60
    return-void
.end method

.method public setGamma(F)V
    .locals 2

    .prologue
    .line 63
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->mGamma:F

    .line 64
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->mGammaLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->mGamma:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGammaFilter;->setFloat(IF)V

    .line 65
    return-void
.end method
