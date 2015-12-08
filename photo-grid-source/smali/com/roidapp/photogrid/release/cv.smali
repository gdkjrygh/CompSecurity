.class final Lcom/roidapp/photogrid/release/cv;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/cu;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cu;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 432
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 433
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    .line 435
    iget v1, p1, Landroid/os/Message;->what:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cu;->a(Lcom/roidapp/photogrid/release/cu;)I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 436
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cu;->b(Lcom/roidapp/photogrid/release/cu;)I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 437
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cu;->b(Lcom/roidapp/photogrid/release/cu;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(I)V

    .line 444
    :cond_0
    :goto_0
    return-void

    .line 440
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/cu;->a(Lcom/roidapp/photogrid/release/cu;I)I

    .line 441
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/cu;->a:Landroid/os/Handler;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/cu;->a:Landroid/os/Handler;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cv;->a:Lcom/roidapp/photogrid/release/cu;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/cu;->a(Lcom/roidapp/photogrid/release/cu;)I

    move-result v3

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0
.end method
