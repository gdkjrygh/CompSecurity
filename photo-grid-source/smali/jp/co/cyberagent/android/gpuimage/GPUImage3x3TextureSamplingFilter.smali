.class public Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final THREE_X_THREE_TEXTURE_SAMPLING_VERTEX_SHADER:Ljava/lang/String; = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform highp float texelWidth; \nuniform highp float texelHeight; \n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate;\n\nvarying vec2 topTextureCoordinate;\nvarying vec2 topLeftTextureCoordinate;\nvarying vec2 topRightTextureCoordinate;\n\nvarying vec2 bottomTextureCoordinate;\nvarying vec2 bottomLeftTextureCoordinate;\nvarying vec2 bottomRightTextureCoordinate;\n\nvoid main()\n{\n    gl_Position = position;\n\n    vec2 widthStep = vec2(texelWidth, 0.0);\n    vec2 heightStep = vec2(0.0, texelHeight);\n    vec2 widthHeightStep = vec2(texelWidth, texelHeight);\n    vec2 widthNegativeHeightStep = vec2(texelWidth, -texelHeight);\n\n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n\n    topTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n    topLeftTextureCoordinate = inputTextureCoordinate.xy - widthHeightStep;\n    topRightTextureCoordinate = inputTextureCoordinate.xy + widthNegativeHeightStep;\n\n    bottomTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n    bottomLeftTextureCoordinate = inputTextureCoordinate.xy - widthNegativeHeightStep;\n    bottomRightTextureCoordinate = inputTextureCoordinate.xy + widthHeightStep;\n}"


# instance fields
.field private mHasOverriddenImageSizeFactor:Z

.field private mLineSize:F

.field private mTexelHeight:F

.field private mTexelWidth:F

.field private mUniformTexelHeightLocation:I

.field private mUniformTexelWidthLocation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 72
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;-><init>(Ljava/lang/String;)V

    .line 73
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 76
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform highp float texelWidth; \nuniform highp float texelHeight; \n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate;\n\nvarying vec2 topTextureCoordinate;\nvarying vec2 topLeftTextureCoordinate;\nvarying vec2 topRightTextureCoordinate;\n\nvarying vec2 bottomTextureCoordinate;\nvarying vec2 bottomLeftTextureCoordinate;\nvarying vec2 bottomRightTextureCoordinate;\n\nvoid main()\n{\n    gl_Position = position;\n\n    vec2 widthStep = vec2(texelWidth, 0.0);\n    vec2 heightStep = vec2(0.0, texelHeight);\n    vec2 widthHeightStep = vec2(texelWidth, texelHeight);\n    vec2 widthNegativeHeightStep = vec2(texelWidth, -texelHeight);\n\n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n\n    topTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n    topLeftTextureCoordinate = inputTextureCoordinate.xy - widthHeightStep;\n    topRightTextureCoordinate = inputTextureCoordinate.xy + widthNegativeHeightStep;\n\n    bottomTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n    bottomLeftTextureCoordinate = inputTextureCoordinate.xy - widthNegativeHeightStep;\n    bottomRightTextureCoordinate = inputTextureCoordinate.xy + widthHeightStep;\n}"

    invoke-direct {p0, v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mHasOverriddenImageSizeFactor:Z

    .line 69
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mLineSize:F

    .line 77
    return-void
.end method

.method private updateTexelValues()V
    .locals 2

    .prologue
    .line 117
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mUniformTexelWidthLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mTexelWidth:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->setFloat(IF)V

    .line 118
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mUniformTexelHeightLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mTexelHeight:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->setFloat(IF)V

    .line 119
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 81
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 82
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->getProgram()I

    move-result v0

    const-string v1, "texelWidth"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mUniformTexelWidthLocation:I

    .line 83
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->getProgram()I

    move-result v0

    const-string v1, "texelHeight"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mUniformTexelHeightLocation:I

    .line 84
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mTexelWidth:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 85
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->updateTexelValues()V

    .line 87
    :cond_0
    return-void
.end method

.method public onOutputSizeChanged(II)V
    .locals 1

    .prologue
    .line 91
    invoke-super {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onOutputSizeChanged(II)V

    .line 92
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mHasOverriddenImageSizeFactor:Z

    if-nez v0, :cond_0

    .line 93
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mLineSize:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->setLineSize(F)V

    .line 95
    :cond_0
    return-void
.end method

.method public setLineSize(F)V
    .locals 1

    .prologue
    .line 110
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mLineSize:F

    .line 111
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->getOutputWidth()I

    move-result v0

    int-to-float v0, v0

    div-float v0, p1, v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mTexelWidth:F

    .line 112
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->getOutputHeight()I

    move-result v0

    int-to-float v0, v0

    div-float v0, p1, v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mTexelHeight:F

    .line 113
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->updateTexelValues()V

    .line 114
    return-void
.end method

.method public setTexelHeight(F)V
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mHasOverriddenImageSizeFactor:Z

    .line 105
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mTexelHeight:F

    .line 106
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mUniformTexelHeightLocation:I

    invoke-virtual {p0, v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->setFloat(IF)V

    .line 107
    return-void
.end method

.method public setTexelWidth(F)V
    .locals 1

    .prologue
    .line 98
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mHasOverriddenImageSizeFactor:Z

    .line 99
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mTexelWidth:F

    .line 100
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->mUniformTexelWidthLocation:I

    invoke-virtual {p0, v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage3x3TextureSamplingFilter;->setFloat(IF)V

    .line 101
    return-void
.end method
