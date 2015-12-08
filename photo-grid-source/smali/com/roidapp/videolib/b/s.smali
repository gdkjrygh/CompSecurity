.class final Lcom/roidapp/videolib/b/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/gl/e;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/b/m;

.field private b:I

.field private c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/b/m;)V
    .locals 1

    .prologue
    .line 840
    iput-object p1, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 841
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/videolib/b/s;->b:I

    .line 842
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/s;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 867
    const/4 v0, 0x0

    return v0
.end method

.method public final a()[Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 855
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 861
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()I
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v0, -0x1

    .line 872
    iget-object v1, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v1}, Lcom/roidapp/videolib/b/m;->f(Lcom/roidapp/videolib/b/m;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 873
    iget-object v0, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->l(Lcom/roidapp/videolib/b/m;)I

    move-result v0

    .line 892
    :cond_0
    :goto_0
    return v0

    .line 1846
    :cond_1
    new-instance v1, Lcom/roidapp/videolib/gl/a;

    invoke-direct {v1}, Lcom/roidapp/videolib/gl/a;-><init>()V

    .line 1847
    iget-object v2, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v2}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v2

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->f()Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 1848
    iput-boolean v4, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    .line 876
    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_0

    .line 877
    iget-object v2, p0, Lcom/roidapp/videolib/b/s;->c:Ljava/lang/Object;

    if-eqz v2, :cond_2

    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/roidapp/videolib/b/s;->c:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/roidapp/videolib/b/s;->b:I

    if-ne v2, v0, :cond_3

    .line 879
    :cond_2
    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iput-object v2, p0, Lcom/roidapp/videolib/b/s;->c:Ljava/lang/Object;

    .line 880
    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/roidapp/videolib/b/s;->b:I

    iget-boolean v1, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    invoke-static {v2, v3, v1}, Lcom/roidapp/videolib/gl/g;->a(Landroid/graphics/Bitmap;IZ)I

    move-result v1

    iput v1, p0, Lcom/roidapp/videolib/b/s;->b:I

    .line 885
    :cond_3
    iget-object v1, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v1}, Lcom/roidapp/videolib/b/m;->m(Lcom/roidapp/videolib/b/m;)I

    move-result v1

    iget v2, p0, Lcom/roidapp/videolib/b/s;->b:I

    if-eq v1, v2, :cond_5

    .line 886
    iget-object v1, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v1}, Lcom/roidapp/videolib/b/m;->m(Lcom/roidapp/videolib/b/m;)I

    move-result v1

    if-eq v1, v0, :cond_4

    .line 887
    new-array v0, v5, [I

    iget-object v1, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v1}, Lcom/roidapp/videolib/b/m;->m(Lcom/roidapp/videolib/b/m;)I

    move-result v1

    aput v1, v0, v4

    invoke-static {v5, v0, v4}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 888
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/s;->a:Lcom/roidapp/videolib/b/m;

    iget v1, p0, Lcom/roidapp/videolib/b/s;->b:I

    invoke-static {v0, v1}, Lcom/roidapp/videolib/b/m;->d(Lcom/roidapp/videolib/b/m;I)I

    .line 890
    :cond_5
    iget v0, p0, Lcom/roidapp/videolib/b/s;->b:I

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 900
    const/4 v0, 0x0

    return v0
.end method
