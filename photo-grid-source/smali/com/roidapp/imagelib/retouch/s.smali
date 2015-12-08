.class final Lcom/roidapp/imagelib/retouch/s;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/m;


# direct methods
.method private constructor <init>(Lcom/roidapp/imagelib/retouch/m;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/imagelib/retouch/m;B)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/retouch/s;-><init>(Lcom/roidapp/imagelib/retouch/m;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .prologue
    .line 114
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 115
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 138
    :goto_0
    return-void

    .line 117
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;I)I

    .line 118
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/retouch/m;->b(Lcom/roidapp/imagelib/retouch/m;I)I

    goto :goto_0

    .line 126
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/t;->b()V

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->b(Lcom/roidapp/imagelib/retouch/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 132
    :pswitch_2
    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/imagelib/retouch/u;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v3}, Lcom/roidapp/imagelib/retouch/m;->c(Lcom/roidapp/imagelib/retouch/m;)I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v4}, Lcom/roidapp/imagelib/retouch/m;->d(Lcom/roidapp/imagelib/retouch/m;)I

    move-result v4

    iget v5, p1, Landroid/os/Message;->arg1:I

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/retouch/u;-><init>(Lcom/roidapp/imagelib/retouch/m;Landroid/content/Context;III)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 135
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/s;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/retouch/t;->a(Landroid/net/Uri;)V

    goto :goto_0

    .line 115
    :pswitch_data_0
    .packed-switch 0x402
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method
