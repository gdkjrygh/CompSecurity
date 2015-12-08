.class public Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final COLORFILTER_FRAGMENT_SHADER:Ljava/lang/String; = "precision highp float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform lowp float brightness;\nuniform lowp float saturation;\nuniform lowp float contrast;\nuniform mediump float hueAdjust;\nconst highp vec4 kRGBToYPrime = vec4 (0.299, 0.587, 0.114, 0.0);\nconst highp vec4 kRGBToI = vec4 (0.595716, -0.274453, -0.321263, 0.0);\nconst highp vec4 kRGBToQ = vec4 (0.211456, -0.522591, 0.31135, 0.0);\n\nconst highp vec4 kYIQToR = vec4 (1.0, 0.9563, 0.6210, 0.0);\nconst highp vec4 kYIQToG = vec4 (1.0, -0.2721, -0.6474, 0.0);\nconst highp vec4 kYIQToB = vec4 (1.0, -1.1070, 1.7046, 0.0);\nconst mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main ()\n{\n    // Sample the input pixel\n    highp vec4 color = texture2D(inputImageTexture, textureCoordinate);\n    vec4 colorBrightness = vec4((color.rgb + vec3(brightness)), color.w);\n    vec4 colorContrast = vec4(((colorBrightness.rgb - vec3(0.5)) * contrast + vec3(0.5)), colorBrightness.w);\n    lowp float luminance = dot(colorContrast.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    color = vec4(mix(greyScaleColor, colorContrast.rgb, saturation), colorContrast.w);\n\n    // Convert to YIQ\n    highp float YPrime = dot (color, kRGBToYPrime);\n    highp float I = dot (color, kRGBToI);\n    highp float Q = dot (color, kRGBToQ);\n\n    // Calculate the hue and chroma\n    highp float hue = atan (Q, I);\n    highp float chroma = sqrt (I * I + Q * Q);\n\n    // Make the user\'s adjustments\n    hue += (-hueAdjust); //why negative rotation?\n\n    // Convert back to YIQ\n    Q = chroma * sin (hue);\n    I = chroma * cos (hue);\n\n    // Convert back to RGB\n    highp vec4 yIQ = vec4 (YPrime, I, Q, 0.0);\n    color.r = dot (yIQ, kYIQToR);\n    color.g = dot (yIQ, kYIQToG);\n    color.b = dot (yIQ, kYIQToB);\n\n    // Save the result\n    gl_FragColor = color;\n}\n"


# instance fields
.field private mBrightness:F

.field private mBrightnessLocation:I

.field private mContrast:F

.field private mContrastLocation:I

.field private mHue:F

.field private mHueLocation:I

.field private mSaturation:F

.field private mSaturationLocation:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 76
    const/4 v0, 0x0

    const/high16 v1, 0x42b40000    # 90.0f

    invoke-direct {p0, v0, v2, v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;-><init>(FFFF)V

    .line 77
    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 2

    .prologue
    .line 80
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision highp float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform lowp float brightness;\nuniform lowp float saturation;\nuniform lowp float contrast;\nuniform mediump float hueAdjust;\nconst highp vec4 kRGBToYPrime = vec4 (0.299, 0.587, 0.114, 0.0);\nconst highp vec4 kRGBToI = vec4 (0.595716, -0.274453, -0.321263, 0.0);\nconst highp vec4 kRGBToQ = vec4 (0.211456, -0.522591, 0.31135, 0.0);\n\nconst highp vec4 kYIQToR = vec4 (1.0, 0.9563, 0.6210, 0.0);\nconst highp vec4 kYIQToG = vec4 (1.0, -0.2721, -0.6474, 0.0);\nconst highp vec4 kYIQToB = vec4 (1.0, -1.1070, 1.7046, 0.0);\nconst mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main ()\n{\n    // Sample the input pixel\n    highp vec4 color = texture2D(inputImageTexture, textureCoordinate);\n    vec4 colorBrightness = vec4((color.rgb + vec3(brightness)), color.w);\n    vec4 colorContrast = vec4(((colorBrightness.rgb - vec3(0.5)) * contrast + vec3(0.5)), colorBrightness.w);\n    lowp float luminance = dot(colorContrast.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    color = vec4(mix(greyScaleColor, colorContrast.rgb, saturation), colorContrast.w);\n\n    // Convert to YIQ\n    highp float YPrime = dot (color, kRGBToYPrime);\n    highp float I = dot (color, kRGBToI);\n    highp float Q = dot (color, kRGBToQ);\n\n    // Calculate the hue and chroma\n    highp float hue = atan (Q, I);\n    highp float chroma = sqrt (I * I + Q * Q);\n\n    // Make the user\'s adjustments\n    hue += (-hueAdjust); //why negative rotation?\n\n    // Convert back to YIQ\n    Q = chroma * sin (hue);\n    I = chroma * cos (hue);\n\n    // Convert back to RGB\n    highp vec4 yIQ = vec4 (YPrime, I, Q, 0.0);\n    color.r = dot (yIQ, kYIQToR);\n    color.g = dot (yIQ, kYIQToG);\n    color.b = dot (yIQ, kYIQToB);\n\n    // Save the result\n    gl_FragColor = color;\n}\n"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mBrightness:F

    .line 82
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mContrast:F

    .line 83
    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mSaturation:F

    .line 84
    iput p4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mHue:F

    .line 85
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 89
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 90
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->getProgram()I

    move-result v0

    const-string v1, "brightness"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mBrightnessLocation:I

    .line 91
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->getProgram()I

    move-result v0

    const-string v1, "contrast"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mContrastLocation:I

    .line 92
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->getProgram()I

    move-result v0

    const-string v1, "saturation"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mSaturationLocation:I

    .line 93
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->getProgram()I

    move-result v0

    const-string v1, "hueAdjust"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mHueLocation:I

    .line 94
    return-void
.end method

.method public onInitialized()V
    .locals 1

    .prologue
    .line 98
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 99
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mBrightness:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setBrightness(F)V

    .line 100
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mContrast:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setContrast(F)V

    .line 101
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mSaturation:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setSaturation(F)V

    .line 102
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mHue:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setHue(F)V

    .line 103
    return-void
.end method

.method public setBrightness(F)V
    .locals 2

    .prologue
    .line 106
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mBrightness:F

    .line 107
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mBrightnessLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mBrightness:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setFloat(IF)V

    .line 108
    return-void
.end method

.method public setContrast(F)V
    .locals 2

    .prologue
    .line 111
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mContrast:F

    .line 112
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mContrastLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mContrast:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setFloat(IF)V

    .line 113
    return-void
.end method

.method public setHue(F)V
    .locals 2

    .prologue
    .line 121
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mHue:F

    .line 122
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mHue:F

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float/2addr v0, v1

    const v1, 0x40490fdb    # (float)Math.PI

    mul-float/2addr v0, v1

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    .line 123
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mHueLocation:I

    invoke-virtual {p0, v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setFloat(IF)V

    .line 124
    return-void
.end method

.method public setSaturation(F)V
    .locals 2

    .prologue
    .line 116
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mSaturation:F

    .line 117
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mSaturationLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->mSaturation:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setFloat(IF)V

    .line 118
    return-void
.end method
