.class public final Ljp/co/cyberagent/android/a/q;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/q;-><init>(B)V

    .line 26
    return-void
.end method

.method private constructor <init>(B)V
    .locals 2

    .prologue
    .line 29
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp vec4 luminosity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb , luminosity.rgb*textureColor.a, luminosity.a), textureColor.w);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/a/q;->y:I

    .line 31
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    const/high16 v4, 0x42c80000    # 100.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 46
    iput p1, p0, Ljp/co/cyberagent/android/a/q;->y:I

    .line 47
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    .line 48
    if-ltz p1, :cond_1

    .line 49
    aput v3, v0, v1

    .line 50
    aput v3, v0, v5

    .line 51
    const/4 v1, 0x2

    aput v3, v0, v1

    .line 52
    const/4 v1, 0x3

    iget v2, p0, Ljp/co/cyberagent/android/a/q;->y:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    aput v2, v0, v1

    .line 61
    :goto_0
    iget v1, p0, Ljp/co/cyberagent/android/a/q;->z:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 62
    iget v1, p0, Ljp/co/cyberagent/android/a/q;->z:I

    invoke-virtual {p0, v1, v0}, Ljp/co/cyberagent/android/a/q;->a(I[F)V

    .line 63
    :cond_0
    return-void

    .line 55
    :cond_1
    aput v2, v0, v1

    .line 56
    aput v2, v0, v5

    .line 57
    const/4 v1, 0x2

    aput v2, v0, v1

    .line 58
    const/4 v1, 0x3

    iget v2, p0, Ljp/co/cyberagent/android/a/q;->y:I

    neg-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    aput v2, v0, v1

    goto :goto_0

    .line 47
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 35
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 36
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/q;->p()I

    move-result v0

    const-string v1, "luminosity"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/q;->z:I

    .line 37
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 42
    iget v0, p0, Ljp/co/cyberagent/android/a/q;->y:I

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 43
    return-void
.end method
