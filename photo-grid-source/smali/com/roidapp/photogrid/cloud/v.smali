.class final Lcom/roidapp/photogrid/cloud/v;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/photogrid/cloud/t;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/t;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/v;->b:Lcom/roidapp/photogrid/cloud/t;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/v;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/v;->b:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/t;->a(Lcom/roidapp/photogrid/cloud/t;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 257
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rd;->a()Lcom/roidapp/photogrid/release/rd;

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/v;->a:Ljava/lang/String;

    const/16 v1, 0x64

    const/16 v2, 0x64

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rd;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 258
    if-eqz v0, :cond_1

    .line 259
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/v;->b:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/t;->b(Lcom/roidapp/photogrid/cloud/t;)Ljava/util/HashMap;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/v;->b:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/t;->a(Lcom/roidapp/photogrid/cloud/t;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 260
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/v;->b:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/t;->b(Lcom/roidapp/photogrid/cloud/t;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/v;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 263
    const/4 v1, 0x0

    iput v1, v0, Landroid/os/Message;->what:I

    .line 264
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/v;->a:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 265
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/v;->b:Lcom/roidapp/photogrid/cloud/t;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/t;->c(Lcom/roidapp/photogrid/cloud/t;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    :cond_1
    :goto_0
    return-void

    .line 268
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
