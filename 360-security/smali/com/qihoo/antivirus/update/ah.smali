.class public Lcom/qihoo/antivirus/update/ah;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static c:Z

.field public static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 13
    sput-object v1, Lcom/qihoo/antivirus/update/ah;->a:Ljava/lang/String;

    .line 14
    sput-object v1, Lcom/qihoo/antivirus/update/ah;->b:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/antivirus/update/ah;->c:Z

    .line 16
    sput-object v1, Lcom/qihoo/antivirus/update/ah;->d:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 72
    const/4 v0, 0x0

    .line 96
    if-nez v0, :cond_0

    .line 98
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string/jumbo v1, "res/xml/config.xml"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openXmlResourceParser(Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    .line 99
    invoke-static {v0}, Lcom/qihoo/antivirus/update/ah;->a(Lorg/xmlpull/v1/XmlPullParser;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :cond_0
    :goto_0
    return-void

    .line 100
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 23
    :try_start_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    .line 25
    :goto_0
    if-ne v2, v1, :cond_0

    .line 68
    :goto_1
    return-void

    .line 26
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 27
    const/4 v4, 0x2

    if-ne v2, v4, :cond_8

    .line 28
    const-string/jumbo v2, "UpdateCheck"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    .line 61
    :cond_1
    :goto_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    goto :goto_0

    .line 30
    :cond_2
    if-lez v0, :cond_1

    .line 31
    const-string/jumbo v2, "Item"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 32
    const/4 v2, 0x0

    const-string/jumbo v3, "key"

    invoke-interface {p0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 33
    const/4 v3, 0x0

    const-string/jumbo v4, "value"

    invoke-interface {p0, v3, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 34
    const-string/jumbo v4, "server"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 35
    sput-object v3, Lcom/qihoo/antivirus/update/ah;->a:Ljava/lang/String;

    .line 37
    :cond_3
    const-string/jumbo v4, "localinipath"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 38
    sput-object v3, Lcom/qihoo/antivirus/update/ah;->b:Ljava/lang/String;

    .line 40
    :cond_4
    const-string/jumbo v4, "uselocalini"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 41
    const-string/jumbo v4, "0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 42
    const/4 v4, 0x0

    sput-boolean v4, Lcom/qihoo/antivirus/update/ah;->c:Z

    .line 49
    :cond_5
    :goto_3
    const-string/jumbo v4, "product"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 50
    sput-object v3, Lcom/qihoo/antivirus/update/ah;->d:Ljava/lang/String;

    goto :goto_2

    .line 63
    :catch_0
    move-exception v0

    goto :goto_1

    .line 43
    :cond_6
    const-string/jumbo v4, "false"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 44
    const/4 v4, 0x0

    sput-boolean v4, Lcom/qihoo/antivirus/update/ah;->c:Z

    goto :goto_3

    .line 46
    :cond_7
    const/4 v4, 0x1

    sput-boolean v4, Lcom/qihoo/antivirus/update/ah;->c:Z

    goto :goto_3

    .line 55
    :cond_8
    const/4 v4, 0x3

    if-ne v2, v4, :cond_1

    .line 56
    const-string/jumbo v2, "UpdateCheck"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1
.end method
