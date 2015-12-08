.class public final Ljp/co/cyberagent/android/a/e;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:F

.field private C:I

.field private D:F

.field private E:F

.field private F:I

.field private y:I

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/e;-><init>(B)V

    .line 78
    return-void
.end method

.method private constructor <init>(B)V
    .locals 3

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 81
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision highp float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform lowp float brightness;\nuniform lowp float saturation;\nuniform lowp float contrast;\nuniform mediump float hueAdjust;\nconst highp vec4 kRGBToYPrime = vec4 (0.299, 0.587, 0.114, 0.0);\nconst highp vec4 kRGBToI = vec4 (0.595716, -0.274453, -0.321263, 0.0);\nconst highp vec4 kRGBToQ = vec4 (0.211456, -0.522591, 0.31135, 0.0);\n\nconst highp vec4 kYIQToR = vec4 (1.0, 0.9563, 0.6210, 0.0);\nconst highp vec4 kYIQToG = vec4 (1.0, -0.2721, -0.6474, 0.0);\nconst highp vec4 kYIQToB = vec4 (1.0, -1.1070, 1.7046, 0.0);\nconst mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main ()\n{\n    // Sample the input pixel\n    highp vec4 color = texture2D(inputImageTexture, textureCoordinate);\n    vec4 colorBrightness = vec4((color.rgb + vec3(brightness)), color.w);\n    vec4 colorContrast = vec4(((colorBrightness.rgb - vec3(0.5)) * contrast + vec3(0.5)), colorBrightness.w);\n    lowp float luminance = dot(colorContrast.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    color = vec4(mix(greyScaleColor, colorContrast.rgb, saturation), colorContrast.w);\n\n    // Convert to YIQ\n    highp float YPrime = dot (color, kRGBToYPrime);\n    highp float I = dot (color, kRGBToI);\n    highp float Q = dot (color, kRGBToQ);\n\n    // Calculate the hue and chroma\n    highp float hue = atan (Q, I);\n    highp float chroma = sqrt (I * I + Q * Q);\n\n    // Make the user\'s adjustments\n    hue += (-hueAdjust); //why negative rotation?\n\n    // Convert back to YIQ\n    Q = chroma * sin (hue);\n    I = chroma * cos (hue);\n\n    // Convert back to RGB\n    highp vec4 yIQ = vec4 (YPrime, I, Q, 0.0);\n    color.r = dot (yIQ, kYIQToR);\n    color.g = dot (yIQ, kYIQToG);\n    color.b = dot (yIQ, kYIQToB);\n\n    // Save the result\n    gl_FragColor = color;\n}\n"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/a/e;->z:F

    .line 83
    iput v2, p0, Ljp/co/cyberagent/android/a/e;->B:F

    .line 84
    iput v2, p0, Ljp/co/cyberagent/android/a/e;->D:F

    .line 85
    const/high16 v0, 0x42b40000    # 90.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/e;->E:F

    .line 86
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    .prologue
    .line 109
    iput p1, p0, Ljp/co/cyberagent/android/a/e;->z:F

    .line 110
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->y:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 111
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->y:I

    iget v1, p0, Ljp/co/cyberagent/android/a/e;->z:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/e;->a(IF)V

    .line 112
    :cond_0
    return-void
.end method

.method public final b(F)V
    .locals 2

    .prologue
    .line 115
    iput p1, p0, Ljp/co/cyberagent/android/a/e;->B:F

    .line 116
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->A:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 117
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->A:I

    iget v1, p0, Ljp/co/cyberagent/android/a/e;->B:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/e;->a(IF)V

    .line 118
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 90
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 91
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/e;->p()I

    move-result v0

    const-string v1, "brightness"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/e;->y:I

    .line 92
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/e;->p()I

    move-result v0

    const-string v1, "contrast"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/e;->A:I

    .line 93
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/e;->p()I

    move-result v0

    const-string v1, "saturation"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/e;->C:I

    .line 94
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/e;->p()I

    move-result v0

    const-string v1, "hueAdjust"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/e;->F:I

    .line 95
    const-string v0, "GPUImage"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GPUImageColorFilter programID:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/e;->p()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",mBrightnessLocation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Ljp/co/cyberagent/android/a/e;->y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",mContrastLocation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Ljp/co/cyberagent/android/a/e;->A:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",mSaturationLocation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Ljp/co/cyberagent/android/a/e;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",mHueLocation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Ljp/co/cyberagent/android/a/e;->F:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    return-void
.end method

.method public final c(F)V
    .locals 2

    .prologue
    .line 121
    iput p1, p0, Ljp/co/cyberagent/android/a/e;->D:F

    .line 122
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->C:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 123
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->C:I

    iget v1, p0, Ljp/co/cyberagent/android/a/e;->D:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/e;->a(IF)V

    .line 124
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 101
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 102
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->z:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/e;->a(F)V

    .line 103
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->B:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/e;->b(F)V

    .line 104
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->D:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/e;->c(F)V

    .line 105
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->E:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/e;->d(F)V

    .line 106
    return-void
.end method

.method public final d(F)V
    .locals 3

    .prologue
    .line 127
    iput p1, p0, Ljp/co/cyberagent/android/a/e;->E:F

    .line 128
    iget v0, p0, Ljp/co/cyberagent/android/a/e;->E:F

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float/2addr v0, v1

    const v1, 0x40490fdb    # (float)Math.PI

    mul-float/2addr v0, v1

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    .line 129
    iget v1, p0, Ljp/co/cyberagent/android/a/e;->F:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 130
    iget v1, p0, Ljp/co/cyberagent/android/a/e;->F:I

    invoke-virtual {p0, v1, v0}, Ljp/co/cyberagent/android/a/e;->a(IF)V

    .line 131
    :cond_0
    return-void
.end method
