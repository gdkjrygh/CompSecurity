.class public Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# instance fields
.field protected mFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation
.end field

.field protected mFrameBufferTextures:[I

.field protected mFrameBuffers:[I

.field protected final mGLCubeBuffer:Ljava/nio/FloatBuffer;

.field protected final mGLTextureBuffer:Ljava/nio/FloatBuffer;

.field protected final mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

.field protected mMergedFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 60
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    .line 61
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    .line 62
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    .line 68
    :goto_0
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    .line 71
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    sget-object v1, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 73
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/util/TextureRotationUtil;->TEXTURE_NO_ROTATION:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    .line 76
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    sget-object v1, Ljp/co/cyberagent/android/gpuimage/util/TextureRotationUtil;->TEXTURE_NO_ROTATION:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 78
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    const/4 v1, 0x1

    invoke-static {v0, v3, v1}, Ljp/co/cyberagent/android/gpuimage/util/TextureRotationUtil;->getRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)[F

    move-result-object v0

    .line 79
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    iput-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    .line 82
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 83
    return-void

    .line 65
    :cond_0
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->updateMergedFilters()V

    goto :goto_0
.end method


# virtual methods
.method public addFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 1

    .prologue
    .line 86
    if-nez p1, :cond_0

    .line 91
    :goto_0
    return-void

    .line 89
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->updateMergedFilters()V

    goto :goto_0
.end method

.method protected destroyFramebuffers()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 119
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    array-length v0, v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 121
    iput-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    .line 123
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    if-eqz v0, :cond_1

    .line 124
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    array-length v0, v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 125
    iput-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    .line 127
    :cond_1
    return-void
.end method

.method public getFilters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation

    .prologue
    .line 235
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    return-object v0
.end method

.method public getMergedFilters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation

    .prologue
    .line 239
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 111
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->destroyFramebuffers()V

    .line 112
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 113
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->destroy()V

    goto :goto_0

    .line 115
    :cond_0
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDestroy()V

    .line 116
    return-void
.end method

.method public onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    .prologue
    const v10, 0x8d40

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v9, 0x0

    .line 187
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->runPendingOnDrawTasks()V

    .line 188
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    if-nez v0, :cond_1

    .line 227
    :cond_0
    return-void

    .line 191
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    move v6, v5

    move v2, p1

    .line 194
    :goto_0
    if-ge v6, v7, :cond_0

    .line 195
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 196
    add-int/lit8 v1, v7, -0x1

    if-ge v6, v1, :cond_4

    move v3, v4

    .line 197
    :goto_1
    if-eqz v3, :cond_2

    .line 198
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    aget v1, v1, v6

    invoke-static {v10, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 199
    invoke-static {v9, v9, v9, v9}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 200
    const/16 v1, 0x4100

    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 203
    :cond_2
    if-nez v6, :cond_6

    .line 204
    if-ne v7, v4, :cond_5

    .line 205
    invoke-virtual {v0, v2, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 214
    :goto_2
    if-eqz v3, :cond_a

    .line 215
    invoke-static {v10, v5}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 216
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    aget v0, v0, v6

    .line 217
    if-nez v6, :cond_3

    iget-boolean v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->isCameraRender:Z

    if-eqz v1, :cond_3

    .line 218
    iget-boolean v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->isDarkCorner:Z

    if-eqz v1, :cond_9

    .line 219
    sput v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mSrcTexId:I

    .line 194
    :cond_3
    :goto_3
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    move v2, v0

    goto :goto_0

    :cond_4
    move v3, v5

    .line 196
    goto :goto_1

    .line 207
    :cond_5
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v8, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v2, v1, v8}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    goto :goto_2

    .line 208
    :cond_6
    add-int/lit8 v1, v7, -0x1

    if-ne v6, v1, :cond_8

    .line 209
    rem-int/lit8 v1, v7, 0x2

    if-nez v1, :cond_7

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    :goto_4
    invoke-virtual {v0, v2, p2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    goto :goto_2

    :cond_7
    move-object v1, p3

    goto :goto_4

    .line 211
    :cond_8
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v8, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v2, v1, v8}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    goto :goto_2

    .line 221
    :cond_9
    sput p1, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mSrcTexId:I

    goto :goto_3

    :cond_a
    move v0, v2

    goto :goto_3
.end method

.method public onInit()V
    .locals 2

    .prologue
    .line 99
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 100
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 101
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->init()V

    goto :goto_0

    .line 103
    :cond_0
    return-void
.end method

.method public onOutputSizeChanged(II)V
    .locals 11

    .prologue
    .line 137
    invoke-super {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onOutputSizeChanged(II)V

    .line 138
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->destroyFramebuffers()V

    .line 142
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 143
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 144
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onOutputSizeChanged(II)V

    .line 143
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 147
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 148
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    .line 149
    add-int/lit8 v0, v10, -0x1

    new-array v0, v0, [I

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    .line 150
    add-int/lit8 v0, v10, -0x1

    new-array v0, v0, [I

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    .line 152
    const/4 v0, 0x0

    move v9, v0

    :goto_1
    add-int/lit8 v0, v10, -0x1

    if-ge v9, v0, :cond_2

    .line 153
    const/4 v0, 0x1

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    invoke-static {v0, v1, v9}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 154
    const/4 v0, 0x1

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    invoke-static {v0, v1, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 155
    const/16 v0, 0xde1

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    aget v1, v1, v9

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 157
    const/16 v0, 0xde1

    const/4 v1, 0x0

    const/16 v2, 0x1908

    const/4 v5, 0x0

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    const/4 v8, 0x0

    move v3, p1

    move v4, p2

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 159
    const/16 v0, 0xde1

    const/16 v1, 0x2800

    const v2, 0x46180400    # 9729.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 161
    const/16 v0, 0xde1

    const/16 v1, 0x2801

    const v2, 0x46180400    # 9729.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 163
    const/16 v0, 0xde1

    const/16 v1, 0x2802

    const v2, 0x47012f00    # 33071.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 165
    const/16 v0, 0xde1

    const/16 v1, 0x2803

    const v2, 0x47012f00    # 33071.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 168
    const v0, 0x8d40

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBuffers:[I

    aget v1, v1, v9

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 169
    const v0, 0x8d40

    const v1, 0x8ce0

    const/16 v2, 0xde1

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFrameBufferTextures:[I

    aget v3, v3, v9

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 172
    const/16 v0, 0xde1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 173
    const v0, 0x8d40

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 152
    add-int/lit8 v0, v9, 0x1

    move v9, v0

    goto :goto_1

    .line 176
    :cond_2
    return-void
.end method

.method public updateMergedFilters()V
    .locals 3

    .prologue
    .line 243
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    if-nez v0, :cond_1

    .line 265
    :cond_0
    return-void

    .line 247
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    if-nez v0, :cond_3

    .line 248
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    .line 254
    :goto_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 255
    instance-of v1, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    if-eqz v1, :cond_4

    move-object v1, v0

    .line 256
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    invoke-virtual {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->updateMergedFilters()V

    .line 257
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->getMergedFilters()Ljava/util/List;

    move-result-object v0

    .line 258
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 260
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 250
    :cond_3
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_0

    .line 263
    :cond_4
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->mMergedFilters:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method
