.class public final Ljp/co/cyberagent/android/a/c;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 35
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iput v2, p0, Ljp/co/cyberagent/android/a/c;->y:I

    .line 38
    iput v2, p0, Ljp/co/cyberagent/android/a/c;->z:I

    .line 36
    return-void
.end method

.method private a(IILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 7

    .prologue
    const/16 v2, 0x1406

    const/16 v6, 0xde1

    const/4 v1, 0x2

    const/4 v3, 0x0

    .line 63
    invoke-static {p1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 64
    const-string v0, "glUseProgram"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p3, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 66
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->b:I

    move v4, v3

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 68
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 70
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 71
    invoke-virtual {p4, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 72
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->f:I

    move v4, v3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 75
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 76
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 77
    invoke-static {v6, p2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 78
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->c:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 80
    :cond_0
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->d:I

    const/4 v1, 0x1

    iget-object v2, p0, Ljp/co/cyberagent/android/a/c;->k:[F

    invoke-static {v0, v1, v3, v2, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 82
    const/4 v0, 0x5

    const/4 v1, 0x4

    invoke-static {v0, v3, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 83
    const-string v0, "glDrawArrays"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 84
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 85
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 86
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 87
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 88
    invoke-static {v6, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 89
    const-string v0, "glBindTexture"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 90
    return-void
.end method


# virtual methods
.method public final a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 95
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/c;->l()V

    .line 96
    iget-boolean v0, p0, Ljp/co/cyberagent/android/a/c;->i:Z

    if-nez v0, :cond_1

    .line 112
    :cond_0
    :goto_0
    return-void

    .line 1045
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/a/c;->p:Lcom/roidapp/videolib/gl/e;

    if-eqz v0, :cond_2

    .line 1046
    iget-object v0, p0, Ljp/co/cyberagent/android/a/c;->p:Lcom/roidapp/videolib/gl/e;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/e;->c()I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/c;->z:I

    .line 101
    :cond_2
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->z:I

    if-eq v0, v2, :cond_3

    .line 102
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->a:I

    .line 106
    :goto_1
    iget v1, p0, Ljp/co/cyberagent/android/a/c;->z:I

    invoke-direct {p0, v0, v1, p2, p3}, Ljp/co/cyberagent/android/a/c;->a(IILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 108
    if-eq p1, v2, :cond_0

    .line 109
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->a:I

    invoke-direct {p0, v0, p1, p2, p3}, Ljp/co/cyberagent/android/a/c;->a(IILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    goto :goto_0

    .line 104
    :cond_3
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->y:I

    goto :goto_1
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 21
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/c;->o:F

    .line 23
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nuniform lowp float alpha;\n \nvoid main()\n{\n    gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n}"

    invoke-static {v0, v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/c;->y:I

    .line 27
    return-void
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 31
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 32
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 51
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 52
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->z:I

    if-eq v0, v1, :cond_0

    .line 54
    iput v1, p0, Ljp/co/cyberagent/android/a/c;->z:I

    .line 56
    :cond_0
    iget v0, p0, Ljp/co/cyberagent/android/a/c;->y:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 57
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 59
    return-void
.end method
