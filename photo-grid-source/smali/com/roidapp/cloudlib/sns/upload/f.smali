.class final Lcom/roidapp/cloudlib/sns/upload/f;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/upload/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/upload/e;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/upload/f;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 92
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 93
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 109
    :cond_0
    :goto_0
    return-void

    .line 95
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/f;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Lcom/roidapp/cloudlib/sns/upload/e;)V

    goto :goto_0

    .line 98
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/f;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b(Lcom/roidapp/cloudlib/sns/upload/e;)V

    goto :goto_0

    .line 101
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 102
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/f;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1, v2, v3, v0}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Lcom/roidapp/cloudlib/sns/upload/e;JI)V

    goto :goto_0

    .line 105
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 106
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {v1, v0}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 93
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
