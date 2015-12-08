.class final Lcom/roidapp/imagelib/a/j;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 192
    iput-object p1, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 194
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 195
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 231
    :cond_0
    :goto_0
    return-void

    .line 197
    :pswitch_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/a/x;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-direct {v1, v2, v3}, Lcom/roidapp/imagelib/a/x;-><init>(Lcom/roidapp/imagelib/a/i;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 200
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 203
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Z)Z

    .line 204
    iget-object v1, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    iget-object v0, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/a/a;->b(Z)V

    .line 206
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/a/x;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {v1, v2, v3}, Lcom/roidapp/imagelib/a/x;-><init>(Lcom/roidapp/imagelib/a/i;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 209
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/a/z;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {v1, v2, v3}, Lcom/roidapp/imagelib/a/z;-><init>(Lcom/roidapp/imagelib/a/i;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 213
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Image Capture Error"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 216
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Preview error and return"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 219
    :pswitch_5
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/a/z;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-direct {v1, v2, v3}, Lcom/roidapp/imagelib/a/z;-><init>(Lcom/roidapp/imagelib/a/i;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 222
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    .line 223
    iget-object v1, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/y;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 224
    iget-object v1, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->c(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/filter/FilterListView;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, "ManualSelType"

    .line 225
    :goto_1
    iget-object v2, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/y;

    move-result-object v2

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, v3, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/a/a;->d()Lcom/roidapp/imagelib/b/b;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v4}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/imagelib/a/a;->f()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v4

    invoke-interface {v2, v0, v3, v4, v1}, Lcom/roidapp/imagelib/a/y;->a(Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 224
    :cond_2
    iget-object v1, p0, Lcom/roidapp/imagelib/a/j;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->c(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/filter/FilterListView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/FilterListView;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 195
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
