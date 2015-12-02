.class Lcom/facebook/abtest/qe/d/b;
.super Ljava/lang/Object;
.source "QuickExperimentInfoAdapter.java"

# interfaces
.implements Lcom/facebook/abtest/qe/b/f;


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/d/a;


# direct methods
.method constructor <init>(Lcom/facebook/abtest/qe/d/a;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/abtest/qe/d/b;->a:Lcom/facebook/abtest/qe/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/b;->a:Lcom/facebook/abtest/qe/d/a;

    invoke-static {v0}, Lcom/facebook/abtest/qe/d/a;->a(Lcom/facebook/abtest/qe/d/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/b;->a:Lcom/facebook/abtest/qe/d/a;

    invoke-static {v0}, Lcom/facebook/abtest/qe/d/a;->b(Lcom/facebook/abtest/qe/d/a;)V

    .line 74
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/b;->a:Lcom/facebook/abtest/qe/d/a;

    invoke-static {v0}, Lcom/facebook/abtest/qe/d/a;->b(Lcom/facebook/abtest/qe/d/a;)V

    .line 80
    return-void
.end method
