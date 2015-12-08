.class public Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;
.super Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;
.source "SourceFile"


# instance fields
.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Lcom/roidapp/photogrid/filter/selfiecam/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->i:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;ZLcom/roidapp/imagelib/filter/aq;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a(ZLcom/roidapp/imagelib/filter/aq;)V

    return-void
.end method

.method private a(ZLcom/roidapp/imagelib/filter/aq;)V
    .locals 4

    .prologue
    .line 180
    iput-boolean p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->k:Z

    .line 181
    const-string v0, "/Save/Save/Click"

    .line 182
    if-eqz p1, :cond_0

    const-string v0, "/Share/Save/Click"

    .line 183
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->h:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 184
    :cond_1
    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    if-eqz v0, :cond_2

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aj;->i()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v1

    .line 188
    invoke-static {v1}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz p1, :cond_3

    const-string v0, "/Share/Save/Filter/"

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 197
    :cond_2
    invoke-virtual {p0, p2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a(Lcom/roidapp/imagelib/filter/aq;)V

    .line 198
    return-void

    .line 190
    :cond_3
    const-string v0, "/Save/Save/Filter/"

    goto :goto_0
.end method

.method private a(ZZ)V
    .locals 6

    .prologue
    .line 201
    new-instance v2, Lcom/roidapp/photogrid/filter/selfiecam/c;

    invoke-direct {v2, p0, p1}, Lcom/roidapp/photogrid/filter/selfiecam/c;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;Z)V

    .line 223
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->j()[I

    move-result-object v3

    move-object v1, p0

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/filter/selfiecam/o;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/filter/selfiecam/w;[IZZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->o:Lcom/roidapp/photogrid/filter/selfiecam/o;

    .line 224
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->o:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->show()V

    .line 225
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)V
    .locals 0

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->i()V

    return-void
.end method

.method static synthetic d(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->i:Ljava/lang/String;

    return-object v0
.end method

.method private j()[I
    .locals 2

    .prologue
    .line 228
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 229
    const/16 v1, 0x438

    if-lt v0, v1, :cond_1

    .line 230
    const/16 v1, 0x5a0

    if-ge v0, v1, :cond_0

    .line 231
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 236
    :goto_0
    return-object v0

    .line 233
    :cond_0
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    goto :goto_0

    .line 236
    :cond_1
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bd(Landroid/content/Context;)[I

    move-result-object v0

    goto :goto_0

    .line 231
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

    .line 233
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

.method private k()V
    .locals 4

    .prologue
    .line 272
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->i()V

    .line 273
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/CameraPreviewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 274
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 275
    const-string v2, "current_mode"

    const-string v3, "MainPage"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 277
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 278
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->finish()V

    .line 279
    return-void
.end method

.method private l()V
    .locals 2

    .prologue
    .line 282
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->i()V

    .line 283
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 284
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 285
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->finish()V

    .line 286
    return-void
.end method

.method private m()V
    .locals 4

    .prologue
    .line 289
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/d;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/filter/selfiecam/d;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 299
    return-void
.end method

.method private n()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 344
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v0

    .line 345
    if-nez v0, :cond_0

    .line 346
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n:Z

    if-eqz v0, :cond_2

    .line 347
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/16 v1, 0x438

    if-lt v0, v1, :cond_1

    .line 348
    const/16 v0, 0x780

    .line 358
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->j()[I

    move-result-object v4

    .line 359
    const/4 v2, 0x0

    .line 360
    array-length v5, v4

    move v1, v3

    :goto_1
    if-ge v1, v5, :cond_4

    .line 361
    aget v6, v4, v1

    if-ne v6, v0, :cond_3

    .line 362
    add-int/lit8 v1, v1, 0x1

    invoke-static {v4, v3, v1}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v4

    .line 363
    array-length v5, v4

    .line 364
    new-array v2, v5, [Ljava/lang/Integer;

    move v1, v3

    .line 365
    :goto_2
    if-ge v1, v5, :cond_4

    .line 366
    add-int/lit8 v6, v5, -0x1

    sub-int/2addr v6, v1

    aget v6, v4, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v2, v1

    .line 365
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 350
    :cond_1
    const/16 v0, 0x2d0

    goto :goto_0

    .line 353
    :cond_2
    invoke-direct {p0, v7, v3}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a(ZZ)V

    .line 379
    :goto_3
    return-void

    .line 360
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 371
    :cond_4
    if-nez v2, :cond_5

    .line 372
    new-array v2, v7, [Ljava/lang/Integer;

    .line 373
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    .line 376
    :cond_5
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/b;

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->i:Ljava/lang/String;

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;)Z

    move-result v4

    iget-boolean v5, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n:Z

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/filter/selfiecam/b;-><init>(Landroid/app/Activity;[Ljava/lang/Integer;Ljava/lang/String;ZZ)V

    invoke-direct {p0, v7, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a(ZLcom/roidapp/imagelib/filter/aq;)V

    goto :goto_3
.end method


# virtual methods
.method public final a(Landroid/net/Uri;Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V
    .locals 3

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    :goto_0
    return-void

    .line 61
    :cond_0
    if-eqz p1, :cond_1

    .line 62
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 65
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n:Z

    if-eqz v0, :cond_2

    .line 66
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "image/jpeg"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 67
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->finish()V

    goto :goto_0

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->g:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d01ac

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 74
    const v1, 0x7f0701a0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 75
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 76
    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    array-length v1, v0

    if-lez v1, :cond_3

    .line 77
    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v1, v0, v1

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 78
    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v1, v0, v1

    iput-object p4, v1, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 79
    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v1, v0, v1

    iput-object p3, v1, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 80
    iget v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v0, v0, v1

    iput p5, v0, Lcom/roidapp/photogrid/release/ig;->l:I

    .line 82
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    if-nez v0, :cond_4

    .line 83
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->h:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/a;-><init>(Lcom/roidapp/photogrid/release/ParentActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    .line 86
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->k:Z

    if-eqz v0, :cond_5

    .line 87
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/a;->a()V

    goto :goto_0

    .line 89
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/a;->b()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 303
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 304
    sparse-switch v0, :sswitch_data_0

    .line 339
    :goto_0
    return-void

    .line 306
    :sswitch_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n()V

    goto :goto_0

    .line 309
    :sswitch_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n:Z

    if-eqz v0, :cond_0

    .line 310
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n()V

    goto :goto_0

    .line 313
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/o;

    new-instance v2, Lcom/roidapp/photogrid/filter/selfiecam/e;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/filter/selfiecam/e;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)V

    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->j()[I

    move-result-object v3

    move-object v1, p0

    move v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/filter/selfiecam/o;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/filter/selfiecam/w;[IZZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->o:Lcom/roidapp/photogrid/filter/selfiecam/o;

    .line 335
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->o:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->show()V

    goto :goto_0

    .line 304
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0d003a -> :sswitch_1
        0x7f0d0237 -> :sswitch_0
    .end sparse-switch
.end method

.method protected final d()Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 102
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/ab;

    invoke-direct {v0}, Lcom/roidapp/photogrid/filter/selfiecam/ab;-><init>()V

    return-object v0
.end method

.method protected final f()V
    .locals 0

    .prologue
    .line 242
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->l()V

    .line 243
    return-void
.end method

.method protected final g()V
    .locals 2

    .prologue
    .line 247
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->l:Z

    if-eqz v0, :cond_0

    .line 249
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->l()V

    .line 269
    :goto_0
    return-void

    .line 252
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->c:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 261
    :pswitch_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->k()V

    goto :goto_0

    .line 254
    :pswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->i()V

    .line 255
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->finish()V

    .line 256
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->l:Z

    if-nez v0, :cond_1

    .line 257
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->m:Z

    .line 258
    :cond_1
    const-string v0, "MainPage_View"

    const-string v1, "_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 264
    :pswitch_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->m()V

    goto :goto_0

    .line 252
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .prologue
    const/4 v5, 0x1

    .line 120
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 121
    sparse-switch p1, :sswitch_data_0

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 123
    :sswitch_0
    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 130
    :goto_1
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 131
    if-eqz v0, :cond_1

    array-length v1, v0

    if-nez v1, :cond_2

    .line 132
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->l()V

    goto :goto_0

    .line 125
    :pswitch_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->finish()V

    goto :goto_0

    .line 128
    :pswitch_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->k:Z

    invoke-direct {p0, v0, v5}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a(ZZ)V

    goto :goto_1

    .line 135
    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a(Z)V

    .line 136
    sget v1, Lcom/roidapp/photogrid/filter/e;->a:I

    iget v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v2, v0, v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v3, v0, v3

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    iget v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v4, v0, v4

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iget v6, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->b:I

    aget-object v0, v0, v6

    iget v6, v0, Lcom/roidapp/photogrid/release/ig;->l:I

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;ZI)V

    goto :goto_0

    .line 143
    :pswitch_4
    iget v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->c:I

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 152
    :pswitch_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->k()V

    goto :goto_0

    .line 147
    :pswitch_6
    invoke-static {}, Lcom/roidapp/baselib/c/n;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 148
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->k()V

    goto :goto_0

    .line 149
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->m()V

    goto :goto_0

    .line 155
    :pswitch_7
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->m()V

    goto :goto_0

    .line 160
    :pswitch_8
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->l()V

    goto :goto_0

    .line 164
    :pswitch_9
    :try_start_0
    invoke-virtual {p0, p3}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 165
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->finish()V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    .line 174
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->o:Lcom/roidapp/photogrid/filter/selfiecam/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->o:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/photogrid/filter/selfiecam/o;->a(IILandroid/content/Intent;)V

    goto :goto_0

    .line 121
    nop

    :sswitch_data_0
    .sparse-switch
        0x2046 -> :sswitch_0
        0xcc01 -> :sswitch_1
    .end sparse-switch

    .line 123
    :pswitch_data_0
    .packed-switch 0x8800
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_8
        :pswitch_4
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 143
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_5
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 45
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    const-string v0, "SelfieCam"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->h:Ljava/lang/String;

    .line 48
    invoke-static {p0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Landroid/app/Activity;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->n:Z

    .line 49
    invoke-static {}, Lcom/roidapp/imagelib/a/h;->a()V

    .line 50
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "shareToSelf"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->l:Z

    .line 52
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 112
    invoke-super {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->onDestroy()V

    .line 113
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->m:Z

    if-eqz v0, :cond_0

    .line 114
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 115
    :cond_0
    return-void
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 107
    invoke-super {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->onPause()V

    .line 108
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 97
    invoke-super {p0}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->onResume()V

    .line 98
    return-void
.end method
