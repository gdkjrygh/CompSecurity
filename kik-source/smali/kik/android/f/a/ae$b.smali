.class final Lkik/android/f/a/ae$b;
.super Lkik/android/util/bf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/f/a/ae;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/kik/g/p;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/util/HashMap;

.field private w:Z

.field private x:Ljava/lang/String;

.field private y:Lkik/a/d/a/a;

.field private z:Lcom/kik/cache/ad;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/kik/cache/ad;)V
    .locals 1

    .prologue
    .line 226
    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 227
    iput-object p1, p0, Lkik/android/f/a/ae$b;->a:Landroid/app/Activity;

    .line 228
    iput-object p2, p0, Lkik/android/f/a/ae$b;->z:Lcom/kik/cache/ad;

    .line 229
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/f/a/ae$b;->b:Lcom/kik/g/p;

    .line 230
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/o;
    .locals 6

    .prologue
    .line 346
    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lkik/android/f/a/ae$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lkik/a/d/o;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lkik/a/d/o;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 352
    if-eqz p5, :cond_2

    const v0, 0xa000

    move v2, v0

    .line 354
    :goto_0
    if-eqz p1, :cond_6

    .line 355
    invoke-static {p1}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 356
    if-eqz v0, :cond_1

    .line 360
    if-nez v0, :cond_3

    move-object v0, v1

    .line 366
    :goto_1
    if-eqz v0, :cond_0

    array-length v3, v0

    if-le v3, v2, :cond_0

    .line 367
    if-eqz p4, :cond_4

    .line 368
    invoke-static {v0}, Lkik/android/f/a/ae;->a([B)[B

    move-result-object v0

    .line 369
    invoke-static {v0}, Lcom/kik/m/k;->a([B)[B

    move-result-object v0

    .line 375
    :cond_0
    :goto_2
    if-eqz v0, :cond_5

    .line 376
    new-instance v1, Lkik/a/d/o;

    invoke-direct {v1, v0}, Lkik/a/d/o;-><init>([B)V

    .line 436
    :cond_1
    :goto_3
    return-object v1

    .line 352
    :cond_2
    const/16 v0, 0x5000

    move v2, v0

    goto :goto_0

    .line 360
    :cond_3
    :try_start_0
    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 362
    :catch_0
    move-exception v0

    .line 363
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not retrieve preview: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, v1

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 372
    goto :goto_2

    .line 379
    :cond_5
    new-instance v0, Lkik/android/f/a/ae$a;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 384
    :cond_6
    if-eqz p2, :cond_a

    .line 385
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-lez v3, :cond_1

    .line 389
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    int-to-long v2, v2

    cmp-long v2, v4, v2

    if-lez v2, :cond_9

    .line 390
    if-eqz p4, :cond_8

    .line 391
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v0, v2}, Lcom/kik/m/k;->a(Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)[B

    move-result-object v0

    .line 406
    :goto_4
    if-eqz v0, :cond_1

    .line 407
    if-eqz p4, :cond_7

    .line 408
    invoke-static {v0}, Lcom/kik/m/k;->a([B)[B

    move-result-object v0

    .line 410
    :cond_7
    new-instance v1, Lkik/a/d/o;

    invoke-direct {v1, v0}, Lkik/a/d/o;-><init>([B)V

    goto :goto_3

    :cond_8
    move-object v0, v1

    .line 394
    goto :goto_4

    .line 399
    :cond_9
    :try_start_1
    invoke-static {v0}, Lorg/a/a/a/a;->a(Ljava/io/File;)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_4

    .line 401
    :catch_1
    move-exception v0

    .line 402
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not retrieve preview: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, v1

    goto :goto_4

    .line 414
    :cond_a
    if-eqz p3, :cond_1

    .line 415
    invoke-static {p3}, Lcom/kik/m/k;->b(Ljava/lang/String;)[B

    move-result-object v0

    .line 416
    if-eqz v0, :cond_b

    array-length v3, v0

    if-le v3, v2, :cond_b

    .line 417
    if-eqz p4, :cond_d

    .line 418
    invoke-static {v0}, Lkik/android/f/a/ae;->a([B)[B

    move-result-object v0

    .line 425
    :cond_b
    :goto_5
    if-eqz v0, :cond_e

    .line 426
    if-eqz p4, :cond_c

    .line 427
    invoke-static {v0}, Lcom/kik/m/k;->a([B)[B

    move-result-object v0

    .line 429
    :cond_c
    new-instance v1, Lkik/a/d/o;

    invoke-direct {v1, v0}, Lkik/a/d/o;-><init>([B)V

    goto/16 :goto_3

    :cond_d
    move-object v0, v1

    .line 421
    goto :goto_5

    .line 432
    :cond_e
    new-instance v0, Lkik/android/f/a/ae$a;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_3
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 650
    iget-object v0, p0, Lkik/android/f/a/ae$b;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 651
    return-void
.end method

.method static synthetic a(Lkik/android/f/a/ae$b;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 211
    invoke-direct {p0, p1}, Lkik/android/f/a/ae$b;->b(Lkik/a/d/a/a;)V

    return-void
.end method

.method private varargs b()Ljava/lang/Void;
    .locals 12

    .prologue
    const/4 v3, 0x7

    const/4 v9, 0x4

    const/4 v8, 0x2

    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 442
    iget-object v0, p0, Lkik/android/f/a/ae$b;->y:Lkik/a/d/a/a;

    if-eqz v0, :cond_3

    .line 443
    iget-object v0, p0, Lkik/android/f/a/ae$b;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/ae$b;->g:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 444
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/ae$b;->g:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/f/a/ae$b;->i:Ljava/lang/String;

    invoke-direct {p0, v0, v7, v1}, Lkik/android/f/a/ae$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    .line 445
    if-eqz v0, :cond_4

    .line 446
    iget-object v1, p0, Lkik/android/f/a/ae$b;->y:Lkik/a/d/a/a;

    const-string v2, "preview"

    invoke-virtual {v1, v2, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 456
    :cond_1
    iget-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 457
    iget-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x6aaa

    if-ge v0, v1, :cond_2

    .line 460
    :try_start_0
    iget-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 461
    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 466
    :goto_0
    if-eqz v0, :cond_5

    .line 467
    iget-object v1, p0, Lkik/android/f/a/ae$b;->y:Lkik/a/d/a/a;

    const-string v2, "icon"

    new-instance v3, Lkik/a/d/d;

    invoke-direct {v3, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 485
    :cond_2
    :goto_1
    iget-object v0, p0, Lkik/android/f/a/ae$b;->y:Lkik/a/d/a/a;

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->c(Lkik/a/d/a/a;)V

    .line 488
    :cond_3
    iget-object v0, p0, Lkik/android/f/a/ae$b;->c:Ljava/lang/String;

    if-nez v0, :cond_8

    .line 489
    new-instance v0, Lkik/android/f/a/ae$a;

    invoke-direct {v0, v8}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    .line 619
    :goto_2
    return-object v7

    .line 449
    :cond_4
    new-instance v0, Lkik/android/f/a/ae$a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 463
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v7

    goto :goto_0

    .line 470
    :cond_5
    new-instance v0, Lkik/android/f/a/ae$a;

    invoke-direct {v0, v3}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 473
    :cond_6
    iget-object v0, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 476
    iget-object v0, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    invoke-direct {p0, v7, v7, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    .line 477
    if-eqz v0, :cond_7

    .line 478
    iget-object v1, p0, Lkik/android/f/a/ae$b;->y:Lkik/a/d/a/a;

    const-string v2, "icon"

    new-instance v3, Lkik/a/d/d;

    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v5

    invoke-virtual {v5, v0}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v0

    invoke-direct {v3, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    goto :goto_1

    .line 481
    :cond_7
    new-instance v0, Lkik/android/f/a/ae$a;

    invoke-direct {v0, v3}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 493
    :cond_8
    iget-object v0, p0, Lkik/android/f/a/ae$b;->i:Ljava/lang/String;

    if-nez v0, :cond_9

    iget-object v0, p0, Lkik/android/f/a/ae$b;->g:Ljava/lang/String;

    if-nez v0, :cond_9

    iget-object v0, p0, Lkik/android/f/a/ae$b;->e:Ljava/lang/String;

    if-nez v0, :cond_9

    iget-object v0, p0, Lkik/android/f/a/ae$b;->f:Ljava/lang/String;

    if-nez v0, :cond_9

    iget-object v0, p0, Lkik/android/f/a/ae$b;->o:Ljava/lang/String;

    if-nez v0, :cond_9

    iget-object v0, p0, Lkik/android/f/a/ae$b;->m:Ljava/lang/String;

    if-nez v0, :cond_9

    .line 495
    new-instance v0, Lkik/android/f/a/ae$a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 499
    :cond_9
    iget-object v0, p0, Lkik/android/f/a/ae$b;->e:Ljava/lang/String;

    if-nez v0, :cond_a

    iget-object v0, p0, Lkik/android/f/a/ae$b;->f:Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 500
    new-instance v0, Lkik/android/f/a/ae$a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 504
    :cond_a
    new-instance v11, Lkik/a/d/a/a;

    const-string v0, "com.kik.cards"

    invoke-direct {v11, v0}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;)V

    .line 506
    const-string v0, "app-name"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->c:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    const-string v0, "attribution"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->p:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    const-string v0, "preview"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->g:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/f/a/ae$b;->h:Ljava/lang/String;

    iget-object v3, p0, Lkik/android/f/a/ae$b;->i:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v3}, Lkik/android/f/a/ae$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 511
    const-string v6, "png-preview"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->m:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/f/a/ae$b;->n:Ljava/lang/String;

    iget-object v3, p0, Lkik/android/f/a/ae$b;->o:Ljava/lang/String;

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkik/android/f/a/ae$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lkik/a/d/o;

    move-result-object v0

    invoke-virtual {v11, v6, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 512
    const-string v0, "card-icon"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    iget-object v0, p0, Lkik/android/f/a/ae$b;->d:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 514
    iget-object v0, p0, Lkik/android/f/a/ae$b;->d:Ljava/lang/String;

    const-string v1, "cards"

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    :cond_b
    iget-object v0, p0, Lkik/android/f/a/ae$b;->x:Ljava/lang/String;

    invoke-virtual {v11, v0, v7}, Lkik/a/d/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    const-string v0, "http://cdn.kik.com/cards/unsupported.html"

    invoke-virtual {v11, v0, v7}, Lkik/a/d/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lkik/android/f/a/ae$b;->v:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 521
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v11, v1, v0}, Lkik/a/d/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 524
    :cond_c
    iget-object v0, p0, Lkik/android/f/a/ae$b;->l:Ljava/lang/String;

    if-eqz v0, :cond_d

    .line 525
    const-string v0, "layout"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->l:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    :cond_d
    sget-object v0, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    iget-object v1, p0, Lkik/android/f/a/ae$b;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/a/d/a/a$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "preview"

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    if-nez v0, :cond_e

    const-string v0, "png-preview"

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    if-nez v0, :cond_e

    .line 530
    new-instance v0, Lkik/android/f/a/ae$a;

    invoke-direct {v0, v9}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 534
    :cond_e
    sget-object v0, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v0}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/f/a/ae$b;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 536
    const-string v0, "preview"

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    if-nez v0, :cond_f

    invoke-virtual {v11}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/f/e/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 537
    new-instance v0, Lkik/android/f/a/ae$a;

    invoke-direct {v0, v9}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 540
    :cond_f
    iget-object v0, p0, Lkik/android/f/a/ae$b;->q:Ljava/lang/String;

    if-nez v0, :cond_10

    .line 541
    new-instance v0, Lkik/android/f/a/ae$a;

    invoke-direct {v0, v8}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-direct {p0, v0}, Lkik/android/f/a/ae$b;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 545
    :cond_10
    iget-object v6, p0, Lkik/android/f/a/ae$b;->q:Ljava/lang/String;

    const-string v8, "video"

    move-object v5, v11

    move-object v9, v7

    move-object v10, v7

    invoke-virtual/range {v5 .. v10}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    iget-object v6, p0, Lkik/android/f/a/ae$b;->q:Ljava/lang/String;

    const-string v8, "image"

    move-object v5, v11

    move-object v9, v7

    move-object v10, v7

    invoke-virtual/range {v5 .. v10}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    :cond_11
    iget-object v0, p0, Lkik/android/f/a/ae$b;->t:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->k(Ljava/lang/String;)V

    .line 552
    iget-object v0, p0, Lkik/android/f/a/ae$b;->r:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->j(Ljava/lang/String;)V

    .line 553
    iget-object v0, p0, Lkik/android/f/a/ae$b;->u:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->i(Ljava/lang/String;)V

    .line 554
    iget-object v0, p0, Lkik/android/f/a/ae$b;->s:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->l(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lkik/android/f/a/ae$b;->e:Ljava/lang/String;

    if-eqz v0, :cond_12

    .line 557
    const-string v0, "title"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->e:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    :cond_12
    iget-object v0, p0, Lkik/android/f/a/ae$b;->f:Ljava/lang/String;

    if-eqz v0, :cond_13

    .line 561
    const-string v0, "text"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->f:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 564
    :cond_13
    const-string v0, "allow-forward"

    iget-boolean v1, p0, Lkik/android/f/a/ae$b;->w:Z

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    const-string v0, "fallbackUrl"

    iget-object v1, p0, Lkik/android/f/a/ae$b;->x:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    iget-object v0, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    if-eqz v0, :cond_14

    .line 568
    iget-object v0, p0, Lkik/android/f/a/ae$b;->z:Lcom/kik/cache/ad;

    iget-object v1, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    invoke-static {v1, v4, v4}, Lcom/kik/cache/av;->a(Ljava/lang/String;II)Lcom/kik/cache/av;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lkik/android/util/e;->a(Lcom/kik/cache/ad;Lcom/kik/cache/z;Z)Lcom/kik/g/p;

    move-result-object v0

    .line 569
    new-instance v1, Lkik/android/f/a/af;

    invoke-direct {v1, p0, v11}, Lkik/android/f/a/af;-><init>(Lkik/android/f/a/ae$b;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto/16 :goto_2

    .line 591
    :cond_14
    iget-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    if-eqz v0, :cond_15

    .line 592
    iget-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x6aaa

    if-ge v0, v1, :cond_15

    .line 595
    :try_start_1
    iget-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 596
    if-eqz v0, :cond_18

    .line 597
    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 608
    :goto_4
    if-eqz v0, :cond_15

    .line 609
    const-string v1, "icon"

    new-instance v2, Lkik/a/d/d;

    invoke-direct {v2, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v11, v1, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 613
    :cond_15
    const-string v0, "icon"

    invoke-virtual {v11, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    if-nez v0, :cond_16

    .line 614
    invoke-direct {p0, v11}, Lkik/android/f/a/ae$b;->b(Lkik/a/d/a/a;)V

    .line 616
    :cond_16
    invoke-direct {p0, v11}, Lkik/android/f/a/ae$b;->c(Lkik/a/d/a/a;)V

    goto/16 :goto_2

    .line 600
    :catch_1
    move-exception v0

    .line 601
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 602
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v7

    goto :goto_4

    .line 605
    :cond_17
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    :cond_18
    move-object v0, v7

    goto :goto_4
.end method

.method private b(Lkik/a/d/a/a;)V
    .locals 4

    .prologue
    .line 624
    iget-object v0, p0, Lkik/android/f/a/ae$b;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 625
    iget-object v0, p0, Lkik/android/f/a/ae$b;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200b2

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 626
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const-wide/16 v2, 0x1388

    invoke-static {v0, v1, v2, v3}, Lcom/kik/m/k;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;J)[B

    move-result-object v0

    .line 627
    if-eqz v0, :cond_0

    .line 628
    const-string v1, "icon"

    new-instance v2, Lkik/a/d/d;

    invoke-direct {v2, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {p1, v1, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 631
    :cond_0
    return-void
.end method

.method static synthetic b(Lkik/android/f/a/ae$b;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 211
    invoke-direct {p0, p1}, Lkik/android/f/a/ae$b;->c(Lkik/a/d/a/a;)V

    return-void
.end method

.method private c(Lkik/a/d/a/a;)V
    .locals 3

    .prologue
    .line 640
    if-nez p1, :cond_0

    .line 641
    iget-object v0, p0, Lkik/android/f/a/ae$b;->b:Lcom/kik/g/p;

    new-instance v1, Lkik/android/f/a/ae$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lkik/android/f/a/ae$a;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 646
    :goto_0
    return-void

    .line 644
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/ae$b;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method final a()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lkik/android/f/a/ae$b;->b:Lcom/kik/g/p;

    return-object v0
.end method

.method final a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V
    .locals 2

    .prologue
    .line 268
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->i:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->c:Ljava/lang/String;

    .line 269
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->j:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->d:Ljava/lang/String;

    .line 271
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->a:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->e:Ljava/lang/String;

    .line 272
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->b:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->f:Ljava/lang/String;

    .line 273
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->c:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 274
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->c:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->g:Ljava/lang/String;

    .line 280
    :cond_0
    :goto_0
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->d:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 281
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->d:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->m:Ljava/lang/String;

    .line 287
    :cond_1
    :goto_1
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->e:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 288
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->e:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    .line 297
    :cond_2
    :goto_2
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->n:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->p:Ljava/lang/String;

    .line 298
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->h:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->l:Ljava/lang/String;

    .line 299
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/f/a/ae$b;->w:Z

    .line 300
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->m:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->x:Ljava/lang/String;

    .line 301
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->o:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->q:Ljava/lang/String;

    .line 302
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->p:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->r:Ljava/lang/String;

    .line 303
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->q:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->s:Ljava/lang/String;

    .line 304
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->r:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->t:Ljava/lang/String;

    .line 305
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->s:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->u:Ljava/lang/String;

    .line 307
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->t:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->v:Ljava/util/HashMap;

    .line 308
    return-void

    .line 276
    :cond_3
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 277
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->c:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/f/a/ae$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->i:Ljava/lang/String;

    goto :goto_0

    .line 283
    :cond_4
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 284
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->d:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/f/a/ae$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->o:Ljava/lang/String;

    goto :goto_1

    .line 290
    :cond_5
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->e:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 291
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->e:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/f/a/ae$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    goto :goto_2

    .line 293
    :cond_6
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->k:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 294
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->k:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    goto :goto_2
.end method

.method final a(Lkik/a/d/a/a;)V
    .locals 2

    .prologue
    .line 312
    iput-object p1, p0, Lkik/android/f/a/ae$b;->y:Lkik/a/d/a/a;

    .line 314
    invoke-static {p1}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->c:Ljava/lang/String;

    .line 315
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->e:Ljava/lang/String;

    .line 316
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->f:Ljava/lang/String;

    .line 317
    const-string v0, "layout"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->l:Ljava/lang/String;

    .line 318
    const-string v0, "true"

    const-string v1, "allow-forward"

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/f/a/ae$b;->w:Z

    .line 319
    invoke-virtual {p1}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/f/a/ae$b;->q:Ljava/lang/String;

    .line 321
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Lkik/a/d/a/a;->q()Ljava/util/Hashtable;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lkik/android/f/a/ae$b;->v:Ljava/util/HashMap;

    .line 323
    invoke-virtual {p1}, Lkik/a/d/a/a;->a()Ljava/lang/String;

    move-result-object v0

    .line 324
    invoke-static {v0}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 325
    iput-object v0, p0, Lkik/android/f/a/ae$b;->j:Ljava/lang/String;

    .line 331
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lkik/a/d/a/a;->b()Ljava/lang/String;

    move-result-object v0

    .line 332
    invoke-static {v0}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 333
    iput-object v0, p0, Lkik/android/f/a/ae$b;->g:Ljava/lang/String;

    .line 338
    :cond_1
    :goto_1
    return-void

    .line 327
    :cond_2
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 328
    iput-object v0, p0, Lkik/android/f/a/ae$b;->k:Ljava/lang/String;

    goto :goto_0

    .line 335
    :cond_3
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 336
    iput-object v0, p0, Lkik/android/f/a/ae$b;->i:Ljava/lang/String;

    goto :goto_1
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 211
    invoke-direct {p0}, Lkik/android/f/a/ae$b;->b()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected final bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 211
    return-void
.end method
