.class public final Ljp/co/cyberagent/android/a/w;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:I

.field private y:Ljava/lang/String;

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    const-string v0, "#000000"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/w;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 28
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 screenColor;\n uniform highp float alpha;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb, screenColor.rgb, alpha), textureColor.a);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iput-object p1, p0, Ljp/co/cyberagent/android/a/w;->y:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/a/w;->z:F

    .line 31
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;F)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/high16 v3, 0x437f0000    # 255.0f

    .line 47
    iput-object p1, p0, Ljp/co/cyberagent/android/a/w;->y:Ljava/lang/String;

    .line 48
    iput p2, p0, Ljp/co/cyberagent/android/a/w;->z:F

    .line 49
    const-string v0, "#"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 50
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    int-to-float v1, v1

    div-float/2addr v1, v3

    .line 51
    const v2, 0xff00

    and-int/2addr v2, v0

    shr-int/lit8 v2, v2, 0x8

    int-to-float v2, v2

    div-float/2addr v2, v3

    .line 52
    and-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 53
    const/4 v3, 0x4

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v1, v3, v4

    const/4 v1, 0x1

    aput v2, v3, v1

    const/4 v1, 0x2

    aput v0, v3, v1

    const/4 v0, 0x3

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v3, v0

    .line 54
    iget v0, p0, Ljp/co/cyberagent/android/a/w;->A:I

    if-eq v0, v5, :cond_0

    .line 55
    iget v0, p0, Ljp/co/cyberagent/android/a/w;->A:I

    invoke-virtual {p0, v0, v3}, Ljp/co/cyberagent/android/a/w;->a(I[F)V

    .line 56
    :cond_0
    iget v0, p0, Ljp/co/cyberagent/android/a/w;->B:I

    if-eq v0, v5, :cond_1

    .line 57
    iget v0, p0, Ljp/co/cyberagent/android/a/w;->B:I

    invoke-virtual {p0, v0, p2}, Ljp/co/cyberagent/android/a/w;->a(IF)V

    .line 58
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 35
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 36
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/w;->p()I

    move-result v0

    const-string v1, "screenColor"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/w;->A:I

    .line 37
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/w;->p()I

    move-result v0

    const-string v1, "alpha"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/w;->B:I

    .line 38
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 42
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 43
    iget-object v0, p0, Ljp/co/cyberagent/android/a/w;->y:Ljava/lang/String;

    iget v1, p0, Ljp/co/cyberagent/android/a/w;->z:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/w;->a(Ljava/lang/String;F)V

    .line 44
    return-void
.end method
