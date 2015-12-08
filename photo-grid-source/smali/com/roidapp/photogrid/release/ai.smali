.class final Lcom/roidapp/photogrid/release/ai;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 85
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 111
    :goto_0
    :pswitch_0
    return-void

    .line 87
    :pswitch_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/al;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Ljava/lang/String;

    move-result-object v3

    iget v4, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/al;-><init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 90
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 91
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Lcom/roidapp/photogrid/release/BackgroundImageCrop;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->c(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->b(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->c(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->b(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Landroid/graphics/Bitmap;)V

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->c(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->invalidate()V

    .line 96
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->d(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V

    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->e(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V

    goto :goto_0

    .line 99
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 103
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    .line 104
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->f(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Z

    goto :goto_0

    .line 108
    :pswitch_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ai;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 85
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method
