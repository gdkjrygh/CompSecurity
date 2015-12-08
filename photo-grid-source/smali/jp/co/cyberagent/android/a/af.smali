.class public final Ljp/co/cyberagent/android/a/af;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private y:F

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/af;-><init>(B)V

    return-void
.end method

.method private constructor <init>(B)V
    .locals 2

    .prologue
    .line 31
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision highp float;\n\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float threshold;\n\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\n  lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n  float luminance = dot(textureColor.rgb, W);\n\n  float color = luminance > threshold ? 1.0:0.0;\n  gl_FragColor = vec4(vec3(color), textureColor.a);\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Ljp/co/cyberagent/android/a/af;->y:F

    .line 33
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .prologue
    .line 37
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 38
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/af;->p()I

    move-result v0

    const-string v1, "threshold"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/af;->z:I

    .line 40
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 44
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 45
    iget v0, p0, Ljp/co/cyberagent/android/a/af;->y:F

    .line 1049
    iput v0, p0, Ljp/co/cyberagent/android/a/af;->y:F

    .line 1050
    iget v0, p0, Ljp/co/cyberagent/android/a/af;->z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1051
    iget v0, p0, Ljp/co/cyberagent/android/a/af;->z:I

    iget v1, p0, Ljp/co/cyberagent/android/a/af;->y:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/af;->a(IF)V

    .line 46
    :cond_0
    return-void
.end method
