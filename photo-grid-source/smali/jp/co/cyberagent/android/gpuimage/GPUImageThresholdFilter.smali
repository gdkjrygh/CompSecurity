.class public Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final THRESHOLD_FRAGMENT_SHADER:Ljava/lang/String; = "precision highp float;\n\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float threshold;\n\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\n  lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n  float luminance = dot(textureColor.rgb, W);\n\n  float color = luminance > threshold ? 1.0:0.0;\n  gl_FragColor = vec4(vec3(color), textureColor.a);\n}"


# instance fields
.field private mThreshold:F

.field private mThresholdLocation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;-><init>(F)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    .prologue
    .line 33
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision highp float;\n\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float threshold;\n\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\n  lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n  float luminance = dot(textureColor.rgb, W);\n\n  float color = luminance > threshold ? 1.0:0.0;\n  gl_FragColor = vec4(vec3(color), textureColor.a);\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->mThreshold:F

    .line 35
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 39
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 40
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->getProgram()I

    move-result v0

    const-string v1, "threshold"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->mThresholdLocation:I

    .line 41
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 45
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 46
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->mThreshold:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->setThreshold(F)V

    .line 47
    return-void
.end method

.method public setThreshold(F)V
    .locals 2

    .prologue
    .line 50
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->mThreshold:F

    .line 51
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->mThresholdLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->mThreshold:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;->setFloat(IF)V

    .line 52
    return-void
.end method
