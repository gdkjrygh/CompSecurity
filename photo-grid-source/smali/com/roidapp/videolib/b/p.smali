.class final Lcom/roidapp/videolib/b/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/gl/e;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/b/m;

.field private b:Ljava/lang/Object;

.field private c:I

.field private d:I


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/b/m;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 590
    iput-object p1, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 594
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/p;->b:Ljava/lang/Object;

    .line 595
    iput v1, p0, Lcom/roidapp/videolib/b/p;->c:I

    .line 596
    iput v1, p0, Lcom/roidapp/videolib/b/p;->d:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 622
    const/4 v0, 0x0

    return v0
.end method

.method public final a()[Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 610
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 616
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 679
    iget-object v0, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->c(Lcom/roidapp/videolib/b/m;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "main scene loadTextureId :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v2}, Lcom/roidapp/videolib/b/m;->i(Lcom/roidapp/videolib/b/m;)[I

    move-result-object v2

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 680
    iget-object v0, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->i(Lcom/roidapp/videolib/b/m;)[I

    move-result-object v0

    aget v0, v0, v3

    return v0
.end method

.method public final d()Z
    .locals 8

    .prologue
    const/4 v7, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 626
    .line 627
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1600
    iget-object v0, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->e(Lcom/roidapp/videolib/b/m;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->e(Lcom/roidapp/videolib/b/m;)I

    move-result v0

    iget-object v3, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v3

    invoke-interface {v3}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v3

    if-lt v0, v3, :cond_5

    .line 1603
    :cond_0
    const/4 v0, 0x0

    .line 629
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 630
    if-eqz v0, :cond_6

    .line 631
    iget-object v3, v0, Lcom/roidapp/videolib/gl/a;->a:Ljava/lang/Object;

    monitor-enter v3

    .line 632
    :try_start_0
    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_7

    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_7

    iget-object v4, p0, Lcom/roidapp/videolib/b/p;->b:Ljava/lang/Object;

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget-object v5, p0, Lcom/roidapp/videolib/b/p;->b:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget v4, p0, Lcom/roidapp/videolib/b/p;->c:I

    if-ne v4, v7, :cond_7

    .line 635
    :cond_1
    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iput-object v4, p0, Lcom/roidapp/videolib/b/p;->b:Ljava/lang/Object;

    .line 636
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 637
    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/roidapp/videolib/b/p;->c:I

    iget-boolean v6, v0, Lcom/roidapp/videolib/gl/a;->d:Z

    invoke-static {v4, v5, v6}, Lcom/roidapp/videolib/gl/g;->a(Landroid/graphics/Bitmap;IZ)I

    move-result v4

    iput v4, p0, Lcom/roidapp/videolib/b/p;->c:I

    .line 641
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 648
    iget-object v4, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    iget-object v0, v0, Lcom/roidapp/videolib/gl/a;->c:[F

    invoke-static {v4, v0}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;[F)[F

    move v0, v2

    .line 651
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 654
    iget-object v3, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->f(Lcom/roidapp/videolib/b/m;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 655
    iget-object v3, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->g(Lcom/roidapp/videolib/b/m;)Z

    .line 659
    :cond_2
    iget-object v3, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->h(Lcom/roidapp/videolib/b/m;)I

    move-result v3

    iget v4, p0, Lcom/roidapp/videolib/b/p;->c:I

    if-eq v3, v4, :cond_4

    .line 660
    iget-object v3, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->h(Lcom/roidapp/videolib/b/m;)I

    move-result v3

    if-eq v3, v7, :cond_3

    .line 661
    new-array v3, v2, [I

    iget-object v4, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v4}, Lcom/roidapp/videolib/b/m;->h(Lcom/roidapp/videolib/b/m;)I

    move-result v4

    aput v4, v3, v1

    invoke-static {v2, v3, v1}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 662
    :cond_3
    iget-object v1, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    iget v2, p0, Lcom/roidapp/videolib/b/p;->c:I

    invoke-static {v1, v2}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;I)I

    .line 674
    :cond_4
    :goto_2
    return v0

    .line 1604
    :cond_5
    iget-object v0, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/videolib/b/p;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->e(Lcom/roidapp/videolib/b/m;)I

    move-result v3

    invoke-interface {v0, v3}, Lcom/roidapp/videolib/gl/f;->b(I)Lcom/roidapp/videolib/gl/a;

    move-result-object v0

    goto/16 :goto_0

    .line 651
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_6
    move v0, v1

    .line 674
    goto :goto_2

    :cond_7
    move v0, v1

    goto :goto_1
.end method
