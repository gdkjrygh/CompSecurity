.class final Lcom/mopub/nativeads/av;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/Response$ErrorListener;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/as;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/as;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/mopub/nativeads/av;->a:Lcom/mopub/nativeads/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 2

    .prologue
    .line 90
    instance-of v0, p1, Lcom/mopub/network/MoPubNetworkError;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/mopub/network/MoPubNetworkError;

    invoke-virtual {v0}, Lcom/mopub/network/MoPubNetworkError;->getReason()Lcom/mopub/network/MoPubNetworkError$Reason;

    move-result-object v0

    sget-object v1, Lcom/mopub/network/MoPubNetworkError$Reason;->WARMING_UP:Lcom/mopub/network/MoPubNetworkError$Reason;

    invoke-virtual {v0, v1}, Lcom/mopub/network/MoPubNetworkError$Reason;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    :cond_0
    const-string v0, "Failed to load positioning data"

    invoke-static {v0, p1}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    iget-object v0, p1, Lcom/mopub/volley/VolleyError;->networkResponse:Lcom/mopub/volley/NetworkResponse;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mopub/nativeads/av;->a:Lcom/mopub/nativeads/as;

    invoke-static {v0}, Lcom/mopub/nativeads/as;->b(Lcom/mopub/nativeads/as;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/util/DeviceUtils;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 94
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_CONNECTION:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubErrorCode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->c(Ljava/lang/String;)V

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/av;->a:Lcom/mopub/nativeads/as;

    invoke-static {v0}, Lcom/mopub/nativeads/as;->c(Lcom/mopub/nativeads/as;)V

    .line 99
    return-void
.end method
