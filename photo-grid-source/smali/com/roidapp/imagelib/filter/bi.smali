.class public final Lcom/roidapp/imagelib/filter/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/e/a;


# static fields
.field private static o:[Ljava/lang/Integer;


# instance fields
.field private a:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field private b:I

.field private c:Lcom/roidapp/imagelib/b/b;

.field private d:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field private e:Landroid/content/Context;

.field private f:Z

.field private g:Ljava/io/InputStream;

.field private h:Landroid/graphics/Bitmap;

.field private i:Landroid/graphics/Bitmap;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private p:I

.field private q:I

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 64
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

    sput-object v0, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput v1, p0, Lcom/roidapp/imagelib/filter/bi;->b:I

    .line 49
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->c:Lcom/roidapp/imagelib/b/b;

    .line 59
    iput-boolean v2, p0, Lcom/roidapp/imagelib/filter/bi;->j:Z

    .line 60
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->k:Z

    .line 61
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->l:Z

    .line 62
    iput-boolean v2, p0, Lcom/roidapp/imagelib/filter/bi;->m:Z

    .line 63
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    .line 65
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/imagelib/filter/bi;->p:I

    .line 66
    iput v1, p0, Lcom/roidapp/imagelib/filter/bi;->q:I

    .line 67
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->r:Z

    .line 68
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->s:Z

    .line 85
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    .line 86
    return-void
.end method

.method private static b(Lcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 3

    .prologue
    .line 1267
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;-><init>()V

    .line 1269
    invoke-virtual {p0}, Lcom/roidapp/imagelib/b/b;->c()I

    move-result v1

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/bi;->c(I)F

    move-result v1

    .line 1270
    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setBrightness(F)V

    .line 4092
    iget v1, p0, Lcom/roidapp/imagelib/b/b;->b:I

    add-int/lit8 v1, v1, 0x64

    .line 1272
    invoke-static {v1}, Lcom/roidapp/imagelib/filter/bi;->d(I)F

    move-result v1

    .line 1273
    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setContrast(F)V

    .line 4103
    iget v1, p0, Lcom/roidapp/imagelib/b/b;->c:I

    add-int/lit8 v1, v1, 0x64

    .line 1275
    invoke-static {v1}, Lcom/roidapp/imagelib/filter/bi;->e(I)F

    move-result v1

    .line 1276
    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setSaturation(F)V

    .line 1278
    invoke-virtual {p0}, Lcom/roidapp/imagelib/b/b;->d()I

    move-result v1

    .line 4331
    int-to-float v1, v1

    const/high16 v2, 0x43340000    # 180.0f

    sub-float/2addr v1, v2

    .line 1279
    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setHue(F)V

    .line 1281
    return-object v0
.end method

.method static c(I)F
    .locals 3

    .prologue
    .line 1291
    const/high16 v0, 0x40000000    # 2.0f

    int-to-float v1, p0

    const/high16 v2, 0x43960000    # 300.0f

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, -0x40800000    # -1.0f

    add-float/2addr v0, v1

    return v0
.end method

.method static d(I)F
    .locals 4

    .prologue
    const/high16 v3, 0x42c80000    # 100.0f

    const/high16 v2, 0x3f800000    # 1.0f

    .line 1299
    const/16 v0, 0x64

    if-le p0, v0, :cond_0

    .line 1300
    const/high16 v0, 0x40400000    # 3.0f

    add-int/lit8 v1, p0, -0x64

    int-to-float v1, v1

    div-float/2addr v1, v3

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    .line 1305
    :goto_0
    return v0

    .line 1302
    :cond_0
    int-to-float v0, p0

    div-float/2addr v0, v3

    mul-float/2addr v0, v2

    const/4 v1, 0x0

    add-float/2addr v0, v1

    goto :goto_0
.end method

.method static e(I)F
    .locals 3

    .prologue
    .line 1312
    const/high16 v0, 0x40000000    # 2.0f

    int-to-float v1, p0

    const/high16 v2, 0x43480000    # 200.0f

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    add-float/2addr v0, v1

    return v0
.end method

.method public static f(I)F
    .locals 3

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v2, 0x42c80000    # 100.0f

    .line 1319
    if-lez p0, :cond_1

    .line 1320
    int-to-float v1, p0

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 1324
    :cond_0
    :goto_0
    return v0

    .line 1321
    :cond_1
    if-gez p0, :cond_0

    .line 1322
    int-to-float v0, p0

    add-float/2addr v0, v2

    div-float/2addr v0, v2

    goto :goto_0
.end method

.method static g(I)F
    .locals 2

    .prologue
    .line 1331
    int-to-float v0, p0

    const/high16 v1, 0x43340000    # 180.0f

    sub-float/2addr v0, v1

    return v0
.end method

.method private h(I)Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 327
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;

    invoke-direct {v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;-><init>(Z)V

    .line 328
    iget v0, p0, Lcom/roidapp/imagelib/filter/bi;->p:I

    .line 3285
    const/high16 v4, 0x3f800000    # 1.0f

    int-to-float v0, v0

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v0, v5

    sub-float v0, v4, v0

    .line 328
    invoke-virtual {v3, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->setMix(F)V

    .line 329
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->k:Z

    if-eqz v0, :cond_6

    .line 330
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    .line 331
    iget v4, p0, Lcom/roidapp/imagelib/filter/bi;->q:I

    sparse-switch v4, :sswitch_data_0

    .line 343
    :goto_0
    sget v4, Lcom/roidapp/imagelib/a/h;->c:I

    sget v5, Lcom/roidapp/imagelib/a/h;->a:I

    if-ne v4, v5, :cond_2

    .line 344
    rem-int/lit8 v4, p1, 0x2

    if-nez v4, :cond_1

    :goto_1
    sget-boolean v4, Lcom/roidapp/imagelib/a/h;->g:Z

    if-eqz v4, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v3, v0, v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 351
    :goto_2
    return-object v3

    .line 333
    :sswitch_0
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_90:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 336
    :sswitch_1
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_180:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 339
    :sswitch_2
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_270:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 344
    :cond_1
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_1

    .line 346
    :cond_2
    rem-int/lit8 v4, p1, 0x2

    if-nez v4, :cond_4

    :goto_3
    rem-int/lit8 v4, p1, 0x2

    if-nez v4, :cond_5

    sget-boolean v4, Lcom/roidapp/imagelib/a/h;->g:Z

    if-nez v4, :cond_3

    move v1, v2

    :cond_3
    :goto_4
    invoke-virtual {v3, v0, v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_2

    :cond_4
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_3

    :cond_5
    sget-boolean v4, Lcom/roidapp/imagelib/a/h;->g:Z

    if-eqz v4, :cond_3

    move v1, v2

    goto :goto_4

    .line 348
    :cond_6
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    iget-boolean v4, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v4, :cond_7

    :goto_5
    invoke-virtual {v3, v0, v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_2

    :cond_7
    move v1, v2

    goto :goto_5

    .line 331
    :sswitch_data_0
    .sparse-switch
        0x5a -> :sswitch_0
        0xb4 -> :sswitch_1
        0x10e -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 81
    iget v0, p0, Lcom/roidapp/imagelib/filter/bi;->p:I

    return v0
.end method

.method public final a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 243
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v2, "processImage"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 245
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->f:Z

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    .line 246
    new-instance v8, Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-direct {v8, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;-><init>(Landroid/content/Context;)V

    .line 247
    invoke-virtual {v8, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Landroid/graphics/Bitmap;)V

    .line 249
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->a:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-nez v0, :cond_0

    .line 250
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->c:Lcom/roidapp/imagelib/b/b;

    move-object v0, p0

    move v5, v1

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    .line 264
    :goto_0
    iget-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->setDarkCorner(Z)V

    .line 265
    invoke-virtual {v8, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 266
    invoke-virtual {v8}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->getBitmapWithFilterApplied()Landroid/graphics/Bitmap;

    move-result-object p1

    .line 267
    if-nez p1, :cond_3

    .line 268
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "create PBuffer failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->a:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v0, :cond_1

    .line 252
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->a:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->c:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    goto :goto_0

    .line 254
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->a:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/imagelib/filter/bi;->c:Lcom/roidapp/imagelib/b/b;

    move-object v2, p0

    move v7, v1

    invoke-virtual/range {v2 .. v7}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    goto :goto_0

    .line 270
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 274
    :goto_1
    return-object p1

    .line 273
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto :goto_1
.end method

.method public final a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 10

    .prologue
    .line 439
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 452
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 454
    iget-boolean v2, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v2, :cond_0

    .line 455
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;-><init>()V

    .line 456
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->ae:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 459
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 461
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 1248
    :cond_1
    :goto_0
    :pswitch_0
    iget-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->j:Z

    if-eqz v1, :cond_2

    .line 1249
    invoke-static {p4}, Lcom/roidapp/imagelib/filter/bi;->b(Lcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1250
    :cond_2
    iget-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->m:Z

    if-eqz v1, :cond_3

    .line 1251
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/filter/bi;->h(I)Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1252
    :cond_3
    iget-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->k:Z

    if-eqz v1, :cond_4

    .line 1253
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    .line 1254
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1257
    :cond_4
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    invoke-direct {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    .line 1258
    return-object v1

    .line 465
    :pswitch_1
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 466
    const/16 v3, -0x64

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 468
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 469
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/i;->I:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 472
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 473
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 477
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;-><init>()V

    .line 478
    const-string v5, "#ff63ce"

    const v6, 0x3da3d70a    # 0.08f

    invoke-virtual {v1, v5, v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->setColor(Ljava/lang/String;F)V

    .line 480
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 481
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 482
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 483
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 486
    :pswitch_2
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageThresholdFilter;-><init>()V

    .line 488
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 489
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/i;->w:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 492
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 493
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 497
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 498
    const/16 v5, -0x64

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v5

    invoke-virtual {v1, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 500
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 501
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 503
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 506
    :pswitch_3
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 507
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->as:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 510
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 511
    const/16 v4, -0x64

    invoke-static {v4}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 513
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 514
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/f;->bh:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 518
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 519
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 520
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 523
    :pswitch_4
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 524
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->A:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 527
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 528
    const/16 v3, -0x14

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 530
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 531
    const/high16 v4, 0x40400000    # 3.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 533
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 534
    const/16 v5, 0x1b

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 536
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 537
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 538
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 539
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 542
    :pswitch_5
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 543
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->q:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 546
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 547
    const/16 v3, -0x11

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 549
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 550
    const/high16 v4, 0x40400000    # 3.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 552
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 553
    const/16 v5, 0x14

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 555
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 556
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 558
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 561
    :pswitch_6
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 562
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->aw:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 565
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 566
    const/16 v3, -0x16

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 568
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 569
    const/high16 v4, 0x40400000    # 3.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 571
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 572
    const/16 v5, 0x1b

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 574
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 575
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 576
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 577
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 580
    :pswitch_7
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 581
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->i:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 584
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 585
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/f;->bg:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 589
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;-><init>()V

    .line 590
    const-string v4, "#773d0a"

    const v5, 0x3df5c28f    # 0.12f

    invoke-virtual {v1, v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->setColor(Ljava/lang/String;F)V

    .line 592
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 593
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 594
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 597
    :pswitch_8
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 598
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->D:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 601
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 602
    const/4 v3, 0x2

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 604
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 605
    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 607
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 608
    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 610
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 611
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 612
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 613
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 616
    :pswitch_9
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 617
    const/16 v3, 0x14

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 619
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 620
    const/high16 v4, 0x41200000    # 10.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 622
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 623
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/i;->f:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 626
    new-instance v5, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 627
    iget-object v6, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v8, v1, v1

    invoke-static {v6, v7, v1, v8}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 631
    new-instance v6, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 632
    iget-object v7, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/imagelib/f;->bf:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 635
    invoke-virtual {p0, v6}, Lcom/roidapp/imagelib/filter/bi;->b(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 636
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 637
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 638
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 640
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 643
    :pswitch_a
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 644
    const/16 v2, -0x64

    invoke-static {v2}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 646
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 647
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->c:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 650
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 651
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 654
    :pswitch_b
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 655
    const/16 v3, 0x1e

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 657
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 658
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/i;->z:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 661
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 662
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v7, v1, v1

    invoke-static {v5, v6, v1, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 665
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 666
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 667
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 670
    :pswitch_c
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 671
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->F:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 674
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 675
    const/16 v3, 0xa

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 677
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 678
    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 680
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;-><init>()V

    .line 681
    const-string v5, "#957574"

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;->setColor(Ljava/lang/String;)V

    .line 683
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 684
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 685
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 686
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 689
    :pswitch_d
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 690
    const/16 v3, 0x14

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 692
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 693
    const/high16 v4, 0x41200000    # 10.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 695
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 696
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/i;->av:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 700
    new-instance v5, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;

    invoke-direct {v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;-><init>()V

    .line 701
    const-string v6, "#8c8168"

    invoke-virtual {v5, v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;->setColor(Ljava/lang/String;)V

    .line 703
    new-instance v6, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 704
    iget-object v7, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 708
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 709
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 710
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 711
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 712
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 715
    :pswitch_e
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 716
    const/high16 v2, -0x40000000    # -2.0f

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 718
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 719
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->h:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 722
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 723
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 726
    :pswitch_f
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 727
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 731
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 732
    const/16 v3, 0xd

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 734
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 735
    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 737
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 738
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/i;->e:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 741
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 742
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 743
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 744
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 747
    :pswitch_10
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 748
    const/4 v3, 0x6

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 750
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 751
    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 753
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 754
    const/16 v5, -0xa

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 756
    new-instance v5, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 757
    iget-object v6, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/imagelib/i;->p:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 760
    new-instance v6, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 761
    iget-object v7, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/imagelib/f;->al:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 765
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 766
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 767
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 768
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 769
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 772
    :pswitch_11
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 773
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aP:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 776
    invoke-virtual {p0, v2}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 777
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 778
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->C:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 781
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 782
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 785
    :pswitch_12
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 786
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->a:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 789
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 790
    const/16 v3, -0xa

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 792
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 793
    const/16 v4, -0x64

    invoke-static {v4}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 795
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 796
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 797
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 800
    :pswitch_13
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 801
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->y:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 804
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 805
    const/4 v4, -0x5

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 807
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 808
    const/16 v5, 0xe

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 810
    new-instance v5, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;

    invoke-direct {v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;-><init>()V

    .line 811
    const-string v6, "#fcc5b5"

    const v7, 0x3e8a3d71    # 0.27f

    invoke-virtual {v5, v6, v7}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->setColor(Ljava/lang/String;F)V

    .line 813
    new-instance v6, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 814
    iget-object v7, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/imagelib/f;->aI:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 818
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 819
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 820
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 821
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 822
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 825
    :pswitch_14
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 826
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->E:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 829
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 830
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/f;->aS:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 833
    invoke-virtual {p0, v3}, Lcom/roidapp/imagelib/filter/bi;->b(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 845
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 846
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 852
    :pswitch_15
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 853
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->au:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 856
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 857
    const/4 v4, -0x3

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 859
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 860
    const/16 v5, 0xc

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 862
    new-instance v5, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 863
    iget-object v6, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/imagelib/f;->bm:I

    mul-int v8, v1, v1

    invoke-static {v6, v7, v1, v8}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 866
    invoke-virtual {p0, v5}, Lcom/roidapp/imagelib/filter/bi;->b(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 870
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 871
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 872
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 873
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 876
    :pswitch_16
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 877
    const/16 v3, 0x9

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 879
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 880
    const/16 v3, -0xc

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 882
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;-><init>()V

    .line 883
    const/high16 v4, 0x41200000    # 10.0f

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageHueFilter;->setHue(F)V

    .line 885
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 886
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/i;->d:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 889
    new-instance v5, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;

    invoke-direct {v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;-><init>()V

    .line 890
    const-string v6, "#85ecff"

    const v7, 0x3df5c28f    # 0.12f

    invoke-virtual {v5, v6, v7}, Ljp/co/cyberagent/android/gpuimage/GPUImageNormalBlendColorFilter;->setColor(Ljava/lang/String;F)V

    .line 892
    new-instance v6, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 893
    iget-object v7, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/roidapp/imagelib/f;->i:I

    mul-int v9, v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 896
    invoke-virtual {p0, v6}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 897
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 898
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 899
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 900
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 901
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 904
    :pswitch_17
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 905
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aj:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 908
    invoke-virtual {p0, v2}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 910
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 911
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->o:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 915
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 916
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 919
    :pswitch_18
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 920
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aN:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 923
    invoke-virtual {p0, v2}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V

    .line 925
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 926
    const/16 v3, 0xe

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 928
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 929
    const/16 v4, -0x14

    invoke-static {v4}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v4

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 931
    new-instance v4, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 932
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/roidapp/imagelib/i;->B:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 935
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 936
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 937
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 938
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 941
    :pswitch_19
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 942
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->b:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 945
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>()V

    .line 946
    const/16 v3, -0x64

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;->setSaturation(F)V

    .line 948
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;-><init>()V

    .line 949
    const/16 v4, 0x21

    invoke-virtual {v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageLuminosityFilter;->setLuminosity(I)V

    .line 951
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 952
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 953
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 956
    :pswitch_1a
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 957
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->m:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 960
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 961
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 965
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 966
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 969
    :pswitch_1b
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 970
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->at:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 973
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 974
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 979
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 980
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 983
    :pswitch_1c
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 984
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->K:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 987
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 988
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 992
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 993
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 996
    :pswitch_1d
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 997
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/i;->ar:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1000
    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1001
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/f;->aY:I

    mul-int v6, v1, v1

    invoke-static {v4, v5, v1, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1005
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1006
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1010
    :pswitch_1e
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1011
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1014
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1016
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1017
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->t:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1019
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1021
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1025
    :pswitch_1f
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1026
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aY:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1029
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1031
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1032
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->k:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1034
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1038
    :pswitch_20
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1039
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aY:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1042
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1044
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1045
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->s:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1047
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1051
    :pswitch_21
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1052
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1055
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1057
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1058
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->n:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1060
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1064
    :pswitch_22
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1066
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1067
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aY:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1070
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1072
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1073
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->H:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1075
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1079
    :pswitch_23
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1081
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1082
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1085
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1087
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1088
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->g:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1090
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1094
    :pswitch_24
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1096
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1097
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1100
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1102
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1103
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->G:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1105
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1109
    :pswitch_25
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1111
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1112
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1115
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1117
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1118
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->x:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1120
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1124
    :pswitch_26
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1126
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1127
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1130
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1132
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1133
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->r:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1135
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1139
    :pswitch_27
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1140
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1143
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1145
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1146
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->u:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1148
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1152
    :pswitch_28
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const v3, 0x3fb33333    # 1.4f

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1154
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1155
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1158
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1160
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1161
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->l:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1163
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1167
    :pswitch_29
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1168
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1171
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1173
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const v2, 0x3f4ccccd    # 0.8f

    invoke-direct {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1175
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1176
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->J:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1178
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1182
    :pswitch_2a
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1183
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aX:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1186
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1188
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1189
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->j:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1191
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1195
    :pswitch_2b
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-direct {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSaturationFilter;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1197
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1198
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->aY:I

    mul-int v5, v1, v1

    invoke-static {v3, v4, v1, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1201
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1203
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1204
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/i;->v:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1206
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1210
    :pswitch_2c
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSketchFilter;

    invoke-direct {v1, p2, p3, p5}, Ljp/co/cyberagent/android/gpuimage/GPUImageSketchFilter;-><init>(IIZ)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1213
    :pswitch_2d
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;

    invoke-direct {v1, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageSimpleSketchFilter;-><init>(II)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1214
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->g:Ljava/io/InputStream;

    if-eqz v1, :cond_5

    .line 1215
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1216
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->g:Ljava/io/InputStream;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1217
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1219
    :cond_5
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_6

    .line 1220
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageScreenBlendFilter;-><init>()V

    .line 1221
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1222
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1224
    :cond_6
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1225
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;-><init>()V

    .line 1226
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1227
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1231
    :pswitch_2e
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_7

    .line 1232
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayBlendFilter;-><init>()V

    .line 1233
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 1234
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1237
    :cond_7
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->g:Ljava/io/InputStream;

    if-eqz v1, :cond_1

    .line 1238
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;-><init>()V

    .line 1239
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bi;->g:Ljava/io/InputStream;

    invoke-virtual {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->setFromCurveFileInputStream(Ljava/io/InputStream;)V

    .line 1240
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
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
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 278
    .line 279
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 280
    new-instance v3, Lcom/roidapp/imagelib/filter/a/b;

    invoke-direct {v3}, Lcom/roidapp/imagelib/filter/a/b;-><init>()V

    .line 281
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v6, v1}, Lcom/roidapp/imagelib/filter/a/b;->a(ILjava/lang/Object;)V

    .line 282
    const/4 v1, 0x1

    mul-int v4, v2, v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lcom/roidapp/imagelib/filter/a/b;->a(ILjava/lang/Object;)V

    .line 3071
    iget v1, p1, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->b:I

    .line 283
    packed-switch v1, :pswitch_data_0

    move-object v1, v0

    .line 299
    :goto_0
    if-nez v1, :cond_0

    .line 321
    :goto_1
    return-object v0

    .line 290
    :pswitch_0
    new-instance v1, Lcom/roidapp/imagelib/filter/a/a/b;

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-direct {v1, p0, v4, p1}, Lcom/roidapp/imagelib/filter/a/a/b;-><init>(Lcom/roidapp/imagelib/filter/bi;Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V

    goto :goto_0

    .line 293
    :pswitch_1
    new-instance v1, Lcom/roidapp/imagelib/filter/a/a/a;

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-direct {v1, p0, v4, p1}, Lcom/roidapp/imagelib/filter/a/a/a;-><init>(Lcom/roidapp/imagelib/filter/bi;Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V

    goto :goto_0

    .line 296
    :pswitch_2
    new-instance v1, Lcom/roidapp/imagelib/filter/a/a/c;

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-direct {v1, p0, v4, p1}, Lcom/roidapp/imagelib/filter/a/a/c;-><init>(Lcom/roidapp/imagelib/filter/bi;Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V

    goto :goto_0

    .line 302
    :cond_0
    invoke-interface {v1, v3}, Lcom/roidapp/imagelib/filter/a/a;->a(Lcom/roidapp/imagelib/filter/a/b;)Ljava/util/List;

    move-result-object v1

    .line 303
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v0, :cond_1

    .line 304
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;-><init>()V

    .line 305
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bi;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/f;->ae:I

    mul-int v5, v2, v2

    invoke-static {v3, v4, v2, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageMultiplyBlendFilter;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 308
    invoke-interface {v1, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 310
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->j:Z

    if-eqz v0, :cond_2

    .line 311
    invoke-static {p4}, Lcom/roidapp/imagelib/filter/bi;->b(Lcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->m:Z

    if-eqz v0, :cond_3

    .line 313
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/bi;->h(I)Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->k:Z

    if-eqz v0, :cond_4

    .line 316
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_4

    .line 317
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    :cond_4
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;-><init>(Ljava/util/List;)V

    goto :goto_1

    .line 283
    :pswitch_data_0
    .packed-switch 0x3fd
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 77
    iput p1, p0, Lcom/roidapp/imagelib/filter/bi;->p:I

    .line 78
    return-void
.end method

.method public final a(IZZ)V
    .locals 0

    .prologue
    .line 71
    iput p1, p0, Lcom/roidapp/imagelib/filter/bi;->q:I

    .line 72
    iput-boolean p2, p0, Lcom/roidapp/imagelib/filter/bi;->r:Z

    .line 73
    iput-boolean p3, p0, Lcom/roidapp/imagelib/filter/bi;->s:Z

    .line 74
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/b/b;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bi;->c:Lcom/roidapp/imagelib/b/b;

    .line 117
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/b/b;I)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bi;->c:Lcom/roidapp/imagelib/b/b;

    .line 112
    iput p2, p0, Lcom/roidapp/imagelib/filter/bi;->b:I

    .line 113
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bi;->a:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 125
    return-void
.end method

.method public final a(Ljava/io/InputStream;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bi;->g:Ljava/io/InputStream;

    .line 141
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 144
    if-eqz p1, :cond_0

    .line 146
    :try_start_0
    sget-object v0, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v2, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-static {p1, v0, v1}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 168
    :goto_0
    return-void

    .line 149
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 151
    :try_start_1
    sget-object v0, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v2, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-static {p1, v0, v1}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 153
    :catch_1
    move-exception v0

    .line 154
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 155
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 156
    :catch_2
    move-exception v0

    .line 157
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 158
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 160
    :catch_3
    move-exception v0

    .line 161
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 162
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 165
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public final a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bi;->d:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 129
    return-void
.end method

.method public final a(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 355
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    .line 356
    iget v3, p0, Lcom/roidapp/imagelib/filter/bi;->q:I

    sparse-switch v3, :sswitch_data_0

    .line 367
    :goto_0
    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/bi;->k:Z

    if-eqz v3, :cond_2

    .line 368
    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v3, :cond_0

    .line 369
    iget-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->r:Z

    invoke-virtual {p1, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 384
    :goto_1
    return-void

    .line 358
    :sswitch_0
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_90:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 361
    :sswitch_1
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_180:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 364
    :sswitch_2
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_270:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 371
    :cond_0
    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/bi;->r:Z

    if-nez v3, :cond_1

    move v1, v2

    :cond_1
    invoke-virtual {p1, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 374
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->l:Z

    if-eqz v0, :cond_4

    .line 375
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v0, :cond_3

    .line 376
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 378
    :cond_3
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 381
    :cond_4
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 356
    nop

    :sswitch_data_0
    .sparse-switch
        0x5a -> :sswitch_0
        0xb4 -> :sswitch_1
        0x10e -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 97
    iput-boolean p1, p0, Lcom/roidapp/imagelib/filter/bi;->k:Z

    .line 98
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->j:Z

    .line 90
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 120
    iput p1, p0, Lcom/roidapp/imagelib/filter/bi;->b:I

    .line 121
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 171
    if-eqz p1, :cond_0

    .line 173
    :try_start_0
    sget-object v0, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v2, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-static {p1, v0, v1}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 195
    :goto_0
    return-void

    .line 176
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->h:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 178
    :try_start_1
    sget-object v0, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v2, Lcom/roidapp/imagelib/filter/bi;->o:[Ljava/lang/Integer;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-static {p1, v0, v1}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 180
    :catch_1
    move-exception v0

    .line 181
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 182
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 183
    :catch_2
    move-exception v0

    .line 184
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 185
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 187
    :catch_3
    move-exception v0

    .line 188
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 189
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 192
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->i:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public final b(Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 387
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    .line 388
    iget v3, p0, Lcom/roidapp/imagelib/filter/bi;->q:I

    sparse-switch v3, :sswitch_data_0

    .line 400
    :goto_0
    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/bi;->k:Z

    if-eqz v3, :cond_2

    .line 401
    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v3, :cond_1

    .line 402
    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/bi;->r:Z

    if-nez v3, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {p1, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 432
    :goto_1
    return-void

    .line 390
    :sswitch_0
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_90:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 393
    :sswitch_1
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_180:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 396
    :sswitch_2
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_270:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_0

    .line 404
    :cond_1
    iget-boolean v1, p0, Lcom/roidapp/imagelib/filter/bi;->r:Z

    invoke-virtual {p1, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 407
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->l:Z

    if-eqz v0, :cond_5

    .line 408
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v0, :cond_4

    .line 409
    sget v0, Lcom/roidapp/imagelib/a/h;->c:I

    sget v2, Lcom/roidapp/imagelib/a/h;->a:I

    if-ne v0, v2, :cond_3

    .line 410
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 412
    :cond_3
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 416
    :cond_4
    sget v0, Lcom/roidapp/imagelib/a/h;->c:I

    sget v3, Lcom/roidapp/imagelib/a/h;->a:I

    if-eq v0, v3, :cond_6

    .line 419
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 424
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    if-eqz v0, :cond_6

    .line 425
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 427
    :cond_6
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p1, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    goto :goto_1

    .line 388
    nop

    :sswitch_data_0
    .sparse-switch
        0x5a -> :sswitch_0
        0xb4 -> :sswitch_1
        0x10e -> :sswitch_2
    .end sparse-switch
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 100
    iput-boolean p1, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->l:Z

    .line 94
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 197
    const-string v0, "sketch_filter"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    const/16 v0, 0x14

    iput v0, p0, Lcom/roidapp/imagelib/filter/bi;->b:I

    .line 204
    :goto_0
    return-void

    .line 199
    :cond_0
    const-string v0, "color_filter"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    const/16 v0, 0x15

    iput v0, p0, Lcom/roidapp/imagelib/filter/bi;->b:I

    goto :goto_0

    .line 202
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/filter/bi;->b:I

    goto :goto_0
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 132
    iput-boolean p1, p0, Lcom/roidapp/imagelib/filter/bi;->f:Z

    .line 133
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 103
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->n:Z

    return v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/bi;->m:Z

    .line 108
    return-void
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 136
    iget v0, p0, Lcom/roidapp/imagelib/filter/bi;->b:I

    return v0
.end method

.method public final g()Lcom/roidapp/imagelib/b/b;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->c:Lcom/roidapp/imagelib/b/b;

    return-object v0
.end method

.method public final h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->d:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    return-object v0
.end method

.method public final i()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->a:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    return-object v0
.end method

.method public final j()V
    .locals 5

    .prologue
    .line 229
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->d:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    if-nez v0, :cond_1

    .line 240
    :cond_0
    return-void

    .line 230
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->d:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    instance-of v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bi;->d:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    .line 232
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->getFilters()Ljava/util/List;

    move-result-object v0

    .line 233
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 234
    instance-of v2, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;

    if-eqz v2, :cond_2

    .line 235
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;

    .line 236
    iget v2, p0, Lcom/roidapp/imagelib/filter/bi;->p:I

    .line 2285
    const/high16 v3, 0x3f800000    # 1.0f

    int-to-float v2, v2

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    sub-float v2, v3, v2

    .line 236
    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->setMix(F)V

    goto :goto_0
.end method
