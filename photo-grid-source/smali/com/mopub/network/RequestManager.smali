.class public abstract Lcom/mopub/network/RequestManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/mopub/network/RequestManager$RequestFactory;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected a:Lcom/mopub/volley/Request;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mopub/volley/Request",
            "<*>;"
        }
    .end annotation
.end field

.field protected b:Lcom/mopub/network/RequestManager$RequestFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected c:Lcom/mopub/network/BackoffPolicy;

.field protected d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mopub/network/RequestManager;->d:Landroid/os/Handler;

    .line 37
    return-void
.end method


# virtual methods
.method abstract a()Lcom/mopub/volley/Request;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/mopub/volley/Request",
            "<*>;"
        }
    .end annotation
.end method

.method final b()V
    .locals 3
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/mopub/network/RequestManager;->a()Lcom/mopub/volley/Request;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/RequestManager;->a:Lcom/mopub/volley/Request;

    .line 78
    invoke-static {}, Lcom/mopub/network/Networking;->getRequestQueue()Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v0

    .line 79
    if-nez v0, :cond_0

    .line 80
    const-string v0, "MoPubRequest queue is null. Clearing request."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lcom/mopub/network/RequestManager;->c()V

    .line 90
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v1, p0, Lcom/mopub/network/RequestManager;->c:Lcom/mopub/network/BackoffPolicy;

    invoke-virtual {v1}, Lcom/mopub/network/BackoffPolicy;->getRetryCount()I

    move-result v1

    if-nez v1, :cond_1

    .line 86
    iget-object v1, p0, Lcom/mopub/network/RequestManager;->a:Lcom/mopub/volley/Request;

    invoke-virtual {v0, v1}, Lcom/mopub/network/MoPubRequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    goto :goto_0

    .line 88
    :cond_1
    iget-object v1, p0, Lcom/mopub/network/RequestManager;->a:Lcom/mopub/volley/Request;

    iget-object v2, p0, Lcom/mopub/network/RequestManager;->c:Lcom/mopub/network/BackoffPolicy;

    invoke-virtual {v2}, Lcom/mopub/network/BackoffPolicy;->getBackoffMs()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/mopub/network/MoPubRequestQueue;->addDelayedRequest(Lcom/mopub/volley/Request;I)V

    goto :goto_0
.end method

.method final c()V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 94
    iput-object v0, p0, Lcom/mopub/network/RequestManager;->a:Lcom/mopub/volley/Request;

    .line 95
    iput-object v0, p0, Lcom/mopub/network/RequestManager;->b:Lcom/mopub/network/RequestManager$RequestFactory;

    .line 96
    iput-object v0, p0, Lcom/mopub/network/RequestManager;->c:Lcom/mopub/network/BackoffPolicy;

    .line 97
    return-void
.end method

.method public cancelRequest()V
    .locals 2

    .prologue
    .line 68
    invoke-static {}, Lcom/mopub/network/Networking;->getRequestQueue()Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/mopub/network/RequestManager;->a:Lcom/mopub/volley/Request;

    if-eqz v1, :cond_0

    .line 70
    iget-object v1, p0, Lcom/mopub/network/RequestManager;->a:Lcom/mopub/volley/Request;

    invoke-virtual {v0, v1}, Lcom/mopub/network/MoPubRequestQueue;->cancel(Lcom/mopub/volley/Request;)V

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/network/RequestManager;->c()V

    .line 73
    return-void
.end method

.method public isAtCapacity()Z
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/mopub/network/RequestManager;->a:Lcom/mopub/volley/Request;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public makeRequest(Lcom/mopub/network/RequestManager$RequestFactory;Lcom/mopub/network/BackoffPolicy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/mopub/network/BackoffPolicy;",
            ")V"
        }
    .end annotation

    .prologue
    .line 55
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 56
    invoke-static {p2}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 58
    invoke-virtual {p0}, Lcom/mopub/network/RequestManager;->cancelRequest()V

    .line 59
    iput-object p1, p0, Lcom/mopub/network/RequestManager;->b:Lcom/mopub/network/RequestManager$RequestFactory;

    .line 60
    iput-object p2, p0, Lcom/mopub/network/RequestManager;->c:Lcom/mopub/network/BackoffPolicy;

    .line 61
    invoke-virtual {p0}, Lcom/mopub/network/RequestManager;->b()V

    .line 62
    return-void
.end method
