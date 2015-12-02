.class Lcom/facebook/ui/images/b/j;
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
.field final synthetic a:Lcom/facebook/ui/images/b/i;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/i;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/ui/images/b/j;->a:Lcom/facebook/ui/images/b/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ui/images/b/r;)V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/ui/images/b/j;->a:Lcom/facebook/ui/images/b/i;

    iget-object v0, v0, Lcom/facebook/ui/images/b/i;->b:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 105
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 101
    check-cast p1, Lcom/facebook/ui/images/b/r;

    invoke-virtual {p0, p1}, Lcom/facebook/ui/images/b/j;->a(Lcom/facebook/ui/images/b/r;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/ui/images/b/j;->a:Lcom/facebook/ui/images/b/i;

    iget-object v0, v0, Lcom/facebook/ui/images/b/i;->b:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Throwable;)Z

    .line 110
    return-void
.end method
