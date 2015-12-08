.class final Lcom/roidapp/photogrid/video/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/video/p;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/q;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/q;)V
    .locals 0

    .prologue
    .line 581
    iput-object p1, p0, Lcom/roidapp/photogrid/video/s;->a:Lcom/roidapp/photogrid/video/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 584
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 585
    const/16 v1, 0x3001

    iput v1, v0, Landroid/os/Message;->what:I

    .line 586
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 587
    iget-object v1, p0, Lcom/roidapp/photogrid/video/s;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->j(Lcom/roidapp/photogrid/video/q;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 588
    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 607
    iget-object v0, p0, Lcom/roidapp/photogrid/video/s;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0, p1, p2}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;ILjava/lang/String;)Z

    .line 608
    return-void
.end method

.method public final a(IZ)V
    .locals 2

    .prologue
    .line 592
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 593
    if-eqz p2, :cond_0

    const/16 v0, 0x3002

    :goto_0
    iput v0, v1, Landroid/os/Message;->what:I

    .line 594
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 595
    iget-object v0, p0, Lcom/roidapp/photogrid/video/s;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->j(Lcom/roidapp/photogrid/video/q;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 596
    return-void

    .line 593
    :cond_0
    const/16 v0, 0x3003

    goto :goto_0
.end method
