.class final Lcom/roidapp/videolib/core/b;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/core/a/c;
.implements Lcom/roidapp/videolib/core/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Lcom/roidapp/videolib/core/a/a;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;",
        "Lcom/roidapp/videolib/core/a/c;",
        "Lcom/roidapp/videolib/core/h;"
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:I

.field protected c:I

.field protected d:Ljava/lang/Throwable;

.field protected e:Ljava/lang/String;

.field protected f:Z

.field protected g:Z

.field public h:Lcom/roidapp/videolib/gl/f;

.field protected i:Lcom/roidapp/videolib/core/a/a;

.field private j:Lcom/roidapp/videolib/core/a/b;

.field private k:Ljava/lang/String;

.field private l:Landroid/content/Context;

.field private m:Ljava/lang/String;

.field private n:Z

.field private o:Z

.field private p:I

.field private q:I

.field private r:I

.field private s:J

.field private t:J

.field private u:Landroid/graphics/Bitmap;

.field private v:Landroid/graphics/Bitmap;

.field private final w:F

.field private x:Lcom/roidapp/videolib/core/i;

.field private y:Lcom/roidapp/videolib/core/e;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 207
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 68
    const v0, 0xee05

    iput v0, p0, Lcom/roidapp/videolib/core/b;->b:I

    .line 69
    iput v1, p0, Lcom/roidapp/videolib/core/b;->c:I

    .line 77
    iput-boolean v1, p0, Lcom/roidapp/videolib/core/b;->g:Z

    .line 79
    iput-boolean v2, p0, Lcom/roidapp/videolib/core/b;->n:Z

    .line 80
    iput-boolean v1, p0, Lcom/roidapp/videolib/core/b;->o:Z

    .line 81
    iput v2, p0, Lcom/roidapp/videolib/core/b;->p:I

    .line 84
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/roidapp/videolib/core/b;->q:I

    .line 85
    iput v1, p0, Lcom/roidapp/videolib/core/b;->r:I

    .line 86
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roidapp/videolib/core/b;->s:J

    .line 95
    iput-object v3, p0, Lcom/roidapp/videolib/core/b;->x:Lcom/roidapp/videolib/core/i;

    .line 97
    iput-object v3, p0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    .line 208
    iput-object p1, p0, Lcom/roidapp/videolib/core/b;->l:Landroid/content/Context;

    .line 210
    invoke-static {}, Lcom/roidapp/videolib/core/l;->a()Lcom/roidapp/videolib/core/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/core/l;->a(Landroid/content/Context;)V

    .line 211
    invoke-static {}, Lcom/roidapp/videolib/core/l;->a()Lcom/roidapp/videolib/core/l;

    invoke-static {}, Lcom/roidapp/videolib/core/l;->c()V

    .line 213
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_1

    .line 214
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S53"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/roidapp/videolib/core/b;->t:J

    .line 221
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    iput v0, p0, Lcom/roidapp/videolib/core/b;->w:F

    .line 223
    new-instance v0, Lcom/roidapp/videolib/core/c;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/core/c;-><init>(Lcom/roidapp/videolib/core/b;)V

    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    .line 449
    return-void

    .line 216
    :cond_0
    const-wide/16 v0, 0x7d0

    iput-wide v0, p0, Lcom/roidapp/videolib/core/b;->t:J

    goto :goto_0

    .line 217
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_2

    .line 218
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/roidapp/videolib/core/b;->t:J

    goto :goto_0

    .line 219
    :cond_2
    const-wide/16 v0, 0x64

    iput-wide v0, p0, Lcom/roidapp/videolib/core/b;->t:J

    goto :goto_0
.end method

.method static synthetic a(Landroid/text/TextPaint;Ljava/lang/String;)F
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 59
    .line 2456
    const/4 v0, 0x0

    .line 2457
    const-string v2, "line.separator"

    const-string v3, "\n"

    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    move v2, v0

    move v0, v1

    .line 2458
    :goto_0
    array-length v3, v4

    if-ge v0, v3, :cond_1

    .line 2459
    aget-object v3, v4, v0

    .line 2460
    if-eqz v3, :cond_0

    .line 2461
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 2462
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {p0, v3, v1, v6, v5}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 2463
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    .line 2465
    cmpl-float v5, v3, v2

    if-lez v5, :cond_0

    move v2, v3

    .line 2458
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 59
    :cond_1
    return v2
.end method

.method static synthetic a(FF)I
    .locals 2

    .prologue
    .line 59
    .line 2452
    mul-float v0, p0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 59
    return v0
.end method

.method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/16 v9, 0xff

    const/high16 v8, 0x40000000    # 2.0f

    .line 477
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v1

    .line 478
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->e()I

    move-result v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 479
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 481
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    if-le v0, v4, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 482
    :goto_0
    int-to-float v4, v1

    int-to-float v0, v0

    div-float v0, v4, v0

    .line 483
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 484
    int-to-float v5, v1

    div-float/2addr v5, v8

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v8

    sub-float/2addr v5, v6

    .line 485
    int-to-float v6, v1

    div-float/2addr v6, v8

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v8

    sub-float/2addr v6, v7

    .line 486
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 487
    int-to-float v5, v1

    div-float/2addr v5, v8

    int-to-float v1, v1

    div-float/2addr v1, v8

    invoke-virtual {v4, v0, v0, v5, v1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 488
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x3

    invoke-direct {v0, v10, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 489
    invoke-virtual {v3, v10, v9, v9, v9}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 490
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v3, p1, v4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 491
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 493
    return-object v2

    .line 481
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/roidapp/videolib/core/b;->v:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/b;Lcom/roidapp/videolib/core/i;)Lcom/roidapp/videolib/core/i;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/roidapp/videolib/core/b;->x:Lcom/roidapp/videolib/core/i;

    return-object p1
.end method

.method private a(Lcom/roidapp/videolib/core/a/a;)Ljava/lang/Boolean;
    .locals 14

    .prologue
    const/4 v13, 0x0

    .line 766
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->l:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 767
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->l:Landroid/content/Context;

    const-string v1, "tmp_video.mp4"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->m:Ljava/lang/String;

    .line 771
    :try_start_0
    new-instance v1, Lcom/a/a/a;

    invoke-direct {v1}, Lcom/a/a/a;-><init>()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 780
    :try_start_1
    iget-object v2, p0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roidapp/videolib/core/a/a;->b()Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-virtual {p1}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v6

    invoke-virtual {p1}, Lcom/roidapp/videolib/core/a/a;->e()I

    move-result v7

    const-wide/high16 v8, 0x402e000000000000L    # 15.0

    const/16 v10, 0x64

    const-wide/32 v11, 0xf4240

    invoke-virtual/range {v1 .. v12}, Lcom/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;JIIDIJ)I

    .line 782
    const/16 v0, 0x280

    const/16 v2, 0x280

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    move v0, v13

    .line 784
    :goto_0
    const/16 v3, 0xf

    if-ge v0, v3, :cond_0

    .line 785
    invoke-virtual {v1, v2}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 784
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 772
    :catch_0
    move-exception v0

    .line 773
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 774
    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    .line 775
    const v0, 0xee07

    iput v0, p0, Lcom/roidapp/videolib/core/b;->b:I

    .line 776
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 807
    :goto_1
    return-object v0

    .line 788
    :cond_0
    :try_start_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 791
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 798
    const/4 v2, 0x1

    :try_start_3
    invoke-virtual {v1, v2}, Lcom/a/a/a;->b(Z)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    .line 799
    :catch_1
    move-exception v1

    .line 800
    iput-object v1, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto :goto_1

    .line 792
    :catch_2
    move-exception v0

    .line 793
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 794
    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 798
    const/4 v0, 0x1

    :try_start_5
    invoke-virtual {v1, v0}, Lcom/a/a/a;->b(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 807
    :cond_1
    :goto_2
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    .line 799
    :catch_3
    move-exception v0

    .line 800
    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto :goto_2

    .line 796
    :catchall_0
    move-exception v0

    .line 798
    const/4 v2, 0x1

    :try_start_6
    invoke-virtual {v1, v2}, Lcom/a/a/a;->b(Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 802
    :goto_3
    throw v0

    .line 799
    :catch_4
    move-exception v1

    .line 800
    iput-object v1, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto :goto_3
.end method

.method private varargs a([Lcom/roidapp/videolib/core/a/a;)Ljava/lang/Boolean;
    .locals 28

    .prologue
    .line 547
    if-eqz p1, :cond_1e

    move-object/from16 v0, p1

    array-length v2, v0

    if-lez v2, :cond_1e

    .line 548
    const/4 v2, 0x0

    aget-object v2, p1, v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    .line 550
    const-string v2, "test"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v3}, Lcom/roidapp/videolib/core/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 551
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/roidapp/videolib/core/b;->a(Lcom/roidapp/videolib/core/a/a;)Ljava/lang/Boolean;

    move-result-object v2

    .line 762
    :goto_0
    return-object v2

    .line 554
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->c()[Ljava/lang/String;

    move-result-object v2

    .line 556
    if-eqz v2, :cond_1

    array-length v2, v2

    if-nez v2, :cond_2

    .line 557
    :cond_1
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    .line 559
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 560
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    .line 568
    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->g()J

    move-result-wide v2

    long-to-float v2, v2

    const v3, 0x49742400    # 1000000.0f

    div-float/2addr v2, v3

    .line 571
    const/high16 v3, 0x41a00000    # 20.0f

    mul-float/2addr v2, v3

    float-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v4

    double-to-int v0, v2

    move/from16 v20, v0

    .line 572
    const/4 v2, 0x0

    const/4 v3, 0x3

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/roidapp/videolib/core/b;->a(II)V

    .line 573
    const/high16 v17, 0x40a00000    # 5.0f

    .line 577
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->e:Ljava/lang/String;

    .line 578
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->e:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 579
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->e:Ljava/lang/String;

    const/16 v3, 0x2f

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 580
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/b;->e:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 581
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/b;->e:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->e:Ljava/lang/String;

    .line 584
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->a()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    .line 586
    const/16 v16, 0x0

    .line 587
    const/4 v15, 0x0

    .line 589
    :try_start_0
    new-instance v3, Lcom/a/a/a;

    invoke-direct {v3}, Lcom/a/a/a;-><init>()V

    .line 590
    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lcom/a/a/a;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 600
    invoke-direct/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->c()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 601
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    if-eqz v2, :cond_5

    .line 602
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/e;->e()V

    .line 603
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    .line 606
    :cond_5
    new-instance v2, Lcom/roidapp/videolib/core/e;

    invoke-direct {v2}, Lcom/roidapp/videolib/core/e;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    .line 607
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->l()Lcom/roidapp/videolib/b/u;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/videolib/core/e;->b(Lcom/roidapp/videolib/b/u;)[Ljava/lang/String;

    move-result-object v4

    .line 608
    const/4 v2, 0x0

    :goto_1
    array-length v5, v4

    if-ge v2, v5, :cond_6

    .line 609
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/.video/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    aget-object v6, v4, v2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    .line 608
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 591
    :catch_0
    move-exception v2

    .line 592
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 593
    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    .line 596
    const v2, 0xee07

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/videolib/core/b;->b:I

    .line 597
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto/16 :goto_0

    .line 611
    :cond_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    invoke-virtual {v2, v4}, Lcom/roidapp/videolib/core/e;->a([Ljava/lang/String;)V

    .line 612
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/e;->b()I

    .line 619
    :cond_7
    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->h()I

    move-result v12

    .line 620
    const/4 v2, 0x4

    if-ne v12, v2, :cond_a

    .line 621
    invoke-static {}, Lcom/a/a/a;->b()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 622
    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Lcom/a/a/a;->a(Z)V

    .line 631
    :goto_2
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->b()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->f()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    mul-long/2addr v6, v8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->e()I

    move-result v9

    const-wide/high16 v10, 0x4034000000000000L    # 20.0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->g()J

    move-result-wide v13

    invoke-virtual/range {v3 .. v14}, Lcom/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;JIIDIJ)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/videolib/core/b;->c:I

    .line 633
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/videolib/core/b;->c:I

    if-eqz v2, :cond_e

    .line 634
    new-instance v2, Ljava/lang/Exception;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v5, v0, Lcom/roidapp/videolib/core/b;->c:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v5}, Lcom/roidapp/videolib/core/a/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "s:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v5}, Lcom/roidapp/videolib/core/a/a;->f()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v5}, Lcom/roidapp/videolib/core/a/a;->f()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    mul-long/2addr v6, v8

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v5}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v5}, Lcom/roidapp/videolib/core/a/a;->e()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ",20.0,"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v5}, Lcom/roidapp/videolib/core/a/a;->g()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    .line 635
    const v2, 0xee07

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/videolib/core/b;->b:I

    .line 636
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_b
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v2

    .line 741
    :try_start_2
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v4, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_d

    :cond_8
    const/4 v4, 0x1

    :goto_3
    invoke-virtual {v3, v4}, Lcom/a/a/a;->b(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0

    .line 742
    :catch_1
    move-exception v3

    .line 743
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto/16 :goto_0

    .line 624
    :cond_9
    const/16 v12, 0x22

    goto/16 :goto_2

    .line 625
    :cond_a
    const/4 v2, 0x1

    if-ne v12, v2, :cond_b

    .line 626
    const/16 v12, 0x1c

    goto/16 :goto_2

    .line 627
    :cond_b
    const/4 v2, 0x3

    if-ne v12, v2, :cond_c

    .line 628
    const/16 v12, 0x28

    goto/16 :goto_2

    .line 629
    :cond_c
    const/16 v12, 0x22

    goto/16 :goto_2

    .line 741
    :cond_d
    const/4 v4, 0x0

    goto :goto_3

    .line 639
    :cond_e
    const/high16 v2, 0x42b40000    # 90.0f

    move/from16 v0, v20

    int-to-float v4, v0

    div-float v4, v2, v4

    .line 640
    const/4 v2, 0x1

    .line 641
    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v5, v4, v5

    if-gez v5, :cond_31

    .line 642
    const/high16 v2, 0x3f800000    # 1.0f

    div-float/2addr v2, v4

    float-to-double v6, v2

    :try_start_3
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v2, v6

    .line 643
    int-to-float v5, v2

    mul-float/2addr v4, v5

    move/from16 v18, v2

    move/from16 v19, v4

    .line 647
    :goto_4
    const/4 v10, -0x1

    .line 650
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->g()Lcom/roidapp/videolib/b/u;

    move-result-object v2

    sget-object v4, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    if-ne v2, v4, :cond_11

    const/4 v7, 0x1

    .line 651
    :goto_5
    const/4 v2, 0x0

    const/4 v4, 0x5

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v4}, Lcom/roidapp/videolib/core/b;->a(II)V

    .line 654
    new-instance v5, Lcom/roidapp/videolib/b/m;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->l:Landroid/content/Context;

    invoke-direct {v5, v2}, Lcom/roidapp/videolib/b/m;-><init>(Landroid/content/Context;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_b
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 656
    :try_start_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    invoke-virtual {v5, v2}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/gl/f;)V

    .line 657
    new-instance v21, Lcom/roidapp/videolib/b/i;

    move-object/from16 v0, v21

    invoke-direct {v0, v5}, Lcom/roidapp/videolib/b/i;-><init>(Lcom/roidapp/videolib/b/m;)V

    .line 658
    const/4 v2, 0x1

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/i;->a(Z)V

    .line 660
    new-instance v6, Lcom/roidapp/videolib/gl/h;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v4}, Lcom/roidapp/videolib/core/a/a;->e()I

    move-result v4

    invoke-direct {v6, v2, v4}, Lcom/roidapp/videolib/gl/h;-><init>(II)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_c
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 662
    :try_start_5
    move-object/from16 v0, v21

    invoke-virtual {v6, v0}, Lcom/roidapp/videolib/gl/h;->a(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 663
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/videolib/core/b;->p:I

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/roidapp/videolib/core/b;->o:Z

    invoke-virtual {v5, v2, v4}, Lcom/roidapp/videolib/b/m;->a(IZ)V

    .line 664
    invoke-direct/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->c()Z

    move-result v2

    if-nez v2, :cond_f

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/roidapp/videolib/core/b;->f:Z

    if-nez v2, :cond_f

    .line 665
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    iget v4, v4, Lcom/roidapp/videolib/core/a/a;->l:F

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v4, v8

    sub-float/2addr v2, v4

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/i;->a(F)V

    .line 667
    :cond_f
    const-wide/16 v8, 0x0

    .line 670
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_12

    move/from16 v0, v20

    int-to-float v2, v0

    :goto_6
    float-to-int v0, v2

    move/from16 v22, v0

    .line 672
    invoke-direct/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->c()Z

    move-result v2

    if-eqz v2, :cond_13

    const/16 v2, 0x42

    move/from16 v16, v2

    .line 673
    :goto_7
    const/4 v4, 0x0

    .line 674
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v2

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v11}, Lcom/roidapp/videolib/core/a/a;->c()[Ljava/lang/String;

    move-result-object v11

    array-length v11, v11

    div-int/2addr v2, v11

    int-to-long v0, v2

    move-wide/from16 v24, v0

    .line 675
    const/4 v2, 0x0

    move-wide v12, v8

    move v14, v2

    move-object v11, v4

    move/from16 v2, v17

    :goto_8
    move/from16 v0, v20

    if-gt v14, v0, :cond_2b

    .line 676
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_15

    .line 677
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v2

    .line 741
    :try_start_6
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v4, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_14

    :cond_10
    const/4 v4, 0x1

    :goto_9
    invoke-virtual {v3, v4}, Lcom/a/a/a;->b(Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 748
    :goto_a
    invoke-virtual {v6}, Lcom/roidapp/videolib/gl/h;->b()V

    .line 752
    invoke-virtual {v5}, Lcom/roidapp/videolib/b/m;->c()V

    goto/16 :goto_0

    .line 650
    :cond_11
    const/4 v7, 0x0

    goto/16 :goto_5

    .line 670
    :cond_12
    move/from16 v0, v20

    int-to-float v2, v0

    const/high16 v4, 0x41a00000    # 20.0f

    sub-float/2addr v2, v4

    goto :goto_6

    .line 672
    :cond_13
    const/4 v2, 0x0

    move/from16 v16, v2

    goto :goto_7

    .line 741
    :cond_14
    const/4 v4, 0x0

    goto :goto_9

    .line 742
    :catch_2
    move-exception v3

    .line 743
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto :goto_a

    .line 679
    :cond_15
    :try_start_7
    move-object/from16 v0, v21

    invoke-virtual {v0, v12, v13}, Lcom/roidapp/videolib/b/i;->a(J)V

    .line 680
    move-object/from16 v0, v21

    invoke-virtual {v0, v12, v13}, Lcom/roidapp/videolib/b/i;->d(J)I

    move-result v9

    .line 682
    if-eq v9, v10, :cond_1a

    move/from16 v0, v22

    if-gt v14, v0, :cond_1a

    .line 683
    const/4 v8, 0x1

    .line 685
    const/4 v4, 0x0

    .line 690
    :goto_b
    if-nez v4, :cond_30

    .line 691
    invoke-virtual {v6}, Lcom/roidapp/videolib/gl/h;->a()Landroid/graphics/Bitmap;

    move-result-object v15

    .line 699
    :goto_c
    move/from16 v0, v16

    if-ne v14, v0, :cond_18

    .line 1499
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/baselib/f/b;->c()Ljava/lang/String;

    move-result-object v4

    .line 1500
    if-eqz v4, :cond_18

    .line 1502
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1503
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v11

    if-nez v11, :cond_16

    .line 1504
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    move-result v10

    if-eqz v10, :cond_18

    .line 1509
    :cond_16
    new-instance v10, Ljava/io/File;

    const-string v11, "coverTemp.jpg"

    invoke-direct {v10, v4, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1510
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_17

    .line 1511
    invoke-virtual {v10}, Ljava/io/File;->delete()Z
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1514
    :cond_17
    :try_start_8
    invoke-virtual {v10}, Ljava/io/File;->createNewFile()Z
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1520
    :try_start_9
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 1521
    sget-object v10, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v11, 0x32

    invoke-virtual {v15, v10, v11, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 1522
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 1523
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 704
    :cond_18
    :goto_d
    :try_start_a
    invoke-virtual {v3, v15, v8}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;Z)I

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lcom/roidapp/videolib/core/b;->c:I

    .line 710
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/videolib/core/b;->c:I

    if-eqz v4, :cond_23

    .line 711
    const v2, 0xee05

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/videolib/core/b;->b:I

    .line 712
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result-object v2

    .line 741
    :try_start_b
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v4, :cond_19

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_22

    :cond_19
    const/4 v4, 0x1

    :goto_e
    invoke-virtual {v3, v4}, Lcom/a/a/a;->b(Z)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    .line 748
    :goto_f
    invoke-virtual {v6}, Lcom/roidapp/videolib/gl/h;->b()V

    .line 752
    invoke-virtual {v5}, Lcom/roidapp/videolib/b/m;->c()V

    goto/16 :goto_0

    .line 687
    :cond_1a
    const/4 v8, 0x0

    .line 688
    move/from16 v0, v22

    if-le v14, v0, :cond_1b

    const/4 v4, 0x0

    move v9, v10

    goto/16 :goto_b

    :cond_1b
    move v4, v7

    move v9, v10

    goto/16 :goto_b

    .line 1516
    :catch_3
    move-exception v4

    :try_start_c
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_d

    .line 735
    :catch_4
    move-exception v2

    move-object v4, v5

    move-object v5, v6

    .line 736
    :goto_10
    :try_start_d
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 737
    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 741
    :try_start_e
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v2, :cond_1c

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_2e

    :cond_1c
    const/4 v2, 0x1

    :goto_11
    invoke-virtual {v3, v2}, Lcom/a/a/a;->b(Z)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9

    .line 747
    :goto_12
    if-eqz v5, :cond_1d

    .line 748
    invoke-virtual {v5}, Lcom/roidapp/videolib/gl/h;->b()V

    .line 751
    :cond_1d
    if-eqz v4, :cond_1e

    .line 752
    invoke-virtual {v4}, Lcom/roidapp/videolib/b/m;->c()V

    .line 760
    :cond_1e
    const/4 v2, -0x1

    const/16 v3, 0x64

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/roidapp/videolib/core/b;->a(II)V

    .line 762
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto/16 :goto_0

    .line 1526
    :catch_5
    move-exception v4

    :try_start_f
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V
    :try_end_f
    .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_4
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto :goto_d

    .line 739
    :catchall_0
    move-exception v2

    move-object v15, v5

    move-object/from16 v16, v6

    .line 741
    :goto_13
    :try_start_10
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v4, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_2f

    :cond_1f
    const/4 v4, 0x1

    :goto_14
    invoke-virtual {v3, v4}, Lcom/a/a/a;->b(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_a

    .line 747
    :goto_15
    if-eqz v16, :cond_20

    .line 748
    invoke-virtual/range {v16 .. v16}, Lcom/roidapp/videolib/gl/h;->b()V

    .line 751
    :cond_20
    if-eqz v15, :cond_21

    .line 752
    invoke-virtual {v15}, Lcom/roidapp/videolib/b/m;->c()V

    .line 753
    :cond_21
    throw v2

    .line 741
    :cond_22
    const/4 v4, 0x0

    goto :goto_e

    .line 742
    :catch_6
    move-exception v3

    .line 743
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto :goto_f

    .line 715
    :cond_23
    :try_start_11
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_26

    .line 716
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->recycle()V

    .line 717
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_11
    .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_4
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    move-result-object v2

    .line 741
    :try_start_12
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v4, :cond_24

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_25

    :cond_24
    const/4 v4, 0x1

    :goto_16
    invoke-virtual {v3, v4}, Lcom/a/a/a;->b(Z)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_7

    .line 748
    :goto_17
    invoke-virtual {v6}, Lcom/roidapp/videolib/gl/h;->b()V

    .line 752
    invoke-virtual {v5}, Lcom/roidapp/videolib/b/m;->c()V

    goto/16 :goto_0

    .line 741
    :cond_25
    const/4 v4, 0x0

    goto :goto_16

    .line 742
    :catch_7
    move-exception v3

    .line 743
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto :goto_17

    .line 720
    :cond_26
    const-wide/16 v10, 0x32

    add-long/2addr v10, v12

    .line 722
    move/from16 v0, v22

    if-le v14, v0, :cond_27

    :try_start_13
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v4}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v4

    add-int/lit16 v4, v4, -0x3e8

    int-to-long v12, v4

    cmp-long v4, v10, v12

    if-gez v4, :cond_27

    .line 723
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v4}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v4

    add-int/lit16 v4, v4, -0x3e8

    int-to-long v10, v4

    .line 725
    :cond_27
    add-int/lit8 v4, v20, -0x1

    if-ne v14, v4, :cond_28

    .line 726
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->h:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v4}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v4

    int-to-long v10, v4

    .line 728
    :cond_28
    const/4 v4, 0x1

    move/from16 v0, v18

    if-le v0, v4, :cond_29

    rem-int v4, v14, v18

    if-nez v4, :cond_2a

    .line 729
    :cond_29
    div-long v12, v10, v24

    const-wide/16 v26, 0x1

    add-long v12, v12, v26

    long-to-int v4, v12

    add-float v2, v2, v19

    float-to-int v8, v2

    move-object/from16 v0, p0

    invoke-direct {v0, v4, v8}, Lcom/roidapp/videolib/core/b;->a(II)V

    .line 675
    :cond_2a
    add-int/lit8 v4, v14, 0x1

    move-wide v12, v10

    move v14, v4

    move-object v11, v15

    move v10, v9

    goto/16 :goto_8

    .line 734
    :cond_2b
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_13
    .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    move-result-object v2

    .line 741
    :try_start_14
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v4, :cond_2c

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_2d

    :cond_2c
    const/4 v4, 0x1

    :goto_18
    invoke-virtual {v3, v4}, Lcom/a/a/a;->b(Z)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_8

    .line 748
    :goto_19
    invoke-virtual {v6}, Lcom/roidapp/videolib/gl/h;->b()V

    .line 752
    invoke-virtual {v5}, Lcom/roidapp/videolib/b/m;->c()V

    goto/16 :goto_0

    .line 741
    :cond_2d
    const/4 v4, 0x0

    goto :goto_18

    .line 742
    :catch_8
    move-exception v3

    .line 743
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto :goto_19

    .line 741
    :cond_2e
    const/4 v2, 0x0

    goto/16 :goto_11

    .line 742
    :catch_9
    move-exception v2

    .line 743
    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto/16 :goto_12

    .line 741
    :cond_2f
    const/4 v4, 0x0

    goto/16 :goto_14

    .line 742
    :catch_a
    move-exception v3

    .line 743
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    goto/16 :goto_15

    .line 739
    :catchall_1
    move-exception v2

    goto/16 :goto_13

    :catchall_2
    move-exception v2

    move-object v15, v5

    goto/16 :goto_13

    :catchall_3
    move-exception v2

    move-object v15, v4

    move-object/from16 v16, v5

    goto/16 :goto_13

    .line 735
    :catch_b
    move-exception v2

    move-object v4, v15

    move-object/from16 v5, v16

    goto/16 :goto_10

    :catch_c
    move-exception v2

    move-object v4, v5

    move-object/from16 v5, v16

    goto/16 :goto_10

    :cond_30
    move-object v15, v11

    goto/16 :goto_c

    :cond_31
    move/from16 v18, v2

    move/from16 v19, v4

    goto/16 :goto_4
.end method

.method private a(II)V
    .locals 6

    .prologue
    .line 831
    iget v0, p0, Lcom/roidapp/videolib/core/b;->q:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Lcom/roidapp/videolib/core/b;->r:I

    if-ne p2, v0, :cond_1

    .line 838
    :cond_0
    :goto_0
    return-void

    .line 833
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 834
    iget-wide v2, p0, Lcom/roidapp/videolib/core/b;->s:J

    sub-long v2, v0, v2

    iget-wide v4, p0, Lcom/roidapp/videolib/core/b;->t:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 835
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v2}, Lcom/roidapp/videolib/core/b;->publishProgress([Ljava/lang/Object;)V

    .line 836
    iput-wide v0, p0, Lcom/roidapp/videolib/core/b;->s:J

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/b;)Z
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/roidapp/videolib/core/b;->c()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/videolib/core/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/roidapp/videolib/core/b;->u:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/i;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->x:Lcom/roidapp/videolib/core/i;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    return-object v0
.end method

.method private c()Z
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    if-nez v0, :cond_0

    .line 101
    const/4 v0, 0x0

    .line 103
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->l()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/videolib/core/b;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->v:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 811
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 812
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 813
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 814
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 817
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->m:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 818
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/videolib/core/b;->m:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 819
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/roidapp/videolib/core/b;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->u:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/videolib/core/b;)F
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/roidapp/videolib/core/b;->w:F

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 924
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/core/b;->cancel(Z)Z

    .line 925
    return-void
.end method

.method public final a(ZLcom/roidapp/videolib/core/a/a;Lcom/roidapp/videolib/core/a/b;)V
    .locals 5

    .prologue
    .line 902
    iput-boolean p1, p0, Lcom/roidapp/videolib/core/b;->f:Z

    .line 903
    iput-object p3, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    .line 904
    iget-boolean v0, p2, Lcom/roidapp/videolib/core/a/a;->n:Z

    iput-boolean v0, p0, Lcom/roidapp/videolib/core/b;->g:Z

    .line 906
    invoke-virtual {p2}, Lcom/roidapp/videolib/core/a/a;->j()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/videolib/core/b;->n:Z

    .line 907
    iget-boolean v0, p2, Lcom/roidapp/videolib/core/a/a;->p:Z

    iput-boolean v0, p0, Lcom/roidapp/videolib/core/b;->o:Z

    .line 908
    iget v0, p2, Lcom/roidapp/videolib/core/a/a;->q:I

    iput v0, p0, Lcom/roidapp/videolib/core/b;->p:I

    .line 910
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    iget-object v1, p2, Lcom/roidapp/videolib/core/a/a;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/f/b;->a(Ljava/lang/String;)V

    .line 911
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    invoke-virtual {p2}, Lcom/roidapp/videolib/core/a/a;->j()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/f/b;->b(Z)V

    .line 912
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/videolib/core/b;->l:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/f/b;->a(Landroid/content/Context;)V

    .line 913
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    iget v1, p2, Lcom/roidapp/videolib/core/a/a;->a:I

    iget v2, p2, Lcom/roidapp/videolib/core/a/a;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/baselib/f/b;->a(II)V

    .line 914
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    iget v1, p2, Lcom/roidapp/videolib/core/a/a;->e:I

    iget v2, p2, Lcom/roidapp/videolib/core/a/a;->f:I

    iget v3, p2, Lcom/roidapp/videolib/core/a/a;->g:I

    iget v4, p2, Lcom/roidapp/videolib/core/a/a;->h:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/baselib/f/b;->a(IIII)V

    .line 916
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    iget v1, p2, Lcom/roidapp/videolib/core/a/a;->i:F

    iget v2, p2, Lcom/roidapp/videolib/core/a/a;->j:F

    iget v3, p2, Lcom/roidapp/videolib/core/a/a;->c:F

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/baselib/f/b;->a(FFF)V

    .line 917
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    iget v1, p2, Lcom/roidapp/videolib/core/a/a;->k:F

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/f/b;->a(F)V

    .line 918
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roidapp/videolib/core/b;->g:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/f/b;->a(Z)V

    .line 919
    sget-object v0, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/roidapp/videolib/core/a/a;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/videolib/core/b;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 920
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 929
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    .line 930
    invoke-static {}, Lcom/roidapp/baselib/a/a;->b()V

    .line 931
    invoke-static {}, Lcom/roidapp/baselib/f/b;->b()V

    .line 932
    invoke-static {}, Lcom/roidapp/videolib/core/l;->b()V

    .line 933
    return-void
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    check-cast p1, [Lcom/roidapp/videolib/core/a/a;

    invoke-direct {p0, p1}, Lcom/roidapp/videolib/core/b;->a([Lcom/roidapp/videolib/core/a/a;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final f(I)Lcom/roidapp/videolib/gl/a;
    .locals 11

    .prologue
    .line 151
    invoke-direct {p0}, Lcom/roidapp/videolib/core/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->c()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->c()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->c()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    rem-int/2addr p1, v0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->c()[Ljava/lang/String;

    move-result-object v0

    .line 160
    new-instance v1, Lcom/roidapp/videolib/gl/a;

    invoke-direct {v1}, Lcom/roidapp/videolib/gl/a;-><init>()V

    .line 161
    aget-object v0, v0, p1

    iget-object v2, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v3}, Lcom/roidapp/videolib/core/a/a;->e()I

    move-result v3

    const/4 v4, 0x0

    iget-boolean v5, p0, Lcom/roidapp/videolib/core/b;->n:Z

    invoke-static {v0, v2, v3, v4, v5}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 162
    if-nez v3, :cond_1

    .line 163
    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    move-object v0, v1

    .line 204
    :goto_0
    return-object v0

    .line 166
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    iget v4, v0, Lcom/roidapp/videolib/core/a/a;->k:F

    .line 1107
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 1108
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    .line 1109
    if-le v5, v6, :cond_2

    const/4 v0, 0x1

    .line 1111
    :goto_1
    if-eqz v0, :cond_3

    .line 1112
    int-to-float v0, v5

    iget-object v2, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 1116
    :goto_2
    int-to-float v2, v6

    div-float v7, v2, v0

    .line 1117
    int-to-float v2, v5

    div-float v0, v2, v0

    .line 1118
    iget-object v2, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v2

    int-to-float v2, v2

    div-float v2, v0, v2

    .line 1119
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v0

    int-to-float v0, v0

    div-float v0, v7, v0

    .line 1120
    cmpl-float v7, v2, v0

    if-lez v7, :cond_4

    .line 1121
    :goto_3
    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, v0, v7

    sub-float/2addr v2, v7

    .line 1122
    add-float v7, v2, v0

    .line 1123
    const/high16 v8, 0x3f000000    # 0.5f

    const/high16 v9, 0x40000000    # 2.0f

    div-float v9, v0, v9

    sub-float/2addr v8, v9

    .line 1124
    add-float/2addr v0, v8

    .line 1125
    const/4 v9, 0x0

    cmpl-float v9, v4, v9

    if-lez v9, :cond_5

    .line 1126
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    int-to-float v5, v5

    .line 1127
    const/high16 v6, 0x42c80000    # 100.0f

    div-float/2addr v4, v6

    const v6, 0x3f75c28f    # 0.96f

    mul-float/2addr v6, v5

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v6, v9

    mul-float/2addr v4, v6

    .line 1129
    const v6, 0x3ed3f7cf    # 0.414f

    mul-float/2addr v4, v6

    const v6, 0x3fb4fdf4    # 1.414f

    mul-float/2addr v5, v6

    div-float/2addr v4, v5

    .line 1130
    const/16 v5, 0x8

    new-array v5, v5, [F

    const/4 v6, 0x0

    add-float v9, v2, v4

    const v10, 0x3c23d70a    # 0.01f

    add-float/2addr v9, v10

    aput v9, v5, v6

    const/4 v6, 0x1

    sub-float v9, v0, v4

    const v10, 0x3c23d70a    # 0.01f

    sub-float/2addr v9, v10

    aput v9, v5, v6

    const/4 v6, 0x2

    sub-float v9, v7, v4

    const v10, 0x3c23d70a    # 0.01f

    sub-float/2addr v9, v10

    aput v9, v5, v6

    const/4 v6, 0x3

    sub-float/2addr v0, v4

    const v9, 0x3c23d70a    # 0.01f

    sub-float/2addr v0, v9

    aput v0, v5, v6

    const/4 v0, 0x4

    add-float/2addr v2, v4

    const v6, 0x3c23d70a    # 0.01f

    add-float/2addr v2, v6

    aput v2, v5, v0

    const/4 v0, 0x5

    add-float v2, v8, v4

    const v6, 0x3c23d70a    # 0.01f

    add-float/2addr v2, v6

    aput v2, v5, v0

    const/4 v0, 0x6

    sub-float v2, v7, v4

    const v6, 0x3c23d70a    # 0.01f

    sub-float/2addr v2, v6

    aput v2, v5, v0

    const/4 v0, 0x7

    add-float v2, v8, v4

    const v4, 0x3c23d70a    # 0.01f

    add-float/2addr v2, v4

    aput v2, v5, v0

    .line 1136
    iput-object v5, v1, Lcom/roidapp/videolib/gl/a;->c:[F

    .line 167
    :goto_4
    invoke-direct {p0}, Lcom/roidapp/videolib/core/b;->c()Z

    move-result v0

    if-nez v0, :cond_7

    iget-boolean v0, p0, Lcom/roidapp/videolib/core/b;->f:Z

    if-nez v0, :cond_7

    .line 170
    new-instance v0, Landroid/graphics/BitmapShader;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v4, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v3, v2, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 171
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v4, v5}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 172
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 173
    new-instance v5, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-direct {v5, v6, v7}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 174
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 175
    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 176
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 177
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 178
    const/4 v6, 0x0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 179
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 180
    new-instance v6, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v7, Landroid/graphics/drawable/shapes/PathShape;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    invoke-direct {v7, v5, v8, v9}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-direct {v6, v7}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 181
    iget-object v5, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    iget v5, v5, Lcom/roidapp/videolib/core/a/a;->k:F

    const/high16 v7, 0x42c80000    # 100.0f

    div-float/2addr v5, v7

    const v7, 0x3f75c28f    # 0.96f

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    mul-float/2addr v5, v7

    .line 182
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v7

    new-instance v8, Landroid/graphics/CornerPathEffect;

    iget-object v9, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    iget v9, v9, Lcom/roidapp/videolib/core/a/a;->d:F

    mul-float/2addr v5, v9

    invoke-direct {v8, v5}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 183
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 184
    const/4 v0, 0x0

    const/4 v5, 0x0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v6, v0, v5, v7, v3}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 185
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 188
    iget-boolean v0, p0, Lcom/roidapp/videolib/core/b;->n:Z

    if-nez v0, :cond_6

    .line 189
    invoke-direct {p0, v2}, Lcom/roidapp/videolib/core/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 193
    :goto_5
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    move-object v0, v1

    .line 196
    goto/16 :goto_0

    .line 1109
    :cond_2
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 1114
    :cond_3
    int-to-float v0, v6

    iget-object v2, p0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    goto/16 :goto_2

    :cond_4
    move v0, v2

    .line 1120
    goto/16 :goto_3

    .line 1138
    :cond_5
    const/16 v4, 0x8

    new-array v4, v4, [F

    const/4 v5, 0x0

    const v6, 0x3c23d70a    # 0.01f

    add-float/2addr v6, v2

    aput v6, v4, v5

    const/4 v5, 0x1

    const v6, 0x3c23d70a    # 0.01f

    sub-float v6, v0, v6

    aput v6, v4, v5

    const/4 v5, 0x2

    const v6, 0x3c23d70a    # 0.01f

    sub-float v6, v7, v6

    aput v6, v4, v5

    const/4 v5, 0x3

    const v6, 0x3c23d70a    # 0.01f

    sub-float/2addr v0, v6

    aput v0, v4, v5

    const/4 v0, 0x4

    const v5, 0x3c23d70a    # 0.01f

    add-float/2addr v2, v5

    aput v2, v4, v0

    const/4 v0, 0x5

    const v2, 0x3c23d70a    # 0.01f

    add-float/2addr v2, v8

    aput v2, v4, v0

    const/4 v0, 0x6

    const v2, 0x3c23d70a    # 0.01f

    sub-float v2, v7, v2

    aput v2, v4, v0

    const/4 v0, 0x7

    const v2, 0x3c23d70a    # 0.01f

    add-float/2addr v2, v8

    aput v2, v4, v0

    .line 1145
    iput-object v4, v1, Lcom/roidapp/videolib/gl/a;->c:[F

    goto/16 :goto_4

    .line 191
    :cond_6
    iput-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    goto :goto_5

    .line 198
    :cond_7
    iget-boolean v0, p0, Lcom/roidapp/videolib/core/b;->n:Z

    if-nez v0, :cond_8

    .line 199
    invoke-direct {p0, v3}, Lcom/roidapp/videolib/core/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 203
    :goto_6
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    move-object v0, v1

    .line 204
    goto/16 :goto_0

    .line 201
    :cond_8
    iput-object v3, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    goto :goto_6
.end method

.method protected final onCancelled()V
    .locals 1

    .prologue
    .line 849
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onCancelled()V

    .line 850
    invoke-direct {p0}, Lcom/roidapp/videolib/core/b;->d()V

    .line 851
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    if-eqz v0, :cond_0

    .line 852
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/b;->b()V

    .line 853
    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 59
    check-cast p1, Ljava/lang/Boolean;

    .line 1857
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onPostExecute(Ljava/lang/Object;)V

    .line 1859
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->x:Lcom/roidapp/videolib/core/i;

    if-eqz v0, :cond_0

    .line 1860
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->x:Lcom/roidapp/videolib/core/i;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/i;->b()V

    .line 1863
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->v:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 1864
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1865
    iput-object v4, p0, Lcom/roidapp/videolib/core/b;->v:Landroid/graphics/Bitmap;

    .line 1868
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    if-eqz v0, :cond_2

    .line 1869
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/e;->e()V

    .line 1870
    iput-object v4, p0, Lcom/roidapp/videolib/core/b;->y:Lcom/roidapp/videolib/core/e;

    .line 1873
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->m:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 1874
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/videolib/core/b;->m:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 1876
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/videolib/core/b;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    if-eqz v0, :cond_4

    .line 1877
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1878
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    iget-object v1, p0, Lcom/roidapp/videolib/core/b;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/roidapp/videolib/core/a/b;->a(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void

    .line 1881
    :cond_5
    invoke-direct {p0}, Lcom/roidapp/videolib/core/b;->d()V

    .line 1883
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v0, :cond_6

    iget v0, p0, Lcom/roidapp/videolib/core/b;->c:I

    if-eqz v0, :cond_6

    .line 1884
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "native error code : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/roidapp/videolib/core/b;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",audio="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/videolib/core/b;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    .line 1886
    :cond_6
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->l:Landroid/content/Context;

    if-eqz v0, :cond_7

    .line 1887
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Video/Encode/Error:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1889
    :cond_7
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    iget v1, p0, Lcom/roidapp/videolib/core/b;->b:I

    iget v2, p0, Lcom/roidapp/videolib/core/b;->c:I

    iget-object v3, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v3, :cond_8

    move-object v3, v4

    :goto_1
    iget-object v5, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    if-nez v5, :cond_9

    :goto_2
    iget-object v5, p0, Lcom/roidapp/videolib/core/b;->k:Ljava/lang/String;

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/videolib/core/a/b;->a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    iget-object v3, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_9
    iget-object v4, p0, Lcom/roidapp/videolib/core/b;->d:Ljava/lang/Throwable;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    goto :goto_2
.end method

.method protected final onPreExecute()V
    .locals 2

    .prologue
    .line 823
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 825
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    if-eqz v0, :cond_0

    .line 826
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/b;->a()V

    .line 827
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/roidapp/videolib/core/b;->a(II)V

    .line 828
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 59
    check-cast p1, [Ljava/lang/Integer;

    .line 1842
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onProgressUpdate([Ljava/lang/Object;)V

    .line 1843
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    if-le v0, v2, :cond_0

    .line 1844
    iget-object v0, p0, Lcom/roidapp/videolib/core/b;->j:Lcom/roidapp/videolib/core/a/b;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v2, p1, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/roidapp/videolib/core/a/b;->a(II)V

    .line 59
    :cond_0
    return-void
.end method
