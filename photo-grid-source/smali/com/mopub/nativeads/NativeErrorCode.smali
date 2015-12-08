.class public final enum Lcom/mopub/nativeads/NativeErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/nativeads/NativeErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum IMAGE_DOWNLOAD_FAILURE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum INVALID_JSON:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum INVALID_REQUEST_URL:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NATIVE_ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NATIVE_ADAPTER_NOT_FOUND:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_INVALID_REQUEST:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_INVALID_STATE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_NO_FILL:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_TIMEOUT:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum SERVER_ERROR_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum UNEXPECTED_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;

.field private static final synthetic b:[Lcom/mopub/nativeads/NativeErrorCode;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 6
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "EMPTY_AD_RESPONSE"

    const-string v2, "Server returned empty response."

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 7
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "INVALID_JSON"

    const-string v2, "Unable to parse JSON response from server."

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_JSON:Lcom/mopub/nativeads/NativeErrorCode;

    .line 8
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "IMAGE_DOWNLOAD_FAILURE"

    const-string v2, "Unable to download images associated with ad."

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->IMAGE_DOWNLOAD_FAILURE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 9
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "INVALID_REQUEST_URL"

    const-string v2, "Invalid request url."

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_REQUEST_URL:Lcom/mopub/nativeads/NativeErrorCode;

    .line 10
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "UNEXPECTED_RESPONSE_CODE"

    const-string v2, "Received unexpected response code from server."

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->UNEXPECTED_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 11
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "SERVER_ERROR_RESPONSE_CODE"

    const/4 v2, 0x5

    const-string v3, "Server returned erroneous response code."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->SERVER_ERROR_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 12
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "CONNECTION_ERROR"

    const/4 v2, 0x6

    const-string v3, "Network is unavailable."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    .line 13
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x7

    const-string v3, "Unspecified error occurred."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;

    .line 15
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_INVALID_REQUEST"

    const/16 v2, 0x8

    const-string v3, "Third-party network received invalid request."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_REQUEST:Lcom/mopub/nativeads/NativeErrorCode;

    .line 16
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_TIMEOUT"

    const/16 v2, 0x9

    const-string v3, "Third-party network failed to respond in a timely manner."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/nativeads/NativeErrorCode;

    .line 17
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_NO_FILL"

    const/16 v2, 0xa

    const-string v3, "Third-party network failed to provide an ad."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_NO_FILL:Lcom/mopub/nativeads/NativeErrorCode;

    .line 18
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_INVALID_STATE"

    const/16 v2, 0xb

    const-string v3, "Third-party network failed due to invalid internal state."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 20
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NATIVE_ADAPTER_CONFIGURATION_ERROR"

    const/16 v2, 0xc

    const-string v3, "Custom Event Native was configured incorrectly."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    .line 21
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NATIVE_ADAPTER_NOT_FOUND"

    const/16 v2, 0xd

    const-string v3, "Unable to find Custom Event Native."

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_NOT_FOUND:Lcom/mopub/nativeads/NativeErrorCode;

    .line 5
    const/16 v0, 0xe

    new-array v0, v0, [Lcom/mopub/nativeads/NativeErrorCode;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_JSON:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->IMAGE_DOWNLOAD_FAILURE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_REQUEST_URL:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->UNEXPECTED_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->SERVER_ERROR_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_REQUEST:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_NO_FILL:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_NOT_FOUND:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->b:[Lcom/mopub/nativeads/NativeErrorCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 26
    iput-object p3, p0, Lcom/mopub/nativeads/NativeErrorCode;->a:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/NativeErrorCode;
    .locals 1

    .prologue
    .line 5
    const-class v0, Lcom/mopub/nativeads/NativeErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/NativeErrorCode;

    return-object v0
.end method

.method public static values()[Lcom/mopub/nativeads/NativeErrorCode;
    .locals 1

    .prologue
    .line 5
    sget-object v0, Lcom/mopub/nativeads/NativeErrorCode;->b:[Lcom/mopub/nativeads/NativeErrorCode;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/NativeErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/NativeErrorCode;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mopub/nativeads/NativeErrorCode;->a:Ljava/lang/String;

    return-object v0
.end method
