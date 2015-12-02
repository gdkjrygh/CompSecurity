.class final Lcom/mobvista/sdk/m/a/a/c/b;
.super Landroid/os/Handler;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/a/c/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/a/c/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 53
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-boolean v0, v0, Lcom/mobvista/sdk/m/a/a/c/a;->a:Z

    if-eqz v0, :cond_1

    .line 54
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadCanceled(I)V

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 60
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 115
    :cond_2
    :goto_1
    :pswitch_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0

    .line 64
    :pswitch_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 65
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadFinish(ILjava/lang/Object;)V

    goto :goto_1

    .line 71
    :pswitch_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadStart(I)V

    goto :goto_1

    .line 79
    :pswitch_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 80
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "] Http error."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadError(ILjava/lang/String;)V

    goto :goto_1

    .line 87
    :pswitch_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 88
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    const-string/jumbo v2, "Connect timeout."

    invoke-interface {v0, v1, v2}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadError(ILjava/lang/String;)V

    goto :goto_1

    .line 95
    :pswitch_5
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 96
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 97
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadError(ILjava/lang/String;)V

    goto/16 :goto_1

    .line 99
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    const-string/jumbo v2, "http connect error!"

    invoke-interface {v0, v1, v2}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadError(ILjava/lang/String;)V

    goto/16 :goto_1

    .line 105
    :pswitch_6
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 106
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "]request api error ! "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadError(ILjava/lang/String;)V

    goto/16 :goto_1

    .line 110
    :pswitch_7
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 111
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/b;->a:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/a/a/c/d;->OnLoadCanceled(I)V

    goto/16 :goto_1

    .line 60
    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method
