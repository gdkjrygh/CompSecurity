.class final Lcom/roidapp/imagelib/filter/at;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/aj;


# direct methods
.method private constructor <init>(Lcom/roidapp/imagelib/filter/aj;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/imagelib/filter/aj;B)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/at;-><init>(Lcom/roidapp/imagelib/filter/aj;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    .line 142
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 143
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aj;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 221
    :cond_0
    :goto_0
    return-void

    .line 144
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 165
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 166
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/aq;

    if-eqz v1, :cond_0

    .line 167
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/imagelib/filter/aw;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget v4, p1, Landroid/os/Message;->arg2:I

    check-cast v0, Lcom/roidapp/imagelib/filter/aq;

    invoke-direct {v2, v3, v4, v0}, Lcom/roidapp/imagelib/filter/aw;-><init>(Lcom/roidapp/imagelib/filter/aj;ILcom/roidapp/imagelib/filter/aq;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 146
    :pswitch_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/filter/as;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v3, v3, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    iget v4, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/imagelib/filter/as;-><init>(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 149
    :pswitch_2
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 151
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 152
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 153
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/av;->b()V

    .line 158
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->b(Lcom/roidapp/imagelib/filter/aj;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/filter/aj;->b(Lcom/roidapp/imagelib/filter/aj;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 155
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/filter/av;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_1

    .line 174
    :pswitch_3
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iput-object v0, v2, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    .line 176
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-ne v0, v1, :cond_4

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 177
    :goto_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->c(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/az;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/az;->B()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v4

    .line 179
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->d(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bg;

    move-result-object v0

    if-nez v0, :cond_5

    const/16 v5, 0x64

    .line 180
    :goto_3
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-eq v0, v1, :cond_0

    .line 182
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_6

    .line 183
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v2, v2, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/aj;->e(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bi;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v3

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(Landroid/net/Uri;Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    goto/16 :goto_0

    .line 176
    :cond_4
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_2

    .line 179
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->d(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bg;->a()I

    move-result v5

    goto :goto_3

    .line 184
    :cond_6
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 185
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v2, v2, Lcom/roidapp/imagelib/filter/aj;->h:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/aj;->e(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bi;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v3

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    goto/16 :goto_0

    .line 190
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 191
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez v0, :cond_8

    .line 192
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/av;->b()V

    .line 193
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iput v1, v0, Lcom/roidapp/imagelib/filter/aj;->l:I

    .line 194
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget v1, p1, Landroid/os/Message;->arg2:I

    iput v1, v0, Lcom/roidapp/imagelib/filter/aj;->m:I

    .line 201
    :cond_7
    :goto_4
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->d(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bg;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->d(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bg;->invalidate()V

    goto/16 :goto_0

    .line 198
    :cond_8
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/filter/av;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_4

    .line 205
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 206
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->c(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/az;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 207
    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    move v2, v1

    :goto_5
    if-ge v2, v3, :cond_0

    .line 208
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->c(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/az;

    move-result-object v4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/imagelib/filter/b;

    iget-object v5, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/aj;->f(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v5

    new-instance v6, Lcom/roidapp/imagelib/filter/au;

    invoke-direct {v6, p0}, Lcom/roidapp/imagelib/filter/au;-><init>(Lcom/roidapp/imagelib/filter/at;)V

    invoke-virtual {v4, v1, v5, v6}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/imagelib/filter/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/bd;)V

    .line 207
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_5

    .line 218
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/av;->a(I)V

    goto/16 :goto_0

    .line 144
    nop

    :pswitch_data_0
    .packed-switch 0x400
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
