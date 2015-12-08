.class public final Ljp/co/cyberagent/android/a/s;
.super Ljp/co/cyberagent/android/a/ae;
.source "SourceFile"


# instance fields
.field private E:I

.field private F:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\nvarying highp vec2 textureCoordinate3;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform sampler2D inputImageTexture3;\n uniform lowp float alpha; uniform int useMaskTexture; \n void main()\n {\n lowp vec4 base = texture2D(inputImageTexture, textureCoordinate);\n lowp vec4 overlay = texture2D(inputImageTexture2, textureCoordinate2);\n lowp vec4 alpha1 = texture2D(inputImageTexture3, textureCoordinate3);\n gl_FragColor = vec4(mix(base.rgb, overlay.rgb, (alpha1.r + alpha1.g + alpha1.b)/3.0), 1);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/ae;-><init>(Ljava/lang/String;)V

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/a/s;->E:I

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Ljp/co/cyberagent/android/a/s;->F:I

    .line 34
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    .line 58
    invoke-super {p0}, Ljp/co/cyberagent/android/a/ae;->a()V

    .line 60
    iget v0, p0, Ljp/co/cyberagent/android/a/s;->D:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 61
    const/4 v0, 0x1

    iput v0, p0, Ljp/co/cyberagent/android/a/s;->E:I

    .line 66
    :goto_0
    return-void

    .line 63
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/a/s;->E:I

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 38
    invoke-super {p0}, Ljp/co/cyberagent/android/a/ae;->c()V

    .line 39
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/s;->o:F

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/a/s;->E:I

    .line 43
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 47
    invoke-super {p0}, Ljp/co/cyberagent/android/a/ae;->d()V

    .line 48
    iget v0, p0, Ljp/co/cyberagent/android/a/s;->o:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/s;->e(F)V

    .line 49
    return-void
.end method

.method public final e(F)V
    .locals 1

    .prologue
    .line 52
    iput p1, p0, Ljp/co/cyberagent/android/a/s;->o:F

    .line 53
    iget v0, p0, Ljp/co/cyberagent/android/a/s;->e:I

    invoke-virtual {p0, v0, p1}, Ljp/co/cyberagent/android/a/s;->a(IF)V

    .line 54
    return-void
.end method
