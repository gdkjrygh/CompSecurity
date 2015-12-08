.class final Lcom/roidapp/videolib/b/t;
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
    .line 905
    iput-object p1, p0, Lcom/roidapp/videolib/b/t;->a:Lcom/roidapp/videolib/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 906
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/videolib/b/t;->b:I

    .line 907
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/t;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 935
    const/4 v0, 0x0

    return v0
.end method

.method public final a()[Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 923
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 929
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()I
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v0, -0x1

    .line 940
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1914
    new-instance v1, Lcom/roidapp/videolib/gl/a;

    invoke-direct {v1}, Lcom/roidapp/videolib/gl/a;-><init>()V

    .line 1915
    iget-object v2, p0, Lcom/roidapp/videolib/b/t;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v2}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v2

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 1916
    iput-boolean v4, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    .line 942
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 943
    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_4

    .line 944
    iget-object v2, p0, Lcom/roidapp/videolib/b/t;->c:Ljava/lang/Object;

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/roidapp/videolib/b/t;->c:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/roidapp/videolib/b/t;->b:I

    if-ne v2, v0, :cond_1

    .line 946
    :cond_0
    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iput-object v2, p0, Lcom/roidapp/videolib/b/t;->c:Ljava/lang/Object;

    .line 947
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 948
    iget-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/roidapp/videolib/b/t;->b:I

    iget-boolean v1, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    invoke-static {v2, v3, v1}, Lcom/roidapp/videolib/gl/g;->a(Landroid/graphics/Bitmap;IZ)I

    move-result v1

    iput v1, p0, Lcom/roidapp/videolib/b/t;->b:I

    .line 950
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 954
    :cond_1
    iget-object v1, p0, Lcom/roidapp/videolib/b/t;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v1}, Lcom/roidapp/videolib/b/m;->n(Lcom/roidapp/videolib/b/m;)I

    move-result v1

    iget v2, p0, Lcom/roidapp/videolib/b/t;->b:I

    if-eq v1, v2, :cond_3

    .line 955
    iget-object v1, p0, Lcom/roidapp/videolib/b/t;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v1}, Lcom/roidapp/videolib/b/m;->n(Lcom/roidapp/videolib/b/m;)I

    move-result v1

    if-eq v1, v0, :cond_2

    .line 956
    new-array v0, v5, [I

    iget-object v1, p0, Lcom/roidapp/videolib/b/t;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v1}, Lcom/roidapp/videolib/b/m;->n(Lcom/roidapp/videolib/b/m;)I

    move-result v1

    aput v1, v0, v4

    invoke-static {v5, v0, v4}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 957
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/t;->a:Lcom/roidapp/videolib/b/m;

    iget v1, p0, Lcom/roidapp/videolib/b/t;->b:I

    invoke-static {v0, v1}, Lcom/roidapp/videolib/b/m;->e(Lcom/roidapp/videolib/b/m;I)I

    .line 960
    :cond_3
    iget v0, p0, Lcom/roidapp/videolib/b/t;->b:I

    .line 962
    :cond_4
    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 968
    const/4 v0, 0x0

    return v0
.end method
