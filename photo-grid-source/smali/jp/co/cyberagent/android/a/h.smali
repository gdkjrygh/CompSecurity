.class public Ljp/co/cyberagent/android/a/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final A:Ljava/lang/String;

.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:I

.field protected h:I

.field protected i:Z

.field protected j:Z

.field protected k:[F

.field public l:[F

.field public m:[F

.field public n:[F

.field protected o:F

.field protected p:Lcom/roidapp/videolib/gl/e;

.field protected q:I

.field protected r:I

.field protected s:I

.field protected t:Ljava/nio/FloatBuffer;

.field protected u:Ljava/nio/FloatBuffer;

.field protected v:F

.field public w:I

.field protected x:Z

.field private final y:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 90
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/16 v4, 0x20

    const/4 v3, 0x0

    const/4 v2, -0x1

    const/16 v1, 0x10

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput v2, p0, Ljp/co/cyberagent/android/a/h;->e:I

    .line 73
    new-array v0, v1, [F

    iput-object v0, p0, Ljp/co/cyberagent/android/a/h;->k:[F

    .line 75
    new-array v0, v1, [F

    iput-object v0, p0, Ljp/co/cyberagent/android/a/h;->l:[F

    .line 76
    new-array v0, v1, [F

    iput-object v0, p0, Ljp/co/cyberagent/android/a/h;->m:[F

    .line 77
    new-array v0, v1, [F

    iput-object v0, p0, Ljp/co/cyberagent/android/a/h;->n:[F

    .line 81
    iput v2, p0, Ljp/co/cyberagent/android/a/h;->q:I

    .line 82
    iput v2, p0, Ljp/co/cyberagent/android/a/h;->r:I

    .line 83
    iput v3, p0, Ljp/co/cyberagent/android/a/h;->s:I

    .line 87
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/h;->v:F

    .line 222
    iput-boolean v3, p0, Ljp/co/cyberagent/android/a/h;->x:Z

    .line 97
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/a/h;->y:Ljava/util/LinkedList;

    .line 98
    iput-object p1, p0, Ljp/co/cyberagent/android/a/h;->z:Ljava/lang/String;

    .line 99
    iput-object p2, p0, Ljp/co/cyberagent/android/a/h;->A:Ljava/lang/String;

    .line 100
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/h;->t:Ljava/nio/FloatBuffer;

    .line 107
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/h;->u:Ljava/nio/FloatBuffer;

    .line 110
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    .prologue
    .line 316
    return-void
.end method

.method public final a(IF)V
    .locals 1

    .prologue
    .line 414
    new-instance v0, Ljp/co/cyberagent/android/a/i;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/a/i;-><init>(Ljp/co/cyberagent/android/a/h;IF)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/h;->a(Ljava/lang/Runnable;)V

    .line 420
    return-void
.end method

.method public a(II)V
    .locals 0

    .prologue
    .line 160
    iput p1, p0, Ljp/co/cyberagent/android/a/h;->g:I

    .line 161
    iput p2, p0, Ljp/co/cyberagent/android/a/h;->h:I

    .line 162
    return-void
.end method

.method public a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 8

    .prologue
    const/16 v2, 0x1406

    const/16 v7, 0xde1

    const/4 v1, 0x2

    const/4 v6, -0x1

    const/4 v3, 0x0

    .line 239
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 240
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "glUseProgram:"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Ljp/co/cyberagent/android/a/h;->a:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 241
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->l()V

    .line 242
    const-string v0, "runPendingOnDrawTasks"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 243
    iget-boolean v0, p0, Ljp/co/cyberagent/android/a/h;->i:Z

    if-nez v0, :cond_0

    .line 303
    :goto_0
    return-void

    .line 246
    :cond_0
    invoke-virtual {p3, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 248
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->u:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 249
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->u:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, p3}, Ljava/nio/FloatBuffer;->put(Ljava/nio/FloatBuffer;)Ljava/nio/FloatBuffer;

    .line 251
    invoke-virtual {p3, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 252
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->t:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 253
    iget-boolean v0, p0, Ljp/co/cyberagent/android/a/h;->x:Z

    if-eqz v0, :cond_4

    .line 254
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->t:Ljava/nio/FloatBuffer;

    invoke-static {p3}, Lcom/roidapp/videolib/gl/g;->a(Ljava/nio/FloatBuffer;)[F

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 261
    :goto_1
    const-string v0, "textureBuffer"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p2, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 264
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->b:I

    move v4, v3

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 265
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 267
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->t:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 268
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->f:I

    iget-object v5, p0, Ljp/co/cyberagent/android/a/h;->t:Ljava/nio/FloatBuffer;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 272
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 273
    if-eq p1, v6, :cond_1

    .line 274
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 275
    invoke-static {v7, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 276
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->c:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 278
    :cond_1
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->d:I

    const/4 v1, 0x1

    iget-object v2, p0, Ljp/co/cyberagent/android/a/h;->k:[F

    invoke-static {v0, v1, v3, v2, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 279
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->e:I

    if-eq v0, v6, :cond_2

    .line 280
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->e:I

    iget v1, p0, Ljp/co/cyberagent/android/a/h;->o:F

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 281
    const-string v0, "glUniform1f"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 283
    :cond_2
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->j()V

    .line 284
    const-string v0, "onUpdateInputTexture1"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 285
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->b()V

    .line 286
    const-string v0, "onUpdateInputTexture2"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 287
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->k()V

    .line 288
    const-string v0, "onUpdateInputTexture3"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 290
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->a()V

    .line 291
    const-string v0, "onDrawArraysPre"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 292
    const/4 v0, 0x5

    const/4 v1, 0x4

    invoke-static {v0, v3, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 293
    const-string v0, "glDrawArrays"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 294
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 295
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 296
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 297
    const-string v0, "glDisableVertexAttribArray"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 299
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->w:I

    if-ltz v0, :cond_3

    .line 300
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->w:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 301
    :cond_3
    invoke-static {v7, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 302
    const-string v0, "glBindTexture"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 259
    :cond_4
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->t:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, p3}, Ljava/nio/FloatBuffer;->put(Ljava/nio/FloatBuffer;)Ljava/nio/FloatBuffer;

    goto/16 :goto_1
.end method

.method public final a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Z)V
    .locals 1

    .prologue
    .line 225
    iput-boolean p4, p0, Ljp/co/cyberagent/android/a/h;->x:Z

    .line 226
    invoke-virtual {p0, p1, p2, p3}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/a/h;->x:Z

    .line 229
    return-void
.end method

.method public a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;[F)V
    .locals 0

    .prologue
    .line 233
    invoke-virtual {p0, p1, p2, p3}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 235
    return-void
.end method

.method public final a(I[F)V
    .locals 1

    .prologue
    .line 441
    new-instance v0, Ljp/co/cyberagent/android/a/j;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/a/j;-><init>(Ljp/co/cyberagent/android/a/h;I[F)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/h;->a(Ljava/lang/Runnable;)V

    .line 447
    return-void
.end method

.method public final a(Lcom/roidapp/videolib/gl/e;)V
    .locals 0

    .prologue
    .line 339
    iput-object p1, p0, Ljp/co/cyberagent/android/a/h;->p:Lcom/roidapp/videolib/gl/e;

    .line 340
    return-void
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 501
    iget-object v1, p0, Ljp/co/cyberagent/android/a/h;->y:Ljava/util/LinkedList;

    monitor-enter v1

    .line 502
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->y:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 503
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 320
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    .line 135
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->z:Ljava/lang/String;

    iget-object v1, p0, Ljp/co/cyberagent/android/a/h;->A:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    .line 136
    const-string v0, "GPUImagefilter"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onInit  mGLProgId "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ljp/co/cyberagent/android/a/h;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    const-string v1, "position"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/h;->b:I

    .line 138
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    const-string v1, "inputImageTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/h;->c:I

    .line 139
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    const-string v1, "uMVPMatrix"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/h;->d:I

    .line 140
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    const-string v1, "inputTextureCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/h;->f:I

    .line 144
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 147
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/a/h;->i:Z

    .line 148
    return-void
.end method

.method public e()V
    .locals 0

    .prologue
    .line 157
    return-void
.end method

.method public e(F)V
    .locals 0

    .prologue
    .line 365
    iput p1, p0, Ljp/co/cyberagent/android/a/h;->o:F

    .line 366
    return-void
.end method

.method public final f(F)V
    .locals 0

    .prologue
    .line 369
    iput p1, p0, Ljp/co/cyberagent/android/a/h;->v:F

    .line 370
    return-void
.end method

.method public final h()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 123
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 124
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/a/h;->i:Z

    .line 125
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->k:[F

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 126
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->m:[F

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 127
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->n:[F

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 128
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->l:[F

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 130
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/h;->o:F

    .line 131
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 132
    return-void
.end method

.method public final i()V
    .locals 1

    .prologue
    .line 151
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/a/h;->i:Z

    .line 152
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 153
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 154
    return-void
.end method

.method protected j()V
    .locals 0

    .prologue
    .line 318
    return-void
.end method

.method protected k()V
    .locals 0

    .prologue
    .line 322
    return-void
.end method

.method protected final l()V
    .locals 2

    .prologue
    .line 329
    iget-object v1, p0, Ljp/co/cyberagent/android/a/h;->y:Ljava/util/LinkedList;

    monitor-enter v1

    .line 330
    :goto_0
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->y:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 331
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->y:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 332
    const-string v0, "runPendingOnDrawTasks"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 335
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final m()Z
    .locals 1

    .prologue
    .line 343
    iget-boolean v0, p0, Ljp/co/cyberagent/android/a/h;->i:Z

    return v0
.end method

.method public final n()[F
    .locals 1

    .prologue
    .line 347
    iget-object v0, p0, Ljp/co/cyberagent/android/a/h;->k:[F

    return-object v0
.end method

.method public final o()F
    .locals 1

    .prologue
    .line 373
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->v:F

    return v0
.end method

.method public final p()I
    .locals 1

    .prologue
    .line 385
    iget v0, p0, Ljp/co/cyberagent/android/a/h;->a:I

    return v0
.end method
