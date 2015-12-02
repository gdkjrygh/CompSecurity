.class Lcom/facebook/ui/images/b/k;
.super Ljava/lang/Object;
.source "FetchImageExecutor.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/facebook/ui/images/b/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/b/m;

.field final synthetic b:Lcom/facebook/ui/images/b/h;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/m;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/ui/images/b/k;->b:Lcom/facebook/ui/images/b/h;

    iput-object p2, p0, Lcom/facebook/ui/images/b/k;->a:Lcom/facebook/ui/images/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/r;
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/ui/images/b/k;->a:Lcom/facebook/ui/images/b/m;

    invoke-static {v0}, Lcom/facebook/ui/images/b/p;->a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/q;->c()Lcom/facebook/ui/images/b/p;

    move-result-object v0

    .line 149
    iget-object v1, p0, Lcom/facebook/ui/images/b/k;->b:Lcom/facebook/ui/images/b/h;

    invoke-static {v1}, Lcom/facebook/ui/images/b/h;->a(Lcom/facebook/ui/images/b/h;)Lcom/facebook/ui/images/b/l;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/facebook/ui/images/b/l;->a(Lcom/facebook/ui/images/b/p;)Lcom/facebook/ui/images/b/r;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/facebook/ui/images/b/k;->a()Lcom/facebook/ui/images/b/r;

    move-result-object v0

    return-object v0
.end method
