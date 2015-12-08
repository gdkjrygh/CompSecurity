.class final Lcom/roidapp/imagelib/facedetector/b;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/facedetector/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/facedetector/a;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 82
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 112
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 84
    :pswitch_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/facedetector/d;

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v3}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;)Ljava/lang/String;

    move-result-object v3

    iget v4, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/imagelib/facedetector/d;-><init>(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 87
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 89
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 91
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->getMeasuredWidth()I

    .line 92
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->getMeasuredHeight()I

    .line 93
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/facedetector/a;->d(Lcom/roidapp/imagelib/facedetector/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/facedetector/a;->e(Lcom/roidapp/imagelib/facedetector/a;)[F

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(Landroid/graphics/Bitmap;[F)V

    .line 94
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->invalidate()V

    .line 95
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/facedetector/e;->a()V

    goto :goto_0

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/facedetector/e;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 105
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    .line 106
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/facedetector/a;->b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 107
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/facedetector/a;->b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a()F

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/b;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v3}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b()[F

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/roidapp/imagelib/facedetector/e;->a(Ljava/lang/String;F[F)V

    goto/16 :goto_0

    .line 82
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
