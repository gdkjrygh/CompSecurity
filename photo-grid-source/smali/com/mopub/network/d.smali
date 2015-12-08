.class final Lcom/mopub/network/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/network/MoPubRequestQueue;

.field final synthetic b:Lcom/mopub/volley/Request;

.field final synthetic c:Lcom/mopub/network/c;


# direct methods
.method constructor <init>(Lcom/mopub/network/c;Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/mopub/network/d;->c:Lcom/mopub/network/c;

    iput-object p2, p0, Lcom/mopub/network/d;->a:Lcom/mopub/network/MoPubRequestQueue;

    iput-object p3, p0, Lcom/mopub/network/d;->b:Lcom/mopub/volley/Request;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 145
    iget-object v0, p0, Lcom/mopub/network/d;->c:Lcom/mopub/network/c;

    iget-object v0, v0, Lcom/mopub/network/c;->d:Lcom/mopub/network/MoPubRequestQueue;

    invoke-static {v0}, Lcom/mopub/network/MoPubRequestQueue;->a(Lcom/mopub/network/MoPubRequestQueue;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/d;->b:Lcom/mopub/volley/Request;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    iget-object v0, p0, Lcom/mopub/network/d;->c:Lcom/mopub/network/c;

    iget-object v0, v0, Lcom/mopub/network/c;->d:Lcom/mopub/network/MoPubRequestQueue;

    iget-object v1, p0, Lcom/mopub/network/d;->b:Lcom/mopub/volley/Request;

    invoke-virtual {v0, v1}, Lcom/mopub/network/MoPubRequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    .line 147
    return-void
.end method
