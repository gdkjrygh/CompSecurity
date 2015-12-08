.class public Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final POSTERIZE_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float colorLevels;\n\nvoid main()\n{\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   \n   gl_FragColor = floor((textureColor * colorLevels) + vec4(0.5)) / colorLevels;\n}"


# instance fields
.field private mColorLevels:I

.field private mGLUniformColorLevels:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 44
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;-><init>(I)V

    .line 45
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .prologue
    .line 48
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float colorLevels;\n\nvoid main()\n{\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   \n   gl_FragColor = floor((textureColor * colorLevels) + vec4(0.5)) / colorLevels;\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->mColorLevels:I

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
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->getProgram()I

    move-result v0

    const-string v1, "colorLevels"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->mGLUniformColorLevels:I

    .line 56
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->mColorLevels:I

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->setColorLevels(I)V

    .line 57
    return-void
.end method

.method public setColorLevels(I)V
    .locals 2

    .prologue
    .line 60
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->mColorLevels:I

    .line 61
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->mGLUniformColorLevels:I

    int-to-float v1, p1

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImagePosterizeFilter;->setFloat(IF)V

    .line 62
    return-void
.end method
