.class public final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/ServerProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PROXY_API_VERSION:Ljava/lang/String; = "1"

.field private static final PROXY_BARE_URL_FORMAT:Ljava/lang/String; = "proxy.%s"

.field private static final PROXY_URL_FORMAT:Ljava/lang/String; = "https://proxy.%s"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getAPIVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    const-string v0, "1"

    return-object v0
.end method

.method public static final getProxyUrlBase()Ljava/lang/String;
    .locals 4

    .prologue
    .line 18
    const-string v0, "https://proxy.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getCleanmasterDomain()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
