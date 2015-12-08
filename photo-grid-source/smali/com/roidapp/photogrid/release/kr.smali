.class final Lcom/roidapp/photogrid/release/kr;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Lcom/roidapp/photogrid/release/GridImageView;

.field c:Z

.field d:Z

.field final synthetic e:Lcom/roidapp/photogrid/release/kp;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/kp;Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V
    .locals 0

    .prologue
    .line 354
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 355
    iput-object p2, p0, Lcom/roidapp/photogrid/release/kr;->a:Ljava/lang/String;

    .line 356
    iput-object p3, p0, Lcom/roidapp/photogrid/release/kr;->b:Lcom/roidapp/photogrid/release/GridImageView;

    .line 357
    iput-boolean p4, p0, Lcom/roidapp/photogrid/release/kr;->c:Z

    .line 358
    iput-boolean p5, p0, Lcom/roidapp/photogrid/release/kr;->d:Z

    .line 359
    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 348
    check-cast p1, [Ljava/lang/String;

    .line 3375
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kp;->a(Lcom/roidapp/photogrid/release/kp;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3376
    const/4 v0, 0x0

    aget-object v0, p1, v0

    .line 3378
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kp;->b(Lcom/roidapp/photogrid/release/kp;)I

    move-result v2

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/kr;->d:Z

    invoke-static {v1, v0, v2, v3}, Lcom/roidapp/photogrid/release/kp;->a(Lcom/roidapp/photogrid/release/kp;Ljava/lang/String;IZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 3379
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kp;->c(Lcom/roidapp/photogrid/release/kp;)Lcom/roidapp/baselib/b/i;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3380
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kp;->c(Lcom/roidapp/photogrid/release/kp;)Lcom/roidapp/baselib/b/i;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kr;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/baselib/b/i;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 3381
    :goto_0
    return-object v0

    .line 3384
    :cond_0
    const/4 v0, 0x0

    .line 348
    goto :goto_0
.end method

.method protected final onCancelled()V
    .locals 0

    .prologue
    .line 412
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onCancelled()V

    .line 414
    return-void
.end method

.method protected final onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 389
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kr;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kp;->a(Lcom/roidapp/photogrid/release/kp;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 390
    :cond_0
    instance-of v0, p1, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 391
    check-cast p1, Landroid/graphics/Bitmap;

    .line 392
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 393
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 408
    :cond_1
    :goto_0
    return-void

    .line 400
    :cond_2
    instance-of v0, p1, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 401
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1364
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kr;->b:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kp;->a(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/kr;

    move-result-object v0

    .line 1365
    if-ne p0, v0, :cond_4

    .line 1366
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kr;->b:Lcom/roidapp/photogrid/release/GridImageView;

    .line 403
    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_3

    .line 2431
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/Bitmap;)V

    .line 407
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kr;->e:Lcom/roidapp/photogrid/release/kp;

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/kr;->c:Z

    invoke-static {v0, p0, v1}, Lcom/roidapp/photogrid/release/kp;->a(Lcom/roidapp/photogrid/release/kp;Lcom/roidapp/photogrid/release/kr;Z)V

    goto :goto_0

    .line 1368
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method
