.class public Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;
.source "SourceFile"


# static fields
.field public static final GUIDECOEA_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     highp vec4 color1 = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 color2 = texture2D(inputImageTexture2, textureCoordinate2);\n     highp vec4 color3 = color1 * color1;\n     highp vec4 color4 = vec4(color2.rgb - color3.rgb, color2.a*color3.a);\n     highp vec4 color5 = vec4(color4.rgb / (color4.rgb+vec3(eps)), color4.a*color4.a);\n     gl_FragColor = color5;\n }"


# instance fields
.field private mEPSLocation:I

.field private mEps:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     highp vec4 color1 = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 color2 = texture2D(inputImageTexture2, textureCoordinate2);\n     highp vec4 color3 = color1 * color1;\n     highp vec4 color4 = vec4(color2.rgb - color3.rgb, color2.a*color3.a);\n     highp vec4 color5 = vec4(color4.rgb / (color4.rgb+vec3(eps)), color4.a*color4.a);\n     gl_FragColor = color5;\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;-><init>(Ljava/lang/String;)V

    .line 32
    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .prologue
    .line 35
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     highp vec4 color1 = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 color2 = texture2D(inputImageTexture2, textureCoordinate2);\n     highp vec4 color3 = color1 * color1;\n     highp vec4 color4 = vec4(color2.rgb - color3.rgb, color2.a*color3.a);\n     highp vec4 color5 = vec4(color4.rgb / (color4.rgb+vec3(eps)), color4.a*color4.a);\n     gl_FragColor = color5;\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;-><init>(Ljava/lang/String;)V

    .line 36
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->mEps:F

    .line 37
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 41
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->onInit()V

    .line 42
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->getProgram()I

    move-result v0

    const-string v1, "eps"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->mEPSLocation:I

    .line 43
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 47
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->onInitialized()V

    .line 48
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->mEps:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->setEPS(F)V

    .line 49
    return-void
.end method

.method public setEPS(F)V
    .locals 2

    .prologue
    .line 52
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->mEps:F

    .line 53
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->mEPSLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->mEps:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->setFloat(IF)V

    .line 54
    return-void
.end method
