.class public Ljp/co/cyberagent/android/a/aj;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field private C:Landroid/graphics/Bitmap;

.field private y:Ljava/nio/ByteBuffer;

.field public z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 52
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}"

    invoke-direct {p0, v0, p1}, Ljp/co/cyberagent/android/a/aj;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0, p1, p2}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Ljp/co/cyberagent/android/a/aj;->B:I

    .line 57
    sget v0, Ljp/co/cyberagent/android/a/an;->a:I

    .line 1132
    invoke-static {v0, v1, v1}, Ljp/co/cyberagent/android/a/a/a;->a(IZZ)[F

    move-result-object v0

    .line 1134
    const/16 v1, 0x20

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 1135
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v2

    .line 1136
    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 1137
    invoke-virtual {v2}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    .line 1139
    iput-object v1, p0, Ljp/co/cyberagent/android/a/aj;->y:Ljava/nio/ByteBuffer;

    .line 58
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 118
    iget v0, p0, Ljp/co/cyberagent/android/a/aj;->z:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 119
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 123
    const/16 v0, 0xde1

    iget v1, p0, Ljp/co/cyberagent/android/a/aj;->B:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 125
    iget v0, p0, Ljp/co/cyberagent/android/a/aj;->A:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 127
    iget-object v0, p0, Ljp/co/cyberagent/android/a/aj;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 128
    iget v0, p0, Ljp/co/cyberagent/android/a/aj;->z:I

    const/4 v1, 0x2

    const/16 v2, 0x1406

    iget-object v5, p0, Ljp/co/cyberagent/android/a/aj;->y:Ljava/nio/ByteBuffer;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 129
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 74
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    :cond_0
    :goto_0
    return-void

    .line 77
    :cond_1
    iput-object p1, p0, Ljp/co/cyberagent/android/a/aj;->C:Landroid/graphics/Bitmap;

    .line 78
    iget-object v0, p0, Ljp/co/cyberagent/android/a/aj;->C:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 81
    new-instance v0, Ljp/co/cyberagent/android/a/ak;

    invoke-direct {v0, p0, p1}, Ljp/co/cyberagent/android/a/ak;-><init>(Ljp/co/cyberagent/android/a/aj;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/aj;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 62
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 64
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/aj;->p()I

    move-result v0

    const-string v1, "inputTextureCoordinate2"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/aj;->z:I

    .line 65
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/aj;->p()I

    move-result v0

    const-string v1, "inputImageTexture2"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/aj;->A:I

    .line 66
    iget v0, p0, Ljp/co/cyberagent/android/a/aj;->z:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 68
    iget-object v0, p0, Ljp/co/cyberagent/android/a/aj;->C:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/a/aj;->C:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    iget-object v0, p0, Ljp/co/cyberagent/android/a/aj;->C:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 71
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 106
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 107
    iget v0, p0, Ljp/co/cyberagent/android/a/aj;->B:I

    if-eq v0, v1, :cond_0

    .line 111
    iput v1, p0, Ljp/co/cyberagent/android/a/aj;->B:I

    .line 114
    :cond_0
    return-void
.end method
