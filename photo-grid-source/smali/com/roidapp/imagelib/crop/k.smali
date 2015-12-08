.class final Lcom/roidapp/imagelib/crop/k;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/j;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/j;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 143
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 189
    :cond_0
    :goto_0
    return-void

    .line 145
    :pswitch_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/crop/n;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, v3, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    iget v4, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/imagelib/crop/n;-><init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 148
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 150
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v2, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 151
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->c(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/j;->b(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 152
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->c(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/j;->b(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Landroid/graphics/Bitmap;)V

    .line 153
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->d(Lcom/roidapp/imagelib/crop/j;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0, v3, v3}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;II)V

    .line 158
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/av;->b()V

    .line 162
    :goto_2
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->f(Lcom/roidapp/imagelib/crop/j;)Z

    goto :goto_0

    .line 156
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/j;->e(Lcom/roidapp/imagelib/crop/j;)[I

    move-result-object v2

    aget v1, v2, v1

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/j;->e(Lcom/roidapp/imagelib/crop/j;)[I

    move-result-object v2

    aget v2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;II)V

    goto :goto_1

    .line 160
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/filter/av;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    .line 167
    :pswitch_2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/crop/q;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget v4, p1, Landroid/os/Message;->arg2:I

    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/roidapp/imagelib/crop/q;-><init>(Lcom/roidapp/imagelib/crop/j;IILandroid/graphics/Bitmap$CompressFormat;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 170
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/roidapp/imagelib/crop/p;

    .line 171
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-ne v0, v3, :cond_4

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 172
    :goto_3
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 173
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget-object v1, v2, Lcom/roidapp/imagelib/crop/p;->a:Landroid/net/Uri;

    iget-object v2, v2, Lcom/roidapp/imagelib/crop/p;->b:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, v3, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v4, v4, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v5}, Lcom/roidapp/imagelib/crop/j;->g(Lcom/roidapp/imagelib/crop/j;)I

    move-result v5

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(Landroid/net/Uri;Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    .line 174
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->f(Lcom/roidapp/imagelib/crop/j;)Z

    goto/16 :goto_0

    .line 171
    :cond_4
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_3

    .line 177
    :pswitch_4
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iput-object v0, v2, Lcom/roidapp/imagelib/crop/j;->f:Landroid/net/Uri;

    .line 178
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 181
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/j;->f:Landroid/net/Uri;

    if-eqz v0, :cond_6

    .line 182
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v2, v2, Lcom/roidapp/imagelib/crop/j;->f:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, v3, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v4, v4, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v5}, Lcom/roidapp/imagelib/crop/j;->g(Lcom/roidapp/imagelib/crop/j;)I

    move-result v5

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    .line 186
    :cond_5
    :goto_4
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->f(Lcom/roidapp/imagelib/crop/j;)Z

    goto/16 :goto_0

    .line 184
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v2, v2, Lcom/roidapp/imagelib/crop/j;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, v3, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v4, v4, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/k;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v5}, Lcom/roidapp/imagelib/crop/j;->g(Lcom/roidapp/imagelib/crop/j;)I

    move-result v5

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    goto :goto_4

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
