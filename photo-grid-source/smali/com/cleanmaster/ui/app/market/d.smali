.class public Lcom/cleanmaster/ui/app/market/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lcom/cleanmaster/util/n;

.field private static b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 220
    new-instance v0, Lcom/cleanmaster/ui/app/market/e;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/e;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/market/d;->a:Lcom/cleanmaster/util/n;

    .line 227
    const/4 v0, 0x0

    sput-object v0, Lcom/cleanmaster/ui/app/market/d;->b:Ljava/util/Map;

    .line 229
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/market/d;->b:Ljava/util/Map;

    .line 230
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 83
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    invoke-static {p1}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    invoke-static {p1, p0}, Lcom/cleanmaster/common/a;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 95
    :cond_0
    :goto_0
    return-void

    .line 87
    :cond_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 88
    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 91
    invoke-static {p0, v0}, Lcom/cleanmaster/common/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;ZLcom/picksinit/ClickAdFinishListener;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 410
    if-nez p0, :cond_0

    .line 443
    :goto_0
    return-void

    .line 413
    :cond_0
    new-instance v0, Lcom/cleanmaster/ui/app/utils/MarketContext;

    invoke-direct {v0, p0}, Lcom/cleanmaster/ui/app/utils/MarketContext;-><init>(Landroid/content/Context;)V

    .line 414
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->isDeepLink()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/common/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 415
    invoke-static {v0, p2}, Lcom/cleanmaster/ui/app/market/deeplink/a;->a(Landroid/content/Context;Lcom/cleanmaster/ui/app/market/Ad;)Z

    .line 416
    if-eqz p5, :cond_1

    .line 417
    invoke-interface {p5, v2}, Lcom/picksinit/ClickAdFinishListener;->onClickFinish(Lcom/picksinit/goGp;)V

    .line 435
    :cond_1
    :goto_1
    if-nez p4, :cond_5

    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->hasDetail()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 436
    invoke-static {p1, p2, p3}, Lcom/cleanmaster/ui/app/market/d;->e(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V

    .line 442
    :goto_2
    invoke-static {p2}, Lcom/cleanmaster/ui/app/market/d;->a(Lcom/cleanmaster/ui/app/market/Ad;)V

    goto :goto_0

    .line 419
    :cond_2
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/common/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 420
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/common/a;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 421
    if-eqz p5, :cond_1

    .line 422
    invoke-interface {p5, v2}, Lcom/picksinit/ClickAdFinishListener;->onClickFinish(Lcom/picksinit/goGp;)V

    goto :goto_1

    .line 424
    :cond_3
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->isOpenBrowser()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 425
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->getPkgUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/d;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 426
    if-eqz p5, :cond_1

    .line 427
    invoke-interface {p5, v2}, Lcom/picksinit/ClickAdFinishListener;->onClickFinish(Lcom/picksinit/goGp;)V

    goto :goto_1

    .line 430
    :cond_4
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->getPkgUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p5, p2, p1}, Lcom/cleanmaster/ui/app/market/d;->a(Landroid/content/Context;Ljava/lang/String;Lcom/picksinit/ClickAdFinishListener;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)Z

    .line 432
    invoke-virtual {p2}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/service/LocalService;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 438
    :cond_5
    invoke-static {p1, p2, p3}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V

    goto :goto_2
.end method

.method public static a(Lcom/cleanmaster/ui/app/market/Ad;)V
    .locals 4

    .prologue
    .line 446
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "null"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 448
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 449
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 450
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 451
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 452
    if-eqz v2, :cond_0

    .line 453
    new-instance v3, Lcom/cleanmaster/ui/app/market/f;

    invoke-direct {v3, v2}, Lcom/cleanmaster/ui/app/market/f;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v3}, Lcom/cleanmaster/ui/app/market/f;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 450
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 467
    :cond_1
    return-void
.end method

.method public static a(Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 237
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    :cond_0
    :goto_0
    return-void

    .line 240
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 241
    invoke-static {p1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/cleanmaster/util/g;->e(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    .line 245
    :goto_1
    invoke-static {p0}, Lcom/cleanmaster/ui/app/market/d;->c(Lcom/cleanmaster/ui/app/market/Ad;)I

    move-result v1

    .line 246
    invoke-static {v0, v1}, Lcom/cleanmaster/util/g;->a(Lcom/cleanmaster/util/g;I)V

    .line 247
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v1

    .line 248
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 249
    invoke-virtual {v2, v1, v0}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 250
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0

    .line 243
    :cond_2
    invoke-static {p1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 254
    if-eqz p1, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    :cond_0
    :goto_0
    return-void

    .line 258
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 259
    invoke-static {p0}, Lcom/cleanmaster/util/g;->b(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/cleanmaster/util/g;->e(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    .line 263
    :goto_1
    invoke-static {p1}, Lcom/cleanmaster/ui/app/market/d;->c(Lcom/cleanmaster/ui/app/market/Ad;)I

    move-result v1

    .line 264
    invoke-static {v0, v1}, Lcom/cleanmaster/util/g;->a(Lcom/cleanmaster/util/g;I)V

    .line 265
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v1

    .line 266
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 267
    invoke-virtual {v2, v1, v0}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 268
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    .line 270
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getResType()I

    move-result v0

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getContextCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 271
    new-instance v0, Lcom/cleanmaster/util/l;

    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getContextCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/cleanmaster/util/l;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/cleanmaster/util/l;->a()V

    goto :goto_0

    .line 261
    :cond_2
    invoke-static {p0}, Lcom/cleanmaster/util/g;->b(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 549
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 564
    :cond_0
    :goto_0
    return-void

    .line 552
    :cond_1
    invoke-static {p0}, Lcom/cleanmaster/ui/app/market/Ad;->createAd(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    .line 553
    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 558
    invoke-static {p1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v1

    .line 559
    invoke-virtual {v0, p2}, Lcom/cleanmaster/ui/app/market/Ad;->setResType(I)V

    .line 560
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v0

    .line 561
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 562
    invoke-virtual {v2, v0, v1}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 563
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 591
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 606
    :cond_0
    :goto_0
    return-void

    .line 594
    :cond_1
    invoke-static {p2}, Lcom/cleanmaster/ui/app/market/Ad;->createAd(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    .line 595
    if-eqz v0, :cond_0

    .line 599
    invoke-static {p3}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v1

    .line 600
    invoke-virtual {v0, p4}, Lcom/cleanmaster/ui/app/market/Ad;->setResType(I)V

    .line 601
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v0

    .line 602
    invoke-virtual {v0, p0, p1}, Lcom/cleanmaster/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 603
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 604
    invoke-virtual {v2, v0, v1}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 605
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0
.end method

.method public static a(Ljava/util/List;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 44
    if-eqz p0, :cond_3

    .line 45
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 46
    invoke-static {}, Lcom/cleanmaster/func/cache/a;->a()Lcom/cleanmaster/func/cache/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/func/cache/a;->b()Ljava/util/List;

    move-result-object v3

    .line 47
    if-eqz v3, :cond_0

    move v1, v2

    .line 48
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 49
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 50
    iget-object v5, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    move v3, v2

    .line 53
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 54
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 55
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageInfo;

    .line 56
    if-eqz v1, :cond_2

    .line 57
    iget v5, v0, Lcom/cleanmaster/ui/app/market/Ad;->versionCode:I

    if-ltz v5, :cond_1

    iget v5, v0, Lcom/cleanmaster/ui/app/market/Ad;->versionCode:I

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    if-le v5, v1, :cond_1

    .line 58
    const/4 v1, 0x2

    iput v1, v0, Lcom/cleanmaster/ui/app/market/Ad;->installedStatus:I

    .line 53
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 60
    :cond_1
    const/4 v1, 0x1

    iput v1, v0, Lcom/cleanmaster/ui/app/market/Ad;->installedStatus:I

    goto :goto_2

    .line 63
    :cond_2
    iput v2, v0, Lcom/cleanmaster/ui/app/market/Ad;->installedStatus:I

    goto :goto_2

    .line 67
    :cond_3
    return-void
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 659
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->isCnVersion()Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x1

    .line 115
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :goto_0
    return v0

    .line 117
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/picksinit/ClickAdFinishListener;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 494
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez p0, :cond_1

    .line 540
    :cond_0
    :goto_0
    return v0

    .line 498
    :cond_1
    invoke-static {p1}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 499
    if-eqz p2, :cond_2

    .line 500
    new-instance v1, Lcom/picksinit/SmartGoGp;

    invoke-direct {v1, p1}, Lcom/picksinit/SmartGoGp;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lcom/picksinit/ClickAdFinishListener;->onClickFinish(Lcom/picksinit/goGp;)V

    goto :goto_0

    .line 502
    :cond_2
    invoke-static {p0, p1}, Lcom/cleanmaster/ui/app/market/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 505
    :cond_3
    invoke-static {}, Lcom/cleanmaster/ui/app/utils/a;->a()Lcom/cleanmaster/ui/app/utils/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/cleanmaster/ui/app/utils/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 506
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 507
    invoke-static {p1}, Lcom/cleanmaster/ui/app/market/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 509
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 510
    new-instance v7, Lcom/cleanmaster/ui/app/market/i;

    invoke-direct {v7}, Lcom/cleanmaster/ui/app/market/i;-><init>()V

    .line 511
    new-instance v0, Lcom/cleanmaster/ui/app/market/h;

    move-object v1, p3

    move-object v2, p4

    move-object v3, p2

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/ui/app/market/h;-><init>(Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;Lcom/picksinit/ClickAdFinishListener;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/cleanmaster/ui/app/market/i;->a(Lcom/cleanmaster/ui/app/market/n;)V

    .line 529
    invoke-virtual {v7, p1}, Lcom/cleanmaster/ui/app/market/i;->b(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/k;

    move v0, v6

    .line 531
    goto :goto_0

    .line 533
    :cond_5
    if-eqz p2, :cond_6

    .line 534
    new-instance v1, Lcom/picksinit/SmartGoGp;

    invoke-direct {v1, v0}, Lcom/picksinit/SmartGoGp;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lcom/picksinit/ClickAdFinishListener;->onClickFinish(Lcom/picksinit/goGp;)V

    move v0, v6

    goto :goto_0

    .line 536
    :cond_6
    invoke-static {p0, v0}, Lcom/cleanmaster/ui/app/market/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    move v0, v6

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 70
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 75
    :cond_0
    :goto_0
    return v0

    .line 72
    :cond_1
    const-string v1, "https://play.google.com"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "http://play.google.com"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "market:"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 73
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    sget-object v0, Lcom/cleanmaster/ui/app/market/d;->a:Lcom/cleanmaster/util/n;

    invoke-virtual {v0, p0}, Lcom/cleanmaster/util/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static b(Lcom/cleanmaster/ui/app/market/Ad;)V
    .locals 4

    .prologue
    .line 470
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getThirdImpUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "null"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getThirdImpUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 472
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getThirdImpUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 473
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 474
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 475
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 476
    if-eqz v2, :cond_0

    .line 477
    new-instance v3, Lcom/cleanmaster/ui/app/market/g;

    invoke-direct {v3, v2}, Lcom/cleanmaster/ui/app/market/g;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v3}, Lcom/cleanmaster/ui/app/market/g;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 474
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 491
    :cond_1
    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 292
    if-eqz p1, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    :cond_0
    :goto_0
    return-void

    .line 295
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 296
    invoke-static {p0}, Lcom/cleanmaster/util/g;->d(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/cleanmaster/util/g;->e(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    .line 301
    :goto_1
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v1

    .line 302
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 303
    invoke-virtual {v2, v1, v0}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 304
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0

    .line 298
    :cond_2
    invoke-static {p0}, Lcom/cleanmaster/util/g;->d(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    goto :goto_1
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 570
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 585
    :cond_0
    :goto_0
    return-void

    .line 574
    :cond_1
    invoke-static {p0}, Lcom/cleanmaster/ui/app/market/Ad;->createAd(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    .line 575
    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 579
    invoke-static {p1}, Lcom/cleanmaster/util/g;->b(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v1

    .line 580
    invoke-virtual {v0, p2}, Lcom/cleanmaster/ui/app/market/Ad;->setResType(I)V

    .line 581
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v0

    .line 582
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 583
    invoke-virtual {v2, v0, v1}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 584
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 612
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 628
    :cond_0
    :goto_0
    return-void

    .line 615
    :cond_1
    invoke-static {p2}, Lcom/cleanmaster/ui/app/market/Ad;->createAd(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    .line 616
    if-eqz v0, :cond_0

    .line 621
    invoke-static {p3}, Lcom/cleanmaster/util/g;->b(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v1

    .line 622
    invoke-virtual {v0, p4}, Lcom/cleanmaster/ui/app/market/Ad;->setResType(I)V

    .line 623
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v0

    .line 624
    invoke-virtual {v0, p0, p1}, Lcom/cleanmaster/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 626
    invoke-virtual {v2, v0, v1}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 627
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 101
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 102
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    .line 103
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 104
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 105
    invoke-static {p0, v0}, Lcom/cleanmaster/ui/app/market/d;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 106
    const/4 v0, 0x1

    .line 108
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Lcom/cleanmaster/ui/app/market/Ad;)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 276
    if-nez p0, :cond_1

    .line 288
    :cond_0
    :goto_0
    return v0

    .line 279
    :cond_1
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cleanmaster/common/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 280
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isDeepLink()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 281
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDeepLink()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 282
    const/4 v0, 0x2

    goto :goto_0

    .line 284
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 309
    if-nez p1, :cond_0

    .line 317
    :goto_0
    return-void

    .line 312
    :cond_0
    invoke-static {p0, p2}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    .line 313
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v1

    .line 314
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 315
    invoke-virtual {v2, v1, v0}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 316
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 320
    if-nez p1, :cond_0

    .line 328
    :goto_0
    return-void

    .line 323
    :cond_0
    invoke-static {p0, p2}, Lcom/cleanmaster/util/g;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    .line 324
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v1

    .line 325
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 326
    invoke-virtual {v2, v1, v0}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 327
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0
.end method

.method public static e(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 364
    if-eqz p1, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    :cond_0
    :goto_0
    return-void

    .line 368
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 369
    invoke-static {p0}, Lcom/cleanmaster/util/g;->c(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/cleanmaster/util/g;->e(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    .line 374
    :goto_1
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->toBuinessDataItem()Lcom/cleanmaster/util/f;

    move-result-object v1

    .line 375
    new-instance v2, Lcom/cleanmaster/util/d;

    invoke-direct {v2}, Lcom/cleanmaster/util/d;-><init>()V

    .line 376
    invoke-virtual {v2, v1, v0}, Lcom/cleanmaster/util/d;->a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V

    .line 377
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/cleanmaster/util/d;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    .line 379
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getResType()I

    move-result v0

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getContextCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 380
    new-instance v0, Lcom/cleanmaster/util/l;

    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getContextCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/cleanmaster/util/l;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/cleanmaster/util/l;->a()V

    goto :goto_0

    .line 371
    :cond_2
    invoke-static {p0}, Lcom/cleanmaster/util/g;->c(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    goto :goto_1
.end method
