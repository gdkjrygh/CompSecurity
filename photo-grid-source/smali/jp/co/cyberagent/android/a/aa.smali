.class public final Ljp/co/cyberagent/android/a/aa;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private A:F

.field private B:I

.field private y:I

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 51
    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/aa;-><init>(FB)V

    .line 52
    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljp/co/cyberagent/android/a/aa;-><init>(FB)V

    .line 56
    return-void
.end method

.method private constructor <init>(FB)V
    .locals 2

    .prologue
    .line 59
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float saturation;\n uniform lowp float alpha;\n \n // Values from \"Graphics Shaders: Theory and Practice\" by Bailey and Cunningham\n const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float luminance = dot(textureColor.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    gl_FragColor = vec4(mix(greyScaleColor, textureColor.rgb, saturation), textureColor.w);\n     \n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iput p1, p0, Ljp/co/cyberagent/android/a/aa;->z:F

    .line 61
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/aa;->A:F

    .line 62
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    .prologue
    .line 79
    iput p1, p0, Ljp/co/cyberagent/android/a/aa;->z:F

    .line 80
    iget v0, p0, Ljp/co/cyberagent/android/a/aa;->y:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 81
    iget v0, p0, Ljp/co/cyberagent/android/a/aa;->y:I

    iget v1, p0, Ljp/co/cyberagent/android/a/aa;->z:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/aa;->a(IF)V

    .line 82
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 66
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 67
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/aa;->p()I

    move-result v0

    const-string v1, "saturation"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/aa;->y:I

    .line 68
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/aa;->p()I

    move-result v0

    const-string v1, "alpha"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/aa;->B:I

    .line 69
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 73
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 74
    iget v0, p0, Ljp/co/cyberagent/android/a/aa;->z:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 75
    iget v0, p0, Ljp/co/cyberagent/android/a/aa;->A:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/aa;->e(F)V

    .line 76
    return-void
.end method

.method public final e(F)V
    .locals 2

    .prologue
    .line 85
    iput p1, p0, Ljp/co/cyberagent/android/a/aa;->A:F

    .line 86
    iget v0, p0, Ljp/co/cyberagent/android/a/aa;->B:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 87
    iget v0, p0, Ljp/co/cyberagent/android/a/aa;->B:I

    iget v1, p0, Ljp/co/cyberagent/android/a/aa;->A:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/aa;->a(IF)V

    .line 88
    :cond_0
    return-void
.end method
