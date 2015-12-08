.class final Lcom/roidapp/videolib/b/o;
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
    .line 369
    iput-object p1, p0, Lcom/roidapp/videolib/b/o;->a:Lcom/roidapp/videolib/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 382
    const/4 v0, 0x0

    return v0
.end method

.method public final a()[Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 372
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 377
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()I
    .locals 3

    .prologue
    .line 387
    iget-object v0, p0, Lcom/roidapp/videolib/b/o;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->c(Lcom/roidapp/videolib/b/m;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "srcTextureprovider mProcessSrcTexture:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/videolib/b/o;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v2}, Lcom/roidapp/videolib/b/m;->d(Lcom/roidapp/videolib/b/m;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 388
    iget-object v0, p0, Lcom/roidapp/videolib/b/o;->a:Lcom/roidapp/videolib/b/m;

    invoke-static {v0}, Lcom/roidapp/videolib/b/m;->d(Lcom/roidapp/videolib/b/m;)I

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 393
    const/4 v0, 0x0

    return v0
.end method
