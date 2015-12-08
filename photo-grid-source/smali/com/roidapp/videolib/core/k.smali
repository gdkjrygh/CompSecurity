.class final Lcom/roidapp/videolib/core/k;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/core/VideoEncodeService;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/core/VideoEncodeService;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 101
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 124
    :cond_0
    :goto_0
    return-void

    .line 103
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-static {v0, v1}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;Landroid/os/Messenger;)Landroid/os/Messenger;

    .line 104
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/core/a/a;->a(Landroid/os/Bundle;)Lcom/roidapp/videolib/core/a/a;

    move-result-object v1

    .line 106
    new-instance v2, Lcom/roidapp/videolib/core/b;

    iget-object v0, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/roidapp/videolib/core/b;-><init>(Landroid/content/Context;)V

    .line 108
    iget-object v0, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v3}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 109
    invoke-virtual {v1}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v0

    .line 110
    iget-object v3, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    .line 1090
    int-to-float v0, v0

    const v4, 0x3e4ccccd    # 0.2f

    mul-float/2addr v0, v4

    .line 1091
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    sget v4, Lcom/roidapp/videolib/c;->p:I

    invoke-static {v3, v4, v0}, Lcom/roidapp/baselib/a/a;->a(Landroid/content/Context;IF)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1092
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;)V

    .line 111
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    iget-object v3, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v3}, Lcom/roidapp/videolib/core/VideoEncodeService;->b(Lcom/roidapp/videolib/core/VideoEncodeService;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v3

    invoke-interface {v2, v0, v1, v3}, Lcom/roidapp/videolib/core/a/c;->a(ZLcom/roidapp/videolib/core/a/a;Lcom/roidapp/videolib/core/a/b;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 116
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/roidapp/videolib/core/k;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/core/a/c;

    .line 118
    if-eqz v0, :cond_0

    .line 119
    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/c;->a()V

    goto :goto_0

    .line 101
    :pswitch_data_0
    .packed-switch 0xaa00
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
