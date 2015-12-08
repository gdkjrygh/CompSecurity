.class final Lcom/mopub/nativeads/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;


# instance fields
.field final synthetic a:Lcom/mopub/network/AdResponse;

.field final synthetic b:Lcom/mopub/nativeads/MoPubNative;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubNative;Lcom/mopub/network/AdResponse;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lcom/mopub/nativeads/w;->b:Lcom/mopub/nativeads/MoPubNative;

    iput-object p2, p0, Lcom/mopub/nativeads/w;->a:Lcom/mopub/network/AdResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onNativeAdFailed(Lcom/mopub/nativeads/NativeErrorCode;)V
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lcom/mopub/nativeads/w;->b:Lcom/mopub/nativeads/MoPubNative;

    iget-object v1, p0, Lcom/mopub/nativeads/w;->a:Lcom/mopub/network/AdResponse;

    invoke-virtual {v1}, Lcom/mopub/network/AdResponse;->getFailoverUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/MoPubNative;->a(Ljava/lang/String;)V

    .line 244
    return-void
.end method

.method public final onNativeAdLoaded(Lcom/mopub/nativeads/ad;)V
    .locals 8

    .prologue
    .line 229
    iget-object v0, p0, Lcom/mopub/nativeads/w;->b:Lcom/mopub/nativeads/MoPubNative;

    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubNative;->a()Landroid/content/Context;

    move-result-object v1

    .line 230
    if-nez v1, :cond_0

    .line 239
    :goto_0
    return-void

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/w;->b:Lcom/mopub/nativeads/MoPubNative;

    invoke-static {v0}, Lcom/mopub/nativeads/MoPubNative;->c(Lcom/mopub/nativeads/MoPubNative;)Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    move-result-object v7

    new-instance v0, Lcom/mopub/nativeads/NativeResponse;

    iget-object v2, p0, Lcom/mopub/nativeads/w;->a:Lcom/mopub/network/AdResponse;

    invoke-virtual {v2}, Lcom/mopub/network/AdResponse;->getImpressionTrackingUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mopub/nativeads/w;->a:Lcom/mopub/network/AdResponse;

    invoke-virtual {v3}, Lcom/mopub/network/AdResponse;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/mopub/nativeads/w;->b:Lcom/mopub/nativeads/MoPubNative;

    invoke-static {v4}, Lcom/mopub/nativeads/MoPubNative;->a(Lcom/mopub/nativeads/MoPubNative;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/mopub/nativeads/w;->b:Lcom/mopub/nativeads/MoPubNative;

    invoke-static {v5}, Lcom/mopub/nativeads/MoPubNative;->b(Lcom/mopub/nativeads/MoPubNative;)Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    move-result-object v6

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lcom/mopub/nativeads/NativeResponse;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/nativeads/ad;Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;)V

    invoke-interface {v7, v0}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeLoad(Lcom/mopub/nativeads/NativeResponse;)V

    goto :goto_0
.end method
