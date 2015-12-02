.class final Lcom/qihoo/security/service/SecurityService$a;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/service/SecurityService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/service/SecurityService;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/service/SecurityService;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 623
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    .line 624
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 625
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 628
    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/service/SecurityService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/service/SecurityService$a;->sendMessage(Landroid/os/Message;)Z

    .line 629
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    .line 633
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 707
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 710
    :cond_0
    :goto_0
    return-void

    .line 638
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/service/b;

    invoke-virtual {v1, v0}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 639
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->b(Lcom/qihoo/security/service/SecurityService;)I

    .line 641
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/qihoo/security/service/SecurityService$b;->a(Lcom/qihoo/security/service/SecurityService$b;Z)V

    goto :goto_0

    .line 648
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/service/b;

    invoke-virtual {v1, v0}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 649
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->d(Lcom/qihoo/security/service/SecurityService;)I

    goto :goto_0

    .line 656
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->e(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/service/c;

    invoke-virtual {v1, v0}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 657
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->f(Lcom/qihoo/security/service/SecurityService;)I

    .line 658
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/qihoo/security/service/SecurityService$b;->b(Lcom/qihoo/security/service/SecurityService$b;Z)V

    goto :goto_0

    .line 665
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->e(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/service/c;

    invoke-virtual {v1, v0}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 666
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->g(Lcom/qihoo/security/service/SecurityService;)I

    goto :goto_0

    .line 670
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->e(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v0

    .line 671
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v1, v0}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;I)I

    .line 672
    :goto_1
    if-lez v0, :cond_1

    .line 673
    add-int/lit8 v1, v0, -0x1

    .line 675
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->e(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/service/c;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->h(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v2

    iget-object v3, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v3}, Lcom/qihoo/security/service/SecurityService;->i(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v3

    iget-object v4, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v4}, Lcom/qihoo/security/service/SecurityService;->j(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v4

    iget-object v5, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v5}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v5

    invoke-static {v5}, Lcom/qihoo/security/service/SecurityService$b;->b(Lcom/qihoo/security/service/SecurityService$b;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/qihoo/security/service/c;->a(ZZZLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 681
    goto :goto_1

    .line 677
    :catch_0
    move-exception v0

    move v0, v1

    .line 681
    goto :goto_1

    .line 683
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->e(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto/16 :goto_0

    .line 687
    :pswitch_5
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v0

    .line 689
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v1, v0}, Lcom/qihoo/security/service/SecurityService;->b(Lcom/qihoo/security/service/SecurityService;I)I

    .line 690
    :goto_2
    if-lez v0, :cond_2

    .line 691
    add-int/lit8 v1, v0, -0x1

    .line 696
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/service/b;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->k(Lcom/qihoo/security/service/SecurityService;)I

    move-result v2

    invoke-interface {v0, v2}, Lcom/qihoo/security/service/b;->a(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v1

    .line 701
    goto :goto_2

    .line 697
    :catch_1
    move-exception v0

    move v0, v1

    .line 701
    goto :goto_2

    .line 703
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$a;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto/16 :goto_0

    .line 633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
