.class public final Lcom/roidapp/videolib/b/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static j:[Ljava/lang/Integer;


# instance fields
.field private a:I

.field private b:Lcom/roidapp/imagelib/b/b;

.field private c:Landroid/content/Context;

.field private d:Ljava/io/InputStream;

.field private e:Landroid/graphics/Bitmap;

.field private f:Landroid/graphics/Bitmap;

.field private g:Z

.field private h:Z

.field private i:Z

.field private k:I

.field private l:I

.field private m:Z

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 62
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    const/16 v2, 0x280

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const/16 v2, 0x140

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/roidapp/videolib/b/y;->j:[Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput v1, p0, Lcom/roidapp/videolib/b/y;->a:I

    .line 51
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/y;->b:Lcom/roidapp/imagelib/b/b;

    .line 59
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/y;->g:Z

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/y;->h:Z

    .line 61
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/y;->i:Z

    .line 63
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/videolib/b/y;->k:I

    .line 64
    iput v1, p0, Lcom/roidapp/videolib/b/y;->l:I

    .line 65
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/y;->m:Z

    .line 66
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/y;->n:Z

    .line 77
    iput-object p1, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    .line 78
    return-void
.end method

.method public static a(I)F
    .locals 3

    .prologue
    .line 1138
    const/high16 v0, 0x3f800000    # 1.0f

    int-to-float v1, p0

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method private static a()Ljp/co/cyberagent/android/a/b;
    .locals 2

    .prologue
    .line 297
    new-instance v0, Ljp/co/cyberagent/android/a/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/a/b;-><init>(B)V

    .line 300
    return-object v0
.end method

.method private static b(I)F
    .locals 3

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v2, 0x42c80000    # 100.0f

    .line 1172
    if-lez p0, :cond_1

    .line 1173
    int-to-float v1, p0

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 1177
    :cond_0
    :goto_0
    return v0

    .line 1174
    :cond_1
    if-gez p0, :cond_0

    .line 1175
    int-to-float v0, p0

    add-float/2addr v0, v2

    div-float/2addr v0, v2

    goto :goto_0
.end method


# virtual methods
.method public final a(III)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v10, 0x14

    const/high16 v9, 0x41200000    # 10.0f

    const/high16 v7, 0x40400000    # 3.0f

    const/4 v6, 0x0

    const/16 v8, -0x64

    .line 310
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 323
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 324
    iget-boolean v2, p0, Lcom/roidapp/videolib/b/y;->i:Z

    if-eqz v2, :cond_0

    .line 325
    new-instance v2, Ljp/co/cyberagent/android/a/v;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/v;-><init>()V

    .line 326
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->c:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/v;->a(Landroid/graphics/Bitmap;)V

    .line 329
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 1101
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No filter of that type!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 335
    :pswitch_0
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 336
    invoke-static {v8}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 338
    new-instance v3, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 339
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/d;->I:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 342
    new-instance v4, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 343
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/c;->j:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 347
    new-instance v1, Ljp/co/cyberagent/android/a/w;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/w;-><init>()V

    .line 348
    const-string v5, "#ff63ce"

    const v6, 0x3da3d70a    # 0.08f

    invoke-virtual {v1, v5, v6}, Ljp/co/cyberagent/android/a/w;->a(Ljava/lang/String;F)V

    .line 350
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 353
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1106
    :cond_1
    :goto_0
    :pswitch_1
    iget-boolean v1, p0, Lcom/roidapp/videolib/b/y;->h:Z

    if-eqz v1, :cond_2

    .line 1107
    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-static {}, Lcom/roidapp/videolib/b/y;->a()Ljp/co/cyberagent/android/a/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1111
    :cond_2
    return-object v0

    .line 356
    :pswitch_2
    new-instance v2, Ljp/co/cyberagent/android/a/af;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/af;-><init>()V

    .line 358
    new-instance v3, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 359
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/d;->w:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 362
    new-instance v4, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 363
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/c;->j:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 367
    new-instance v1, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 368
    invoke-static {v8}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v5

    invoke-virtual {v1, v5}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 370
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 376
    :pswitch_3
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 377
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->M:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 380
    new-instance v3, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 381
    invoke-static {v8}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 383
    new-instance v4, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 384
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/c;->n:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 388
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 393
    :pswitch_4
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 394
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->A:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 397
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 398
    const/16 v3, -0x14

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 400
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 401
    invoke-virtual {v3, v7}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 403
    new-instance v4, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 404
    const/16 v5, 0x1b

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 406
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 407
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 408
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 409
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 412
    :pswitch_5
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 413
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->q:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 416
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 417
    const/16 v3, -0x11

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 419
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 420
    invoke-virtual {v3, v7}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 422
    new-instance v4, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 423
    invoke-virtual {v4, v10}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 425
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 426
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 427
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 428
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 431
    :pswitch_6
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 432
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->Q:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 435
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 436
    const/16 v3, -0x16

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 438
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 439
    invoke-virtual {v3, v7}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 441
    new-instance v4, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 442
    const/16 v5, 0x1b

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 444
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 445
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 446
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 450
    :pswitch_7
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 451
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->i:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 454
    new-instance v3, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 455
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/c;->m:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 459
    new-instance v1, Ljp/co/cyberagent/android/a/w;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/w;-><init>()V

    .line 460
    const-string v4, "#773d0a"

    const v5, 0x3df5c28f    # 0.12f

    invoke-virtual {v1, v4, v5}, Ljp/co/cyberagent/android/a/w;->a(Ljava/lang/String;F)V

    .line 462
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 464
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 467
    :pswitch_8
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 468
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->D:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 471
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 472
    const/4 v3, 0x2

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 474
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 475
    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 477
    new-instance v4, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 478
    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 480
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 481
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 482
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 483
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 486
    :pswitch_9
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 487
    invoke-static {v10}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 489
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 490
    invoke-virtual {v3, v9}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 492
    new-instance v4, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 493
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/d;->f:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 496
    new-instance v5, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 497
    iget-object v6, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/videolib/c;->j:I

    mul-int v8, v1, v1

    invoke-static {v6, v7, v1, v8}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 501
    new-instance v6, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v6}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 502
    iget-object v7, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/videolib/c;->l:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/a/ab;->a(Landroid/graphics/Bitmap;)V

    .line 506
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 507
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 508
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 509
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 510
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 513
    :pswitch_a
    new-instance v1, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 514
    invoke-static {v8}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 516
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 517
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->c:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 520
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 521
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 524
    :pswitch_b
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 525
    const/16 v3, 0x1e

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 527
    new-instance v3, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 528
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/d;->z:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 531
    new-instance v4, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 532
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/c;->j:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 535
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 536
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 537
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 540
    :pswitch_c
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 541
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->F:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 544
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 545
    const/16 v3, 0xa

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 547
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 548
    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 550
    new-instance v4, Ljp/co/cyberagent/android/a/z;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/z;-><init>()V

    .line 551
    const-string v5, "#957574"

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/z;->a(Ljava/lang/String;)V

    .line 553
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 554
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 555
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 556
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 559
    :pswitch_d
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 560
    invoke-static {v10}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 562
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 563
    invoke-virtual {v3, v9}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 565
    new-instance v4, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 566
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/d;->P:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 570
    new-instance v5, Ljp/co/cyberagent/android/a/z;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/z;-><init>()V

    .line 571
    const-string v6, "#8c8168"

    invoke-virtual {v5, v6}, Ljp/co/cyberagent/android/a/z;->a(Ljava/lang/String;)V

    .line 573
    new-instance v6, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v6}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 574
    iget-object v7, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/videolib/c;->j:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 578
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 579
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 580
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 581
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 582
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 585
    :pswitch_e
    new-instance v1, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 586
    const/high16 v2, -0x40000000    # -2.0f

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 588
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 589
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->h:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 592
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 593
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 596
    :pswitch_f
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 597
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 601
    new-instance v1, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 602
    const/16 v3, 0xd

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 604
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 605
    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 607
    new-instance v4, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 608
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/d;->e:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 611
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 612
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 613
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 614
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 617
    :pswitch_10
    new-instance v2, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 618
    const/4 v3, 0x6

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 620
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 621
    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 623
    new-instance v4, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 624
    const/16 v5, -0xa

    invoke-static {v5}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 626
    new-instance v5, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 627
    iget-object v6, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/videolib/d;->p:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 630
    new-instance v6, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v6}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 631
    iget-object v7, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/videolib/c;->e:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 635
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 636
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 637
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 638
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 642
    :pswitch_11
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 643
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->h:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 647
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 648
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->C:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 651
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 652
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 655
    :pswitch_12
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 656
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->a:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 659
    new-instance v2, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 660
    const/16 v3, -0xa

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 662
    new-instance v3, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 663
    invoke-static {v8}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 665
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 666
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 667
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 670
    :pswitch_13
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 671
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->y:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 674
    new-instance v3, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 675
    const/4 v4, -0x5

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 677
    new-instance v4, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 678
    const/16 v5, 0xe

    invoke-static {v5}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 680
    new-instance v5, Ljp/co/cyberagent/android/a/w;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/w;-><init>()V

    .line 681
    const-string v6, "#fcc5b5"

    const v7, 0x3e8a3d71    # 0.27f

    invoke-virtual {v5, v6, v7}, Ljp/co/cyberagent/android/a/w;->a(Ljava/lang/String;F)V

    .line 683
    new-instance v6, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v6}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 684
    iget-object v7, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/videolib/c;->f:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 688
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 689
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 690
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 691
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 692
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 696
    :pswitch_14
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 697
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->E:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 700
    new-instance v3, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 701
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/c;->i:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 704
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 705
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 709
    :pswitch_15
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 710
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->O:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 713
    new-instance v3, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 714
    const/4 v4, -0x3

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 716
    new-instance v4, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 717
    const/16 v5, 0xc

    invoke-static {v5}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 719
    new-instance v5, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 720
    iget-object v6, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/videolib/c;->o:I

    mul-int v8, v1, v1

    invoke-static {v6, v7, v1, v8}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 727
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 728
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 729
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 730
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 733
    :pswitch_16
    new-instance v2, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 734
    const/16 v3, 0x9

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 736
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 737
    const/16 v3, -0xc

    invoke-static {v3}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 739
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 740
    invoke-virtual {v3, v9}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 742
    new-instance v4, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 743
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/d;->d:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 746
    new-instance v5, Ljp/co/cyberagent/android/a/w;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/w;-><init>()V

    .line 747
    const-string v6, "#85ecff"

    const v7, 0x3df5c28f    # 0.12f

    invoke-virtual {v5, v6, v7}, Ljp/co/cyberagent/android/a/w;->a(Ljava/lang/String;F)V

    .line 749
    new-instance v6, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v6}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 750
    iget-object v7, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/videolib/c;->b:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 754
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 755
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 756
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 757
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 758
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 761
    :pswitch_17
    new-instance v2, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 762
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->d:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 767
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 768
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->o:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 772
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 773
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 776
    :pswitch_18
    new-instance v2, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 777
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->g:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 781
    new-instance v1, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 782
    const/16 v3, 0xe

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 784
    new-instance v3, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 785
    const/16 v4, -0x14

    invoke-static {v4}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 787
    new-instance v4, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 788
    iget-object v5, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/videolib/d;->B:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 791
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 792
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 793
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 794
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 797
    :pswitch_19
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 798
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->b:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 801
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 802
    invoke-static {v8}, Lcom/roidapp/videolib/b/y;->b(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 804
    new-instance v3, Ljp/co/cyberagent/android/a/q;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/q;-><init>()V

    .line 805
    const/16 v4, 0x21

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/a/q;->a(I)V

    .line 807
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 808
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 809
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 812
    :pswitch_1a
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 813
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->m:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 816
    new-instance v3, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 817
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/c;->j:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 821
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 822
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 825
    :pswitch_1b
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 826
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->N:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 829
    new-instance v3, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 830
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/c;->j:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 835
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 836
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 839
    :pswitch_1c
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 840
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->K:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 843
    new-instance v3, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 844
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/c;->j:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 848
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 849
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 852
    :pswitch_1d
    new-instance v2, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 853
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/d;->L:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 856
    new-instance v3, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 857
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/c;->k:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 861
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 862
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 866
    :pswitch_1e
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 867
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 870
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 872
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 873
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->t:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 875
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 877
    new-instance v1, Ljp/co/cyberagent/android/a/aa;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v1, v2}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 881
    :pswitch_1f
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 882
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->k:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 885
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 887
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 888
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->k:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 890
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 894
    :pswitch_20
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 895
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->k:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 898
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 900
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 901
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->s:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 903
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 907
    :pswitch_21
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 908
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 911
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 913
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 914
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->n:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 916
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 920
    :pswitch_22
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2, v6}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 922
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 923
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->k:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 926
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 928
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 929
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->H:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 931
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 935
    :pswitch_23
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2, v6}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 937
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 938
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 941
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 943
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 944
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->g:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 946
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 950
    :pswitch_24
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2, v6}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 952
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 953
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 956
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 958
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 959
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->G:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 961
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 965
    :pswitch_25
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2, v6}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 967
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 968
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 971
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 973
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 974
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->x:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 976
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 980
    :pswitch_26
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v2, v6}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 982
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 983
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 986
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 988
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 989
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->r:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 991
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 995
    :pswitch_27
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 996
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 999
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1001
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 1002
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->u:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 1004
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1008
    :pswitch_28
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    const v3, 0x3fb33333    # 1.4f

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1010
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 1011
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 1014
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1016
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 1017
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->l:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 1019
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1023
    :pswitch_29
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 1024
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 1027
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1029
    new-instance v1, Ljp/co/cyberagent/android/a/aa;

    const v2, 0x3f4ccccd    # 0.8f

    invoke-direct {v1, v2}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1031
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 1032
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->J:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 1034
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1038
    :pswitch_2a
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 1039
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->j:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 1042
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1044
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 1045
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->j:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 1047
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1051
    :pswitch_2b
    new-instance v2, Ljp/co/cyberagent/android/a/aa;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/a/aa;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1053
    new-instance v2, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 1054
    iget-object v3, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/videolib/c;->k:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 1057
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1059
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 1060
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/videolib/d;->v:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 1062
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1066
    :pswitch_2c
    new-instance v1, Ljp/co/cyberagent/android/a/ad;

    invoke-direct {v1, p2, p3}, Ljp/co/cyberagent/android/a/ad;-><init>(II)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1069
    :pswitch_2d
    new-instance v1, Ljp/co/cyberagent/android/a/ac;

    invoke-direct {v1, p2, p3}, Ljp/co/cyberagent/android/a/ac;-><init>(II)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1070
    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->d:Ljava/io/InputStream;

    if-eqz v1, :cond_3

    .line 1071
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 1072
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->d:Ljava/io/InputStream;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 1073
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1075
    :cond_3
    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->f:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->f:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1076
    new-instance v1, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 1077
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->f:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 1078
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1080
    :cond_4
    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->e:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1081
    new-instance v1, Ljp/co/cyberagent/android/a/v;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/v;-><init>()V

    .line 1082
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 1083
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1087
    :pswitch_2e
    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->e:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_5

    .line 1088
    new-instance v1, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 1089
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/aj;->a(Landroid/graphics/Bitmap;)V

    .line 1090
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1093
    :cond_5
    iget-object v1, p0, Lcom/roidapp/videolib/b/y;->d:Ljava/io/InputStream;

    if-eqz v1, :cond_1

    .line 1094
    new-instance v1, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v1}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 1095
    iget-object v2, p0, Lcom/roidapp/videolib/b/y;->d:Ljava/io/InputStream;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 1096
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 331
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
        :pswitch_28
        :pswitch_29
        :pswitch_2a
        :pswitch_2b
        :pswitch_2c
        :pswitch_2d
        :pswitch_2e
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;II)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;",
            "II)",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation

    .prologue
    const/high16 v10, 0x42c80000    # 100.0f

    const/high16 v9, 0x40000000    # 2.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 260
    .line 261
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 262
    new-instance v2, Lcom/roidapp/videolib/b/a/b;

    invoke-direct {v2}, Lcom/roidapp/videolib/b/a/b;-><init>()V

    .line 263
    const/4 v0, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lcom/roidapp/videolib/b/a/b;->a(ILjava/lang/Object;)V

    .line 264
    const/4 v0, 0x1

    mul-int v4, v3, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lcom/roidapp/videolib/b/a/b;->a(ILjava/lang/Object;)V

    .line 2071
    iget v0, p1, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->b:I

    .line 265
    packed-switch v0, :pswitch_data_0

    move-object v0, v1

    .line 276
    :goto_0
    if-nez v0, :cond_0

    move-object v0, v1

    .line 291
    :goto_1
    return-object v0

    .line 267
    :pswitch_0
    new-instance v0, Lcom/roidapp/videolib/b/a/a/b;

    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-direct {v0, v4, p1}, Lcom/roidapp/videolib/b/a/a/b;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V

    goto :goto_0

    .line 270
    :pswitch_1
    new-instance v0, Lcom/roidapp/videolib/b/a/a/a;

    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-direct {v0, v4, p1}, Lcom/roidapp/videolib/b/a/a/a;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V

    goto :goto_0

    .line 273
    :pswitch_2
    new-instance v0, Lcom/roidapp/videolib/b/a/a/c;

    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-direct {v0, v4, p1}, Lcom/roidapp/videolib/b/a/a/c;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V

    goto :goto_0

    .line 279
    :cond_0
    invoke-interface {v0, v2}, Lcom/roidapp/videolib/b/a/a;->a(Lcom/roidapp/videolib/b/a/b;)Ljava/util/List;

    move-result-object v2

    .line 280
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/y;->i:Z

    if-eqz v0, :cond_1

    .line 281
    new-instance v0, Ljp/co/cyberagent/android/a/v;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/v;-><init>()V

    .line 282
    iget-object v4, p0, Lcom/roidapp/videolib/b/y;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/videolib/c;->c:I

    mul-int v6, v3, v3

    invoke-static {v4, v5, v3, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljp/co/cyberagent/android/a/v;->a(Landroid/graphics/Bitmap;)V

    .line 285
    const/4 v3, 0x0

    invoke-interface {v2, v3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 287
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/y;->g:Z

    if-eqz v0, :cond_2

    .line 2120
    new-instance v3, Ljp/co/cyberagent/android/a/e;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/e;-><init>()V

    .line 2122
    invoke-virtual {v1}, Lcom/roidapp/imagelib/b/b;->c()I

    move-result v0

    .line 2144
    int-to-float v0, v0

    const/high16 v4, 0x43960000    # 300.0f

    div-float/2addr v0, v4

    mul-float/2addr v0, v9

    const/high16 v4, -0x40800000    # -1.0f

    add-float/2addr v0, v4

    .line 2123
    invoke-virtual {v3, v0}, Ljp/co/cyberagent/android/a/e;->a(F)V

    .line 3092
    iget v0, v1, Lcom/roidapp/imagelib/b/b;->b:I

    add-int/lit8 v0, v0, 0x64

    .line 3152
    const/16 v4, 0x64

    if-le v0, v4, :cond_4

    .line 3153
    const/high16 v4, 0x40400000    # 3.0f

    add-int/lit8 v0, v0, -0x64

    int-to-float v0, v0

    div-float/2addr v0, v10

    mul-float/2addr v0, v4

    add-float/2addr v0, v8

    .line 2126
    :goto_2
    invoke-virtual {v3, v0}, Ljp/co/cyberagent/android/a/e;->b(F)V

    .line 4103
    iget v0, v1, Lcom/roidapp/imagelib/b/b;->c:I

    add-int/lit8 v0, v0, 0x64

    .line 4165
    int-to-float v0, v0

    const/high16 v4, 0x43480000    # 200.0f

    div-float/2addr v0, v4

    mul-float/2addr v0, v9

    add-float/2addr v0, v7

    .line 2129
    invoke-virtual {v3, v0}, Ljp/co/cyberagent/android/a/e;->c(F)V

    .line 2131
    invoke-virtual {v1}, Lcom/roidapp/imagelib/b/b;->d()I

    move-result v0

    .line 4184
    int-to-float v0, v0

    const/high16 v1, 0x43340000    # 180.0f

    sub-float/2addr v0, v1

    .line 2132
    invoke-virtual {v3, v0}, Ljp/co/cyberagent/android/a/e;->d(F)V

    .line 288
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/y;->h:Z

    if-eqz v0, :cond_3

    .line 290
    invoke-interface {v2}, Ljava/util/List;->size()I

    invoke-static {}, Lcom/roidapp/videolib/b/y;->a()Ljp/co/cyberagent/android/a/b;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    move-object v0, v2

    .line 291
    goto/16 :goto_1

    .line 3155
    :cond_4
    int-to-float v0, v0

    div-float/2addr v0, v10

    mul-float/2addr v0, v8

    add-float/2addr v0, v7

    goto :goto_2

    .line 265
    nop

    :pswitch_data_0
    .packed-switch 0x3fd
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
