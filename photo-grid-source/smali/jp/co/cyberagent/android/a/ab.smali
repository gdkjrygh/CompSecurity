.class public final Ljp/co/cyberagent/android/a/ab;
.super Ljp/co/cyberagent/android/a/aj;
.source "SourceFile"


# static fields
.field public static final y:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    sget v0, Ljp/co/cyberagent/android/a/a;->K:I

    sput v0, Ljp/co/cyberagent/android/a/ab;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform lowp float alpha;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     mediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     mediump vec4 whiteColor = vec4(1.0);\n     gl_FragColor = (whiteColor - ((whiteColor - textureColor2) * (whiteColor - textureColor)))*alpha;\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/aj;-><init>(Ljava/lang/String;)V

    .line 44
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .prologue
    .line 48
    invoke-super {p0}, Ljp/co/cyberagent/android/a/aj;->c()V

    .line 49
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/ab;->p()I

    move-result v0

    const-string v1, "alpha"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ab;->e:I

    .line 51
    return-void
.end method
