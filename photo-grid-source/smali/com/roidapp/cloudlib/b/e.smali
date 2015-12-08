.class final Lcom/roidapp/cloudlib/b/e;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/a;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/b/a;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .prologue
    .line 343
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/e;->a:Lcom/roidapp/cloudlib/b/a;

    .line 344
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 345
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 366
    const/4 v0, 0x2

    return v0
.end method

.method public final getItem(I)Landroid/support/v4/app/Fragment;
    .locals 2

    .prologue
    .line 349
    packed-switch p1, :pswitch_data_0

    .line 361
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 351
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/e;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    if-nez v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/e;->a:Lcom/roidapp/cloudlib/b/a;

    new-instance v1, Lcom/roidapp/cloudlib/b/j;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/b/j;-><init>()V

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;Lcom/roidapp/cloudlib/b/j;)Lcom/roidapp/cloudlib/b/j;

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/e;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    goto :goto_0

    .line 356
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/e;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    if-nez v0, :cond_1

    .line 357
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/e;->a:Lcom/roidapp/cloudlib/b/a;

    new-instance v1, Lcom/roidapp/cloudlib/b/g;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/b/g;-><init>()V

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;Lcom/roidapp/cloudlib/b/g;)Lcom/roidapp/cloudlib/b/g;

    .line 359
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/e;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    goto :goto_0

    .line 349
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 371
    packed-switch p1, :pswitch_data_0

    .line 377
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0

    .line 373
    :pswitch_0
    const-string v0, "USERS"

    goto :goto_0

    .line 375
    :pswitch_1
    const-string v0, "HASHTAGS"

    goto :goto_0

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
