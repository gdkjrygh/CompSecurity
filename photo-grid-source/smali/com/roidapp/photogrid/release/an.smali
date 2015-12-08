.class public final Lcom/roidapp/photogrid/release/an;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:Landroid/graphics/Paint;

.field private C:Landroid/graphics/Paint;

.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:Landroid/graphics/Bitmap;

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

.field private r:I

.field private s:I

.field private t:I

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Landroid/graphics/PorterDuffXfermode;

.field private y:Landroid/graphics/PorterDuffXfermode;

.field private z:Landroid/graphics/PaintFlagsDrawFilter;


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 75
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 28
    iput v2, p0, Lcom/roidapp/photogrid/release/an;->d:I

    .line 32
    const/16 v0, 0x500

    iput v0, p0, Lcom/roidapp/photogrid/release/an;->o:I

    .line 34
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/an;->q:Z

    .line 36
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/an;->u:Z

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    .line 44
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->x:Landroid/graphics/PorterDuffXfermode;

    .line 45
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->y:Landroid/graphics/PorterDuffXfermode;

    .line 46
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->z:Landroid/graphics/PaintFlagsDrawFilter;

    .line 373
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    .line 76
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 78
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;)V

    .line 81
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 87
    int-to-float v0, v0

    const/high16 v1, 0x44a00000    # 1280.0f

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/an;->p:F

    .line 88
    iput p2, p0, Lcom/roidapp/photogrid/release/an;->e:I

    .line 89
    iput p3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    .line 90
    iput-object p1, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    .line 91
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IILjava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 94
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 28
    iput v2, p0, Lcom/roidapp/photogrid/release/an;->d:I

    .line 32
    const/16 v0, 0x500

    iput v0, p0, Lcom/roidapp/photogrid/release/an;->o:I

    .line 34
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/an;->q:Z

    .line 36
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/an;->u:Z

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    .line 44
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->x:Landroid/graphics/PorterDuffXfermode;

    .line 45
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->y:Landroid/graphics/PorterDuffXfermode;

    .line 46
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->z:Landroid/graphics/PaintFlagsDrawFilter;

    .line 373
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 100
    int-to-float v0, v0

    const/high16 v1, 0x44a00000    # 1280.0f

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/an;->p:F

    .line 102
    iput p2, p0, Lcom/roidapp/photogrid/release/an;->e:I

    .line 103
    iput p3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    .line 104
    iput-object p1, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    .line 106
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-static {p4, p2, p3}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    .line 108
    return-void
.end method

.method private varargs declared-synchronized a(II[I)V
    .locals 11

    .prologue
    const/16 v10, -0x14

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 217
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/an;->a()V

    .line 218
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 219
    const/4 v2, 0x1

    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 221
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_17

    .line 222
    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 223
    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    .line 224
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 225
    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    .line 227
    :goto_0
    const/4 v6, 0x0

    iput-boolean v6, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 243
    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    float-to-double v6, v6

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    cmpg-double v6, v6, v8

    if-gez v6, :cond_2

    .line 244
    if-eqz p1, :cond_1

    .line 245
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->a:[I

    aget v7, v7, p1

    iget-object v8, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 246
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->c:[I

    aget v7, v7, p1

    iget-object v8, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 247
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->b:[I

    aget v7, v7, p1

    iget-object v8, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    .line 288
    :goto_1
    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    if-eqz v6, :cond_0

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    if-eqz v6, :cond_0

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    if-nez v6, :cond_4

    .line 289
    :cond_0
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "bg create decodeBitmap null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 249
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    .line 4431
    const v7, 0x7f0200b1

    const/4 v8, 0x0

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 249
    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 250
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    .line 5431
    const v7, 0x7f0200ad

    const/4 v8, 0x0

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 250
    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 251
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    .line 6431
    const v7, 0x7f0200af

    const/4 v8, 0x0

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 251
    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 254
    :cond_2
    if-eqz p1, :cond_3

    .line 255
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->a:[I

    aget v7, v7, p1

    iget v8, p0, Lcom/roidapp/photogrid/release/an;->e:I

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 256
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->c:[I

    aget v7, v7, p1

    iget v8, p0, Lcom/roidapp/photogrid/release/an;->e:I

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 257
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->b:[I

    aget v7, v7, p1

    iget v8, p0, Lcom/roidapp/photogrid/release/an;->e:I

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    goto/16 :goto_1

    .line 259
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    const v7, 0x7f0200b1

    iget v8, p0, Lcom/roidapp/photogrid/release/an;->e:I

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 260
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    const v7, 0x7f0200ad

    iget v8, p0, Lcom/roidapp/photogrid/release/an;->e:I

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 261
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    const v7, 0x7f0200af

    iget v8, p0, Lcom/roidapp/photogrid/release/an;->e:I

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;II)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    goto/16 :goto_1

    .line 291
    :cond_4
    if-eq p2, v10, :cond_8

    .line 292
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    iget-object v7, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    .line 293
    new-instance v6, Landroid/graphics/Canvas;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-direct {v6, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 294
    invoke-virtual {v6, p2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 295
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    .line 305
    :goto_2
    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-nez v6, :cond_5

    .line 306
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 307
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 308
    if-eq p2, v10, :cond_b

    .line 309
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    iget-object v7, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v8}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    .line 310
    new-instance v6, Landroid/graphics/Canvas;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-direct {v6, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 311
    invoke-virtual {v6, p2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 312
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    .line 320
    :cond_5
    :goto_3
    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-nez v6, :cond_6

    .line 321
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v8, 0x4

    aget-object v7, v7, v8

    const/4 v8, 0x4

    aget v7, v7, v8

    iget-object v8, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    iput-object v5, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 324
    :cond_6
    :try_start_2
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    iget v6, p0, Lcom/roidapp/photogrid/release/an;->p:F

    .line 6590
    invoke-static {v5, v6, v6}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 324
    iput-object v5, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 330
    :try_start_3
    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-nez v5, :cond_c

    .line 331
    :cond_7
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "bg create createBitmap null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 299
    :cond_8
    const/4 v6, 0x0

    aget v6, p3, v6

    const/4 v7, 0x2

    if-lt v6, v7, :cond_9

    const/4 v6, 0x0

    aget v6, p3, v6

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->j:[[I

    array-length v7, v7

    add-int/lit8 v7, v7, -0x1

    if-le v6, v7, :cond_a

    .line 300
    :cond_9
    const/4 v6, 0x0

    const/4 v7, 0x2

    aput v7, p3, v6

    .line 301
    const/4 v6, 0x1

    const/4 v7, 0x0

    aput v7, p3, v6

    .line 303
    :cond_a
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v8, 0x0

    aget v8, p3, v8

    aget-object v7, v7, v8

    const/4 v8, 0x1

    aget v8, p3, v8

    aget v7, v7, v8

    iget-object v8, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    goto/16 :goto_2

    .line 316
    :cond_b
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v7

    iget-object v7, v7, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v8, 0x0

    aget v8, p3, v8

    aget-object v7, v7, v8

    const/4 v8, 0x1

    aget v8, p3, v8

    aget v7, v7, v8

    iget-object v8, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-static {v6, v7, v5, v8}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    goto/16 :goto_3

    .line 326
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    .line 327
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "bg create createBitmap null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_c
    if-eqz v4, :cond_d

    .line 334
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 335
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 336
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 337
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 340
    :cond_d
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget v2, p0, Lcom/roidapp/photogrid/release/an;->f:I

    if-le v1, v2, :cond_12

    .line 341
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_e

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_4
    iput v1, p0, Lcom/roidapp/photogrid/release/an;->m:I

    .line 342
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_f

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_5
    iput v1, p0, Lcom/roidapp/photogrid/release/an;->n:I

    .line 343
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 344
    iget v2, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v2, v2

    div-float v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 345
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int v2, v1, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    rem-int/2addr v2, v3

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_6
    iput v1, p0, Lcom/roidapp/photogrid/release/an;->l:I

    .line 348
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->l:I

    if-nez v1, :cond_11

    :goto_7
    iput v0, p0, Lcom/roidapp/photogrid/release/an;->l:I

    .line 349
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 350
    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    .line 351
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 352
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    const/16 v3, -0x5a

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 353
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    const/16 v3, -0x5a

    invoke-static {v1, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    .line 354
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    const/16 v3, -0x5a

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 355
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 356
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 357
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 367
    :goto_8
    monitor-exit p0

    return-void

    .line 341
    :cond_e
    :try_start_4
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    goto/16 :goto_4

    .line 342
    :cond_f
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto/16 :goto_5

    .line 345
    :cond_10
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_6

    .line 348
    :cond_11
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->l:I

    goto :goto_7

    .line 359
    :cond_12
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_13

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_9
    iput v1, p0, Lcom/roidapp/photogrid/release/an;->m:I

    .line 360
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_a
    iput v1, p0, Lcom/roidapp/photogrid/release/an;->n:I

    .line 361
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 362
    iget v2, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v2, v2

    div-float v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 363
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int v2, v1, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    rem-int/2addr v2, v3

    if-eqz v2, :cond_15

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    :goto_b
    iput v1, p0, Lcom/roidapp/photogrid/release/an;->l:I

    .line 365
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->l:I

    if-nez v1, :cond_16

    :goto_c
    iput v0, p0, Lcom/roidapp/photogrid/release/an;->l:I

    goto/16 :goto_8

    .line 359
    :cond_13
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_9

    .line 360
    :cond_14
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_a

    .line 363
    :cond_15
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/2addr v1, v2

    goto :goto_b

    .line 365
    :cond_16
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->l:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_c

    :cond_17
    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    goto/16 :goto_0
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 9

    .prologue
    const/4 v8, -0x1

    const/4 v7, 0x0

    .line 418
    :try_start_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->v:Z

    if-eqz v0, :cond_2

    .line 419
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 421
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 422
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 424
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v0, v0

    int-to-float v1, v3

    div-float/2addr v0, v1

    .line 425
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v1, v1

    int-to-float v5, v4

    div-float/2addr v1, v5

    .line 426
    cmpl-float v5, v0, v1

    if-lez v5, :cond_1

    .line 427
    :goto_0
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    div-int/lit8 v1, v1, 0x2

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v1, v3

    int-to-float v1, v1

    .line 428
    iget v3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    div-int/lit8 v3, v3, 0x2

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 429
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 430
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v2, v0, v0, v1, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 431
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p1, v0, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 518
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    .line 426
    goto :goto_0

    .line 434
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 435
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 436
    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 437
    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v4, v0

    const/16 v5, 0xff

    const/16 v6, 0xc

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayerAlpha(FFFFII)I

    .line 438
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->d:I

    if-ne v0, v8, :cond_3

    .line 439
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/release/an;->r:I

    .line 440
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/release/an;->s:I

    .line 441
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/an;->d:I

    .line 442
    const/4 v0, 0x0

    const/16 v1, -0x14

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->r:I

    aput v4, v2, v3

    const/4 v3, 0x1

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->s:I

    aput v4, v2, v3

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/an;->a(II[I)V

    .line 444
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 445
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->z:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 446
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-nez v0, :cond_4

    .line 447
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->d:I

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->t:I

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->r:I

    aput v4, v2, v3

    const/4 v3, 0x1

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->s:I

    aput v4, v2, v3

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/an;->a(II[I)V

    .line 449
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getDensity()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 451
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->w:Z

    if-nez v0, :cond_6

    move v1, v7

    .line 453
    :goto_2
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->n:I

    if-ge v1, v0, :cond_7

    move v0, v7

    .line 454
    :goto_3
    iget v2, p0, Lcom/roidapp/photogrid/release/an;->m:I

    if-ge v0, v2, :cond_5

    .line 455
    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    mul-int/2addr v3, v0

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int/2addr v4, v1

    int-to-float v4, v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 454
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 453
    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 459
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_7

    .line 460
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 461
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 462
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 464
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v0, v0

    int-to-float v1, v3

    div-float/2addr v0, v1

    .line 465
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v1, v1

    int-to-float v5, v4

    div-float/2addr v1, v5

    .line 466
    cmpl-float v5, v0, v1

    if-lez v5, :cond_8

    .line 467
    :goto_4
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    div-int/lit8 v1, v1, 0x2

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v1, v3

    int-to-float v1, v1

    .line 468
    iget v3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    div-int/lit8 v3, v3, 0x2

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 469
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 470
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v2, v0, v0, v1, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 471
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p1, v0, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 476
    :cond_7
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->u:Z

    if-nez v0, :cond_0

    .line 477
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getDensity()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 478
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getDensity()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 479
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getDensity()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 480
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->y:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 481
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 482
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    if-le v0, v1, :cond_a

    .line 483
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 484
    new-instance v1, Landroid/graphics/RectF;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    iget v5, p0, Lcom/roidapp/photogrid/release/an;->l:I

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    mul-int/2addr v5, v6

    add-int/2addr v4, v5

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 485
    new-instance v2, Landroid/graphics/RectF;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v5, v5

    iget v6, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v6, v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 486
    sget-object v3, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 487
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 488
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 489
    :goto_5
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->l:I

    if-ge v7, v0, :cond_9

    .line 490
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    mul-int/2addr v2, v7

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 489
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_8
    move v0, v1

    .line 466
    goto/16 :goto_4

    .line 492
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget v2, p0, Lcom/roidapp/photogrid/release/an;->l:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    mul-int/2addr v2, v3

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 506
    :goto_6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 508
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->q:Z

    if-eqz v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->x:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 510
    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 516
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_1

    .line 494
    :cond_a
    :try_start_1
    new-instance v0, Landroid/graphics/RectF;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget v5, p0, Lcom/roidapp/photogrid/release/an;->l:I

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    mul-int/2addr v5, v6

    add-int/2addr v4, v5

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 495
    new-instance v1, Landroid/graphics/RectF;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v4, v4

    iget v5, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v5, v5

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 496
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 497
    sget-object v3, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v2, v0, v1, v3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 498
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 499
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    move v0, v7

    .line 500
    :goto_7
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->l:I

    if-ge v0, v1, :cond_b

    .line 501
    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int/2addr v4, v0

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 500
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 503
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v3, p0, Lcom/roidapp/photogrid/release/an;->l:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_6
.end method

.method private declared-synchronized d()V
    .locals 1

    .prologue
    .line 548
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 549
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 550
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    :cond_0
    monitor-exit p0

    return-void

    .line 548
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    .prologue
    .line 529
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 531
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->g:Landroid/graphics/Bitmap;

    .line 533
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 534
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 535
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->h:Landroid/graphics/Bitmap;

    .line 537
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 538
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 539
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->i:Landroid/graphics/Bitmap;

    .line 541
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 542
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 543
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 545
    :cond_3
    monitor-exit p0

    return-void

    .line 529
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(IIII)V
    .locals 5

    .prologue
    .line 199
    iput p1, p0, Lcom/roidapp/photogrid/release/an;->d:I

    .line 200
    iput p3, p0, Lcom/roidapp/photogrid/release/an;->r:I

    .line 201
    iput p4, p0, Lcom/roidapp/photogrid/release/an;->s:I

    .line 202
    iput p2, p0, Lcom/roidapp/photogrid/release/an;->t:I

    .line 203
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->e()Ljava/lang/String;

    move-result-object v0

    .line 204
    if-eqz v0, :cond_0

    .line 205
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/lang/String;)V

    .line 206
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    .line 208
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->c:Z

    .line 209
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->d:I

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->t:I

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->r:I

    aput v4, v2, v3

    const/4 v3, 0x1

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->s:I

    aput v4, v2, v3

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/an;->a(II[I)V

    .line 210
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 142
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/an;->k:Landroid/graphics/Bitmap;

    .line 143
    return-void
.end method

.method public final declared-synchronized a(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 401
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 402
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->c:Z

    if-eqz v0, :cond_1

    .line 403
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getDensity()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Bitmap;->setDensity(I)V

    move v2, v1

    .line 405
    :goto_0
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->n:I

    if-ge v2, v0, :cond_2

    move v0, v1

    .line 406
    :goto_1
    iget v3, p0, Lcom/roidapp/photogrid/release/an;->m:I

    if-ge v0, v3, :cond_0

    .line 407
    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    mul-int/2addr v4, v0

    int-to-float v4, v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    mul-int/2addr v5, v2

    int-to-float v5, v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/an;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 406
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 405
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 411
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    :cond_2
    monitor-exit p0

    return-void

    .line 401
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 119
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget v1, p0, Lcom/roidapp/photogrid/release/an;->f:I

    invoke-static {p1, v0, v1}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    .line 120
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 150
    iput-object p1, p0, Lcom/roidapp/photogrid/release/an;->b:Ljava/lang/String;

    .line 151
    if-eqz p1, :cond_0

    .line 152
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/lang/String;)V

    .line 154
    :cond_0
    iput-boolean p2, p0, Lcom/roidapp/photogrid/release/an;->c:Z

    .line 155
    if-eqz p2, :cond_5

    .line 3188
    if-eqz p1, :cond_2

    .line 3191
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    .line 3192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 3193
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "bg create decodeBitmap null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3195
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    rem-int/2addr v0, v1

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    :goto_0
    iput v0, p0, Lcom/roidapp/photogrid/release/an;->m:I

    .line 3196
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    rem-int/2addr v0, v1

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    :goto_1
    iput v0, p0, Lcom/roidapp/photogrid/release/an;->n:I

    .line 4182
    :cond_2
    :goto_2
    return-void

    .line 3195
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/2addr v0, v1

    goto :goto_0

    .line 3196
    :cond_4
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/2addr v0, v1

    goto :goto_1

    .line 4163
    :cond_5
    if-eqz p1, :cond_2

    .line 4166
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4167
    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4168
    invoke-static {p1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 4169
    iget v1, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v3, p0, Lcom/roidapp/photogrid/release/an;->e:I

    div-int/2addr v1, v3

    .line 4170
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v4, p0, Lcom/roidapp/photogrid/release/an;->f:I

    div-int/2addr v3, v4

    if-le v1, v3, :cond_6

    .line 4171
    iget v1, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    div-int/2addr v1, v3

    .line 4173
    :cond_6
    if-gtz v1, :cond_7

    .line 4176
    :goto_3
    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 4177
    const/4 v0, 0x0

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4178
    invoke-static {p1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 4179
    iget v1, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v1, v1

    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v3, v3

    div-float/2addr v1, v3

    .line 4180
    iget v3, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v3, v3

    iget v2, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v2, v2

    div-float v2, v3, v2

    .line 4181
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_2

    .line 4184
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->j:Landroid/graphics/Bitmap;

    goto :goto_2

    :cond_7
    move v0, v1

    goto :goto_3
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 579
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/an;->v:Z

    .line 580
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 555
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->u:Z

    .line 556
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 587
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/an;->w:Z

    .line 588
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 595
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/an;->A:Z

    .line 596
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 583
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->v:Z

    return v0
.end method

.method protected final onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 522
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 523
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/an;->a()V

    .line 524
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/an;->d()V

    .line 526
    return-void
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 378
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/an;->A:Z

    if-eqz v0, :cond_1

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    .line 380
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    .line 381
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c00b5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 382
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    const/16 v2, 0xe5

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 383
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    const/high16 v2, 0x40000000    # 2.0f

    iget-object v3, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 384
    iget-object v0, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/an;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0006

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 386
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v3, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    move v4, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 387
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    move v3, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 388
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v2, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 389
    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->e:I

    int-to-float v5, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/an;->f:I

    int-to-float v6, v0

    iget-object v7, p0, Lcom/roidapp/photogrid/release/an;->B:Landroid/graphics/Paint;

    move-object v2, p1

    move v4, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 398
    :goto_0
    return-void

    .line 393
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 394
    :cond_2
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/an;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 396
    :cond_3
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/an;->b(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method
