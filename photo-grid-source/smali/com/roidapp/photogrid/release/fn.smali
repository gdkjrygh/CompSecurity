.class public final Lcom/roidapp/photogrid/release/fn;
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

.field private g:Lcom/roidapp/photogrid/release/PhotoGridActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_1

    .line 270
    :cond_0
    :goto_0
    return-void

    .line 256
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 257
    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v0

    .line 261
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020378

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 262
    const/16 v2, 0xf

    if-lt v0, v2, :cond_2

    .line 263
    const/16 v0, 0x32

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->f:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c00c0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 269
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 266
    :cond_2
    const/16 v0, 0xff

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->f:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c00bf

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1
.end method

.method private c()V
    .locals 10

    .prologue
    const v9, 0x7f0c00bf

    const/16 v8, 0xff

    const/16 v7, 0x32

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_1

    .line 308
    :cond_0
    :goto_0
    return-void

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 279
    if-eqz v0, :cond_0

    .line 282
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 283
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02039e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 284
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 285
    if-eqz v0, :cond_0

    instance-of v3, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v3, :cond_0

    .line 286
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v3, :cond_3

    .line 287
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    const v3, 0x7f020413

    invoke-virtual {v0, v5, v3, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0702fc

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 290
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 291
    invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 292
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 305
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v6, v1, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v6, v2, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 294
    :cond_3
    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    const v4, 0x7f0203b4

    invoke-virtual {v3, v5, v4, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 295
    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0701a4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v3, :cond_4

    .line 297
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 298
    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 300
    :cond_4
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v0, :cond_2

    .line 301
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 302
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1
.end method

.method private d()V
    .locals 10

    .prologue
    const v9, 0x7f0c00bf

    const/16 v8, 0xff

    const v7, 0x7f0c00c0

    const/16 v6, 0x32

    const/4 v5, 0x0

    .line 311
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_1

    .line 346
    :cond_0
    :goto_0
    return-void

    .line 314
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 315
    if-eqz v0, :cond_0

    .line 318
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 319
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

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

    instance-of v3, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v3, :cond_0

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v3, :cond_0

    .line 323
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-eqz v3, :cond_3

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-eqz v3, :cond_3

    .line 324
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 325
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 326
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 342
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v5, v1, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 343
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5, v2, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 329
    :cond_3
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-eqz v3, :cond_4

    .line 330
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 331
    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 332
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 333
    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 335
    :cond_4
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-eqz v0, :cond_2

    .line 336
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 337
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 338
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 339
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    .line 366
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    :cond_0
    :goto_0
    return-void

    .line 369
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 370
    if-eqz v0, :cond_0

    .line 373
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 374
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 29
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 30
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 31
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    const/16 v8, 0x32

    const/high16 v4, 0x41a00000    # 20.0f

    const/16 v3, 0xf

    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_1

    .line 3358
    :cond_0
    :goto_0
    return-void

    .line 69
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 70
    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    .line 3351
    :sswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fn;->a()V

    .line 3357
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3360
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentSticker"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 3361
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 3362
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d028d

    const-string v3, "FragmentBottomMain"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 1129
    :sswitch_1
    const-string v0, "RiseSticker"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 1133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 1134
    if-eqz v0, :cond_0

    .line 1137
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v1

    .line 1138
    if-eqz v1, :cond_4

    instance-of v2, v1, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_4

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v2, :cond_4

    .line 1139
    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v2, :cond_3

    .line 1140
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 1147
    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->d()V

    goto :goto_0

    .line 1142
    :cond_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07002d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/fn;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_1

    .line 1144
    :cond_4
    if-eqz v1, :cond_2

    instance-of v0, v1, Lcom/roidapp/photogrid/release/qz;

    if-eqz v0, :cond_2

    iget-boolean v0, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v0, :cond_2

    .line 1145
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702fd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/fn;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_1

    .line 2105
    :sswitch_2
    const-string v0, "DropSticker"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 2109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 2110
    if-eqz v0, :cond_0

    .line 2113
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v1

    .line 2114
    if-eqz v1, :cond_7

    instance-of v2, v1, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_7

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v2, :cond_7

    .line 2115
    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v2, :cond_6

    .line 2116
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoView;->d(Lcom/roidapp/photogrid/release/ao;)V

    .line 2123
    :cond_5
    :goto_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->d()V

    goto/16 :goto_0

    .line 2118
    :cond_6
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07002c

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/fn;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_2

    .line 2120
    :cond_7
    if-eqz v1, :cond_5

    instance-of v0, v1, Lcom/roidapp/photogrid/release/qz;

    if-eqz v0, :cond_5

    iget-boolean v0, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v0, :cond_5

    .line 2121
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702fd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/fn;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_2

    .line 2153
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 2156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    .line 2157
    if-eqz v0, :cond_0

    .line 2160
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 2161
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02039e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 2162
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v3

    .line 2163
    if-eqz v3, :cond_0

    instance-of v4, v3, Lcom/roidapp/photogrid/release/qz;

    if-eqz v4, :cond_0

    .line 2164
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/PhotoView;->c(Lcom/roidapp/photogrid/release/ao;)V

    .line 2165
    iget-boolean v0, v3, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v0, :cond_a

    .line 2166
    const-string v0, "UnLockSticker"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    const v4, 0x7f0203b4

    invoke-virtual {v0, v6, v4, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 2168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0701a4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2169
    iput-boolean v6, v3, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 2170
    iget-boolean v0, v3, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v0, :cond_8

    .line 2171
    const/16 v0, 0xff

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00bf

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2174
    :cond_8
    iget-boolean v0, v3, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v0, :cond_9

    .line 2175
    const/16 v0, 0xff

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00bf

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2188
    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v7, v1, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2189
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v7, v2, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 2179
    :cond_a
    const-string v0, "LockSticker"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    const v4, 0x7f020413

    invoke-virtual {v0, v6, v4, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 2181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0702fc

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2182
    const/4 v0, 0x1

    iput-boolean v0, v3, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 2183
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2185
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2186
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_3

    .line 2197
    :sswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 2200
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    .line 2201
    if-eqz v1, :cond_0

    .line 2204
    const-string v0, "FlipSticker"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2205
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 2206
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_0

    .line 2207
    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 3127
    iget v2, v0, Lcom/roidapp/photogrid/release/qz;->P:I

    neg-int v2, v2

    iput v2, v0, Lcom/roidapp/photogrid/release/qz;->P:I

    .line 2208
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_0

    .line 87
    :sswitch_5
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v0

    if-ge v0, v3, :cond_c

    .line 3216
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 3219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    .line 3220
    if-eqz v1, :cond_0

    .line 3223
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v0

    if-ge v0, v3, :cond_0

    .line 3226
    const-string v0, "CopySticker"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 3227
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3228
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_0

    .line 3229
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 3230
    invoke-virtual {v0, v4, v4}, Lcom/roidapp/photogrid/release/qz;->b(FF)V

    .line 3233
    :try_start_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qz;->g()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 3238
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    .line 3239
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v2

    if-lt v2, v3, :cond_b

    .line 3240
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->b()V

    .line 3242
    :cond_b
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 3243
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->c()V

    .line 3244
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->d()V

    .line 3245
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_0

    .line 3235
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_0

    .line 90
    :cond_c
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fn;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07004b

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/fn;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 73
    :sswitch_data_0
    .sparse-switch
        0x7f0d02d2 -> :sswitch_0
        0x7f0d02ed -> :sswitch_2
        0x7f0d02ee -> :sswitch_1
        0x7f0d02ef -> :sswitch_3
        0x7f0d02f0 -> :sswitch_4
        0x7f0d02f1 -> :sswitch_5
    .end sparse-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 38
    const v0, 0x7f0300ba

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1045
    const v0, 0x7f0d02ed

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    .line 1046
    const v0, 0x7f0d02ee

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    .line 1047
    const v0, 0x7f0d02ef

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    .line 1048
    const v0, 0x7f0d02d2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fn;->a:Landroid/widget/ImageView;

    .line 1049
    const v0, 0x7f0d02f0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fn;->e:Landroid/widget/TextView;

    .line 1050
    const v0, 0x7f0d02f1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fn;->f:Landroid/widget/TextView;

    .line 1051
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1052
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1053
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1054
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1055
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1056
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fn;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1057
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->c()V

    .line 1058
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->b()V

    .line 1059
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/fn;->d()V

    .line 40
    return-object v1
.end method

.method public final onDestroy()V
    .locals 0

    .prologue
    .line 380
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 381
    return-void
.end method
