.class final Lcom/roidapp/photogrid/cloud/cq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const v3, 0x7f0700e2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 251
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 306
    :cond_0
    :goto_0
    return-void

    .line 253
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 257
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 261
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 264
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 275
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V

    goto :goto_0

    .line 266
    :pswitch_0
    const-string v0, "Template_Personal_Back"

    const/4 v1, 0x4

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    goto :goto_1

    .line 278
    :sswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)[Z

    move-result-object v0

    aget-boolean v0, v0, v2

    if-eqz v0, :cond_2

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 280
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 284
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)[Z

    move-result-object v0

    aput-boolean v2, v0, v2

    .line 285
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/photogrid/cloud/cu;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/cu;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    .line 286
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a/e;->d()V

    .line 287
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    const/16 v1, 0x2317

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/b/c;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 291
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)[Z

    move-result-object v0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 293
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 297
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)[Z

    move-result-object v0

    aput-boolean v2, v0, v1

    .line 298
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/photogrid/cloud/cu;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/cu;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    .line 299
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a/e;->d()V

    .line 300
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cq;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    const/16 v1, 0x2318

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/b/c;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 251
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0d008c -> :sswitch_4
        0x7f0d00e8 -> :sswitch_3
        0x7f0d00ee -> :sswitch_1
        0x7f0d00f0 -> :sswitch_2
        0x7f0d00f3 -> :sswitch_0
    .end sparse-switch

    .line 264
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
