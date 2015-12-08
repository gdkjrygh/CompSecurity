.class final Lcom/mopub/network/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/RequestQueue$RequestFilter;


# instance fields
.field final synthetic a:Lcom/mopub/volley/Request;

.field final synthetic b:Lcom/mopub/network/MoPubRequestQueue;


# direct methods
.method constructor <init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/mopub/network/b;->b:Lcom/mopub/network/MoPubRequestQueue;

    iput-object p2, p0, Lcom/mopub/network/b;->a:Lcom/mopub/volley/Request;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Lcom/mopub/volley/Request;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 120
    iget-object v0, p0, Lcom/mopub/network/b;->a:Lcom/mopub/volley/Request;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
