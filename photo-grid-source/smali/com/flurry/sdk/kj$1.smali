.class Lcom/flurry/sdk/kj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kl$c;


# instance fields
.field final synthetic a:Lcom/flurry/sdk/kj;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/kj;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/flurry/sdk/kl;)V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-static {v0}, Lcom/flurry/sdk/kj;->d(Lcom/flurry/sdk/kj;)V

    .line 89
    return-void
.end method

.method public a(Lcom/flurry/sdk/kl;Ljava/io/InputStream;)V
    .locals 2

    .prologue
    .line 77
    invoke-virtual {p1}, Lcom/flurry/sdk/kl;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 84
    :cond_0
    :goto_0
    return-void

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-static {v0}, Lcom/flurry/sdk/kj;->c(Lcom/flurry/sdk/kj;)Lcom/flurry/sdk/kx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    iget-object v1, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-static {v1}, Lcom/flurry/sdk/kj;->c(Lcom/flurry/sdk/kj;)Lcom/flurry/sdk/kx;

    move-result-object v1

    invoke-interface {v1, p2}, Lcom/flurry/sdk/kx;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kj;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public a(Lcom/flurry/sdk/kl;Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 69
    iget-object v0, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-static {v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kj;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-static {v0}, Lcom/flurry/sdk/kj;->b(Lcom/flurry/sdk/kj;)Lcom/flurry/sdk/kx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-static {v0}, Lcom/flurry/sdk/kj;->b(Lcom/flurry/sdk/kj;)Lcom/flurry/sdk/kx;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/kj$1;->a:Lcom/flurry/sdk/kj;

    invoke-static {v1}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kj;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Lcom/flurry/sdk/kx;->a(Ljava/io/OutputStream;Ljava/lang/Object;)V

    .line 72
    :cond_0
    return-void
.end method
