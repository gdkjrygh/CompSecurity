.class public final Lcom/roidapp/photogrid/release/lp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/google/android/gms/ads/AdView;Landroid/widget/LinearLayout;)V
    .locals 5

    .prologue
    const/16 v3, 0xf0

    const/16 v4, 0x140

    .line 29
    :try_start_0
    invoke-virtual {p2}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 30
    invoke-virtual {p2}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 31
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/AdSize;->getHeightInPixels(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 32
    iget v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/16 v2, 0x23

    if-ge v0, v2, :cond_0

    .line 33
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 35
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 36
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1103
    if-gt v2, v3, :cond_3

    .line 1104
    const/16 v0, 0x25

    .line 37
    :goto_0
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 39
    :cond_0
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    if-eqz p1, :cond_2

    .line 41
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 42
    if-eqz v0, :cond_1

    .line 43
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 45
    :cond_1
    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 46
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 47
    invoke-static {v0}, Lcom/roidapp/photogrid/release/lp;->a(Lcom/google/android/gms/ads/AdRequest$Builder;)V

    .line 48
    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2

    .line 66
    :cond_2
    :goto_1
    return-void

    .line 1105
    :cond_3
    if-le v2, v3, :cond_4

    if-gt v2, v4, :cond_4

    .line 1106
    const/16 v0, 0x32

    goto :goto_0

    .line 1107
    :cond_4
    if-le v2, v4, :cond_5

    const/16 v3, 0x357

    if-gt v0, v3, :cond_5

    .line 1108
    const/16 v0, 0x4b

    goto :goto_0

    .line 1109
    :cond_5
    if-le v2, v4, :cond_6

    const/16 v3, 0x500

    if-le v0, v3, :cond_7

    .line 1111
    :cond_6
    const/16 v3, 0x437

    if-le v2, v3, :cond_7

    const/16 v2, 0x780

    if-gt v0, v2, :cond_7

    .line 1112
    const/16 v0, 0x96

    goto :goto_0

    .line 1114
    :cond_7
    const/16 v0, 0x64

    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 59
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NoClassDefFoundError;->printStackTrace()V

    goto :goto_1

    .line 64
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1
.end method

.method private static a(Lcom/google/android/gms/ads/AdRequest$Builder;)V
    .locals 3

    .prologue
    .line 119
    const/16 v0, 0x1b

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "E53AF8403808FF9EFB43D301DC7CD525"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "30693E3A920BB941B0BE9E5A78C383EE"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "38AB110462D602F3DA1DC2D7CFEC70D9"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "51AA1B7EA68B87A0362976088F99B550"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "9FEEE5BA9214100A9FA080321D54AFE3"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "1486E03FC30314F813E60BF2324DBFB3"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "0688E951AB60B1F0424BCFEC56ED832F"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "9769AA58048C16BE345F1B41F488C351"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "6E9B1F60BBDB7089F3C5378535541872"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "2BBE921B44E0B7F23C3BF705AD95DB39"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "D85DDF14A66EF344B6062ACDC46CFE24"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "9510C3785612E056CAAD2B2369FEA602"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "7F756B20D5AB727C1AFF9E526EA62F6A"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "582E9E80E5FDCE0A9B28E469C807E7B2"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "E2DDD8882806067531F153A7AD520147"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "5F75F75F096D844DBC223354A4C6F463"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "4E5BA6A6D8929320057A412F93C4A87A"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "052435A7CD69A65D63990CBDA87DDE86"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "CD9AB097966F78C0890C34AFE7755653"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "49058ED58D92ABA02A69D55993310238"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "5294498C2D72559FD6AEEB0E826341D8"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "A715E2E42D3E8945D2C3A24943663BC3"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "5294498C2D72559FD6AEEB0E826341D8"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "079EBCA9F7673E4C99503690B8034220"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "8E546C71CE10BF1886E480F3C2C698F7"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "0F99F56EA622B714E1CAD99EC35BD63A"

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "25B781C0A6DB7ED5C58C9C044C0C1B4F"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 149
    sget-object v1, Lcom/google/android/gms/ads/AdRequest;->DEVICE_ID_EMULATOR:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 150
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 151
    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    goto :goto_0

    .line 153
    :cond_0
    return-void
.end method
