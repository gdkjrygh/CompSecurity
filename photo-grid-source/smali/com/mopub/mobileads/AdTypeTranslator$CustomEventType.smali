.class public final enum Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum GOOGLE_PLAY_SERVICES_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum GOOGLE_PLAY_SERVICES_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum HTML_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum HTML_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MILLENNIAL_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MILLENNIAL_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MOPUB_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MRAID_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MRAID_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum VAST_VIDEO_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field private static final synthetic c:[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 17
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "GOOGLE_PLAY_SERVICES_BANNER"

    const-string v2, "admob_native_banner"

    const-string v3, "com.mopub.mobileads.GooglePlayServicesBanner"

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 18
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "GOOGLE_PLAY_SERVICES_INTERSTITIAL"

    const-string v2, "admob_full_interstitial"

    const-string v3, "com.mopub.mobileads.GooglePlayServicesInterstitial"

    invoke-direct {v0, v1, v6, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 19
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MILLENNIAL_BANNER"

    const-string v2, "millennial_native_banner"

    const-string v3, "com.mopub.mobileads.MillennialBanner"

    invoke-direct {v0, v1, v7, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 20
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MILLENNIAL_INTERSTITIAL"

    const-string v2, "millennial_full_interstitial"

    const-string v3, "com.mopub.mobileads.MillennialInterstitial"

    invoke-direct {v0, v1, v8, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 23
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MRAID_BANNER"

    const-string v2, "mraid_banner"

    const-string v3, "com.mopub.mraid.MraidBanner"

    invoke-direct {v0, v1, v9, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 24
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MRAID_INTERSTITIAL"

    const/4 v2, 0x5

    const-string v3, "mraid_interstitial"

    const-string v4, "com.mopub.mraid.MraidInterstitial"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 25
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "HTML_BANNER"

    const/4 v2, 0x6

    const-string v3, "html_banner"

    const-string v4, "com.mopub.mobileads.HtmlBanner"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 26
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "HTML_INTERSTITIAL"

    const/4 v2, 0x7

    const-string v3, "html_interstitial"

    const-string v4, "com.mopub.mobileads.HtmlInterstitial"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 27
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "VAST_VIDEO_INTERSTITIAL"

    const/16 v2, 0x8

    const-string v3, "vast_interstitial"

    const-string v4, "com.mopub.mobileads.VastVideoInterstitial"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->VAST_VIDEO_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 28
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MOPUB_NATIVE"

    const/16 v2, 0x9

    const-string v3, "mopub_native"

    const-string v4, "com.mopub.nativeads.MoPubCustomEventNative"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MOPUB_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 30
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "UNSPECIFIED"

    const/16 v2, 0xa

    const-string v3, ""

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 15
    const/16 v0, 0xb

    new-array v0, v0, [Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v9

    const/4 v1, 0x5

    sget-object v2, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->VAST_VIDEO_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MOPUB_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->c:[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 36
    iput-object p3, p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->a:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->b:Ljava/lang/String;

    .line 38
    return-void
.end method

.method static synthetic a(Ljava/lang/String;)Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
    .locals 5

    .prologue
    .line 1041
    invoke-static {}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->values()[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 1042
    iget-object v4, v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->a:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1043
    :goto_1
    return-object v0

    .line 1041
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1047
    :cond_1
    sget-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    return-object v0
.end method

.method public static values()[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->c:[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    invoke-virtual {v0}, [Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->b:Ljava/lang/String;

    return-object v0
.end method
