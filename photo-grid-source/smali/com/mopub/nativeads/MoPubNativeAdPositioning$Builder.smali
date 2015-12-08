.class public final Lcom/mopub/nativeads/MoPubNativeAdPositioning$Builder;
.super Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 156
    invoke-direct {p0}, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;-><init>()V

    return-void
.end method


# virtual methods
.method public final addFixedPosition(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$Builder;
    .locals 0

    .prologue
    .line 160
    invoke-super {p0, p1}, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->addFixedPosition(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;

    .line 161
    return-object p0
.end method

.method public final bridge synthetic addFixedPosition(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
    .locals 1

    .prologue
    .line 155
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/MoPubNativeAdPositioning$Builder;->addFixedPosition(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final build()Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 179
    return-object p0
.end method

.method public final enableRepeatingPositions(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$Builder;
    .locals 0

    .prologue
    .line 167
    invoke-super {p0, p1}, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->enableRepeatingPositions(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;

    .line 168
    return-object p0
.end method

.method public final bridge synthetic enableRepeatingPositions(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
    .locals 1

    .prologue
    .line 155
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/MoPubNativeAdPositioning$Builder;->enableRepeatingPositions(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$Builder;

    move-result-object v0

    return-object v0
.end method
