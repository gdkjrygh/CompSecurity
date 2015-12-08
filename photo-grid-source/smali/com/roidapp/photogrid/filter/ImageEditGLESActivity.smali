.class public Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/imagelib/filter/av;
.implements Lcom/roidapp/photogrid/filter/f;


# instance fields
.field protected a:Lcom/roidapp/imagelib/filter/aj;

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:Z

.field protected f:Z

.field protected g:Landroid/widget/RelativeLayout;

.field protected h:Ljava/lang/String;

.field protected i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field private k:Lcom/roidapp/imagelib/crop/j;

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:Z

.field private o:I

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 56
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 67
    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    .line 68
    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    .line 69
    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    .line 70
    iput-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->e:Z

    .line 71
    iput-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->f:Z

    .line 72
    iput-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->l:Z

    .line 78
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    .line 83
    const-string v0, "FILTER_OPTIMIZATION"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->j:Ljava/lang/String;

    .line 85
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->p:Ljava/lang/String;

    return-void
.end method

.method private a(ZLjava/lang/String;)V
    .locals 2

    .prologue
    .line 589
    if-eqz p1, :cond_0

    .line 590
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 591
    const-string v1, "crop_path"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 592
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->setResult(ILandroid/content/Intent;)V

    .line 593
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->finish()V

    .line 598
    :goto_0
    return-void

    .line 595
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->setResult(I)V

    .line 596
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->finish()V

    goto :goto_0
.end method

.method private b(I)Z
    .locals 12

    .prologue
    const v10, 0x7f0d005e

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 243
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 245
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 246
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 247
    const-string v1, "edit_image_path"

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v1, "edit_is_crop"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 249
    const-string v1, "edit_photo_profile"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 250
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "ImageCrop"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_0

    .line 251
    new-instance v1, Lcom/roidapp/imagelib/crop/j;

    invoke-direct {v1}, Lcom/roidapp/imagelib/crop/j;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    .line 252
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/crop/j;->setArguments(Landroid/os/Bundle;)V

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    const-string v1, "ImageCrop"

    invoke-virtual {v5, v10, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 254
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 259
    :goto_0
    iput p1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->o:I

    move v0, v3

    .line 349
    :goto_1
    return v0

    .line 257
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageCrop"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/j;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    goto :goto_0

    .line 262
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v6

    .line 263
    if-eqz v6, :cond_2

    array-length v0, v6

    if-nez v0, :cond_3

    .line 264
    :cond_2
    const-string v0, "ImageEditGLESActivity"

    const-string v1, "selectImages is null, go to main page."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 266
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 267
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->finish()V

    move v0, v4

    .line 268
    goto :goto_1

    .line 270
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-ne v0, v3, :cond_7

    .line 272
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v6, v0

    .line 273
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    .line 284
    :goto_2
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v6, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->m:Ljava/lang/String;

    .line 285
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v6, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 286
    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v1, v6, v1

    iget-object v2, v1, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 287
    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v1, v6, v1

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->l:I

    .line 288
    if-nez v2, :cond_c

    .line 289
    invoke-virtual {v0}, Lcom/roidapp/imagelib/b/b;->a()Z

    move-result v1

    if-nez v1, :cond_4

    .line 290
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->e()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    .line 291
    :cond_4
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v2

    .line 292
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->b()I

    move-result v1

    move v11, v1

    move-object v1, v2

    move-object v2, v0

    move v0, v11

    .line 294
    :goto_3
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 295
    const-string v8, "edit_image_path"

    iget-object v9, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const-string v8, "edit_image_origin_path"

    iget-object v9, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->m:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string v8, "mode_str"

    iget-object v9, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const-string v8, "edit_image_property_lightness"

    iget v9, v2, Lcom/roidapp/imagelib/b/b;->a:I

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 300
    const-string v8, "edit_image_property_contast"

    iget v9, v2, Lcom/roidapp/imagelib/b/b;->b:I

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 301
    const-string v8, "edit_image_property_saturation"

    iget v9, v2, Lcom/roidapp/imagelib/b/b;->c:I

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 302
    const-string v8, "edit_image_property_hue"

    iget v2, v2, Lcom/roidapp/imagelib/b/b;->d:I

    invoke-virtual {v7, v8, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 303
    const-string v2, "alphaProgress"

    invoke-virtual {v7, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 304
    const-string v0, "edit_filter_type"

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 305
    const-string v0, "edit_filter_support"

    iget-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 307
    sget v0, Lcom/roidapp/photogrid/filter/e;->a:I

    if-ne v0, p1, :cond_5

    .line 308
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageFilter"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_9

    .line 309
    new-instance v0, Lcom/roidapp/imagelib/filter/aj;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/aj;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    .line 310
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v0, v7}, Lcom/roidapp/imagelib/filter/aj;->setArguments(Landroid/os/Bundle;)V

    .line 311
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    const-string v1, "ImageFilter"

    invoke-virtual {v5, v10, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 312
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 318
    :cond_5
    :goto_4
    sget v0, Lcom/roidapp/photogrid/filter/e;->b:I

    if-ne v0, p1, :cond_6

    .line 319
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v6, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 320
    const-string v0, "edit_is_crop"

    invoke-virtual {v7, v0, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 324
    :goto_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageCrop"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_b

    .line 325
    new-instance v0, Lcom/roidapp/imagelib/crop/j;

    invoke-direct {v0}, Lcom/roidapp/imagelib/crop/j;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    .line 326
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v0, v7}, Lcom/roidapp/imagelib/crop/j;->setArguments(Landroid/os/Bundle;)V

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    const-string v1, "ImageCrop"

    invoke-virtual {v5, v10, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 328
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 348
    :cond_6
    :goto_6
    iput p1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->o:I

    move v0, v3

    .line 349
    goto/16 :goto_1

    .line 275
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v6, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    if-nez v0, :cond_8

    .line 276
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v6, v0

    .line 277
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    goto/16 :goto_2

    .line 280
    :cond_8
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v6, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    goto/16 :goto_2

    .line 314
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageFilter"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/aj;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    goto :goto_4

    .line 322
    :cond_a
    const-string v0, "edit_is_crop"

    invoke-virtual {v7, v0, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_5

    .line 331
    :cond_b
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageCrop"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/j;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    goto :goto_6

    :cond_c
    move v11, v1

    move-object v1, v2

    move-object v2, v0

    move v0, v11

    goto/16 :goto_3
.end method

.method private j()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 527
    iget-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->e:Z

    if-eqz v1, :cond_1

    .line 532
    :cond_0
    :goto_0
    return v0

    .line 529
    :cond_1
    iget-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->f:Z

    if-nez v1, :cond_0

    .line 532
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 601
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i()V

    .line 602
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 603
    const-string v1, "firstCreate"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 604
    const-string v1, "isInterFilter"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 605
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 606
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->finish()V

    .line 607
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 776
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 777
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->e:Z

    .line 778
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 783
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 784
    if-nez p1, :cond_1

    .line 785
    const v1, 0x7f07013b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 791
    :cond_0
    :goto_0
    return-void

    .line 786
    :cond_1
    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    .line 787
    const v1, 0x7f07015e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 788
    :cond_2
    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 789
    const v1, 0x7f070027

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public final a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V
    .locals 7

    .prologue
    const v2, 0x7f0d01ac

    const v1, 0x7f0701a0

    const/4 v5, 0x0

    .line 755
    iput-boolean v5, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->f:Z

    .line 756
    if-nez p1, :cond_0

    .line 757
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 758
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 760
    sget v1, Lcom/roidapp/photogrid/filter/e;->a:I

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;ZI)V

    .line 761
    iput-boolean v5, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->l:Z

    .line 770
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 771
    return-void

    .line 764
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 765
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 767
    sget v1, Lcom/roidapp/photogrid/filter/e;->b:I

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;ZI)V

    .line 768
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->l:Z

    goto :goto_0
.end method

.method protected final a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;ZI)V
    .locals 4

    .prologue
    const v3, 0x7f0d005e

    .line 357
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 432
    :goto_0
    return-void

    .line 360
    :cond_0
    sget v0, Lcom/roidapp/photogrid/filter/e;->a:I

    if-ne v0, p1, :cond_2

    .line 361
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageFilter"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p5, :cond_5

    .line 362
    :cond_1
    new-instance v0, Lcom/roidapp/imagelib/filter/aj;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/aj;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    .line 364
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 365
    const-string v1, "edit_image_path"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    const-string v1, "edit_image_origin_path"

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    const-string v1, "mode_str"

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    const-string v1, "edit_image_property_lightness"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 370
    const-string v1, "edit_image_property_contast"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 371
    const-string v1, "edit_image_property_saturation"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 372
    const-string v1, "edit_image_property_hue"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 373
    const-string v1, "edit_filter_type"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 374
    const-string v1, "alphaProgress"

    invoke-virtual {v0, v1, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 375
    const-string v1, "edit_crop_to_filter_entry"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 376
    const-string v1, "edit_filter_support"

    iget-boolean v2, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 378
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/aj;->setArguments(Landroid/os/Bundle;)V

    .line 379
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 380
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    const-string v2, "ImageFilter"

    invoke-virtual {v0, v3, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 381
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 397
    :cond_2
    :goto_1
    sget v0, Lcom/roidapp/photogrid/filter/e;->b:I

    if-ne v0, p1, :cond_4

    .line 398
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageCrop"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p5, :cond_6

    .line 399
    :cond_3
    new-instance v0, Lcom/roidapp/imagelib/crop/j;

    invoke-direct {v0}, Lcom/roidapp/imagelib/crop/j;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    .line 401
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 402
    const-string v1, "edit_image_path"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    const-string v1, "edit_crop_image_path"

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    const-string v1, "edit_image_property_lightness"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 405
    const-string v1, "edit_image_property_contast"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 406
    const-string v1, "edit_image_property_saturation"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 407
    const-string v1, "edit_image_property_hue"

    iget v2, p3, Lcom/roidapp/imagelib/b/b;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 408
    const-string v1, "edit_filter_type"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 409
    const-string v1, "alphaProgress"

    invoke-virtual {v0, v1, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 411
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/crop/j;->setArguments(Landroid/os/Bundle;)V

    .line 412
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 413
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    const-string v2, "ImageCrop"

    invoke-virtual {v0, v3, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 414
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 431
    :cond_4
    :goto_2
    iput p1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->o:I

    goto/16 :goto_0

    .line 383
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageFilter"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/aj;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    goto :goto_1

    .line 416
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageCrop"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/j;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    goto :goto_2
.end method

.method public a(Landroid/net/Uri;Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 654
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 656
    if-eqz p1, :cond_5

    .line 1670
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 1671
    if-eqz v0, :cond_8

    array-length v3, v0

    if-lez v3, :cond_8

    .line 1672
    iget v3, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    aget-object v0, v0, v3

    .line 1674
    iget-object v3, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 1675
    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/ig;->z:Z

    .line 1681
    :cond_0
    :goto_0
    invoke-static {p4}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v3

    if-nez v3, :cond_1

    if-eqz p3, :cond_7

    invoke-virtual {p3}, Lcom/roidapp/imagelib/b/b;->a()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 1683
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 1687
    :goto_1
    iget v3, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-ne v3, v1, :cond_2

    .line 1688
    iput-object p2, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 1689
    :cond_2
    iput-object p4, v0, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 1690
    iput p5, v0, Lcom/roidapp/photogrid/release/ig;->l:I

    .line 1691
    if-eqz p3, :cond_3

    .line 1692
    invoke-virtual {p3}, Lcom/roidapp/imagelib/b/b;->b()Lcom/roidapp/imagelib/b/b;

    move-result-object v3

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    :cond_3
    move v0, v1

    .line 656
    :goto_2
    if-eqz v0, :cond_5

    .line 657
    invoke-static {p4}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v3

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lcom/roidapp/imagelib/b/b;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    move v0, v1

    .line 2638
    :goto_3
    iget-object v4, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->m:Ljava/lang/String;

    if-eqz v4, :cond_5

    .line 2639
    if-eqz v3, :cond_4

    .line 2640
    const-string v3, "SingleFilter"

    const-string v4, "SingleFilter_Apply"

    iget-object v5, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->m:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    invoke-static {v3, v4, v2, v5}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2642
    :cond_4
    if-eqz v0, :cond_5

    .line 2643
    const-string v0, "SingleFilter"

    const-string v3, "SingleAdjust_Apply"

    iget-object v4, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->m:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    invoke-static {v0, v3, v2, v4}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 659
    :cond_5
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    const/16 v2, 0xa

    if-ne v0, v2, :cond_a

    .line 660
    invoke-direct {p0, v1, p2}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a(ZLjava/lang/String;)V

    .line 666
    :goto_4
    return-void

    .line 1676
    :cond_6
    iget-object v3, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    if-eq v3, p2, :cond_0

    .line 1678
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->z:Z

    goto :goto_0

    .line 1685
    :cond_7
    const/4 v3, 0x0

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    goto :goto_1

    :cond_8
    move v0, v2

    .line 1695
    goto :goto_2

    :cond_9
    move v0, v2

    .line 657
    goto :goto_3

    .line 662
    :cond_a
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k()V

    goto :goto_4
.end method

.method protected final a(Lcom/roidapp/imagelib/filter/aq;)V
    .locals 2

    .prologue
    .line 541
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 542
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d01ac

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 543
    const v1, 0x7f07028a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 544
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 545
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a(Z)V

    .line 546
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aq;)V

    .line 548
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 800
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    packed-switch v0, :pswitch_data_0

    .line 859
    :cond_0
    :goto_0
    return-void

    .line 802
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/ImageEdit/Filter/applyFilterBtn"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 803
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->p:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 804
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->p:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 807
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/filter/d;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/filter/d;-><init>(Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a(Lcom/roidapp/imagelib/filter/aq;)V

    goto :goto_0

    .line 846
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    if-eqz v0, :cond_0

    .line 847
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/ImageEdit/Crop/applyCropBtn"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 848
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d01ac

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 849
    const v1, 0x7f07028a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 850
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 851
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a(Z)V

    .line 852
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(I)V

    .line 853
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 854
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->h:Z

    goto :goto_0

    .line 800
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 712
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 715
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 716
    const v0, 0x7f07020f

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 742
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->f()V

    .line 743
    return-void

    .line 717
    :cond_1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 718
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 719
    if-eqz v0, :cond_0

    .line 720
    const-string v1, "702"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 721
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 722
    :cond_2
    const-string v1, "700"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 724
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 725
    :cond_3
    const-string v1, "701"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 727
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 728
    :cond_4
    const-string v1, "703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 729
    const v0, 0x7f07028d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 731
    :cond_5
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 734
    :cond_6
    const-class v0, Ljava/lang/NoSuchMethodError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 735
    const v0, 0x7f070208

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 737
    :cond_7
    if-eqz p1, :cond_0

    .line 738
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0
.end method

.method protected final a(Z)V
    .locals 0

    .prologue
    .line 536
    iput-boolean p1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->e:Z

    .line 537
    iput-boolean p1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->f:Z

    .line 538
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 748
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 749
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->e:Z

    .line 750
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 239
    const-string v0, "FilterPage"

    return-object v0
.end method

.method protected d()Landroid/support/v4/app/Fragment;
    .locals 4

    .prologue
    .line 225
    new-instance v0, Lcom/roidapp/photogrid/filter/a;

    invoke-direct {v0}, Lcom/roidapp/photogrid/filter/a;-><init>()V

    .line 226
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 227
    const-string v2, "entry_type"

    iget v3, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 228
    invoke-virtual {v0, v1}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 229
    return-object v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 863
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->j()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 864
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected f()V
    .locals 0

    .prologue
    .line 576
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k()V

    .line 577
    return-void
.end method

.method protected g()V
    .locals 2

    .prologue
    .line 580
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 581
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a(ZLjava/lang/String;)V

    .line 586
    :goto_0
    return-void

    .line 583
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k()V

    goto :goto_0
.end method

.method protected final i()V
    .locals 1

    .prologue
    .line 632
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 633
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 635
    :cond_0
    return-void
.end method

.method protected final o_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 234
    const-string v0, "ca-app-pub-7109791911060569/4632065934"

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 514
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 520
    :goto_0
    return-void

    .line 515
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 517
    :pswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g()V

    goto :goto_0

    .line 515
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d0028
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/16 v2, 0xa

    const/4 v5, 0x0

    const/4 v4, 0x1

    const/4 v3, -0x1

    .line 89
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 91
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 92
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageFilter"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 93
    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageCrop"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 101
    :cond_1
    const-string v0, "360"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 102
    const-string v0, "ImageEditGLESActivity"

    const-string v1, "The process has been killed, return to home."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    :cond_2
    :goto_0
    return-void

    .line 105
    :cond_3
    const-string v0, "ImageEditGLESActivity/onCreate"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 106
    const-string v0, "ImageEdit/ImageEditGLESActivity"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 109
    const v0, 0x7f0300d1

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->v:Z

    if-nez v0, :cond_2

    .line 117
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 119
    const-string v1, "entry_from"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    .line 120
    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    if-ne v1, v2, :cond_4

    .line 121
    const-string v1, "image_path"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    .line 123
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entry_ga_tag"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 124
    packed-switch v0, :pswitch_data_0

    .line 132
    :goto_2
    :pswitch_0
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    if-ne v0, v3, :cond_5

    .line 133
    const-string v0, "ImageEditGLESActivity"

    const-string v1, "error Entry!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 135
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 136
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->finish()V

    goto :goto_0

    .line 111
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 112
    iput-boolean v4, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->v:Z

    .line 113
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 126
    :pswitch_1
    const-string v0, "/Save/finish/goto/filter"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->p:Ljava/lang/String;

    goto :goto_2

    .line 129
    :pswitch_2
    const-string v0, "/share/finish/goto/filter"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->p:Ljava/lang/String;

    goto :goto_2

    .line 139
    :cond_5
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_1

    .line 163
    :goto_3
    :pswitch_3
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v2, :cond_6

    .line 164
    invoke-static {}, Lcom/roidapp/imagelib/a/h;->a()V

    .line 165
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    .line 166
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    if-ne v0, v3, :cond_9

    .line 167
    const-string v0, "ImageEditGLESActivity"

    const-string v1, "get edit_image_index failed."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1436
    :cond_7
    :goto_4
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1437
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1439
    iget-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    if-eqz v1, :cond_e

    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-nez v1, :cond_e

    .line 1440
    const v1, 0x7f07015e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1444
    :goto_5
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    .line 1446
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1447
    iput-boolean v4, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->e:Z

    goto/16 :goto_0

    .line 141
    :pswitch_4
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    goto :goto_3

    .line 144
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-ne v0, v4, :cond_8

    .line 145
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    goto :goto_3

    .line 147
    :cond_8
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    goto :goto_3

    .line 151
    :pswitch_6
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    goto :goto_3

    .line 154
    :pswitch_7
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    goto :goto_3

    .line 157
    :pswitch_8
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    goto :goto_3

    .line 160
    :pswitch_9
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h:Ljava/lang/String;

    goto :goto_3

    .line 169
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entry_type"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    .line 1217
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->h()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 171
    :cond_a
    :goto_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "edit_suppot_filter"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    .line 172
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-ne v0, v3, :cond_c

    .line 173
    const-string v0, "ImageEditGLESActivity"

    const-string v1, "error Entry type!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 175
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 176
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->finish()V

    goto/16 :goto_0

    .line 1218
    :cond_b
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 1219
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d()Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 1220
    const v2, 0x7f0d036f

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 1221
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_6

    .line 179
    :cond_c
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-nez v0, :cond_d

    .line 180
    const-string v0, "ImageEdit/Filter"

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 181
    sget v0, Lcom/roidapp/photogrid/filter/e;->a:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b(I)Z

    .line 182
    iput-boolean v5, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->l:Z

    goto/16 :goto_4

    .line 184
    :cond_d
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-ne v0, v4, :cond_7

    .line 185
    const-string v0, "ImageEdit/Crop"

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 186
    sget v0, Lcom/roidapp/photogrid/filter/e;->b:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b(I)Z

    .line 187
    iput-boolean v4, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->l:Z

    goto/16 :goto_4

    .line 1442
    :cond_e
    const v1, 0x7f070114

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_5

    .line 124
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 139
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_8
        :pswitch_3
        :pswitch_3
        :pswitch_9
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 482
    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    .line 483
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->e:Z

    if-ne v0, v1, :cond_0

    move v0, v1

    .line 492
    :goto_0
    return v0

    .line 1552
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->o:I

    sget v3, Lcom/roidapp/photogrid/filter/e;->a:I

    if-ne v0, v3, :cond_3

    .line 1553
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v3, "ImageFilter"

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/aj;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    .line 1554
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aj;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    .line 486
    :goto_1
    if-eqz v0, :cond_5

    move v0, v2

    .line 487
    goto :goto_0

    .line 1557
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g()V

    :cond_2
    move v0, v1

    .line 1572
    goto :goto_1

    .line 1560
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->o:I

    sget v3, Lcom/roidapp/photogrid/filter/e;->b:I

    if-ne v0, v3, :cond_2

    .line 1561
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v3, "ImageCrop"

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/j;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    .line 1562
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-eq v0, v1, :cond_4

    .line 1565
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    if-eqz v0, :cond_4

    .line 1566
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/j;->a()V

    :goto_2
    move v0, v1

    .line 1570
    goto :goto_1

    .line 1568
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->g()V

    goto :goto_2

    :cond_5
    move v0, v1

    .line 489
    goto :goto_0

    .line 492
    :cond_6
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 452
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 453
    const-string v0, "key_edit_image_index"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 454
    const-string v0, "key_edit_image_index"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    .line 456
    :cond_0
    const-string v0, "entry_from"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 457
    const-string v0, "entry_from"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    .line 459
    :cond_1
    const-string v0, "entry_type"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 460
    const-string v0, "entry_type"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    .line 462
    :cond_2
    const-string v0, "filter_support"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 463
    const-string v0, "filter_support"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    .line 466
    :cond_3
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 497
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 498
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->v:Z

    if-nez v0, :cond_1

    .line 500
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageFilter"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/aj;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    .line 501
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    if-nez v0, :cond_0

    .line 502
    const-string v0, "ImageEditGLESActivity"

    const-string v1, "ImageEditGLESFragment is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 504
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageCrop"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/j;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    .line 505
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->k:Lcom/roidapp/imagelib/crop/j;

    if-nez v0, :cond_1

    .line 506
    const-string v0, "ImageEditGLESActivity"

    const-string v1, "ImageEditCropFragment is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 510
    :cond_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 470
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 471
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/os/Bundle;)V

    .line 472
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 473
    const-string v0, "key_edit_image_index"

    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 474
    const-string v0, "entry_from"

    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 475
    const-string v0, "entry_type"

    iget v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 476
    const-string v0, "filter_support"

    iget-boolean v1, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->n:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 478
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 196
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 197
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-nez v0, :cond_1

    .line 198
    const-string v0, "EditPage/Filter"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 203
    :cond_0
    :goto_0
    return-void

    .line 199
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 200
    const-string v0, "EditPage/Crop"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 207
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStop()V

    .line 208
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    if-nez v0, :cond_1

    .line 209
    const-string v0, "EditPage/Filter"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 214
    :cond_0
    :goto_0
    return-void

    .line 210
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 211
    const-string v0, "EditPage/Crop"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 629
    const-string v0, "filter"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->t:Ljava/lang/String;

    .line 630
    return-void
.end method
