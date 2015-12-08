.class final Lcom/roidapp/photogrid/release/eu;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;)V
    .locals 0

    .prologue
    .line 491
    iput-object p1, p0, Lcom/roidapp/photogrid/release/eu;->a:Lcom/roidapp/photogrid/release/el;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0xc8

    const/16 v4, 0x1f4

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 494
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 519
    :goto_0
    return-void

    .line 496
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eu;->a:Lcom/roidapp/photogrid/release/el;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/el;->b(Lcom/roidapp/photogrid/release/el;I)V

    .line 497
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 498
    iput v2, v0, Landroid/os/Message;->what:I

    .line 499
    iput v4, v0, Landroid/os/Message;->arg1:I

    .line 500
    invoke-virtual {p0, v0, v6, v7}, Lcom/roidapp/photogrid/release/eu;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 503
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eu;->a:Lcom/roidapp/photogrid/release/el;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/el;->c(Lcom/roidapp/photogrid/release/el;I)V

    .line 504
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 505
    iput v3, v0, Landroid/os/Message;->what:I

    .line 506
    iput v4, v0, Landroid/os/Message;->arg1:I

    .line 507
    invoke-virtual {p0, v0, v6, v7}, Lcom/roidapp/photogrid/release/eu;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 510
    :pswitch_2
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/eu;->removeMessages(I)V

    goto :goto_0

    .line 513
    :pswitch_3
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/eu;->removeMessages(I)V

    goto :goto_0

    .line 494
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
