.class public Lcom/qihoo360/common/utils/FeatureConfigUtils;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final GOOGLE_PLAY_MARKET_LINK:Ljava/lang/String; = "market://details?id=%s"

.field public static final GOOGLE_PLAY_WEB_LINK:Ljava/lang/String; = "https://play.google.com/store/apps/details?id=%s"

.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private final c:Lcom/qihoo360/common/utils/IniProperties;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-string/jumbo v0, "fcu"

    sput-object v0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->a:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->b:Landroid/content/Context;

    .line 35
    new-instance v0, Lcom/qihoo360/common/utils/IniProperties;

    invoke-direct {v0}, Lcom/qihoo360/common/utils/IniProperties;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->c:Lcom/qihoo360/common/utils/IniProperties;

    .line 38
    const/4 v0, 0x0

    .line 68
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string/jumbo v2, "f_l_c.ini"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 76
    :goto_0
    if-eqz v1, :cond_0

    .line 78
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->c:Lcom/qihoo360/common/utils/IniProperties;

    invoke-virtual {v0, v1}, Lcom/qihoo360/common/utils/IniProperties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 88
    :cond_0
    :goto_1
    return-void

    .line 69
    :catch_0
    move-exception v1

    move-object v1, v0

    goto :goto_0

    .line 79
    :catch_1
    move-exception v0

    .line 82
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 83
    :catch_2
    move-exception v0

    goto :goto_1

    .line 80
    :catchall_0
    move-exception v0

    .line 82
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 85
    :goto_2
    throw v0

    .line 83
    :catch_3
    move-exception v1

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public getMarketLink(IZ)Ljava/lang/String;
    .locals 3

    .prologue
    .line 92
    iget-object v0, p0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->c:Lcom/qihoo360/common/utils/IniProperties;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "AsLink"

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/common/utils/IniProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 104
    :goto_0
    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    const-string/jumbo v0, "https://play.google.com/store/apps/details?id=%s"

    goto :goto_0

    :cond_1
    const-string/jumbo v0, "market://details?id=%s"

    goto :goto_0
.end method

.method public isUsingGooglePlay(I)Z
    .locals 3

    .prologue
    .line 109
    iget-object v0, p0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->c:Lcom/qihoo360/common/utils/IniProperties;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "AsLink"

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/common/utils/IniProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    const/4 v0, 0x0

    .line 114
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public shouldAppBoxBeEnabled(I)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 118
    iget-object v1, p0, Lcom/qihoo360/common/utils/FeatureConfigUtils;->c:Lcom/qihoo360/common/utils/IniProperties;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "AbEnabled"

    invoke-virtual {v1, v2, v3}, Lcom/qihoo360/common/utils/IniProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 120
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 121
    if-lez v1, :cond_0

    .line 139
    :goto_0
    return v0

    .line 132
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 134
    :catch_0
    move-exception v1

    goto :goto_0
.end method
