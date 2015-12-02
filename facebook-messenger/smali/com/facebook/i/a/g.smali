.class Lcom/facebook/i/a/g;
.super Ljava/lang/Object;
.source "PeerProcessManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/i/a/d;


# direct methods
.method constructor <init>(Lcom/facebook/i/a/d;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lcom/facebook/i/a/g;->a:Lcom/facebook/i/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/i/a/g;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->e(Lcom/facebook/i/a/d;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 176
    iget-object v0, p0, Lcom/facebook/i/a/g;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->f(Lcom/facebook/i/a/d;)V

    .line 184
    :cond_0
    :goto_0
    return-void

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/facebook/i/a/g;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->g(Lcom/facebook/i/a/d;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/facebook/i/a/g;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->h(Lcom/facebook/i/a/d;)V

    .line 182
    iget-object v0, p0, Lcom/facebook/i/a/g;->a:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->g(Lcom/facebook/i/a/d;)Ljava/lang/String;

    goto :goto_0
.end method
