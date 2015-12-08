.class final Lcom/mopub/network/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/volley/VolleyError;

.field final synthetic b:Lcom/mopub/network/ScribeRequestManager;


# direct methods
.method constructor <init>(Lcom/mopub/network/ScribeRequestManager;Lcom/mopub/volley/VolleyError;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/mopub/network/h;->b:Lcom/mopub/network/ScribeRequestManager;

    iput-object p2, p0, Lcom/mopub/network/h;->a:Lcom/mopub/volley/VolleyError;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 49
    :try_start_0
    iget-object v0, p0, Lcom/mopub/network/h;->b:Lcom/mopub/network/ScribeRequestManager;

    iget-object v0, v0, Lcom/mopub/network/ScribeRequestManager;->c:Lcom/mopub/network/BackoffPolicy;

    iget-object v1, p0, Lcom/mopub/network/h;->a:Lcom/mopub/volley/VolleyError;

    invoke-virtual {v0, v1}, Lcom/mopub/network/BackoffPolicy;->backoff(Lcom/mopub/volley/VolleyError;)V

    .line 50
    iget-object v0, p0, Lcom/mopub/network/h;->b:Lcom/mopub/network/ScribeRequestManager;

    invoke-virtual {v0}, Lcom/mopub/network/ScribeRequestManager;->b()V
    :try_end_0
    .catch Lcom/mopub/volley/VolleyError; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :goto_0
    return-void

    .line 52
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to Scribe events: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mopub/network/h;->a:Lcom/mopub/volley/VolleyError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/mopub/network/h;->b:Lcom/mopub/network/ScribeRequestManager;

    invoke-virtual {v0}, Lcom/mopub/network/ScribeRequestManager;->c()V

    goto :goto_0
.end method
