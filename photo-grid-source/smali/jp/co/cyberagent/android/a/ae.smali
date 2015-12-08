.class public Ljp/co/cyberagent/android/a/ae;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 73
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\nuniform mat4 uMVPMatrix;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n\t textureCoordinate3 = inputTextureCoordinate3.xy;\n}"

    invoke-direct {p0, v0, p1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    iput v1, p0, Ljp/co/cyberagent/android/a/ae;->A:I

    .line 63
    iput v1, p0, Ljp/co/cyberagent/android/a/ae;->D:I

    .line 75
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 7

    .prologue
    const/16 v2, 0x1406

    const/16 v6, 0xde1

    const/4 v1, 0x2

    const/4 v3, 0x0

    .line 161
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->y:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 162
    const v0, 0x84c2

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 163
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->A:I

    invoke-static {v6, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 164
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->z:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 165
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ae;->u:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 166
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->y:I

    iget-object v5, p0, Ljp/co/cyberagent/android/a/ae;->u:Ljava/nio/FloatBuffer;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 169
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->B:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 170
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 171
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->D:I

    invoke-static {v6, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 172
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->C:I

    const/4 v4, 0x3

    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 173
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ae;->u:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 174
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->B:I

    iget-object v5, p0, Ljp/co/cyberagent/android/a/ae;->u:Ljava/nio/FloatBuffer;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 175
    return-void
.end method

.method public final declared-synchronized b()V
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 92
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ae;->p:Lcom/roidapp/videolib/gl/e;

    if-eqz v0, :cond_1

    .line 93
    const v0, 0x84c2

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 94
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ae;->p:Lcom/roidapp/videolib/gl/e;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/e;->a()[Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 95
    iget-object v1, p0, Ljp/co/cyberagent/android/a/ae;->p:Lcom/roidapp/videolib/gl/e;

    invoke-interface {v1}, Lcom/roidapp/videolib/gl/e;->b()[I

    move-result-object v1

    .line 97
    if-eqz v0, :cond_0

    array-length v2, v0

    if-le v2, v3, :cond_0

    if-eqz v1, :cond_0

    array-length v2, v1

    const/4 v3, 0x2

    if-ge v2, v3, :cond_2

    .line 98
    :cond_0
    const-string v0, "Buffer"

    const-string v1, "Data Provider can\'t provide data"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    .line 102
    :cond_2
    const/4 v2, 0x0

    :try_start_1
    aget-object v2, v0, v2

    const/4 v3, 0x0

    aget v3, v1, v3

    const/4 v4, 0x1

    aget v4, v1, v4

    iget v5, p0, Ljp/co/cyberagent/android/a/ae;->A:I

    invoke-static {v2, v3, v4, v5}, Lcom/roidapp/videolib/gl/g;->a(Ljava/nio/ByteBuffer;III)I

    move-result v2

    iput v2, p0, Ljp/co/cyberagent/android/a/ae;->A:I

    .line 104
    const v2, 0x84c3

    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 105
    const/4 v2, 0x1

    aget-object v0, v0, v2

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    iget v3, p0, Ljp/co/cyberagent/android/a/ae;->D:I

    invoke-static {v0, v2, v1, v3}, Lcom/roidapp/videolib/gl/g;->a(Ljava/nio/ByteBuffer;III)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ae;->D:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 79
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 80
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/ae;->p()I

    move-result v0

    const-string v1, "uMVPMatrix"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ae;->d:I

    .line 81
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/ae;->p()I

    move-result v0

    const-string v1, "inputTextureCoordinate2"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ae;->y:I

    .line 82
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/ae;->p()I

    move-result v0

    const-string v1, "inputImageTexture2"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ae;->z:I

    .line 83
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/ae;->p()I

    move-result v0

    const-string v1, "inputTextureCoordinate3"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ae;->B:I

    .line 84
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/ae;->p()I

    move-result v0

    const-string v1, "inputImageTexture3"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ae;->C:I

    .line 85
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->y:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 86
    iget v0, p0, Ljp/co/cyberagent/android/a/ae;->B:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 88
    return-void
.end method

.method public final e()V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 147
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 148
    new-array v0, v3, [I

    iget v1, p0, Ljp/co/cyberagent/android/a/ae;->A:I

    aput v1, v0, v2

    invoke-static {v3, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 151
    iput v4, p0, Ljp/co/cyberagent/android/a/ae;->A:I

    .line 153
    new-array v0, v3, [I

    iget v1, p0, Ljp/co/cyberagent/android/a/ae;->D:I

    aput v1, v0, v2

    invoke-static {v3, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 156
    iput v4, p0, Ljp/co/cyberagent/android/a/ae;->D:I

    .line 157
    return-void
.end method

.method public final declared-synchronized k()V
    .locals 0

    .prologue
    .line 112
    monitor-enter p0

    monitor-exit p0

    return-void
.end method
