.class final Lcom/roidapp/photogrid/g;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/f;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/f;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/roidapp/photogrid/g;->a:Lcom/roidapp/photogrid/f;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 58
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 71
    :goto_0
    return-void

    .line 60
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/g;->a:Lcom/roidapp/photogrid/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/f;->a(Lcom/roidapp/photogrid/f;Ljava/util/List;)Ljava/util/List;

    .line 65
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/g;->a:Lcom/roidapp/photogrid/f;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/f;->d()V

    goto :goto_0

    .line 63
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/g;->a:Lcom/roidapp/photogrid/f;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    const-string v2, "pics"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/f;->a(Lcom/roidapp/photogrid/f;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 58
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
