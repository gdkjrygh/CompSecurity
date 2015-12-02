.class public Lcom/qihoo/security/locale/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo/security/locale/d;


# instance fields
.field private b:Lcom/qihoo/security/locale/a;

.field private final c:Landroid/content/Context;

.field private d:Landroid/content/res/Resources;

.field private e:Landroid/content/res/Resources;

.field private final f:Lcom/qihoo/security/lib/resl/ExtResources;

.field private g:Z

.field private h:Z

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/locale/b;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Landroid/content/ServiceConnection;

.field private final n:Lcom/qihoo/security/locale/b$a;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 814
    new-instance v0, Lcom/qihoo/security/locale/d$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/d$1;-><init>(Lcom/qihoo/security/locale/d;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/d;->m:Landroid/content/ServiceConnection;

    .line 844
    new-instance v0, Lcom/qihoo/security/locale/d$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/d$2;-><init>(Lcom/qihoo/security/locale/d;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/d;->n:Lcom/qihoo/security/locale/b$a;

    .line 81
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->c:Landroid/content/Context;

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    .line 83
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    .line 84
    const-class v0, Lcom/qihoo/security/locale/LocaleManagerService;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/locale/d;->m:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-static {p1, v0, v1, v2, v3}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 86
    invoke-direct {p0}, Lcom/qihoo/security/locale/d;->i()V

    .line 87
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/locale/d;Landroid/content/res/Resources;)Landroid/content/res/Resources;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/locale/d;Lcom/qihoo/security/locale/a;)Lcom/qihoo/security/locale/a;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/locale/b$a;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->n:Lcom/qihoo/security/locale/b$a;

    return-object v0
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/locale/d;
    .locals 3

    .prologue
    .line 69
    const-class v1, Lcom/qihoo/security/locale/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/locale/d;->a:Lcom/qihoo/security/locale/d;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/qihoo/security/locale/d;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/locale/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/locale/d;->a:Lcom/qihoo/security/locale/d;

    .line 73
    :cond_0
    sget-object v0, Lcom/qihoo/security/locale/d;->a:Lcom/qihoo/security/locale/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 69
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 344
    const-string/jumbo v0, "en"

    .line 345
    const-string/jumbo v0, "language"

    const-string/jumbo v1, ""

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 346
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 347
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 348
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 357
    :cond_0
    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/locale/d;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->i:Ljava/lang/String;

    return-object p1
.end method

.method public static a(Ljava/util/Locale;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 314
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    .line 315
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 316
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 319
    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v2, "_"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/locale/d;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->l:Ljava/util/List;

    return-object p1
.end method

.method static a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 95
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 97
    const-string/jumbo v1, "l_c_default"

    invoke-static {v0, v1, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 98
    const-string/jumbo v1, "l_c_extend"

    invoke-static {v0, v1, p0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 99
    const-string/jumbo v1, "l_c_name"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string/jumbo v1, "l_c_pkg"

    invoke-static {v0, v1, p3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string/jumbo v1, "l_c_path"

    invoke-static {v0, v1, p4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/locale/d;Z)Z
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/qihoo/security/locale/d;->h:Z

    return p1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v8, 0x5

    const/4 v0, 0x0

    const/4 v7, 0x3

    .line 406
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 461
    :cond_0
    :goto_0
    return v0

    .line 412
    :cond_1
    :try_start_0
    const-string/jumbo v2, ""

    .line 413
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v2, v7, :cond_4

    move-object v5, p0

    .line 418
    :goto_1
    const/4 v2, 0x0

    .line 419
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v7, :cond_9

    .line 420
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v2, v8, :cond_5

    .line 421
    const/4 v2, 0x3

    const/4 v3, 0x5

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    .line 427
    :goto_2
    const-string/jumbo v2, ""

    .line 428
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v2, v7, :cond_6

    move-object v3, p1

    .line 433
    :goto_3
    const/4 v2, 0x0

    .line 434
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v7, :cond_2

    .line 435
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v2, v8, :cond_7

    .line 436
    const/4 v2, 0x3

    const/4 v6, 0x5

    invoke-virtual {p1, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 443
    :cond_2
    :goto_4
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 449
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    :cond_3
    move v0, v1

    .line 451
    goto :goto_0

    .line 416
    :cond_4
    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    move-object v5, v2

    goto :goto_1

    .line 423
    :cond_5
    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    goto :goto_2

    .line 431
    :cond_6
    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    goto :goto_3

    .line 438
    :cond_7
    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    .line 452
    :cond_8
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 454
    goto/16 :goto_0

    .line 456
    :catch_0
    move-exception v1

    goto/16 :goto_0

    :cond_9
    move-object v4, v2

    goto :goto_2
.end method

.method static a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 473
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string/jumbo v1, "info.dat"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 474
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->openConfigFile(Ljava/io/Reader;)Ljava/util/List;

    move-result-object v0

    .line 475
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 476
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string/jumbo v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 479
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/locale/d;Landroid/content/res/Resources;)Landroid/content/res/Resources;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/locale/a;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v2, 0x1

    .line 361
    const-string/jumbo v1, "en"

    .line 362
    const-string/jumbo v0, "language"

    const-string/jumbo v3, ""

    invoke-static {p0, v0, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 363
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 364
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v3, "zh_CN"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 368
    const/4 v3, 0x0

    .line 369
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->g()Ljava/util/List;

    move-result-object v0

    .line 370
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_5

    .line 371
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 372
    iget-object v5, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    const-string/jumbo v6, "zh_CN"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 373
    iget-boolean v5, v0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    if-eqz v5, :cond_2

    move v0, v2

    .line 384
    :goto_0
    if-eqz v0, :cond_4

    .line 385
    const-string/jumbo v0, "zh-CN"

    :goto_1
    move-object v1, v0

    .line 396
    :cond_1
    :goto_2
    return-object v1

    .line 376
    :cond_2
    iget v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    const/4 v5, 0x2

    if-eq v0, v5, :cond_0

    move v0, v2

    .line 378
    goto :goto_0

    .line 388
    :cond_3
    const-string/jumbo v2, "zh_CN"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 389
    const-string/jumbo v1, "zh-CN"

    goto :goto_2

    :cond_4
    move-object v0, v1

    goto :goto_1

    :cond_5
    move v0, v3

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/locale/d;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->j:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/locale/d;Z)Z
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/qihoo/security/locale/d;->g:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/locale/d;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/qihoo/security/locale/d;)Ljava/util/List;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/locale/d;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->c:Landroid/content/Context;

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/util/Locale;
    .locals 4

    .prologue
    const/4 v3, 0x5

    const/4 v2, 0x2

    .line 328
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 339
    :goto_0
    return-object v0

    .line 333
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 334
    if-ne v0, v3, :cond_1

    .line 335
    new-instance v0, Ljava/util/Locale;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 336
    :cond_1
    if-ne v0, v2, :cond_2

    .line 337
    new-instance v0, Ljava/util/Locale;

    invoke-direct {v0, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 339
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic e(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/locale/d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/locale/d;)Lcom/qihoo/security/lib/resl/ExtResources;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/locale/d;)Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    return-object v0
.end method

.method private i()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 105
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 106
    const-string/jumbo v1, "l_c_extend"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    .line 107
    const-string/jumbo v2, "l_c_default"

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    .line 108
    const-string/jumbo v3, "l_c_name"

    invoke-static {v0, v3, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 109
    const-string/jumbo v4, "l_c_pkg"

    invoke-static {v0, v4, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 110
    const-string/jumbo v5, "l_c_path"

    invoke-static {v0, v5, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 115
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->n:Lcom/qihoo/security/locale/b$a;

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/locale/b$a;->a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :goto_0
    return-void

    .line 116
    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 4

    .prologue
    .line 627
    iget-boolean v0, p0, Lcom/qihoo/security/locale/d;->h:Z

    if-eqz v0, :cond_1

    .line 629
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 630
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources;->getIdent(Ljava/lang/String;I)I

    move-result v0

    .line 632
    if-lez v0, :cond_1

    .line 633
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/lib/resl/ExtResources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 658
    :goto_0
    return-object v0

    .line 636
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "string"

    iget-object v3, p0, Lcom/qihoo/security/locale/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 638
    if-lez v0, :cond_1

    .line 639
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 642
    :catch_0
    move-exception v0

    .line 649
    :cond_1
    const-string/jumbo v0, ""

    .line 651
    :try_start_1
    invoke-virtual {p0}, Lcom/qihoo/security/locale/d;->h()V

    .line 652
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 653
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public a(II)Ljava/lang/String;
    .locals 4

    .prologue
    .line 779
    iget-boolean v0, p0, Lcom/qihoo/security/locale/d;->h:Z

    if-eqz v0, :cond_1

    .line 781
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 782
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources;->getIdent(Ljava/lang/String;I)I

    move-result v0

    .line 784
    if-lez v0, :cond_1

    .line 785
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1, v0, p2}, Lcom/qihoo/security/lib/resl/ExtResources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 811
    :goto_0
    return-object v0

    .line 788
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "plurals"

    iget-object v3, p0, Lcom/qihoo/security/locale/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 791
    if-lez v0, :cond_1

    .line 792
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    invoke-virtual {v1, v0, p2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 795
    :catch_0
    move-exception v0

    .line 802
    :cond_1
    const-string/jumbo v0, ""

    .line 804
    :try_start_1
    invoke-virtual {p0}, Lcom/qihoo/security/locale/d;->h()V

    .line 805
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, p2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 806
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public varargs a(II[Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 742
    iget-boolean v0, p0, Lcom/qihoo/security/locale/d;->h:Z

    if-eqz v0, :cond_1

    .line 744
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 745
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources;->getIdent(Ljava/lang/String;I)I

    move-result v0

    .line 747
    if-lez v0, :cond_1

    .line 748
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1, v0, p2, p3}, Lcom/qihoo/security/lib/resl/ExtResources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 775
    :goto_0
    return-object v0

    .line 751
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "plurals"

    iget-object v3, p0, Lcom/qihoo/security/locale/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 754
    if-lez v0, :cond_1

    .line 755
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    invoke-virtual {v1, v0, p2, p3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 759
    :catch_0
    move-exception v0

    .line 766
    :cond_1
    const-string/jumbo v0, ""

    .line 768
    :try_start_1
    invoke-virtual {p0}, Lcom/qihoo/security/locale/d;->h()V

    .line 769
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, p2, p3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 770
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public varargs a(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 663
    iget-boolean v0, p0, Lcom/qihoo/security/locale/d;->h:Z

    if-eqz v0, :cond_1

    .line 665
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 666
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources;->getIdent(Ljava/lang/String;I)I

    move-result v0

    .line 668
    if-lez v0, :cond_1

    .line 669
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1, v0, p2}, Lcom/qihoo/security/lib/resl/ExtResources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 687
    :goto_0
    return-object v0

    .line 672
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "string"

    iget-object v3, p0, Lcom/qihoo/security/locale/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 674
    if-lez v0, :cond_1

    .line 675
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    invoke-virtual {v1, v0, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 678
    :catch_0
    move-exception v0

    .line 685
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/locale/d;->h()V

    .line 687
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/locale/b;)V
    .locals 2

    .prologue
    .line 278
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/locale/a;->a(Lcom/qihoo/security/locale/b;)V

    .line 298
    :goto_0
    return-void

    .line 288
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->l:Ljava/util/List;

    if-nez v0, :cond_1

    .line 289
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/locale/d;->l:Ljava/util/List;

    .line 291
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 293
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/locale/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    :cond_0
    :goto_0
    return-void

    .line 146
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 128
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->n:Lcom/qihoo/security/locale/b$a;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/b;)V

    .line 129
    const-string/jumbo v0, "lm"

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/locale/d;->m:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 130
    return-void
.end method

.method public b(Lcom/qihoo/security/locale/b;)V
    .locals 1

    .prologue
    .line 302
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/locale/a;->b(Lcom/qihoo/security/locale/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    :cond_0
    :goto_0
    return-void

    .line 305
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 169
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/locale/a;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 172
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(I)[Ljava/lang/String;
    .locals 4

    .prologue
    .line 691
    iget-boolean v0, p0, Lcom/qihoo/security/locale/d;->h:Z

    if-eqz v0, :cond_1

    .line 693
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 694
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources;->getIdent(Ljava/lang/String;I)I

    move-result v0

    .line 696
    if-lez v0, :cond_1

    .line 697
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/lib/resl/ExtResources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    .line 715
    :goto_0
    return-object v0

    .line 700
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "array"

    iget-object v3, p0, Lcom/qihoo/security/locale/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 702
    if-lez v0, :cond_1

    .line 703
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->e:Landroid/content/res/Resources;

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 706
    :catch_0
    move-exception v0

    .line 713
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/locale/d;->h()V

    .line 715
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 241
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0}, Lcom/qihoo/security/locale/a;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    :cond_0
    :goto_0
    return-void

    .line 244
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 205
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/locale/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :cond_0
    :goto_0
    return-void

    .line 208
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d()V
    .locals 6

    .prologue
    .line 267
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->n:Lcom/qihoo/security/locale/b$a;

    iget-boolean v1, p0, Lcom/qihoo/security/locale/d;->h:Z

    iget-boolean v2, p0, Lcom/qihoo/security/locale/d;->g:Z

    iget-object v3, p0, Lcom/qihoo/security/locale/d;->i:Ljava/lang/String;

    iget-object v4, p0, Lcom/qihoo/security/locale/d;->j:Ljava/lang/String;

    iget-object v5, p0, Lcom/qihoo/security/locale/d;->k:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/locale/b$a;->a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 274
    :goto_0
    return-void

    .line 268
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public e()Ljava/io/File;
    .locals 3

    .prologue
    .line 484
    const/4 v1, 0x0

    .line 486
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 487
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v2}, Lcom/qihoo/security/locale/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 494
    :goto_0
    return-object v0

    .line 489
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 3

    .prologue
    .line 499
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0}, Lcom/qihoo/security/locale/a;->a()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 507
    :goto_0
    return-object v0

    .line 502
    :catch_0
    move-exception v0

    .line 507
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->c:Landroid/content/Context;

    const-string/jumbo v1, "language"

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/locale/LocaleInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 610
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    if-eqz v0, :cond_0

    .line 611
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->b:Lcom/qihoo/security/locale/a;

    invoke-interface {v0}, Lcom/qihoo/security/locale/a;->c()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 618
    :goto_0
    return-object v0

    .line 613
    :catch_0
    move-exception v0

    .line 618
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0
.end method

.method public h()V
    .locals 4

    .prologue
    .line 1081
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1082
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 1083
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    .line 1084
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1085
    iget-object v2, p0, Lcom/qihoo/security/locale/d;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/locale/d;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1086
    iget-object v0, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 1087
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->i:Ljava/lang/String;

    invoke-static {v1}, Lcom/qihoo/security/locale/d;->d(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    iput-object v1, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1088
    iget-object v1, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    iget-object v2, p0, Lcom/qihoo/security/locale/d;->d:Landroid/content/res/Resources;

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 1090
    :cond_0
    return-void
.end method
