.class public final Lcom/mopub/nativeads/RequestParameters$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/location/Location;

.field private c:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/nativeads/RequestParameters$Builder;)Landroid/location/Location;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->b:Landroid/location/Location;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/util/EnumSet;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->c:Ljava/util/EnumSet;

    return-object v0
.end method


# virtual methods
.method public final build()Lcom/mopub/nativeads/RequestParameters;
    .locals 2

    .prologue
    .line 63
    new-instance v0, Lcom/mopub/nativeads/RequestParameters;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mopub/nativeads/RequestParameters;-><init>(Lcom/mopub/nativeads/RequestParameters$Builder;B)V

    return-object v0
.end method

.method public final desiredAssets(Ljava/util/EnumSet;)Lcom/mopub/nativeads/RequestParameters$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;",
            ">;)",
            "Lcom/mopub/nativeads/RequestParameters$Builder;"
        }
    .end annotation

    .prologue
    .line 57
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->c:Ljava/util/EnumSet;

    .line 58
    return-object p0
.end method

.method public final keywords(Ljava/lang/String;)Lcom/mopub/nativeads/RequestParameters$Builder;
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->a:Ljava/lang/String;

    .line 45
    return-object p0
.end method

.method public final location(Landroid/location/Location;)Lcom/mopub/nativeads/RequestParameters$Builder;
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->b:Landroid/location/Location;

    .line 51
    return-object p0
.end method
