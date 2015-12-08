.class final Lcom/roidapp/photogrid/release/jm;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 195
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v1, 0x4

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/16 v3, 0x8

    .line 197
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 199
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 373
    :cond_0
    :goto_0
    return-void

    .line 201
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 205
    if-eqz v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 213
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 222
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 231
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v0, v0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ne v0, v5, :cond_2

    .line 232
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    const v2, 0x7f0701f6

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->b(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 234
    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    const v2, 0x7f0701f7

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v3, v3, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->b(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 239
    :sswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->a()V

    goto/16 :goto_0

    .line 245
    :sswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->e(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;I)V

    goto/16 :goto_0

    .line 257
    :sswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->g(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    .line 261
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageSelector;->h(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    .line 262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    array-length v1, v1

    new-array v1, v1, [I

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;I)V

    goto/16 :goto_0

    .line 268
    :sswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701a0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 269
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->i(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "%"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 273
    :sswitch_8
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    const v2, 0x7f07028d

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 277
    :sswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 280
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v2, p1, Landroid/os/Message;->arg1:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/photogrid/release/ig;

    invoke-static {v1, v2, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;ILcom/roidapp/photogrid/release/ig;)V

    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->j(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 285
    :sswitch_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 288
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/photogrid/release/ig;

    .line 289
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)V

    .line 290
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->k(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 291
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->k(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 293
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->l(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    .line 294
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07022b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 297
    :sswitch_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 300
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/photogrid/release/ig;

    .line 301
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)V

    .line 302
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->k(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 303
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->k(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 305
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->l(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    .line 306
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070337

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 309
    :sswitch_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 312
    :sswitch_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 317
    :sswitch_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 322
    :sswitch_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 325
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;)V

    .line 326
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->n(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->o(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    .line 328
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 329
    const-string v0, "IS/loadimgs"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;[Lcom/roidapp/photogrid/release/ig;)V

    goto/16 :goto_0

    .line 335
    :sswitch_10
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 336
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 338
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 341
    :sswitch_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 342
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 344
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;I)V

    goto/16 :goto_0

    .line 347
    :sswitch_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 348
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 350
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    .line 3254
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 3255
    const v2, 0x7f07012f

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 3256
    const v2, 0x7f07011c

    new-instance v3, Lcom/roidapp/photogrid/release/jt;

    invoke-direct {v3, v0}, Lcom/roidapp/photogrid/release/jt;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 3264
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 3265
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 353
    :sswitch_13
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->p(Lcom/roidapp/photogrid/release/ImageSelector;)V

    goto/16 :goto_0

    .line 356
    :sswitch_14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->a()V

    .line 361
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    .line 362
    new-instance v0, Lcom/roidapp/photogrid/release/jn;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/jn;-><init>(Lcom/roidapp/photogrid/release/jm;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {p0, v0, v2, v3}, Lcom/roidapp/photogrid/release/jm;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    .line 199
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x5 -> :sswitch_1
        0x6 -> :sswitch_2
        0x7 -> :sswitch_3
        0xb -> :sswitch_5
        0xc -> :sswitch_6
        0xe -> :sswitch_8
        0xf -> :sswitch_9
        0x10 -> :sswitch_a
        0x11 -> :sswitch_c
        0x12 -> :sswitch_d
        0x13 -> :sswitch_7
        0x14 -> :sswitch_e
        0x15 -> :sswitch_f
        0x16 -> :sswitch_10
        0x17 -> :sswitch_12
        0x18 -> :sswitch_13
        0x19 -> :sswitch_b
        0x1a -> :sswitch_14
        0x1b -> :sswitch_11
        0x236 -> :sswitch_4
    .end sparse-switch
.end method
