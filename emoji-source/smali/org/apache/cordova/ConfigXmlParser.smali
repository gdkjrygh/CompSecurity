.class public Lorg/apache/cordova/ConfigXmlParser;
.super Ljava/lang/Object;
.source "ConfigXmlParser.java"


# static fields
.field private static TAG:Ljava/lang/String;


# instance fields
.field private externalWhitelist:Lorg/apache/cordova/Whitelist;

.field private internalWhitelist:Lorg/apache/cordova/Whitelist;

.field private launchUrl:Ljava/lang/String;

.field private pluginEntries:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/cordova/PluginEntry;",
            ">;"
        }
    .end annotation
.end field

.field private prefs:Lorg/apache/cordova/CordovaPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-string v0, "ConfigXmlParser"

    sput-object v0, Lorg/apache/cordova/ConfigXmlParser;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const-string v0, "file:///android_asset/www/index.html"

    iput-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->launchUrl:Ljava/lang/String;

    .line 39
    new-instance v0, Lorg/apache/cordova/CordovaPreferences;

    invoke-direct {v0}, Lorg/apache/cordova/CordovaPreferences;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->prefs:Lorg/apache/cordova/CordovaPreferences;

    .line 40
    new-instance v0, Lorg/apache/cordova/Whitelist;

    invoke-direct {v0}, Lorg/apache/cordova/Whitelist;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    .line 41
    new-instance v0, Lorg/apache/cordova/Whitelist;

    invoke-direct {v0}, Lorg/apache/cordova/Whitelist;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->externalWhitelist:Lorg/apache/cordova/Whitelist;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->pluginEntries:Ljava/util/ArrayList;

    return-void
.end method

.method private setStartUrl(Ljava/lang/String;)V
    .locals 4
    .param p1, "src"    # Ljava/lang/String;

    .prologue
    .line 170
    const-string v2, "^[a-z-]+://"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 171
    .local v1, "schemeRegex":Ljava/util/regex/Pattern;
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 172
    .local v0, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 173
    iput-object p1, p0, Lorg/apache/cordova/ConfigXmlParser;->launchUrl:Ljava/lang/String;

    .line 180
    :goto_0
    return-void

    .line 175
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_1

    .line 176
    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 178
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file:///android_asset/www/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/cordova/ConfigXmlParser;->launchUrl:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public getExternalWhitelist()Lorg/apache/cordova/Whitelist;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->externalWhitelist:Lorg/apache/cordova/Whitelist;

    return-object v0
.end method

.method public getInternalWhitelist()Lorg/apache/cordova/Whitelist;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    return-object v0
.end method

.method public getLaunchUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->launchUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getPluginEntries()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/cordova/PluginEntry;",
            ">;"
        }
    .end annotation

    .prologue
    .line 57
    iget-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->pluginEntries:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getPreferences()Lorg/apache/cordova/CordovaPreferences;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lorg/apache/cordova/ConfigXmlParser;->prefs:Lorg/apache/cordova/CordovaPreferences;

    return-object v0
.end method

.method public parse(Landroid/app/Activity;)V
    .locals 5
    .param p1, "action"    # Landroid/app/Activity;

    .prologue
    .line 66
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "config"

    const-string v3, "xml"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 67
    .local v0, "id":I
    if-nez v0, :cond_0

    .line 69
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "config"

    const-string v3, "xml"

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 70
    if-nez v0, :cond_0

    .line 71
    sget-object v1, Lorg/apache/cordova/ConfigXmlParser;->TAG:Ljava/lang/String;

    const-string v2, "res/xml/config.xml is missing!"

    invoke-static {v1, v2}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    :goto_0
    return-void

    .line 75
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/apache/cordova/ConfigXmlParser;->parse(Landroid/content/res/XmlResourceParser;)V

    goto :goto_0
.end method

.method public parse(Landroid/content/res/XmlResourceParser;)V
    .locals 21
    .param p1, "xml"    # Landroid/content/res/XmlResourceParser;

    .prologue
    .line 79
    const/4 v4, -0x1

    .line 80
    .local v4, "eventType":I
    const-string v12, ""

    .local v12, "service":Ljava/lang/String;
    const-string v11, ""

    .local v11, "pluginClass":Ljava/lang/String;
    const-string v10, ""

    .line 81
    .local v10, "paramType":Ljava/lang/String;
    const/4 v8, 0x0

    .line 82
    .local v8, "onload":Z
    const/4 v6, 0x0

    .line 83
    .local v6, "insideFeature":Z
    const/16 v16, 0x0

    .line 86
    .local v16, "urlMap":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    move-object/from16 v18, v0

    const-string v19, "file:///*"

    const/16 v20, 0x0

    invoke-virtual/range {v18 .. v20}, Lorg/apache/cordova/Whitelist;->addWhiteListEntry(Ljava/lang/String;Z)V

    .line 87
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    move-object/from16 v18, v0

    const-string v19, "content:///*"

    const/16 v20, 0x0

    invoke-virtual/range {v18 .. v20}, Lorg/apache/cordova/Whitelist;->addWhiteListEntry(Ljava/lang/String;Z)V

    .line 88
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    move-object/from16 v18, v0

    const-string v19, "data:*"

    const/16 v20, 0x0

    invoke-virtual/range {v18 .. v20}, Lorg/apache/cordova/Whitelist;->addWhiteListEntry(Ljava/lang/String;Z)V

    .line 90
    :goto_0
    const/16 v18, 0x1

    move/from16 v0, v18

    if-eq v4, v0, :cond_10

    .line 91
    const/16 v18, 0x2

    move/from16 v0, v18

    if-ne v4, v0, :cond_f

    .line 92
    invoke-interface/range {p1 .. p1}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v14

    .line 93
    .local v14, "strNode":Ljava/lang/String;
    const-string v18, "url-filter"

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2

    .line 94
    sget-object v18, Lorg/apache/cordova/ConfigXmlParser;->TAG:Ljava/lang/String;

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "Plugin "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, " is using deprecated tag <url-filter>"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    if-nez v16, :cond_0

    .line 96
    new-instance v16, Ljava/util/ArrayList;

    .end local v16    # "urlMap":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/16 v18, 0x2

    move-object/from16 v0, v16

    move/from16 v1, v18

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .restart local v16    # "urlMap":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_0
    const/16 v18, 0x0

    const-string v19, "value"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .end local v14    # "strNode":Ljava/lang/String;
    :cond_1
    :goto_1
    :try_start_0
    invoke-interface/range {p1 .. p1}, Landroid/content/res/XmlResourceParser;->next()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v4

    goto :goto_0

    .line 99
    .restart local v14    # "strNode":Ljava/lang/String;
    :cond_2
    const-string v18, "feature"

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_3

    .line 102
    const/4 v6, 0x1

    .line 103
    const/16 v18, 0x0

    const-string v19, "name"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    .line 105
    :cond_3
    if-eqz v6, :cond_7

    const-string v18, "param"

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_7

    .line 106
    const/16 v18, 0x0

    const-string v19, "name"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 107
    const-string v18, "service"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_4

    .line 108
    const/16 v18, 0x0

    const-string v19, "value"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    .line 109
    :cond_4
    const-string v18, "package"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_5

    const-string v18, "android-package"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_6

    .line 110
    :cond_5
    const/16 v18, 0x0

    const-string v19, "value"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_1

    .line 111
    :cond_6
    const-string v18, "onload"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1

    .line 112
    const-string v18, "true"

    const/16 v19, 0x0

    const-string v20, "value"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    goto/16 :goto_1

    .line 114
    :cond_7
    const-string v18, "access"

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_d

    .line 115
    const/16 v18, 0x0

    const-string v19, "origin"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 116
    .local v9, "origin":Ljava/lang/String;
    const/16 v18, 0x0

    const-string v19, "subdomains"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 117
    .local v15, "subdomains":Ljava/lang/String;
    const/16 v18, 0x0

    const-string v19, "launch-external"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_8

    const/4 v5, 0x1

    .line 118
    .local v5, "external":Z
    :goto_2
    if-eqz v9, :cond_1

    .line 119
    if-eqz v5, :cond_a

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->externalWhitelist:Lorg/apache/cordova/Whitelist;

    move-object/from16 v19, v0

    if-eqz v15, :cond_9

    const-string v18, "true"

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v18

    if-nez v18, :cond_9

    const/16 v18, 0x1

    :goto_3
    move-object/from16 v0, v19

    move/from16 v1, v18

    invoke-virtual {v0, v9, v1}, Lorg/apache/cordova/Whitelist;->addWhiteListEntry(Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 117
    .end local v5    # "external":Z
    :cond_8
    const/4 v5, 0x0

    goto :goto_2

    .line 120
    .restart local v5    # "external":Z
    :cond_9
    const/16 v18, 0x0

    goto :goto_3

    .line 122
    :cond_a
    const-string v18, "*"

    move-object/from16 v0, v18

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_b

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    move-object/from16 v18, v0

    const-string v19, "http://*/*"

    const/16 v20, 0x0

    invoke-virtual/range {v18 .. v20}, Lorg/apache/cordova/Whitelist;->addWhiteListEntry(Ljava/lang/String;Z)V

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    move-object/from16 v18, v0

    const-string v19, "https://*/*"

    const/16 v20, 0x0

    invoke-virtual/range {v18 .. v20}, Lorg/apache/cordova/Whitelist;->addWhiteListEntry(Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 129
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    move-object/from16 v19, v0

    if-eqz v15, :cond_c

    const-string v18, "true"

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v18

    if-nez v18, :cond_c

    const/16 v18, 0x1

    :goto_4
    move-object/from16 v0, v19

    move/from16 v1, v18

    invoke-virtual {v0, v9, v1}, Lorg/apache/cordova/Whitelist;->addWhiteListEntry(Ljava/lang/String;Z)V

    goto/16 :goto_1

    :cond_c
    const/16 v18, 0x0

    goto :goto_4

    .line 134
    .end local v5    # "external":Z
    .end local v9    # "origin":Ljava/lang/String;
    .end local v15    # "subdomains":Ljava/lang/String;
    :cond_d
    const-string v18, "preference"

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    .line 135
    const/16 v18, 0x0

    const-string v19, "name"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    sget-object v19, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 136
    .local v7, "name":Ljava/lang/String;
    const/16 v18, 0x0

    const-string v19, "value"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 137
    .local v17, "value":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->prefs:Lorg/apache/cordova/CordovaPreferences;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v7, v1}, Lorg/apache/cordova/CordovaPreferences;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 139
    .end local v7    # "name":Ljava/lang/String;
    .end local v17    # "value":Ljava/lang/String;
    :cond_e
    const-string v18, "content"

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1

    .line 140
    const/16 v18, 0x0

    const-string v19, "src"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-interface {v0, v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 141
    .local v13, "src":Ljava/lang/String;
    if-eqz v13, :cond_1

    .line 142
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lorg/apache/cordova/ConfigXmlParser;->setStartUrl(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 146
    .end local v13    # "src":Ljava/lang/String;
    .end local v14    # "strNode":Ljava/lang/String;
    :cond_f
    const/16 v18, 0x3

    move/from16 v0, v18

    if-ne v4, v0, :cond_1

    .line 148
    invoke-interface/range {p1 .. p1}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v14

    .line 149
    .restart local v14    # "strNode":Ljava/lang/String;
    const-string v18, "feature"

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1

    .line 150
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/ConfigXmlParser;->pluginEntries:Ljava/util/ArrayList;

    move-object/from16 v18, v0

    new-instance v19, Lorg/apache/cordova/PluginEntry;

    move-object/from16 v0, v19

    move-object/from16 v1, v16

    invoke-direct {v0, v12, v11, v8, v1}, Lorg/apache/cordova/PluginEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    invoke-virtual/range {v18 .. v19}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    const-string v12, ""

    .line 153
    const-string v11, ""

    .line 154
    const/4 v6, 0x0

    .line 155
    const/4 v8, 0x0

    .line 156
    const/16 v16, 0x0

    goto/16 :goto_1

    .line 161
    .end local v14    # "strNode":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 162
    .local v3, "e":Lorg/xmlpull/v1/XmlPullParserException;
    invoke-virtual {v3}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto/16 :goto_0

    .line 163
    .end local v3    # "e":Lorg/xmlpull/v1/XmlPullParserException;
    :catch_1
    move-exception v3

    .line 164
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 167
    .end local v3    # "e":Ljava/io/IOException;
    :cond_10
    return-void
.end method
