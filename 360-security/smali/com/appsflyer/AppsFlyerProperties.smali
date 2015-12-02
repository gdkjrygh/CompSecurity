.class public Lcom/appsflyer/AppsFlyerProperties;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final AF_KEY:Ljava/lang/String; = "AppsFlyerKey"

.field public static final APP_ID:Ljava/lang/String; = "appid"

.field public static final APP_USER_ID:Ljava/lang/String; = "AppUserId"

.field public static final CHANNEL:Ljava/lang/String; = "channel"

.field public static final COLLECT_ANDROID_ID:Ljava/lang/String; = "collectAndroidId"

.field public static final COLLECT_IMEI:Ljava/lang/String; = "collectIMEI"

.field public static final COLLECT_MAC:Ljava/lang/String; = "collectMAC"

.field public static final CURRENCY_CODE:Ljava/lang/String; = "currencyCode"

.field public static final DEVICE_TRACKING_DISABLED:Ljava/lang/String; = "deviceTrackingDisabled"

.field public static final IS_UPDATE:Ljava/lang/String; = "IS_UPDATE"

.field public static final USE_HTTP_FALLBACK:Ljava/lang/String; = "useHttpFallback"

.field private static instance:Lcom/appsflyer/AppsFlyerProperties;


# instance fields
.field private isDisableLog:Z

.field private isLaunchCalled:Z

.field private isOnReceiveCalled:Z

.field private properties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private referrer:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    new-instance v0, Lcom/appsflyer/AppsFlyerProperties;

    invoke-direct {v0}, Lcom/appsflyer/AppsFlyerProperties;-><init>()V

    sput-object v0, Lcom/appsflyer/AppsFlyerProperties;->instance:Lcom/appsflyer/AppsFlyerProperties;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/AppsFlyerProperties;->properties:Ljava/util/Map;

    .line 36
    return-void
.end method

.method public static getInstance()Lcom/appsflyer/AppsFlyerProperties;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/appsflyer/AppsFlyerProperties;->instance:Lcom/appsflyer/AppsFlyerProperties;

    return-object v0
.end method


# virtual methods
.method public disableLogOutput(Z)V
    .locals 0

    .prologue
    .line 92
    iput-boolean p1, p0, Lcom/appsflyer/AppsFlyerProperties;->isDisableLog:Z

    .line 93
    return-void
.end method

.method public get(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerProperties;->properties:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 1

    .prologue
    .line 55
    invoke-virtual {p0, p1}, Lcom/appsflyer/AppsFlyerProperties;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    if-nez v0, :cond_0

    .line 59
    :goto_0
    return p2

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_0
.end method

.method public getReferrer(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 83
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerProperties;->referrer:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerProperties;->referrer:Ljava/lang/String;

    .line 87
    :goto_0
    return-object v0

    .line 86
    :cond_0
    const-string/jumbo v0, "appsflyer-data"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 87
    const-string/jumbo v1, "referrer"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public isDisableLog()Z
    .locals 1

    .prologue
    .line 96
    iget-boolean v0, p0, Lcom/appsflyer/AppsFlyerProperties;->isDisableLog:Z

    return v0
.end method

.method protected isLaunchCalled()Z
    .locals 1

    .prologue
    .line 71
    iget-boolean v0, p0, Lcom/appsflyer/AppsFlyerProperties;->isLaunchCalled:Z

    return v0
.end method

.method protected isOnReceiveCalled()Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/appsflyer/AppsFlyerProperties;->isOnReceiveCalled:Z

    return v0
.end method

.method public set(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerProperties;->properties:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    return-void
.end method

.method public set(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerProperties;->properties:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    return-void
.end method

.method protected setLaunchCalled()V
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/appsflyer/AppsFlyerProperties;->isLaunchCalled:Z

    .line 76
    return-void
.end method

.method protected setOnReceiveCalled()V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/appsflyer/AppsFlyerProperties;->isOnReceiveCalled:Z

    .line 68
    return-void
.end method

.method protected setReferrer(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/appsflyer/AppsFlyerProperties;->referrer:Ljava/lang/String;

    .line 80
    return-void
.end method
