.class final Lcom/mopub/nativeads/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/network/AdRequest$Listener;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/MoPubNative;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubNative;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/mopub/nativeads/v;->a:Lcom/mopub/nativeads/MoPubNative;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/mopub/nativeads/v;->a:Lcom/mopub/nativeads/MoPubNative;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubNative;->a(Lcom/mopub/volley/VolleyError;)V

    .line 126
    return-void
.end method

.method public final onSuccess(Lcom/mopub/network/AdResponse;)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/mopub/nativeads/v;->a:Lcom/mopub/nativeads/MoPubNative;

    invoke-static {v0, p1}, Lcom/mopub/nativeads/MoPubNative;->a(Lcom/mopub/nativeads/MoPubNative;Lcom/mopub/network/AdResponse;)V

    .line 121
    return-void
.end method
