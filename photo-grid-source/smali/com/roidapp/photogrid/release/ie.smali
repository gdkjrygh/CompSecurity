.class public final Lcom/roidapp/photogrid/release/ie;
.super Lcom/roidapp/photogrid/release/ap;
.source "SourceFile"


# instance fields
.field private A:Lcom/roidapp/photogrid/release/PhotoView;

.field private B:Lcom/roidapp/photogrid/release/az;

.field private C:Ljava/lang/String;

.field private D:Z

.field private E:Z

.field private a:I

.field private b:I

.field private c:Landroid/content/Context;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Landroid/graphics/Bitmap;

.field private i:Landroid/graphics/Bitmap;

.field private j:Landroid/graphics/Bitmap;

.field private k:Landroid/graphics/Bitmap;

.field private l:I

.field private m:I

.field private n:I

.field private final o:I

.field private p:F

.field private q:Z

.field private r:Z

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:[Lcom/roidapp/photogrid/release/ig;

.field private u:F

.field private v:F

.field private w:F

.field private final x:F

.field private y:I

.field private z:Lcom/roidapp/photogrid/release/ml;


# direct methods
.method public constructor <init>(Landroid/content/Context;II[Lcom/roidapp/photogrid/release/ig;ILcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 84
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ap;-><init>()V

    .line 54
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    .line 58
    const/16 v0, 0x500

    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->o:I

    .line 60
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ie;->q:Z

    .line 61
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ie;->r:Z

    .line 66
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->x:F

    .line 74
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    .line 81
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ie;->E:Z

    .line 85
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    .line 86
    iput p2, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    .line 87
    iput p3, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    .line 88
    iput-object p4, p0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    .line 89
    iput p5, p0, Lcom/roidapp/photogrid/release/ie;->y:I

    .line 90
    iput-object p6, p0, Lcom/roidapp/photogrid/release/ie;->z:Lcom/roidapp/photogrid/release/ml;

    .line 91
    iput-object p7, p0, Lcom/roidapp/photogrid/release/ie;->A:Lcom/roidapp/photogrid/release/PhotoView;

    .line 92
    iput-object p8, p0, Lcom/roidapp/photogrid/release/ie;->B:Lcom/roidapp/photogrid/release/az;

    .line 3107
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 3123
    :goto_0
    :pswitch_0
    return-void

    .line 3109
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    goto :goto_0

    .line 3112
    :pswitch_2
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    goto :goto_0

    .line 3115
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3116
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    goto :goto_0

    .line 3118
    :cond_0
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    goto :goto_0

    .line 3122
    :pswitch_4
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    goto :goto_0

    .line 3125
    :pswitch_5
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    goto :goto_0

    .line 3107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static a(Lcom/roidapp/photogrid/release/lc;FF)Landroid/graphics/Path;
    .locals 12

    .prologue
    const/4 v3, 0x0

    const/high16 v11, 0x42c80000    # 100.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 1291
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 1293
    iget-object v5, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 1294
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 1295
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 1296
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v8, v0, Landroid/graphics/PointF;->y:F

    .line 1298
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 1299
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 1301
    cmpg-float v3, v2, v7

    if-gez v3, :cond_4

    .line 1302
    mul-float/2addr v2, p1

    div-float/2addr v2, v11

    sub-float/2addr v2, v10

    .line 1306
    :goto_0
    cmpg-float v3, v0, v8

    if-gez v3, :cond_5

    .line 1307
    mul-float/2addr v0, p2

    div-float/2addr v0, v11

    sub-float/2addr v0, v10

    .line 1314
    :goto_1
    cmpg-float v3, v2, v1

    if-gez v3, :cond_0

    move v2, v1

    .line 1317
    :cond_0
    cmpg-float v3, v0, v1

    if-gez v3, :cond_1

    move v0, v1

    .line 1320
    :cond_1
    invoke-virtual {v4, v2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1322
    const/4 v0, 0x1

    move v3, v0

    :goto_2
    if-ge v3, v6, :cond_8

    .line 1323
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 1324
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 1325
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 1327
    cmpg-float v9, v2, v7

    if-gez v9, :cond_6

    .line 1328
    mul-float/2addr v2, p1

    div-float/2addr v2, v11

    sub-float/2addr v2, v10

    .line 1332
    :goto_3
    cmpg-float v9, v0, v8

    if-gez v9, :cond_7

    .line 1333
    mul-float/2addr v0, p2

    div-float/2addr v0, v11

    sub-float/2addr v0, v10

    .line 1338
    :goto_4
    cmpg-float v9, v2, v1

    if-gez v9, :cond_2

    move v2, v1

    .line 1341
    :cond_2
    cmpg-float v9, v0, v1

    if-gez v9, :cond_3

    move v0, v1

    .line 1344
    :cond_3
    invoke-virtual {v4, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1322
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    .line 1304
    :cond_4
    mul-float/2addr v2, p1

    div-float/2addr v2, v11

    add-float/2addr v2, v10

    goto :goto_0

    .line 1309
    :cond_5
    mul-float/2addr v0, p2

    div-float/2addr v0, v11

    add-float/2addr v0, v10

    goto :goto_1

    .line 1330
    :cond_6
    mul-float/2addr v2, p1

    div-float/2addr v2, v11

    add-float/2addr v2, v10

    goto :goto_3

    .line 1335
    :cond_7
    mul-float/2addr v0, p2

    div-float/2addr v0, v11

    add-float/2addr v0, v10

    goto :goto_4

    .line 1346
    :cond_8
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 1347
    return-object v4
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->z:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 280
    return-void
.end method

.method private varargs a(II[I)V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v0, 0x1

    .line 187
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 188
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 189
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    float-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, v2, v4

    if-gez v2, :cond_2

    .line 190
    if-eqz p1, :cond_1

    .line 191
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->a:[I

    aget v3, v3, p1

    .line 3482
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 191
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    .line 192
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->c:[I

    aget v3, v3, p1

    .line 4482
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 192
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    .line 193
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->b:[I

    aget v3, v3, p1

    .line 5482
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 193
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    .line 212
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    if-nez v2, :cond_4

    .line 213
    :cond_0
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 274
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save create bg oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 195
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 6482
    const v3, 0x7f0200b1

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 195
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    .line 196
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 7482
    const v3, 0x7f0200ad

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 196
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    .line 197
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 8482
    const v3, 0x7f0200af

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 197
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 200
    :cond_2
    if-eqz p1, :cond_3

    .line 201
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->a:[I

    aget v3, v3, p1

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    .line 202
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->c:[I

    aget v3, v3, p1

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    .line 203
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->b:[I

    aget v3, v3, p1

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    goto/16 :goto_0

    .line 205
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    const v3, 0x7f0200b1

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    .line 206
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    const v3, 0x7f0200ad

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    .line 207
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    const v3, 0x7f0200af

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    goto/16 :goto_0

    .line 215
    :cond_4
    const/16 v2, -0x14

    if-eq p2, v2, :cond_7

    .line 216
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    .line 217
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    if-nez v2, :cond_5

    .line 218
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-1 throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_5
    new-instance v2, Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 221
    invoke-virtual {v2, p2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 222
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 233
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    if-nez v2, :cond_6

    .line 234
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v4, 0x4

    aget-object v3, v3, v4

    const/4 v4, 0x4

    aget v3, v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    .line 237
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    if-nez v1, :cond_b

    .line 238
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-2  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_7
    array-length v2, p3

    if-ne v2, v0, :cond_8

    .line 224
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->d:[I

    const/4 v4, 0x0

    aget v4, p3, v4

    aget v3, v3, v4

    .line 9482
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 224
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 226
    :cond_8
    const/4 v2, 0x0

    aget v2, p3, v2

    if-lt v2, v6, :cond_9

    const/4 v2, 0x0

    aget v2, p3, v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->j:[[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    if-le v2, v3, :cond_a

    .line 227
    :cond_9
    const/4 v2, 0x0

    const/4 v3, 0x2

    aput v3, p3, v2

    .line 228
    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, p3, v2

    .line 230
    :cond_a
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

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

    .line 10482
    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 230
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    goto/16 :goto_1

    .line 240
    :cond_b
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->p:F

    .line 10590
    invoke-static {v1, v2, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 240
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    .line 243
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    if-nez v1, :cond_c

    .line 244
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-3  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_c
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    if-le v1, v2, :cond_11

    .line 247
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_d

    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_2
    iput v1, p0, Lcom/roidapp/photogrid/release/ie;->m:I

    .line 248
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_e

    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_3
    iput v1, p0, Lcom/roidapp/photogrid/release/ie;->n:I

    .line 249
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 250
    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v2, v2

    div-float v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 251
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int v2, v1, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    rem-int/2addr v2, v3

    if-eqz v2, :cond_f

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_4
    iput v1, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    .line 254
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    if-nez v1, :cond_10

    :goto_5
    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    .line 255
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    const/16 v1, -0x5a

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    .line 256
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    const/16 v1, -0x5a

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    .line 257
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    const/16 v1, -0x5a

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    .line 267
    :goto_6
    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 275
    return-void

    .line 247
    :cond_d
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    goto/16 :goto_2

    .line 248
    :cond_e
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto/16 :goto_3

    .line 251
    :cond_f
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_4

    .line 254
    :cond_10
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    goto :goto_5

    .line 259
    :cond_11
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_12

    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_7
    iput v1, p0, Lcom/roidapp/photogrid/release/ie;->m:I

    .line 260
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_13

    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_8
    iput v1, p0, Lcom/roidapp/photogrid/release/ie;->n:I

    .line 261
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 262
    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v2, v2

    div-float v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 263
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int v2, v1, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    rem-int/2addr v2, v3

    if-eqz v2, :cond_14

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_9
    iput v1, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    .line 265
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    if-nez v1, :cond_15

    :goto_a
    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    goto/16 :goto_6

    .line 259
    :cond_12
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_7

    .line 260
    :cond_13
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_8

    .line 263
    :cond_14
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_9

    .line 265
    :cond_15
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->l:I
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_a
.end method

.method private static a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 1351
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1352
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1355
    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 17

    .prologue
    .line 358
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ie;->A:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v11

    .line 359
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 362
    move-object/from16 v0, p0

    iget v12, v0, Lcom/roidapp/photogrid/release/ie;->w:F

    .line 363
    const/4 v9, 0x0

    const/4 v8, 0x0

    .line 364
    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 393
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 394
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v10, v1

    :goto_0
    if-ltz v10, :cond_8

    .line 395
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ao;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/ao;

    move-result-object v2

    .line 396
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v1, v1

    iget v3, v2, Lcom/roidapp/photogrid/release/ao;->c:I

    int-to-float v3, v3

    div-float v14, v1, v3

    .line 397
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v1, v1

    iget v3, v2, Lcom/roidapp/photogrid/release/ao;->d:I

    int-to-float v3, v3

    div-float v15, v1, v3

    .line 400
    instance-of v1, v2, Lcom/roidapp/photogrid/release/qz;

    if-eqz v1, :cond_4

    .line 401
    const/4 v8, 0x1

    move-object v1, v2

    .line 404
    check-cast v1, Lcom/roidapp/photogrid/release/qz;

    .line 405
    iget-object v3, v1, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    invoke-virtual {v13, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 406
    iget-object v3, v1, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    invoke-virtual {v13, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 407
    iget-object v0, v1, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    move-object/from16 v16, v0

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-virtual {v13, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    :goto_1
    const-string v3, "text"

    iget-object v0, v1, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 415
    const-string v3, ".thanksgiving"

    iget-object v0, v1, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".givethanks"

    iget-object v0, v1, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 417
    :cond_0
    const/4 v3, 0x1

    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->F:Z

    .line 424
    :cond_1
    iget v3, v1, Lcom/roidapp/photogrid/release/qz;->j:F

    mul-float/2addr v3, v14

    iput v3, v1, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 425
    iget v3, v1, Lcom/roidapp/photogrid/release/qz;->k:F

    mul-float/2addr v3, v15

    iput v3, v1, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 430
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    iput v3, v1, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 431
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    iput v3, v1, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 432
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/qz;->g()V

    .line 433
    move-object/from16 v0, p1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/qz;->a(Landroid/graphics/Canvas;)V

    move v1, v4

    move v3, v6

    move v4, v7

    move v6, v8

    move v7, v9

    .line 477
    :goto_2
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->a()V

    move v8, v6

    move v9, v7

    move v7, v4

    move v6, v3

    move v4, v1

    .line 394
    :cond_2
    add-int/lit8 v1, v10, -0x1

    move v10, v1

    goto/16 :goto_0

    .line 409
    :cond_3
    iget-object v3, v1, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    const/16 v16, 0x1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v13, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 434
    :cond_4
    instance-of v1, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_17

    move-object v1, v2

    .line 435
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 436
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->q:I

    if-eqz v3, :cond_2

    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->p:I

    if-eqz v3, :cond_2

    .line 439
    const/4 v7, 0x1

    .line 442
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->ad:F

    mul-float/2addr v3, v12

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 443
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->ah:F

    invoke-virtual {v1, v3, v12}, Lcom/roidapp/photogrid/release/ra;->e(FF)V

    .line 444
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->Z:F

    mul-float/2addr v3, v14

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->Z:F

    .line 445
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->Y:F

    mul-float/2addr v3, v15

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->Y:F

    .line 446
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v3, v12

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->ai:F

    .line 447
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->av:F

    mul-float/2addr v3, v14

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 448
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->aw:F

    mul-float/2addr v3, v15

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 449
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->aa:F

    mul-float/2addr v3, v12

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->aa:F

    .line 450
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->j:F

    mul-float/2addr v3, v14

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 451
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->k:F

    mul-float/2addr v3, v15

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 452
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 453
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 454
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 457
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    invoke-virtual {v1, v3, v4}, Lcom/roidapp/photogrid/release/ra;->b(II)V

    .line 458
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->k()V

    .line 462
    iget-object v3, v1, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget v4, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v9, 0x10

    aget v6, v6, v9

    iget-object v9, v1, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v16, 0x11

    aget v9, v9, v16

    invoke-virtual {v3, v4, v5, v6, v9}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 463
    iget-object v3, v1, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget v4, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v9, 0x10

    aget v6, v6, v9

    iget-object v9, v1, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v16, 0x11

    aget v9, v9, v16

    invoke-virtual {v3, v4, v5, v6, v9}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 464
    iget-object v3, v1, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget v4, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v9, 0x10

    aget v6, v6, v9

    iget-object v9, v1, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v16, 0x11

    aget v9, v9, v16

    invoke-virtual {v3, v4, v5, v6, v9}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 466
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->l:F

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ra;->b(F)V

    .line 468
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v3

    .line 469
    iget-object v4, v1, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget-object v5, v1, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v6, 0x0

    aget v5, v5, v6

    mul-float/2addr v5, v14

    const/4 v6, 0x0

    aget v6, v3, v6

    sub-float/2addr v5, v6

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v9, 0x1

    aget v6, v6, v9

    mul-float/2addr v6, v15

    const/4 v9, 0x1

    aget v9, v3, v9

    sub-float/2addr v6, v9

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 470
    iget-object v4, v1, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget-object v5, v1, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v6, 0x0

    aget v5, v5, v6

    mul-float/2addr v5, v14

    const/4 v6, 0x0

    aget v6, v3, v6

    sub-float/2addr v5, v6

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v9, 0x1

    aget v6, v6, v9

    mul-float/2addr v6, v15

    const/4 v9, 0x1

    aget v3, v3, v9

    sub-float v3, v6, v3

    invoke-virtual {v4, v5, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 471
    iget-boolean v6, v1, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 472
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->af:I

    const/16 v4, -0x15

    if-eq v3, v4, :cond_5

    const/4 v3, 0x1

    .line 473
    :goto_3
    iget v4, v1, Lcom/roidapp/photogrid/release/ra;->ae:I

    const/high16 v5, -0x1000000

    if-eq v4, v5, :cond_6

    const/4 v4, 0x1

    .line 474
    :goto_4
    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->P:I

    const/4 v9, 0x2

    if-eq v5, v9, :cond_7

    const/4 v5, 0x1

    .line 475
    :goto_5
    move-object/from16 v0, p1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Canvas;)V

    move v1, v6

    move v6, v8

    goto/16 :goto_2

    .line 472
    :cond_5
    const/4 v3, 0x0

    goto :goto_3

    .line 473
    :cond_6
    const/4 v4, 0x0

    goto :goto_4

    .line 474
    :cond_7
    const/4 v5, 0x0

    goto :goto_5

    .line 480
    :cond_8
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ie;->D:Z

    if-eqz v1, :cond_b

    .line 482
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v1, v1

    const v2, 0x3e4ccccd    # 0.2f

    mul-float/2addr v1, v2

    .line 483
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    if-le v2, v3, :cond_9

    .line 484
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v1, v1

    const v2, 0x3e4ccccd    # 0.2f

    mul-float/2addr v1, v2

    .line 500
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    const v3, 0x7f020608

    invoke-static {v2, v3, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;IF)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 502
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    if-le v3, v10, :cond_d

    .line 503
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    .line 507
    :goto_6
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    .line 12590
    invoke-static {v2, v1, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 509
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    if-le v1, v3, :cond_e

    .line 510
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v1, v1

    .line 515
    :goto_7
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v10, 0x4

    if-eq v3, v10, :cond_a

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v10, 0x5

    if-ne v3, v10, :cond_f

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->d:I

    if-nez v3, :cond_f

    .line 516
    :cond_a
    const v3, 0x3ca3d70a    # 0.02f

    mul-float/2addr v1, v3

    .line 524
    :goto_8
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    sub-int/2addr v3, v10

    int-to-float v3, v3

    sub-float/2addr v3, v1

    move-object/from16 v0, p0

    iget v10, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    sub-int/2addr v10, v11

    int-to-float v10, v10

    sub-float v1, v10, v1

    const/4 v10, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v3, v1, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 525
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 530
    :cond_b
    if-eqz v9, :cond_c

    .line 531
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save/HasText"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 535
    :cond_c
    if-eqz v8, :cond_12

    .line 536
    const-string v1, ""

    .line 537
    invoke-virtual {v13}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v3, v1

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 538
    invoke-virtual {v13, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 539
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "/"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    .line 541
    goto :goto_9

    .line 505
    :cond_d
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    goto/16 :goto_6

    .line 512
    :cond_e
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v1, v1

    goto/16 :goto_7

    .line 518
    :cond_f
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->d:I

    if-nez v3, :cond_10

    .line 519
    const v3, 0x3d23d70a    # 0.04f

    mul-float/2addr v1, v3

    goto/16 :goto_8

    .line 521
    :cond_10
    const v3, 0x3d6147ae    # 0.055f

    mul-float/2addr v1, v3

    goto/16 :goto_8

    .line 543
    :cond_11
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v8, "/Save/HasSticker"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 546
    :cond_12
    if-eqz v6, :cond_13

    .line 547
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save/HasTextBorder"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 550
    :cond_13
    if-eqz v4, :cond_14

    .line 551
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save/HasTextShadow"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 555
    :cond_14
    if-eqz v7, :cond_15

    .line 556
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save/HasTextBackground"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 559
    :cond_15
    if-eqz v5, :cond_16

    .line 560
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save/HasTextColor"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 585
    :cond_16
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 586
    return-void

    :cond_17
    move v1, v4

    move v3, v6

    move v4, v7

    move v6, v8

    move v7, v9

    goto/16 :goto_2
.end method

.method private a(Landroid/graphics/Canvas;FFFFLcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/lc;Landroid/graphics/Bitmap;)V
    .locals 13

    .prologue
    .line 1611
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 1612
    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1613
    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 1614
    const/4 v3, 0x5

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setFlags(I)V

    .line 1615
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 1617
    move-object/from16 v0, p6

    iget v3, v0, Lcom/roidapp/photogrid/release/ig;->r:I

    int-to-float v3, v3

    move-object/from16 v0, p6

    iget v4, v0, Lcom/roidapp/photogrid/release/ig;->s:I

    int-to-float v4, v4

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    invoke-virtual {v6, v3, v4, v7, v8}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1619
    move-object/from16 v0, p6

    iget v3, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    int-to-float v3, v3

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v4, v7

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {v6, v3, v4, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 15732
    move-object/from16 v0, p6

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    if-eqz v3, :cond_2

    .line 15733
    div-float v3, p2, p3

    .line 15734
    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v4, v7

    .line 15735
    cmpl-float v3, v3, v4

    if-gtz v3, :cond_3

    .line 15738
    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v3, p2

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 1625
    :goto_0
    move-object/from16 v0, p6

    iget v4, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v4, v3

    move-object/from16 v0, p6

    iget v7, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v7, v3

    invoke-virtual {v6, v4, v7}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1628
    move-object/from16 v0, p6

    iget v4, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    mul-float/2addr v4, p2

    move-object/from16 v0, p6

    iget v7, v0, Lcom/roidapp/photogrid/release/ig;->C:I

    int-to-float v7, v7

    div-float/2addr v4, v7

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    move-object/from16 v0, p6

    iget v8, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v7, v8

    mul-float/2addr v7, v3

    sub-float/2addr v4, v7

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, p2, v7

    add-float/2addr v4, v7

    .line 1629
    move-object/from16 v0, p6

    iget v7, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    mul-float v7, v7, p3

    move-object/from16 v0, p6

    iget v8, v0, Lcom/roidapp/photogrid/release/ig;->D:I

    int-to-float v8, v8

    div-float/2addr v7, v8

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    move-object/from16 v0, p6

    iget v9, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v8, v9

    mul-float/2addr v3, v8

    sub-float v3, v7, v3

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, p3, v7

    add-float/2addr v3, v7

    .line 1630
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1633
    const/4 v3, 0x4

    new-array v3, v3, [F

    const/4 v4, 0x0

    const/4 v7, 0x0

    aput v7, v3, v4

    const/4 v4, 0x1

    const/4 v7, 0x0

    aput v7, v3, v4

    const/4 v4, 0x2

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    aput v7, v3, v4

    const/4 v4, 0x3

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    aput v7, v3, v4

    .line 1634
    const/4 v4, 0x4

    new-array v4, v4, [F

    .line 1635
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 1637
    const/4 v3, 0x0

    aget v3, v4, v3

    const/4 v7, 0x2

    aget v7, v4, v7

    invoke-static {v3, v7}, Ljava/lang/Math;->min(FF)F

    move-result v7

    .line 1638
    const/4 v3, 0x1

    aget v3, v4, v3

    const/4 v8, 0x3

    aget v8, v4, v8

    invoke-static {v3, v8}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 1639
    const/4 v3, 0x0

    aget v3, v4, v3

    const/4 v9, 0x2

    aget v9, v4, v9

    invoke-static {v3, v9}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 1640
    const/4 v3, 0x1

    aget v3, v4, v3

    const/4 v10, 0x3

    aget v4, v4, v10

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 1643
    const/4 v3, 0x0

    .line 1644
    const/4 v4, 0x0

    .line 1645
    move-object/from16 v0, p6

    iget-boolean v11, v0, Lcom/roidapp/photogrid/release/ig;->E:Z

    if-eqz v11, :cond_4

    .line 1646
    neg-float v3, v7

    .line 1651
    :cond_0
    :goto_1
    move-object/from16 v0, p6

    iget-boolean v7, v0, Lcom/roidapp/photogrid/release/ig;->F:Z

    if-eqz v7, :cond_5

    .line 1652
    neg-float v4, v8

    .line 1656
    :cond_1
    :goto_2
    invoke-virtual {v6, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1668
    new-instance v3, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v4, 0x0

    const/4 v7, 0x6

    invoke-direct {v3, v4, v7}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1669
    const/4 v4, 0x0

    .line 1672
    :try_start_0
    move-object/from16 v0, p6

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    if-eqz v3, :cond_9

    move-object/from16 v0, p7

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v3, :cond_9

    .line 1673
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sget-object v8, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v7, v8}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 1674
    if-nez v4, :cond_6

    .line 1675
    new-instance v3, Ljava/lang/OutOfMemoryError;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "GridSaveUtils tmp==null width="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "height="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move/from16 v0, p3

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1724
    :catch_0
    move-exception v3

    .line 1725
    invoke-static {v4}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1726
    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1727
    new-instance v3, Ljava/lang/OutOfMemoryError;

    const-string v4, "addEffect oom"

    invoke-direct {v3, v4}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v3

    .line 15741
    :cond_2
    div-float v3, p2, p3

    .line 15742
    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v4, v7

    .line 15743
    cmpl-float v3, v3, v4

    if-lez v3, :cond_3

    .line 15744
    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v3, p2

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    goto/16 :goto_0

    .line 15746
    :cond_3
    const/high16 v3, 0x3f800000    # 1.0f

    mul-float v3, v3, p3

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    goto/16 :goto_0

    .line 1647
    :cond_4
    move-object/from16 v0, p6

    iget-boolean v7, v0, Lcom/roidapp/photogrid/release/ig;->G:Z

    if-eqz v7, :cond_0

    .line 1648
    sub-float v3, p2, v9

    goto/16 :goto_1

    .line 1653
    :cond_5
    move-object/from16 v0, p6

    iget-boolean v7, v0, Lcom/roidapp/photogrid/release/ig;->H:Z

    if-eqz v7, :cond_1

    .line 1654
    sub-float v4, p3, v10

    goto/16 :goto_2

    .line 1677
    :cond_6
    :try_start_1
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1678
    new-instance v7, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-direct {v7, v8, v9}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v7}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1679
    new-instance v7, Landroid/graphics/BitmapShader;

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object/from16 v0, p8

    invoke-direct {v7, v0, v8, v9}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 1682
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 1683
    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1684
    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    int-to-float v9, v9

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1685
    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1686
    const/4 v9, 0x0

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1687
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 1688
    new-instance v9, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v10, Landroid/graphics/drawable/shapes/PathShape;

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    int-to-float v12, v12

    invoke-direct {v10, v8, v11, v12}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-direct {v9, v10}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 1689
    invoke-virtual {v9}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v8

    new-instance v10, Landroid/graphics/CornerPathEffect;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v11

    invoke-virtual {v11}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v11

    invoke-direct {v10, v11}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1690
    invoke-virtual {v9}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1691
    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    invoke-virtual/range {p8 .. p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    invoke-virtual {v9, v7, v8, v10, v11}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 1692
    invoke-virtual {v9, v3}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 1693
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 1694
    invoke-virtual {p1, v4, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1695
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v3

    if-eqz v3, :cond_7

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x5

    if-eq v3, v5, :cond_8

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0x9

    if-eq v3, v5, :cond_8

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0xa

    if-eq v3, v5, :cond_8

    .line 1698
    :cond_7
    invoke-static/range {p8 .. p8}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1723
    :cond_8
    :goto_3
    invoke-static {v4}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1728
    return-void

    .line 1700
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->round(F)I

    move-result v7

    sget-object v8, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v7, v8}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 1701
    if-nez v4, :cond_a

    .line 1702
    new-instance v3, Ljava/lang/OutOfMemoryError;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "GridSaveUtils tmp==null width="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "height="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move/from16 v0, p3

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v3

    .line 1704
    :cond_a
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1705
    new-instance v7, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-direct {v7, v8, v9}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v7}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1706
    move-object/from16 v0, p8

    invoke-virtual {v3, v0, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1707
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 1708
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v3

    if-eqz v3, :cond_b

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x5

    if-eq v3, v5, :cond_c

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0x9

    if-eq v3, v5, :cond_c

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0xa

    if-eq v3, v5, :cond_c

    .line 1711
    :cond_b
    invoke-static/range {p8 .. p8}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1712
    :cond_c
    new-instance v3, Landroid/graphics/BitmapShader;

    sget-object v5, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v3, v4, v5, v6}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 1713
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v5

    iget v6, p0, Lcom/roidapp/photogrid/release/ie;->w:F

    mul-float/2addr v5, v6

    .line 1714
    move-object/from16 v0, p7

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ie;->a(Lcom/roidapp/photogrid/release/lc;FF)Landroid/graphics/Path;

    move-result-object v6

    .line 1715
    new-instance v7, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v8, Landroid/graphics/drawable/shapes/PathShape;

    move/from16 v0, p3

    invoke-direct {v8, v6, p2, v0}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-direct {v7, v8}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 1716
    invoke-virtual {v7}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v6

    new-instance v8, Landroid/graphics/CornerPathEffect;

    invoke-direct {v8, v5}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1717
    invoke-virtual {v7}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1718
    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-virtual {v7, v3, v5, v6, v8}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 1719
    invoke-virtual {v7, p1}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_3
.end method

.method private a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
    .locals 13

    .prologue
    const/4 v8, -0x1

    const/high16 v12, 0x40000000    # 2.0f

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 757
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-eq v0, v2, :cond_c

    .line 759
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->e:I

    const/4 v3, 0x2

    new-array v3, v3, [I

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->f:I

    aput v4, v3, v6

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->g:I

    aput v4, v3, v7

    invoke-direct {p0, v0, v2, v3}, Lcom/roidapp/photogrid/release/ie;->a(II[I)V

    .line 760
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 761
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 762
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 763
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v4, v0

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 764
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    if-ne v0, v8, :cond_0

    .line 765
    new-array v0, v6, [I

    invoke-direct {p0, v7, v6, v0}, Lcom/roidapp/photogrid/release/ie;->a(II[I)V

    .line 766
    iput v7, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    .line 768
    :cond_0
    new-instance v4, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 769
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 770
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v2, 0x7

    invoke-direct {v0, v6, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 771
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0xa

    if-eq v0, v2, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x9

    if-ne v0, v2, :cond_6

    .line 774
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v0

    div-int/lit8 v0, v0, 0x5

    add-int/lit8 v2, v0, 0x1

    .line 775
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v6

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v6

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 777
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_4

    .line 778
    invoke-static {p2, v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 781
    :goto_1
    invoke-static {p2}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 782
    new-instance v8, Landroid/graphics/Matrix;

    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 783
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    .line 784
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    .line 786
    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v2, v2

    int-to-float v3, v9

    div-float/2addr v2, v3

    .line 787
    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v3, v3

    int-to-float v11, v10

    div-float/2addr v3, v11

    .line 788
    cmpl-float v11, v2, v3

    if-lez v11, :cond_5

    .line 789
    :goto_2
    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v3, v3

    div-float/2addr v3, v12

    int-to-float v9, v9

    div-float/2addr v9, v12

    sub-float/2addr v3, v9

    .line 790
    iget v9, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v9, v9

    div-float/2addr v9, v12

    int-to-float v10, v10

    div-float/2addr v10, v12

    sub-float/2addr v9, v10

    .line 791
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 792
    invoke-virtual {v10, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 793
    invoke-virtual {v10, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 794
    invoke-virtual {v8, v3, v9}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 795
    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v3, v3

    div-float/2addr v3, v12

    iget v7, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v7, v7

    div-float/2addr v7, v12

    invoke-virtual {v8, v2, v2, v3, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 796
    invoke-virtual {p1, v0, v8, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 797
    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 806
    :cond_2
    const/16 v0, 0x1e

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 807
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 808
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 809
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    if-le v0, v2, :cond_a

    .line 811
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 812
    new-instance v2, Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    mul-int/2addr v4, v7

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v2, v1, v1, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 813
    new-instance v3, Landroid/graphics/RectF;

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v4, v4

    iget v7, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v7, v7

    invoke-direct {v3, v1, v1, v4, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 814
    sget-object v4, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v2, v3, v4}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 815
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 816
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 817
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 818
    :goto_3
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    if-ge v6, v0, :cond_8

    .line 819
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    mul-int/2addr v3, v6

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1, v0, v2, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 818
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 775
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v6

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    goto/16 :goto_0

    .line 780
    :cond_4
    invoke-static {v0, v2}, Lcom/roidapp/imagelib/b/c;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    goto/16 :goto_1

    :cond_5
    move v2, v3

    .line 788
    goto/16 :goto_2

    :cond_6
    move v0, v6

    .line 799
    :goto_4
    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->n:I

    if-ge v0, v2, :cond_2

    move v2, v6

    .line 800
    :goto_5
    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->m:I

    if-ge v2, v3, :cond_7

    .line 801
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    mul-int/2addr v7, v2

    int-to-float v7, v7

    iget-object v8, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    mul-int/2addr v8, v0

    int-to-float v8, v8

    const/4 v9, 0x0

    invoke-virtual {p1, v3, v7, v8, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 800
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 799
    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 821
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 822
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    mul-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1, v0, v2, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 823
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 839
    :goto_6
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 840
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 842
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ie;->q:Z

    if-eqz v0, :cond_9

    .line 843
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 844
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v4, v0

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 846
    :cond_9
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 847
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 848
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/Save/Background/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/postion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/mPattenIndex0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/mPattenIndex1: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/mShapeIndex: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 880
    :goto_7
    return-void

    .line 825
    :cond_a
    new-instance v0, Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int/2addr v4, v7

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 826
    new-instance v2, Landroid/graphics/RectF;

    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v4, v4

    invoke-direct {v2, v1, v1, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 827
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 828
    sget-object v4, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v3, v0, v2, v4}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 829
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 830
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 831
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 832
    :goto_8
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    if-ge v6, v0, :cond_b

    .line 833
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    mul-int/2addr v3, v6

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 832
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    .line 835
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 836
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->l:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 837
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_6

    .line 862
    :cond_c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->e()Ljava/lang/String;

    move-result-object v1

    .line 863
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->f()Z

    move-result v2

    .line 864
    if-nez v1, :cond_f

    .line 865
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->e:I

    const/4 v4, 0x2

    new-array v4, v4, [I

    iget v5, p0, Lcom/roidapp/photogrid/release/ie;->f:I

    aput v5, v4, v6

    iget v5, p0, Lcom/roidapp/photogrid/release/ie;->g:I

    aput v5, v4, v7

    invoke-direct {p0, v0, v3, v4}, Lcom/roidapp/photogrid/release/ie;->a(II[I)V

    .line 870
    :cond_d
    :goto_9
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 871
    invoke-direct {p0, p1, v2}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Canvas;Z)V

    .line 872
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 873
    if-nez v1, :cond_e

    .line 874
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->j:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 875
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->i:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 876
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 878
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_7

    .line 12905
    :cond_f
    if-eqz v2, :cond_13

    .line 12941
    if-eqz v1, :cond_d

    .line 12944
    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    .line 12945
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    if-nez v0, :cond_10

    .line 12946
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save bg create decodeBitmap null createBgRepeat"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12948
    :cond_10
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    rem-int/2addr v0, v3

    if-eqz v0, :cond_11

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    :goto_a
    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->m:I

    .line 12949
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    rem-int/2addr v0, v3

    if-eqz v0, :cond_12

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    div-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    :goto_b
    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->n:I

    goto :goto_9

    .line 12948
    :cond_11
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/2addr v0, v3

    goto :goto_a

    .line 12949
    :cond_12
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    div-int/2addr v0, v3

    goto :goto_b

    .line 13913
    :cond_13
    if-eqz v1, :cond_d

    .line 13916
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 13917
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 13918
    invoke-static {v1, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 13919
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    div-int/2addr v0, v4

    .line 13920
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v5, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    div-int/2addr v4, v5

    if-le v0, v4, :cond_14

    .line 13921
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    div-int/2addr v0, v4

    .line 13923
    :cond_14
    if-gtz v0, :cond_15

    move v0, v7

    .line 13926
    :cond_15
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 13927
    iput-boolean v6, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 13928
    invoke-static {v1, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 13929
    iget v4, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 13930
    iget v5, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v5, v5

    iget v3, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v3, v3

    div-float v3, v5, v3

    .line 13931
    if-nez v0, :cond_16

    .line 13932
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save bg create decodeBitmap null createBgSingle1"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 13934
    :cond_16
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {v0, v4, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    .line 13935
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    if-nez v0, :cond_d

    .line 13936
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save bg create decodeBitmap null createBgSingle2"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Landroid/graphics/Canvas;Z)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 886
    if-eqz p2, :cond_1

    .line 887
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getDensity()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Bitmap;->setDensity(I)V

    move v0, v1

    .line 889
    :goto_0
    iget v2, p0, Lcom/roidapp/photogrid/release/ie;->n:I

    if-ge v0, v2, :cond_2

    move v2, v1

    .line 890
    :goto_1
    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->m:I

    if-ge v2, v3, :cond_0

    .line 891
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    mul-int/2addr v4, v2

    int-to-float v4, v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    mul-int/2addr v5, v0

    int-to-float v5, v5

    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 890
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 889
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 895
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->k:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v2, v2, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 897
    :cond_2
    return-void
.end method

.method private static a([Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1770
    if-eqz p0, :cond_0

    :try_start_0
    array-length v0, p0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1771
    new-instance v0, Ljava/io/File;

    const/4 v1, 0x1

    aget-object v1, p0, v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1772
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1773
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1779
    :cond_0
    :goto_0
    return-void

    .line 1777
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)[Ljava/lang/String;
    .locals 9

    .prologue
    .line 630
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 632
    if-nez p4, :cond_4

    .line 633
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    .line 634
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 644
    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 645
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_d

    .line 646
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_d

    .line 647
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-ne v2, v4, :cond_6

    .line 648
    new-instance v2, Lcom/roidapp/photogrid/common/ae;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-direct {v2, v4, v1}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 650
    :try_start_0
    invoke-virtual {v2}, Lcom/roidapp/photogrid/common/ae;->a()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    .line 673
    :goto_1
    const/16 v2, 0x50

    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 674
    new-instance v2, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PhotoGrid_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 676
    :try_start_1
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 693
    :cond_0
    :goto_2
    const/16 v1, 0x51

    :try_start_2
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 694
    const/4 v1, 0x0

    .line 695
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    move-result v4

    if-nez v4, :cond_c

    .line 696
    :cond_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    const/16 v5, 0x12

    if-le v4, v5, :cond_b

    .line 698
    :try_start_3
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-direct {v0, v4, v2}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 699
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;

    move-result-object v1

    .line 700
    if-nez v1, :cond_9

    .line 701
    new-instance v0, Ljava/io/IOException;

    const-string v2, "4.4 IOException"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 704
    :catch_0
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 705
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    const v4, 0x7f07002e

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 706
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 707
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_7

    .line 708
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_7

    .line 709
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 710
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "2"

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object v2, v0, v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 752
    :goto_3
    return-object v0

    .line 635
    :cond_2
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 636
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 638
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 641
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ie;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 652
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 653
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    const v2, 0x7f07002e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 654
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 655
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_5

    .line 656
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_5

    .line 657
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 658
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "2"

    aput-object v3, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    goto/16 :goto_3

    .line 661
    :cond_5
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 665
    :cond_6
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 667
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "2"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    move-object v0, v1

    goto/16 :goto_3

    .line 678
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 679
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x12

    if-gt v1, v4, :cond_0

    .line 680
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    const v4, 0x7f07002e

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 681
    new-instance v2, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PhotoGrid_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 683
    :try_start_5
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 689
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v4, v1}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 685
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 686
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 687
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "1"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    move-object v0, v1

    goto/16 :goto_3

    .line 713
    :cond_7
    :try_start_6
    new-instance v0, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PhotoGrid_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 715
    :try_start_7
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 721
    :try_start_8
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v3, v2}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 723
    if-eqz v1, :cond_8

    .line 725
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 726
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 729
    :cond_8
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 738
    :cond_9
    :goto_4
    const/16 v0, 0x64

    invoke-virtual {p1, p2, v0, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 739
    const/16 v0, 0x5a

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 740
    if-eqz v1, :cond_a

    .line 742
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 743
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 746
    :cond_a
    const/16 v0, 0x5c

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 747
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 748
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "0"

    aput-object v3, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    goto/16 :goto_3

    .line 749
    :catch_4
    move-exception v0

    .line 750
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 751
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 752
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "2"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, ""

    aput-object v2, v0, v1

    goto/16 :goto_3

    .line 717
    :catch_5
    move-exception v0

    :try_start_9
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 718
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 719
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "1"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto/16 :goto_3

    .line 732
    :cond_b
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 733
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "1"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    move-object v0, v1

    goto/16 :goto_3

    .line 736
    :cond_c
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_4

    :cond_d
    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto/16 :goto_1
.end method

.method private a(Lcom/roidapp/photogrid/release/ig;Ljava/lang/String;Lcom/roidapp/photogrid/release/lc;FFFFFFZ)[Ljava/lang/String;
    .locals 13

    .prologue
    .line 1402
    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 1403
    if-eqz p2, :cond_12

    .line 1404
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static/range {p6 .. p6}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static/range {p7 .. p7}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {p2, v1, v3}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    move-object v11, v1

    .line 1484
    :goto_0
    :try_start_0
    const-string v1, "drawSingle"

    const-string v3, "isOldModel"

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1485
    invoke-static/range {p6 .. p6}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 1486
    invoke-static/range {p7 .. p7}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 1487
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static/range {p10 .. p10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p1, v3, v1, v4}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 1488
    if-nez v9, :cond_2

    .line 1489
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v3, "GridSaveUtils b is null"

    invoke-direct {v1, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1518
    :catch_0
    move-exception v1

    .line 1519
    :goto_1
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_0

    .line 1520
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 1523
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1524
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 1527
    :cond_1
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1528
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "save normal size oom"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1491
    :cond_2
    :try_start_1
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0x9

    if-eq v1, v3, :cond_5

    .line 1492
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    .line 1493
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/b;->b(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v1

    invoke-static {v1, v9, p1}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 1497
    :goto_2
    if-eqz v9, :cond_3

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1498
    :cond_3
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v3, "filterBitmap process failed"

    invoke-direct {v1, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1495
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/b;->a(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v1

    invoke-static {v1, v9, p1}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v9

    goto :goto_2

    .line 1502
    :cond_5
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static/range {p6 .. p6}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static/range {p7 .. p7}, Ljava/lang/Math;->round(F)I

    move-result v3

    sget-object v4, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v10

    .line 1503
    if-nez v10, :cond_6

    .line 1504
    :try_start_2
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "GridSaveUtils bitmap is null"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1518
    :catch_1
    move-exception v1

    move-object v2, v10

    goto :goto_1

    .line 1506
    :cond_6
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v10}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    move-object v1, p0

    move/from16 v3, p6

    move/from16 v4, p7

    move/from16 v5, p4

    move/from16 v6, p5

    move-object v7, p1

    move-object/from16 v8, p3

    .line 1507
    invoke-direct/range {v1 .. v9}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Canvas;FFFFLcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/lc;Landroid/graphics/Bitmap;)V

    .line 1508
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v1

    if-eqz v1, :cond_7

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x5

    if-eq v1, v3, :cond_8

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0x9

    if-eq v1, v3, :cond_8

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0xa

    if-eq v1, v3, :cond_8

    .line 1511
    :cond_7
    invoke-static {v9}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1512
    :cond_8
    if-eqz v11, :cond_9

    .line 1513
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 1514
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 1515
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v2, v11, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1516
    invoke-static {v11}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    .line 1533
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v2

    .line 1536
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    if-nez v1, :cond_a

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v3

    if-nez v1, :cond_a

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v1

    if-nez v1, :cond_a

    .line 1537
    move-object/from16 v0, p3

    iget v1, v0, Lcom/roidapp/photogrid/release/lc;->j:F

    sub-float/2addr v1, v2

    mul-float v1, v1, p4

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v1, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p8, v3

    add-float/2addr v1, v3

    .line 1538
    move-object/from16 v0, p3

    iget v3, v0, Lcom/roidapp/photogrid/release/lc;->k:F

    sub-float v2, v3, v2

    mul-float v2, v2, p5

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p9, v3

    add-float/2addr v2, v3

    .line 1543
    :goto_3
    const/4 v4, 0x0

    .line 1544
    const/4 v3, 0x0

    .line 1546
    :try_start_3
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v5, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget v6, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    sget-object v7, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v6, v7}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v3

    .line 1547
    const/16 v5, 0x19

    :try_start_4
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 1548
    if-nez v3, :cond_b

    .line 1549
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "GridSaveUtils bitmap is null"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 1596
    :catch_2
    move-exception v1

    move-object v2, v3

    move-object v3, v4

    .line 1597
    :goto_4
    invoke-static {v3}, Lcom/roidapp/photogrid/release/ie;->a([Ljava/lang/String;)V

    .line 1598
    invoke-static {v2}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1599
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1600
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "GridSaveUtils doSave() OOM"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1540
    :cond_a
    move-object/from16 v0, p3

    iget v1, v0, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float v1, v1, p4

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p8, v2

    add-float/2addr v1, v2

    .line 1541
    move-object/from16 v0, p3

    iget v2, v0, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float v2, v2, p5

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p9, v3

    add-float/2addr v2, v3

    goto :goto_3

    .line 1551
    :cond_b
    :try_start_5
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1552
    new-instance v5, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x0

    const/4 v8, 0x6

    invoke-direct {v5, v6, v8}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v7, v5}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1555
    iget v5, p0, Lcom/roidapp/photogrid/release/ie;->y:I

    const/4 v6, 0x1

    if-ne v5, v6, :cond_10

    .line 1556
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ie;->c()Z

    move-result v5

    if-nez v5, :cond_f

    .line 1557
    const/4 v5, 0x1

    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/ie;->q:Z

    .line 1558
    const/4 v5, -0x1

    invoke-virtual {v7, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 1562
    :goto_5
    const-string v6, ".png"

    .line 1563
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 1571
    :goto_6
    if-eqz p10, :cond_c

    .line 1572
    const-string v6, ".jpg"

    .line 1573
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 1575
    :cond_c
    const/16 v8, 0x1a

    invoke-direct {p0, v8}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 1577
    iget-boolean v8, p0, Lcom/roidapp/photogrid/release/ie;->r:Z

    if-nez v8, :cond_d

    .line 1578
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v8

    invoke-virtual {v8}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v8

    if-eqz v8, :cond_11

    :goto_7
    invoke-direct {p0, v7, v9}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V

    .line 1582
    :cond_d
    const/4 v8, 0x0

    invoke-virtual {v7, v10, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 1583
    invoke-static {v10}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1585
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Canvas;)V

    .line 1587
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/release/ie;->b(Landroid/graphics/Canvas;)V

    .line 1590
    move/from16 v0, p10

    invoke-direct {p0, v3, v5, v6, v0}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)[Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move-result-object v2

    .line 1592
    const/4 v1, 0x0

    :try_start_6
    aget-object v1, v2, v1

    const-string v4, "0"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->y:I

    const/4 v4, 0x2

    if-ne v1, v4, :cond_e

    .line 1593
    iget-object v1, p1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v4, v2, v4

    .line 14754
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v6, 0x5

    if-le v5, v6, :cond_e

    .line 14757
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {v1, v4}, Lcom/roidapp/photogrid/common/bp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1595
    :cond_e
    const/16 v1, 0x5a

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ie;->a(I)V
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 1607
    return-object v2

    .line 1560
    :cond_f
    const/4 v5, 0x0

    :try_start_7
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/ie;->q:Z
    :try_end_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_5

    .line 1601
    :catch_3
    move-exception v1

    .line 1602
    :goto_8
    invoke-static {v4}, Lcom/roidapp/photogrid/release/ie;->a([Ljava/lang/String;)V

    .line 1603
    invoke-static {v3}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 1604
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 1605
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "GridSaveUtils doSave() OOM"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1565
    :cond_10
    const/4 v5, 0x1

    :try_start_8
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/ie;->q:Z

    .line 1566
    const-string v6, ".jpg"

    .line 1567
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 1568
    const/4 v8, -0x1

    invoke-virtual {v7, v8}, Landroid/graphics/Canvas;->drawColor(I)V
    :try_end_8
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_6

    .line 1578
    :cond_11
    const/4 v9, 0x0

    goto :goto_7

    .line 1601
    :catch_4
    move-exception v1

    move-object v4, v2

    goto :goto_8

    .line 1596
    :catch_5
    move-exception v1

    move-object v2, v3

    move-object v3, v4

    goto/16 :goto_4

    :catch_6
    move-exception v1

    move-object v12, v3

    move-object v3, v2

    move-object v2, v12

    goto/16 :goto_4

    :cond_12
    move-object v11, v1

    goto/16 :goto_0
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->B:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 594
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_1

    .line 623
    :cond_0
    :goto_0
    return-void

    .line 612
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ie;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save/HasDoodle"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 615
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 616
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 617
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 618
    const/4 v2, 0x0

    const/16 v3, 0x1f

    invoke-virtual {p1, v2, v1, v3}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 619
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ay;

    .line 620
    iget v3, p0, Lcom/roidapp/photogrid/release/ie;->w:F

    invoke-virtual {v0, p1, v3, v1}, Lcom/roidapp/photogrid/release/ay;->a(Landroid/graphics/Canvas;FLandroid/graphics/Paint;)V

    goto :goto_1

    .line 622
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0
.end method

.method private b(Landroid/graphics/Canvas;Z)V
    .locals 22

    .prologue
    .line 953
    const/high16 v2, 0x40000000    # 2.0f

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->u:F

    mul-float v4, v2, v3

    .line 954
    const/high16 v2, 0x40000000    # 2.0f

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/ie;->v:F

    mul-float/2addr v3, v2

    .line 956
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v2, v2

    sub-float/2addr v2, v4

    .line 957
    move-object/from16 v0, p0

    iget v5, v0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v5, v5

    sub-float v7, v5, v3

    .line 960
    move-object/from16 v0, p0

    iget-boolean v5, v0, Lcom/roidapp/photogrid/release/ie;->E:Z

    if-eqz v5, :cond_f

    .line 961
    cmpl-float v5, v2, v7

    if-lez v5, :cond_2

    .line 962
    sub-float/2addr v2, v7

    add-float/2addr v2, v4

    move v6, v7

    move v11, v3

    move v12, v2

    .line 970
    :goto_0
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 971
    new-instance v17, Ljava/util/HashSet;

    invoke-direct/range {v17 .. v17}, Ljava/util/HashSet;-><init>()V

    .line 972
    const/4 v3, 0x0

    .line 973
    const/4 v2, 0x0

    move v13, v2

    move v2, v3

    :goto_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    array-length v3, v3

    if-ge v13, v3, :cond_b

    .line 974
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    aget-object v8, v3, v13

    .line 975
    iget-object v9, v8, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 976
    if-nez v2, :cond_e

    .line 977
    iget-object v3, v8, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-nez v3, :cond_3

    iget-object v3, v8, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 978
    :goto_2
    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    .line 979
    const/4 v2, 0x1

    move v14, v2

    .line 983
    :goto_3
    iget v2, v9, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v2, v6

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 984
    iget v3, v9, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v3, v7

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    float-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v3, v4

    .line 988
    iget v4, v9, Lcom/roidapp/photogrid/release/lc;->l:F

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v4, v5

    mul-float/2addr v4, v6

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float v4, v4

    .line 989
    iget v5, v9, Lcom/roidapp/photogrid/release/lc;->m:F

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v5, v10

    mul-float/2addr v5, v7

    float-to-double v0, v5

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v18

    move-wide/from16 v0, v18

    double-to-float v5, v0

    .line 991
    int-to-float v2, v2

    const/high16 v10, 0x40000000    # 2.0f

    div-float v10, v12, v10

    add-float/2addr v2, v10

    float-to-int v10, v2

    .line 992
    int-to-float v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v11, v3

    add-float/2addr v2, v3

    float-to-int v3, v2

    .line 993
    const-string v2, "save"

    const-string v15, "*****************************************************************"

    invoke-static {v2, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 994
    const/4 v2, 0x0

    .line 995
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/roidapp/photogrid/release/ie;->s:Ljava/util/List;

    if-eqz v15, :cond_d

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/roidapp/photogrid/release/ie;->s:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_d

    .line 996
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ie;->s:Ljava/util/List;

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v15, v2

    .line 998
    :goto_4
    int-to-float v0, v10

    move/from16 v18, v0

    int-to-float v0, v3

    move/from16 v19, v0

    .line 14016
    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 14017
    if-eqz v15, :cond_c

    .line 14019
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    float-to-int v2, v4

    float-to-int v0, v5

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-static {v15, v2, v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v2

    move-object/from16 v16, v2

    .line 14118
    :goto_5
    :try_start_0
    const-string v2, "drawGrid"

    const-string v15, "isOldModel"

    invoke-static {v2, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14119
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 14120
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v15

    .line 14124
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v8, v15, v2, v0}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 14127
    if-nez v10, :cond_4

    .line 14128
    new-instance v2, Ljava/lang/OutOfMemoryError;

    const-string v4, "GridSaveUtils b is null"

    invoke-direct {v2, v4}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 14167
    :catch_0
    move-exception v2

    .line 14168
    :goto_6
    if-eqz v10, :cond_0

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_0

    .line 14169
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V

    .line 14172
    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_1

    .line 14173
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 14176
    :cond_1
    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 14177
    new-instance v2, Ljava/lang/OutOfMemoryError;

    const-string v3, "save normal size oom"

    invoke-direct {v2, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v2

    .line 965
    :cond_2
    sub-float v5, v7, v2

    add-float/2addr v3, v5

    move v7, v2

    move v6, v2

    move v11, v3

    move v12, v4

    .line 966
    goto/16 :goto_0

    .line 977
    :cond_3
    iget-object v3, v8, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    goto/16 :goto_2

    .line 14131
    :cond_4
    :try_start_1
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 14132
    sget v15, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v20, 0x8

    move/from16 v0, v20

    if-ne v15, v0, :cond_6

    .line 14133
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v15}, Lcom/roidapp/photogrid/filter/b;->b(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v15

    invoke-static {v15, v10, v8}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 14138
    :goto_7
    if-eqz v10, :cond_5

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v15

    if-eqz v15, :cond_7

    .line 14139
    :cond_5
    new-instance v2, Ljava/lang/OutOfMemoryError;

    const-string v4, "filterBitmap process failed"

    invoke-direct {v2, v4}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v2

    .line 14135
    :cond_6
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-static {v15}, Lcom/roidapp/photogrid/filter/b;->a(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v15

    invoke-static {v15, v10, v8}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v10

    goto :goto_7

    .line 14141
    :cond_7
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v15

    .line 14142
    if-ge v15, v2, :cond_8

    .line 14143
    int-to-float v2, v2

    int-to-float v15, v15

    div-float/2addr v2, v15

    .line 14144
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    .line 14590
    invoke-static {v10, v2, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 14148
    :cond_8
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    float-to-double v0, v4

    move-wide/from16 v20, v0

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v20

    move-wide/from16 v0, v20

    double-to-int v2, v0

    float-to-double v0, v5

    move-wide/from16 v20, v0

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v20

    move-wide/from16 v0, v20

    double-to-int v15, v0

    sget-object v20, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    move-object/from16 v0, v20

    invoke-static {v2, v15, v0}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v15

    .line 14150
    if-nez v15, :cond_9

    .line 14151
    :try_start_2
    new-instance v2, Ljava/lang/OutOfMemoryError;

    const-string v3, "bitmap is null"

    invoke-direct {v2, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v2

    .line 14167
    :catch_1
    move-exception v2

    move-object v3, v15

    goto/16 :goto_6

    .line 14154
    :cond_9
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v15}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    move-object/from16 v2, p0

    .line 14155
    invoke-direct/range {v2 .. v10}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Canvas;FFFFLcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/lc;Landroid/graphics/Bitmap;)V

    .line 14156
    invoke-static {v10}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 14157
    if-eqz v16, :cond_a

    .line 14158
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 14159
    new-instance v4, Landroid/graphics/PorterDuffXfermode;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 14160
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    move-object/from16 v0, v16

    invoke-virtual {v3, v0, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 14161
    invoke-static/range {v16 .. v16}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V

    .line 14164
    :cond_a
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v15, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 14166
    invoke-static {v15}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    .line 999
    mul-int/lit8 v2, v13, 0x4

    add-int/lit8 v2, v2, 0x2a

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 973
    add-int/lit8 v2, v13, 0x1

    move v13, v2

    move v2, v14

    goto/16 :goto_1

    .line 1001
    :cond_b
    invoke-virtual/range {v17 .. v17}, Ljava/util/HashSet;->clear()V

    .line 1002
    return-void

    :cond_c
    move-object/from16 v16, v2

    goto/16 :goto_5

    :cond_d
    move-object v15, v2

    goto/16 :goto_4

    :cond_e
    move v14, v2

    goto/16 :goto_3

    :cond_f
    move v6, v2

    move v11, v3

    move v12, v4

    goto/16 :goto_0
.end method

.method private c()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 625
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 626
    const-string v1, "SHARE_BORDER"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a(F)V
    .locals 3

    .prologue
    .line 156
    iput p1, p0, Lcom/roidapp/photogrid/release/ie;->w:F

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    .line 158
    int-to-float v0, v0

    const/high16 v1, 0x44a00000    # 1280.0f

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->p:F

    .line 159
    return-void
.end method

.method public final a(FFF)V
    .locals 3

    .prologue
    .line 148
    iput p1, p0, Lcom/roidapp/photogrid/release/ie;->v:F

    .line 149
    iput p2, p0, Lcom/roidapp/photogrid/release/ie;->u:F

    .line 150
    iput p3, p0, Lcom/roidapp/photogrid/release/ie;->w:F

    .line 151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    mul-float/2addr v0, p3

    float-to-int v0, v0

    .line 152
    int-to-float v0, v0

    const/high16 v1, 0x44a00000    # 1280.0f

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ie;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ie;->p:F

    .line 153
    return-void
.end method

.method public final a(IIII)V
    .locals 0

    .prologue
    .line 168
    iput p1, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    .line 169
    iput p2, p0, Lcom/roidapp/photogrid/release/ie;->e:I

    .line 170
    iput p3, p0, Lcom/roidapp/photogrid/release/ie;->f:I

    .line 171
    iput p4, p0, Lcom/roidapp/photogrid/release/ie;->g:I

    .line 172
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 144
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ie;->s:Ljava/util/List;

    .line 145
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 178
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ie;->r:Z

    .line 179
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1785
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ie;->E:Z

    .line 1786
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 182
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ie;->D:Z

    .line 183
    return-void
.end method

.method public final c(Z)[Ljava/lang/String;
    .locals 12

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    const/4 v3, 0x4

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v10, 0x0

    .line 289
    .line 290
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 11359
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v3, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->d:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->e:I

    const/16 v1, -0x14

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->f:I

    if-ne v0, v3, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->g:I

    if-ne v0, v3, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v0

    if-nez v0, :cond_0

    .line 11364
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/ie;->r:Z

    .line 11367
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->u:F

    mul-float v8, v4, v0

    .line 11368
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->v:F

    mul-float v9, v4, v0

    .line 11370
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    int-to-float v0, v0

    sub-float/2addr v0, v8

    .line 11371
    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    int-to-float v1, v1

    sub-float v5, v1, v9

    .line 11374
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ie;->E:Z

    if-eqz v1, :cond_b

    .line 11375
    cmpl-float v1, v0, v5

    if-lez v1, :cond_2

    .line 11376
    sub-float/2addr v0, v5

    add-float/2addr v8, v0

    move v4, v5

    .line 11386
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v10

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 11388
    iget v0, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v0, v4

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v6, v0, v1

    .line 11389
    iget v0, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v0, v5

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v7, v0, v1

    .line 11391
    const-string v0, "save"

    const-string v1, "*****************************************************************"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 11393
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->s:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 11394
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->s:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    .line 11396
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ie;->t:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v0, v10

    move-object v0, p0

    move v10, p1

    invoke-direct/range {v0 .. v10}, Lcom/roidapp/photogrid/release/ie;->a(Lcom/roidapp/photogrid/release/ig;Ljava/lang/String;Lcom/roidapp/photogrid/release/lc;FFFFFFZ)[Ljava/lang/String;

    move-result-object v0

    .line 353
    :goto_1
    return-object v0

    .line 11379
    :cond_2
    sub-float v1, v5, v0

    add-float/2addr v9, v1

    move v5, v0

    move v4, v0

    .line 11380
    goto :goto_0

    .line 296
    :cond_3
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->a:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->b:I

    sget-object v3, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v3

    .line 297
    const/16 v0, 0x19

    :try_start_1
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 298
    if-nez v3, :cond_5

    .line 299
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "GridSaveUtils doSave create bitmap oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    .line 343
    :catch_0
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    .line 344
    :goto_2
    invoke-static {v1}, Lcom/roidapp/photogrid/release/ie;->a([Ljava/lang/String;)V

    .line 345
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_4

    .line 346
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 349
    :cond_4
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 350
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "GridSaveUtils doSave() OOM"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 301
    :cond_5
    :try_start_2
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 304
    iget v0, p0, Lcom/roidapp/photogrid/release/ie;->y:I

    if-ne v0, v5, :cond_a

    .line 305
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ie;->c()Z

    move-result v0

    if-nez v0, :cond_9

    .line 306
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ie;->q:Z

    .line 307
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 311
    :goto_3
    const-string v1, ".png"

    .line 312
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 319
    :goto_4
    if-eqz p1, :cond_6

    .line 320
    const-string v1, ".jpg"

    .line 321
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 323
    :cond_6
    const/16 v5, 0x1a

    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ie;->a(I)V

    .line 325
    iget-boolean v5, p0, Lcom/roidapp/photogrid/release/ie;->r:Z

    if-nez v5, :cond_7

    .line 326
    const/4 v5, 0x0

    invoke-direct {p0, v4, v5}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V

    .line 329
    :cond_7
    invoke-direct {p0, v4, p1}, Lcom/roidapp/photogrid/release/ie;->b(Landroid/graphics/Canvas;Z)V

    .line 331
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Canvas;)V

    .line 333
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/release/ie;->b(Landroid/graphics/Canvas;)V

    .line 337
    invoke-direct {p0, v3, v0, v1, p1}, Lcom/roidapp/photogrid/release/ie;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)[Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    .line 339
    const/4 v1, 0x0

    :try_start_3
    aget-object v1, v0, v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget v1, p0, Lcom/roidapp/photogrid/release/ie;->y:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_8

    .line 340
    const/4 v1, 0x1

    aget-object v1, v0, v1

    .line 11762
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x5

    if-le v2, v4, :cond_8

    .line 11765
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/common/bp;->a(Ljava/lang/String;)V

    .line 342
    :cond_8
    const/16 v1, 0x5a

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ie;->a(I)V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    .line 343
    :catch_1
    move-exception v1

    move-object v2, v3

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_2

    .line 309
    :cond_9
    const/4 v0, 0x0

    :try_start_4
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ie;->q:Z

    goto :goto_3

    .line 314
    :cond_a
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ie;->q:Z

    .line 315
    const-string v1, ".jpg"

    .line 316
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 317
    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->drawColor(I)V
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_4

    .line 343
    :catch_2
    move-exception v0

    move-object v1, v2

    goto/16 :goto_2

    :cond_b
    move v4, v0

    goto/16 :goto_0
.end method
