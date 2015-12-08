.class public Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;
.source "SourceFile"


# static fields
.field public static final DIVIDE_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     mediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb / (textureColor2.rgb+vec3(eps)), textureColor.a*textureColor2.a);\n }"


# instance fields
.field private mEPSLocation:I

.field private mEps:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    const v0, 0x3c23d70a    # 0.01f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;-><init>(F)V

    .line 29
    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .prologue
    .line 31
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     mediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb / (textureColor2.rgb+vec3(eps)), textureColor.a*textureColor2.a);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;-><init>(Ljava/lang/String;)V

    .line 32
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->mEps:F

    .line 33
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 37
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->onInit()V

    .line 38
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->getProgram()I

    move-result v0

    const-string v1, "eps"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->mEPSLocation:I

    .line 39
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 43
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->onInitialized()V

    .line 44
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->mEps:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->setEPS(F)V

    .line 45
    return-void
.end method

.method public setEPS(F)V
    .locals 2

    .prologue
    .line 48
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->mEps:F

    .line 49
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->mEPSLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->mEps:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageDivideFilter;->setFloat(IF)V

    .line 50
    return-void
.end method
