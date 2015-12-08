.class final Lcom/roidapp/photogrid/video/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/video/ac;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 341
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 346
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/q;->e(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;I)I

    .line 348
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->s(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 349
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->t(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 350
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 352
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->u(Lcom/roidapp/photogrid/video/TrackSelector;)Z

    .line 353
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z

    .line 354
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->m(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 360
    return-void
.end method

.method public final a(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 391
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x2004

    invoke-virtual {v1, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 396
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z

    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "update "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", current:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 401
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 364
    const/16 v0, 0x1001

    if-ne p1, v0, :cond_1

    .line 365
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z

    .line 366
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->v(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 382
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 387
    return-void

    .line 370
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z

    .line 371
    const/16 v0, 0x2002

    if-eq p2, v0, :cond_2

    const/16 v0, 0x2001

    if-ne p2, v0, :cond_3

    .line 373
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->v(Lcom/roidapp/photogrid/video/TrackSelector;)V

    goto :goto_0

    .line 374
    :cond_3
    const/16 v0, 0x2003

    if-ne p2, v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bc;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->v(Lcom/roidapp/photogrid/video/TrackSelector;)V

    goto :goto_0
.end method
