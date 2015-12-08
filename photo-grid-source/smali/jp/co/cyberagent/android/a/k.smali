.class public Ljp/co/cyberagent/android/a/k;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field protected A:[I

.field protected B:[I

.field protected final C:Ljava/nio/FloatBuffer;

.field protected final D:Ljava/nio/FloatBuffer;

.field protected E:Ljava/nio/FloatBuffer;

.field private F:Ljava/lang/String;

.field protected y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field protected z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/k;-><init>(Ljava/util/List;)V

    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 65
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/h;-><init>()V

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/k;->F:Ljava/lang/String;

    .line 66
    iput-object p1, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    .line 67
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    .line 73
    :goto_0
    sget-object v0, Lcom/roidapp/videolib/gl/g;->a:[F

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

    iput-object v0, p0, Ljp/co/cyberagent/android/a/k;->C:Ljava/nio/FloatBuffer;

    .line 76
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->C:Ljava/nio/FloatBuffer;

    sget-object v1, Lcom/roidapp/videolib/gl/g;->a:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 78
    sget-object v0, Ljp/co/cyberagent/android/a/a/a;->a:[F

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

    iput-object v0, p0, Ljp/co/cyberagent/android/a/k;->D:Ljava/nio/FloatBuffer;

    .line 81
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->D:Ljava/nio/FloatBuffer;

    sget-object v1, Ljp/co/cyberagent/android/a/a/a;->a:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 83
    sget v0, Ljp/co/cyberagent/android/a/an;->a:I

    const/4 v1, 0x1

    invoke-static {v0, v3, v1}, Ljp/co/cyberagent/android/a/a/a;->a(IZZ)[F

    move-result-object v0

    .line 84
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

    iput-object v1, p0, Ljp/co/cyberagent/android/a/k;->E:Ljava/nio/FloatBuffer;

    .line 87
    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->E:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 88
    return-void

    .line 70
    :cond_0
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/k;->g()V

    goto :goto_0
.end method

.method private f()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 132
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    array-length v0, v0

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 134
    iput-object v3, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    .line 136
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    if-eqz v0, :cond_1

    .line 137
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    array-length v0, v0

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 138
    iput-object v3, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    .line 140
    :cond_1
    return-void
.end method

.method private g()V
    .locals 3

    .prologue
    .line 298
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    if-nez v0, :cond_1

    .line 320
    :cond_0
    return-void

    .line 302
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    if-nez v0, :cond_3

    .line 303
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    .line 309
    :goto_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 310
    instance-of v1, v0, Ljp/co/cyberagent/android/a/k;

    if-eqz v1, :cond_4

    move-object v1, v0

    .line 311
    check-cast v1, Ljp/co/cyberagent/android/a/k;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/k;->g()V

    .line 312
    check-cast v0, Ljp/co/cyberagent/android/a/k;

    .line 1294
    iget-object v0, v0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    .line 313
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 315
    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 305
    :cond_3
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_0

    .line 318
    :cond_4
    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method


# virtual methods
.method public a(II)V
    .locals 11

    .prologue
    .line 151
    const-string v0, "GPUImage"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onOutputSizeChanged width:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "height:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    if-eqz v0, :cond_1

    iget v0, p0, Ljp/co/cyberagent/android/a/k;->g:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Ljp/co/cyberagent/android/a/k;->h:I

    if-ne v0, p2, :cond_1

    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    array-length v1, v1

    add-int/lit8 v1, v1, 0x1

    if-ne v0, v1, :cond_1

    .line 205
    :cond_0
    return-void

    .line 155
    :cond_1
    const-string v0, "GPUImage"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "2 onOutputSizeChanged width:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "height:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    invoke-super {p0, p1, p2}, Ljp/co/cyberagent/android/a/h;->a(II)V

    .line 158
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    if-eqz v0, :cond_2

    .line 159
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/k;->f()V

    .line 162
    :cond_2
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 163
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_3

    .line 164
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, p1, p2}, Ljp/co/cyberagent/android/a/h;->a(II)V

    .line 163
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 167
    :cond_3
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 168
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    .line 169
    add-int/lit8 v0, v10, -0x1

    new-array v0, v0, [I

    iput-object v0, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    .line 170
    add-int/lit8 v0, v10, -0x1

    new-array v0, v0, [I

    iput-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    .line 172
    const/4 v0, 0x0

    move v9, v0

    :goto_1
    add-int/lit8 v0, v10, -0x1

    if-ge v9, v0, :cond_0

    .line 173
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    const/4 v1, -0x1

    aput v1, v0, v9

    .line 175
    const/4 v0, 0x1

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    invoke-static {v0, v1, v9}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 176
    const/4 v0, 0x1

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    invoke-static {v0, v1, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 177
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    aget v0, v0, v9

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 178
    const/4 v0, 0x1

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    invoke-static {v0, v1, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 180
    :cond_4
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    aget v0, v0, v9

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    .line 181
    const-string v0, "OpenglError"

    const-string v1, "G:opengl can\'t allocate texture....."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    :cond_5
    const/16 v0, 0xde1

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    aget v1, v1, v9

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 185
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

    .line 187
    const/16 v0, 0xde1

    const/16 v1, 0x2800

    const v2, 0x46180400    # 9729.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 189
    const/16 v0, 0xde1

    const/16 v1, 0x2801

    const v2, 0x46180400    # 9729.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 191
    const/16 v0, 0xde1

    const/16 v1, 0x2802

    const v2, 0x47012f00    # 33071.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 193
    const/16 v0, 0xde1

    const/16 v1, 0x2803

    const v2, 0x47012f00    # 33071.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 196
    const v0, 0x8d40

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    aget v1, v1, v9

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 197
    const v0, 0x8d40

    const v1, 0x8ce0

    const/16 v2, 0xde1

    iget-object v3, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    aget v3, v3, v9

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 200
    const/16 v0, 0xde1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 201
    const v0, 0x8d40

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onOutputSizeChanged:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 172
    add-int/lit8 v0, v9, 0x1

    move v9, v0

    goto/16 :goto_1
.end method

.method public a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;[F)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    .prologue
    .line 216
    const-string v0, "GPUImageGroup"

    const-string v1, "onDraw in"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/k;->l()V

    .line 218
    const-string v0, "runPendingOnDrawTasks"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 219
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/k;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    if-nez v0, :cond_1

    .line 262
    :cond_0
    :goto_0
    return-void

    .line 222
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    if-eqz v0, :cond_8

    .line 223
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 225
    const/4 v0, 0x0

    move v3, v0

    move v2, p1

    :goto_1
    if-ge v3, v4, :cond_8

    .line 227
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 228
    const-string v1, "GPUImageGroup"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "onDraw "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ",size:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    add-int/lit8 v1, v4, -0x1

    if-ge v3, v1, :cond_3

    const/4 v1, 0x1

    .line 230
    :goto_2
    const/16 v5, 0xde1

    const/4 v6, 0x0

    invoke-static {v5, v6}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 231
    const v5, 0x8d40

    const/4 v6, 0x0

    invoke-static {v5, v6}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 232
    if-eqz v1, :cond_2

    .line 233
    const v5, 0x8d40

    iget-object v6, p0, Ljp/co/cyberagent/android/a/k;->A:[I

    aget v6, v6, v3

    invoke-static {v5, v6}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 234
    if-eqz p4, :cond_4

    array-length v5, p4

    const/4 v6, 0x4

    if-lt v5, v6, :cond_4

    .line 235
    const/4 v5, 0x0

    aget v5, p4, v5

    const/4 v6, 0x1

    aget v6, p4, v6

    const/4 v7, 0x2

    aget v7, p4, v7

    const/4 v8, 0x3

    aget v8, p4, v8

    invoke-static {v5, v6, v7, v8}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 238
    :goto_3
    const-string v5, "glClearColor"

    invoke-static {v5}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 239
    const/16 v5, 0x4100

    invoke-static {v5}, Landroid/opengl/GLES20;->glClear(I)V

    .line 240
    const-string v5, "glClear"

    invoke-static {v5}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 242
    :cond_2
    if-nez v3, :cond_6

    .line 243
    const/4 v5, 0x1

    if-ne v4, v5, :cond_5

    .line 244
    invoke-virtual {v0, v2, p2, p3}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 253
    :goto_4
    const/16 v0, 0xde1

    const/4 v5, 0x0

    invoke-static {v0, v5}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 254
    const v0, 0x8d40

    const/4 v5, 0x0

    invoke-static {v0, v5}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 255
    if-eqz v1, :cond_9

    .line 256
    const v0, 0x8d40

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 257
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    aget v0, v0, v3

    .line 225
    :goto_5
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v2, v0

    goto/16 :goto_1

    .line 229
    :cond_3
    const/4 v1, 0x0

    goto :goto_2

    .line 237
    :cond_4
    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    goto :goto_3

    .line 246
    :cond_5
    iget-object v5, p0, Ljp/co/cyberagent/android/a/k;->C:Ljava/nio/FloatBuffer;

    iget-object v6, p0, Ljp/co/cyberagent/android/a/k;->D:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v2, v5, v6}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    goto :goto_4

    .line 247
    :cond_6
    add-int/lit8 v5, v4, -0x1

    if-ne v3, v5, :cond_7

    .line 248
    const/4 v5, 0x1

    invoke-virtual {v0, v2, p2, p3, v5}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Z)V

    goto :goto_4

    .line 251
    :cond_7
    iget-object v5, p0, Ljp/co/cyberagent/android/a/k;->C:Ljava/nio/FloatBuffer;

    iget-object v6, p0, Ljp/co/cyberagent/android/a/k;->D:Ljava/nio/FloatBuffer;

    const/4 v7, 0x1

    invoke-virtual {v0, v2, v5, v6, v7}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Z)V

    goto :goto_4

    .line 261
    :cond_8
    const-string v0, "GPUImageGroup"

    const-string v1, "onDraw out"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_9
    move v0, v2

    goto :goto_5
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 289
    iput-object p1, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    .line 290
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/k;->g()V

    .line 291
    return-void
.end method

.method public final a(Ljp/co/cyberagent/android/a/h;)V
    .locals 1

    .prologue
    .line 99
    if-nez p1, :cond_0

    .line 104
    :goto_0
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/k;->g()V

    goto :goto_0
.end method

.method public final b(I)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 265
    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 266
    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    .line 273
    :cond_0
    :goto_0
    return v0

    .line 269
    :cond_1
    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    if-eqz v1, :cond_0

    iget-object v1, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    array-length v1, v1

    if-ge p1, v1, :cond_0

    .line 270
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->B:[I

    aget v0, v0, p1

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 112
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 113
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 114
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->h()V

    goto :goto_0

    .line 116
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 124
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/k;->f()V

    .line 125
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 126
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->i()V

    goto :goto_0

    .line 128
    :cond_0
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 129
    return-void
.end method

.method public final q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation

    .prologue
    .line 282
    iget-object v0, p0, Ljp/co/cyberagent/android/a/k;->y:Ljava/util/List;

    return-object v0
.end method
