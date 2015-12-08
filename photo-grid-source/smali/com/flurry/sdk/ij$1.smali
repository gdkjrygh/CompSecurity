.class Lcom/flurry/sdk/ij$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/jx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/jx",
        "<",
        "Lcom/flurry/sdk/jh;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ij;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/ij;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/flurry/sdk/ij$1;->a:Lcom/flurry/sdk/ij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/flurry/sdk/jh;)V
    .locals 4

    .prologue
    .line 53
    const/4 v0, 0x4

    iget-object v1, p0, Lcom/flurry/sdk/ij$1;->a:Lcom/flurry/sdk/ij;

    invoke-static {v1}, Lcom/flurry/sdk/ij;->a(Lcom/flurry/sdk/ij;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onNetworkStateChanged : isNetworkEnable = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p1, Lcom/flurry/sdk/jh;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 54
    iget-boolean v0, p1, Lcom/flurry/sdk/jh;->a:Z

    if-eqz v0, :cond_0

    .line 56
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/ij$1$1;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/ij$1$1;-><init>(Lcom/flurry/sdk/ij$1;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 63
    :cond_0
    return-void
.end method

.method public bridge synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 50
    check-cast p1, Lcom/flurry/sdk/jh;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/ij$1;->a(Lcom/flurry/sdk/jh;)V

    return-void
.end method
