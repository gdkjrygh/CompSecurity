.class public final Lcom/roidapp/baselib/f/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static M:Lcom/roidapp/baselib/f/b;


# instance fields
.field private A:I

.field private B:I

.field private C:F

.field private D:F

.field private E:I

.field private F:I

.field private G:I

.field private H:F

.field private I:I

.field private J:I

.field private K:Ljava/lang/String;

.field private L:Z

.field private N:Z

.field a:[Landroid/graphics/PointF;

.field b:Landroid/graphics/PointF;

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Landroid/graphics/Bitmap;

.field private k:Landroid/graphics/Bitmap;

.field private l:Landroid/graphics/Bitmap;

.field private m:Landroid/graphics/Bitmap;

.field private n:I

.field private o:I

.field private p:I

.field private final q:I

.field private r:F

.field private s:Z

.field private t:Z

.field private u:F

.field private v:F

.field private w:F

.field private final x:F

.field private y:I

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 7

    .prologue
    const/high16 v6, 0x42480000    # 50.0f

    const/4 v5, 0x1

    const/high16 v4, 0x42c80000    # 100.0f

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/f/b;->f:I

    .line 49
    const/16 v0, 0x500

    iput v0, p0, Lcom/roidapp/baselib/f/b;->q:I

    .line 51
    iput-boolean v2, p0, Lcom/roidapp/baselib/f/b;->s:Z

    .line 52
    iput-boolean v2, p0, Lcom/roidapp/baselib/f/b;->t:Z

    .line 55
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/roidapp/baselib/f/b;->x:F

    .line 57
    iput v2, p0, Lcom/roidapp/baselib/f/b;->y:I

    .line 60
    iput v3, p0, Lcom/roidapp/baselib/f/b;->z:F

    .line 63
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/baselib/f/b;->A:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/baselib/f/b;->B:I

    .line 64
    iput v3, p0, Lcom/roidapp/baselib/f/b;->C:F

    iput v3, p0, Lcom/roidapp/baselib/f/b;->D:F

    .line 65
    iput v5, p0, Lcom/roidapp/baselib/f/b;->E:I

    iput v5, p0, Lcom/roidapp/baselib/f/b;->F:I

    .line 66
    iput v2, p0, Lcom/roidapp/baselib/f/b;->G:I

    .line 67
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/baselib/f/b;->H:F

    .line 68
    iput v2, p0, Lcom/roidapp/baselib/f/b;->I:I

    iput v2, p0, Lcom/roidapp/baselib/f/b;->J:I

    .line 73
    iput-boolean v2, p0, Lcom/roidapp/baselib/f/b;->L:Z

    .line 565
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/graphics/PointF;

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v1, v0, v2

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v1, v0, v5

    const/4 v1, 0x2

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2, v4, v4}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v2, v0, v1

    const/4 v1, 0x3

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/baselib/f/b;->a:[Landroid/graphics/PointF;

    .line 572
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v6, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/roidapp/baselib/f/b;->b:Landroid/graphics/PointF;

    return-void
.end method

.method public static a()Lcom/roidapp/baselib/f/b;
    .locals 1

    .prologue
    .line 77
    sget-object v0, Lcom/roidapp/baselib/f/b;->M:Lcom/roidapp/baselib/f/b;

    if-nez v0, :cond_0

    .line 78
    new-instance v0, Lcom/roidapp/baselib/f/b;

    invoke-direct {v0}, Lcom/roidapp/baselib/f/b;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/f/b;->M:Lcom/roidapp/baselib/f/b;

    .line 80
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/f/b;->M:Lcom/roidapp/baselib/f/b;

    return-object v0
.end method

.method private varargs a(II[I)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v0, 0x1

    .line 404
    iget-object v1, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 482
    :goto_0
    return-void

    .line 408
    :cond_0
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 409
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 410
    if-eqz p1, :cond_2

    .line 411
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->a:[I

    aget v3, v3, p1

    .line 1606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 411
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    .line 412
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->c:[I

    aget v3, v3, p1

    .line 2606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 412
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    .line 413
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->b:[I

    aget v3, v3, p1

    .line 3606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 413
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    .line 420
    :goto_1
    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    if-nez v2, :cond_3

    .line 421
    :cond_1
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 476
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 477
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 478
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 479
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 480
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 481
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save create bg oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 415
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/baselib/e;->bl:I

    .line 4606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 415
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    .line 416
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/baselib/e;->bh:I

    .line 5606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 416
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    .line 417
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/baselib/e;->bj:I

    .line 6606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 417
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 423
    :cond_3
    const/16 v2, -0x14

    if-eq p2, v2, :cond_6

    .line 424
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Lcom/roidapp/baselib/f/c;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    .line 425
    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    if-nez v2, :cond_4

    .line 426
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-1 throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 428
    :cond_4
    new-instance v2, Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 429
    invoke-virtual {v2, p2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 430
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 441
    :goto_2
    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    if-nez v2, :cond_5

    .line 442
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v4, 0x2

    aget-object v3, v3, v4

    const/4 v4, 0x0

    aget v3, v3, v4

    iget-object v4, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    .line 445
    :cond_5
    iget-object v1, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    if-nez v1, :cond_a

    .line 446
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-2  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_6
    array-length v2, p3

    if-ne v2, v0, :cond_7

    .line 432
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->d:[I

    const/4 v4, 0x0

    aget v4, p3, v4

    aget v3, v3, v4

    .line 7606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 432
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    goto :goto_2

    .line 434
    :cond_7
    const/4 v2, 0x0

    aget v2, p3, v2

    if-lt v2, v5, :cond_8

    const/4 v2, 0x0

    aget v2, p3, v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->j:[[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    if-le v2, v3, :cond_9

    .line 435
    :cond_8
    const/4 v2, 0x0

    const/4 v3, 0x2

    aput v3, p3, v2

    .line 436
    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, p3, v2

    .line 438
    :cond_9
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v4, 0x0

    aget v4, p3, v4

    aget-object v3, v3, v4

    const/4 v4, 0x1

    aget v4, p3, v4

    aget v3, v3, v4

    .line 8606
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 438
    iput-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    goto/16 :goto_2

    .line 448
    :cond_a
    invoke-static {}, Lcom/roidapp/baselib/f/c;->a()Lcom/roidapp/baselib/f/c;

    iget-object v1, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/roidapp/baselib/f/b;->r:F

    invoke-static {v1, v2}, Lcom/roidapp/baselib/f/c;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    .line 451
    iget-object v1, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    if-nez v1, :cond_b

    .line 452
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-3  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 467
    :cond_b
    iget v1, p0, Lcom/roidapp/baselib/f/b;->c:I

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_c

    iget v1, p0, Lcom/roidapp/baselib/f/b;->c:I

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_3
    iput v1, p0, Lcom/roidapp/baselib/f/b;->o:I

    .line 468
    iget v1, p0, Lcom/roidapp/baselib/f/b;->d:I

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_d

    iget v1, p0, Lcom/roidapp/baselib/f/b;->d:I

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_4
    iput v1, p0, Lcom/roidapp/baselib/f/b;->p:I

    .line 469
    iget v1, p0, Lcom/roidapp/baselib/f/b;->c:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 470
    iget v2, p0, Lcom/roidapp/baselib/f/b;->d:I

    int-to-float v2, v2

    div-float v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 471
    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int v2, v1, v2

    iget-object v3, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    rem-int/2addr v2, v3

    if-eqz v2, :cond_e

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_5
    iput v1, p0, Lcom/roidapp/baselib/f/b;->n:I

    .line 473
    iget v1, p0, Lcom/roidapp/baselib/f/b;->n:I

    if-nez v1, :cond_f

    :goto_6
    iput v0, p0, Lcom/roidapp/baselib/f/b;->n:I

    goto/16 :goto_0

    .line 467
    :cond_c
    iget v1, p0, Lcom/roidapp/baselib/f/b;->c:I

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_3

    .line 468
    :cond_d
    iget v1, p0, Lcom/roidapp/baselib/f/b;->d:I

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_4

    .line 471
    :cond_e
    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_5

    .line 473
    :cond_f
    iget v0, p0, Lcom/roidapp/baselib/f/b;->n:I
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6
.end method

.method private static a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 618
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 619
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 622
    :cond_0
    return-void
.end method

.method public static b()V
    .locals 1

    .prologue
    .line 625
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/baselib/f/b;->M:Lcom/roidapp/baselib/f/b;

    .line 626
    invoke-static {}, Lcom/roidapp/baselib/f/c;->b()V

    .line 627
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    .prologue
    .line 126
    iput p1, p0, Lcom/roidapp/baselib/f/b;->z:F

    .line 127
    return-void
.end method

.method public final a(FFF)V
    .locals 3

    .prologue
    .line 114
    iput p1, p0, Lcom/roidapp/baselib/f/b;->v:F

    .line 115
    iput p2, p0, Lcom/roidapp/baselib/f/b;->u:F

    .line 116
    iput p3, p0, Lcom/roidapp/baselib/f/b;->w:F

    .line 117
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    mul-float/2addr v0, p3

    float-to-int v0, v0

    .line 118
    int-to-float v0, v0

    const/high16 v1, 0x44a00000    # 1280.0f

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/baselib/f/b;->r:F

    .line 119
    return-void
.end method

.method public final a(II)V
    .locals 0

    .prologue
    .line 89
    iput p1, p0, Lcom/roidapp/baselib/f/b;->c:I

    .line 90
    iput p2, p0, Lcom/roidapp/baselib/f/b;->d:I

    .line 91
    return-void
.end method

.method public final a(IIII)V
    .locals 0

    .prologue
    .line 107
    iput p1, p0, Lcom/roidapp/baselib/f/b;->f:I

    .line 108
    iput p2, p0, Lcom/roidapp/baselib/f/b;->g:I

    .line 109
    iput p3, p0, Lcom/roidapp/baselib/f/b;->h:I

    .line 110
    iput p4, p0, Lcom/roidapp/baselib/f/b;->i:I

    .line 111
    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/roidapp/baselib/f/b;->e:Landroid/content/Context;

    .line 86
    return-void
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v8, -0x1

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 340
    iget v0, p0, Lcom/roidapp/baselib/f/b;->f:I

    iget v2, p0, Lcom/roidapp/baselib/f/b;->g:I

    const/4 v3, 0x2

    new-array v3, v3, [I

    iget v4, p0, Lcom/roidapp/baselib/f/b;->h:I

    aput v4, v3, v6

    iget v4, p0, Lcom/roidapp/baselib/f/b;->i:I

    aput v4, v3, v7

    invoke-direct {p0, v0, v2, v3}, Lcom/roidapp/baselib/f/b;->a(II[I)V

    .line 341
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 400
    :cond_0
    :goto_0
    return-void

    .line 344
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 345
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 346
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 347
    iget v0, p0, Lcom/roidapp/baselib/f/b;->c:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/baselib/f/b;->d:I

    int-to-float v4, v0

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 348
    iget v0, p0, Lcom/roidapp/baselib/f/b;->f:I

    if-ne v0, v8, :cond_2

    .line 349
    new-array v0, v6, [I

    invoke-direct {p0, v7, v6, v0}, Lcom/roidapp/baselib/f/b;->a(II[I)V

    .line 350
    iput v7, p0, Lcom/roidapp/baselib/f/b;->f:I

    .line 352
    :cond_2
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 353
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 354
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v2, 0x6

    invoke-direct {v0, v6, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    move v0, v6

    .line 355
    :goto_1
    iget v2, p0, Lcom/roidapp/baselib/f/b;->p:I

    if-ge v0, v2, :cond_4

    move v2, v6

    .line 356
    :goto_2
    iget v4, p0, Lcom/roidapp/baselib/f/b;->o:I

    if-ge v2, v4, :cond_3

    .line 357
    iget-object v4, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    iget-object v7, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    mul-int/2addr v7, v2

    int-to-float v7, v7

    iget-object v8, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    mul-int/2addr v8, v0

    int-to-float v8, v8

    invoke-virtual {p1, v4, v7, v8, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 356
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 355
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 360
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->m:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 361
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 378
    new-instance v0, Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget v4, p0, Lcom/roidapp/baselib/f/b;->n:I

    iget-object v7, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int/2addr v4, v7

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 379
    new-instance v2, Landroid/graphics/RectF;

    iget v3, p0, Lcom/roidapp/baselib/f/b;->c:I

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/baselib/f/b;->d:I

    int-to-float v4, v4

    invoke-direct {v2, v1, v1, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 380
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 381
    sget-object v4, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v3, v0, v2, v4}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 382
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 383
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 384
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 385
    :goto_3
    iget v0, p0, Lcom/roidapp/baselib/f/b;->n:I

    if-ge v6, v0, :cond_5

    .line 386
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    mul-int/2addr v3, v6

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 385
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 388
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 389
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/baselib/f/b;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v3, p0, Lcom/roidapp/baselib/f/b;->n:I

    iget-object v4, p0, Lcom/roidapp/baselib/f/b;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 390
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->j:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Bitmap;)V

    .line 392
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 394
    iget-boolean v0, p0, Lcom/roidapp/baselib/f/b;->s:Z

    if-eqz v0, :cond_6

    .line 395
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 396
    iget v0, p0, Lcom/roidapp/baselib/f/b;->c:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/baselib/f/b;->d:I

    int-to-float v4, v0

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 398
    :cond_6
    invoke-virtual {v5, v9}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 399
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 636
    iput-object p1, p0, Lcom/roidapp/baselib/f/b;->K:Ljava/lang/String;

    .line 637
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 129
    iput-boolean p1, p0, Lcom/roidapp/baselib/f/b;->L:Z

    .line 131
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 156
    iput-boolean p1, p0, Lcom/roidapp/baselib/f/b;->N:Z

    .line 157
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 631
    iget-object v0, p0, Lcom/roidapp/baselib/f/b;->K:Ljava/lang/String;

    return-object v0
.end method
