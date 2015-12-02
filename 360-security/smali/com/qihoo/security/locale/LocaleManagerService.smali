.class public Lcom/qihoo/security/locale/LocaleManagerService;
.super Landroid/app/Service;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/locale/LocaleManagerService$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/locale/LocaleInfo;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList",
            "<",
            "Lcom/qihoo/security/locale/b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/qihoo/security/locale/LocaleManagerService$a;

.field private e:Ljava/io/File;

.field private f:Lcom/qihoo/security/lib/resl/ExtResources;

.field private final g:Landroid/content/BroadcastReceiver;

.field private final h:Lcom/qihoo/security/locale/a$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 55
    new-instance v0, Lcom/qihoo/security/locale/LocaleManagerService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/LocaleManagerService$1;-><init>(Lcom/qihoo/security/locale/LocaleManagerService;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->g:Landroid/content/BroadcastReceiver;

    .line 514
    new-instance v0, Lcom/qihoo/security/locale/LocaleManagerService$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/LocaleManagerService$3;-><init>(Lcom/qihoo/security/locale/LocaleManagerService;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->h:Lcom/qihoo/security/locale/a$a;

    .line 739
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/io/File;)Ljava/io/File;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->e:Ljava/io/File;

    return-object p1
.end method

.method private a()Ljava/util/List;
    .locals 9
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
    const/4 v1, 0x0

    .line 245
    new-instance v3, Ljava/util/ArrayList;

    const/16 v0, 0xf

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v2, 0x7f0e0000

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    .line 248
    if-eqz v2, :cond_0

    .line 249
    array-length v4, v2

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v2, v0

    .line 250
    new-instance v6, Lcom/qihoo/security/locale/LocaleInfo;

    invoke-direct {v6, v5}, Lcom/qihoo/security/locale/LocaleInfo;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 263
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    const-string/jumbo v2, "locale.dat"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/Utils;->openConfigFile(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 269
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 270
    new-instance v5, Lcom/qihoo/security/locale/LocaleInfo;

    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    invoke-direct {v5, v2, v0}, Lcom/qihoo/security/locale/LocaleInfo;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 271
    iget-object v0, v5, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/qihoo/security/locale/LocaleManagerService;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 274
    iget-boolean v0, v5, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    if-eqz v0, :cond_1

    .line 275
    const/4 v2, 0x1

    .line 276
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 277
    iget-object v7, v5, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    iget-object v8, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 278
    invoke-virtual {v0}, Lcom/qihoo/security/locale/LocaleInfo;->isAllVersionMatch()Z

    move-result v6

    if-eqz v6, :cond_3

    move v0, v1

    .line 295
    :goto_2
    if-eqz v0, :cond_1

    invoke-virtual {v5}, Lcom/qihoo/security/locale/LocaleInfo;->isAppBuildMatch()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 299
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 280
    :cond_3
    iget v6, v5, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    iget v7, v0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    if-le v6, v7, :cond_4

    .line 284
    invoke-interface {v3, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move v0, v2

    goto :goto_2

    :cond_4
    move v0, v1

    .line 291
    goto :goto_2

    .line 304
    :cond_5
    return-object v3

    :cond_6
    move v0, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->b:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct/range {p0 .. p5}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Ljava/util/List;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 12

    .prologue
    const/4 v11, 0x4

    const/4 v10, 0x3

    const/4 v9, 0x1

    const/4 v8, 0x2

    const/4 v7, 0x0

    .line 182
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 188
    iget-object v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/qihoo/security/locale/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 194
    iget-boolean v1, v0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    if-eqz v1, :cond_2

    .line 198
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v9

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    aput-object v0, v3, v8

    const-string/jumbo v0, ""

    aput-object v0, v3, v10

    const-string/jumbo v0, ""

    aput-object v0, v3, v11

    invoke-virtual {v2, v8, v3}, Lcom/qihoo/security/locale/LocaleManagerService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendMessage(Landroid/os/Message;)Z

    .line 241
    :goto_0
    return-void

    .line 202
    :cond_2
    iget v1, v0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    if-ne v1, v8, :cond_4

    .line 206
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    const-string/jumbo v1, "language"

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v9

    const-string/jumbo v3, ""

    aput-object v3, v2, v8

    const-string/jumbo v3, ""

    aput-object v3, v2, v10

    const-string/jumbo v3, ""

    aput-object v3, v2, v11

    invoke-virtual {v1, v8, v2}, Lcom/qihoo/security/locale/LocaleManagerService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 210
    :cond_4
    iget v1, v0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    if-eqz v1, :cond_5

    .line 218
    :cond_5
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    const/4 v3, 0x2

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    iget-object v6, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x3

    iget-object v6, v0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x4

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/LocaleManagerService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 220
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private a(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/locale/LocaleInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 405
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->h:Lcom/qihoo/security/locale/a$a;

    invoke-virtual {v1}, Lcom/qihoo/security/locale/a$a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 413
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    .line 414
    if-nez v7, :cond_0

    .line 458
    :goto_0
    return-void

    .line 423
    :cond_0
    array-length v8, v7

    const/4 v0, 0x0

    move v6, v0

    :goto_1
    if-ge v6, v8, :cond_3

    aget-object v0, v7, v6

    .line 425
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1}, Lcom/qihoo/security/lib/resl/ExtResources;->unloadAll()V

    .line 426
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources;->initResources(Ljava/lang/String;)V

    .line 427
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1}, Lcom/qihoo/security/lib/resl/ExtResources;->loadInfo()V

    .line 429
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1}, Lcom/qihoo/security/lib/resl/ExtResources;->getVersionCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 430
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v1}, Lcom/qihoo/security/lib/resl/ExtResources;->getPkgInfo()Ljava/lang/String;

    move-result-object v1

    .line 431
    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v3}, Lcom/qihoo/security/lib/resl/ExtResources;->getPkgName()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v3

    .line 432
    if-eqz v1, :cond_1

    if-nez v3, :cond_2

    .line 423
    :cond_1
    :goto_2
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_1

    .line 449
    :cond_2
    const-string/jumbo v4, ";"

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 450
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Ljava/util/List;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 453
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    invoke-virtual {v0}, Lcom/qihoo/security/lib/resl/ExtResources;->unloadAll()V

    goto :goto_0

    .line 442
    :catch_0
    move-exception v0

    goto :goto_2

    .line 406
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/util/List;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/locale/LocaleInfo;",
            ">;I",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    const/4 v1, 0x2

    const/4 v7, 0x1

    .line 467
    if-eqz p4, :cond_0

    array-length v0, p4

    if-ge v0, v1, :cond_1

    .line 512
    :cond_0
    :goto_0
    return-void

    .line 472
    :cond_1
    array-length v0, p4

    if-le v0, v1, :cond_3

    aget-object v5, p4, v1

    .line 473
    :goto_1
    new-instance v0, Lcom/qihoo/security/locale/LocaleInfo;

    aget-object v1, p4, v8

    aget-object v2, p4, v7

    move v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/locale/LocaleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    iget-boolean v1, v0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    if-eqz v1, :cond_0

    .line 479
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/LocaleInfo;

    .line 481
    iget-boolean v3, v1, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    if-nez v3, :cond_2

    .line 489
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p3, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 494
    iget v0, v1, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    if-gt v0, p2, :cond_4

    .line 495
    iput v8, v1, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 499
    :goto_2
    aget-object v0, p4, v7

    iput-object v0, v1, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 500
    iput-object p5, v1, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 501
    iput p2, v1, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 502
    iput-object v5, v1, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    goto :goto_0

    .line 472
    :cond_3
    const-string/jumbo v5, ""

    goto :goto_1

    .line 497
    :cond_4
    iput v7, v1, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    goto :goto_2

    .line 511
    :cond_5
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/qihoo/security/locale/LocaleManagerService;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 950
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->b:Ljava/util/List;

    if-nez v0, :cond_1

    .line 1007
    :cond_0
    :goto_0
    return-void

    .line 953
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 954
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 955
    if-eqz v0, :cond_2

    iget-boolean v4, v0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    if-nez v4, :cond_2

    iget-object v4, v0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 956
    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 961
    :cond_3
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleManagerService;->h:Lcom/qihoo/security/locale/a$a;

    invoke-virtual {v3}, Lcom/qihoo/security/locale/a$a;->g()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 969
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 970
    if-eqz v3, :cond_0

    array-length v0, v3

    if-lez v0, :cond_0

    .line 978
    array-length v4, v3

    move v0, v1

    :goto_2
    if-ge v0, v4, :cond_0

    aget-object v5, v3, v0

    .line 979
    if-nez v5, :cond_5

    .line 978
    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 982
    :cond_5
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 983
    if-eqz v6, :cond_4

    .line 984
    invoke-interface {v2, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 985
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 989
    const-string/jumbo v7, ".apk"

    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 992
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 993
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x4

    invoke-virtual {v5, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 994
    new-instance v6, Ljava/io/File;

    iget-object v7, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v8, ".dex"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 998
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 999
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    goto :goto_3

    .line 962
    :catch_0
    move-exception v0

    goto/16 :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Ljava/util/List;)V

    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 314
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/a$a;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->h:Lcom/qihoo/security/locale/a$a;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/locale/LocaleManagerService;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/qihoo/security/locale/LocaleManagerService;->b()V

    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/io/File;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->e:Ljava/io/File;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->c:Landroid/os/RemoteCallbackList;

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->h:Lcom/qihoo/security/locale/a$a;

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 150
    invoke-super {p0, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 160
    return-void
.end method

.method public onCreate()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 73
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 74
    invoke-virtual {p0}, Lcom/qihoo/security/locale/LocaleManagerService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    .line 75
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->c:Landroid/os/RemoteCallbackList;

    .line 76
    new-instance v0, Lcom/qihoo/security/locale/LocaleManagerService$a;

    invoke-direct {v0, p0, v3}, Lcom/qihoo/security/locale/LocaleManagerService$a;-><init>(Lcom/qihoo/security/locale/LocaleManagerService;Lcom/qihoo/security/locale/LocaleManagerService$1;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->d:Lcom/qihoo/security/locale/LocaleManagerService$a;

    .line 77
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->f:Lcom/qihoo/security/lib/resl/ExtResources;

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->g:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string/jumbo v2, "android.intent.action.LOCALE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/qihoo/security/locale/LocaleManagerService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 81
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    .line 84
    :try_start_0
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    .line 85
    const/4 v1, 0x0

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const/4 v3, 0x0

    invoke-static {p0, v1, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 86
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v2, v3, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 87
    const/16 v1, 0x100

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/locale/LocaleManagerService;->startForeground(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/locale/LocaleManagerService$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/locale/LocaleManagerService$2;-><init>(Lcom/qihoo/security/locale/LocaleManagerService;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 135
    return-void

    .line 88
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 169
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService;->g:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/LocaleManagerService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    :goto_0
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 177
    return-void

    .line 170
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .prologue
    .line 139
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 140
    const/4 v0, 0x1

    return v0
.end method
