.class Lcom/facebook/ui/images/b/f;
.super Ljava/lang/Object;
.source "FetchImageDecodingExecutor.java"

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

.field final synthetic b:Lcom/facebook/ui/images/b/e;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/e;Lcom/facebook/ui/images/b/m;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/ui/images/b/f;->b:Lcom/facebook/ui/images/b/e;

    iput-object p2, p0, Lcom/facebook/ui/images/b/f;->a:Lcom/facebook/ui/images/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/r;
    .locals 2

    .prologue
    .line 75
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 76
    iget-object v0, p0, Lcom/facebook/ui/images/b/f;->a:Lcom/facebook/ui/images/b/m;

    invoke-static {v0}, Lcom/facebook/ui/images/b/p;->a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/q;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/q;->a(Z)Lcom/facebook/ui/images/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/q;->c()Lcom/facebook/ui/images/b/p;

    move-result-object v0

    .line 79
    iget-object v1, p0, Lcom/facebook/ui/images/b/f;->b:Lcom/facebook/ui/images/b/e;

    invoke-static {v1}, Lcom/facebook/ui/images/b/e;->a(Lcom/facebook/ui/images/b/e;)Lcom/facebook/ui/images/b/l;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/facebook/ui/images/b/l;->a(Lcom/facebook/ui/images/b/p;)Lcom/facebook/ui/images/b/r;

    move-result-object v0

    .line 80
    const-string v1, "ImageDecodingExecutor"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 81
    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 73
    invoke-virtual {p0}, Lcom/facebook/ui/images/b/f;->a()Lcom/facebook/ui/images/b/r;

    move-result-object v0

    return-object v0
.end method
