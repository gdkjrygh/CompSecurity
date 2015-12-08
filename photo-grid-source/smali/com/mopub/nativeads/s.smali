.class final Lcom/mopub/nativeads/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/CustomEventNative$ImageListener;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/r;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/r;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/mopub/nativeads/s;->a:Lcom/mopub/nativeads/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onImagesCached()V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/mopub/nativeads/s;->a:Lcom/mopub/nativeads/r;

    invoke-static {v0}, Lcom/mopub/nativeads/r;->a(Lcom/mopub/nativeads/r;)Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/nativeads/s;->a:Lcom/mopub/nativeads/r;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;->onNativeAdLoaded(Lcom/mopub/nativeads/ad;)V

    .line 92
    return-void
.end method

.method public final onImagesFailedToCache(Lcom/mopub/nativeads/NativeErrorCode;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/mopub/nativeads/s;->a:Lcom/mopub/nativeads/r;

    invoke-static {v0}, Lcom/mopub/nativeads/r;->a(Lcom/mopub/nativeads/r;)Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;->onNativeAdFailed(Lcom/mopub/nativeads/NativeErrorCode;)V

    .line 97
    return-void
.end method
