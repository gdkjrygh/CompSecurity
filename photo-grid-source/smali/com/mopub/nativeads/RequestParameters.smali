.class public Lcom/mopub/nativeads/RequestParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/location/Location;

.field private final c:Ljava/util/EnumSet;
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
.method private constructor <init>(Lcom/mopub/nativeads/RequestParameters$Builder;)V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-static {p1}, Lcom/mopub/nativeads/RequestParameters$Builder;->a(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->a:Ljava/lang/String;

    .line 69
    invoke-static {p1}, Lcom/mopub/nativeads/RequestParameters$Builder;->b(Lcom/mopub/nativeads/RequestParameters$Builder;)Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->b:Landroid/location/Location;

    .line 70
    invoke-static {p1}, Lcom/mopub/nativeads/RequestParameters$Builder;->c(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->c:Ljava/util/EnumSet;

    .line 71
    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/nativeads/RequestParameters$Builder;B)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/RequestParameters;-><init>(Lcom/mopub/nativeads/RequestParameters$Builder;)V

    return-void
.end method


# virtual methods
.method public final getDesiredAssets()Ljava/lang/String;
    .locals 2

    .prologue
    .line 84
    const-string v0, ""

    .line 86
    iget-object v1, p0, Lcom/mopub/nativeads/RequestParameters;->c:Ljava/util/EnumSet;

    if-eqz v1, :cond_0

    .line 87
    const-string v0, ","

    iget-object v1, p0, Lcom/mopub/nativeads/RequestParameters;->c:Ljava/util/EnumSet;

    invoke-virtual {v1}, Ljava/util/EnumSet;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 89
    :cond_0
    return-object v0
.end method

.method public final getKeywords()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->b:Landroid/location/Location;

    return-object v0
.end method
