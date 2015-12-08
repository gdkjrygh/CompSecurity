.class public Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;
.source "SourceFile"


# direct methods
.method public constructor <init>(FFII)V
    .locals 1

    .prologue
    .line 15
    invoke-static {p1, p2, p3, p4}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->createFilters(FFII)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 16
    return-void
.end method

.method private static createFilters(FFII)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFII)",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 31
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 32
    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 33
    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setAlpha(F)V

    .line 37
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageSkinCheckFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSkinCheckFilter;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;

    invoke-direct {v3, p0, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;-><init>(FII)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageMulityply;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageMulityply;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;

    invoke-direct {v3, p0, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;-><init>(FII)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;

    invoke-direct {v3, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;-><init>(F)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageMulityply;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageMulityply;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageSubtractBlendFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSubtractBlendFilter;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;

    invoke-direct {v3, p0, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;-><init>(FII)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;

    invoke-direct {v3, p0, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;-><init>(FII)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageMulityply;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageMulityply;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageAddFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageAddFilter;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter2;

    invoke-direct {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter2;-><init>(Z)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    return-object v0
.end method


# virtual methods
.method public onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const v7, 0x8d40

    const/16 v6, 0x4100

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 102
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->runPendingOnDrawTasks()V

    .line 103
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    if-nez v0, :cond_1

    .line 227
    :cond_0
    :goto_0
    return-void

    .line 107
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    aget v0, v0, v8

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 109
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 110
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 111
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 112
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, p1, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 114
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    aget v0, v0, v5

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 115
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 116
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 117
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 118
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v1, v1, v8

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 119
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 120
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 121
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 122
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 123
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v1, v1, v5

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 125
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    aget v0, v0, v5

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 126
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 127
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 128
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-object v1, v0

    .line 129
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v2, v2, v8

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setTexture(I)V

    move-object v1, v0

    .line 130
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v1, v2, v8, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 131
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v1, v1, v8

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 133
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x3

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 134
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 135
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 136
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 137
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v1, v1, v5

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 138
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 139
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 140
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 141
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 142
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x3

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 144
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    aget v0, v0, v5

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 145
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 146
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 147
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-object v1, v0

    .line 148
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v3, 0x4

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setTexture(I)V

    move-object v1, v0

    .line 149
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v1, v2, v8, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 150
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 152
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x3

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 153
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 154
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 155
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-object v1, v0

    .line 156
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v2, v2, v5

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setTexture(I)V

    move-object v1, v0

    .line 157
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v1, v2, v8, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 158
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 160
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 161
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 162
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 163
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-object v1, v0

    .line 164
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v3, 0x3

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setTexture(I)V

    move-object v1, v0

    .line 165
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v1, v2, v8, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 166
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 168
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 169
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 170
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 171
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0x9

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 172
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v1, v1, v5

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 173
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    aget v0, v0, v5

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 174
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 175
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 176
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 177
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 179
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 180
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 181
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 182
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0xb

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 183
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x4

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 184
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x3

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 185
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 186
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 187
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0xc

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 188
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 190
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 191
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 192
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 193
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0xd

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-object v1, v0

    .line 194
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v2, v2, v5

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setTexture(I)V

    move-object v1, v0

    .line 195
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v1, v2, v8, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 196
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v1, v1, v8

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 198
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 199
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 200
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 201
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0xe

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-object v1, v0

    .line 202
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v3, 0x4

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setTexture(I)V

    move-object v1, v0

    .line 203
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v1, v2, v8, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 204
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x3

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 206
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    aget v0, v0, v5

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 207
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 208
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 209
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0xf

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 210
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 212
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    invoke-static {v7, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 213
    invoke-static {v4, v4, v4, v4}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 214
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 215
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0x10

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 216
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v1, v1, v5

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 218
    invoke-static {v7, v8}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 219
    const v0, 0x3e1cac08    # 0.153f

    const v1, 0x3e1cac08    # 0.153f

    const v2, 0x3e1cac08    # 0.153f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 220
    invoke-static {v6}, Landroid/opengl/GLES20;->glClear(I)V

    .line 221
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/16 v1, 0x11

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-object v1, v0

    .line 222
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v2, v2, v5

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setTexture(I)V

    move-object v1, v0

    .line 223
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {v1, v2, v8, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 224
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mGLTextureFlipBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, p2, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    goto/16 :goto_0
.end method

.method public onOutputSizeChanged(II)V
    .locals 13

    .prologue
    const v12, 0x46180400    # 9729.0f

    const v11, 0x8d40

    const/4 v10, 0x5

    const/4 v1, 0x0

    const/16 v0, 0xde1

    .line 57
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mOutputWidth:I

    .line 58
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mOutputHeight:I

    .line 59
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    if-eqz v2, :cond_0

    .line 60
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->destroyFramebuffers()V

    .line 63
    :cond_0
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFilters:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    move v3, v1

    .line 64
    :goto_0
    if-ge v3, v4, :cond_1

    .line 65
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFilters:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v2, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onOutputSizeChanged(II)V

    .line 64
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_0

    .line 68
    :cond_1
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    if-eqz v2, :cond_2

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 70
    new-array v2, v10, [I

    iput-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    .line 71
    new-array v2, v10, [I

    iput-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    move v9, v1

    .line 73
    :goto_1
    if-ge v9, v10, :cond_2

    .line 74
    const/4 v2, 0x1

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    invoke-static {v2, v3, v9}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 75
    const/4 v2, 0x1

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    invoke-static {v2, v3, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 76
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v2, v2, v9

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 78
    const/16 v2, 0x1908

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    const/4 v8, 0x0

    move v3, p1

    move v4, p2

    move v5, v1

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 80
    const/16 v2, 0x2800

    invoke-static {v0, v2, v12}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 82
    const/16 v2, 0x2801

    invoke-static {v0, v2, v12}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 84
    const/16 v2, 0x2802

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 86
    const/16 v2, 0x2803

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 89
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBuffers:[I

    aget v2, v2, v9

    invoke-static {v11, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 90
    const v2, 0x8ce0

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mFrameBufferTextures:[I

    aget v3, v3, v9

    invoke-static {v11, v2, v0, v3, v1}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 93
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 94
    invoke-static {v11, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 73
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    goto :goto_1

    .line 97
    :cond_2
    return-void
.end method

.method public setAlpha(F)V
    .locals 2

    .prologue
    .line 24
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 25
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setAlpha(F)V

    .line 26
    return-void
.end method

.method public setEps(F)V
    .locals 2

    .prologue
    .line 19
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->mMergedFilters:Ljava/util/List;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 20
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideCoeA;->setEPS(F)V

    .line 21
    return-void
.end method
