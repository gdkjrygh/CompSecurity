.class public Lcom/EnterpriseMobileBanking/Config;
.super Ljava/lang/Object;
.source "Config.java"


# static fields
.field public static final MOBILE_CONFIG_BYPASS_SSL_ERRORS:Ljava/lang/Boolean;

.field public static final MOBILE_CONFIG_LOCALE_COUNTRY:Ljava/lang/String; = "us"

.field public static final MOBILE_CONFIG_URL:Ljava/lang/String; = "https://m.capitalone.com:443/static/mobileconfig.json"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const-string v0, "false"

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/Config;->MOBILE_CONFIG_BYPASS_SSL_ERRORS:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
