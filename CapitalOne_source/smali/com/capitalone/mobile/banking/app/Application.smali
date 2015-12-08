.class public Lcom/capitalone/mobile/banking/app/Application;
.super Landroid/app/Application;
.source "Application.java"


# static fields
.field private static mContext:Landroid/content/Context;


# instance fields
.field private mLocale:Ljava/util/Locale;

.field private sessionManager:Lcom/capitalone/mobile/banking/session/SessionManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-object v0, Lcom/capitalone/mobile/banking/app/Application;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 26
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 28
    iput-object v0, p0, Lcom/capitalone/mobile/banking/app/Application;->sessionManager:Lcom/capitalone/mobile/banking/session/SessionManager;

    .line 32
    iput-object v0, p0, Lcom/capitalone/mobile/banking/app/Application;->mLocale:Ljava/util/Locale;

    return-void
.end method

.method private getAppLocale()Ljava/util/Locale;
    .locals 2

    .prologue
    .line 87
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "fr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    sget-object v0, Ljava/util/Locale;->CANADA_FRENCH:Ljava/util/Locale;

    .line 98
    :goto_0
    return-object v0

    .line 95
    :cond_0
    sget-object v0, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    goto :goto_0

    .line 98
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    goto :goto_0
.end method

.method public static getCurrentContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lcom/capitalone/mobile/banking/app/Application;->mContext:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/capitalone/mobile/banking/app/Application;->sessionManager:Lcom/capitalone/mobile/banking/session/SessionManager;

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 71
    invoke-super {p0, p1}, Landroid/app/Application;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 72
    iget-object v0, p0, Lcom/capitalone/mobile/banking/app/Application;->mLocale:Ljava/util/Locale;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/capitalone/mobile/banking/app/Application;->mLocale:Ljava/util/Locale;

    iput-object v0, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 75
    iget-object v0, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {v0}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 76
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 78
    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 5

    .prologue
    .line 36
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 38
    new-instance v2, Lcom/capitalone/mobile/banking/session/SessionManager;

    invoke-direct {v2, p0}, Lcom/capitalone/mobile/banking/session/SessionManager;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/capitalone/mobile/banking/app/Application;->sessionManager:Lcom/capitalone/mobile/banking/session/SessionManager;

    .line 39
    sput-object p0, Lcom/capitalone/mobile/banking/app/Application;->mContext:Landroid/content/Context;

    .line 41
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 42
    .local v0, "config":Landroid/content/res/Configuration;
    invoke-direct {p0}, Lcom/capitalone/mobile/banking/app/Application;->getAppLocale()Ljava/util/Locale;

    move-result-object v1

    .line 43
    .local v1, "newLocale":Ljava/util/Locale;
    iget-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v2, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 45
    new-instance v2, Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/capitalone/mobile/banking/app/Application;->mLocale:Ljava/util/Locale;

    .line 46
    iget-object v2, p0, Lcom/capitalone/mobile/banking/app/Application;->mLocale:Ljava/util/Locale;

    invoke-static {v2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 47
    iget-object v2, p0, Lcom/capitalone/mobile/banking/app/Application;->mLocale:Ljava/util/Locale;

    iput-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 48
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 50
    :cond_0
    return-void
.end method
