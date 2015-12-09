.class public final Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;
.super Ljava/lang/Object;
.source "AndroidLocaleJSI.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AndroidLocaleJSI"

.field private static final instance:Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

.field private static final isoCountry:Ljava/lang/String;

.field private static final languageCountry:Ljava/lang/String;

.field private static final skipLanding:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->instance:Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    .line 29
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CA"

    :goto_0
    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->isoCountry:Ljava/lang/String;

    .line 32
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->buildLanguageCountry()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->languageCountry:Ljava/lang/String;

    .line 34
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->setSkipLanding()Z

    move-result v0

    sput-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->skipLanding:Z

    return-void

    .line 29
    :cond_0
    const-string v0, "US"

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    return-void
.end method

.method private static buildLanguageCountry()Ljava/lang/String;
    .locals 13

    .prologue
    .line 40
    invoke-static {}, Lcom/capitalone/mobile/banking/app/Application;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    .line 43
    .local v1, "ctx":Landroid/content/Context;
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f09008b

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 46
    .local v9, "tempLC":Ljava/lang/String;
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 47
    .local v8, "supportedLanguageCountry":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 50
    .local v3, "defaultLangaugeCountry":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f0c0001

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    .line 53
    .local v4, "defaultValues":[Ljava/lang/String;
    move-object v0, v4

    .local v0, "arr$":[Ljava/lang/String;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_0
    if-ge v5, v6, :cond_1

    aget-object v2, v0, v5

    .line 55
    .local v2, "currentValue":Ljava/lang/String;
    const-string v10, "\\|"

    invoke-virtual {v2, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 57
    .local v7, "splitValue":[Ljava/lang/String;
    array-length v10, v7

    const/4 v11, 0x2

    if-ne v10, v11, :cond_0

    .line 58
    const/4 v10, 0x0

    aget-object v10, v7, v10

    const/4 v11, 0x1

    aget-object v11, v7, v11

    invoke-interface {v3, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 63
    .end local v2    # "currentValue":Ljava/lang/String;
    .end local v7    # "splitValue":[Ljava/lang/String;
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 66
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f0c0002

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    .line 67
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 69
    const-string v10, "AndroidLocaleJSI"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Locale Country: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    sget-object v12, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->isoCountry:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    sget-object v10, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->isoCountry:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 74
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "-"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    sget-object v11, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->isoCountry:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 75
    const-string v10, "AndroidLocaleJSI"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Langauge Country as defined by OS: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    .line 80
    sget-object v10, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->isoCountry:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .end local v9    # "tempLC":Ljava/lang/String;
    check-cast v9, Ljava/lang/String;

    .line 84
    .restart local v9    # "tempLC":Ljava/lang/String;
    :cond_2
    const-string v10, "AndroidLocaleJSI"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Language Country set to: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-object v9
.end method

.method public static getCountryCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->isoCountry:Ljava/lang/String;

    return-object v0
.end method

.method public static getInstance()Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;
    .locals 1

    .prologue
    .line 101
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->instance:Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    return-object v0
.end method

.method private static setSkipLanding()Z
    .locals 2

    .prologue
    .line 90
    invoke-static {}, Lcom/capitalone/mobile/banking/app/Application;->getCurrentContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x7f0c0000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->isoCountry:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public getCountryName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 113
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "canada"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "united states"

    goto :goto_0
.end method

.method public getLanguageCountry()Ljava/lang/String;
    .locals 1

    .prologue
    .line 109
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->languageCountry:Ljava/lang/String;

    return-object v0
.end method

.method public skipLanding()Z
    .locals 1

    .prologue
    .line 105
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->skipLanding:Z

    return v0
.end method
