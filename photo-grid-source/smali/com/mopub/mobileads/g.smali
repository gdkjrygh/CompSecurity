.class final Lcom/mopub/mobileads/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/network/AdRequest$Listener;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/AdViewController;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/AdViewController;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/mopub/mobileads/g;->a:Lcom/mopub/mobileads/AdViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/mopub/mobileads/g;->a:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->a(Lcom/mopub/volley/VolleyError;)V

    .line 121
    return-void
.end method

.method public final onSuccess(Lcom/mopub/network/AdResponse;)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/mopub/mobileads/g;->a:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->a(Lcom/mopub/network/AdResponse;)V

    .line 116
    return-void
.end method
