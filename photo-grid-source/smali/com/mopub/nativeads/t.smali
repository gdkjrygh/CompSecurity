.class final Lcom/mopub/nativeads/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V
    .locals 0

    .prologue
    .line 54
    return-void
.end method

.method public final onNativeLoad(Lcom/mopub/nativeads/NativeResponse;)V
    .locals 0

    .prologue
    .line 50
    invoke-virtual {p1}, Lcom/mopub/nativeads/NativeResponse;->destroy()V

    .line 51
    return-void
.end method
