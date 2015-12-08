.class public final Lcom/roidapp/photogrid/release/db;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/LinearLayout;

.field private k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    const v9, 0x7f0c00bf

    const/16 v8, 0xff

    const/16 v7, 0x32

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 312
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_1

    .line 346
    :cond_0
    :goto_0
    return-void

    .line 315
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 316
    if-eqz v0, :cond_0

    .line 319
    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 320
    iget-object v2, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02039e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 321
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 322
    if-eqz v0, :cond_0

    instance-of v3, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v3, :cond_0

    .line 323
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v3, :cond_3

    .line 324
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    const v3, 0x7f020413

    invoke-virtual {v0, v5, v3, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 325
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0702fc

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 328
    invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 329
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 342
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v6, v1, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 343
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v6, v2, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 331
    :cond_3
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    const v4, 0x7f0203b4

    invoke-virtual {v3, v5, v4, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 332
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0701a4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v3, :cond_4

    .line 334
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 335
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 337
    :cond_4
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v0, :cond_2

    .line 338
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 339
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1
.end method

.method public final b()V
    .locals 10

    .prologue
    const v9, 0x7f0c00bf

    const/16 v8, 0xff

    const v7, 0x7f0c00c0

    const/16 v6, 0x32

    const/4 v5, 0x0

    .line 348
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_1

    .line 383
    :cond_0
    :goto_0
    return-void

    .line 351
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 352
    if-eqz v0, :cond_0

    .line 355
    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 356
    iget-object v2, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02039e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 357
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 358
    if-eqz v0, :cond_0

    instance-of v3, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v3, :cond_0

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v3, :cond_0

    .line 359
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-eqz v3, :cond_3

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-eqz v3, :cond_3

    .line 360
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 361
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 362
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 363
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 379
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v5, v1, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 380
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5, v2, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 365
    :cond_3
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-eqz v3, :cond_4

    .line 366
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 367
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 368
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 369
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 371
    :cond_4
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-eqz v0, :cond_2

    .line 372
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 373
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 374
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 375
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 388
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/db;->l:Z

    return v0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 43
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 44
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 45
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 11

    .prologue
    const/16 v10, 0xff

    const/16 v9, 0x32

    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_1

    .line 7408
    :cond_0
    :goto_0
    return-void

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 152
    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 6416
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7407
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7410
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentFreeEdit"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 7411
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 7412
    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d028d

    const-string v3, "FragmentBottomMain"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 6419
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    goto :goto_1

    .line 161
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 8094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    .line 161
    if-eqz v0, :cond_4

    .line 162
    const-string v0, "FreeActivity/banner/Filter"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->l()I

    move-result v1

    invoke-virtual {v0, v1, v6, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto :goto_0

    .line 165
    :cond_4
    const-string v0, "FreeActivity/banner/Crop"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->l()I

    move-result v1

    invoke-virtual {v0, v1, v8, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto :goto_0

    .line 170
    :pswitch_3
    const-string v0, "FreeActivity/banner/Crop"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->l()I

    move-result v1

    invoke-virtual {v0, v1, v8, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_0

    .line 174
    :pswitch_4
    const-string v0, "FreeActivity/banner/FreeCrop"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->l()I

    move-result v1

    invoke-virtual {v0, v8, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(II)V

    goto/16 :goto_0

    .line 8199
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 8202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 8203
    if-eqz v0, :cond_0

    .line 8206
    const-string v1, "DropPic"

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 8207
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 8208
    if-eqz v0, :cond_7

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v1, :cond_7

    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v1, :cond_7

    .line 8210
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v1, :cond_6

    .line 8211
    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->d(Lcom/roidapp/photogrid/release/ao;)V

    .line 8220
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/db;->b()V

    goto/16 :goto_0

    .line 8213
    :cond_6
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07002c

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/db;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_2

    .line 8215
    :cond_7
    if-eqz v0, :cond_5

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v1, :cond_5

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v0, :cond_5

    .line 8216
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702fd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/db;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_2

    .line 8226
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 8229
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 8230
    if-eqz v0, :cond_0

    .line 8233
    const-string v1, "RisePic"

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 8234
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 8235
    if-eqz v0, :cond_a

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v1, :cond_a

    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v1, :cond_a

    .line 8236
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v1, :cond_9

    .line 8237
    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 8244
    :cond_8
    :goto_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/db;->b()V

    goto/16 :goto_0

    .line 8239
    :cond_9
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07002d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/db;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_3

    .line 8241
    :cond_a
    if-eqz v0, :cond_8

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v1, :cond_8

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v0, :cond_8

    .line 8242
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702fd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/db;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_3

    .line 8268
    :pswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 8271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 8272
    if-eqz v0, :cond_0

    .line 8275
    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 8276
    iget-object v2, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02039e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 8277
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 8278
    if-eqz v0, :cond_0

    instance-of v3, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v3, :cond_0

    .line 8279
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/PhotoView;->c(Lcom/roidapp/photogrid/release/ao;)V

    .line 8280
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v3, :cond_d

    .line 8281
    const-string v3, "UnlockPic"

    invoke-static {v3}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 8282
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    const v4, 0x7f0203b4

    invoke-virtual {v3, v6, v4, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 8283
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0701a4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8284
    iput-boolean v6, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 8285
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v3, :cond_b

    .line 8286
    invoke-virtual {v1, v10}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 8287
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00bf

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8289
    :cond_b
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v0, :cond_c

    .line 8290
    invoke-virtual {v2, v10}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 8291
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00bf

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8304
    :cond_c
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v7, v1, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 8305
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v7, v2, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 8295
    :cond_d
    const-string v3, "LockPic"

    invoke-static {v3}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 8296
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    const v4, 0x7f020413

    invoke-virtual {v3, v6, v4, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 8297
    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0702fc

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8298
    iput-boolean v8, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 8299
    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 8300
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8301
    invoke-virtual {v2, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 8302
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_4

    .line 9250
    :pswitch_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 9253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 9254
    if-eqz v0, :cond_0

    .line 9257
    const-string v1, "FlipPic"

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 9258
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 9259
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v1, :cond_0

    .line 9260
    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    .line 10159
    iget v1, v0, Lcom/roidapp/photogrid/release/ps;->K:I

    neg-int v1, v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->K:I

    .line 9261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_0

    .line 191
    :pswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->l()I

    move-result v1

    invoke-virtual {v0, v1, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(II)V

    goto/16 :goto_0

    .line 155
    :pswitch_data_0
    .packed-switch 0x7f0d0339
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_8
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 55
    const v0, 0x7f0300cc

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v9

    .line 4062
    const v0, 0x7f0d033a

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->j:Landroid/widget/LinearLayout;

    .line 4063
    const v0, 0x7f0d0339

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->a:Landroid/widget/ImageView;

    .line 4064
    const v0, 0x7f0d033f

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->b:Landroid/widget/TextView;

    .line 4065
    const v0, 0x7f0d033c

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->c:Landroid/widget/TextView;

    .line 4066
    const v0, 0x7f0d0345

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->i:Landroid/widget/TextView;

    .line 4068
    const v0, 0x7f0d0348

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    .line 4069
    const v0, 0x7f0d0349

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    .line 4070
    const v0, 0x7f0d034a

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    .line 4071
    const v0, 0x7f0d0347

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->e:Landroid/widget/TextView;

    .line 4073
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->k:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 5094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    .line 4073
    if-nez v0, :cond_0

    .line 4074
    const v0, 0x7f0d033e

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 4075
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4082
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4083
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4084
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4085
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4087
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4088
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4089
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4090
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4091
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/db;->a()V

    .line 4092
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/db;->b()V

    .line 4094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/db;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/gl/c;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4095
    const v0, 0x7f0d0342

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/db;->d:Landroid/widget/TextView;

    .line 4096
    iget-object v0, p0, Lcom/roidapp/photogrid/release/db;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4116
    :goto_0
    iget-object v10, p0, Lcom/roidapp/photogrid/release/db;->j:Landroid/widget/LinearLayout;

    .line 5423
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const v2, -0x41b33333    # -0.2f

    move v3, v1

    move v5, v1

    move v6, v4

    move v7, v1

    move v8, v4

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 5424
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 5425
    invoke-virtual {v10, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 57
    return-object v9

    .line 4098
    :cond_1
    const v0, 0x7f0d0341

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 4099
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method
