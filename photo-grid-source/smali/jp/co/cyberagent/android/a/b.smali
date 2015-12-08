.class public final Ljp/co/cyberagent/android/a/b;
.super Ljp/co/cyberagent/android/a/u;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor2.a);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/u;-><init>(Ljava/lang/String;)V

    .line 43
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .prologue
    .line 73
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor2.a);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/u;-><init>(Ljava/lang/String;)V

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/a/b;->j:Z

    .line 76
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 47
    iget v0, p0, Ljp/co/cyberagent/android/a/b;->z:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 48
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 52
    const/16 v0, 0xde1

    iget v1, p0, Ljp/co/cyberagent/android/a/b;->B:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 54
    iget v0, p0, Ljp/co/cyberagent/android/a/b;->A:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 56
    iget-object v0, p0, Ljp/co/cyberagent/android/a/b;->u:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 57
    iget v0, p0, Ljp/co/cyberagent/android/a/b;->z:I

    const/4 v1, 0x2

    const/16 v2, 0x1406

    iget-object v5, p0, Ljp/co/cyberagent/android/a/b;->u:Ljava/nio/FloatBuffer;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 58
    return-void
.end method

.method public final declared-synchronized b()V
    .locals 1

    .prologue
    .line 62
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/b;->p:Lcom/roidapp/videolib/gl/e;

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Ljp/co/cyberagent/android/a/b;->p:Lcom/roidapp/videolib/gl/e;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/e;->c()I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/b;->B:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    :cond_0
    monitor-exit p0

    return-void

    .line 62
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
