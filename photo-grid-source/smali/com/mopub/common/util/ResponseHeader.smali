.class public final enum Lcom/mopub/common/util/ResponseHeader;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/util/ResponseHeader;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ACCEPT_LANGUAGE:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum AD_TIMEOUT:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum AD_TYPE:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum CLICK_TRACKING_URL:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum CUSTOM_EVENT_DATA:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum CUSTOM_EVENT_HTML_DATA:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum CUSTOM_EVENT_NAME:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum CUSTOM_SELECTOR:Lcom/mopub/common/util/ResponseHeader;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum DSP_CREATIVE_ID:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum FAIL_URL:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum FULL_AD_TYPE:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum HEIGHT:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum IMPRESSION_URL:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum LOCATION:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum NATIVE_PARAMS:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum NETWORK_TYPE:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum ORIENTATION:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum REDIRECT_URL:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum REFRESH_TIME:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum SCROLLABLE:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum USER_AGENT:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum WARMUP:Lcom/mopub/common/util/ResponseHeader;

.field public static final enum WIDTH:Lcom/mopub/common/util/ResponseHeader;

.field private static final synthetic b:[Lcom/mopub/common/util/ResponseHeader;


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

    .line 4
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "AD_TIMEOUT"

    const-string v2, "X-AdTimeout"

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->AD_TIMEOUT:Lcom/mopub/common/util/ResponseHeader;

    .line 5
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "AD_TYPE"

    const-string v2, "X-Adtype"

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->AD_TYPE:Lcom/mopub/common/util/ResponseHeader;

    .line 6
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "CLICK_TRACKING_URL"

    const-string v2, "X-Clickthrough"

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->CLICK_TRACKING_URL:Lcom/mopub/common/util/ResponseHeader;

    .line 7
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "CUSTOM_EVENT_DATA"

    const-string v2, "X-Custom-Event-Class-Data"

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_EVENT_DATA:Lcom/mopub/common/util/ResponseHeader;

    .line 8
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "CUSTOM_EVENT_NAME"

    const-string v2, "X-Custom-Event-Class-Name"

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_EVENT_NAME:Lcom/mopub/common/util/ResponseHeader;

    .line 9
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "CUSTOM_EVENT_HTML_DATA"

    const/4 v2, 0x5

    const-string v3, "X-Custom-Event-Html-Data"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_EVENT_HTML_DATA:Lcom/mopub/common/util/ResponseHeader;

    .line 10
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "DSP_CREATIVE_ID"

    const/4 v2, 0x6

    const-string v3, "X-DspCreativeid"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->DSP_CREATIVE_ID:Lcom/mopub/common/util/ResponseHeader;

    .line 11
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "FAIL_URL"

    const/4 v2, 0x7

    const-string v3, "X-Failurl"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->FAIL_URL:Lcom/mopub/common/util/ResponseHeader;

    .line 12
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "FULL_AD_TYPE"

    const/16 v2, 0x8

    const-string v3, "X-Fulladtype"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->FULL_AD_TYPE:Lcom/mopub/common/util/ResponseHeader;

    .line 13
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "HEIGHT"

    const/16 v2, 0x9

    const-string v3, "X-Height"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->HEIGHT:Lcom/mopub/common/util/ResponseHeader;

    .line 14
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "IMPRESSION_URL"

    const/16 v2, 0xa

    const-string v3, "X-Imptracker"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->IMPRESSION_URL:Lcom/mopub/common/util/ResponseHeader;

    .line 15
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "REDIRECT_URL"

    const/16 v2, 0xb

    const-string v3, "X-Launchpage"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->REDIRECT_URL:Lcom/mopub/common/util/ResponseHeader;

    .line 16
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "NATIVE_PARAMS"

    const/16 v2, 0xc

    const-string v3, "X-Nativeparams"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->NATIVE_PARAMS:Lcom/mopub/common/util/ResponseHeader;

    .line 17
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "NETWORK_TYPE"

    const/16 v2, 0xd

    const-string v3, "X-Networktype"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->NETWORK_TYPE:Lcom/mopub/common/util/ResponseHeader;

    .line 18
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "ORIENTATION"

    const/16 v2, 0xe

    const-string v3, "X-Orientation"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->ORIENTATION:Lcom/mopub/common/util/ResponseHeader;

    .line 19
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "REFRESH_TIME"

    const/16 v2, 0xf

    const-string v3, "X-Refreshtime"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->REFRESH_TIME:Lcom/mopub/common/util/ResponseHeader;

    .line 20
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "SCROLLABLE"

    const/16 v2, 0x10

    const-string v3, "X-Scrollable"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->SCROLLABLE:Lcom/mopub/common/util/ResponseHeader;

    .line 21
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "WARMUP"

    const/16 v2, 0x11

    const-string v3, "X-Warmup"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->WARMUP:Lcom/mopub/common/util/ResponseHeader;

    .line 22
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "WIDTH"

    const/16 v2, 0x12

    const-string v3, "X-Width"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->WIDTH:Lcom/mopub/common/util/ResponseHeader;

    .line 24
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "LOCATION"

    const/16 v2, 0x13

    const-string v3, "Location"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->LOCATION:Lcom/mopub/common/util/ResponseHeader;

    .line 25
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "USER_AGENT"

    const/16 v2, 0x14

    const-string v3, "User-Agent"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->USER_AGENT:Lcom/mopub/common/util/ResponseHeader;

    .line 26
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "ACCEPT_LANGUAGE"

    const/16 v2, 0x15

    const-string v3, "Accept-Language"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->ACCEPT_LANGUAGE:Lcom/mopub/common/util/ResponseHeader;

    .line 28
    new-instance v0, Lcom/mopub/common/util/ResponseHeader;

    const-string v1, "CUSTOM_SELECTOR"

    const/16 v2, 0x16

    const-string v3, "X-Customselector"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/ResponseHeader;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_SELECTOR:Lcom/mopub/common/util/ResponseHeader;

    .line 3
    const/16 v0, 0x17

    new-array v0, v0, [Lcom/mopub/common/util/ResponseHeader;

    sget-object v1, Lcom/mopub/common/util/ResponseHeader;->AD_TIMEOUT:Lcom/mopub/common/util/ResponseHeader;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/util/ResponseHeader;->AD_TYPE:Lcom/mopub/common/util/ResponseHeader;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/common/util/ResponseHeader;->CLICK_TRACKING_URL:Lcom/mopub/common/util/ResponseHeader;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_EVENT_DATA:Lcom/mopub/common/util/ResponseHeader;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_EVENT_NAME:Lcom/mopub/common/util/ResponseHeader;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_EVENT_HTML_DATA:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->DSP_CREATIVE_ID:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->FAIL_URL:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->FULL_AD_TYPE:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->HEIGHT:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->IMPRESSION_URL:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->REDIRECT_URL:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->NATIVE_PARAMS:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->NETWORK_TYPE:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->ORIENTATION:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->REFRESH_TIME:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->SCROLLABLE:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->WARMUP:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->WIDTH:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->LOCATION:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->USER_AGENT:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->ACCEPT_LANGUAGE:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lcom/mopub/common/util/ResponseHeader;->CUSTOM_SELECTOR:Lcom/mopub/common/util/ResponseHeader;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/common/util/ResponseHeader;->b:[Lcom/mopub/common/util/ResponseHeader;

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
    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput-object p3, p0, Lcom/mopub/common/util/ResponseHeader;->a:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/util/ResponseHeader;
    .locals 1

    .prologue
    .line 3
    const-class v0, Lcom/mopub/common/util/ResponseHeader;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/util/ResponseHeader;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/util/ResponseHeader;
    .locals 1

    .prologue
    .line 3
    sget-object v0, Lcom/mopub/common/util/ResponseHeader;->b:[Lcom/mopub/common/util/ResponseHeader;

    invoke-virtual {v0}, [Lcom/mopub/common/util/ResponseHeader;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/util/ResponseHeader;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/mopub/common/util/ResponseHeader;->a:Ljava/lang/String;

    return-object v0
.end method
