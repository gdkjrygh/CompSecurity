.class public Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final CONTRAST_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float contrast;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(((textureColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), textureColor.w);\n }"


# instance fields
.field private mContrast:F

.field private mContrastLocation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 44
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;-><init>(F)V

    .line 45
    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    .prologue
    .line 48
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float contrast;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(((textureColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), textureColor.w);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->mContrast:F

    .line 50
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 54
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 55
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->getProgram()I

    move-result v0

    const-string v1, "contrast"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->mContrastLocation:I

    .line 56
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 60
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 61
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->mContrast:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->setContrast(F)V

    .line 62
    return-void
.end method

.method public setContrast(F)V
    .locals 2

    .prologue
    .line 65
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->mContrast:F

    .line 66
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->mContrastLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->mContrast:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageContrastFilter;->setFloat(IF)V

    .line 67
    return-void
.end method
