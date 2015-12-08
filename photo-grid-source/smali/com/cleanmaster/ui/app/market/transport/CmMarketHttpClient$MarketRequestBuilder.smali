.class public Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
.super Lcom/cleanmaster/ui/app/market/transport/a;
.source "SourceFile"


# static fields
.field public static final REQUEST_APPS_CATEGORY:Ljava/lang/String; = "14"

.field public static final REQUEST_APPS_POP:Ljava/lang/String; = "29"

.field public static final REQUEST_APPS_TOP:Ljava/lang/String; = "30"

.field public static final REQUEST_BANNER:Ljava/lang/String; = "10"

.field public static final REQUEST_CM_FAMILY:Ljava/lang/String; = "42"

.field public static final REQUEST_GAMES:Ljava/lang/String; = "12"

.field public static final REQUEST_GAMES_TOP:Ljava/lang/String; = "28"

.field public static final REQUEST_GAME_BOX:Ljava/lang/String; = "15"

.field public static final REQUEST_GAME_CATEGORY:Ljava/lang/String; = "13"

.field public static final REQUEST_GAME_TIP:Ljava/lang/String; = "15001"

.field public static final REQUEST_GUESSYOU_LIKE_APP:Ljava/lang/String; = "33"

.field public static final REQUEST_HOT_APPS:Ljava/lang/String; = "11"

.field public static final REQUEST_HOT_APPS_FROM_GIFTBOX:Ljava/lang/String; = "6"

.field public static final REQUEST_MAIN_TOP:Ljava/lang/String; = "26"

.field public static final REQUEST_MARKET_MY_GAME_BATCH_RECOMMEND:Ljava/lang/String; = "39"

.field public static final REQUEST_MARKET_MY_GAME_BUSINESS_RECOMMEND:Ljava/lang/String; = "36"

.field public static final REQUEST_MARKET_MY_GAME_WEB_DETAILS:Ljava/lang/String; = "38"

.field public static final REQUEST_MARKET_UNINSTALL_BATCH_RECOMMEND:Ljava/lang/String; = "3004"

.field public static final REQUEST_RECOMMEND_AD_FOR_PROCESS:Ljava/lang/String; = "21"

.field public static final REQUEST_RECOMMEND_AD_FOR_UNINSTALL:Ljava/lang/String; = "22"

.field public static final REQUEST_RECOMMEND_APP:Ljava/lang/String; = "41"

.field public static final REQUEST_RECOMMEND_FEWER_APP:Ljava/lang/String; = "3003"

.field public static final REQUEST_RECOMMEND_FOR_FEWER_APP:Ljava/lang/String; = "24"

.field public static final REQUEST_RECOMMEND_FOR_IN_MARKET_FEWER_APP:Ljava/lang/String; = "31"

.field public static final REQUEST_RECOMMEND_HISTORY:Ljava/lang/String; = "20"

.field public static final REQUEST_RECOMMEND_MUST_APP:Ljava/lang/String; = "3002"

.field public static final REQUEST_RECOMMEND_MUST_HAVE_GAME:Ljava/lang/String; = "505"

.field public static final REQUEST_RECOMMEND_SIMILAR_APP:Ljava/lang/String; = "32"

.field public static final REQUEST_RECOMMOND_GAEME:Ljava/lang/String; = "40"

.field public static final REQUEST_RESULTPAGE_BANNER_AD:Ljava/lang/String; = "4004"

.field public static final REQUEST_SEARCH_HOTKEY:Ljava/lang/String; = "16002"

.field public static final REQUEST_SEARCH_HOTKEY_GAME:Ljava/lang/String; = "16012"

.field public static final REQUEST_SEARCH_RECOM:Ljava/lang/String; = "16003"

.field public static final REQUEST_SEARCH_RECOM_GAME:Ljava/lang/String; = "16014"

.field public static final REQUEST_SEARCH_RESULT:Ljava/lang/String; = "16"

.field public static final REQUEST_SEARCH_RESULT_GAME:Ljava/lang/String; = "16013"

.field public static final REQUEST_SEARCH_SUGGEST:Ljava/lang/String; = "16001"

.field public static final REQUEST_SEARCH_SUGGEST_GAME:Ljava/lang/String; = "16011"

.field public static final REQUEST_UNINSTALL_RECOMMEND_FROM_5_4:Ljava/lang/String; = "3001"

.field private static final TEST_PARAM_KEY:I = 0x0

.field private static final TEST_PARAM_VALUE:I = 0x1


# instance fields
.field public mPosId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 8

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 269
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/transport/a;-><init>()V

    .line 254
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mPosId:Ljava/lang/String;

    .line 270
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 271
    invoke-static {v3}, Lcom/cleanmaster/common/a;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 272
    invoke-static {v3}, Lcom/cleanmaster/common/a;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 275
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v5

    invoke-virtual {v5}, Lcom/picksinit/b;->getMid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mid(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 276
    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->sdkt(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 277
    const-string v5, "%s_%s"

    new-array v6, v2, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    aput-object v4, v6, v1

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->lan(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 279
    const-string v0, "ro.product.brand"

    const-string v4, "unknow"

    invoke-static {v0, v4}, Lcom/cleanmaster/functionevent/report/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->brand(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 280
    const-string v0, "ro.product.model"

    const-string v4, "unknow"

    invoke-static {v0, v4}, Lcom/cleanmaster/functionevent/report/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->model(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 281
    invoke-static {}, Lcom/cleanmaster/common/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->androidid(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 282
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getmAdResourceRp()I

    move-result v0

    if-ne v0, v1, :cond_1

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/cleanmaster/common/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->cver(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 284
    invoke-static {v3}, Lcom/cleanmaster/common/a;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mcc(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 285
    invoke-static {v3}, Lcom/cleanmaster/common/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mnc(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 286
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->ov(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 287
    invoke-static {v3}, Lcom/cleanmaster/util/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->nt(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 288
    invoke-static {}, Lcom/cleanmaster/common/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->ch(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 289
    invoke-static {v3}, Lcom/cleanmaster/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->resolution(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 290
    invoke-static {v3}, Lcom/cleanmaster/common/a;->e(Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->dpi(F)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 291
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mem_size()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 292
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->setGooglePlayAdvertisingId()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 293
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->pl()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 294
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getSSPId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->sspId(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 295
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->isCnVersion()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    invoke-direct {p0, v3}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->setDeviceParms(Landroid/content/Context;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    .line 298
    :cond_0
    return-void

    .line 282
    :cond_1
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getmCver()I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v2

    .line 287
    goto :goto_1
.end method

.method public static CREATOR()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 1

    .prologue
    .line 266
    new-instance v0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;-><init>()V

    return-object v0
.end method

.method private addDebugParams()V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 593
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->getDebugParams()Ljava/lang/String;

    move-result-object v0

    .line 594
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 595
    const-string v2, "&"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 596
    array-length v0, v2

    if-gtz v0, :cond_1

    .line 607
    :cond_0
    return-void

    .line 599
    :cond_1
    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 600
    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 601
    array-length v5, v4

    const/4 v6, 0x2

    if-ne v5, v6, :cond_2

    .line 604
    iget-object v5, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    aget-object v7, v4, v1

    const/4 v8, 0x1

    aget-object v4, v4, v8

    invoke-direct {v6, v7, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 599
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private getDebugParams()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 610
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    .line 612
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 613
    new-instance v2, Ljava/io/File;

    const-string v3, "ksmobile.txt"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 614
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 619
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 620
    :try_start_1
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 621
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v0

    .line 626
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 629
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 639
    :cond_0
    :goto_0
    return-object v0

    .line 623
    :catch_0
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    :goto_1
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 625
    if-eqz v2, :cond_1

    .line 626
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 628
    :cond_1
    if-eqz v3, :cond_0

    .line 629
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_0

    .line 633
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0

    .line 625
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    :goto_2
    if-eqz v2, :cond_2

    .line 626
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 628
    :cond_2
    if-eqz v3, :cond_3

    .line 629
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    :cond_3
    throw v1
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 635
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 625
    :catchall_1
    move-exception v1

    move-object v2, v0

    goto :goto_2

    :catchall_2
    move-exception v1

    goto :goto_2

    .line 623
    :catch_3
    move-exception v1

    move-object v2, v0

    goto :goto_1

    :catch_4
    move-exception v1

    goto :goto_1
.end method

.method private getDeviceParms(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 319
    invoke-static {p1}, Lcom/cleanmaster/common/a;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 320
    return-object v0
.end method

.method public static isAppRequest(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 258
    const-string v0, "13"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "14"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 260
    :cond_0
    const/4 v0, 0x0

    .line 262
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private setDeviceParms(Landroid/content/Context;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 305
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "imei="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->getDeviceParms(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/util/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 306
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 307
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "attach"

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    :cond_0
    return-object p0
.end method


# virtual methods
.method public addParams(Ljava/lang/String;Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 3

    .prologue
    .line 556
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    return-object p0
.end method

.method public adn(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 385
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "adn"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    return-object p0
.end method

.method public androidid(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 369
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "androidid"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    return-object p0
.end method

.method public brand(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 470
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "brand"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 471
    return-object p0
.end method

.method public ch(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 486
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "ch"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 487
    return-object p0
.end method

.method public cver(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 377
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "cver"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    return-object p0
.end method

.method public bridge synthetic cver(I)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 1

    .prologue
    .line 205
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->cver(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    move-result-object v0

    return-object v0
.end method

.method public dpi(F)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 502
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "dpi"

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 503
    return-object p0
.end method

.method public g_pg(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 390
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "g_pg"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 391
    return-object p0
.end method

.method public h(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 414
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "h"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    return-object p0
.end method

.method public lan(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 494
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "lan"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 495
    return-object p0
.end method

.method public bridge synthetic lan(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 1

    .prologue
    .line 205
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->lan(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    move-result-object v0

    return-object v0
.end method

.method public mcc(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 3

    .prologue
    .line 438
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "mcc"

    invoke-direct {v1, v2, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 439
    return-object p0
.end method

.method public bridge synthetic mcc(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 1

    .prologue
    .line 205
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mcc(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    move-result-object v0

    return-object v0
.end method

.method public mem_size()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 328
    invoke-static {}, Lcom/cleanmaster/func/process/b;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/cleanmaster/functionevent/report/a;->a(J)I

    move-result v0

    .line 329
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "mem_size"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    return-object p0
.end method

.method public mid(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 349
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "mid"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 350
    return-object p0
.end method

.method public mnc(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 3

    .prologue
    .line 446
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "mnc"

    invoke-direct {v1, v2, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    return-object p0
.end method

.method public model(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 478
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "model"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 479
    return-object p0
.end method

.method public nt(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 430
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "nt"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 431
    return-object p0
.end method

.method public offset(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 532
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "offset"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 533
    return-object p0
.end method

.method public ov(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 422
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "ov"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    return-object p0
.end method

.method public pg(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 398
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "pg"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 399
    return-object p0
.end method

.method public pl()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 454
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "pl"

    const-string v3, "2"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 455
    return-object p0
.end method

.method public posid(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 357
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mPosId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mPosId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 362
    :goto_0
    return-object p0

    .line 360
    :cond_0
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mPosId:Ljava/lang/String;

    .line 361
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "posid"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public query(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 3

    .prologue
    .line 462
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "query"

    invoke-direct {v1, v2, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    return-object p0
.end method

.method public resolution(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 510
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "resolution"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 511
    return-object p0
.end method

.method public bridge synthetic resolution(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 1

    .prologue
    .line 205
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->resolution(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;

    move-result-object v0

    return-object v0
.end method

.method public sdkt(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 520
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "sdkt"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 521
    return-object p0
.end method

.method public sessionID(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 542
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "sessionid"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    return-object p0
.end method

.method public setGooglePlayAdvertisingId()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 338
    invoke-static {}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getInstance()Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getGAId()Ljava/lang/String;

    move-result-object v0

    .line 339
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 340
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "gaid"

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    :cond_0
    return-object p0
.end method

.method public sspId(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 548
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 549
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "sspid"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 551
    :cond_0
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 644
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->toURI()Ljava/net/URI;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toURI()Ljava/net/URI;
    .locals 3

    .prologue
    .line 589
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mHost:Ljava/lang/String;

    iget v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->mPort:I

    const-string v2, "/b/"

    invoke-virtual {p0, v0, v1, v2}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->toURI(Ljava/lang/String;ILjava/lang/String;)Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method public toURI(Ljava/lang/String;ILjava/lang/String;)Ljava/net/URI;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 566
    .line 569
    :try_start_0
    invoke-static {}, Lcom/cleanmaster/ui/app/market/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 570
    const-string v0, "http"

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lorg/apache/http/client/utils/URIUtils;->createURI(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 585
    :goto_0
    return-object v0

    .line 572
    :cond_0
    invoke-static {}, Lcom/cleanmaster/ui/app/market/c;->c()Ljava/lang/String;

    move-result-object v0

    .line 573
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 574
    const-string v0, "https"

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lorg/apache/http/client/utils/URIUtils;->createURI(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    goto :goto_0

    .line 575
    :cond_1
    sget-object v1, Lcom/cleanmaster/ui/app/market/transport/b;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 576
    const-string v0, "http"

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lorg/apache/http/client/utils/URIUtils;->createURI(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    goto :goto_0

    .line 577
    :cond_2
    sget-object v1, Lcom/cleanmaster/ui/app/market/transport/b;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 578
    const-string v0, "https"

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lorg/apache/http/client/utils/URIUtils;->createURI(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 582
    :catch_0
    move-exception v0

    move-object v0, v6

    goto :goto_0

    :cond_3
    move-object v0, v6

    goto :goto_0
.end method

.method public w(I)Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;
    .locals 4

    .prologue
    .line 406
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "w"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 407
    return-object p0
.end method
