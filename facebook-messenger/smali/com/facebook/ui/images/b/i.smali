.class Lcom/facebook/ui/images/b/i;
.super Ljava/lang/Object;
.source "FetchImageExecutor.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/ui/images/b/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/b/m;

.field final synthetic b:Lcom/google/common/d/a/ab;

.field final synthetic c:Lcom/facebook/ui/images/b/h;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/m;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/ui/images/b/i;->c:Lcom/facebook/ui/images/b/h;

    iput-object p2, p0, Lcom/facebook/ui/images/b/i;->a:Lcom/facebook/ui/images/b/m;

    iput-object p3, p0, Lcom/facebook/ui/images/b/i;->b:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ui/images/b/r;)V
    .locals 3

    .prologue
    .line 96
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/r;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/images/b/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/i;->b:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 113
    :goto_0
    return-void

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/facebook/ui/images/b/i;->c:Lcom/facebook/ui/images/b/h;

    iget-object v1, p0, Lcom/facebook/ui/images/b/i;->a:Lcom/facebook/ui/images/b/m;

    invoke-static {v0, v1}, Lcom/facebook/ui/images/b/h;->a(Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 101
    new-instance v1, Lcom/facebook/ui/images/b/j;

    invoke-direct {v1, p0}, Lcom/facebook/ui/images/b/j;-><init>(Lcom/facebook/ui/images/b/i;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 91
    check-cast p1, Lcom/facebook/ui/images/b/r;

    invoke-virtual {p0, p1}, Lcom/facebook/ui/images/b/i;->a(Lcom/facebook/ui/images/b/r;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/ui/images/b/i;->b:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Throwable;)Z

    .line 119
    return-void
.end method
