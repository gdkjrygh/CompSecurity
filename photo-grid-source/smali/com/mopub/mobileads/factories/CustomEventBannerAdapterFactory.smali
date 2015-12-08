.class public Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static a:Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;

    invoke-direct {v0}, Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;->a:Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Lcom/mopub/mobileads/MoPubView;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)Lcom/mopub/mobileads/CustomEventBannerAdapter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/mobileads/MoPubView;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/mopub/common/AdReport;",
            ")",
            "Lcom/mopub/mobileads/CustomEventBannerAdapter;"
        }
    .end annotation

    .prologue
    .line 24
    .line 1032
    new-instance v0, Lcom/mopub/mobileads/CustomEventBannerAdapter;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/mopub/mobileads/CustomEventBannerAdapter;-><init>(Lcom/mopub/mobileads/MoPubView;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)V

    .line 24
    return-object v0
.end method

.method public static setInstance(Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 16
    sput-object p0, Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;->a:Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;

    .line 17
    return-void
.end method
