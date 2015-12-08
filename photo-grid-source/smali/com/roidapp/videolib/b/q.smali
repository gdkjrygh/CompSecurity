.class final Lcom/roidapp/videolib/b/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/gl/e;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/b/m;

.field private b:Ljava/lang/Object;

.field private c:I


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/b/m;)V
    .locals 1

    .prologue
    .line 688
    iput-object p1, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 691
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/q;->b:Ljava/lang/Object;

    .line 692
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/videolib/b/q;->c:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 717
    const/4 v0, 0x0

    return v0
.end method

.method public final a()[Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 705
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 711
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 758
    iget-object v0, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->i(Lcom/roidapp/videolib/b/m;)[I

    move-result-object v0

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public final d()Z
    .locals 7

    .prologue
    const/4 v6, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 721
    .line 722
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1696
    iget-object v0, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->e(Lcom/roidapp/videolib/b/m;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->e(Lcom/roidapp/videolib/b/m;)I

    move-result v0

    iget-object v3, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v3

    invoke-interface {v3}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v3

    if-le v0, v3, :cond_4

    .line 1698
    :cond_0
    const/4 v0, 0x0

    .line 724
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 725
    if-eqz v0, :cond_5

    .line 726
    iget-object v3, v0, Lcom/roidapp/videolib/gl/a;->a:Ljava/lang/Object;

    monitor-enter v3

    .line 727
    :try_start_0
    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_6

    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_6

    iget-object v4, p0, Lcom/roidapp/videolib/b/q;->b:Ljava/lang/Object;

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget-object v5, p0, Lcom/roidapp/videolib/b/q;->b:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget v4, p0, Lcom/roidapp/videolib/b/q;->c:I

    if-ne v4, v6, :cond_6

    .line 730
    :cond_1
    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iput-object v4, p0, Lcom/roidapp/videolib/b/q;->b:Ljava/lang/Object;

    .line 731
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 732
    iget-object v4, v0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/roidapp/videolib/b/q;->c:I

    iget-boolean v0, v0, Lcom/roidapp/videolib/gl/a;->d:Z

    invoke-static {v4, v5, v0}, Lcom/roidapp/videolib/gl/g;->a(Landroid/graphics/Bitmap;IZ)I

    move-result v0

    iput v0, p0, Lcom/roidapp/videolib/b/q;->c:I

    .line 735
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 737
    iget-object v0, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->c(Lcom/roidapp/videolib/b/m;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Sub updateTexture TextureId:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lcom/roidapp/videolib/b/q;->c:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ",mSubTexture:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v5}, Lcom/roidapp/videolib/b/m;->j(Lcom/roidapp/videolib/b/m;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    .line 743
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 745
    iget-object v3, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->j(Lcom/roidapp/videolib/b/m;)I

    move-result v3

    iget v4, p0, Lcom/roidapp/videolib/b/q;->c:I

    if-eq v3, v4, :cond_3

    .line 746
    iget-object v3, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->j(Lcom/roidapp/videolib/b/m;)I

    move-result v3

    if-eq v3, v6, :cond_2

    .line 747
    new-array v3, v2, [I

    iget-object v4, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v4}, Lcom/roidapp/videolib/b/m;->j(Lcom/roidapp/videolib/b/m;)I

    move-result v4

    aput v4, v3, v1

    invoke-static {v2, v3, v1}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 748
    :cond_2
    iget-object v1, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    iget v2, p0, Lcom/roidapp/videolib/b/q;->c:I

    invoke-static {v1, v2}, Lcom/roidapp/videolib/b/m;->b(Lcom/roidapp/videolib/b/m;I)I

    .line 752
    :cond_3
    :goto_2
    return v0

    .line 1699
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/videolib/b/q;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v3}, Lcom/roidapp/videolib/b/m;->e(Lcom/roidapp/videolib/b/m;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v3}, Lcom/roidapp/videolib/gl/f;->b(I)Lcom/roidapp/videolib/gl/a;

    move-result-object v0

    goto/16 :goto_0

    .line 743
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    move v0, v1

    .line 752
    goto :goto_2

    :cond_6
    move v0, v1

    goto :goto_1
.end method
