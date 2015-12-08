.class final Lcom/roidapp/photogrid/release/kb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ig;

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;Lcom/roidapp/photogrid/release/ig;I)V
    .locals 0

    .prologue
    .line 1441
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kb;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    iput p3, p0, Lcom/roidapp/photogrid/release/kb;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 1445
    const/4 v1, 0x0

    .line 1447
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1449
    const-string v0, "error path"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1450
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1451
    const/16 v2, 0x10

    iput v2, v0, Landroid/os/Message;->what:I

    .line 1452
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1453
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kb;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1478
    :goto_0
    return-void

    .line 1456
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    .line 2209
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    const/4 v0, 0x1

    .line 1456
    :goto_1
    if-eqz v0, :cond_4

    .line 1457
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 1461
    :goto_2
    if-nez v0, :cond_2

    .line 1463
    :try_start_1
    const-string v1, "bitmap null"

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1464
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 1465
    const/16 v2, 0x19

    iput v2, v1, Landroid/os/Message;->what:I

    .line 1466
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1467
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kb;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 1472
    :catch_0
    move-exception v1

    :goto_3
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 1477
    :cond_2
    :goto_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kb;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v2, p0, Lcom/roidapp/photogrid/release/kb;->b:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-static {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;ILandroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_0

    .line 2209
    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    .line 1459
    :cond_4
    :try_start_2
    invoke-static {}, Lcom/roidapp/photogrid/release/rd;->a()Lcom/roidapp/photogrid/release/rd;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kb;->a:Lcom/roidapp/photogrid/release/ig;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    const/16 v2, 0x64

    const/16 v3, 0x64

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/rd;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_2

    .line 1474
    :catch_1
    move-exception v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    :goto_5
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_4

    :catch_2
    move-exception v1

    goto :goto_5

    .line 1472
    :catch_3
    move-exception v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    goto :goto_3
.end method
