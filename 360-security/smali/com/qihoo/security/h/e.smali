.class public Lcom/qihoo/security/h/e;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field protected b:I

.field protected c:I

.field protected final d:Z

.field private final g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:J

.field private l:Z

.field private m:I

.field private n:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 27
    const-class v0, Lcom/qihoo/security/h/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/e;->e:Ljava/lang/String;

    .line 63
    const-string/jumbo v0, "SELECT * FROM %s WHERE %s = ?"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string/jumbo v3, "pkginfo"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string/jumbo v3, "pkg"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/e;->f:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput v1, p0, Lcom/qihoo/security/h/e;->g:I

    .line 85
    const/16 v0, -0x3e8

    iput v0, p0, Lcom/qihoo/security/h/e;->c:I

    .line 86
    iput-boolean v1, p0, Lcom/qihoo/security/h/e;->l:Z

    .line 93
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const-string/jumbo p1, "unkown"

    .line 100
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/h/e;->d:Z

    .line 102
    return-void
.end method

.method public static a(Landroid/content/pm/PackageInfo;)Lcom/qihoo/security/h/e;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 359
    if-nez p0, :cond_0

    move-object v0, v1

    .line 377
    :goto_0
    return-object v0

    .line 362
    :cond_0
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 364
    new-instance v2, Lcom/qihoo/security/h/e;

    invoke-direct {v2, v0}, Lcom/qihoo/security/h/e;-><init>(Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 366
    iget v0, v2, Lcom/qihoo/security/h/e;->i:I

    or-int/lit8 v0, v0, 0x1

    iput v0, v2, Lcom/qihoo/security/h/e;->i:I

    .line 367
    iget v0, v2, Lcom/qihoo/security/h/e;->i:I

    or-int/lit8 v0, v0, 0x2

    iput v0, v2, Lcom/qihoo/security/h/e;->i:I

    .line 369
    :cond_1
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    iput v0, v2, Lcom/qihoo/security/h/e;->c:I

    .line 370
    invoke-static {}, Lcom/qihoo/security/h/k;->a()Lcom/qihoo/security/h/k;

    move-result-object v0

    .line 372
    invoke-virtual {v0}, Lcom/qihoo/security/h/k;->b()Ljava/util/Collection;

    move-result-object v0

    .line 373
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/j;

    .line 374
    const/4 v4, 0x2

    invoke-virtual {v0, v2, v4, v1}, Lcom/qihoo/security/h/j;->a(Lcom/qihoo/security/h/e;ILandroid/os/Bundle;)V

    goto :goto_1

    .line 376
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, v2, Lcom/qihoo/security/h/e;->l:Z

    move-object v0, v2

    .line 377
    goto :goto_0
.end method

.method public static a(Landroid/database/Cursor;Landroid/content/pm/PackageManager;Z)Lcom/qihoo/security/h/e;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .prologue
    .line 253
    const-string/jumbo v0, "pkg"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 254
    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 255
    if-nez v1, :cond_0

    .line 256
    const/4 v0, 0x0

    .line 280
    :goto_0
    return-object v0

    .line 259
    :cond_0
    const-string/jumbo v2, "shield"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 260
    const-string/jumbo v2, "type"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 261
    const-string/jumbo v2, "smark"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 262
    const-string/jumbo v2, "tmark"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    .line 263
    const-string/jumbo v2, "etc"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 264
    const-string/jumbo v2, "tis"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 265
    new-instance v2, Lcom/qihoo/security/h/e;

    invoke-direct {v2, v0}, Lcom/qihoo/security/h/e;-><init>(Ljava/lang/String;)V

    .line 266
    iput v3, v2, Lcom/qihoo/security/h/e;->b:I

    .line 267
    const-wide/32 v10, 0x3ffff

    and-long/2addr v8, v10

    iput-wide v8, v2, Lcom/qihoo/security/h/e;->k:J

    .line 268
    iput v4, v2, Lcom/qihoo/security/h/e;->i:I

    .line 269
    iput v5, v2, Lcom/qihoo/security/h/e;->h:I

    .line 270
    iput v6, v2, Lcom/qihoo/security/h/e;->j:I

    .line 271
    iget-object v0, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    iput v0, v2, Lcom/qihoo/security/h/e;->c:I

    .line 272
    invoke-static {v7}, Lcom/qihoo/security/h/e;->a(Ljava/lang/String;)[I

    move-result-object v0

    iput-object v0, v2, Lcom/qihoo/security/h/e;->n:[I

    .line 273
    invoke-static {}, Lcom/qihoo/security/h/k;->a()Lcom/qihoo/security/h/k;

    move-result-object v0

    .line 274
    invoke-virtual {v0}, Lcom/qihoo/security/h/k;->b()Ljava/util/Collection;

    move-result-object v0

    .line 275
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/j;

    .line 276
    if-eqz p2, :cond_1

    const/4 v1, 0x2

    :goto_2
    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v4}, Lcom/qihoo/security/h/j;->a(Lcom/qihoo/security/h/e;ILandroid/os/Bundle;)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move-object v0, v2

    .line 280
    goto/16 :goto_0
.end method

.method public static a(Landroid/database/Cursor;Ljava/util/HashMap;Z)Lcom/qihoo/security/h/e;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/content/pm/PackageInfo;",
            ">;Z)",
            "Lcom/qihoo/security/h/e;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .prologue
    .line 285
    const-string/jumbo v0, "pkg"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 286
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 287
    if-nez v0, :cond_0

    .line 288
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    throw v0

    .line 291
    :cond_0
    const-string/jumbo v2, "shield"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 292
    const-string/jumbo v3, "type"

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 293
    const-string/jumbo v4, "smark"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 294
    const-string/jumbo v5, "tmark"

    invoke-interface {p0, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    invoke-interface {p0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 295
    const-string/jumbo v6, "etc"

    invoke-interface {p0, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6

    invoke-interface {p0, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    .line 296
    const-string/jumbo v8, "tis"

    invoke-interface {p0, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    invoke-interface {p0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 298
    new-instance v9, Lcom/qihoo/security/h/e;

    invoke-direct {v9, v1}, Lcom/qihoo/security/h/e;-><init>(Ljava/lang/String;)V

    .line 299
    iput v2, v9, Lcom/qihoo/security/h/e;->b:I

    .line 300
    const-wide/32 v10, 0x3ffff

    and-long/2addr v6, v10

    iput-wide v6, v9, Lcom/qihoo/security/h/e;->k:J

    .line 301
    iput v3, v9, Lcom/qihoo/security/h/e;->i:I

    .line 302
    iput v4, v9, Lcom/qihoo/security/h/e;->h:I

    .line 303
    iput v5, v9, Lcom/qihoo/security/h/e;->j:I

    .line 304
    invoke-static {v8}, Lcom/qihoo/security/h/e;->a(Ljava/lang/String;)[I

    move-result-object v1

    iput-object v1, v9, Lcom/qihoo/security/h/e;->n:[I

    .line 305
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    iput v0, v9, Lcom/qihoo/security/h/e;->c:I

    .line 306
    invoke-static {}, Lcom/qihoo/security/h/k;->a()Lcom/qihoo/security/h/k;

    move-result-object v0

    .line 307
    invoke-virtual {v0}, Lcom/qihoo/security/h/k;->b()Ljava/util/Collection;

    move-result-object v0

    .line 308
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/j;

    .line 309
    if-eqz p2, :cond_1

    const/4 v1, 0x2

    :goto_1
    const/4 v3, 0x0

    invoke-virtual {v0, v9, v1, v3}, Lcom/qihoo/security/h/j;->a(Lcom/qihoo/security/h/e;ILandroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_1

    .line 312
    :cond_2
    return-object v9
.end method

.method private static a(Ljava/lang/String;)[I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 540
    if-nez p0, :cond_1

    .line 552
    :cond_0
    return-object v0

    .line 543
    :cond_1
    const-string/jumbo v1, ";"

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 544
    if-eqz v2, :cond_0

    array-length v1, v2

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    .line 547
    array-length v3, v2

    .line 548
    new-array v0, v3, [I

    .line 549
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 550
    aget-object v4, v2, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aput v4, v0, v1

    .line 549
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private e()J
    .locals 4

    .prologue
    .line 516
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 517
    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x32

    int-to-long v0, v0

    .line 518
    iget-wide v2, p0, Lcom/qihoo/security/h/e;->k:J

    or-long/2addr v0, v2

    return-wide v0
.end method

.method private f()Ljava/lang/String;
    .locals 5

    .prologue
    .line 522
    iget-object v1, p0, Lcom/qihoo/security/h/e;->n:[I

    .line 523
    if-eqz v1, :cond_0

    array-length v0, v1

    const/4 v2, 0x1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 524
    :cond_0
    const/4 v0, 0x0

    .line 536
    :goto_0
    return-object v0

    .line 526
    :cond_1
    array-length v0, v1

    div-int/lit8 v2, v0, 0x2

    .line 527
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 528
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v2, :cond_3

    .line 529
    mul-int/lit8 v4, v0, 0x2

    aget v4, v1, v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 530
    const-string/jumbo v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    mul-int/lit8 v4, v0, 0x2

    add-int/lit8 v4, v4, 0x1

    aget v4, v1, v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 532
    add-int/lit8 v4, v2, -0x1

    if-eq v0, v4, :cond_2

    .line 533
    const-string/jumbo v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 536
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 110
    iget v0, p0, Lcom/qihoo/security/h/e;->m:I

    and-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected a(Landroid/content/pm/PackageManager;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 414
    .line 416
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 419
    :goto_0
    if-nez v0, :cond_2

    .line 420
    invoke-static {}, Lcom/qihoo/security/h/k;->a()Lcom/qihoo/security/h/k;

    move-result-object v0

    .line 421
    invoke-virtual {v0}, Lcom/qihoo/security/h/k;->b()Ljava/util/Collection;

    move-result-object v0

    .line 422
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/j;

    .line 423
    const/4 v3, 0x3

    invoke-virtual {v0, p0, v3, v1}, Lcom/qihoo/security/h/j;->a(Lcom/qihoo/security/h/e;ILandroid/os/Bundle;)V

    goto :goto_1

    .line 417
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 428
    :cond_0
    invoke-static {}, Lcom/qihoo/security/h/b;->a()Lcom/qihoo/security/h/b;

    move-result-object v0

    .line 429
    const-string/jumbo v1, "pkg = ?"

    .line 430
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    aput-object v3, v2, v4

    .line 431
    const-string/jumbo v3, "pkginfo"

    invoke-virtual {v0, v3, v1, v2}, Lcom/qihoo/security/h/b;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 466
    :cond_1
    return-void

    .line 436
    :cond_2
    iget-object v2, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_4

    .line 437
    iget v2, p0, Lcom/qihoo/security/h/e;->i:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/qihoo/security/h/e;->i:I

    .line 441
    :goto_2
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 442
    iget v2, p0, Lcom/qihoo/security/h/e;->c:I

    if-eq v2, v0, :cond_3

    .line 457
    iput v0, p0, Lcom/qihoo/security/h/e;->c:I

    .line 461
    :cond_3
    invoke-static {}, Lcom/qihoo/security/h/k;->a()Lcom/qihoo/security/h/k;

    move-result-object v0

    .line 462
    invoke-virtual {v0}, Lcom/qihoo/security/h/k;->b()Ljava/util/Collection;

    move-result-object v0

    .line 463
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/j;

    .line 464
    const/4 v3, 0x2

    invoke-virtual {v0, p0, v3, v1}, Lcom/qihoo/security/h/j;->a(Lcom/qihoo/security/h/e;ILandroid/os/Bundle;)V

    goto :goto_3

    .line 439
    :cond_4
    iget v2, p0, Lcom/qihoo/security/h/e;->i:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Lcom/qihoo/security/h/e;->i:I

    goto :goto_2
.end method

.method public a(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 213
    invoke-static {p1}, Lcom/qihoo/security/h/k;->b(I)V

    .line 215
    shl-int v1, v0, p1

    .line 216
    iget v2, p0, Lcom/qihoo/security/h/e;->b:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(IZ)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 391
    invoke-virtual {p0, p1}, Lcom/qihoo/security/h/e;->a(I)Z

    move-result v1

    if-ne v1, p2, :cond_0

    .line 392
    const/4 v0, 0x0

    .line 402
    :goto_0
    return v0

    .line 394
    :cond_0
    shl-int v1, v0, p1

    .line 395
    if-eqz p2, :cond_1

    .line 396
    iget v2, p0, Lcom/qihoo/security/h/e;->b:I

    xor-int/lit8 v3, v1, -0x1

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/h/e;->b:I

    .line 401
    :goto_1
    iput-boolean v0, p0, Lcom/qihoo/security/h/e;->l:Z

    goto :goto_0

    .line 398
    :cond_1
    iget v2, p0, Lcom/qihoo/security/h/e;->b:I

    xor-int/lit8 v1, v1, -0x1

    and-int/2addr v1, v2

    iput v1, p0, Lcom/qihoo/security/h/e;->b:I

    goto :goto_1
.end method

.method public b()I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 226
    invoke-static {}, Lcom/qihoo/security/h/k;->a()Lcom/qihoo/security/h/k;

    move-result-object v2

    move v1, v0

    .line 229
    :goto_0
    const/16 v3, 0xa

    if-gt v1, v3, :cond_2

    .line 230
    invoke-virtual {v2, v1}, Lcom/qihoo/security/h/k;->a(I)Z

    move-result v3

    if-nez v3, :cond_1

    .line 229
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 233
    :cond_1
    const/4 v3, 0x1

    shl-int/2addr v3, v1

    .line 234
    iget v4, p0, Lcom/qihoo/security/h/e;->b:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    .line 235
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 238
    :cond_2
    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 248
    iget v0, p0, Lcom/qihoo/security/h/e;->c:I

    return v0
.end method

.method public declared-synchronized d()Z
    .locals 10

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 476
    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Lcom/qihoo/security/h/e;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    .line 512
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 479
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/qihoo/security/h/b;->a()Lcom/qihoo/security/h/b;

    move-result-object v2

    .line 481
    invoke-direct {p0}, Lcom/qihoo/security/h/e;->e()J

    move-result-wide v4

    .line 482
    invoke-direct {p0}, Lcom/qihoo/security/h/e;->f()Ljava/lang/String;

    move-result-object v3

    .line 483
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 484
    const-string/jumbo v7, "shield"

    iget v8, p0, Lcom/qihoo/security/h/e;->b:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 485
    const-string/jumbo v7, "type"

    iget v8, p0, Lcom/qihoo/security/h/e;->i:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 486
    const-string/jumbo v7, "taxis"

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 487
    const-string/jumbo v7, "smark"

    iget v8, p0, Lcom/qihoo/security/h/e;->h:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 488
    const-string/jumbo v7, "tmark"

    iget v8, p0, Lcom/qihoo/security/h/e;->j:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 489
    const-string/jumbo v7, "etc"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 490
    const-string/jumbo v7, "tis"

    invoke-virtual {v6, v7, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    aput-object v9, v7, v8

    .line 492
    const-string/jumbo v8, "pkginfo"

    const-string/jumbo v9, "pkg=?"

    invoke-virtual {v2, v8, v6, v9, v7}, Lcom/qihoo/security/h/b;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_2

    .line 493
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/h/e;->l:Z

    move v0, v1

    .line 494
    goto :goto_0

    .line 498
    :cond_2
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 499
    const-string/jumbo v7, "pkg"

    iget-object v8, p0, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    const-string/jumbo v7, "shield"

    iget v8, p0, Lcom/qihoo/security/h/e;->b:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 501
    const-string/jumbo v7, "type"

    iget v8, p0, Lcom/qihoo/security/h/e;->i:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 502
    const-string/jumbo v7, "taxis"

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 503
    const-string/jumbo v7, "smark"

    iget v8, p0, Lcom/qihoo/security/h/e;->h:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 504
    const-string/jumbo v7, "tmark"

    iget v8, p0, Lcom/qihoo/security/h/e;->j:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 505
    const-string/jumbo v7, "etc"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v6, v7, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 506
    const-string/jumbo v4, "tis"

    invoke-virtual {v6, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    const-string/jumbo v3, "pkginfo"

    invoke-virtual {v2, v3, v6}, Lcom/qihoo/security/h/b;->a(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 509
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/h/e;->l:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v0, v1

    .line 510
    goto/16 :goto_0

    .line 476
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
