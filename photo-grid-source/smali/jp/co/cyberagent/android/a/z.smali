.class public final Ljp/co/cyberagent/android/a/z;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private y:Ljava/lang/String;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 44
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 overlay;\n \n void main()\n {\n     mediump vec4 base = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float ra;\n     if (2.0 * base.r < base.a) {\n         ra = 2.0 * overlay.r * base.r + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     } else {\n         ra = overlay.a * base.a - 2.0 * (base.a - base.r) * (overlay.a - overlay.r) + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     }\n     \n     mediump float ga;\n     if (2.0 * base.g < base.a) {\n         ga = 2.0 * overlay.g * base.g + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     } else {\n         ga = overlay.a * base.a - 2.0 * (base.a - base.g) * (overlay.a - overlay.g) + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     }\n     \n     mediump float ba;\n     if (2.0 * base.b < base.a) {\n         ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     } else {\n         ba = overlay.a * base.a - 2.0 * (base.a - base.b) * (overlay.a - overlay.b) + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     }\n     \n     gl_FragColor = vec4(ra, ga, ba, 1.0);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/high16 v3, 0x437f0000    # 255.0f

    .line 61
    iput-object p1, p0, Ljp/co/cyberagent/android/a/z;->y:Ljava/lang/String;

    .line 62
    const-string v0, "#"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 63
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    int-to-float v1, v1

    div-float/2addr v1, v3

    .line 64
    const v2, 0xff00

    and-int/2addr v2, v0

    shr-int/lit8 v2, v2, 0x8

    int-to-float v2, v2

    div-float/2addr v2, v3

    .line 65
    and-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 66
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

    .line 67
    iget v0, p0, Ljp/co/cyberagent/android/a/z;->z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 68
    iget v0, p0, Ljp/co/cyberagent/android/a/z;->z:I

    invoke-virtual {p0, v0, v3}, Ljp/co/cyberagent/android/a/z;->a(I[F)V

    .line 69
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 49
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 50
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/z;->p()I

    move-result v0

    const-string v1, "overlay"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/z;->z:I

    .line 51
    return-void
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 55
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 57
    return-void
.end method
