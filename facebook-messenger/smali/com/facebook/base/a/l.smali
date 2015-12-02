.class Lcom/facebook/base/a/l;
.super Ljava/lang/Object;
.source "FbAppInitializer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/common/d/a/ab;

.field final synthetic b:Lcom/facebook/base/a/k;


# direct methods
.method constructor <init>(Lcom/facebook/base/a/k;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/base/a/l;->b:Lcom/facebook/base/a/k;

    iput-object p2, p0, Lcom/facebook/base/a/l;->a:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/base/a/l;->b:Lcom/facebook/base/a/k;

    invoke-static {v0}, Lcom/facebook/base/a/k;->a(Lcom/facebook/base/a/k;)V

    .line 91
    iget-object v0, p0, Lcom/facebook/base/a/l;->a:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 94
    iget-object v0, p0, Lcom/facebook/base/a/l;->b:Lcom/facebook/base/a/k;

    invoke-static {v0}, Lcom/facebook/base/a/k;->c(Lcom/facebook/base/a/k;)Lcom/facebook/common/executors/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/a/m;

    invoke-direct {v1, p0}, Lcom/facebook/base/a/m;-><init>(Lcom/facebook/base/a/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/base/a/l;->b:Lcom/facebook/base/a/k;

    invoke-static {v0}, Lcom/facebook/base/a/k;->d(Lcom/facebook/base/a/k;)V

    .line 103
    return-void
.end method
