.class final Lcom/mobvista/sdk/m/a/e/b;
.super Landroid/os/Handler;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/e/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/e/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/e/b;->a:Lcom/mobvista/sdk/m/a/e/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 52
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/mobvista/sdk/m/a/e/c;

    .line 53
    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/mobvista/sdk/m/a/e/c;->c:Z

    if-nez v1, :cond_1

    .line 77
    :cond_0
    :goto_0
    return-void

    .line 57
    :cond_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/b;->a:Lcom/mobvista/sdk/m/a/e/a;

    invoke-static {v1}, Lcom/mobvista/sdk/m/a/e/a;->a(Lcom/mobvista/sdk/m/a/e/a;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/e/c;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mobvista/sdk/m/a/e/d;

    .line 59
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 76
    :cond_2
    :goto_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0

    .line 63
    :pswitch_0
    if-eqz v1, :cond_2

    .line 64
    invoke-interface {v1, v0}, Lcom/mobvista/sdk/m/a/e/d;->a(Lcom/mobvista/sdk/m/a/e/c;)V

    goto :goto_1

    .line 70
    :pswitch_1
    if-eqz v1, :cond_3

    .line 71
    invoke-interface {v1, v0}, Lcom/mobvista/sdk/m/a/e/d;->b(Lcom/mobvista/sdk/m/a/e/c;)V

    .line 73
    :cond_3
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/b;->a:Lcom/mobvista/sdk/m/a/e/a;

    invoke-static {v1}, Lcom/mobvista/sdk/m/a/e/a;->a(Lcom/mobvista/sdk/m/a/e/a;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/e/c;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 59
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
