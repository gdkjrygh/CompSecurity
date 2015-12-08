.class public Lcom/roidapp/photogrid/release/BackgroundImageCrop;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field a:[Ljava/lang/Integer;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private g:Lcom/roidapp/imagelib/crop/CropImageView;

.field private h:Lcom/roidapp/imagelib/crop/a;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Landroid/graphics/Bitmap;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Z

.field private o:Landroid/content/Context;

.field private p:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 48
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 54
    iput v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->b:I

    .line 55
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->c:I

    .line 56
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->d:I

    .line 57
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->e:I

    .line 58
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->f:I

    .line 69
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->n:Z

    .line 81
    new-instance v0, Lcom/roidapp/photogrid/release/ai;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ai;-><init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->p:Landroid/os/Handler;

    .line 602
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/BackgroundImageCrop;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method private a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 327
    .line 330
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "_data"

    aput-object v3, v2, v1

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 331
    if-eqz v1, :cond_1

    .line 332
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 333
    const-string v0, "_data"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 339
    :goto_0
    if-eqz v1, :cond_0

    .line 341
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 346
    :cond_0
    :goto_1
    return-object v0

    .line 336
    :catch_0
    move-exception v0

    move-object v1, v6

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v6

    .line 337
    goto :goto_0

    .line 343
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 336
    :catch_2
    move-exception v0

    goto :goto_2

    :cond_1
    move-object v0, v6

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 218
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->n:Z

    .line 219
    return-void
.end method

.method private a(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 309
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 310
    const v1, 0x7f0702e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 311
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 312
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 313
    const v1, 0x7f07032f

    new-instance v2, Lcom/roidapp/photogrid/release/ak;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ak;-><init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 320
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 321
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 322
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 323
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 324
    return-void
.end method

.method private a(Z)V
    .locals 5

    .prologue
    const/16 v3, 0x8

    const/4 v4, 0x0

    const v2, 0x40166666    # 2.35f

    .line 145
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/doCrop"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-nez v0, :cond_1

    .line 148
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_0

    .line 150
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2, v4}, Lcom/roidapp/imagelib/crop/a;->a(ZFZ)V

    .line 151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/a;->b(Landroid/graphics/Bitmap;)V

    .line 173
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iput-boolean v4, v0, Lcom/roidapp/imagelib/crop/a;->c:Z

    .line 174
    return-void

    .line 153
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    .line 154
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->v()Z

    move-result v1

    .line 155
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->r()Z

    move-result v2

    .line 156
    iget-object v3, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v3, v1, v0, v2}, Lcom/roidapp/imagelib/crop/a;->a(ZFZ)V

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/a;->b(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 161
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_2

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/a;->a(Landroid/graphics/Bitmap;)V

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/crop/a;->a(F)V

    goto :goto_0

    .line 166
    :cond_2
    if-nez p1, :cond_3

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/a;->a(Landroid/graphics/Bitmap;)V

    .line 168
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    .line 169
    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/crop/a;->a(F)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Lcom/roidapp/imagelib/crop/CropImageView;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g:Lcom/roidapp/imagelib/crop/CropImageView;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Z)V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V
    .locals 2

    .prologue
    .line 48
    .line 3212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3213
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->n:Z

    .line 48
    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Z
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->n:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->p:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->o:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Lcom/roidapp/imagelib/crop/a;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    return-object v0
.end method


# virtual methods
.method protected final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 222
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 223
    if-nez p1, :cond_1

    .line 225
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 226
    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    .line 227
    aget-object v0, v0, v4

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 229
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 230
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->startActivity(Landroid/content/Intent;)V

    .line 231
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->finish()V

    .line 255
    :goto_0
    return-void

    .line 233
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 234
    new-instance v1, Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 235
    iput-object p1, v1, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 236
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    new-array v3, v3, [Lcom/roidapp/photogrid/release/ig;

    aput-object v1, v3, v4

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 251
    :cond_2
    :goto_1
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->startActivity(Landroid/content/Intent;)V

    .line 252
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->finish()V

    goto :goto_0

    .line 243
    :cond_3
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/doBack"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 244
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 246
    if-eqz p1, :cond_2

    .line 247
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 248
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->i(Ljava/lang/String;)V

    .line 249
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/release/ih;->h(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 497
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 500
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 501
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07020f

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 525
    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Ljava/lang/String;)V

    .line 526
    return-void

    .line 502
    :cond_1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 503
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 504
    if-eqz v0, :cond_0

    .line 505
    const-string v1, "702"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 506
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 507
    :cond_2
    const-string v1, "700"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 509
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 510
    :cond_3
    const-string v1, "701"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 512
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 513
    :cond_4
    const-string v1, "703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 514
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 516
    :cond_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 520
    :cond_6
    if-eqz p1, :cond_0

    .line 521
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 9

    .prologue
    const v8, 0x7f070026

    const/4 v7, 0x1

    const v5, 0x7f070181

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 351
    packed-switch p1, :pswitch_data_0

    .line 453
    :cond_0
    :goto_0
    return-void

    .line 353
    :pswitch_0
    if-eqz p3, :cond_0

    .line 356
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 358
    if-eqz v0, :cond_0

    .line 359
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 360
    const-string v3, "com.google.android.apps.docs.storage"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 361
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto :goto_0

    .line 363
    :cond_1
    const-string v3, "com.google.android.apps.docs.files"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 364
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto :goto_0

    .line 366
    :cond_2
    const-string v3, "com.google.android.apps.photos.content"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 367
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto :goto_0

    .line 371
    :cond_3
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "file:///"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 372
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 424
    :goto_1
    if-nez v0, :cond_d

    .line 425
    invoke-direct {p0, v8}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto :goto_0

    .line 374
    :cond_4
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v3, v4, :cond_c

    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 376
    const-string v3, "com.android.providers.media.documents"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 377
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 378
    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    .line 379
    const-string v3, "_id=?"

    .line 380
    sget-object v4, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    new-array v5, v7, [Ljava/lang/String;

    aput-object v0, v5, v1

    invoke-direct {p0, v4, v3, v5}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 382
    :cond_5
    const-string v3, "com.android.providers.downloads.documents"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 383
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 384
    const-string v3, "content://downloads/public_downloads"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    .line 387
    invoke-direct {p0, v0, v2, v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 389
    :cond_6
    const-string v3, "com.android.externalstorage.documents"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 390
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    .line 391
    const-string v4, "PhotoGridActivity"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "id:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "uri:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 392
    const-string v0, ":"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 393
    aget-object v3, v0, v1

    .line 394
    aget-object v4, v0, v7

    .line 395
    const-string v0, "primary"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 396
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 398
    :cond_7
    new-instance v0, Ljava/io/File;

    const-string v3, "/storage"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 399
    if-nez v3, :cond_8

    .line 400
    invoke-direct {p0, v8}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto/16 :goto_0

    :cond_8
    move v0, v1

    .line 403
    :goto_2
    array-length v5, v3

    if-ge v0, v5, :cond_a

    .line 404
    new-instance v5, Ljava/io/File;

    aget-object v6, v3, v0

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 405
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 403
    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_a
    move-object v0, v2

    .line 410
    goto/16 :goto_1

    .line 412
    :cond_b
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_1

    .line 414
    :catch_0
    move-exception v0

    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto/16 :goto_0

    .line 420
    :cond_c
    invoke-direct {p0, v0, v2, v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 428
    :cond_d
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 429
    const-string v4, ".png"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_e

    const-string v4, ".jpg"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_e

    const-string v4, ".gif"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_e

    const-string v4, ".bmp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_e

    const-string v4, ".jpeg"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_e

    const-string v4, ".mpo"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 435
    :cond_e
    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 436
    iget-object v3, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_f

    iget-object v3, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_f

    .line 437
    iget-object v3, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 438
    iput-object v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->l:Landroid/graphics/Bitmap;

    .line 440
    :cond_f
    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    .line 441
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a()V

    .line 442
    iget-object v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/imagelib/b/d;->b(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    .line 443
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/photogrid/release/al;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/al;-><init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;Ljava/lang/String;I)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 445
    :cond_10
    invoke-direct {p0, v8}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto/16 :goto_0

    .line 448
    :cond_11
    const v0, 0x7f07015d

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(I)V

    goto/16 :goto_0

    .line 351
    nop

    :pswitch_data_0
    .packed-switch 0x1001
        :pswitch_0
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 456
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->n:Z

    if-eqz v0, :cond_1

    .line 2289
    :cond_0
    :goto_0
    return-void

    .line 458
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 460
    :sswitch_0
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 463
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->m:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d01ac

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 464
    const v1, 0x7f07028a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-eqz v0, :cond_0

    .line 1260
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/saveBtn"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g:Lcom/roidapp/imagelib/crop/CropImageView;

    if-eqz v0, :cond_2

    .line 1262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g:Lcom/roidapp/imagelib/crop/CropImageView;

    .line 2148
    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Landroid/graphics/Bitmap;)V

    .line 1263
    :cond_2
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->n:Z

    .line 1265
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->k:Z

    if-eqz v0, :cond_3

    .line 1266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/a;->c()Z

    .line 1267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->j:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1270
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/am;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/am;-><init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 2274
    :sswitch_2
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/revert"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 2275
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Z)V

    goto :goto_0

    .line 2279
    :sswitch_3
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2282
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/chooseAnotherPic"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 2283
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2284
    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 2286
    const/16 v1, 0x1001

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 2288
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto/16 :goto_0

    .line 2294
    :sswitch_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a()V

    .line 2295
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    if-eqz v0, :cond_4

    .line 2296
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iput-boolean v2, v0, Lcom/roidapp/imagelib/crop/a;->c:Z

    .line 2297
    :cond_4
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/aj;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/aj;-><init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 458
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0d0028 -> :sswitch_0
        0x7f0d003a -> :sswitch_1
        0x7f0d003e -> :sswitch_2
        0x7f0d0040 -> :sswitch_3
        0x7f0d0041 -> :sswitch_4
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 115
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 116
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/onCreate"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 119
    const v0, 0x7f030004

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 131
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->v:Z

    if-nez v0, :cond_0

    .line 132
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "background_image_path"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    .line 133
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->j:Ljava/lang/String;

    .line 134
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "hasbackground"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->k:Z

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 136
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Ljava/lang/String;)V

    .line 142
    :cond_0
    :goto_1
    return-void

    .line 120
    :catch_0
    move-exception v0

    .line 121
    :try_start_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 122
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 123
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 124
    const v0, 0x7f030004

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->setContentView(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 127
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 128
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->v:Z

    .line 129
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0

    .line 139
    :cond_1
    iput-object p0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->o:Landroid/content/Context;

    .line 1177
    const v0, 0x7f0d003b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/CropImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g:Lcom/roidapp/imagelib/crop/CropImageView;

    .line 1178
    new-instance v0, Lcom/roidapp/imagelib/crop/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/imagelib/crop/a;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/crop/CropImageView;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    .line 1179
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h:Lcom/roidapp/imagelib/crop/a;

    iput-boolean v2, v0, Lcom/roidapp/imagelib/crop/a;->c:Z

    .line 1181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/d;->b(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    .line 1183
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->m:Landroid/widget/RelativeLayout;

    .line 1184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1185
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->n:Z

    .line 1187
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1188
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1190
    const v1, 0x7f0d003a

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1191
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1193
    const v1, 0x7f0d003e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1194
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1196
    const v1, 0x7f0d0040

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1197
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1199
    const v1, 0x7f0d0041

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 1200
    invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1202
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v4, :cond_2

    .line 1203
    const v2, 0x7f07026f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 1204
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1208
    :goto_2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/al;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i:Ljava/lang/String;

    invoke-direct {v1, p0, v2, v3}, Lcom/roidapp/photogrid/release/al;-><init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_1

    .line 1206
    :cond_2
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 489
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 490
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a(Ljava/lang/String;)V

    .line 492
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 485
    return-void
.end method
