.class public Lcom/mopub/network/ScribeRequestManager;
.super Lcom/mopub/network/RequestManager;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/network/ScribeRequest$Listener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mopub/network/RequestManager",
        "<",
        "Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;",
        ">;",
        "Lcom/mopub/network/ScribeRequest$Listener;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/mopub/network/RequestManager;-><init>(Landroid/os/Looper;)V

    .line 20
    return-void
.end method


# virtual methods
.method final a()Lcom/mopub/volley/Request;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/mopub/volley/Request",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 26
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager;->b:Lcom/mopub/network/RequestManager$RequestFactory;

    check-cast v0, Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;

    invoke-interface {v0, p0}, Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;->createRequest(Lcom/mopub/network/ScribeRequest$Listener;)Lcom/mopub/network/ScribeRequest;

    move-result-object v0

    return-object v0
.end method

.method public onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 2

    .prologue
    .line 45
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager;->d:Landroid/os/Handler;

    new-instance v1, Lcom/mopub/network/h;

    invoke-direct {v1, p0, p1}, Lcom/mopub/network/h;-><init>(Lcom/mopub/network/ScribeRequestManager;Lcom/mopub/volley/VolleyError;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    return-void
.end method

.method public onResponse()V
    .locals 2

    .prologue
    .line 32
    const-string v0, "Successfully scribed events"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager;->d:Landroid/os/Handler;

    new-instance v1, Lcom/mopub/network/g;

    invoke-direct {v1, p0}, Lcom/mopub/network/g;-><init>(Lcom/mopub/network/ScribeRequestManager;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    return-void
.end method
