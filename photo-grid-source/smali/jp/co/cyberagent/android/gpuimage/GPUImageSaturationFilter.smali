.class public Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final SATURATION_FRAGMENT_SHADER:Ljava/lang/String; = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float saturation;\n uniform lowp float alpha;\n \n // Values from \"Graphics Shaders: Theory and Practice\" by Bailey and Cunningham\n const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float luminance = dot(textureColor.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    gl_FragColor = vec4(mix(greyScaleColor, textureColor.rgb, saturation)*alpha, textureColor.w);\n     \n }"


# instance fields
.field private mAlpha:F

.field private mAlphaLocation:I

.field private mSaturation:F

.field private mSaturationLocation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    .line 51
    invoke-direct {p0, v0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(FF)V

    .line 52
    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .prologue
    .line 55
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, p1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(FF)V

    .line 56
    return-void
.end method

.method public constructor <init>(FF)V
    .locals 2

    .prologue
    .line 59
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float saturation;\n uniform lowp float alpha;\n \n // Values from \"Graphics Shaders: Theory and Practice\" by Bailey and Cunningham\n const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float luminance = dot(textureColor.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    gl_FragColor = vec4(mix(greyScaleColor, textureColor.rgb, saturation)*alpha, textureColor.w);\n     \n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mSaturation:F

    .line 61
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mAlpha:F

    .line 62
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 66
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 67
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->getProgram()I

    move-result v0

    const-string v1, "saturation"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mSaturationLocation:I

    .line 68
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->getProgram()I

    move-result v0

    const-string v1, "alpha"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mAlphaLocation:I

    .line 69
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 73
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 74
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mSaturation:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 75
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mAlpha:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setAlpha(F)V

    .line 76
    return-void
.end method

.method public setAlpha(F)V
    .locals 2

    .prologue
    .line 84
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mAlpha:F

    .line 85
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mAlphaLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mAlpha:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setFloat(IF)V

    .line 86
    return-void
.end method

.method public setSaturation(F)V
    .locals 2

    .prologue
    .line 79
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mSaturation:F

    .line 80
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mSaturationLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->mSaturation:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setFloat(IF)V

    .line 81
    return-void
.end method
