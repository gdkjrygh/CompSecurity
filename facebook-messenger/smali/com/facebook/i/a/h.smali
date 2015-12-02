.class Lcom/facebook/i/a/h;
.super Lcom/facebook/auth/c/c;
.source "PeerProcessManagerImpl.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/c/c",
        "<",
        "Lcom/facebook/auth/c/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/i/a/d;


# direct methods
.method constructor <init>(Lcom/facebook/i/a/d;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/facebook/i/a/h;->a:Lcom/facebook/i/a/d;

    invoke-direct {p0}, Lcom/facebook/auth/c/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<",
            "Lcom/facebook/auth/c/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 219
    const-class v0, Lcom/facebook/auth/c/d;

    return-object v0
.end method

.method public bridge synthetic a(Lcom/facebook/auth/c/a;)V
    .locals 0

    .prologue
    .line 200
    check-cast p1, Lcom/facebook/auth/c/d;

    invoke-virtual {p0, p1}, Lcom/facebook/i/a/h;->a(Lcom/facebook/auth/c/d;)V

    return-void
.end method

.method public a(Lcom/facebook/auth/c/d;)V
    .locals 5

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/i/a/h;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->j(Lcom/facebook/i/a/d;)Lcom/facebook/auth/c/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/i/a/h;->a:Lcom/facebook/i/a/d;

    invoke-static {v1}, Lcom/facebook/i/a/d;->i(Lcom/facebook/i/a/d;)Lcom/facebook/auth/c/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/auth/c/b;->b(Lcom/facebook/c/a/c;)Z

    .line 204
    iget-object v0, p0, Lcom/facebook/i/a/h;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->g(Lcom/facebook/i/a/d;)Ljava/lang/String;

    move-result-object v0

    .line 205
    const-class v1, Lcom/facebook/i/a/d;

    const-string v2, "User %s logged in, start to connect to other peers."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    if-nez v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/facebook/i/a/h;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->k(Lcom/facebook/i/a/d;)Lcom/facebook/common/e/h;

    move-result-object v0

    const-class v1, Lcom/facebook/i/a/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "userId is still null after AuthLoggedInEvent fired"

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    :cond_0
    return-void
.end method

.method public bridge synthetic a(Lcom/facebook/c/a/a;)V
    .locals 0

    .prologue
    .line 200
    check-cast p1, Lcom/facebook/auth/c/d;

    invoke-virtual {p0, p1}, Lcom/facebook/i/a/h;->a(Lcom/facebook/auth/c/d;)V

    return-void
.end method
