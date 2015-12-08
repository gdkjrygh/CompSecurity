.class final Lcom/roidapp/imagelib/retouch/f;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/a;


# direct methods
.method private constructor <init>(Lcom/roidapp/imagelib/retouch/a;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/imagelib/retouch/a;B)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/retouch/f;-><init>(Lcom/roidapp/imagelib/retouch/a;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .prologue
    .line 81
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 82
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 84
    :pswitch_0
    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/imagelib/retouch/e;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v2, v2, Lcom/roidapp/imagelib/retouch/a;->c:Ljava/lang/String;

    iget v3, p1, Landroid/os/Message;->arg2:I

    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;)I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v5}, Lcom/roidapp/imagelib/retouch/a;->b(Lcom/roidapp/imagelib/retouch/a;)I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/retouch/e;-><init>(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/String;III)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 87
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    new-instance v1, Ljava/lang/OutOfMemoryError;

    invoke-direct {v1}, Ljava/lang/OutOfMemoryError;-><init>()V

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/t;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 90
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 92
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 93
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/a;->d(Lcom/roidapp/imagelib/retouch/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 94
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Z)V

    .line 96
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->invalidate()V

    .line 98
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/t;->b()V

    goto :goto_0

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/retouch/t;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 105
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 107
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/retouch/t;->a(Landroid/net/Uri;)V

    goto/16 :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/f;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/retouch/t;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 82
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method
