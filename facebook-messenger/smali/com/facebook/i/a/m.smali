.class Lcom/facebook/i/a/m;
.super Landroid/os/Handler;
.source "PeerProcessManagerImpl.java"


# instance fields
.field final synthetic a:Lcom/facebook/i/a/d;


# direct methods
.method private constructor <init>(Lcom/facebook/i/a/d;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 445
    iput-object p1, p0, Lcom/facebook/i/a/m;->a:Lcom/facebook/i/a/d;

    .line 446
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 447
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/i/a/d;Landroid/os/Looper;Lcom/facebook/i/a/e;)V
    .locals 0

    .prologue
    .line 443
    invoke-direct {p0, p1, p2}, Lcom/facebook/i/a/m;-><init>(Lcom/facebook/i/a/d;Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    .line 451
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 476
    iget-object v0, p0, Lcom/facebook/i/a/m;->a:Lcom/facebook/i/a/d;

    invoke-static {v0, p1}, Lcom/facebook/i/a/d;->b(Lcom/facebook/i/a/d;Landroid/os/Message;)V

    .line 479
    :cond_0
    :goto_0
    return-void

    .line 453
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 454
    invoke-static {v0}, Lcom/facebook/i/a/a;->a(Landroid/os/Bundle;)Lcom/facebook/i/a/a;

    move-result-object v0

    .line 455
    iget-object v1, p0, Lcom/facebook/i/a/m;->a:Lcom/facebook/i/a/d;

    invoke-static {v1}, Lcom/facebook/i/a/d;->l(Lcom/facebook/i/a/d;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    iget v2, v0, Lcom/facebook/i/a/a;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 459
    const-class v1, Lcom/facebook/i/a/d;

    const-string v2, "%s received peer connecting reply from process %s but it has already been connected."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/i/a/m;->a:Lcom/facebook/i/a/d;

    invoke-virtual {v5}, Lcom/facebook/i/a/d;->b()Lcom/facebook/i/a/a;

    move-result-object v5

    iget-object v5, v5, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-object v0, v0, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 466
    :cond_1
    iget-object v1, p0, Lcom/facebook/i/a/m;->a:Lcom/facebook/i/a/d;

    sget-object v2, Lcom/facebook/i/a/s;->Outgoing:Lcom/facebook/i/a/s;

    invoke-static {v1, v0, v2}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;Lcom/facebook/i/a/s;)V

    goto :goto_0

    .line 469
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/i/a/m;->a:Lcom/facebook/i/a/d;

    invoke-static {v0, p1}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;Landroid/os/Message;)Lcom/facebook/i/a/a;

    move-result-object v0

    .line 470
    if-eqz v0, :cond_0

    .line 473
    iget-object v1, p0, Lcom/facebook/i/a/m;->a:Lcom/facebook/i/a/d;

    invoke-static {v1, v0}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;)V

    goto :goto_0

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
