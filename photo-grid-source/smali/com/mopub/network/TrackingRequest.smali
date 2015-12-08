.class public Lcom/mopub/network/TrackingRequest;
.super Lcom/mopub/volley/Request;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mopub/volley/Request",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/mopub/network/TrackingRequest$Listener;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/mopub/network/TrackingRequest$Listener;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, v0, p1, p2}, Lcom/mopub/volley/Request;-><init>(ILjava/lang/String;Lcom/mopub/volley/Response$ErrorListener;)V

    .line 30
    iput-object p2, p0, Lcom/mopub/network/TrackingRequest;->a:Lcom/mopub/network/TrackingRequest$Listener;

    .line 31
    invoke-virtual {p0, v0}, Lcom/mopub/network/TrackingRequest;->setShouldCache(Z)Lcom/mopub/volley/Request;

    .line 32
    new-instance v0, Lcom/mopub/volley/DefaultRetryPolicy;

    const/16 v1, 0x9c4

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/volley/DefaultRetryPolicy;-><init>(IIF)V

    invoke-virtual {p0, v0}, Lcom/mopub/network/TrackingRequest;->setRetryPolicy(Lcom/mopub/volley/RetryPolicy;)Lcom/mopub/volley/Request;

    .line 36
    return-void
.end method

.method public static makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 61
    invoke-static {p0, p1, v0, v0}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 62
    return-void
.end method

.method public static makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/mopub/common/event/BaseEvent$Name;",
            ")V"
        }
    .end annotation

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 68
    return-void
.end method

.method public static makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/mopub/network/TrackingRequest$Listener;",
            "Lcom/mopub/common/event/BaseEvent$Name;",
            ")V"
        }
    .end annotation

    .prologue
    .line 74
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 104
    :cond_0
    return-void

    .line 78
    :cond_1
    invoke-static {p1}, Lcom/mopub/network/Networking;->getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v1

    .line 79
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 80
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 84
    new-instance v3, Lcom/mopub/network/i;

    invoke-direct {v3, p2, v0}, Lcom/mopub/network/i;-><init>(Lcom/mopub/network/TrackingRequest$Listener;Ljava/lang/String;)V

    .line 101
    new-instance v4, Lcom/mopub/network/TrackingRequest;

    invoke-direct {v4, v0, v3}, Lcom/mopub/network/TrackingRequest;-><init>(Ljava/lang/String;Lcom/mopub/network/TrackingRequest$Listener;)V

    .line 102
    invoke-virtual {v1, v4}, Lcom/mopub/volley/RequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    goto :goto_0
.end method

.method public static makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 108
    invoke-static {p0, p1, v0, v0}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 109
    return-void
.end method

.method public static makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V
    .locals 1

    .prologue
    .line 118
    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 119
    return-void
.end method

.method public static makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;)V
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 114
    return-void
.end method

.method public static makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V
    .locals 2

    .prologue
    .line 125
    if-eqz p0, :cond_0

    .line 126
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 128
    :cond_0
    return-void
.end method


# virtual methods
.method protected final a(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/NetworkResponse;",
            ")",
            "Lcom/mopub/volley/Response",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    iget v0, p1, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    .line 41
    new-instance v0, Lcom/mopub/network/MoPubNetworkError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to log tracking request. Response code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p1, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/network/TrackingRequest;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/mopub/network/MoPubNetworkError$Reason;->TRACKING_FAILURE:Lcom/mopub/network/MoPubNetworkError$Reason;

    invoke-direct {v0, v1, v2}, Lcom/mopub/network/MoPubNetworkError;-><init>(Ljava/lang/String;Lcom/mopub/network/MoPubNetworkError$Reason;)V

    invoke-static {v0}, Lcom/mopub/volley/Response;->error(Lcom/mopub/volley/VolleyError;)Lcom/mopub/volley/Response;

    move-result-object v0

    .line 46
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1}, Lcom/mopub/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Cache$Entry;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/volley/Response;->success(Ljava/lang/Object;Lcom/mopub/volley/Cache$Entry;)Lcom/mopub/volley/Response;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic deliverResponse(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 20
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/mopub/network/TrackingRequest;->deliverResponse(Ljava/lang/Void;)V

    return-void
.end method

.method public deliverResponse(Ljava/lang/Void;)V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/mopub/network/TrackingRequest;->a:Lcom/mopub/network/TrackingRequest$Listener;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/mopub/network/TrackingRequest;->a:Lcom/mopub/network/TrackingRequest$Listener;

    invoke-virtual {p0}, Lcom/mopub/network/TrackingRequest;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mopub/network/TrackingRequest$Listener;->onResponse(Ljava/lang/String;)V

    .line 54
    :cond_0
    return-void
.end method
