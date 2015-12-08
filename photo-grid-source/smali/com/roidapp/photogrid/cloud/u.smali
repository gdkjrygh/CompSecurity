.class final Lcom/roidapp/photogrid/cloud/u;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/t;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/t;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 63
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 85
    :cond_0
    :goto_0
    return-void

    .line 65
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/t;->a(Lcom/roidapp/photogrid/cloud/t;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    monitor-enter v2

    .line 67
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/t;->a:Landroid/widget/ListView;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 68
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/t;->b(Lcom/roidapp/photogrid/cloud/t;)Ljava/util/HashMap;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 69
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/t;->b(Lcom/roidapp/photogrid/cloud/t;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 70
    if-nez v1, :cond_2

    .line 71
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/t;->a(Lcom/roidapp/photogrid/cloud/t;Ljava/lang/String;)V

    .line 81
    :cond_1
    :goto_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 73
    :cond_2
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 74
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 75
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/u;->a:Lcom/roidapp/photogrid/cloud/t;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/t;->a(Lcom/roidapp/photogrid/cloud/t;Ljava/lang/String;)V

    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 63
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
