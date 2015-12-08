.class public final Ljp/co/cyberagent/android/a/f;
.super Ljp/co/cyberagent/android/a/aj;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/f;-><init>(B)V

    .line 31
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .prologue
    .line 56
    const-string v0, "precision mediump float;\n \n varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n\t  const highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n     vec4 base = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 overlay = texture2D(inputImageTexture, textureCoordinate);\n  \t  float luminance = dot(base.rgb, W);\n\t  base = vec4(luminance);\t\n\t  vec4 result = base + base*overlay / (vec4(1.0)-overlay);\n\t  result.r = clamp(result.r, 0.0,1.0);\n\t  result.g = clamp(result.g, 0.0,1.0);\n\t  result.b = clamp(result.b, 0.0,1.0);\n     gl_FragColor = vec4(result.rgb, 1.0);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/aj;-><init>(Ljava/lang/String;)V

    .line 59
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 34
    iget v0, p0, Ljp/co/cyberagent/android/a/f;->z:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 35
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 39
    const/16 v0, 0xde1

    iget v1, p0, Ljp/co/cyberagent/android/a/f;->B:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 41
    iget v0, p0, Ljp/co/cyberagent/android/a/f;->A:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 43
    iget-object v0, p0, Ljp/co/cyberagent/android/a/f;->u:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 44
    iget v0, p0, Ljp/co/cyberagent/android/a/f;->z:I

    const/4 v1, 0x2

    const/16 v2, 0x1406

    iget-object v5, p0, Ljp/co/cyberagent/android/a/f;->u:Ljava/nio/FloatBuffer;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 46
    return-void
.end method

.method public final declared-synchronized b()V
    .locals 1

    .prologue
    .line 50
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/f;->p:Lcom/roidapp/videolib/gl/e;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Ljp/co/cyberagent/android/a/f;->p:Lcom/roidapp/videolib/gl/e;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/e;->c()I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/f;->B:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :cond_0
    monitor-exit p0

    return-void

    .line 50
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
