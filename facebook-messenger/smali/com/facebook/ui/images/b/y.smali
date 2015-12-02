.class Lcom/facebook/ui/images/b/y;
.super Ljava/lang/Object;
.source "ImageFetchOperation.java"

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
.field final synthetic a:Lcom/facebook/ui/images/b/w;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/w;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/facebook/ui/images/b/y;->a:Lcom/facebook/ui/images/b/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ui/images/b/r;)V
    .locals 2

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/ui/images/b/y;->a:Lcom/facebook/ui/images/b/w;

    invoke-static {v0}, Lcom/facebook/ui/images/b/w;->b(Lcom/facebook/ui/images/b/w;)V

    .line 164
    iget-object v0, p0, Lcom/facebook/ui/images/b/y;->a:Lcom/facebook/ui/images/b/w;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/facebook/ui/images/b/w;->a(Lcom/facebook/ui/images/b/w;Lcom/facebook/ui/images/b/r;Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/facebook/ui/images/b/y;->a:Lcom/facebook/ui/images/b/w;

    invoke-static {v0}, Lcom/facebook/ui/images/b/w;->c(Lcom/facebook/ui/images/b/w;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 167
    :cond_0
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 160
    check-cast p1, Lcom/facebook/ui/images/b/r;

    invoke-virtual {p0, p1}, Lcom/facebook/ui/images/b/y;->a(Lcom/facebook/ui/images/b/r;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/ui/images/b/y;->a:Lcom/facebook/ui/images/b/w;

    invoke-static {v0}, Lcom/facebook/ui/images/b/w;->b(Lcom/facebook/ui/images/b/w;)V

    .line 172
    iget-object v0, p0, Lcom/facebook/ui/images/b/y;->a:Lcom/facebook/ui/images/b/w;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/facebook/ui/images/b/w;->a(Lcom/facebook/ui/images/b/w;Lcom/facebook/ui/images/b/r;Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/facebook/ui/images/b/y;->a:Lcom/facebook/ui/images/b/w;

    invoke-static {v0}, Lcom/facebook/ui/images/b/w;->c(Lcom/facebook/ui/images/b/w;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Throwable;)Z

    .line 175
    :cond_0
    return-void
.end method
