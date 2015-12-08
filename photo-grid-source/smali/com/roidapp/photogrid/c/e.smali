.class final Lcom/roidapp/photogrid/c/e;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/c/d;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/c/d;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 109
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 140
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 111
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/c/d;->b(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/c;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v3}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/c/c;->a([Ljava/lang/Integer;)V

    goto :goto_0

    .line 115
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/c/d;->b(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/c/c;->h()V

    goto :goto_0

    .line 119
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/c/d;->b(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/c;

    move-result-object v0

    sget-object v1, Lcom/roidapp/photogrid/c/b;->c:Lcom/roidapp/photogrid/c/b;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/c/c;->a(Lcom/roidapp/photogrid/c/b;Ljava/lang/String;)V

    goto :goto_0

    .line 123
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/c/d;->b(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/c;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_0

    .line 129
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->c()Lcom/roidapp/photogrid/c/d;

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/c/d;->b(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/c/c;->i()V

    .line 131
    sget-object v0, Lcom/roidapp/photogrid/c/d;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/roidapp/photogrid/c/e;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v1}, Lcom/roidapp/photogrid/c/d;->c(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 135
    :pswitch_6
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->c()Lcom/roidapp/photogrid/c/d;

    goto :goto_0

    .line 109
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method
