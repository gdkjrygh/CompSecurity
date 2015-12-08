.class public final Ljp/co/cyberagent/android/a/r;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:Z

.field public y:I

.field private z:Ljava/nio/FloatBuffer;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 63
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 uMVPMatrix;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision mediump float;\nvarying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nuniform lowp float alpha;\n \nvoid main()\n{\n   gl_FragColor =  texture2D(inputImageTexture, textureCoordinate) * alpha;\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    iput v2, p0, Ljp/co/cyberagent/android/a/r;->y:I

    .line 75
    iput v2, p0, Ljp/co/cyberagent/android/a/r;->A:I

    .line 76
    iput v2, p0, Ljp/co/cyberagent/android/a/r;->B:I

    .line 77
    iput v2, p0, Ljp/co/cyberagent/android/a/r;->C:I

    .line 78
    iput v2, p0, Ljp/co/cyberagent/android/a/r;->D:I

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/a/r;->E:Z

    .line 64
    const/16 v0, 0x20

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/r;->z:Ljava/nio/FloatBuffer;

    .line 68
    return-void
.end method


# virtual methods
.method public final a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 9

    .prologue
    const/4 v8, -0x1

    const/16 v2, 0x1406

    const/16 v7, 0xde1

    const/4 v1, 0x2

    const/4 v3, 0x0

    .line 150
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/r;->l()V

    .line 151
    iget-boolean v0, p0, Ljp/co/cyberagent/android/a/r;->i:Z

    if-nez v0, :cond_1

    .line 203
    :cond_0
    :goto_0
    return-void

    .line 154
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/a/r;->z:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 155
    iget-boolean v0, p0, Ljp/co/cyberagent/android/a/r;->x:Z

    if-eqz v0, :cond_2

    .line 156
    iget-object v0, p0, Ljp/co/cyberagent/android/a/r;->z:Ljava/nio/FloatBuffer;

    invoke-static {p3}, Lcom/roidapp/videolib/gl/g;->a(Ljava/nio/FloatBuffer;)[F

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 160
    :cond_2
    if-eq p1, v8, :cond_4

    .line 161
    iget-boolean v0, p0, Ljp/co/cyberagent/android/a/r;->x:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Ljp/co/cyberagent/android/a/r;->z:Ljava/nio/FloatBuffer;

    move-object v6, v0

    .line 1119
    :goto_1
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->A:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 1120
    const-string v0, "glUseProgram"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 1121
    invoke-virtual {p2, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 1122
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->B:I

    move v4, v3

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 1124
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->B:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 1126
    invoke-virtual {v6, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 1127
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->D:I

    move v4, v3

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 1129
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->D:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 1131
    if-eq p1, v8, :cond_3

    .line 1132
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 1133
    invoke-static {v7, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 1134
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->C:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 1136
    :cond_3
    const/4 v0, 0x5

    const/4 v4, 0x4

    invoke-static {v0, v3, v4}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 1137
    const-string v0, "glDrawArrays"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 1138
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->B:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 1139
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 1140
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->D:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 1141
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 1142
    invoke-static {v7, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 1143
    const-string v0, "glBindTexture"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 166
    :cond_4
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 167
    const-string v0, "glUseProgram"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 169
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/r;->j()V

    .line 170
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->y:I

    if-eq v0, v8, :cond_0

    .line 171
    const-string v0, "onUpdateInputTexture1"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 172
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 173
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->y:I

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 175
    invoke-virtual {p2, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 176
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->b:I

    move v4, v3

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 178
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 180
    invoke-virtual {p3, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 181
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->f:I

    move v4, v3

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 183
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 184
    const-string v0, "glEnableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 186
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->c:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 187
    const-string v0, " glUniform1i"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 188
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->e:I

    iget v1, p0, Ljp/co/cyberagent/android/a/r;->o:F

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 189
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->d:I

    const/4 v1, 0x1

    iget-object v2, p0, Ljp/co/cyberagent/android/a/r;->k:[F

    invoke-static {v0, v1, v3, v2, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 192
    const-string v0, "onDrawArraysPre glVertexAttribPointer"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 193
    const/4 v0, 0x5

    const/4 v1, 0x4

    invoke-static {v0, v3, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 194
    const-string v0, "glDrawArrays"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 195
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 196
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 197
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 198
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 199
    invoke-static {v7, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 200
    const-string v0, "glBindTexture"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_5
    move-object v6, p3

    .line 161
    goto/16 :goto_1
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 82
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 83
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/r;->o:F

    .line 84
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/r;->p()I

    move-result v0

    const-string v1, "alpha"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/r;->e:I

    .line 86
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision mediump float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n \nuniform float alpha;\n \nvoid main()\n{\n lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n\n   gl_FragColor = textureColor;\n}"

    invoke-static {v0, v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/r;->A:I

    .line 88
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->A:I

    const-string v1, "position"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/r;->B:I

    .line 90
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->A:I

    const-string v1, "inputImageTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/r;->C:I

    .line 92
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->A:I

    const-string v1, "inputTextureCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/r;->D:I

    .line 95
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 108
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->y:I

    if-eq v0, v1, :cond_0

    .line 110
    iput v1, p0, Ljp/co/cyberagent/android/a/r;->y:I

    .line 112
    :cond_0
    iget v0, p0, Ljp/co/cyberagent/android/a/r;->A:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 113
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 114
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Ljp/co/cyberagent/android/a/r;->p:Lcom/roidapp/videolib/gl/e;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Ljp/co/cyberagent/android/a/r;->p:Lcom/roidapp/videolib/gl/e;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/e;->c()I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/r;->y:I

    .line 105
    :cond_0
    return-void
.end method
