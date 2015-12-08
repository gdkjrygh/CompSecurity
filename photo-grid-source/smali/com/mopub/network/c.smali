.class final Lcom/mopub/network/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:I

.field final b:Landroid/os/Handler;

.field final c:Ljava/lang/Runnable;

.field final synthetic d:Lcom/mopub/network/MoPubRequestQueue;


# direct methods
.method constructor <init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request",
            "<*>;I)V"
        }
    .end annotation

    .prologue
    .line 135
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/mopub/network/c;-><init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;ILandroid/os/Handler;)V

    .line 136
    return-void
.end method

.method private constructor <init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;ILandroid/os/Handler;)V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request",
            "<*>;I",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 139
    iput-object p1, p0, Lcom/mopub/network/c;->d:Lcom/mopub/network/MoPubRequestQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput p3, p0, Lcom/mopub/network/c;->a:I

    .line 141
    iput-object p4, p0, Lcom/mopub/network/c;->b:Landroid/os/Handler;

    .line 142
    new-instance v0, Lcom/mopub/network/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/mopub/network/d;-><init>(Lcom/mopub/network/c;Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;)V

    iput-object v0, p0, Lcom/mopub/network/c;->c:Ljava/lang/Runnable;

    .line 149
    return-void
.end method
