.class final Lcom/roidapp/photogrid/release/bl;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/photogrid/release/bj;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/bj;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bl;->b:Lcom/roidapp/photogrid/release/bj;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/bl;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bl;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bj;->a(Lcom/roidapp/photogrid/release/bj;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 182
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bl;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bj;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 183
    if-eqz v0, :cond_1

    .line 184
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bl;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bj;->b(Lcom/roidapp/photogrid/release/bj;)Ljava/util/HashMap;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bl;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bj;->a(Lcom/roidapp/photogrid/release/bj;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 185
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bl;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bj;->b(Lcom/roidapp/photogrid/release/bj;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/bl;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 188
    const/4 v1, 0x0

    iput v1, v0, Landroid/os/Message;->what:I

    .line 189
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bl;->a:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 190
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bl;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bj;->c(Lcom/roidapp/photogrid/release/bj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    :cond_1
    :goto_0
    return-void

    .line 193
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
