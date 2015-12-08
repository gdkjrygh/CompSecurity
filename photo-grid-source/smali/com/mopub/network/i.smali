.class final Lcom/mopub/network/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/network/TrackingRequest$Listener;


# instance fields
.field final synthetic a:Lcom/mopub/network/TrackingRequest$Listener;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/mopub/network/TrackingRequest$Listener;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/mopub/network/i;->a:Lcom/mopub/network/TrackingRequest$Listener;

    iput-object p2, p0, Lcom/mopub/network/i;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 2

    .prologue
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to hit tracking endpoint: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mopub/network/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/mopub/network/i;->a:Lcom/mopub/network/TrackingRequest$Listener;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/mopub/network/i;->a:Lcom/mopub/network/TrackingRequest$Listener;

    invoke-interface {v0, p1}, Lcom/mopub/network/TrackingRequest$Listener;->onErrorResponse(Lcom/mopub/volley/VolleyError;)V

    .line 99
    :cond_0
    return-void
.end method

.method public final onResponse(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Successfully hit tracking endpoint: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/mopub/network/i;->a:Lcom/mopub/network/TrackingRequest$Listener;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/mopub/network/i;->a:Lcom/mopub/network/TrackingRequest$Listener;

    invoke-interface {v0, p1}, Lcom/mopub/network/TrackingRequest$Listener;->onResponse(Ljava/lang/String;)V

    .line 91
    :cond_0
    return-void
.end method
