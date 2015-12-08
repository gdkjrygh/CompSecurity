.class public Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field private static final VERTEX_SHADER:Ljava/lang/String; = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}"


# instance fields
.field private mBitmap:Landroid/graphics/Bitmap;

.field public mFilterInputTextureUniform2:I

.field public mFilterSecondTextureCoordinateAttribute:I

.field public mFilterSourceTexture2:I

.field private mTexture2CoordinatesBuffer:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}"

    invoke-direct {p0, v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 54
    invoke-direct {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const/4 v0, -0x1

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSourceTexture2:I

    .line 55
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p0, v0, v1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 56
    return-void
.end method


# virtual methods
.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 109
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDestroy()V

    .line 110
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSourceTexture2:I

    sget v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mSrcTexId:I

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mUseSrcTex:Z

    if-nez v0, :cond_0

    .line 111
    new-array v0, v3, [I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSourceTexture2:I

    aput v1, v0, v2

    invoke-static {v3, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 114
    const/4 v0, -0x1

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSourceTexture2:I

    .line 117
    :cond_0
    return-void
.end method

.method protected onDrawArraysPre()V
    .locals 6

    .prologue
    const/16 v1, 0xde1

    const/4 v3, 0x0

    .line 121
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSecondTextureCoordinateAttribute:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 122
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 123
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mUseSrcTex:Z

    if-eqz v0, :cond_1

    .line 124
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->isUseSrcTex:Z

    if-eqz v0, :cond_0

    sget v0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mSrcTexId:I

    :goto_0
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 128
    :goto_1
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterInputTextureUniform2:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 130
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mTexture2CoordinatesBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 131
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSecondTextureCoordinateAttribute:I

    const/4 v1, 0x2

    const/16 v2, 0x1406

    iget-object v5, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mTexture2CoordinatesBuffer:Ljava/nio/ByteBuffer;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 132
    return-void

    .line 124
    :cond_0
    sget v0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mSrcThumbnailTexId:I

    goto :goto_0

    .line 126
    :cond_1
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSourceTexture2:I

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    goto :goto_1
.end method

.method public onInit()V
    .locals 2

    .prologue
    .line 60
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 62
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->getProgram()I

    move-result v0

    const-string v1, "inputTextureCoordinate2"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSecondTextureCoordinateAttribute:I

    .line 63
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->getProgram()I

    move-result v0

    const-string v1, "inputImageTexture2"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterInputTextureUniform2:I

    .line 64
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSecondTextureCoordinateAttribute:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 66
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 69
    :cond_0
    return-void
.end method

.method public recycleBitmap()V
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    .line 106
    :cond_0
    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 72
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    :cond_0
    :goto_0
    return-void

    .line 75
    :cond_1
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    .line 76
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 79
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter$1;

    invoke-direct {v0, p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->runOnDraw(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V
    .locals 3

    .prologue
    .line 135
    invoke-static {p1, p2, p3}, Ljp/co/cyberagent/android/gpuimage/util/TextureRotationUtil;->getRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)[F

    move-result-object v0

    .line 137
    const/16 v1, 0x20

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v2

    .line 139
    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 140
    invoke-virtual {v2}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    .line 142
    iput-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mTexture2CoordinatesBuffer:Ljava/nio/ByteBuffer;

    .line 143
    return-void
.end method

.method public setTexture(I)V
    .locals 1

    .prologue
    .line 93
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 94
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->mFilterSourceTexture2:I

    .line 95
    return-void
.end method
