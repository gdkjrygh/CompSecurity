.class public final Lcom/roidapp/videolib/b/h;
.super Ljp/co/cyberagent/android/a/k;
.source "SourceFile"


# instance fields
.field private F:I

.field private G:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/k;-><init>()V

    .line 18
    iput v0, p0, Lcom/roidapp/videolib/b/h;->F:I

    .line 19
    iput-boolean v0, p0, Lcom/roidapp/videolib/b/h;->G:Z

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lcom/roidapp/videolib/b/h;->F:I

    .line 22
    return-void
.end method

.method public final a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;[F)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/h;->l()V

    .line 33
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/h;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/h;->A:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/h;->B:[I

    if-nez v0, :cond_1

    .line 78
    :cond_0
    return-void

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/h;->z:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/roidapp/videolib/b/h;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 39
    const/4 v0, 0x0

    move v5, v0

    move v3, p1

    :goto_0
    if-ge v5, v6, :cond_0

    .line 40
    iget-object v0, p0, Lcom/roidapp/videolib/b/h;->z:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 41
    add-int/lit8 v1, v6, -0x1

    if-ge v5, v1, :cond_2

    const/4 v1, 0x1

    move v4, v1

    .line 42
    :goto_1
    if-eqz v4, :cond_4

    .line 43
    const v1, 0x8d40

    iget-object v2, p0, Lcom/roidapp/videolib/b/h;->A:[I

    aget v2, v2, v5

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 44
    if-eqz p4, :cond_3

    array-length v1, p4

    const/4 v2, 0x4

    if-lt v1, v2, :cond_3

    .line 45
    const/4 v1, 0x0

    aget v1, p4, v1

    const/4 v2, 0x1

    aget v2, p4, v2

    const/4 v7, 0x2

    aget v7, p4, v7

    const/4 v8, 0x3

    aget v8, p4, v8

    invoke-static {v1, v2, v7, v8}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 48
    :goto_2
    const/16 v1, 0x4100

    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 60
    :goto_3
    if-nez v5, :cond_8

    .line 61
    const/4 v1, 0x1

    if-ne v6, v1, :cond_6

    .line 62
    invoke-virtual {v0, v3, p2, p3}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 71
    :goto_4
    const/16 v0, 0xde1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 72
    const v0, 0x8d40

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 73
    if-eqz v4, :cond_c

    .line 74
    iget-object v0, p0, Lcom/roidapp/videolib/b/h;->B:[I

    aget v0, v0, v5

    .line 39
    :goto_5
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move v3, v0

    goto :goto_0

    .line 41
    :cond_2
    const/4 v1, 0x0

    move v4, v1

    goto :goto_1

    .line 47
    :cond_3
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    invoke-static {v1, v2, v7, v8}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    goto :goto_2

    .line 50
    :cond_4
    const v1, 0x8d40

    iget v2, p0, Lcom/roidapp/videolib/b/h;->F:I

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 51
    const-string v1, "glBindFramebuffer"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 52
    if-eqz p4, :cond_5

    array-length v1, p4

    const/4 v2, 0x4

    if-lt v1, v2, :cond_5

    .line 53
    const/4 v1, 0x0

    aget v1, p4, v1

    const/4 v2, 0x1

    aget v2, p4, v2

    const/4 v7, 0x2

    aget v7, p4, v7

    const/4 v8, 0x3

    aget v8, p4, v8

    invoke-static {v1, v2, v7, v8}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 56
    :goto_6
    const-string v1, "glClearColor"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 57
    const/16 v1, 0x4100

    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 58
    const-string v1, "glClear"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    goto :goto_3

    .line 55
    :cond_5
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    invoke-static {v1, v2, v7, v8}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    goto :goto_6

    .line 64
    :cond_6
    iget-object v2, p0, Lcom/roidapp/videolib/b/h;->C:Ljava/nio/FloatBuffer;

    iget-boolean v1, p0, Lcom/roidapp/videolib/b/h;->G:Z

    if-eqz v1, :cond_7

    move-object v1, p3

    :goto_7
    invoke-virtual {v0, v3, v2, v1}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lcom/roidapp/videolib/b/h;->D:Ljava/nio/FloatBuffer;

    goto :goto_7

    .line 65
    :cond_8
    add-int/lit8 v1, v6, -0x1

    if-ne v5, v1, :cond_b

    .line 66
    iget-boolean v1, p0, Lcom/roidapp/videolib/b/h;->G:Z

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/roidapp/videolib/b/h;->D:Ljava/nio/FloatBuffer;

    :goto_8
    iget-boolean v2, p0, Lcom/roidapp/videolib/b/h;->G:Z

    if-eqz v2, :cond_a

    const/4 v2, 0x0

    :goto_9
    invoke-virtual {v0, v3, p2, v1, v2}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Z)V

    goto/16 :goto_4

    :cond_9
    move-object v1, p3

    goto :goto_8

    :cond_a
    const/4 v2, 0x1

    goto :goto_9

    .line 69
    :cond_b
    iget-object v1, p0, Lcom/roidapp/videolib/b/h;->C:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lcom/roidapp/videolib/b/h;->D:Ljava/nio/FloatBuffer;

    const/4 v7, 0x1

    invoke-virtual {v0, v3, v1, v2, v7}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Z)V

    goto/16 :goto_4

    :cond_c
    move v0, v3

    goto/16 :goto_5
.end method

.method public final r_()V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/h;->G:Z

    .line 26
    return-void
.end method
