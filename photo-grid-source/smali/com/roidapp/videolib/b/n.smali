.class final Lcom/roidapp/videolib/b/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/gl/e;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/b/m;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/b/m;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/roidapp/videolib/b/n;->a:Lcom/roidapp/videolib/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 236
    iget-object v0, p0, Lcom/roidapp/videolib/b/n;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Lcom/roidapp/videolib/gl/f;->a(I)I

    move-result v0

    return v0
.end method

.method public final a()[Ljava/nio/ByteBuffer;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 212
    invoke-static {}, Lcom/roidapp/videolib/b/m;->h()[Ljava/nio/ByteBuffer;

    move-result-object v0

    if-nez v0, :cond_1

    .line 213
    iget-object v0, p0, Lcom/roidapp/videolib/b/n;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->b()[I

    move-result-object v2

    .line 214
    if-nez v2, :cond_0

    .line 215
    const/4 v0, 0x0

    .line 224
    :goto_0
    return-object v0

    .line 217
    :cond_0
    array-length v0, v2

    new-array v0, v0, [Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->a([Ljava/nio/ByteBuffer;)[Ljava/nio/ByteBuffer;

    move v0, v1

    .line 218
    :goto_1
    invoke-static {}, Lcom/roidapp/videolib/b/m;->h()[Ljava/nio/ByteBuffer;

    move-result-object v3

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 219
    invoke-static {}, Lcom/roidapp/videolib/b/m;->h()[Ljava/nio/ByteBuffer;

    move-result-object v3

    aget v4, v2, v1

    const/4 v5, 0x1

    aget v5, v2, v5

    mul-int/2addr v4, v5

    shl-int/lit8 v4, v4, 0x2

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    aput-object v4, v3, v0

    .line 218
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/n;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/videolib/b/m;->h()[Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/videolib/b/n;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v2}, Lcom/roidapp/videolib/b/m;->b(Lcom/roidapp/videolib/b/m;)J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/roidapp/videolib/gl/f;->a([Ljava/nio/ByteBuffer;J)I

    .line 224
    invoke-static {}, Lcom/roidapp/videolib/b/m;->h()[Ljava/nio/ByteBuffer;

    move-result-object v0

    goto :goto_0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/roidapp/videolib/b/n;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->b()[I

    move-result-object v0

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 243
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 248
    const/4 v0, 0x0

    return v0
.end method
