.class public Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/template/b/a;


# instance fields
.field private a:Lcom/roidapp/cloudlib/template/b/c;

.field private b:Lcom/roidapp/cloudlib/template/c/f;

.field private c:Landroid/widget/ImageButton;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Lcom/roidapp/photogrid/common/al;

.field private f:Lcom/roidapp/photogrid/cloud/aa;

.field private g:I

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 62
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 64
    new-instance v0, Lcom/roidapp/cloudlib/template/b/c;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/template/b/c;-><init>(Lcom/roidapp/cloudlib/template/b/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a:Lcom/roidapp/cloudlib/template/b/c;

    .line 72
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h:Z

    .line 73
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    .line 489
    return-void
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 202
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 203
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->N()I

    move-result v1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 204
    iput p1, v0, Landroid/os/Message;->what:I

    .line 205
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/c;->sendMessage(Landroid/os/Message;)Z

    .line 206
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h:Z

    .line 207
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i()V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/cloudlib/template/b/c;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a:Lcom/roidapp/cloudlib/template/b/c;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/cloudlib/template/c/f;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V
    .locals 1

    .prologue
    .line 62
    const/16 v0, 0x2332

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a(I)V

    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->g:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->j()V

    return-void
.end method

.method static synthetic i(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/photogrid/common/al;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->e:Lcom/roidapp/photogrid/common/al;

    return-object v0
.end method

.method private i()V
    .locals 3

    .prologue
    .line 213
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 214
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 215
    const-string v1, "return_template_choose"

    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 216
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 217
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->startActivity(Landroid/content/Intent;)V

    .line 218
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->finish()V

    .line 219
    const-string v0, "EditPage_View"

    const-string v1, "LayoutTemplateSelect_Back_Edit"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    return-void
.end method

.method private j()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 223
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    .line 224
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 225
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v1, v6, :cond_0

    .line 226
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 228
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 229
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v2

    if-nez v2, :cond_3

    .line 230
    const-class v2, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 243
    :cond_1
    :goto_0
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v2, :pswitch_data_0

    .line 262
    :cond_2
    :goto_1
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ak()I

    .line 263
    const-string v0, "firstCreate"

    invoke-virtual {v1, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 264
    const-string v0, "folder_path"

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->L()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 265
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->startActivity(Landroid/content/Intent;)V

    .line 266
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->finish()V

    .line 267
    const-string v0, "CartPage_View"

    const-string v1, "LayoutTemplateSelect_Cart"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    return-void

    .line 231
    :cond_3
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    .line 232
    const-class v2, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 233
    :cond_4
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v2

    if-ne v2, v5, :cond_5

    .line 234
    const-class v2, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 235
    :cond_5
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v2

    const/4 v3, 0x5

    if-ne v2, v3, :cond_6

    .line 236
    const-class v2, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 237
    :cond_6
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v2

    if-ne v2, v6, :cond_7

    .line 238
    const-class v2, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 239
    :cond_7
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 240
    const-class v2, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 247
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v2

    if-nez v2, :cond_2

    .line 249
    if-eqz v0, :cond_2

    .line 250
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    goto :goto_1

    .line 243
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Landroid/support/v4/app/FragmentActivity;
    .locals 0

    .prologue
    .line 316
    return-object p0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 4

    .prologue
    .line 463
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    :cond_0
    :goto_0
    return-void

    .line 466
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "unlock_loading"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 467
    if-eqz v0, :cond_2

    .line 468
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 470
    :cond_2
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 471
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->c()Z

    move-result v1

    .line 472
    new-instance v2, Lcom/roidapp/cloudlib/template/c/i;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/template/c/i;-><init>()V

    .line 473
    invoke-virtual {v2, p1}, Lcom/roidapp/cloudlib/template/c/i;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 474
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/template/c/i;->a(I)V

    .line 475
    if-eqz v1, :cond_3

    const/16 v0, 0xa

    :goto_1
    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/template/c/i;->b(I)V

    .line 476
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v3, "TemplateUnlockDialog"

    invoke-virtual {v2, v0, v3}, Lcom/roidapp/cloudlib/template/c/i;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 478
    if-nez v1, :cond_0

    .line 480
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/template/j;->c(J)V

    .line 481
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->n_()V

    goto :goto_0

    .line 475
    :cond_3
    const/16 v0, 0x1e

    goto :goto_1

    .line 485
    :cond_4
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/d;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 326
    invoke-static {p1}, Lcom/roidapp/photogrid/common/bd;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 327
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 328
    if-eqz v0, :cond_0

    array-length v1, v0

    .line 2047
    iget v2, p1, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 328
    if-le v1, v2, :cond_0

    .line 3047
    iget v1, p1, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 329
    new-array v1, v1, [Lcom/roidapp/photogrid/release/ig;

    .line 4047
    iget v2, p1, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 330
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 331
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 334
    :cond_0
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    .line 335
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 336
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->c()V

    .line 337
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 338
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 339
    const-string v1, "return_template_choose"

    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 340
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 341
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->startActivity(Landroid/content/Intent;)V

    .line 342
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->finish()V

    .line 343
    const-string v0, "EditPage_View"

    const-string v1, "LayoutTemplateSelect_Change_Edit"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 441
    if-eqz p1, :cond_0

    .line 442
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 444
    :cond_0
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 455
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 415
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "TemplateUnlockDialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/i;

    .line 416
    if-eqz v0, :cond_0

    .line 417
    if-eqz p1, :cond_1

    .line 418
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/i;->a()V

    .line 422
    :cond_0
    :goto_0
    return-void

    .line 420
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/i;->b()V

    goto :goto_0
.end method

.method public final b()Lcom/roidapp/cloudlib/ah;
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a:Lcom/roidapp/cloudlib/template/b/c;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 426
    iput-boolean v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h:Z

    .line 427
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 430
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/template/c/f;->b(I)V

    .line 431
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a(Ljava/lang/Object;)V

    .line 432
    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 457
    return-void
.end method

.method public final b(Z)V
    .locals 3

    .prologue
    .line 348
    if-eqz p1, :cond_2

    .line 349
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    :cond_0
    :goto_0
    return-void

    .line 350
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/cloud/co;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/co;-><init>(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V

    .line 366
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "unlock_loading"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/common/e;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0

    .line 4291
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4292
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 459
    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v2, 0x8

    const/4 v5, 0x2

    const/4 v0, 0x0

    .line 380
    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h:Z

    .line 5285
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5286
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 383
    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 384
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/c/f;->b(I)V

    .line 411
    :cond_2
    return-void

    .line 387
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/template/c/f;->b(I)V

    .line 388
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/template/a/e;->a(Ljava/util/List;)V

    .line 389
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v1

    .line 390
    if-eqz v1, :cond_2

    .line 391
    iget v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->g:I

    packed-switch v2, :pswitch_data_0

    .line 399
    :goto_0
    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/a/e;->c()V

    .line 400
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f:Lcom/roidapp/photogrid/cloud/aa;

    if-nez v2, :cond_2

    .line 401
    new-instance v2, Lcom/roidapp/photogrid/cloud/aa;

    invoke-direct {v2, p0, v5}, Lcom/roidapp/photogrid/cloud/aa;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f:Lcom/roidapp/photogrid/cloud/aa;

    .line 402
    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "tempSort1"

    aput-object v3, v2, v0

    const/4 v3, 0x1

    const-string v4, "tempSort2"

    aput-object v4, v2, v3

    :goto_1
    if-ge v0, v5, :cond_2

    .line 405
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f:Lcom/roidapp/photogrid/cloud/aa;

    new-instance v3, Lcom/roidapp/photogrid/cloud/ac;

    invoke-direct {v3}, Lcom/roidapp/photogrid/cloud/ac;-><init>()V

    invoke-virtual {v2, p0, v3, v1}, Lcom/roidapp/photogrid/cloud/aa;->a(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/ac;Lcom/roidapp/cloudlib/ads/i;)V

    .line 402
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 393
    :pswitch_0
    const-string v2, "Template_Switch_Card"

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/template/a/e;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 396
    :pswitch_1
    const-string v2, "Template_Layout_Card"

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/template/a/e;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 391
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 449
    return-void
.end method

.method public final e()V
    .locals 0

    .prologue
    .line 451
    return-void
.end method

.method public final f()V
    .locals 0

    .prologue
    .line 453
    return-void
.end method

.method public final g()V
    .locals 0

    .prologue
    .line 447
    return-void
.end method

.method public final n_()V
    .locals 1

    .prologue
    .line 436
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a/e;->c()V

    .line 437
    return-void
.end method

.method public onAttachFragment(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 106
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onAttachFragment(Landroid/support/v4/app/Fragment;)V

    .line 107
    instance-of v0, p1, Lcom/roidapp/cloudlib/template/c/f;

    if-eqz v0, :cond_0

    .line 108
    check-cast p1, Lcom/roidapp/cloudlib/template/c/f;

    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b:Lcom/roidapp/cloudlib/template/c/f;

    .line 110
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const v5, 0x7f0d00ea

    const/16 v1, 0xf

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 82
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 84
    const v0, 0x7f03002a

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->v:Z

    if-nez v0, :cond_0

    .line 1122
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 1123
    invoke-virtual {v0, v5}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    .line 1124
    if-nez v2, :cond_1

    .line 1125
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-static {v3}, Lcom/roidapp/cloudlib/template/c/f;->a(I)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v2

    invoke-virtual {v0, v5, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 1133
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 1134
    const-string v2, "infoc_tag"

    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->g:I

    .line 1135
    const-string v2, "return_template_choose"

    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    .line 1136
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d:Landroid/widget/RelativeLayout;

    .line 1137
    const v0, 0x7f0d008c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->c:Landroid/widget/ImageButton;

    .line 1138
    const/16 v0, 0x2330

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a(I)V

    .line 1139
    iget v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->g:I

    packed-switch v0, :pswitch_data_0

    .line 1148
    :goto_2
    new-instance v0, Lcom/roidapp/photogrid/cloud/cn;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/cn;-><init>(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V

    .line 1194
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->c:Landroid/widget/ImageButton;

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1195
    const v2, 0x7f0d00e8

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1196
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->N()I

    move-result v0

    .line 1197
    if-le v0, v1, :cond_2

    .line 1198
    :goto_3
    const v0, 0x7f0d00e9

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v2, 0x7f0702e0

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1280
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v4}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1281
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 1272
    if-eqz v0, :cond_0

    .line 1273
    new-instance v0, Lcom/roidapp/photogrid/common/al;

    new-instance v1, Lcom/roidapp/photogrid/cloud/cp;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/cp;-><init>(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/common/al;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->e:Lcom/roidapp/photogrid/common/al;

    .line 1274
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->e:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->b()V

    .line 1275
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ba;->b()V

    .line 96
    :cond_0
    return-void

    .line 86
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 87
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->v:Z

    .line 88
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    .line 1130
    :cond_1
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentTransaction;->attach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto/16 :goto_1

    .line 1141
    :pswitch_0
    const-string v0, "Template_Switch_Page"

    invoke-static {v0, v3, v4}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    goto/16 :goto_2

    .line 1144
    :pswitch_1
    const-string v0, "Template_Layout_Page"

    invoke-static {v0, v3, v4}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    goto/16 :goto_2

    :cond_2
    move v1, v0

    .line 1197
    goto :goto_3

    .line 1139
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 114
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f:Lcom/roidapp/photogrid/cloud/aa;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f:Lcom/roidapp/photogrid/cloud/aa;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/aa;->a()V

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f:Lcom/roidapp/photogrid/cloud/aa;

    .line 119
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 298
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 299
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i:Z

    if-eqz v0, :cond_1

    .line 300
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->j()V

    .line 306
    :cond_0
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 303
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i()V

    goto :goto_0
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 101
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 102
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 311
    const-string v0, "template"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->t:Ljava/lang/String;

    .line 312
    return-void
.end method
