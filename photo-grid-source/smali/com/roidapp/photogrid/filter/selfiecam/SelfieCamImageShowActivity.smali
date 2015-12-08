.class public Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field protected a:Landroid/widget/RelativeLayout;

.field protected b:Ljava/lang/String;

.field protected c:Z

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:I

.field private g:[Lcom/roidapp/photogrid/release/ig;

.field private h:Landroid/widget/ImageView;

.field private i:Lcom/roidapp/photogrid/filter/selfiecam/o;

.field private j:I

.field private k:I

.field private l:Landroid/os/Handler;

.field private m:Z

.field private n:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 58
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 83
    iput-boolean v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->c:Z

    .line 85
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/l;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/l;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->l:Landroid/os/Handler;

    .line 564
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->h:Landroid/widget/ImageView;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 196
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 197
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->startActivity(Landroid/content/Intent;)V

    .line 198
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->finish()V

    .line 199
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 58
    .line 3671
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->l:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/k;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/photogrid/filter/selfiecam/k;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;ZLcom/roidapp/imagelib/filter/aq;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(ZLcom/roidapp/imagelib/filter/aq;)V

    return-void
.end method

.method private a(ZLcom/roidapp/imagelib/filter/aq;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 203
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 204
    iput-boolean p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->e:Z

    .line 205
    const-string v0, "/Save/Save/Click"

    .line 206
    if-eqz p1, :cond_0

    const-string v0, "/Share/Save/Click"

    .line 207
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 208
    :cond_1
    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ig;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 218
    if-eqz v1, :cond_2

    .line 219
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz p1, :cond_3

    const-string v0, "/Share/Save/Filter/"

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->l:Landroid/os/Handler;

    const/16 v1, 0x3fe

    invoke-static {v0, v1, v4, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 227
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 228
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->l:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 230
    return-void

    .line 220
    :cond_3
    const-string v0, "/Save/Save/Filter/"

    goto :goto_0
.end method

.method private a(ZZ)V
    .locals 6

    .prologue
    .line 233
    new-instance v2, Lcom/roidapp/photogrid/filter/selfiecam/f;

    invoke-direct {v2, p0, p1}, Lcom/roidapp/photogrid/filter/selfiecam/f;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Z)V

    .line 255
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g()[I

    move-result-object v3

    move-object v1, p0

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/filter/selfiecam/o;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/filter/selfiecam/w;[IZZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->i:Lcom/roidapp/photogrid/filter/selfiecam/o;

    .line 256
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->i:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->show()V

    .line 257
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->d:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 370
    const-string v0, "Edit_Photo"

    const-string v1, "Preview_Edit"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    const/16 v0, 0xa

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 375
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v3

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->o:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 377
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 379
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 380
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 381
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 382
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 383
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 384
    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 386
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v1, v1, v2

    .line 387
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->F:Z

    .line 388
    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->m:Z

    .line 390
    iput v3, v1, Lcom/roidapp/photogrid/release/ig;->h:I

    .line 392
    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 393
    const/4 v2, 0x1

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    aput-object v1, v2, v3

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 395
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 396
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 397
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->startActivity(Landroid/content/Intent;)V

    .line 398
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->finish()V

    .line 399
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Z
    .locals 1

    .prologue
    .line 58
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->m:Z

    return v0
.end method

.method private d()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 444
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v0

    .line 445
    if-nez v0, :cond_0

    .line 446
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->m:Z

    if-eqz v0, :cond_2

    .line 447
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/16 v1, 0x438

    if-lt v0, v1, :cond_1

    .line 448
    const/16 v0, 0x780

    .line 458
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g()[I

    move-result-object v4

    .line 459
    const/4 v2, 0x0

    .line 460
    array-length v5, v4

    move v1, v3

    :goto_1
    if-ge v1, v5, :cond_4

    .line 461
    aget v6, v4, v1

    if-ne v6, v0, :cond_3

    .line 462
    add-int/lit8 v1, v1, 0x1

    invoke-static {v4, v3, v1}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v4

    .line 463
    array-length v5, v4

    .line 464
    new-array v2, v5, [Ljava/lang/Integer;

    move v1, v3

    .line 465
    :goto_2
    if-ge v1, v5, :cond_4

    .line 466
    add-int/lit8 v6, v5, -0x1

    sub-int/2addr v6, v1

    aget v6, v4, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v2, v1

    .line 465
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 450
    :cond_1
    const/16 v0, 0x2d0

    goto :goto_0

    .line 453
    :cond_2
    invoke-direct {p0, v7, v3}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(ZZ)V

    .line 479
    :goto_3
    return-void

    .line 460
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 471
    :cond_4
    if-nez v2, :cond_5

    .line 472
    new-array v2, v7, [Ljava/lang/Integer;

    .line 473
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    .line 475
    :cond_5
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/b;

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->d:Ljava/lang/String;

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;)Z

    move-result v4

    iget-boolean v5, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->m:Z

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/filter/selfiecam/b;-><init>(Landroid/app/Activity;[Ljava/lang/Integer;Ljava/lang/String;ZZ)V

    invoke-direct {p0, v7, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(ZLcom/roidapp/imagelib/filter/aq;)V

    goto :goto_3
.end method

.method static synthetic d(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b()V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)I
    .locals 1

    .prologue
    .line 58
    iget v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->j:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)I
    .locals 1

    .prologue
    .line 58
    iget v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->k:I

    return v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 490
    const-string v0, "/Save/retake"

    .line 491
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 492
    :cond_0
    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 494
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/CameraPreviewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 495
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 496
    const-string v2, "current_mode"

    const-string v3, "MainPage"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 498
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->startActivity(Landroid/content/Intent;)V

    .line 499
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->finish()V

    .line 500
    const-string v0, "Retake_Photo"

    const-string v1, "Preview_Retake"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    const-string v0, "Selfie_Page"

    const-string v1, "Preview_Selfie"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    return-void
.end method

.method static synthetic g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->l:Landroid/os/Handler;

    return-object v0
.end method

.method private g()[I
    .locals 2

    .prologue
    .line 536
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 537
    const/16 v1, 0x438

    if-lt v0, v1, :cond_1

    .line 538
    const/16 v1, 0x5a0

    if-ge v0, v1, :cond_0

    .line 539
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 544
    :goto_0
    return-object v0

    .line 541
    :cond_0
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    goto :goto_0

    .line 544
    :cond_1
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bd(Landroid/content/Context;)[I

    move-result-object v0

    goto :goto_0

    .line 539
    nop

    :array_0
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 541
    :array_1
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
        0xa00
    .end array-data
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 163
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    :goto_0
    return-void

    .line 165
    :cond_0
    if-eqz p1, :cond_1

    .line 166
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 169
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->m:Z

    if-eqz v0, :cond_2

    .line 170
    const-string v0, "image/jpeg"

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 171
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->finish()V

    goto :goto_0

    .line 176
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    if-nez v0, :cond_3

    .line 177
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/a;-><init>(Lcom/roidapp/photogrid/release/ParentActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    .line 180
    :cond_3
    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-lez v0, :cond_4

    .line 182
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iput-object p1, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 184
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 186
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 187
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->e:Z

    if-eqz v0, :cond_5

    .line 188
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/a;->a()V

    .line 192
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f07027e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 190
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/a;->b()V

    goto :goto_1
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 682
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 685
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 686
    const v0, 0x7f07020f

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 712
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f()V

    .line 713
    return-void

    .line 687
    :cond_1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 688
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 689
    if-eqz v0, :cond_0

    .line 690
    const-string v1, "702"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 691
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 692
    :cond_2
    const-string v1, "700"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 694
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 695
    :cond_3
    const-string v1, "701"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 697
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 698
    :cond_4
    const-string v1, "703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 699
    const v0, 0x7f07028d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 701
    :cond_5
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 704
    :cond_6
    const-class v0, Ljava/lang/NoSuchMethodError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 705
    const v0, 0x7f070208

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 707
    :cond_7
    if-eqz p1, :cond_0

    .line 708
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

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 261
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 262
    sparse-switch p1, :sswitch_data_0

    .line 298
    :cond_0
    :goto_0
    return-void

    .line 264
    :sswitch_0
    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 271
    :goto_1
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 272
    if-eqz v0, :cond_1

    array-length v0, v0

    if-nez v0, :cond_0

    .line 273
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a()V

    goto :goto_0

    .line 266
    :pswitch_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->finish()V

    goto :goto_0

    .line 269
    :pswitch_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->e:Z

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(ZZ)V

    goto :goto_1

    .line 278
    :pswitch_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f()V

    goto :goto_0

    .line 281
    :pswitch_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a()V

    goto :goto_0

    .line 285
    :pswitch_6
    :try_start_0
    invoke-virtual {p0, p3}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->startActivity(Landroid/content/Intent;)V

    .line 286
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->finish()V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    .line 295
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->i:Lcom/roidapp/photogrid/filter/selfiecam/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->i:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/photogrid/filter/selfiecam/o;->a(IILandroid/content/Intent;)V

    goto :goto_0

    .line 262
    :sswitch_data_0
    .sparse-switch
        0x2046 -> :sswitch_0
        0xcc01 -> :sswitch_1
    .end sparse-switch

    .line 264
    :pswitch_data_0
    .packed-switch 0x8800
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 307
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 3363
    :cond_0
    :goto_0
    return-void

    .line 309
    :pswitch_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f()V

    goto :goto_0

    .line 313
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 2402
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2403
    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 2409
    :pswitch_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->m:Z

    if-eqz v0, :cond_1

    .line 2410
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->d()V

    .line 2437
    :goto_1
    const-string v0, "Save_Photo"

    const-string v1, "Preview_Save"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 2405
    :pswitch_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->d()V

    .line 2406
    const-string v0, "Share_Photo"

    const-string v1, "Preview_Share"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 2412
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/o;

    new-instance v2, Lcom/roidapp/photogrid/filter/selfiecam/j;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/filter/selfiecam/j;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V

    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g()[I

    move-result-object v3

    move-object v1, p0

    move v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/filter/selfiecam/o;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/filter/selfiecam/w;[IZZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->i:Lcom/roidapp/photogrid/filter/selfiecam/o;

    .line 2435
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->i:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->show()V

    goto :goto_1

    .line 316
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->g:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 317
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b()V

    goto :goto_0

    .line 3327
    :cond_2
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 3328
    const-string v0, "selfie_camera_edit_tip"

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3329
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300ed

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 3330
    if-eqz v3, :cond_0

    .line 3331
    const v0, 0x7f0d03c1

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 3332
    const v1, 0x7f0d03bf

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 3333
    const v4, 0x7f07031a

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 3334
    const v1, 0x7f0d03c0

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v4, Lcom/roidapp/photogrid/filter/selfiecam/g;

    invoke-direct {v4, p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/g;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Landroid/widget/CheckBox;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3340
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v4, 0x1080027

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v4, 0x7f0702e7

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v3, 0x7f07016b

    new-instance v4, Lcom/roidapp/photogrid/filter/selfiecam/i;

    invoke-direct {v4, p0, v0, v2}, Lcom/roidapp/photogrid/filter/selfiecam/i;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Landroid/widget/CheckBox;Landroid/content/SharedPreferences;)V

    invoke-virtual {v1, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f07016a

    new-instance v2, Lcom/roidapp/photogrid/filter/selfiecam/h;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/filter/selfiecam/h;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 3364
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b()V

    goto/16 :goto_0

    .line 307
    :pswitch_data_0
    .packed-switch 0x7f0d0371
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_4
    .end packed-switch

    .line 2403
    :pswitch_data_1
    .packed-switch 0x7f0d0372
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 116
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 121
    const-string v0, "SelfieCamImageShowActivity/onCreate"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 125
    invoke-static {p0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Landroid/app/Activity;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->m:Z

    .line 128
    const v0, 0x7f0300d2

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :goto_0
    sget-object v0, Lcom/roidapp/imagelib/a/h;->l:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->n:Ljava/lang/String;

    .line 136
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    .line 137
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_1

    .line 140
    :cond_0
    const-string v0, "SelfieCamImageShowActivity"

    const-string v1, "selectImages is null, go to main page."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 142
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->startActivity(Landroid/content/Intent;)V

    .line 143
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->finish()V

    .line 158
    :goto_1
    return-void

    .line 130
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 131
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->v:Z

    .line 132
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0

    .line 146
    :cond_1
    const-string v0, "SelfieCam"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b:Ljava/lang/String;

    .line 147
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->g:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->g:Ljava/lang/String;

    :goto_2
    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->d:Ljava/lang/String;

    .line 1505
    const v0, 0x7f0d0376

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->h:Landroid/widget/ImageView;

    .line 1506
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a:Landroid/widget/RelativeLayout;

    .line 1507
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1508
    const v0, 0x7f0d0374

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 1509
    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1510
    const v0, 0x7f0d0371

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1511
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1512
    const v0, 0x7f0d0372

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1513
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1514
    const v1, 0x7f0d0373

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1515
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1517
    iget-boolean v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->m:Z

    if-eqz v2, :cond_2

    .line 1518
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1524
    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1525
    const v1, 0x7f020459

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 1526
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1527
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1528
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090193

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1529
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090187

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {v1, v4, v4, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 1530
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->j:I

    .line 154
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->k:I

    .line 156
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/m;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/filter/selfiecam/m;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_1

    .line 147
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->o:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->o:Ljava/lang/String;

    goto/16 :goto_2

    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g:[Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    goto/16 :goto_2
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 483
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 484
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f()V

    .line 486
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 302
    return-void
.end method
