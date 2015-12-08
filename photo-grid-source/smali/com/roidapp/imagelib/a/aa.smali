.class public Lcom/roidapp/imagelib/a/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static s:Z


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private D:Z

.field private E:I

.field private F:Z

.field private G:Z

.field protected a:Landroid/app/Activity;

.field protected b:Landroid/hardware/Camera;

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/hardware/Camera$Size;",
            ">;"
        }
    .end annotation
.end field

.field protected d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/hardware/Camera$Size;",
            ">;"
        }
    .end annotation
.end field

.field protected e:Landroid/hardware/Camera$Size;

.field protected f:Landroid/hardware/Camera$Size;

.field protected g:Landroid/os/Handler;

.field protected h:Ljp/co/cyberagent/android/gpuimage/GPUImage;

.field i:Lcom/roidapp/imagelib/a/ag;

.field protected j:I

.field protected k:I

.field protected l:F

.field protected m:F

.field protected n:Z

.field protected o:Z

.field p:Landroid/hardware/Camera$ShutterCallback;

.field q:Landroid/hardware/Camera$PictureCallback;

.field r:Landroid/hardware/Camera$PictureCallback;

.field private t:Landroid/content/Context;

.field private u:Landroid/hardware/Camera$Parameters;

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 56
    sput-boolean v2, Lcom/roidapp/imagelib/a/aa;->s:Z

    .line 94
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "ZTE U930HD"

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roidapp/imagelib/a/aa;->H:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;IILjp/co/cyberagent/android/gpuimage/GPUImage;)V
    .locals 4

    .prologue
    const/16 v3, 0x9

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput v1, p0, Lcom/roidapp/imagelib/a/aa;->v:I

    .line 73
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/a/aa;->y:I

    .line 82
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/aa;->D:Z

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->i:Lcom/roidapp/imagelib/a/ag;

    .line 89
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/aa;->n:Z

    .line 112
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/aa;->o:Z

    .line 805
    new-instance v0, Lcom/roidapp/imagelib/a/ac;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/ac;-><init>(Lcom/roidapp/imagelib/a/aa;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->p:Landroid/hardware/Camera$ShutterCallback;

    .line 811
    new-instance v0, Lcom/roidapp/imagelib/a/ad;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/ad;-><init>(Lcom/roidapp/imagelib/a/aa;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->q:Landroid/hardware/Camera$PictureCallback;

    .line 817
    new-instance v0, Lcom/roidapp/imagelib/a/ae;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/ae;-><init>(Lcom/roidapp/imagelib/a/aa;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->r:Landroid/hardware/Camera$PictureCallback;

    .line 115
    iput-object p1, p0, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    .line 116
    iput-object p1, p0, Lcom/roidapp/imagelib/a/aa;->t:Landroid/content/Context;

    .line 117
    iput p3, p0, Lcom/roidapp/imagelib/a/aa;->x:I

    .line 118
    iput-object p4, p0, Lcom/roidapp/imagelib/a/aa;->h:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    .line 120
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_2

    .line 121
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    if-le v0, p2, :cond_1

    .line 122
    iput p2, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    .line 129
    :goto_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    if-le v0, v2, :cond_0

    .line 130
    iput-boolean v2, p0, Lcom/roidapp/imagelib/a/aa;->D:Z

    .line 133
    :cond_0
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_3

    .line 134
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    .line 138
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    .line 139
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->c:Ljava/util/List;

    .line 140
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->d:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    return-void

    .line 124
    :cond_1
    iput v1, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    goto :goto_0

    .line 127
    :cond_2
    iput v1, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    goto :goto_0

    .line 136
    :cond_3
    :try_start_1
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 142
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 143
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    throw v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/aa;)I
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 150
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->E:I

    return v0
.end method

.method protected final a(Landroid/hardware/Camera$Size;)Landroid/hardware/Camera$Size;
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 519
    const/4 v5, 0x0

    .line 520
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 521
    invoke-virtual {v0, p1}, Landroid/hardware/Camera$Size;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 544
    :goto_0
    return-object v0

    .line 529
    :cond_1
    iget v0, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-float v0, v0

    iget v1, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-float v1, v1

    div-float v6, v0, v1

    .line 532
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 533
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v4, v3

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 534
    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    int-to-float v1, v1

    iget v8, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-float v8, v8

    div-float/2addr v1, v8

    .line 535
    sub-float v1, v6, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 536
    cmpg-float v8, v1, v2

    if-gtz v8, :cond_2

    iget v8, v0, Landroid/hardware/Camera$Size;->width:I

    if-ge v8, v4, :cond_3

    iget v8, v0, Landroid/hardware/Camera$Size;->height:I

    if-ge v8, v3, :cond_3

    :cond_2
    cmpg-float v8, v1, v2

    if-gez v8, :cond_5

    .line 539
    :cond_3
    iget v3, v0, Landroid/hardware/Camera$Size;->width:I

    .line 540
    iget v2, v0, Landroid/hardware/Camera$Size;->height:I

    move v9, v1

    move v1, v2

    move v2, v3

    move-object v3, v0

    move v0, v9

    :goto_2
    move v4, v2

    move-object v5, v3

    move v2, v0

    move v3, v1

    .line 542
    goto :goto_1

    :cond_4
    move-object v0, v5

    .line 544
    goto :goto_0

    :cond_5
    move v0, v2

    move v1, v3

    move v2, v4

    move-object v3, v5

    goto :goto_2
.end method

.method protected final a(ZII)Landroid/hardware/Camera$Size;
    .locals 10

    .prologue
    const/16 v4, 0x2d0

    .line 453
    if-eqz p1, :cond_0

    .line 461
    :goto_0
    sget-boolean v0, Lcom/roidapp/imagelib/a/aa;->s:Z

    if-eqz v0, :cond_2

    .line 463
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 464
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  w: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", h: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    move v9, p3

    move p3, p2

    move p2, v9

    .line 458
    goto :goto_0

    .line 467
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 468
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  w: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", h: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 473
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->c:Ljava/util/List;

    new-instance v1, Lcom/roidapp/imagelib/a/ab;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/a/ab;-><init>(Lcom/roidapp/imagelib/a/aa;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 490
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 491
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 492
    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    move v2, v1

    move v1, v0

    .line 499
    :goto_3
    int-to-float v0, p3

    int-to-float v3, p2

    div-float v6, v0, v3

    .line 502
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 503
    const/4 v3, 0x0

    .line 504
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 505
    iget v4, v0, Landroid/hardware/Camera$Size;->width:I

    int-to-float v4, v4

    iget v8, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-float v8, v8

    div-float/2addr v4, v8

    .line 506
    sub-float v4, v6, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 507
    cmpg-float v8, v4, v5

    if-gtz v8, :cond_3

    iget v8, v0, Landroid/hardware/Camera$Size;->width:I

    if-le v8, v2, :cond_4

    iget v8, v0, Landroid/hardware/Camera$Size;->height:I

    if-le v8, v1, :cond_4

    :cond_3
    cmpg-float v8, v4, v5

    if-gez v8, :cond_7

    :cond_4
    move v3, v4

    :goto_5
    move v5, v3

    move-object v3, v0

    .line 513
    goto :goto_4

    :cond_5
    move v1, p2

    move v2, p3

    .line 495
    goto :goto_3

    .line 515
    :cond_6
    return-object v3

    :cond_7
    move-object v0, v3

    move v3, v5

    goto :goto_5
.end method

.method public final a(FF)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 246
    :goto_0
    return-void

    .line 230
    :cond_0
    iput p1, p0, Lcom/roidapp/imagelib/a/aa;->l:F

    .line 231
    iput p2, p0, Lcom/roidapp/imagelib/a/aa;->m:F

    .line 233
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 235
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 302
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 318
    :goto_0
    return-void

    .line 306
    :cond_0
    :try_start_0
    iput p1, p0, Lcom/roidapp/imagelib/a/aa;->B:I

    .line 307
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->B:I

    iget v1, p0, Lcom/roidapp/imagelib/a/aa;->A:I

    if-le v0, v1, :cond_1

    .line 308
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->A:I

    iput v0, p0, Lcom/roidapp/imagelib/a/aa;->B:I

    .line 309
    :cond_1
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->B:I

    if-gez v0, :cond_2

    .line 310
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/a/aa;->B:I

    .line 312
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    iget v1, p0, Lcom/roidapp/imagelib/a/aa;->B:I

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setZoom(I)V

    .line 314
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 316
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 0

    .prologue
    .line 607
    iput p1, p0, Lcom/roidapp/imagelib/a/aa;->y:I

    .line 608
    iput p2, p0, Lcom/roidapp/imagelib/a/aa;->z:I

    .line 609
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 344
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-nez v0, :cond_1

    .line 360
    :cond_0
    :goto_0
    return-void

    .line 346
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/aa;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 349
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    .line 350
    if-eqz p1, :cond_2

    .line 351
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const-string v1, "on"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 355
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 357
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 353
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const-string v1, "off"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method protected final a(Landroid/hardware/Camera$Size;ZIILandroid/view/View;)Z
    .locals 6

    .prologue
    .line 550
    if-eqz p2, :cond_4

    .line 551
    iget v0, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-float v0, v0

    .line 552
    iget v1, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-float v1, v1

    move v2, v1

    move v1, v0

    .line 559
    :goto_0
    int-to-float v0, p4

    div-float v3, v0, v1

    .line 560
    int-to-float v0, p3

    div-float/2addr v0, v2

    .line 561
    iget v4, p0, Lcom/roidapp/imagelib/a/aa;->x:I

    sget v5, Lcom/roidapp/imagelib/a/af;->a:I

    if-ne v4, v5, :cond_5

    .line 563
    cmpg-float v4, v3, v0

    if-ltz v4, :cond_0

    move v3, v0

    .line 576
    :cond_0
    :goto_1
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 578
    mul-float/2addr v1, v3

    float-to-int v1, v1

    .line 579
    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 580
    sget-boolean v3, Lcom/roidapp/imagelib/a/aa;->s:Z

    if-eqz v3, :cond_1

    .line 581
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Preview Layout Size - w: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", h: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 586
    :cond_1
    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    move-result v3

    if-eq v1, v3, :cond_6

    .line 587
    :cond_2
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 588
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 589
    iget v3, p0, Lcom/roidapp/imagelib/a/aa;->y:I

    if-ltz v3, :cond_3

    .line 590
    iget v3, p0, Lcom/roidapp/imagelib/a/aa;->z:I

    div-int/lit8 v1, v1, 0x2

    sub-int v1, v3, v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 591
    iget v1, p0, Lcom/roidapp/imagelib/a/aa;->y:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 593
    :cond_3
    invoke-virtual {p5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 594
    const/4 v0, 0x1

    .line 599
    :goto_2
    return v0

    .line 554
    :cond_4
    iget v0, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-float v0, v0

    .line 555
    iget v1, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-float v1, v1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 569
    :cond_5
    cmpg-float v4, v3, v0

    if-gez v4, :cond_0

    move v3, v0

    goto :goto_1

    .line 596
    :cond_6
    const/4 v0, 0x0

    goto :goto_2
.end method

.method protected final b(Z)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 656
    .line 658
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x8

    if-ge v0, v3, :cond_6

    .line 659
    if-eqz p1, :cond_5

    .line 660
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const-string v2, "orientation"

    const-string v3, "portrait"

    invoke-virtual {v0, v2, v3}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v1

    move v0, v1

    .line 700
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->e:Landroid/hardware/Camera$Size;

    iget v4, v4, Landroid/hardware/Camera$Size;->width:I

    iget-object v5, p0, Lcom/roidapp/imagelib/a/aa;->e:Landroid/hardware/Camera$Size;

    iget v5, v5, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4, v5}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 701
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->f:Landroid/hardware/Camera$Size;

    iget v4, v4, Landroid/hardware/Camera$Size;->width:I

    iget-object v5, p0, Lcom/roidapp/imagelib/a/aa;->f:Landroid/hardware/Camera$Size;

    iget v5, v5, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4, v5}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    .line 703
    sget-boolean v3, Lcom/roidapp/imagelib/a/aa;->s:Z

    if-eqz v3, :cond_1

    .line 704
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Preview Actual Size - w: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->e:Landroid/hardware/Camera$Size;

    iget v4, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", h: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->e:Landroid/hardware/Camera$Size;

    iget v4, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 705
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Picture Actual Size - w: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->f:Landroid/hardware/Camera$Size;

    iget v4, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", h: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->f:Landroid/hardware/Camera$Size;

    iget v4, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 708
    :cond_1
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v3

    .line 709
    if-eqz v3, :cond_2

    const-string v4, "auto"

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 711
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const-string v4, "auto"

    invoke-virtual {v3, v4}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 713
    :cond_2
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const/16 v4, 0x11

    invoke-virtual {v3, v4}, Landroid/hardware/Camera$Parameters;->setPreviewFormat(I)V

    .line 714
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const/16 v4, 0x100

    invoke-virtual {v3, v4}, Landroid/hardware/Camera$Parameters;->setPictureFormat(I)V

    .line 715
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const/16 v4, 0x64

    invoke-virtual {v3, v4}, Landroid/hardware/Camera$Parameters;->setJpegQuality(I)V

    .line 3325
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/aa;->C:Z

    .line 3326
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-eqz v3, :cond_4

    .line 4289
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-nez v3, :cond_3

    .line 4290
    const/4 v3, 0x1

    iput v3, p0, Lcom/roidapp/imagelib/a/aa;->A:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 4293
    :cond_3
    :try_start_1
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getMaxZoom()I

    move-result v3

    iput v3, p0, Lcom/roidapp/imagelib/a/aa;->A:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 3330
    :goto_1
    :try_start_2
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->isZoomSupported()Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getMaxZoom()I

    move-result v3

    if-lez v3, :cond_4

    .line 3331
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/roidapp/imagelib/a/aa;->C:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 717
    :cond_4
    :goto_2
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v3, v4}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 719
    iget-object v3, p0, Lcom/roidapp/imagelib/a/aa;->h:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v3, v4, v0, v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setUpCamera(Landroid/hardware/Camera;IZZ)V

    .line 720
    iput v0, p0, Lcom/roidapp/imagelib/a/aa;->E:I

    .line 721
    iput-boolean v2, p0, Lcom/roidapp/imagelib/a/aa;->F:Z

    .line 722
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/aa;->G:Z

    .line 724
    return-void

    .line 662
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->u:Landroid/hardware/Camera$Parameters;

    const-string v2, "orientation"

    const-string v3, "landscape"

    invoke-virtual {v0, v2, v3}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v1

    move v0, v1

    goto/16 :goto_0

    .line 665
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    move v0, v1

    .line 686
    :goto_3
    new-instance v3, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v3}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 688
    iget v4, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    invoke-static {v4, v3}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 689
    iget v4, v3, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v4, v2, :cond_7

    .line 690
    iget v4, v3, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v0, v4

    rem-int/lit16 v0, v0, 0x168

    .line 695
    :goto_4
    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v4, v0}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 697
    iget v3, v3, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-eq v3, v2, :cond_0

    move v2, v1

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    .line 669
    goto :goto_3

    .line 671
    :pswitch_1
    const/16 v0, 0x5a

    .line 672
    goto :goto_3

    .line 674
    :pswitch_2
    const/16 v0, 0xb4

    .line 675
    goto :goto_3

    .line 677
    :pswitch_3
    const/16 v0, 0x10e

    .line 678
    goto :goto_3

    .line 693
    :cond_7
    iget v4, v3, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int v0, v4, v0

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    goto :goto_4

    .line 4295
    :catch_0
    move-exception v3

    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    .line 3335
    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 666
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 154
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/aa;->F:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 158
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/aa;->G:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 162
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/aa;->D:Z

    return v0
.end method

.method public final e()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v2, -0x1

    .line 170
    .line 1174
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v1, v3, :cond_3

    .line 1269
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v3

    .line 1270
    new-instance v4, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v4}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    move v1, v0

    .line 1271
    :goto_0
    if-ge v1, v3, :cond_2

    .line 1272
    invoke-static {v1, v4}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 1273
    iget v5, v4, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v5, :cond_1

    .line 1175
    :goto_1
    if-eq v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    :goto_2
    return v0

    .line 1271
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move v1, v2

    .line 1277
    goto :goto_1

    .line 2214
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.camera"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    goto :goto_2
.end method

.method public final f()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 186
    .line 194
    const/4 v0, 0x0

    .line 196
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 197
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 201
    :goto_0
    if-nez v0, :cond_0

    .line 209
    :goto_1
    return v1

    .line 203
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 204
    const-string v3, "on"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    const/4 v0, 0x1

    :goto_2
    move v1, v0

    .line 209
    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_2
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 225
    :goto_0
    return-void

    .line 221
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 223
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final h()I
    .locals 1

    .prologue
    .line 281
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->B:I

    return v0
.end method

.method public final i()I
    .locals 1

    .prologue
    .line 285
    iget v0, p0, Lcom/roidapp/imagelib/a/aa;->A:I

    return v0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 340
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/aa;->C:Z

    return v0
.end method

.method public final k()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 363
    .line 2371
    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 2373
    iget v2, p0, Lcom/roidapp/imagelib/a/aa;->w:I

    invoke-static {v2, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 2374
    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v1, v0, :cond_0

    .line 2375
    :goto_0
    return v0

    .line 2377
    :cond_0
    const/4 v0, 0x0

    .line 363
    goto :goto_0
.end method

.method public final l()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 727
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 737
    :goto_0
    return-void

    .line 730
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->h:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->clearDrawQueue()V

    .line 731
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->h:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->stopRender()V

    .line 733
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 734
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 735
    iget-object v0, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 736
    iput-object v1, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    goto :goto_0
.end method

.method public final m()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 750
    invoke-static {}, Lcom/roidapp/imagelib/b/d;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 751
    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const-string v2, "Your SD card is unmounted, please check it then restart the app."

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 793
    :goto_0
    return v0

    .line 754
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/b/d;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 755
    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const-string v2, "Storage card space is insufficient; please make sure you have at least 10 MB available"

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 758
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    if-eqz v1, :cond_2

    .line 759
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 760
    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->h:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->clearDrawQueue()V

    .line 761
    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->h:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->stopRender()V

    .line 762
    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 764
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->startPreview()V

    .line 765
    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->b:Landroid/hardware/Camera;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/roidapp/imagelib/a/aa;->r:Landroid/hardware/Camera$PictureCallback;

    invoke-virtual {v1, v2, v3, v4}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 793
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 788
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final n()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 798
    iget-object v1, p0, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 802
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/aa;->n:Z

    return v0
.end method
