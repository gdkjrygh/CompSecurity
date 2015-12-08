.class final Lcom/roidapp/photogrid/release/ea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x2

    const/4 v6, -0x1

    const v5, 0x7f0d03ec

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 290
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 455
    :goto_0
    return-void

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->c(Lcom/roidapp/photogrid/release/dk;)I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v0, v3, :cond_2

    .line 294
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 295
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 296
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 297
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;Landroid/view/View;)Landroid/view/View;

    .line 299
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0, v6}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;I)I

    goto :goto_0

    .line 303
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ei;->a()[I

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v3

    aget v0, v0, v3

    .line 305
    sget-object v3, Lcom/roidapp/photogrid/release/dz;->a:[I

    add-int/lit8 v4, v0, -0x1

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 340
    :cond_3
    :pswitch_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 341
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setSelected(Z)V

    .line 344
    :cond_4
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v4, v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;Landroid/view/View;)Landroid/view/View;

    .line 345
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/View;->setSelected(Z)V

    .line 348
    sget-object v3, Lcom/roidapp/photogrid/release/dz;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v3, v0

    packed-switch v0, :pswitch_data_1

    .line 449
    :goto_1
    if-eqz v2, :cond_f

    .line 450
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0, v6}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;I)I

    goto/16 :goto_0

    .line 307
    :pswitch_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 308
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const v2, 0x7f0701fc

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/dk;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 313
    :pswitch_2
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 314
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const v2, 0x7f0701ff

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/dk;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 319
    :pswitch_3
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 320
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const v2, 0x7f0703ba

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/dk;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 325
    :pswitch_4
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 326
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const v2, 0x7f070204

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/dk;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 331
    :pswitch_5
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 332
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const v2, 0x7f070206

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/dk;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 350
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j()I

    move-result v0

    if-ge v0, v7, :cond_5

    .line 351
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const v3, 0x7f070320

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/dk;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 352
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    goto/16 :goto_1

    .line 355
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    new-instance v3, Lcom/roidapp/photogrid/release/hh;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/hh;-><init>()V

    sget-object v4, Lcom/roidapp/photogrid/release/hh;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v0

    if-nez v0, :cond_6

    move v0, v1

    :goto_2
    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto/16 :goto_1

    :cond_6
    move v0, v2

    goto :goto_2

    .line 359
    :pswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->f(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ng;->p()I

    move-result v0

    .line 360
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 361
    if-eqz v1, :cond_8

    if-ltz v0, :cond_8

    array-length v3, v1

    if-ge v0, v3, :cond_8

    .line 362
    aget-object v0, v1, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 363
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->g(Lcom/roidapp/photogrid/release/dk;)V

    goto/16 :goto_1

    .line 365
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->h(Lcom/roidapp/photogrid/release/dk;)V

    goto/16 :goto_1

    .line 368
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    goto/16 :goto_1

    .line 374
    :pswitch_8
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ar()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    .line 375
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->c(Lcom/roidapp/photogrid/release/dk;)I

    move-result v3

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/dk;->c(Lcom/roidapp/photogrid/release/dk;I)V

    .line 376
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 377
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0, v6}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;I)I

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->i(Lcom/roidapp/photogrid/release/dk;)V

    move v0, v1

    .line 383
    :goto_3
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v4

    if-nez v4, :cond_a

    :goto_4
    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    move v2, v0

    .line 385
    goto/16 :goto_1

    .line 381
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    new-instance v3, Lcom/roidapp/photogrid/release/el;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/el;-><init>()V

    const-string v4, "fragmentEditVideoPopupMusic"

    invoke-virtual {v0, v5, v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v2

    goto :goto_3

    :cond_a
    move v1, v2

    .line 383
    goto :goto_4

    .line 388
    :pswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    new-instance v3, Lcom/roidapp/photogrid/release/ev;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/ev;-><init>()V

    const-string v4, "fragmentEditVideoPopupTime"

    invoke-virtual {v0, v5, v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->e(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v3

    if-nez v3, :cond_b

    :goto_5
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto/16 :goto_1

    :cond_b
    move v1, v2

    goto :goto_5

    .line 393
    :pswitch_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j()I

    move-result v0

    if-ge v0, v7, :cond_c

    .line 394
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    const v3, 0x7f070320

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/dk;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 395
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    goto/16 :goto_1

    .line 398
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    new-instance v3, Lcom/roidapp/photogrid/release/ht;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/ht;-><init>()V

    sget-object v4, Lcom/roidapp/photogrid/release/ht;->b:Ljava/lang/String;

    invoke-virtual {v0, v5, v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 399
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto/16 :goto_1

    .line 404
    :pswitch_b
    new-instance v0, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 405
    invoke-virtual {v0, v1, v2, v2}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 407
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v3

    const-string v4, "FragmentBgList"

    invoke-virtual {v3, v5, v0, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 408
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto/16 :goto_1

    .line 412
    :pswitch_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    new-instance v3, Lcom/roidapp/photogrid/release/ck;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/ck;-><init>()V

    const-string v4, "FragmentBorder"

    invoke-virtual {v0, v5, v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 413
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto/16 :goto_1

    .line 417
    :pswitch_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->c(Lcom/roidapp/photogrid/release/dk;)I

    move-result v3

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/dk;->c(Lcom/roidapp/photogrid/release/dk;I)V

    .line 418
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->f(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 419
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    .line 420
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->j(Lcom/roidapp/photogrid/release/dk;)V

    goto/16 :goto_1

    .line 424
    :pswitch_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "new_feature_video_entry"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 425
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "new_feature_video_entry"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 426
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0d031d

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 427
    if-eqz v0, :cond_d

    .line 428
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 430
    :cond_d
    new-instance v0, Lcom/roidapp/photogrid/release/ej;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ej;-><init>()V

    .line 431
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v3

    const-string v4, "FragmentEditVideoFilter"

    invoke-virtual {v3, v5, v0, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 432
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto/16 :goto_1

    .line 435
    :pswitch_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "new_feature_video_blur_entry"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 436
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "new_feature_video_blur_entry"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 437
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0d031d

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 438
    if-eqz v0, :cond_e

    .line 439
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 441
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->f(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->ag()I

    move-result v3

    invoke-virtual {v0, v3, v1}, Lcom/roidapp/photogrid/release/ng;->c(IZ)V

    .line 442
    new-instance v0, Lcom/roidapp/photogrid/release/cg;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cg;-><init>()V

    .line 443
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v3

    const-string v4, "FragmentBlur"

    invoke-virtual {v3, v5, v0, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 444
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto/16 :goto_1

    .line 452
    :cond_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ea;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;I)I

    goto/16 :goto_0

    .line 305
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_5
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 348
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method
